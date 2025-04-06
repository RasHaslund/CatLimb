import java.util.ArrayList;

public class CatLimb {


        private Access currentMode;
        private ArrayList<Cat> registeredCats; //ArrayList til at gemme registrerede katte


    //Konstruktør
        public CatLimb() {
            this.currentMode = Access.CLOSED; // Default som i opgaven - (ENUM)
            this.registeredCats = new ArrayList<>();
        }

        public void setMode(Access mode) { //Vi gendøber currentMode til bare at hedde Mode.
            this.currentMode = mode;
        }

        public Access getMode() {
            return currentMode;
        }


//Metode: Tilføjer Cat til ArrayListen
        public void registerCat(Cat cat) {
            if (registeredCats.size() < 5 && !registeredCats.contains(cat)) {
                registeredCats.add(cat);
            } //"Hvis der er mindre end 5 katte i listen OG katten ikke allerede findes i listen,
            // så tilføj katten."
        }

//Metode: Sletter ArrayListens Indhold
        public void clearRegisteredCats() {
            registeredCats.clear();
        }

//Metode: Må katten komme ind? Ja, Nej.
        public boolean isAllowedIn(Cat cat) {
            if (!registeredCats.contains(cat)) return false;

            return switch (currentMode) {
                case IN_OUT, ONLY_IN -> true;
                default -> false;
            };
            //“Hvis adgangsmoden (currentMode) er enten IN_OUT eller ONLY_IN,
            // så må katten godt komme ind → returnér true.”
            // “Ellers (f.eks. ved ONLY_OUT eller CLOSED) → false.”
        }

//Metode: Må katten komme ud? Ja, Nej.
        public boolean isAllowedOut(Cat cat) {
            return switch (currentMode) {
                case IN_OUT, ONLY_OUT -> true;
                default -> false;
            };
        }

// Metode: Få listen af registrerede katte
        public ArrayList<Cat> getRegisteredCats() {
            return registeredCats;
        }
    }

