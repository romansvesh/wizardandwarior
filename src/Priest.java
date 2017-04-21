/**
 * Created by User on 05.02.2017.
 */
public class Priest extends Character {
    private int mana = 100;
    private int maxMana = 10;
    private String attackType;
    private boolean bool;

    public int enemyHealth;

    private void setAttackType() {
        switch (level) {
            case 1: attackType = "steel";
                    break;
            case 2: attackType = "water";
                    break;
            case 3: attackType = "water";
        }
    }

    public void manaRecovery() {
        if (mana < maxMana)
            mana = maxMana + 1;
    }

    public void healing() {
        enemyHealth = enemyHealth + 10;
    }

    public boolean attack() {
        setAttackType();

        if (attackType != "steel" && mana == 0) {
            bool = false;
        }
        else {
            switch (attackType) {
                case "steel":
                    if (enemyHealth > 0)
                        enemyHealth = enemyHealth - 10;
                case "water":
                    if (enemyHealth > 0) {
                        enemyHealth = enemyHealth - 20;
                        mana = mana - 1;
                    }
            bool = true;
            }
        }
        return bool;
    }


}
