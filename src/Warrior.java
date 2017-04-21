/**
 * Created by User on 05.02.2017.
 */
public class Warrior extends Character {

    public int enemyHealth;
    private String attackType;

    private void setAttackType() {
        switch (level) {
            case 1: enemyHealth = enemyHealth - 10;
                break;
            case 2: enemyHealth = enemyHealth - 20;
                break;
            case 3: enemyHealth = enemyHealth - 40;
        }
    }
// some new comment
    public boolean attack() {
        switch (level) {
            case 1: if (enemyHealth > 0)
                        enemyHealth = enemyHealth - 10;
                    break;
            case 2: if (enemyHealth > 0)
                        enemyHealth = enemyHealth - 20;
                    break;
            case 3: if (enemyHealth > 0)
                        enemyHealth = enemyHealth - 40;
        }
        return true;
    }
}
