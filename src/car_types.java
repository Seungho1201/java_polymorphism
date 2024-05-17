// 다형성 예제
class Spec {
    void Print_Spec(int tire_num, String model_name) {
        System.out.println("모델 명 : " + model_name);
        System.out.println("타이어 수 : " + tire_num);
    }
}
// Car 클래스가 Spec 클래스 상속
class Car extends Spec {
    String model_name = "자동차";
    int tire_num = 4;

    // 부모클래스로 부터 상속받지않은 완전히 다른 메서드
    void Print() {
        System.out.println("자식 클래스(Car)에서 호출");
        // 부모클래스 메서드 오버라이드
        super.Print_Spec(tire_num, model_name); // 부모 클래스의 Print_Spec 메서드를 호출
    }
}
// Bike 클래스가 Spec 클래스 상속
class bike extends Spec {
    String model_name = "바이크";
    int tire_num = 2;

    // 부모클래스로부터 상속받은 메서드
    void Print_Spec() {
        System.out.println("자식 클래스(Bike)에서 호출");
        // 부모클래스 메서드 오버라이드
        super.Print_Spec(tire_num, model_name); // 부모 클래스의 Print_Spec 메서드를 호출
    }
}

public class car_types {
    public static void main(String[] args) {

        Car myCar = new Car();
        myCar.Print();
        System.out.println();

        bike myBike = new bike();
        myBike.Print_Spec();
    }
}
