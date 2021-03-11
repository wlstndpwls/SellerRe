package com.project.sellerre.wish;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class WishService {

   @Autowired
   private WishMapper wishmapper;
   
   /*
    * 찜DB에 찜리스트를 추가한다.
    * wish_num      : 시퀀스 값으로 대체
    * user_id      : 구매자 id(=session.id)
    * product_num   : product의 num (=상품번호)
    */
   public void insertWish(Wish w) {
      wishmapper.insertWish(w);
   }
   
   /*
    * 프로덕트에서 찜의 세션 아이디가 가진 아이디를 가진 상품정보를 가져온다
    * user_id      : 구매자 id(=session.id)
    */
   public List selectByUserId(String user_id) {
      return wishmapper.selectByUserId(user_id);
   }
   
   /*
    * product_num을 통해 찜 DB에서 상품에 찜한 UserId의 숫자를 구한다  
    * product_num: 찜 전체 DB에 저장된 상품번호
    */
   public int countUserIdByProductNum(int product_num) {
      return wishmapper.countUserIdByProductNum(product_num);
   }
   
   /*
    * 현제 user_id가 찜 DB에 가지고 있는 product_num을 찾아온다 
    * user_id: 현제 아이디
    * product_num: 본인의 찜 DB에 저장된 상품 번호
    */
   public Wish selectByUserIdProductNum(int product_num, String user_id) {
     Map map = new HashMap();
     map.put("user_id", user_id);
      map.put("product_num", product_num);
     return wishmapper.selectByUserIdProductNum(map);
   }
   /*
    * 현제 user_id를 통해 유저의 찜리스트에서 product_num을 삭제
    * user_id: 사용자의 아이디
    * wish_num : 위시리스트 시퀀스 넘버
    */
   public void delwish(String user_id,int product_num) {
      Map map = new HashMap();
      map.put("user_id", user_id);
      map.put("product_num", product_num);
      wishmapper.deleteWish(map);
   }
   
   public void deleteProductAndWish(int product_num) {
	   wishmapper.deleteProductAndWish(product_num);
   }
   
   public int getNum() {
      return wishmapper.getNum();
   }
}