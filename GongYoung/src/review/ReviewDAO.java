package review;

import java.util.List;

public interface ReviewDAO {
	// 파라미터값 생각해 보자
	List<String> reviewSelect();
	int reviewSelectByStoreName();
	int reviewSelectBynickname();
	int reviewdelete();
	int reviewInsert();
	
}
