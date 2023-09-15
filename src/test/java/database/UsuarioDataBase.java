package database;

public class UsuarioDataBase {
    private String simpleName;
    private String name;
    private String password;
    private String day;
    private String month;
    private String year;
    private String lastName;
    private String street;
    private String country;
    private String state;
    private String city;
    private String zipcode;
    private String number;

    public String getSimpleName() {
        return simpleName;
    }

    public void setSimpleName(String simpleName) {
        this.simpleName = simpleName;
    }

    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    


    public UsuarioDataBase() {
    }

    public UsuarioDataBase(String simpleName, String name, String password, String day, String month, String year,
            String lastName, String street, String country, String state, String city, String zipcode, String number) {
        this.simpleName = simpleName;
        this.name = name;
        this.password = password;
        this.day = day;
        this.month = month;
        this.year = year;
        this.lastName = lastName;
        this.street = street;
        this.country = country;
        this.state = state;
        this.city = city;
        this.zipcode = zipcode;
        this.number = number;
    }

    

    
}
