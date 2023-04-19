public class Drink {

    enum DrinkType{
        COKE, SPRITE, DR_PEPER, FANTA, WATER

    }

    private DrinkType drinkType;
    private Size drinkSize;
    private double drinkPrice;
    private boolean isDrinking;

    public Drink(DrinkType drinkType, Size drinksize){
        this.drinkType = drinkType;
        this.drinkSize = drinksize;
    }

    public void isDrinking(boolean isDrinking){
        this.isDrinking = isDrinking;
    }
    public static double getPrice(String drinkTypeChoice, String drinkSizeChoice) {
        if (drinkTypeChoice.equalsIgnoreCase("water")){
            return 1.49;
        }
        if (drinkSizeChoice.equalsIgnoreCase(Size.LARGE.name())){
            return 1.49;
        } else if (drinkSizeChoice.equalsIgnoreCase(Size.MEDIUM.name())) {
            return 1.29;
        } else {
            return 1.0;
        }

    }

}
