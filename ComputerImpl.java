public abstract class ComputerImpl implements Computer
{
    String maker, model, cpu, ram, disk;

    //так мы избавляемся от дублирующего кода
    //в дальнейшем, все что нам нужно - переопределить метод toString
    public String turnOn() {
        return "Turn on "+getClass().getSimpleName()+" "+toString();
    }

    public String turnOff() {
        return "Turn off "+getClass().getSimpleName()+" "+toString();
    }

    public String connect() {
        return "Connect to internet "+getClass().getSimpleName()+" "+toString();
    }

    @Override
    public String toString() {
        return this.maker + " " + this.model + " with " + this.cpu + ", " + this.ram + ", " + this.disk;
    }
}
