

protected class Test {
    public static void main(String[] args) {
        Robot myRobot = new Robot();
        Robot coffeeRobot = new CoffeeRobot();
        Robot robotDancer = new RobotDancer();
        Robot robotCooker = new RobotCooker();


    }
}

class Robot {
    void work() {
        System.out.println("Я робот - я просто працюю");
    }
}

class CoffeeRobot extends Robot {
    Override
    void work() {

    }
}

class RobotDancer extends Robot {
    Override
    void work() {

    }
}

class RobotCooker extends Robot{
    Override
    void work() {

    }
}