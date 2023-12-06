
public class Main {
    public static void main(String[] args) {

        Father  father = new Father("Toktogul",45,ColorHear.BLACK,"black");
        System.out.println(father.getInfo());
        father.dance();
        father.dance(10);
        System.out.println("-------------------------------------------");

        Son son1 = new Son("Asan",20,ColorHear.BROWN,"голубые",175);
        System.out.println(son1.getInfo());
        son1.dance();
        son1.dance("Anara");
        System.out.println("-------------------------------------------");

        Son son2 = new Son("Uson",18,ColorHear.BLACK, "Черные",170);
        System.out.println(son2.getInfo());
        son2.dance();
        son2.dance("Janara");

        System.out.println("---------------");
        Dad dad = new Dad("Jyrgal",70,ColorHear.BROWN);
        System.out.println(dad.getInfo());
    }
}