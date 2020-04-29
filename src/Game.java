public class Game {
    public static void main(String[] args) {
        // objek
        Player petani1 = new Player();
        Player petani2 = new Player();

        // mengisi atribut player
        petani1.name = "IKHWAN";
        petani1.speed = 78;
        petani1.healthPoin = 100;

        petani2.name = "TOMO";
        petani2.speed = 90;
        petani2.healthPoin = 100;

        // menjalankan method
        petani1.run();
        petani2.run();

        if(petani1.isDead()){
            System.out.println("Game Over!");
        }
    }
}
