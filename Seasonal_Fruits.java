class Mango { // My favourite fruits is guava instead
    public void Season() {
        System.out.println("Mango is the king of fruits");
        System.out.println("It is available in summer season");
    }
}

class Apple {
    public void Season() {
        System.out.println("Apples are produced in Kashmir");
        System.out.println("They are available during winter season");
    }
}

class Grape {
    public void Season() {
        System.out.println("Grapes are produced in Maharashtra");
        System.out.println("They are available during winter season");
    }
}

public class Seasonal_Fruits {
    public static void main(String[] args) {
        Mango fruit1 = new Mango();
        Apple fruit2 = new Apple();
        Grape fruit3 = new Grape();
        fruit1.Season();
        fruit2.Season();
        fruit3.Season();
    }
}