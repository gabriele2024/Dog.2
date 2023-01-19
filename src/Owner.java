 public class Owner {
    String name;
    int age;
    String address;
    String phone;
    Dog X;

    public Owner(String N, String A, String P, int age){

        this.name = N;
        this.address = A;
        this.phone = P;
        this.age = age;
    }
      public void setPhoneNumber(String phone) {
        this.phone = phone;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public void getOlder() {
        age++;
    }


    public String toString(){
        return "The name of the owner is " + name +
                ", with address " + address +
                ", with phone number " + phone +
                " and is " + age + " years old." +
                "The owner's dog is " + X.toString();

    }

}


/*

import java.lang.reflect.Array;



public class Owner {
    String name;
    int age;
    String address;
    String phone;
    Array<Dog> dogs;

    public Owner(String N, String A, String P, int age){
        this.name = N;
        this.address = A;
        this.phone = P;
        this.age = age;
        dogs = new java.sql.ArrayList<Dog>();
    }
    public void addDog(Dog dog) {
        dogs.add(dog);
    }
    public void removeDog(Dog dog) {
        dogs.remove(dog);
    }

    }
}
*/
