public class driver {
    public static void main(String[] args) {
        Dog dog1 = new Dog("Rex","Husky", "White with Black spots", "Male");
        Dog dog2 = new Dog("Max", "Chihuaha", "White", "Female");
        System.out.println(dog1.toString());
        System.out.println(dog2.toString());

            dog1.Bday();
            dog1.Bday();
            dog1.Bday();
            dog1.Bday();
            dog1.Bday();
            dog1.Bday();

        System.out.println(dog1.toString());

        dog2.GettingHungry();
        dog2.Bday();
        dog2.Bday();
        dog2.Bday();

        System.out.println(dog2.toString());


        Owner Alex = new Owner("Alex", "Corso vito 12", "335 382 1352", 21);

        Alex.X = dog1;

        System.out.println(Alex.toString());

        // (1) Allow an owner to have multiple dofs
        // (2) allow owner to change dogs
        // (3) Allow owner to change phone number and address
        // (4) Allow owner to get older
        // (5) make sure the information to be printed reads well.





        Alex.setPhoneNumber("123-456-7890");
        Alex.setAddress("corso moncalieri");
        Alex.getOlder();
        System.out.println(Alex.toString());
    }
}



