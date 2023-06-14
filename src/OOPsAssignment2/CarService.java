package OOPsAssignment2;

public class CarService {
    private String serviceCode;
    private String service;
    private int Hatchback;
    private int Sedan;
    private int SUV;

    public CarService(String serviceCode, String service, int hatchback, int sedan, int SUV) {
        this.serviceCode = serviceCode;
        this.service = service;
        Hatchback = hatchback;
        Sedan = sedan;
        this.SUV = SUV;
    }

    public String getServiceCode() {
        return serviceCode;
    }

    public void setServiceCode(String serviceCode) {
        this.serviceCode = serviceCode;
    }

    public String getService() {
        return service;
    }

    public void setService(String service) {
        this.service = service;
    }

    public int getHatchback() {
        return Hatchback;
    }

    public void setHatchback(int hatchback) {
        Hatchback = hatchback;
    }

    public int getSedan() {
        return Sedan;
    }

    public void setSedan(int sedan) {
        Sedan = sedan;
    }

    public int getSUV() {
        return SUV;
    }

    public void setSUV(int SUV) {
        this.SUV = SUV;
    }

    @Override
    public String toString() {
        return "CarService{" +
                "serviceCode='" + serviceCode + '\'' +
                ", service='" + service + '\'' +
                ", Hatchback=" + Hatchback +
                ", Sedan=" + Sedan +
                ", SUV=" + SUV +
                '}';
    }
}
