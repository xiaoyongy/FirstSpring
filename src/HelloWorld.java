public class HelloWorld {
    private String name;
    public HelloWorld(){
        System.out.println("This is HelloWorld constructor");
    }

    public void setName(String name){
        System.out.println("this is HelloWorld setName().");
        this.name = name;
    }

    public void sayHello(){
        System.out.println("hello "+ name);
    }
}
