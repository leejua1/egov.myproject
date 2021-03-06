
package com.leejua.web.domains;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @FileName :  LoanBase.java
 * @Project : 서비스 이용자의 정보를 분석하여 최적의 대출상품을 추천하고 연결시켜주는 서비스
 * @Date : 2020. 7. 1.
 * @작성자 : 이주아
 */
@Lazy
@Data
@Component
@AllArgsConstructor
@NoArgsConstructor
public class LoanBase {
	private String dclsMonth,  finCoNo,  finPrdtCd,
	    crdtPrdtType,  korCoNm,  finPrdtNm,
	       joinWay,  cdName,  crdtPrdtTypeNm,
	   dclsStrtDay,  dclsEndDay,  finCoSubmDay,
	        logo;
}
