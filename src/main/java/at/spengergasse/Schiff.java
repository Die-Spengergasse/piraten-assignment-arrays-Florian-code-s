package at.spengergasse;
public class Schiff
{
    private int kanonen;
    private char typ;
    private Pirat kapitaen;
    private Pirat pirat1;
    private Pirat pirat2;
    private Pirat pirat3;
    private Pirat pirat4;
    private Pirat pirat5;

    public char getTyp(){
        return typ;
    }

    public int getKanonen(){
        return kanonen;
    }

    public Schiff(char typ){
        setType(typ);
        kanonenKlarmachen();
    }

    public void setType(char typ){
        if (typ == 's'){
            if(kapitaen != null && pirat1 != null && pirat2 != null){
                // System.out.println("Harr! Der Schiffstyp " + typ + " ist zu raeudig!");
                throw new IllegalArgumentException("Harr! Der Schiffstyp " + typ + " ist zu raeudig!");
            }
            else{
                this.typ = typ;
            }}
        else if(typ == 'b'){
            if(kapitaen != null && pirat1 != null && pirat2 != null && pirat3 != null){
                // System.out.println("Harr! Der Schiffstyp " + typ + " ist zu raeudig!");
                throw new IllegalArgumentException("Harr! Der Schiffstyp " + typ + " ist zu raeudig!");
            }
            else{
                this.typ = typ;
            }}
        else if(typ == 'f'){
            if(kapitaen != null && pirat1 != null && pirat2 != null && pirat3 != null && pirat4 != null){
                // System.out.println("Harr! Der Schiffstyp " + typ + " ist zu raeudig!");
                throw new IllegalArgumentException("Harr! Der Schiffstyp " + typ + " ist zu raeudig!");
            }
            else{
                this.typ = typ;
            }}
        else if(typ == 'g'){
            if(kapitaen != null && pirat1 != null && pirat2 != null && pirat3 != null && pirat4 != null && pirat5 != null){
                // System.out.println("Harr! Der Schiffstyp " + typ + " ist zu raeudig!");
                throw new IllegalArgumentException("Harr! Der Schiffstyp " + typ + " ist zu raeudig!");
            }
            else{
                this.typ = typ;
            }
        }

    }

    public void kanonenKlarmachen(){
        if(typ == 's'){
            kanonen = 1;
        }
        else if(typ == 'b'){
            kanonen = 2;
        }
        else if(typ == 'f'){
            kanonen = 5;
        }
        else if(typ == 'g'){
            kanonen = 6;
        }
        else{
            throw new IllegalArgumentException("Arrgh! Schaebige Schnigge vom Typ " + typ + " ist nicht wuerdiggesegelt zu werden!");
        }
    }

    public void anheuern(Pirat pirat){
        int piratesMax;
        piratesMax = 0;

        if(typ == 's'){
            piratesMax = 3;
        }
        if(typ == 'b'){
            piratesMax = 4;
        }
        if(typ == 'f'){
            piratesMax = 5;
        }
        if(typ == 'g'){
            piratesMax = 6;
        }

        int pirates;
        pirates = 0;

        if(kapitaen != null)pirates++;
        if(pirat1 != null) pirates++;
        if(pirat2 != null) pirates++;
        if(pirat3 != null) pirates++;
        if(pirat4 != null) pirates++;
        if(pirat5 != null) pirates++;

        if(pirates >= piratesMax){
            throw new IllegalArgumentException("AIII!! Noch mehr und das Schiff geht unter, Landratte.");
        }

        if(typ == 's'){
            if(kapitaen == null){
                kapitaen = pirat;
            }
            else if(pirat1 == null){
                pirat1 = pirat;
            }
            else if(pirat2 == null){
                pirat2 = pirat;
            }
        }
        if(typ == 'b'){
            if(kapitaen == null){
                kapitaen = pirat;
            }
            else if(pirat1 == null){
                pirat1 = pirat;
            }
            else if(pirat2 == null){
                pirat2 = pirat;
            }
            else if(pirat3 == null){
                pirat3 = pirat;
            }
        }
        if(typ == 'f'){
            if(kapitaen == null){
                kapitaen = pirat;
            }
            else if(pirat1 == null){
                pirat1 = pirat;
            }
            else if(pirat2 == null){
                pirat2 = pirat;
            }
            else if(pirat3 == null){
                pirat3 = pirat;
            }
            else if(pirat4 == null){
                pirat4 = pirat;
            }
        }
        if(typ == 'g'){
            if(kapitaen == null){
                kapitaen = pirat;
            }
            else if(pirat1 == null){
                pirat1 = pirat;
            }
            else if(pirat2 == null){
                pirat2 = pirat;
            }
            else if(pirat3 == null){
                pirat3 = pirat;
            }
            else if(pirat4 == null){
                pirat4 = pirat;
            }
            else if(pirat5 == null){
                pirat5 = pirat;
            }
        }
    }

    public String toString(){
        String typ_info;
        String pirat_info_k;
        String pirat_info_1;
        String pirat_info_2;
        String pirat_info_3;
        String pirat_info_4;
        String pirat_info_5;

        int typ_groeße;
        String komplett;

        typ_groeße = 0;
        typ_info = "";
        pirat_info_k = "";
        pirat_info_1 = "";
        pirat_info_2 = "";
        pirat_info_3 = "";
        pirat_info_4 = "";
        pirat_info_5 = "";

        if(typ == 's'){
            typ_info = "Schaluppe";
            typ_groeße = 3;
        }
        else if (typ == 'b'){
            typ_info = "Brigg";
            typ_groeße = 4;
        }
        else if (typ == 'f'){
            typ_info = "Fregatte";
            typ_groeße = 5;
        }
        else if (typ == 'g'){
            typ_info = "Galeone";
            typ_groeße = 6;
        }

        if (kapitaen != null){
            pirat_info_k = "Kapitän: " + kapitaen.toString() + "\n";
        }
        if (pirat1 != null){
            pirat_info_1 = "Pirat 2: " + pirat1.toString() + "\n";
        }
        if (pirat2 != null){
            pirat_info_2 = "Pirat 3: " + pirat2.toString() + "\n";
        }
        if (pirat3 != null){
            pirat_info_3 = "Pirat 4: " + pirat3.toString() + "\n";
        }
        if (pirat4 != null){
            pirat_info_4 = "Pirat 5: " + pirat4.toString() + "\n";
        }
        if (pirat5 != null){
            pirat_info_5 = "Pirat 6: " + pirat5.toString() + "\n";
        }
        komplett = "******************************************\n" + "Crew " + typ_info + " (" +  typ_groeße + "):\n" + "-----------------------\n" + pirat_info_k + pirat_info_1 + pirat_info_2 + pirat_info_3 + pirat_info_4 + pirat_info_5 + "\n" + "******************************************";
        return komplett;
    }

    public void print(){
        System.out.println(toString());
    }
}

