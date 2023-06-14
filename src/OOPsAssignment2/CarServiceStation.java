package OOPsAssignment2;

import java.util.ArrayList;
import java.util.Scanner;

public class CarServiceStation {
    static ArrayList<CarService> services = new ArrayList<>();
    static{
        services.add(new CarService("BS01","Basic Service",2000,4000,5000));
        services.add(new CarService("EF01","Engine Fixing",5000,8000,10000));
        services.add(new CarService("CF01","Clutch Fixing",2000,4000,6000));
        services.add(new CarService("BF01","Brake Fixing",1000,1500,2500));
        services.add(new CarService("GF01","Gear Fixing",3000,6000,8000));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the Type of Car : as following ");
        System.out.println("Hatchback");
        System.out.println("Sedan");
        System.out.println("SUV");
        String carType = sc.nextLine();
        System.out.println("Please enter the service codes or if you do not want to select then add empty string : as following");
        System.out.println("BS01");
        System.out.println("EF01");
        System.out.println("CF01");
        System.out.println("BF01");
        System.out.println("GF01");
        ArrayList<String> inputList = new ArrayList<>();
        for(int i=0;i<5;i++){
            inputList.add(sc.nextLine());
        }
        int totalBill = 0;
        Bill response = new Bill();
        for(String ele : inputList){
            if(!ele.isEmpty()){
                for(CarService service : services){
                    if(service.getServiceCode().equals(ele) && carType.equals("Hatchback")){
                        if(service.getServiceCode().equals("BS01")){
                            response.setBasicService(service.getHatchback());
                            totalBill+=service.getHatchback();
                        } else if (service.getServiceCode().equals("EF01")) {
                            response.setEngineFixing(service.getHatchback());
                            totalBill+=service.getHatchback();
                        } else if (service.getServiceCode().equals("CF01")) {
                            response.setClutchFixing(service.getHatchback());
                            totalBill+=service.getHatchback();
                        } else if (service.getServiceCode().equals("BF01")) {
                            response.setBrakeFixing(service.getHatchback());
                            totalBill+=service.getHatchback();
                        } else if (service.getServiceCode().equals("GF01")) {
                            response.setGearFixing(service.getHatchback());
                            totalBill+=service.getHatchback();
                        }
                    } else if (service.getServiceCode().equals(ele) && carType.equals("Sedan")) {
                        if(service.getServiceCode().equals("BS01")){
                            response.setBasicService(service.getSedan());
                            totalBill+=service.getSedan();
                        } else if (service.getServiceCode().equals("EF01")) {
                            response.setEngineFixing(service.getSedan());
                            totalBill+=service.getSedan();
                        } else if (service.getServiceCode().equals("CF01")) {
                            response.setClutchFixing(service.getSedan());
                            totalBill+=service.getSedan();
                        } else if (service.getServiceCode().equals("BF01")) {
                            response.setBrakeFixing(service.getSedan());
                            totalBill+=service.getSedan();
                        } else if (service.getServiceCode().equals("GF01")) {
                            response.setGearFixing(service.getSedan());
                            totalBill+=service.getSedan();
                        }
                    } else if (service.getServiceCode().equals(ele) && carType.equals("SUV")) {
                        if(service.getServiceCode().equals("BS01")){
                            response.setBasicService(service.getSUV());
                            totalBill+=service.getSUV();
                        } else if (service.getServiceCode().equals("EF01")) {
                            response.setEngineFixing(service.getSUV());
                            totalBill+=service.getSUV();
                        } else if (service.getServiceCode().equals("CF01")) {
                            response.setClutchFixing(service.getSUV());
                            totalBill+=service.getSUV();
                        } else if (service.getServiceCode().equals("BF01")) {
                            response.setBrakeFixing(service.getSUV());
                            totalBill+=service.getSUV();
                        } else if (service.getServiceCode().equals("GF01")) {
                            response.setGearFixing(service.getSUV());
                            totalBill+=service.getSUV();
                        }
                    }
                }
            }
        }
        response.setTotalBill(totalBill);
        if(totalBill>10000){
            System.out.println(response);
            System.out.print("Hey! you are getting a free cleaning service of your car of one time , Hurray !!!!");
        }else{
            System.out.println(response);
        }

    }
}
