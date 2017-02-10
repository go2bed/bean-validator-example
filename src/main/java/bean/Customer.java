package bean;

import org.hibernate.validator.constraints.NotEmpty;
import org.hibernate.validator.constraints.Range;

/**
 * @author Andrey_Chadov on 2/2/2017.
 */


public class Customer {

    @NotEmpty //make shure name is not empty
    String name;

    @Range(min = 1, max = 150) //age need between 1 and 150
    int age;

    public Customer() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
