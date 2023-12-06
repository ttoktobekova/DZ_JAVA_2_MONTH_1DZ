public  class Father extends Dad{
    private String eyeColor;
//цвет глаз


    public Father(String name, int age, ColorHear hear, String eyeColor) {
        super(name, age, hear);
        this.eyeColor = eyeColor;
    }

    public String getEyeColor() {
        return eyeColor;
    }

    public void dance(){
        System.out.println("Хорошо танцует ");
    }
    public   final  void dance(int staj){
        System.out.println("хорошо танцует: " + "  стаж: " + staj);
    }

    @Override
    public String getInfo() {
        return   super.getInfo() + " Цвет глаз: " + eyeColor;
    }
}
