package EXAM02_02;

public class AuthorServiceImpl implements AuthorService {

    @Override
    public void authorDelete(int authorId) {
        System.out.println("작가 정보 삭제");
    }

    @Override
    public void authorGetDetail(int authorId) {
        System.out.println("작가 상세 페이지");
    }

    @Override
    public void authorGetList(String cri) {
        System.out.println("작가 목록");
    }

    @Override
    public void authorGetTotal(String cri) {
        System.out.println("작가 총 수");
    }

    @Override
    public void authorModify(String author) {
        System.out.println("작가 정보 수정");
    }
    
}
