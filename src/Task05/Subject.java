package Task05;

public class Subject {
    String name;
    int volume;
    int price;

    public Subject(String name, int volume, int price) {
        this.name = name;
        this.volume = volume;
        this.price = price;
    }

    public int getVolume() {
        return volume;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString(){
        return "Subject(name: " + name + ", volume: " + volume + ", value: " + price + ")";
    }
}
