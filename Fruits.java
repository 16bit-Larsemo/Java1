class Mango { // My favourite fruits is guava
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
class Guava{
    public void Season(){
        System.out.println("Guavas are better than any other fruit");
        System.out.println("They are available all year around");
    }
}

public class Fruits {
    public static void main(String[] args) {
        Mango fruit1 = new Mango();
        Apple fruit2 = new Apple();
        Grape fruit3 = new Grape();
        Guava fruit4 =new Guava();
        fruit1.Season();
        fruit2.Season();
        fruit3.Season();
        fruit4.Season();
    }
}