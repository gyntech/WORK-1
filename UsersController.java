package com.opes.controller;

import java.util.List;

import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;

import com.opes.service.EvangelismService;
import com.opes.service.EvangelismpService;
import com.opes.service.EvangelismsService;
import com.opes.service.EvangelismtService;
import com.opes.service.MathsService;
import com.opes.service.MemberService;
import com.opes.service.QuestionService;
import com.opes.service.StaffService;
import com.opes.model.Evangelismp;
import com.opes.model.Evangelismt;
import com.opes.model.Maths;
import com.opes.model.Member;
import com.opes.model.Staff;
import com.opes.model.Evangelism;
import com.opes.model.Evangelisms;




@Controller
public class UsersController {

	
	
	

	
	
	
	
	EvangelismService evangelismService;
	EvangelismpService evangelismpService;
	EvangelismtService evangelismtService;
	EvangelismsService evangelismsService;
    StaffService staffService;
    MemberService memberService;
    MathsService mathsService;
    QuestionService questionService;
    
	
	public UsersController(EvangelismService evangelismService, EvangelismtService evangelismtService, EvangelismsService evangelismsService,
			EvangelismpService evangelismpService, StaffService staffService, MemberService memberService, MathsService mathsService,
		    QuestionService questionService) {
		this.evangelismService = evangelismService; 
		this.evangelismpService = evangelismpService;
		this.evangelismtService = evangelismtService;
		this.evangelismsService = evangelismsService;
		this.staffService = staffService;	
		this.memberService = memberService;
		this.mathsService = mathsService;
		this.questionService = questionService;
	}
	
	
	
	@RequestMapping(value = {"/users/dashboard"}, method = RequestMethod.GET)
    public String userschurch(){
        return "users/dashboard";
    }
	
	
	@RequestMapping(value = {"/users/dashboard2"}, method = RequestMethod.GET)
    public String usersHome(){
        return "users/dashboard2";
    }
	
	
	
	
	
	
	

	
	
	@RequestMapping(value = {"/usersstaffs"}, method = RequestMethod.GET)
	public String listStaffs(Model model, 
	   		 @Param("keyword") String keyword) {
		 List<Staff> listStaffs = staffService.getAllStaffs(keyword);
		 model.addAttribute("listStaffs", listStaffs);
		 model.addAttribute("keyword", keyword);
		 model.addAttribute("staffs", staffService.getAll());
		return "users/staff";
	}
	
	

	@RequestMapping(value = {"/usersrece"}, method = RequestMethod.GET)
	public String recelisttrack(Model model, 
	   		 @Param("keyword") String keyword) {
		 List<Staff> listStaffs = staffService.getAllStaffs(keyword);
		 model.addAttribute("listStaffs", listStaffs);
		 model.addAttribute("keyword", keyword);
		 model.addAttribute("staffs", staffService.getAll());
		return "users/rece";
	}
	
	
	
	
	@RequestMapping(value = {"/userstrack"}, method = RequestMethod.GET)
	public String listtrack(Model model, 
	   		 @Param("keyword") String keyword) {
		 List<Staff> listStaffs = staffService.getAllStaffs(keyword);
		 model.addAttribute("listStaffs", listStaffs);
		 model.addAttribute("keyword", keyword);
		 model.addAttribute("staffs", staffService.getAll());
		return "users/track";
	}
	
	
	
	@RequestMapping(value = {"/usersstaffs/new"}, method = RequestMethod.GET)
	public String createStaffForm(Model model) {
		Staff staff = new Staff();
		model.addAttribute("staff", staff);
		return "users/create_staff";
	}
	
	
	

	@RequestMapping(value = {"/userslocstaffs/new"}, method = RequestMethod.GET)
	public String createlocStaffForm(Model model) {
		Staff staff = new Staff();
		model.addAttribute("staff", staff);
		return "users/location";
	}
	
	
	

 @RequestMapping(value = {"/usersstaffs"}, method = RequestMethod.POST)
public String saveStaff(@ModelAttribute("staff") Staff staff) {
	 staffService.saveStaff(staff);
	return "redirect:/usersstaffs";
}

 @RequestMapping(value = {"/userstrack/edit/{id}"}, method = RequestMethod.GET)
public String editStaffForm(@PathVariable Long id, Model model) {
	model.addAttribute("staff", staffService.getStaffById(id));
	return "users/edit_staff";
}
 
 
 

 @RequestMapping(value = {"/userstrack/{id}"}, method = RequestMethod.POST)
public String updateStaff(@PathVariable Long id, 
		@ModelAttribute("staff") Staff staff,
		Model model) {
	
	//get staffs from database by id
	 Staff existingStaff = staffService.getStaffById(id);
	existingStaff.setId(id);
	existingStaff.setRollNo(staff.getRollNo());
	existingStaff.setS1(staff.getS1());
	existingStaff.setS2(staff.getS2());
	existingStaff.setS3(staff.getS3());
	existingStaff.setS4(staff.getS4());
	existingStaff.setS5(staff.getS5());
	existingStaff.setS6(staff.getS6());
	existingStaff.setS7(staff.getS7());
	existingStaff.setS8(staff.getS8());
	existingStaff.setS9(staff.getS9());
	existingStaff.setS10(staff.getS10());
	existingStaff.setS11(staff.getS11());
	existingStaff.setS12(staff.getS12());
	existingStaff.setS13(staff.getS13());
	existingStaff.setS14(staff.getS14());
	existingStaff.setS15(staff.getS15());
	existingStaff.setS16(staff.getS16());
	existingStaff.setS17(staff.getS17());
	existingStaff.setS18(staff.getS18());
	existingStaff.setS19(staff.getS19());
	existingStaff.setS20(staff.getS20());
	existingStaff.setS21(staff.getS21());
	existingStaff.setS22(staff.getS22());
	existingStaff.setS23(staff.getS23());
	existingStaff.setS24(staff.getS24());
	existingStaff.setS25(staff.getS25());
	existingStaff.setS26(staff.getS26());
	existingStaff.setS27(staff.getS27());
	existingStaff.setS28(staff.getS28());
	existingStaff.setS29(staff.getS29());
	existingStaff.setS30(staff.getS30());
	existingStaff.setS31(staff.getS31());
	existingStaff.setS32(staff.getS32());
	existingStaff.setS33(staff.getS33());
	existingStaff.setS34(staff.getS34());
	existingStaff.setS35(staff.getS35());
	existingStaff.setS36(staff.getS36());
	existingStaff.setS37(staff.getS37());
	existingStaff.setS38(staff.getS38());
	existingStaff.setS39(staff.getS39());
	existingStaff.setS40(staff.getS40());
	existingStaff.setS41(staff.getS41());
	existingStaff.setS42(staff.getS42());
	existingStaff.setS43(staff.getS43());
	existingStaff.setS44(staff.getS44());
	existingStaff.setS45(staff.getS45());
	existingStaff.setS46(staff.getS46());
	existingStaff.setS47(staff.getS47());
	existingStaff.setS48(staff.getS48());
	existingStaff.setS49(staff.getS49());
	existingStaff.setS50(staff.getS50());
	existingStaff.setS51(staff.getS51());
	existingStaff.setS52(staff.getS52());
	existingStaff.setS53(staff.getS53());
	existingStaff.setS54(staff.getS54());
	existingStaff.setS55(staff.getS55());
	existingStaff.setS56(staff.getS56());
	existingStaff.setS57(staff.getS57());
	existingStaff.setS58(staff.getS58());
	existingStaff.setS59(staff.getS59());
	existingStaff.setS60(staff.getS60());
	existingStaff.setS61(staff.getS61());
	existingStaff.setS62(staff.getS62());
	existingStaff.setS63(staff.getS63());
	existingStaff.setS64(staff.getS64());
	existingStaff.setS65(staff.getS65());
	existingStaff.setS66(staff.getS66());
	existingStaff.setS67(staff.getS67());
	existingStaff.setS68(staff.getS68());
	existingStaff.setS69(staff.getS69());
	existingStaff.setS70(staff.getS70());
	existingStaff.setS71(staff.getS71());
	existingStaff.setS72(staff.getS72());
	existingStaff.setS73(staff.getS73());
	existingStaff.setS74(staff.getS74());
	existingStaff.setS75(staff.getS75());
	existingStaff.setS76(staff.getS76());
	existingStaff.setS77(staff.getS77());
	existingStaff.setS78(staff.getS78());
	existingStaff.setS79(staff.getS79());
	existingStaff.setS80(staff.getS80());
	existingStaff.setS81(staff.getS81());
	existingStaff.setS82(staff.getS82());
	existingStaff.setS83(staff.getS83());
	existingStaff.setS84(staff.getS84());
	existingStaff.setS85(staff.getS85());
	existingStaff.setS86(staff.getS86());
	existingStaff.setS87(staff.getS87());
	existingStaff.setS88(staff.getS88());
	existingStaff.setS89(staff.getS89());
	existingStaff.setS90(staff.getS90());
	existingStaff.setS91(staff.getS91());
	existingStaff.setS92(staff.getS92());
	existingStaff.setS93(staff.getS93());
	existingStaff.setS94(staff.getS94());
	existingStaff.setS95(staff.getS95());
	existingStaff.setS96(staff.getS96());
	existingStaff.setS97(staff.getS97());
	existingStaff.setS98(staff.getS98());
	existingStaff.setS99(staff.getS99());
	existingStaff.setS100(staff.getS100());
	existingStaff.setS101(staff.getS101());
	existingStaff.setS102(staff.getS102());
	existingStaff.setS103(staff.getS103());
	existingStaff.setS104(staff.getS104());
	existingStaff.setS105(staff.getS105());
	existingStaff.setS106(staff.getS106());
	existingStaff.setS107(staff.getS107());
	existingStaff.setS108(staff.getS108());
	existingStaff.setS109(staff.getS109());
	existingStaff.setS110(staff.getS110());
	existingStaff.setS111(staff.getS111());
	existingStaff.setS112(staff.getS112());
	existingStaff.setS113(staff.getS113());
	existingStaff.setS114(staff.getS114());
	existingStaff.setS115(staff.getS115());
	existingStaff.setS116(staff.getS116());
	existingStaff.setS117(staff.getS117());
	existingStaff.setS118(staff.getS118());
	existingStaff.setS119(staff.getS119());
	existingStaff.setS120(staff.getS120());
	existingStaff.setS121(staff.getS121());
	existingStaff.setS122(staff.getS122());
	existingStaff.setS123(staff.getS123());
	existingStaff.setS124(staff.getS124());
	existingStaff.setS125(staff.getS125());
	existingStaff.setS126(staff.getS126());
	existingStaff.setS127(staff.getS127());
	existingStaff.setS128(staff.getS128());
	existingStaff.setS129(staff.getS129());
	existingStaff.setS130(staff.getS130());
	existingStaff.setS131(staff.getS131());
	existingStaff.setS132(staff.getS132());
	existingStaff.setS133(staff.getS133());
	existingStaff.setS134(staff.getS134());
	existingStaff.setS135(staff.getS135());
	existingStaff.setS136(staff.getS136());
	existingStaff.setS137(staff.getS137());
	existingStaff.setS138(staff.getS138());
	existingStaff.setS139(staff.getS139());
	existingStaff.setS140(staff.getS140());
	existingStaff.setS141(staff.getS141());
	existingStaff.setS142(staff.getS142());
	existingStaff.setS143(staff.getS143());
	existingStaff.setS144(staff.getS144());
	existingStaff.setS145(staff.getS145());
	existingStaff.setS146(staff.getS146());
	existingStaff.setS147(staff.getS147());
	existingStaff.setS148(staff.getS148());
	existingStaff.setS149(staff.getS149());
	existingStaff.setS150(staff.getS150());
	existingStaff.setS151(staff.getS151());
	existingStaff.setS152(staff.getS152());
	existingStaff.setS153(staff.getS153());
	existingStaff.setS154(staff.getS154());
	existingStaff.setS155(staff.getS155());
	existingStaff.setS156(staff.getS156());
	existingStaff.setS157(staff.getS157());
	existingStaff.setS158(staff.getS158());
	existingStaff.setS159(staff.getS159());
	existingStaff.setS160(staff.getS160());
	existingStaff.setS161(staff.getS161());
	existingStaff.setS162(staff.getS162());
	existingStaff.setS163(staff.getS163());
	existingStaff.setS164(staff.getS164());
	existingStaff.setS165(staff.getS165());
	existingStaff.setS166(staff.getS166());
	existingStaff.setS167(staff.getS167());
	existingStaff.setS168(staff.getS168());
	existingStaff.setS169(staff.getS169());
	existingStaff.setS170(staff.getS170());
	existingStaff.setS171(staff.getS171());
	existingStaff.setS172(staff.getS172());
	existingStaff.setS173(staff.getS173());
	existingStaff.setS174(staff.getS174());
	existingStaff.setS175(staff.getS175());
	existingStaff.setS176(staff.getS176());
	existingStaff.setS177(staff.getS177());
	existingStaff.setS178(staff.getS178());
	existingStaff.setS179(staff.getS179());
	existingStaff.setS180(staff.getS180());
	existingStaff.setS181(staff.getS181());
	existingStaff.setS182(staff.getS182());
	existingStaff.setS183(staff.getS183());
	existingStaff.setS184(staff.getS184());
	existingStaff.setS185(staff.getS185());
	existingStaff.setS186(staff.getS186());
	existingStaff.setS187(staff.getS187());
	existingStaff.setS188(staff.getS188());
	existingStaff.setS189(staff.getS189());
	existingStaff.setS190(staff.getS190());
	existingStaff.setS191(staff.getS191());
	existingStaff.setS192(staff.getS192());
	existingStaff.setS193(staff.getS193());
	existingStaff.setS194(staff.getS194());
	existingStaff.setS195(staff.getS195());
	existingStaff.setS196(staff.getS196());
	existingStaff.setS197(staff.getS197());
	existingStaff.setS198(staff.getS198());
	existingStaff.setS199(staff.getS199());
	existingStaff.setS200(staff.getS200());
	existingStaff.setS201(staff.getS201());
	existingStaff.setS202(staff.getS202());
	existingStaff.setS203(staff.getS203());
	existingStaff.setS204(staff.getS204());
	existingStaff.setS205(staff.getS205());
	existingStaff.setS206(staff.getS206());
	existingStaff.setS207(staff.getS207());
	existingStaff.setS208(staff.getS208());
	existingStaff.setS209(staff.getS209());
	existingStaff.setS210(staff.getS210());
	existingStaff.setS211(staff.getS211());
	existingStaff.setS212(staff.getS212());
	existingStaff.setS213(staff.getS213());
	existingStaff.setS214(staff.getS214());
	existingStaff.setS215(staff.getS215());
	existingStaff.setS216(staff.getS216());
	existingStaff.setS217(staff.getS217());
	existingStaff.setS218(staff.getS218());
	existingStaff.setS219(staff.getS219());
	existingStaff.setS220(staff.getS220());
	existingStaff.setS221(staff.getS221());
	existingStaff.setS222(staff.getS222());
	existingStaff.setS223(staff.getS223());
	existingStaff.setS224(staff.getS224());
	existingStaff.setS225(staff.getS225());
	existingStaff.setS226(staff.getS226());
	existingStaff.setS227(staff.getS227());
	existingStaff.setS228(staff.getS228());
	existingStaff.setS229(staff.getS229());
	existingStaff.setS230(staff.getS230());
	existingStaff.setS231(staff.getS231());
	existingStaff.setS232(staff.getS232());
	existingStaff.setS233(staff.getS233());
	existingStaff.setS234(staff.getS234());
	existingStaff.setS235(staff.getS235());
	existingStaff.setS236(staff.getS236());
	existingStaff.setS237(staff.getS237());
	existingStaff.setS238(staff.getS238());
	existingStaff.setS239(staff.getS239());
	existingStaff.setS240(staff.getS240());
	existingStaff.setS241(staff.getS241());
	existingStaff.setS242(staff.getS242());
	existingStaff.setS243(staff.getS243());
	existingStaff.setS244(staff.getS244());
	existingStaff.setS245(staff.getS245());
	existingStaff.setS246(staff.getS246());
	existingStaff.setS247(staff.getS247());
	existingStaff.setS248(staff.getS248());
	existingStaff.setS249(staff.getS249());
	existingStaff.setS250(staff.getS250());
	existingStaff.setS251(staff.getS251());
	existingStaff.setS252(staff.getS252());
	existingStaff.setS253(staff.getS253());
	
	
	
	
	//save updated staff object 
	staffService.updateStaff(existingStaff);
	return "redirect:/usersstaffs";
}

// handler method to handle delete staff request

 @RequestMapping(value = {"/usersstaffs/{id}"}, method = RequestMethod.GET)
	public String Staff(@PathVariable Long id) {
	staffService.deleteStaffById(id);
	return "redirect:/usersstaffs";
 }
 
 
 
 
 
 
 
 
 
 

	
	

	@RequestMapping(value = {"/userstramat"}, method = RequestMethod.GET)
	public String listtrmat(Model model, 
	   		 @Param("keyword") String keyword) {
		 List<Maths> listMathss = mathsService.getAllMathss(keyword);
		 model.addAttribute("listMathss", listMathss);
		 model.addAttribute("keyword", keyword);
		 model.addAttribute("mathss", mathsService.getAll());
		return "users/trackmat";
	}
	





@RequestMapping(value = {"/usersmaths"}, method = RequestMethod.GET)
public String listMaths(Model model,
	 @Param("keyword") String keyword) {
List<Maths> listMathss = mathsService.getAllMathss(keyword);
model.addAttribute("listMathss", listMathss);
model.addAttribute("keyword", keyword);
model.addAttribute("mathss", mathsService.getAll());
return "users/staffmat";
}



@RequestMapping(value = {"/usersmaths/new"}, method = RequestMethod.GET)
public String createmathsForm(Model model) {
Maths maths = new Maths();
model.addAttribute("maths", maths);
return "users/create_maths";
}




@RequestMapping(value = {"/usersmaths"}, method = RequestMethod.POST)
public String saveMaths(@ModelAttribute("maths") Maths maths) {
mathsService.saveMaths(maths);
	return "redirect:/usersmaths?keyword=Type in the Requisition ID";
}




@RequestMapping(value = {"/usersmaths/edit/{id}"}, method = RequestMethod.GET)
public String editMathsForm(@PathVariable Long id, Model model) {
model.addAttribute("maths", mathsService.getMathsById(id));
return "users/edit_maths";
}



@RequestMapping(value = {"/usersmaths/{id}"}, method = RequestMethod.POST)
public String updateMaths(@PathVariable Long id, 
	@ModelAttribute("maths") Maths maths,
	Model model) {

//get members from database by id
Maths existingMaths = mathsService.getMathsById(id);
existingMaths.setId(id);
existingMaths.setRollNo(maths.getRollNo());
existingMaths.setS1(maths.getS1());
existingMaths.setS2(maths.getS2());
existingMaths.setS3(maths.getS3());
existingMaths.setS4(maths.getS4());
existingMaths.setS5(maths.getS5());


//save updated student object 
mathsService.updateMaths(existingMaths);
return "redirect:/usersmaths";
}





// handler method to handle delete member request

@RequestMapping(value = {"/usersmaths/{id}"}, method = RequestMethod.GET)
	public String deleteMaths(@PathVariable Long id) {
	mathsService.deleteMathsById(id);
	return "redirect:/usersmaths";
}






 
 
 
	 
	 
	 
	 
	 
	
	
	

	    
	    
	    
	    @RequestMapping(value = {"/uscands"}, method = RequestMethod.GET)
		 public String Evangelisms(Model model, 
		   		 @Param("keyword") String keyword) {
		   	 List<Evangelism> listEvangelisms = evangelismService.getAllEvangelisms(keyword);
		   	 model.addAttribute("listEvangelisms", listEvangelisms);
		   	 model.addAttribute("keyword", keyword);
		   	model.addAttribute("evangelisms",evangelismService.getAll());
		   	return "users/candidates";
		 }
	    
	    @RequestMapping(value = {"/usprofcands"}, method = RequestMethod.GET)
		 public String appEvangelisms(Model model, 
		   		 @Param("keyword") String keyword) {
		   	 List<Evangelism> listEvangelisms = evangelismService.getAllEvangelisms(keyword);
		   	 model.addAttribute("listEvangelisms", listEvangelisms);
		   	 model.addAttribute("keyword", keyword);
		   	model.addAttribute("evangelisms",evangelismService.getAll());
		   	return "users/approval";
		 }

		 @RequestMapping(value = {"/uscands/new"}, method = RequestMethod.GET)
		 public String createEvangelismForm(Model model) {
			 Evangelism evangelism = new Evangelism();
		 	model.addAttribute("evangelism",evangelism);
		 	return "users/create_candidate";
		 }

		 @RequestMapping(value = {"/uscands"}, method = RequestMethod.POST)
		 public String saveEvangelism(@ModelAttribute("question") Evangelism evangelism) {
			 evangelismService.saveEvangelism(evangelism);
		 return "redirect:/uscands";
		 }

		 @RequestMapping(value = {"/uscands/edit/{id}"}, method = RequestMethod.GET)
		 public String editEvangelismForm(@PathVariable Long id, Model model) {
		 model.addAttribute("evangelism", evangelismService.getEvangelismById(id));
		 return "users/edit_candidate";
		 }
		 
		 

		 @RequestMapping(value = {"/uscands2/edit/{id}"}, method = RequestMethod.GET)
		 public String editEvangelismForm2(@PathVariable Long id, Model model) {
		 model.addAttribute("evangelism", evangelismService.getEvangelismById(id));
		 return "users/edit_candidate2";
		 }
		 
		 
		 

		 @RequestMapping(value = {"/uscands3/edit/{id}"}, method = RequestMethod.GET)
		 public String editEvangelismForm3(@PathVariable Long id, Model model) {
		 model.addAttribute("evangelism", evangelismService.getEvangelismById(id));
		 return "users/edit_candidate3";
		 }
		 
		 
		 
		 

		 @RequestMapping(value = {"/uscands4/edit/{id}"}, method = RequestMethod.GET)
		 public String editEvangelismForm4(@PathVariable Long id, Model model) {
		 model.addAttribute("evangelism", evangelismService.getEvangelismById(id));
		 return "users/edit_candidate4";
		 }
		 
		 
		 
		 @RequestMapping(value = {"/uscands/{id}"}, method = RequestMethod.POST)
		 public String updateEvangelism(@PathVariable Long id, 
		 	@ModelAttribute("evangelism") Evangelism evangelism,
		 	Model model) {

		 //get RESULT from database by id
			 Evangelism existingEvangelism = evangelismService.getEvangelismById(id);
		 existingEvangelism.setId(id);
		 existingEvangelism.setRollNo(evangelism.getRollNo());
		 existingEvangelism.setS1(evangelism.getS1());
		 existingEvangelism.setS2(evangelism.getS2());
		 existingEvangelism.setS3(evangelism.getS3());
		 existingEvangelism.setS4(evangelism.getS4());
		 existingEvangelism.setS5(evangelism.getS5());
		 existingEvangelism.setS6(evangelism.getS6());
		 existingEvangelism.setS7(evangelism.getS7());
		 existingEvangelism.setS8(evangelism.getS8());
		 existingEvangelism.setS9(evangelism.getS9());
		 existingEvangelism.setS10(evangelism.getS10());
		 existingEvangelism.setS11(evangelism.getS11());
		 existingEvangelism.setS12(evangelism.getS12());
		 existingEvangelism.setS13(evangelism.getS13());
		 existingEvangelism.setS14(evangelism.getS14());
		 existingEvangelism.setS15(evangelism.getS15());
		 existingEvangelism.setS16(evangelism.getS16());
	        existingEvangelism.setS17(evangelism.getS17());
	        existingEvangelism.setS18(evangelism.getS18());
	        existingEvangelism.setS19(evangelism.getS19());
	        existingEvangelism.setS20(evangelism.getS20());
	        existingEvangelism.setS21(evangelism.getS21());
	        existingEvangelism.setS22(evangelism.getS22());
	        existingEvangelism.setS23(evangelism.getS23());
	        existingEvangelism.setS24(evangelism.getS24());
	        existingEvangelism.setS25(evangelism.getS25());
	        existingEvangelism.setS26(evangelism.getS26());
	        existingEvangelism.setS27(evangelism.getS27());
	        existingEvangelism.setS28(evangelism.getS28());
	        existingEvangelism.setS29(evangelism.getS29());
	        existingEvangelism.setS30(evangelism.getS30());
	        existingEvangelism.setS31(evangelism.getS31());
	        existingEvangelism.setS32(evangelism.getS32());
	        existingEvangelism.setS33(evangelism.getS33());
	        existingEvangelism.setS34(evangelism.getS34());
	        existingEvangelism.setS35(evangelism.getS35());
	        existingEvangelism.setS36(evangelism.getS36());
	        existingEvangelism.setS37(evangelism.getS37());
	        existingEvangelism.setS38(evangelism.getS38());
	        existingEvangelism.setS39(evangelism.getS39());
	        existingEvangelism.setS40(evangelism.getS40());
	        existingEvangelism.setS41(evangelism.getS41());
	        existingEvangelism.setS42(evangelism.getS42());
	        existingEvangelism.setS43(evangelism.getS43());
	        existingEvangelism.setS44(evangelism.getS44());
	        existingEvangelism.setS45(evangelism.getS45());
	        existingEvangelism.setS46(evangelism.getS46());
	        existingEvangelism.setS47(evangelism.getS47());
	        existingEvangelism.setS48(evangelism.getS48());
	        existingEvangelism.setS49(evangelism.getS49());
	        existingEvangelism.setS50(evangelism.getS50());
	        existingEvangelism.setS51(evangelism.getS51());
	        existingEvangelism.setS52(evangelism.getS52());
	        existingEvangelism.setS53(evangelism.getS53());
	        existingEvangelism.setS54(evangelism.getS54());
	        existingEvangelism.setS55(evangelism.getS55());
	        existingEvangelism.setS56(evangelism.getS56());
	        existingEvangelism.setS57(evangelism.getS57());
	        existingEvangelism.setS58(evangelism.getS58());
	        existingEvangelism.setS59(evangelism.getS59());
	        existingEvangelism.setS60(evangelism.getS60());
	        existingEvangelism.setS61(evangelism.getS61());
	        existingEvangelism.setS62(evangelism.getS62());
	        existingEvangelism.setS63(evangelism.getS63());
	        existingEvangelism.setS64(evangelism.getS64());
	        existingEvangelism.setS65(evangelism.getS65());
	        existingEvangelism.setS66(evangelism.getS66());
	        existingEvangelism.setS67(evangelism.getS67());
	        existingEvangelism.setS68(evangelism.getS68());
	        existingEvangelism.setS69(evangelism.getS69());
	        existingEvangelism.setS70(evangelism.getS70());
	        existingEvangelism.setS71(evangelism.getS71());
	        existingEvangelism.setS72(evangelism.getS72());
	        existingEvangelism.setS73(evangelism.getS73());
	        existingEvangelism.setS74(evangelism.getS74());
	        existingEvangelism.setS75(evangelism.getS75());
	        existingEvangelism.setS76(evangelism.getS76());
	        existingEvangelism.setS77(evangelism.getS77());
	        existingEvangelism.setS78(evangelism.getS78());
	        existingEvangelism.setS79(evangelism.getS79());
	        existingEvangelism.setS80(evangelism.getS80());
	        existingEvangelism.setS81(evangelism.getS81());
	        existingEvangelism.setS82(evangelism.getS82());
	        existingEvangelism.setS83(evangelism.getS83());
	        existingEvangelism.setS84(evangelism.getS84());
	        existingEvangelism.setS85(evangelism.getS85());
	        existingEvangelism.setS86(evangelism.getS86());
	        existingEvangelism.setS87(evangelism.getS87());
	        existingEvangelism.setS88(evangelism.getS88());
	        existingEvangelism.setS89(evangelism.getS89());
	        existingEvangelism.setS90(evangelism.getS90());
	        existingEvangelism.setS91(evangelism.getS91());
	        existingEvangelism.setS92(evangelism.getS92());
	        existingEvangelism.setS93(evangelism.getS93());
	        existingEvangelism.setS94(evangelism.getS94());
	        existingEvangelism.setS95(evangelism.getS95());
	        existingEvangelism.setS96(evangelism.getS96());
	        existingEvangelism.setS97(evangelism.getS97());
	        existingEvangelism.setS98(evangelism.getS98());
	        existingEvangelism.setS99(evangelism.getS99());
	        existingEvangelism.setS100(evangelism.getS100());
	        existingEvangelism.setS101(evangelism.getS101());
	        existingEvangelism.setS102(evangelism.getS102());
	        existingEvangelism.setS103(evangelism.getS103());
	        existingEvangelism.setS104(evangelism.getS104());
	        existingEvangelism.setS105(evangelism.getS105());
	        existingEvangelism.setS106(evangelism.getS106());

		 
		 
		 //save updated maths object 
		 evangelismService.updateEvangelism(existingEvangelism);
		 return "redirect:/uscands";
		 }

		 //handler method to handle delete maths request

		 @RequestMapping(value = {"/uscands/{id}"}, method = RequestMethod.GET)
		 public String Evangelism(@PathVariable Long id) {
			 evangelismService.deleteEvangelismById(id);
		 return "redirect:/uscands";
		 }
		 
		 
		 
		 
		 
		 
		 

		    @RequestMapping(value = {"/phys"}, method = RequestMethod.GET)
			 public String appEvangelismp(Model model, 
			   		 @Param("keyword") String keyword) {
			   	 List<Evangelismp> listEvangelismps = evangelismpService.getAllEvangelismps(keyword);
			   	 model.addAttribute("listEvangelismps", listEvangelismps);
			   	 model.addAttribute("keyword", keyword);
			   	model.addAttribute("evangelismps",evangelismpService.getAll());
			   	return "users/week";
			 }

			 @RequestMapping(value = {"/phys/new"}, method = RequestMethod.GET)
			 public String createEvangelismpForm(Model model) {
				 Evangelismp evangelismp = new Evangelismp();
			 	model.addAttribute("evangelismp",evangelismp);
			 	return "users/phys/create_week";
			 }
			 
			

			 @RequestMapping(value = {"/phys"}, method = RequestMethod.POST)
			 public String saveEvangelismp(@ModelAttribute("question") Evangelismp evangelismp) {
				 evangelismpService.saveEvangelismp(evangelismp);
			 return "redirect:/phys";
			 }

			 @RequestMapping(value = {"/phys/edit/{id}"}, method = RequestMethod.GET)
			 public String editEvangelismpForm(@PathVariable Long id, Model model) {
			 model.addAttribute("evangelismp", evangelismpService.getEvangelismpById(id));
			 return "users/edit_week";
			 }
			 
			 
			 
			 
			 
			 
			 @RequestMapping(value = {"/phys2/edit/{id}"}, method = RequestMethod.GET)
			 public String editEvangelismpForm2(@PathVariable Long id, Model model) {
			 model.addAttribute("evangelismp", evangelismpService.getEvangelismpById(id));
			 return "users/edit_week2";
			 }
			 
			 

			 @RequestMapping(value = {"/phys3/edit/{id}"}, method = RequestMethod.GET)
			 public String editEvangelismpForm3(@PathVariable Long id, Model model) {
			 model.addAttribute("evangelismp", evangelismpService.getEvangelismpById(id));
			 return "users/edit_week3";
			 }
			 
			 
			 
			 @RequestMapping(value = {"/phys/{id}"}, method = RequestMethod.POST)
			 public String updateEvangelismp(@PathVariable Long id, 
			 	@ModelAttribute("evangelismp") Evangelismp evangelismp,
			 	Model model) {

			 //get RESULT from database by id
				 Evangelismp existingEvangelismp = evangelismpService.getEvangelismpById(id);
			 existingEvangelismp.setId(id);
			 existingEvangelismp.setRollNo(evangelismp.getRollNo());
			 existingEvangelismp.setS1(evangelismp.getS1());
			 existingEvangelismp.setS2(evangelismp.getS2());
			 existingEvangelismp.setS3(evangelismp.getS3());
			 existingEvangelismp.setS4(evangelismp.getS4());
			 existingEvangelismp.setS5(evangelismp.getS5());
			 existingEvangelismp.setS6(evangelismp.getS6());
			 existingEvangelismp.setS7(evangelismp.getS7());
			 existingEvangelismp.setS8(evangelismp.getS8());
			 existingEvangelismp.setS9(evangelismp.getS9());
			 existingEvangelismp.setS10(evangelismp.getS10());
			 existingEvangelismp.setS11(evangelismp.getS11());
			 existingEvangelismp.setS12(evangelismp.getS12());
			 existingEvangelismp.setS13(evangelismp.getS13());
			 existingEvangelismp.setS14(evangelismp.getS14());
			 existingEvangelismp.setS15(evangelismp.getS15());
			 existingEvangelismp.setS16(evangelismp.getS16());
		        existingEvangelismp.setS17(evangelismp.getS17());
		        existingEvangelismp.setS18(evangelismp.getS18());
		        existingEvangelismp.setS19(evangelismp.getS19());
		        existingEvangelismp.setS20(evangelismp.getS20());
		        existingEvangelismp.setS21(evangelismp.getS21());
		        existingEvangelismp.setS22(evangelismp.getS22());
		        existingEvangelismp.setS23(evangelismp.getS23());
		        existingEvangelismp.setS24(evangelismp.getS24());
		        existingEvangelismp.setS25(evangelismp.getS25());
		        existingEvangelismp.setS26(evangelismp.getS26());
		        existingEvangelismp.setS27(evangelismp.getS27());
		        existingEvangelismp.setS28(evangelismp.getS28());
		        existingEvangelismp.setS29(evangelismp.getS29());
		        existingEvangelismp.setS30(evangelismp.getS30());
		        existingEvangelismp.setS31(evangelismp.getS31());
		        existingEvangelismp.setS32(evangelismp.getS32());
		        existingEvangelismp.setS33(evangelismp.getS33());
		        existingEvangelismp.setS34(evangelismp.getS34());
		        existingEvangelismp.setS35(evangelismp.getS35());
		        existingEvangelismp.setS36(evangelismp.getS36());
		        existingEvangelismp.setS37(evangelismp.getS37());
		        existingEvangelismp.setS38(evangelismp.getS38());
		        existingEvangelismp.setS39(evangelismp.getS39());
		        existingEvangelismp.setS40(evangelismp.getS40());
		        existingEvangelismp.setS41(evangelismp.getS41());
		        existingEvangelismp.setS42(evangelismp.getS42());
		        existingEvangelismp.setS43(evangelismp.getS43());
		        existingEvangelismp.setS44(evangelismp.getS44());
		        existingEvangelismp.setS45(evangelismp.getS45());
		        existingEvangelismp.setS46(evangelismp.getS46());
		        existingEvangelismp.setS47(evangelismp.getS47());
		        existingEvangelismp.setS48(evangelismp.getS48());
		        existingEvangelismp.setS49(evangelismp.getS49());
		        existingEvangelismp.setS50(evangelismp.getS50());
		        existingEvangelismp.setS51(evangelismp.getS51());
		        existingEvangelismp.setS52(evangelismp.getS52());
		        existingEvangelismp.setS53(evangelismp.getS53());
		        existingEvangelismp.setS54(evangelismp.getS54());
		        existingEvangelismp.setS55(evangelismp.getS55());
		        existingEvangelismp.setS56(evangelismp.getS56());
		        existingEvangelismp.setS57(evangelismp.getS57());
		        existingEvangelismp.setS58(evangelismp.getS58());
		        existingEvangelismp.setS59(evangelismp.getS59());
		        existingEvangelismp.setS60(evangelismp.getS60());
		        existingEvangelismp.setS61(evangelismp.getS61());
		        existingEvangelismp.setS62(evangelismp.getS62());
		        existingEvangelismp.setS63(evangelismp.getS63());
		        existingEvangelismp.setS64(evangelismp.getS64());
		        existingEvangelismp.setS65(evangelismp.getS65());
		        existingEvangelismp.setS66(evangelismp.getS66());
		        existingEvangelismp.setS67(evangelismp.getS67());
		        existingEvangelismp.setS68(evangelismp.getS68());
		        existingEvangelismp.setS69(evangelismp.getS69());
		        existingEvangelismp.setS70(evangelismp.getS70());
		        existingEvangelismp.setS71(evangelismp.getS71());
		        existingEvangelismp.setS72(evangelismp.getS72());
		        existingEvangelismp.setS73(evangelismp.getS73());
		        existingEvangelismp.setS74(evangelismp.getS74());
		        existingEvangelismp.setS75(evangelismp.getS75());
		        existingEvangelismp.setS76(evangelismp.getS76());
		        existingEvangelismp.setS77(evangelismp.getS77());
		        existingEvangelismp.setS78(evangelismp.getS78());
		        existingEvangelismp.setS79(evangelismp.getS79());
		        existingEvangelismp.setS80(evangelismp.getS80());
		        existingEvangelismp.setS81(evangelismp.getS81());
		        existingEvangelismp.setS82(evangelismp.getS82());
		        existingEvangelismp.setS83(evangelismp.getS83());
		        existingEvangelismp.setS84(evangelismp.getS84());
		        existingEvangelismp.setS85(evangelismp.getS85());
		        existingEvangelismp.setS86(evangelismp.getS86());
		        existingEvangelismp.setS87(evangelismp.getS87());
		        existingEvangelismp.setS88(evangelismp.getS88());
		        existingEvangelismp.setS89(evangelismp.getS89());
		        existingEvangelismp.setS90(evangelismp.getS90());
		        existingEvangelismp.setS91(evangelismp.getS91());
		        existingEvangelismp.setS92(evangelismp.getS92());
		        existingEvangelismp.setS93(evangelismp.getS93());
		        existingEvangelismp.setS94(evangelismp.getS94());
		        existingEvangelismp.setS95(evangelismp.getS95());
		        existingEvangelismp.setS96(evangelismp.getS96());
		        existingEvangelismp.setS97(evangelismp.getS97());
		        existingEvangelismp.setS98(evangelismp.getS98());
		        existingEvangelismp.setS99(evangelismp.getS99());
		        existingEvangelismp.setS100(evangelismp.getS100());
		        existingEvangelismp.setS101(evangelismp.getS101());
		        existingEvangelismp.setS102(evangelismp.getS102());
		        existingEvangelismp.setS103(evangelismp.getS103());
		        existingEvangelismp.setS104(evangelismp.getS104());
		        existingEvangelismp.setS105(evangelismp.getS105());
		        existingEvangelismp.setS106(evangelismp.getS106());
			 
			 
			 //save updated maths object 
			 evangelismpService.updateEvangelismp(existingEvangelismp);
			 return "redirect:/phys";
			 }

			 //handler method to handle delete maths request

			 @RequestMapping(value = {"/phys/{id}"}, method = RequestMethod.GET)
			 public String Evangelismp(@PathVariable Long id) {
				 evangelismpService.deleteEvangelismpById(id);
			 return "redirect:/phys";
			 }

		    
			 

		 
		 
		 
		 
		 
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    @RequestMapping(value = {"/stutasks"}, method = RequestMethod.GET)
		   	public String tasks(Model model, 
		   	   		 @Param("keyword") String keyword) {
		   	   	 List<Evangelismt> listEvangelismts = evangelismtService.getAllEvangelismts(keyword);
		   	   	 model.addAttribute("listEvangelismts", listEvangelismts);
		   	   	 model.addAttribute("keyword", keyword);
		   	   	model.addAttribute("evangelismts",evangelismtService.getAll());
		         	return "users/tasks";
		       }

		       @RequestMapping(value = {"/stutasks/new"}, method = RequestMethod.GET)
		       public String createtaskForm(Model model) {
		   		 Evangelismt evangelismt = new Evangelismt();
		   	 	model.addAttribute("evangelismt",evangelismt);
		   	 	return "users/create_task";
		       }

		       @RequestMapping(value = {"/stutasks"}, method = RequestMethod.POST)
		       public String savetask(@ModelAttribute("question") Evangelismt evangelismt, @Param("image") MultipartFile file){
		    	evangelismtService.saveEvangelismt(evangelismt);
		   	 return "redirect:/stutasks";
		   	 }
		       

		       @RequestMapping(value = {"/stutasks/edit/{id}"}, method = RequestMethod.GET)
		       public String edittaskForm(@PathVariable Long id, Model model) {
		   		 model.addAttribute("evangelismt", evangelismtService.getEvangelismtById(id));
		   		 return "users/edit_task";
		   		 }


		       @RequestMapping(value = {"/stutasks/{id}"}, method = RequestMethod.POST)
		       public String updatetask(@PathVariable Long id, 
		   		 	@ModelAttribute("evangelismt") Evangelismt evangelismt,
		   		 	Model model) {
		    //get RESULT from database by id
		   	 Evangelismt existingEvangelismt = evangelismtService.getEvangelismtById(id);
		    existingEvangelismt.setId(id);
		    existingEvangelismt.setRollNo(evangelismt.getRollNo());
		    existingEvangelismt.setS1(evangelismt.getS1());
		    existingEvangelismt.setS2(evangelismt.getS2());
		    existingEvangelismt.setS3(evangelismt.getS3());
		    existingEvangelismt.setS14(evangelismt.getS14());
		    existingEvangelismt.setS4(evangelismt.getS4());
		    existingEvangelismt.setS5(evangelismt.getS5());
		    existingEvangelismt.setS6(evangelismt.getS6());
		    existingEvangelismt.setS7(evangelismt.getS7());
		    existingEvangelismt.setS8(evangelismt.getS8());
		    existingEvangelismt.setS9(evangelismt.getS9());
		    existingEvangelismt.setS10(evangelismt.getS10());
		    existingEvangelismt.setS11(evangelismt.getS11());
		    existingEvangelismt.setS12(evangelismt.getS12());
		    existingEvangelismt.setS13(evangelismt.getS13());
		    existingEvangelismt.setS14(evangelismt.getS14());
		    existingEvangelismt.setS15(evangelismt.getS15());
			 existingEvangelismt.setS16(evangelismt.getS16());
		        existingEvangelismt.setS17(evangelismt.getS17());
		        existingEvangelismt.setS18(evangelismt.getS18());
		        existingEvangelismt.setS19(evangelismt.getS19());
		        existingEvangelismt.setS20(evangelismt.getS20());
		        existingEvangelismt.setS21(evangelismt.getS21());
		        existingEvangelismt.setS22(evangelismt.getS22());
		        existingEvangelismt.setS23(evangelismt.getS23());
		        existingEvangelismt.setS26(evangelismt.getS27());
		        existingEvangelismt.setS28(evangelismt.getS28());
		        existingEvangelismt.setS29(evangelismt.getS29());
		        existingEvangelismt.setS30(evangelismt.getS30());
		        existingEvangelismt.setS31(evangelismt.getS31());
		        existingEvangelismt.setS32(evangelismt.getS32());
		        existingEvangelismt.setS33(evangelismt.getS33());
		        existingEvangelismt.setS34(evangelismt.getS34());
		        existingEvangelismt.setS35(evangelismt.getS35());
		        existingEvangelismt.setS36(evangelismt.getS36());
		        existingEvangelismt.setS37(evangelismt.getS37());
		        existingEvangelismt.setS38(evangelismt.getS38());
		        existingEvangelismt.setS39(evangelismt.getS39());
		        existingEvangelismt.setS40(evangelismt.getS40());
		        existingEvangelismt.setS41(evangelismt.getS41());
		        existingEvangelismt.setS42(evangelismt.getS42());
		        existingEvangelismt.setS43(evangelismt.getS43());
		        existingEvangelismt.setS44(evangelismt.getS44());
		        existingEvangelismt.setS45(evangelismt.getS45());
		        existingEvangelismt.setS46(evangelismt.getS46());
		        existingEvangelismt.setS47(evangelismt.getS47());
		        existingEvangelismt.setS48(evangelismt.getS48());
		        existingEvangelismt.setS49(evangelismt.getS49());
		        existingEvangelismt.setS50(evangelismt.getS50());
		        existingEvangelismt.setS51(evangelismt.getS51());
		        existingEvangelismt.setS52(evangelismt.getS52());
		        existingEvangelismt.setS53(evangelismt.getS53());
		        existingEvangelismt.setS54(evangelismt.getS54());
		        existingEvangelismt.setS55(evangelismt.getS55());
		        existingEvangelismt.setS56(evangelismt.getS56());
		        existingEvangelismt.setS57(evangelismt.getS57());
		        existingEvangelismt.setS58(evangelismt.getS58());
		        existingEvangelismt.setS59(evangelismt.getS59());
		        existingEvangelismt.setS60(evangelismt.getS60());
		        existingEvangelismt.setS61(evangelismt.getS61());
		        existingEvangelismt.setS62(evangelismt.getS62());
		        existingEvangelismt.setS63(evangelismt.getS63());
		        existingEvangelismt.setS64(evangelismt.getS64());
		        existingEvangelismt.setS65(evangelismt.getS65());
		        existingEvangelismt.setS66(evangelismt.getS66());
		        existingEvangelismt.setS67(evangelismt.getS67());
		        existingEvangelismt.setS68(evangelismt.getS68());
		        existingEvangelismt.setS69(evangelismt.getS69());
		        existingEvangelismt.setS70(evangelismt.getS70());
		        existingEvangelismt.setS71(evangelismt.getS71());
		        existingEvangelismt.setS72(evangelismt.getS72());
		        existingEvangelismt.setS73(evangelismt.getS73());
		        existingEvangelismt.setS74(evangelismt.getS74());
		        existingEvangelismt.setS75(evangelismt.getS75());
		        existingEvangelismt.setS76(evangelismt.getS76());
		        existingEvangelismt.setS77(evangelismt.getS77());
		        existingEvangelismt.setS78(evangelismt.getS78());
		        existingEvangelismt.setS79(evangelismt.getS79());
		        existingEvangelismt.setS80(evangelismt.getS80());
		        existingEvangelismt.setS81(evangelismt.getS81());
		        existingEvangelismt.setS82(evangelismt.getS82());
		        existingEvangelismt.setS83(evangelismt.getS83());
		        existingEvangelismt.setS84(evangelismt.getS84());
		        existingEvangelismt.setS85(evangelismt.getS85());
		        existingEvangelismt.setS86(evangelismt.getS86());
		        existingEvangelismt.setS87(evangelismt.getS87());
		        existingEvangelismt.setS88(evangelismt.getS88());
		        existingEvangelismt.setS89(evangelismt.getS89());
		        existingEvangelismt.setS90(evangelismt.getS90());
		        existingEvangelismt.setS91(evangelismt.getS91());
		        existingEvangelismt.setS92(evangelismt.getS92());
		        existingEvangelismt.setS93(evangelismt.getS93());
		        existingEvangelismt.setS94(evangelismt.getS94());
		        existingEvangelismt.setS95(evangelismt.getS95());
		        existingEvangelismt.setS96(evangelismt.getS96());
		        existingEvangelismt.setS97(evangelismt.getS97());
		        existingEvangelismt.setS98(evangelismt.getS98());
		        existingEvangelismt.setS99(evangelismt.getS99());
		        existingEvangelismt.setS100(evangelismt.getS100());
		        existingEvangelismt.setS101(evangelismt.getS101());
		        existingEvangelismt.setS102(evangelismt.getS102());
		        existingEvangelismt.setS103(evangelismt.getS103());
		        existingEvangelismt.setS104(evangelismt.getS104());
		        existingEvangelismt.setS105(evangelismt.getS105());
		        existingEvangelismt.setS106(evangelismt.getS106());




		    //save updated maths object 
		    evangelismtService.updateEvangelismt(existingEvangelismt);
		       return "redirect:/stutasks";
		       }

		       //handler method to handle delete maths request

		       @RequestMapping(value = {"/stutasks/{id}"}, method = RequestMethod.GET)
		       public String task(@PathVariable Long id) {
		   		 evangelismtService.deleteEvangelismtById(id);
		   	 return "redirect:/stutasks";
		       }
		       
		       
		       
		       
		       
		       
		       
		       
		       
		       
		       
		       
		       

		       @RequestMapping(value = {"/usposres"}, method = RequestMethod.GET)
		     	public String stposrestasks(Model model, 
		     	   		 @Param("keyword") String keyword) {
		     	   	 List<Evangelisms> listEvangelismss = evangelismsService.getAllEvangelismss(keyword);
		     	   	 model.addAttribute("listEvangelismss", listEvangelismss);
		     	   	 model.addAttribute("keyword", keyword);
		     	   	model.addAttribute("evangelismss",evangelismsService.getAll());
		           	return "users/posres";
		         }
		       
		       
		       
		       
		       
		       
		       @RequestMapping(value = {"/uspos"}, method = RequestMethod.GET)
		      	public String postasks(Model model, 
		      	   		 @Param("keyword") String keyword) {
		      	   	 List<Evangelisms> listEvangelismss = evangelismsService.getAllEvangelismss(keyword);
		      	   	 model.addAttribute("listEvangelismss", listEvangelismss);
		      	   	 model.addAttribute("keyword", keyword);
		      	   	model.addAttribute("evangelismss",evangelismsService.getAll());
		            	return "users/pos";
		          }

		          @RequestMapping(value = {"/uspos/new"}, method = RequestMethod.GET)
		          public String poscreatetaskForm(Model model) {
		      		 Evangelisms evangelisms = new Evangelisms();
		      	 	model.addAttribute("evangelisms",evangelisms);
		      	 	return "users/create_pos";
		          }

		          @RequestMapping(value = {"/uspos"}, method = RequestMethod.POST)
		          public String possavetask(@ModelAttribute("questiont") Evangelisms evangelisms) {
		      		 evangelismsService.saveEvangelisms(evangelisms);
		      	 return "redirect:/uspos";
		      	 }
		          

		          @RequestMapping(value = {"/uspos/edit/{id}"}, method = RequestMethod.GET)
		          public String posedittaskForm(@PathVariable Long id, Model model) {
		      		 model.addAttribute("evangelisms", evangelismsService.getEvangelismsById(id));
		      		 return "users/edit_pos";
		      		 }


		          @RequestMapping(value = {"/uspos/{id}"}, method = RequestMethod.POST)
		          public String posupdatetask(@PathVariable Long id, 
		      		 	@ModelAttribute("evangelisms") Evangelisms evangelisms,
		      		 	Model model) {
		       //get RESULT from database by id
		      	 Evangelisms existingEvangelisms = evangelismsService.getEvangelismsById(id);
		      	existingEvangelisms.setId(id);
		        existingEvangelisms.setRollNo(evangelisms.getRollNo());
		        existingEvangelisms.setS1(evangelisms.getS1());
		        existingEvangelisms.setS2(evangelisms.getS2());
		        existingEvangelisms.setS3(evangelisms.getS3());
		        existingEvangelisms.setS4(evangelisms.getS4());
		        existingEvangelisms.setS5(evangelisms.getS5());
		        existingEvangelisms.setS6(evangelisms.getS6());
		        existingEvangelisms.setS7(evangelisms.getS7());
		        existingEvangelisms.setS8(evangelisms.getS8());
		        existingEvangelisms.setS9(evangelisms.getS9());
		        existingEvangelisms.setS10(evangelisms.getS10());
		        existingEvangelisms.setS11(evangelisms.getS11());
		        existingEvangelisms.setS12(evangelisms.getS12());
		        existingEvangelisms.setS13(evangelisms.getS13());
		        existingEvangelisms.setS14(evangelisms.getS14());
		        existingEvangelisms.setS15(evangelisms.getS15());
		        existingEvangelisms.setS16(evangelisms.getS16());
		        existingEvangelisms.setS17(evangelisms.getS17());
		        existingEvangelisms.setS18(evangelisms.getS18());
		        existingEvangelisms.setS19(evangelisms.getS19());
		        existingEvangelisms.setS20(evangelisms.getS20());
		        existingEvangelisms.setS21(evangelisms.getS21());
		        existingEvangelisms.setS22(evangelisms.getS22());
		        existingEvangelisms.setS23(evangelisms.getS23());
		        existingEvangelisms.setS24(evangelisms.getS24());
		        existingEvangelisms.setS25(evangelisms.getS25());
		        existingEvangelisms.setS26(evangelisms.getS26());
		        existingEvangelisms.setS27(evangelisms.getS27());
		        existingEvangelisms.setS28(evangelisms.getS28());
		        existingEvangelisms.setS29(evangelisms.getS29());
		        existingEvangelisms.setS30(evangelisms.getS30());
		        existingEvangelisms.setS31(evangelisms.getS31());
		        existingEvangelisms.setS32(evangelisms.getS32());
		        existingEvangelisms.setS33(evangelisms.getS33());
		        existingEvangelisms.setS34(evangelisms.getS34());
		        existingEvangelisms.setS35(evangelisms.getS35());
		        existingEvangelisms.setS36(evangelisms.getS36());
		        existingEvangelisms.setS37(evangelisms.getS37());
		        existingEvangelisms.setS38(evangelisms.getS38());
		        existingEvangelisms.setS39(evangelisms.getS39());
		        existingEvangelisms.setS40(evangelisms.getS40());
		        existingEvangelisms.setS41(evangelisms.getS41());
		        existingEvangelisms.setS42(evangelisms.getS42());
		        existingEvangelisms.setS43(evangelisms.getS43());
		        existingEvangelisms.setS44(evangelisms.getS44());
		        existingEvangelisms.setS45(evangelisms.getS45());
		        existingEvangelisms.setS46(evangelisms.getS46());
		        existingEvangelisms.setS47(evangelisms.getS47());
		        existingEvangelisms.setS48(evangelisms.getS48());
		        existingEvangelisms.setS49(evangelisms.getS49());
		        existingEvangelisms.setS50(evangelisms.getS50());
		        existingEvangelisms.setS51(evangelisms.getS51());
		        existingEvangelisms.setS52(evangelisms.getS52());
		        existingEvangelisms.setS53(evangelisms.getS53());
		        existingEvangelisms.setS54(evangelisms.getS54());
		        existingEvangelisms.setS55(evangelisms.getS55());
		        existingEvangelisms.setS56(evangelisms.getS56());
		        existingEvangelisms.setS57(evangelisms.getS57());
		        existingEvangelisms.setS58(evangelisms.getS58());
		        existingEvangelisms.setS59(evangelisms.getS59());
		        existingEvangelisms.setS60(evangelisms.getS60());
		        existingEvangelisms.setS61(evangelisms.getS61());
		        existingEvangelisms.setS62(evangelisms.getS62());
		        existingEvangelisms.setS63(evangelisms.getS63());
		        existingEvangelisms.setS64(evangelisms.getS64());
		        existingEvangelisms.setS65(evangelisms.getS65());
		        existingEvangelisms.setS66(evangelisms.getS66());
		        existingEvangelisms.setS67(evangelisms.getS67());
		        existingEvangelisms.setS68(evangelisms.getS68());
		        existingEvangelisms.setS69(evangelisms.getS69());
		        existingEvangelisms.setS70(evangelisms.getS70());
		        existingEvangelisms.setS71(evangelisms.getS71());
		        existingEvangelisms.setS72(evangelisms.getS72());
		        existingEvangelisms.setS73(evangelisms.getS73());
		        existingEvangelisms.setS74(evangelisms.getS74());
		        existingEvangelisms.setS75(evangelisms.getS75());
		        existingEvangelisms.setS76(evangelisms.getS76());
		        existingEvangelisms.setS77(evangelisms.getS77());
		        existingEvangelisms.setS78(evangelisms.getS78());
		        existingEvangelisms.setS79(evangelisms.getS79());
		        existingEvangelisms.setS80(evangelisms.getS80());
		        existingEvangelisms.setS81(evangelisms.getS81());
		        existingEvangelisms.setS82(evangelisms.getS82());
		        existingEvangelisms.setS83(evangelisms.getS83());
		        existingEvangelisms.setS84(evangelisms.getS84());
		        existingEvangelisms.setS85(evangelisms.getS85());
		        existingEvangelisms.setS86(evangelisms.getS86());
		        existingEvangelisms.setS87(evangelisms.getS87());
		        existingEvangelisms.setS88(evangelisms.getS88());
		        existingEvangelisms.setS89(evangelisms.getS89());
		        existingEvangelisms.setS90(evangelisms.getS90());
		        existingEvangelisms.setS91(evangelisms.getS91());
		        existingEvangelisms.setS92(evangelisms.getS92());
		        existingEvangelisms.setS93(evangelisms.getS93());
		        existingEvangelisms.setS94(evangelisms.getS94());
		        existingEvangelisms.setS95(evangelisms.getS95());
		        existingEvangelisms.setS96(evangelisms.getS96());
		        existingEvangelisms.setS97(evangelisms.getS97());
		        existingEvangelisms.setS98(evangelisms.getS98());
		        existingEvangelisms.setS99(evangelisms.getS99());
		        existingEvangelisms.setS100(evangelisms.getS100());
		        existingEvangelisms.setS101(evangelisms.getS101());
		        existingEvangelisms.setS102(evangelisms.getS102());
		        existingEvangelisms.setS103(evangelisms.getS103());
		        existingEvangelisms.setS104(evangelisms.getS104());
		        existingEvangelisms.setS105(evangelisms.getS105());
		        existingEvangelisms.setS106(evangelisms.getS106());



		       //save updated maths object 
		       evangelismsService.updateEvangelisms(existingEvangelisms);
		          return "redirect:/uspos";
		          }

		          //handler method to handle delete maths request

		          @RequestMapping(value = {"/uspos/{id}"}, method = RequestMethod.GET)
		          public String postask(@PathVariable Long id) {
		      		 evangelismsService.deleteEvangelismsById(id);
		      	 return "redirect:/uspos";
		          }
		          
		          
		          

	    
	
	
	
	
	
	
	
	
}
