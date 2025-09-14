public class Main {
    public static void main(String[] args) {
        Computer gamingPc = new Computer.Builder("Intel i9", "ASUS ROG")
                .ram(32)
                .gpu("NVIDIA RTX 4090")
                .storage("2TB SSD")
                .build();

        System.out.println(gamingPc);
    }
}