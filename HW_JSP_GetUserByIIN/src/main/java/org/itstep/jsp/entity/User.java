package org.itstep.jsp.entity;

public class User {

    private Long id;
    private String name;
    private String surname;
    private String country;
    private String city;
    private String iin;

    public User(Long id, String name, String surname, String country, String city, String iin) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.country = country;
        this.city = city;
        this.iin = iin;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getCountry() {
        return country;
    }

    public String getCity() {
        return city;
    }

    public String getIin() {
        return iin;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", country='" + country + '\'' +
                ", city='" + city + '\'' +
                ", iin='" + iin + '\'' +
                '}';
    }
}
