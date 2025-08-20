import java.util.ArrayList;

public class SuperHero implements HabilitiesCRUD{
    private ArrayList<String> habilities = new ArrayList<>();


    public SuperHero() {
    }

    public SuperHero(ArrayList<String> habilidades) {
        this.habilities = habilidades;
    }

    @Override
    public void showHabilities(){
        System.out.println("This person have this habilities: ");
        for (String habilitie : habilities){
            System.out.printf("- " + habilitie);
        }
    }

    @Override
    public void addHabilities(String habilitie) {
            if (habilities.contains(habilitie)){
                System.out.printf("This persona already have " + habilitie);
            }else{
            habilities.add(habilitie);
            System.out.println("Habilite added with success!");
        }
    }

    @Override
    public void removeHabilities(String habilitie){
        if (habilities.isEmpty()){
            System.out.println("This persona does not have any habilities to remove!");
        } else {
            if (habilities.contains(habilitie)) {
                habilities.remove(habilitie);
                System.out.println(habilitie + " was removed with success!");
            } else {
                System.out.println("This persona does not have " + habilitie + " to remove.");
            }
        }
    }


    public ArrayList<String> getHabilities() {
        return habilities;
    }

    public void setHabilities(ArrayList<String> habilities) {
        this.habilities = habilities;
    }
}
