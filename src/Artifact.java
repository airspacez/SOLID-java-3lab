public class Artifact extends GameObject {

    private String name;
    private String rarity;

    public Artifact() {
        this.name = "Stone with eternity time";
        this.rarity = "Rare";
    }

    public Artifact(String name) {
        this.name = name;
        this.rarity = "Rare";
    }

    public Artifact(String name, String rarity) {
        this.name = name;
        this.rarity = rarity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRarity() {
        return rarity;
    }

    public void setRarity(String rarity) {
        this.rarity = rarity;
    }
}
