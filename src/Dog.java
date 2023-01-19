public class Dog {
    String name;
    int age;
    String breed;
    String color;
    boolean hungry;
    String sex;

    public void Bday(){
        age = age + 1;
    }
    public void GettingHungry(){
        hungry = true;
    }
    public void GettingFull(){
        hungry = false;
    }

    public Dog(String N , String B, String C, String S){
        this.name = N;
        this.age = 0;
        this.breed = B;
        this.color = C;
        this.hungry = false;
        this.sex = S;

    }

    public String toString(){
        String X;
        if(this.hungry == true)
            X = "hungry";
        else
            X = "not hungry";

        if (this.sex.equals("Male")) {
            return "The name of the dog is "  + this.name +
                    " , his age is " + this.age +
                    " he is a " + this.breed +
                    " ,the color of the dog is " + this.color +
                    " and he is " + X + ".";
        }
        else{
            return " The name of the dog is " + this.name +
                    ", her age is " + this.age +
                    ", she is a " + this.breed +
                    " ,the color of the dog is " + this.color +
                    " and she is " + X+ ".";
        }
    }
}
