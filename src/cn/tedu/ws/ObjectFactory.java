
package cn.tedu.ws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the cn.tedu.ws package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _AddStudent_QNAME = new QName("http://ws.tedu.cn/", "addStudent");
    private final static QName _GetAllStudensResponse_QNAME = new QName("http://ws.tedu.cn/", "getAllStudensResponse");
    private final static QName _GetStudentsBySalaryResponse_QNAME = new QName("http://ws.tedu.cn/", "getStudentsBySalaryResponse");
    private final static QName _AddStudentResponse_QNAME = new QName("http://ws.tedu.cn/", "addStudentResponse");
    private final static QName _GetStudentByIdResponse_QNAME = new QName("http://ws.tedu.cn/", "getStudentByIdResponse");
    private final static QName _GetStudentById_QNAME = new QName("http://ws.tedu.cn/", "getStudentById");
    private final static QName _GetAllStudens_QNAME = new QName("http://ws.tedu.cn/", "getAllStudens");
    private final static QName _GetStudentsBySalary_QNAME = new QName("http://ws.tedu.cn/", "getStudentsBySalary");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: cn.tedu.ws
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetAllStudensResponse }
     * 
     */
    public GetAllStudensResponse createGetAllStudensResponse() {
        return new GetAllStudensResponse();
    }

    /**
     * Create an instance of {@link GetAllStudensResponse.Return }
     * 
     */
    public GetAllStudensResponse.Return createGetAllStudensResponseReturn() {
        return new GetAllStudensResponse.Return();
    }

    /**
     * Create an instance of {@link AddStudent }
     * 
     */
    public AddStudent createAddStudent() {
        return new AddStudent();
    }

    /**
     * Create an instance of {@link GetStudentsBySalaryResponse }
     * 
     */
    public GetStudentsBySalaryResponse createGetStudentsBySalaryResponse() {
        return new GetStudentsBySalaryResponse();
    }

    /**
     * Create an instance of {@link AddStudentResponse }
     * 
     */
    public AddStudentResponse createAddStudentResponse() {
        return new AddStudentResponse();
    }

    /**
     * Create an instance of {@link GetStudentByIdResponse }
     * 
     */
    public GetStudentByIdResponse createGetStudentByIdResponse() {
        return new GetStudentByIdResponse();
    }

    /**
     * Create an instance of {@link GetStudentById }
     * 
     */
    public GetStudentById createGetStudentById() {
        return new GetStudentById();
    }

    /**
     * Create an instance of {@link GetAllStudens }
     * 
     */
    public GetAllStudens createGetAllStudens() {
        return new GetAllStudens();
    }

    /**
     * Create an instance of {@link GetStudentsBySalary }
     * 
     */
    public GetStudentsBySalary createGetStudentsBySalary() {
        return new GetStudentsBySalary();
    }

    /**
     * Create an instance of {@link Student }
     * 
     */
    public Student createStudent() {
        return new Student();
    }

    /**
     * Create an instance of {@link GetAllStudensResponse.Return.Entry }
     * 
     */
    public GetAllStudensResponse.Return.Entry createGetAllStudensResponseReturnEntry() {
        return new GetAllStudensResponse.Return.Entry();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddStudent }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.tedu.cn/", name = "addStudent")
    public JAXBElement<AddStudent> createAddStudent(AddStudent value) {
        return new JAXBElement<AddStudent>(_AddStudent_QNAME, AddStudent.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllStudensResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.tedu.cn/", name = "getAllStudensResponse")
    public JAXBElement<GetAllStudensResponse> createGetAllStudensResponse(GetAllStudensResponse value) {
        return new JAXBElement<GetAllStudensResponse>(_GetAllStudensResponse_QNAME, GetAllStudensResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetStudentsBySalaryResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.tedu.cn/", name = "getStudentsBySalaryResponse")
    public JAXBElement<GetStudentsBySalaryResponse> createGetStudentsBySalaryResponse(GetStudentsBySalaryResponse value) {
        return new JAXBElement<GetStudentsBySalaryResponse>(_GetStudentsBySalaryResponse_QNAME, GetStudentsBySalaryResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddStudentResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.tedu.cn/", name = "addStudentResponse")
    public JAXBElement<AddStudentResponse> createAddStudentResponse(AddStudentResponse value) {
        return new JAXBElement<AddStudentResponse>(_AddStudentResponse_QNAME, AddStudentResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetStudentByIdResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.tedu.cn/", name = "getStudentByIdResponse")
    public JAXBElement<GetStudentByIdResponse> createGetStudentByIdResponse(GetStudentByIdResponse value) {
        return new JAXBElement<GetStudentByIdResponse>(_GetStudentByIdResponse_QNAME, GetStudentByIdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetStudentById }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.tedu.cn/", name = "getStudentById")
    public JAXBElement<GetStudentById> createGetStudentById(GetStudentById value) {
        return new JAXBElement<GetStudentById>(_GetStudentById_QNAME, GetStudentById.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllStudens }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.tedu.cn/", name = "getAllStudens")
    public JAXBElement<GetAllStudens> createGetAllStudens(GetAllStudens value) {
        return new JAXBElement<GetAllStudens>(_GetAllStudens_QNAME, GetAllStudens.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetStudentsBySalary }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.tedu.cn/", name = "getStudentsBySalary")
    public JAXBElement<GetStudentsBySalary> createGetStudentsBySalary(GetStudentsBySalary value) {
        return new JAXBElement<GetStudentsBySalary>(_GetStudentsBySalary_QNAME, GetStudentsBySalary.class, null, value);
    }

}
