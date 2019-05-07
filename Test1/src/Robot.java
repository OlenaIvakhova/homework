public class Robot {
    public void work() {
        Robot myRobot = new Robot();
        myRobot.work();
        System.out.println("Я робот - я просто працюю");
    }
}
class CoffeRobot extends Robot {
    System.out.println("Я CoffeRobot - я варю каву");
}