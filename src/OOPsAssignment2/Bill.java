package OOPsAssignment2;

public class Bill {
    private int basicService = 0;
    private int engineFixing = 0;
    private int clutchFixing = 0;
    private int brakeFixing = 0;
    private int gearFixing = 0;
    private int totalBill = 0;
    public Bill(){};
    public Bill(int basicService, int engineFixing, int clutchFixing, int brakeFixing, int gearFixing,int totalBill) {
        this.basicService = basicService;
        this.engineFixing = engineFixing;
        this.clutchFixing = clutchFixing;
        this.brakeFixing = brakeFixing;
        this.gearFixing = gearFixing;
        this.totalBill = totalBill;
    }

    public int getBasicService() {
        return basicService;
    }

    public void setBasicService(int basicService) {
        this.basicService = basicService;
    }

    public int getEngineFixing() {
        return engineFixing;
    }

    public void setEngineFixing(int engineFixing) {
        this.engineFixing = engineFixing;
    }

    public int getClutchFixing() {
        return clutchFixing;
    }

    public void setClutchFixing(int clutchFixing) {
        this.clutchFixing = clutchFixing;
    }

    public int getBrakeFixing() {
        return brakeFixing;
    }

    public void setBrakeFixing(int brakeFixing) {
        this.brakeFixing = brakeFixing;
    }

    public int getGearFixing() {
        return gearFixing;
    }

    public void setGearFixing(int gearFixing) {
        this.gearFixing = gearFixing;
    }

    public int getTotalBill() {
        return totalBill;
    }

    public void setTotalBill(int totalBill) {
        this.totalBill = totalBill;
    }

    @Override
    public String toString() {
        return "Bill{" +
                "basicService=" + basicService +
                ", engineFixing=" + engineFixing +
                ", clutchFixing=" + clutchFixing +
                ", brakeFixing=" + brakeFixing +
                ", gearFixing=" + gearFixing +
                ", totalBill=" + totalBill +
                '}';
    }
}
