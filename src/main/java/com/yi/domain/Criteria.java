package com.yi.domain;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Criteria {

	/** 현재 페이지 번호 */
	private int currentPageNo;

	/** 페이지당 출력할 데이터 개수 */
	private int recordsPerPage;

	/** 화면 하단에 출력할 페이지 사이즈 */
	private int pageSize;

	/** 검색 키워드 */
	private String keyword;

	/** 검색 유형 */
	private String type;

	public Criteria() {
		this.currentPageNo = 1;
		this.recordsPerPage = 3;
		this.pageSize = 10;
	}

	public Criteria(int page, int pageper) {
		this.currentPageNo = page;
		this.recordsPerPage = pageper;
		this.pageSize = 10;
	}



	public int getStartPage() {
		return (currentPageNo - 1) * recordsPerPage;
	}

	public String[] gettypeArr() {
		return type==null? new String[] {}:type.split("");
	}

}