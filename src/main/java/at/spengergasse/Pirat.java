package at.spengergasse;
public class Pirat{

    private String name;
    private int gesundheit;
    private boolean holzbein;

    public Pirat(String name, int gesundheit, boolean holzbein){
        setName(name);
        setGesundheit(gesundheit);
        setHolzbein(holzbein);
    }

    public void setName(String name){
        if (name == null){
            throw new IllegalArgumentException("Darf nicht NULL sein");
        }
        else if(name.equals("")){
            // System.out.println("Arrgh! Keinen Namen fuer den alten Seebaeren uebergeben!");
            throw new IllegalArgumentException("Arrgh! Keinen Namen fuer den alten Seebaeren uebergeben!");
        }
        else{
            this.name = name;
        }
    }

    public void setGesundheit(int gesundheit){
        if (gesundheit >100 || gesundheit <0){
            // System.out.println("Yo-ho-ho - Gültiger Bereich für die Gesundheit: 0 bis 100 Prozent");
            throw new IllegalArgumentException("Yo-ho-ho - Gültiger Bereich für die Gesundheit: 0 bis 100 Prozent");
        }
        else{
            this.gesundheit = gesundheit;
        }
    }

    public void setHolzbein(boolean holzbein){
        this.holzbein = holzbein;
    }

    public String getName(){
        return name;
    }

    public int getGesundheit(){
        return gesundheit;
    }

    public boolean getHolzbein(){
        return holzbein;
    }

    public void setTrinken(char getraenk){
        if (getraenk == 'w'){
            gesundheit -= 10;
        }
        if (getraenk == 'g'){
            gesundheit += 10;
        }
        if (getraenk == 'r'){
            gesundheit += 20;
        }
        if (gesundheit <=0){
            gesundheit = 0;
            if (gesundheit == 0){
                System.out.println("Haudegen " + name + " ging ueber die Planken.");
            }
        }
        if (gesundheit >=100){
            gesundheit = 100;
            if (gesundheit == 100){
                System.out.println("Haudegen " + name + " erfreut sich voller Gesundheit");
            }
        }
    }

    public void kielholen(){
        if(holzbein == true){
            gesundheit -= 95;
        }
        else{
            gesundheit -= 90;
        }
        if (gesundheit <=0){
            gesundheit = 0;
            if (gesundheit == 0){
                System.out.println("Pirat " + name + " stieg in Davy Jone’s Kiste");
            }
        }
    }

    public String toString(){
        String gesundheits_info;
        String holzbein_info;
        holzbein_info = "";
        gesundheits_info = "";
        if (gesundheit <= 0){
            gesundheits_info = "X - sprang in die Kiste";
        }
        else if (gesundheit <=10){
            gesundheits_info = gesundheit + "% - hisst den Yellow Jack";
        }
        else{
            gesundheits_info = gesundheit + "%";
        }
        if (holzbein == true){
            holzbein_info = "Holzbeiner";
        }
        else{
            holzbein_info = "Zweifüßer";
        }
        return "'Aye' - Trunkenbold " + name + " meldet sich an Board! " + gesundheits_info + ", " + holzbein_info ;
    }

    public void print(){
        System.out.println(toString());
    }
}
