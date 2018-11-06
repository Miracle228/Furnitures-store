public class ItemType {
    private String typeName;

    public ItemType(String typeName){
        this.setTypeName(typeName);
    }

    public ItemType(){
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }
}
