public class Terminator2 extends Robot{
    public Terminator2(String model) {
        super(model);
    }

    @Override
    public void sayHello() {
        System.out.println("Привет, я модель "+getModel());
    }
}
