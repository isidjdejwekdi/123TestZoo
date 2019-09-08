package cba;

public abstract class Travoyadnie extends Animal {


    public Travoyadnie(String name, int hungry) {
        super(name, hungry);
    }

    @Override
    public boolean isHishnoe() {
        return false;
    }

    @Override
    public boolean eat(Food food) throws Exception {
        if (!food.isTrava()) throw new MyExeption("Нельзя кормить травоядное мясом");
            hungry += food.value;
            food.value = 0;

        return hungry >= 0;
    }
}
