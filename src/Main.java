public class Main {
    public static void main(String[] args) {
//        Основная ДЗ
//        a)  Создать иерархию из 3х классов (1й -> 2й -> 3й уровень иерархии), последний 3й класс сделать не наследуемым
//        b)  Все поля классов должны быть приватными, одно из полей должно быть
//        сложного типа созданного вами же (4й класс), одно из полей сделать сложного типа (enum)
//        c)  В классах не должно быть setter-ов, только getter-ы и конструкторы
//        d)  Добавить перегруженные методы (2-3 шт.) в класс 2-го уровня иерархии, один из них сделать неперезаписываемым
//        e)  В классе 3-го уровня перезаписать один из методов родителя
//        f)  В главном классе (Main) Создать объект класса 2-го уровня (objectA) и 2 объекта класса
//        3-го уровня (objectA, objectC), также распечатать все свойства объектов и вызвать перегруженные методы
//        через каждый из экземпляров ваших объектов.
       Second objectA = new Second(23,Words.Good_day, "objectA");
       Third objectB = new Third(16, Words.Good_evening, "Good bay", "objectB");
       Third objectC = new Third(24, Words.Good_morning, "See you latter", "objectC");
       Third[]  thirds = { objectB, objectC};

        System.out.println(objectA.getNumber() +" "+objectA.getWords() + " "+ objectA.getWord());
        objectA.print(objectA.getNumber(),objectA.getWords(),objectA.getWord());

        for (int i = 0; i < thirds.length; i++) {
                System.out.println(thirds[i].getNumber() +" "+( thirds[i]).getWords() + " "+ ( thirds[i]).getWord()+ " "+ ( thirds[i]).getText());
                thirds[i].print(objectB.getNumber(), objectB.getWords(), objectB.getWord());
        }


    }
}