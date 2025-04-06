public class Cat {

    private String id;  // Id for katten - fx "c1", "c2"


    //Konstruktør
    public Cat(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }


    // Vi laver equals(), hashCode() og typecast for at fortælle Java, hvordan to katte med samme ID
    // skal betragtes som ens, så vi kan tjekke, om en kat allerede er registreret.

    @Override
    public boolean equals(Object obj) { // JAVA's equal-metode sammenligner typer men vi ønsker at sammenligne
                                        // indholdet af objektet og derfor overskriver vi den indbyggede metode.
        if (this == obj) return true; //Hvis kattene (objekterne) er de samme.
        if (obj == null || getClass() != obj.getClass()) return false; // Hvis objektet ikke eksisterer eller objektet ikke er
                                                                        // af samme klasse som this-objekt - false

        Cat cat = (Cat) obj;  // Vi fortæller JAVA, at vores object er en Cat.
                            // Vi sender vores obj, som er en cat af datatypen Cat, som parametre i equals(Object obj)

        return id != null ? id.equals(cat.id) : cat.id == null;  // Ternary Operator - kort if-else.
                                                                // “Hvis ID ikke er null, så sammenlign dem som normalt.
                                                                //Men hvis ID er null, så er de kun ens, hvis den andens ID også er null.”
    }

    @Override
    public int hashCode() {
        return id != null ? id.hashCode() : 0;
    }

    @Override
    public String toString() {
        return "Cat{id='" + id + "'}";
    }
}
