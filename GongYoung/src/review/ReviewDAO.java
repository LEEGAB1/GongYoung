package review;

import java.util.List;

public interface ReviewDAO {
	// �Ķ���Ͱ� ������ ����
	List<String> reviewSelect();
	int reviewSelectByStoreName();
	int reviewSelectBynickname();
	int reviewdelete();
	int reviewInsert();
	
}
