public class Terminator1 extends Robot{

    public Terminator1(String model) {
        super(model);
    }

    @Override
    public void sayHello() {
       System.out.println("Привет, я модель "+getModel());

    }
}
