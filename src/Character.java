import java.util.Random;

/**
 * Created by User on 05.02.2017.
 */
abstract class Character {

    public int level;
    public int health = 100;
    public int maxHealth = 100;

//    boolean атаковать(Персонаж атакуемый)
//    Функция возвращает boolean, если атака прошла успешно - true, иначе - false.
    abstract boolean attack();

}
