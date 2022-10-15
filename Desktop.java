public class Desktop extends DesktopComputer{
    String gpu;

    public Desktop(String maker, String model, String cpu, String ram,
                  String disk, String gpu) {
        this.maker = maker;
        this.model = model;
        this.cpu = cpu;
        this.ram = ram;
        this.disk = disk;
        this.gpu = gpu;
    }

    @Override
    public String toString() {
        return super.toString() + ", " + this.gpu;
    }
}
