package cba;

public abstract class Hishnie extends Animal {
    public boolean isHishnoe;

    public Hishnie(String name, int hungry) {
        super(name, hungry);
    }

    @Override
    public boolean isHishnoe() {
        return true;
    }

    @Override
    public boolean eat(Food food) throws Exception {
        if (food.isTrava()) throw new MyExeption("Нельзя кормить хищника травой");
        hungry += food.value;
        food.value = 0;

        return hungry >= 0;
    }
}



