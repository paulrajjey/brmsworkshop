package redhat.brmsworkshop.lab1;

/**
 * This class was automatically generated by the data modeler tool.
 */
@org.kie.api.definition.type.Label(value = "DriverInfo")
public class Driver  implements java.io.Serializable {

static final long serialVersionUID = 1L;
    
    @org.kie.api.definition.type.Label(value = "Address")
    @org.kie.api.definition.type.Position(value = 2)
    private java.lang.String address;
    
    @org.kie.api.definition.type.Label(value = "Driver Age")
    @org.kie.api.definition.type.Position(value = 1)
    private java.lang.Integer age;
    
    @org.kie.api.definition.type.Label(value = "City")
    @org.kie.api.definition.type.Position(value = 3)
    private java.lang.String city;
    
    @org.kie.api.definition.type.Label(value = "Driver Name")
    @org.kie.api.definition.type.Position(value = 0)
    private java.lang.String name;
    
    @org.kie.api.definition.type.Label(value = "State")
    @org.kie.api.definition.type.Position(value = 4)
    private java.lang.String state;
    
    @org.kie.api.definition.type.Label(value = "Zip Code")
    @org.kie.api.definition.type.Position(value = 5)
    private java.lang.String zipCode;

    public Driver() {
    }

    public Driver(java.lang.String name, java.lang.Integer age, java.lang.String address, java.lang.String city, java.lang.String state, java.lang.String zipCode) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
    }


    
    public java.lang.String getAddress() {
        return this.address;
    }

    public void setAddress(  java.lang.String address ) {
        this.address = address;
    }
    
    public java.lang.Integer getAge() {
        return this.age;
    }

    public void setAge(  java.lang.Integer age ) {
        this.age = age;
    }
    
    public java.lang.String getCity() {
        return this.city;
    }

    public void setCity(  java.lang.String city ) {
        this.city = city;
    }
    
    public java.lang.String getName() {
        return this.name;
    }

    public void setName(  java.lang.String name ) {
        this.name = name;
    }
    
    public java.lang.String getState() {
        return this.state;
    }

    public void setState(  java.lang.String state ) {
        this.state = state;
    }
    
    public java.lang.String getZipCode() {
        return this.zipCode;
    }

    public void setZipCode(  java.lang.String zipCode ) {
        this.zipCode = zipCode;
    }
}