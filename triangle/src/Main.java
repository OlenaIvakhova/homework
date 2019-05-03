public class Main {
    public static void main(String[] args) {
        class Box {
            int width; // ширина коробки
            int height; // высота коробки

            // Конструктор
            Box() {
                width = 10;
                height = 10;
            }

            // вычисляем объём коробки
            int getVolume() {
                return width * height;
            }
        }

    }
