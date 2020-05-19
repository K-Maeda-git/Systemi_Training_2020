package Java_Training.unit_07.practice.no217;

public class Practice7_2 {
        public double radius;

        public Practice7_2(double radius) {
        this.radius = radius;
        }

        public Practice7_2() {
        this(1);
        }

        public double getArea() {
        return this.radius * this.radius * Math.PI;
        }
        
        public static void main(String[] args) {
        var p = new Practice7_2(3.0);
        System.out.println(p.getArea());
        var p2 = new Practice7_2();
        System.out.println(p2.getArea());
        }
}