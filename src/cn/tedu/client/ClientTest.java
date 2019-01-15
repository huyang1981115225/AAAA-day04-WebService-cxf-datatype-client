package cn.tedu.client;

import java.util.List;
import cn.tedu.ws.DataTypeWS;
import cn.tedu.ws.DataTypeWSImplService;
import cn.tedu.ws.GetAllStudensResponse.Return;
import cn.tedu.ws.GetAllStudensResponse.Return.Entry;
import cn.tedu.ws.Student;
/**
 * 演示CXF支持的数据类型
 * 
 * @author HY
 *
 */
public class ClientTest {
	public static void main(String[] args) {
		
		DataTypeWSImplService factory = new DataTypeWSImplService();
		
		DataTypeWS dataTypeWS = factory.getDataTypeWSImplPort();
		
		int id = 1;
		Student student = dataTypeWS.getStudentById(id);
		System.out.println(student);
		
		float salary = 10000;
		List<Student> students = dataTypeWS.getStudentsBySalary(salary);
		System.out.println(students);
		
		Return r = dataTypeWS.getAllStudens();
		List<Entry> entrys = r.getEntry();
		for (Entry entry : entrys) {
			Integer key = entry.getKey();
			Student value = entry.getValue();
			System.out.println(key+"："+value);
		}
	}
}
