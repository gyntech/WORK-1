package com.opes.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "memberrs")
public class Member {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "rollNo", nullable = false)
	private String rollNo;
	
	@Column(name = "s1")
	private String S1;
	
	@Column(name = "s2")
	@Size(max = 1000)
	private String S2;
	
	@Column(name = "s3")
	private String S3;
	
	@Column(name = "s4")
	private String S4;
	
	@Column(name = "s5")
	private String S5;
	
	@Column(name = "s6")
	private String S6;
	
	@Column(name = "s7")
	private String S7;
	
	@Column(name = "s8")
	private String S8;
	
	@Column(name = "s9")
	private String S9;
	
	@Column(name = "s10")
	private String S10;
	
	
	
	@Column(name = "s91")
	@Size(max = 50)
	private String S91;
	
	@Column(name = "s92")
	@Size(max = 50)
	private String S92;
	
	@Column(name = "s93")
	@Size(max = 50)
	private String S93;
	
	@Column(name = "s94")
	@Size(max = 50)
	private String S94;
	
	@Column(name = "s95")
	@Size(max = 50)
	private String S95;
	
	@Column(name = "s96")
	@Size(max = 50)
	private String S96;
	
	@Column(name = "s97")
	@Size(max = 50)
	private String S97;
	
	@Column(name = "s98")
	@Size(max = 50)
	private String S98;
	
	@Column(name = "s99")
	@Size(max = 50)
	private String S99;
	
	@Column(name = "s100")
	@Size(max = 50)
	private String S100;
	
	
	

	public Member() {
		
	}
	
	
	
	

	
	public int ints1() {
		return  Integer. valueOf(S1); 
	}
	
	
	
	
	public String str5() {
		if(ints1()==1) {
			return "Managing Director";
		}else if(ints1()==2) {
			return "Project Manager";
		}else if(ints1()==3) {
			return "Procurement";
		}else if(ints1()==4) {
			return "QS";
		}else if(ints1()==5) {
			return "Engineer";
		}
		return "";
	}
	
	
	
	
	
	
	
	

	public int ints3() {
		return  Integer. valueOf(S3); 
	}
	
	
	
	
	public String str3() {
		if(ints3()==1) {
			return "Managing Director";
		}else if(ints3()==2) {
			return "Project Manager";
		}else if(ints3()==3) {
			return "Procurement";
		}else if(ints3()==4) {
			return "QS";
		}else if(ints3()==5) {
			return "Engineer";
		}else if(ints3()==0) {
			return "";
		}
		return "";
	}
	
	




	public Member(String rollNo, String s1, @Size(max = 1000) String s2, String s3, String s4, String s5, String s6,
			String s7, String s8, String s9, String s10, @Size(max = 50) String s91, @Size(max = 50) String s92,
			@Size(max = 50) String s93, @Size(max = 50) String s94, @Size(max = 50) String s95,
			@Size(max = 50) String s96, @Size(max = 50) String s97, @Size(max = 50) String s98,
			@Size(max = 50) String s99, @Size(max = 50) String s100) {
		super();
		this.rollNo = rollNo;
		S1 = s1;
		S2 = s2;
		S3 = s3;
		S4 = s4;
		S5 = s5;
		S6 = s6;
		S7 = s7;
		S8 = s8;
		S9 = s9;
		S10 = s10;
		S91 = s91;
		S92 = s92;
		S93 = s93;
		S94 = s94;
		S95 = s95;
		S96 = s96;
		S97 = s97;
		S98 = s98;
		S99 = s99;
		S100 = s100;
	}




	public Long getId() {
		return id;
	}




	public void setId(Long id) {
		this.id = id;
	}




	public String getRollNo() {
		return rollNo;
	}




	public void setRollNo(String rollNo) {
		this.rollNo = rollNo;
	}




	public String getS1() {
		return S1;
	}




	public void setS1(String s1) {
		S1 = s1;
	}




	public String getS2() {
		return S2;
	}




	public void setS2(String s2) {
		S2 = s2;
	}




	public String getS3() {
		return S3;
	}




	public void setS3(String s3) {
		S3 = s3;
	}




	public String getS4() {
		return S4;
	}




	public void setS4(String s4) {
		S4 = s4;
	}




	public String getS5() {
		return S5;
	}




	public void setS5(String s5) {
		S5 = s5;
	}




	public String getS6() {
		return S6;
	}




	public void setS6(String s6) {
		S6 = s6;
	}




	public String getS7() {
		return S7;
	}




	public void setS7(String s7) {
		S7 = s7;
	}




	public String getS8() {
		return S8;
	}




	public void setS8(String s8) {
		S8 = s8;
	}




	public String getS9() {
		return S9;
	}




	public void setS9(String s9) {
		S9 = s9;
	}




	public String getS10() {
		return S10;
	}




	public void setS10(String s10) {
		S10 = s10;
	}




	public String getS91() {
		return S91;
	}




	public void setS91(String s91) {
		S91 = s91;
	}




	public String getS92() {
		return S92;
	}




	public void setS92(String s92) {
		S92 = s92;
	}




	public String getS93() {
		return S93;
	}




	public void setS93(String s93) {
		S93 = s93;
	}




	public String getS94() {
		return S94;
	}




	public void setS94(String s94) {
		S94 = s94;
	}




	public String getS95() {
		return S95;
	}




	public void setS95(String s95) {
		S95 = s95;
	}




	public String getS96() {
		return S96;
	}




	public void setS96(String s96) {
		S96 = s96;
	}




	public String getS97() {
		return S97;
	}




	public void setS97(String s97) {
		S97 = s97;
	}




	public String getS98() {
		return S98;
	}




	public void setS98(String s98) {
		S98 = s98;
	}




	public String getS99() {
		return S99;
	}




	public void setS99(String s99) {
		S99 = s99;
	}




	public String getS100() {
		return S100;
	}




	public void setS100(String s100) {
		S100 = s100;
	}


	
	
	
	
	
	

	
}

