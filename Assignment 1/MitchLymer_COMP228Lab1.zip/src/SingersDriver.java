public class SingersDriver {
    public static void main(String[] args) {
        Singers singer1 = new Singers();
        System.out.println(singer1.getSingerId() + singer1.getSingerName() + singer1.getSingerAddress() + singer1.getDateOfBirth() + singer1.getNumberOfAlbumsPublished());

        Singers peterGabriel = new Singers(100, "Peter Gabriel", "America", "Feb 13, 1950", 10);
        System.out.println(peterGabriel.getSingerId() + peterGabriel.getSingerName() + peterGabriel.getSingerAddress() + peterGabriel.getDateOfBirth() + peterGabriel.getNumberOfAlbumsPublished());
    }
}

