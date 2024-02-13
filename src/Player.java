public class Player {
    private String name;
    private int health;
    private int attackPower;

    public Player(String name, int health, int attackPower) {
        this.name = name;
        this.health = health;
        this.attackPower = attackPower;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Health: " + health + ", Attack Power: " + attackPower;
    }

    public boolean isAlive(){
        return health > 0;
    }

    public void attack(Enemy enemy){
        int damage = (int) (Math.random() * attackPower) + 1;
        enemy.takeDamage(damage);
        System.out.println("You attack the enemy for " + damage + " damage!");
    }

    public void takeDamage(int damage){
        health -= damage;
        if (health <= 0) {
            health = 0;
            System.out.println("You have been defeated!");
        }
    }
}
