package cba;


public class App 
{
    public static void feedAnimal(Animal animal, Food food){

        food.value = food.getValue();
        //if((!food.isTrava() && animal.isHishnoe()) || (food.isTrava() && !animal.isHishnoe())){
            Food[] eda = new Food[10];

            for (int i = 0; i <eda.length ; i++) {
                eda[i]= food;
            }
            animal.areYouHungry();

            try {
                for (int i = 0; i < eda.length && !animal.eat(eda[i]); i++) {
                    animal.areYouHungry();
                    animal.eat(eda[i]);
                    food.value = food.getValue();

                }
            }

            catch (Exception e) {
                e.printStackTrace();
                if(animal.hungry<0){
                    System.out.println("животное осталось голодным!");
                }
            }


        System.out.print(animal.name+": ");
            animal.areYouHungry();



    }


    public static void main( String[] args )
    {
        Lion lion = new Lion("Лев",-100);
        Lion lion2 = new Lion("Лев2",-100);
        Behemoth behemoth = new Behemoth("Бегемот",-100);
        Tiger tiger = new Tiger("Игорь", -100);
        Jiraf jiraf = new Jiraf("Жираф",-50);
        Parrot parrot = new Parrot("Попуг", -20);
        Parrot parrot2 = new Parrot("Попуг2", -20);

        Chicken chicken = new Chicken();
        Berries berries = new Berries();
        Сabbage cabbage = new Сabbage();
        Apple apple = new Apple();
        Beef beef = new Beef();

        feedAnimal(parrot,cabbage);
        feedAnimal(parrot2,berries);
        feedAnimal(lion,berries);
        feedAnimal(lion,chicken);
        feedAnimal(jiraf,beef);
        feedAnimal(jiraf,apple);
        feedAnimal(jiraf,apple);
        feedAnimal(behemoth,beef);
        feedAnimal(tiger,apple);
        feedAnimal(tiger,chicken);

        CageForTravoyadnie cageForTravoyadnie = new CageForTravoyadnie(2);
        CageForHishnie cageForHishnie = new CageForHishnie(3);
        System.out.print("\n");

        cageForHishnie.addAnimal(tiger);
        cageForHishnie.addAnimal(lion);
        cageForHishnie.addAnimal(behemoth);
        cageForHishnie.addAnimal(parrot);
        cageForHishnie.addAnimal(lion2);
        System.out.print("\n");

        cageForTravoyadnie.addAnimal(parrot);
        cageForTravoyadnie.addAnimal(lion);
        cageForTravoyadnie.addAnimal(parrot2);
        cageForTravoyadnie.addAnimal(jiraf);

        System.out.println(cageForHishnie.tList.indexOf(lion));

    }
}
