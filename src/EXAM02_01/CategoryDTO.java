package EXAM02_01;

public class CategoryDTO {
    // member 변수
    private int tier;
    private String cateName;
    private String cateCode;
    private String cateParent;

    // getter & setter
    public int getTier() {
        return tier;
    }
    public void setTier(int tier) {
        this.tier = tier;
    }
    public String getCateName() {
        return cateName;
    }
    public void setCateName(String cateName) {
        this.cateName = cateName;
    }
    public String getCateCode() {
        return cateCode;
    }
    public void setCateCode(String cateCode) {
        this.cateCode = cateCode;
    }
    public String getCateParent() {
        return cateParent;
    }
    public void setCateParent(String cateParent) {
        this.cateParent = cateParent;
    }

    
}
