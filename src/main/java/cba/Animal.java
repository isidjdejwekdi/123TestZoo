package cba;

public abstract class Animal implements IAnimal {
    protected int hungry;
    public final String name;


    public Animal( String name, int hungry) {
        this.hungry = hungry;
        this.name = name;
    }

    //public abstract boolean eat(Food food);
    public abstract boolean isHishnoe();

    public void areYouHungry() {
        if (hungry >= 0) {
            System.out.println("Я сытый! " + hungry);
        } else {
            System.out.println("ЖРАААААТЬ! " + hungry);
        }

    }
}
