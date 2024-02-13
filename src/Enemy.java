public class Enemy {
    private String name;
    private int health;
    private int attackPower;

    public Enemy(String name, int health, int attackPower) {
        this.name = name;
        this.health = health;
        this.attackPower = attackPower;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Health: " + health + ", Attack Power: " + attackPower;
    }

    public boolean isAlive() {
        return health > 0;
    }

    public void takeDamage(int damage) {
        health -= damage;
        if (health <= 0) {
            health = 0;
            System.out.println("Enemy has been defeated!");
        }
    }

    public void attack(Player player) {
        int damage = (int) (Math.random() * attackPower) + 1;
        player.takeDamage(damage);
        System.out.println("Enemy attacks you for " + damage + " damage!");
    }
}
