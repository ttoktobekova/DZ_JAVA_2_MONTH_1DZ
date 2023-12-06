public  final  class Son extends Father{
    private int manHeight;
//    рость

    public Son( String name,int age, ColorHear hear, String eyeColor, int manHeight) {
        super(  name,age, hear, eyeColor);
        this.manHeight = manHeight;
    }


    public int getManHeight() {
        return manHeight;
    }


    public void dance(String mi)
    {
        System.out.println("Хорошо танцует " + " Вместе с  " +mi);
    }

    @Override
    public String getInfo() {
        return "Сыновья " +  super.getInfo() + " Рость: " + manHeight + "см";
    }
}
