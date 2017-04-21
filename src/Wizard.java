/**
 * Created by User on 05.02.2017.
 */
public class Wizard extends Character {
    private int mana = 100;
    private int maxMana = 10;
    private String attackType;
    private boolean bool;

    public int enemyHealth;

    private void setAttackType() {
        switch (level) {
            case 1: attackType = "steel";
                    break;
            case 2: attackType = "fire";
                    break;
            case 3: attackType = "drain";
        }
    }

    public void manaRecovery() {
        if (mana < maxMana)
            mana = maxMana + 1;
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
                case "fire":
                    if (enemyHealth > 0) {
                        enemyHealth = enemyHealth - 20;
                        mana = mana - 1;
                    }
                case "drain":
                    enemyHealth = enemyHealth - 20;
                    mana = mana - 1;
                    if (health <= maxHealth) {
                        health = health + 10;
                    }

            bool = true;
            }
        }
        return bool;
    }


}
