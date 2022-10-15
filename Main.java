public class Main {
    public static void main(String[] args){
        Computer[] computers = new Computer[] {
                new Desktop("maker", "model", "cpu", "ram",
                "disk", "gpu"),
                new Laptop("maker", "model", "cpu", "ram",
                        "disk", "keyboard", "monitor"),
                new Netbook("maker", "model", "cpu", "ram",
                        "disk", "keyboard", "monitor"),
                new Monoblock("maker", "model", "cpu", "ram",
                        "disk", "monitor"),
                new Nettop("maker", "model", "cpu", "ram",
                        "disk"),
                new Server("maker", "model", "cpu", "ram",
                        "disk"),
        };
        for (Computer computer: computers){
            System.out.println(computer.turnOn());
            System.out.println(computer.connect());
            System.out.println(computer.turnOff());
        }
    }
}
