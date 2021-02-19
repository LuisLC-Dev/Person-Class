package uaslp.ingenieria.labs;

class person{
    int age;
    String name;

    public void turnYears(){
        this.age++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }
}

public class Main {

    public static void main(String[] args) {
        person p1 = new person();
        person p2 = new person();
        p1.age = 12;
        p1.setName("Paquito");
        p2.age = 14;
        p2.setName("Marisco");

        for(int i=0;i<4;i++) {
            p2.turnYears();
        }
        for(int i=0;i<2;i++) {
            p1.turnYears();
        }

        System.out.println(p1.getName() + " tiene " + p1.getAge() + " años");
        System.out.println(p2.getName() + " tiene " + p2.getAge() + " años");
    }
}
