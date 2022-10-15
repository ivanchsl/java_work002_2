public class Laptop extends PortableComputer{
    public Laptop(String maker, String model, String cpu, String ram,
                  String disk, String keyboard, String monitor) {
        this.maker = maker;
        this.model = model;
        this.cpu = cpu;
        this.ram = ram;
        this.disk = disk;
        this.keyboard = new Keyboard(keyboard);
        this.monitor = new Monitor(monitor);
    }
}
