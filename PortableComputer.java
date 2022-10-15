public abstract class PortableComputer extends ComputerImpl{
    public Monitor monitor;
    public Keyboard keyboard;

    @Override
    public String toString() {
        return super.toString() + ", " + this.monitor + ", " + this.keyboard;
    }
}
