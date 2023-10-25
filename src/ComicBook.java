public class ComicBook extends Book {
    String CharacterName;
    int age;

    @Override
    public double getPrice() {
        System.out.println(super.getTitle() + "is on sale 60% off. The price is ");
        return super.getPrice()*0.6;
    }
    public String getCharacterName() {
        return CharacterName;
    }

    public void setCharacterName(String characterName) {
        CharacterName = characterName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
