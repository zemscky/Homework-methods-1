public class Main {
    public static void main(String[] args) {
        taskOne();
        taskTwo();
        taskThree();
    }

    public static void taskOne() {
        System.out.println("Задание 1");
        int yearNumber = 2022;
        printIsLeapYear(yearNumber);
    }

    public static void printIsLeapYear(int year) {
        boolean leapYear = isLeapYear(year);
        printIsLeapYearResult(year, leapYear);
    }

    private static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0 || year % 400 == 0);
    }

    private static void printIsLeapYearResult(int year, boolean leapYear) {
        if (leapYear) {
            System.out.println(year + " — високосный год");
        } else {
            System.out.println(year + " — не високосный год");
        }
    }

    public static void taskTwo() {
        System.out.println("Задание 2");
        int deviceYear = 2016;
        String osName = "iOS";
        printIsClientDevice(deviceYear, osName);
    }

    public static void printIsClientDevice(int deviceYear, String osName) {
        boolean clientDevice = clientDeviceYear(deviceYear);
        int clientOS = getClientOS(osName);
        printIsClientDeviceResult(deviceYear, clientDevice, osName, clientOS);
    }

    private static int getClientOS(String name) {
        if (name.equals("iOS")) {
            return 0;
        } else {
            return 1;
        }
    }

    private static boolean clientDeviceYear(int deviceYear) {
        if (deviceYear > 2015) {
            return true;
        } else {
            return false;
        }
    }

    private static void printIsClientDeviceResult(int deviceYear, boolean clientDevice, String osName, int clientOS) {
        if (clientDevice == true && clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientDevice == false && clientOS == 0) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientDevice == true && clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }
    }

    public static void taskThree() {
        System.out.println("Задание 3");
        int deliveryDistance = calculateDeliveryDays (20);
        System.out.println("Потребуется дней: " + deliveryDistance);
    }
    public static int calculateDeliveryDays (int deliveryDistance) {
        if (deliveryDistance <= 20) {
            return 1;
        } else {
            return (int) Math.round (deliveryDistance / 40) + 1;
        }
    }
}

