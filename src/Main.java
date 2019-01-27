public class Main {

    public static void main(String[] args) {
	    MySecondClass mySecondClasss = new MySecondClass();
        mySecondClasss.setName("HELLO CLASS");
        System.out.println("Name: " +mySecondClasss.getName());

        mySecondClasss.changeName("HELLO NEW CLASS");
        System.out.println("Name: " +mySecondClasss.getName());
    }
}
