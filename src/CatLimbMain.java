public class CatLimbMain {

        public static void main(String[] args) {
            // Opret katte
            Cat c1 = new Cat("c1");
            Cat c2 = new Cat("c2");
            Cat c3 = new Cat("c3");
            Cat c4 = new Cat("c4");
            Cat c5 = new Cat("c5");
            Cat c6 = new Cat("c6"); // Uregistreret kat

            // Opret kattelem
            CatLimb catLimb = new CatLimb();

            // Tilføjer c1-c5 til vores nye kattelem med vores metode, registerCat(Cat cat);
            catLimb.registerCat(c1);
            catLimb.registerCat(c2);
            catLimb.registerCat(c3);
            catLimb.registerCat(c4);
            catLimb.registerCat(c5);
            // c6 bliver ikke registreret

            // Test alle modes
            System.out.println("Mode IN/OUT:");
            catLimb.setMode(Access.IN_OUT);
            printTest(catLimb, c1);
            printTest(catLimb, c5);
            printTest(catLimb, c6);

            System.out.println("\nMode ONLY IN:");
            catLimb.setMode(Access.ONLY_IN);
            printTest(catLimb, c1);
            printTest(catLimb, c5);
            printTest(catLimb, c6);

            System.out.println("\nMode ONLY OUT:");
            catLimb.setMode(Access.ONLY_OUT);
            printTest(catLimb, c1);
            printTest(catLimb, c5);
            printTest(catLimb, c6);

            System.out.println("\nMode CLOSED:");
            catLimb.setMode(Access.CLOSED);
            printTest(catLimb, c1);
            printTest(catLimb, c5);
            printTest(catLimb, c6);
        }

        private static void printTest(CatLimb limb, Cat cat) {
            boolean allowedIn = limb.isAllowedIn(cat);
            boolean allowedOut = limb.isAllowedOut(cat);
            System.out.println(cat.getId() + ": IN = " + allowedIn + ", OUT = " + allowedOut);
        }
    }


