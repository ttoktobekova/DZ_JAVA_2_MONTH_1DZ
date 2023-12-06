public class Dad {
    private  int age;
    private  String name;
    private  ColorHear hear;
// цвет волос


    public Dad( String name,int age, ColorHear hear) {
        this.age = age;
        this.name = name;
        this.hear = hear;
    }

    public ColorHear getHear() {
        return hear;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public void dance(){
        System.out.println("Хорошо танцует ");
    }
    public  void dance(int staj){
        System.out.println("хорошо танцует: " + "  стаж: " + staj);
    }
    public String getInfo(){
        return  "Имя: " + name + " Возрасть: " + age + " Цвет волос: " + hear;

    }
}
