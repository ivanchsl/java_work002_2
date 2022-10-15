public class Monoblock extends DesktopComputer{
    public Monitor monitor;

    public Monoblock(String maker, String model, String cpu, String ram,
                  String disk, String monitor) {
        this.maker = maker;
        this.model = model;
        this.cpu = cpu;
        this.ram = ram;
        this.disk = disk;
        this.monitor = new Monitor(monitor);
    }

    @Override
    public String toString() {
        return super.toString() + ", " + this.monitor;
    }
}
