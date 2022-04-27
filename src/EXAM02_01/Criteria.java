package EXAM02_01;

public class Criteria {
    // member 변수
    private int pageNum;
    private int amount;
    private String type;
    private String keyword;
    private String[] authorArr;
    private String cateCode;
    private int bookId;

    // 기본 생성자
    public Criteria() {

    }
    
    // 매개변수 생성자
    public Criteria(int pageNum, int amount) {
        this.pageNum = pageNum;
        this.amount = amount;
    }

    // getter & setter
    public int getPageNum() {
        return pageNum;
    }
    public void setPageNum(int pageNum) {
        this.pageNum = pageNum;
    }
    public int getAmount() {
        return amount;
    }
    public void setAmount(int amount) {
        this.amount = amount;
    }
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    public String getKeyword() {
        return keyword;
    }
    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }
    public String[] getAuthorArr() {
        return authorArr;
    }
    public void setAuthorArr(String[] authorArr) {
        this.authorArr = authorArr;
    }
    public String getCateCode() {
        return cateCode;
    }
    public void setCateCode(String cateCode) {
        this.cateCode = cateCode;
    }
    public int getBookId() {
        return bookId;
    }
    public void setBookId(int bookId) {
        this.bookId = bookId;
    }
}
