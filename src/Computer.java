public class Computer {
    private final String cpu;
    private final String motherboard;
    private final int ram;
    private final String gpu;
    private final String storage;

    private Computer(Builder builder) {
        this.cpu = builder.cpu;
        this.motherboard = builder.motherboard;
        this.ram = builder.ram;
        this.gpu = builder.gpu;
        this.storage = builder.storage;
    }

    public String getCpu() { return cpu; }
    public String getMotherboard() { return motherboard; }
    public int getRam() { return ram; }
    public String getGpu() { return gpu; }
    public String getStorage() { return storage; }

    @Override
    public String toString() {
        return "Computer {" +
                "cpu='" + cpu + '\'' +
                ", motherboard='" + motherboard + '\'' +
                ", ram=" + ram + " GB" +
                ", gpu='" + gpu + '\'' +
                ", storage='" + storage + '\'' +
                '}';
    }

    public static class Builder {
        private final String cpu;          //required
        private final String motherboard;  //required
        private int ram;
        private String gpu;
        private String storage;

        public Builder(String cpu, String motherboard) {
            this.cpu = cpu;
            this.motherboard = motherboard;
        }

        public Builder ram(int ram) {
            this.ram = ram;
            return this;
        }

        public Builder gpu(String gpu) {
            this.gpu = gpu;
            return this;
        }

        public Builder storage(String storage) {
            this.storage = storage;
            return this;
        }

        public Computer build() {
            return new Computer(this);
        }
    }
}



