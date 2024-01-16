package com.opes.controller;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.opes.model.Maths;
import com.opes.model.Member;
import com.opes.model.Question;
import com.opes.service.MathsService;
import com.opes.service.MemberService;
import com.opes.service.QuestionService;
import com.opes.model.Staff;
import com.opes.service.StaffService;

@Controller
public class AdminController {

    @RequestMapping(value = {"/admin/dashboard"}, method = RequestMethod.GET)
    public String adminHome(){
        return "admin/dashboard";
    }
      
        
    
    
    StaffService staffService;
    MemberService memberService;
    MathsService mathsService;
    QuestionService questionService;
    
    
    
    
	public AdminController(StaffService staffService, MemberService memberService, MathsService mathsService,
    QuestionService questionService) {
		this.staffService = staffService;	
		this.memberService = memberService;
		this.mathsService = mathsService;
		this.questionService = questionService;
	}
	
	
	
	
	
	
	
	
	
	@RequestMapping(value = {"/adminstaffs"}, method = RequestMethod.GET)
	public String listStaffs(Model model, 
	   		 @Param("keyword") String keyword) {
		 List<Staff> listStaffs = staffService.getAllStaffs(keyword);
		 model.addAttribute("listStaffs", listStaffs);
		 model.addAttribute("keyword", keyword);
		 model.addAttribute("staffs", staffService.getAll());
		return "admin/staff";
	}
	
	

	@RequestMapping(value = {"/adminrece"}, method = RequestMethod.GET)
	public String recelisttrack(Model model, 
	   		 @Param("keyword") String keyword) {
		 List<Staff> listStaffs = staffService.getAllStaffs(keyword);
		 model.addAttribute("listStaffs", listStaffs);
		 model.addAttribute("keyword", keyword);
		 model.addAttribute("staffs", staffService.getAll());
		return "admin/rece";
	}
	
	
	
	
	@RequestMapping(value = {"/admintrack"}, method = RequestMethod.GET)
	public String listtrack(Model model, 
	   		 @Param("keyword") String keyword) {
		 List<Staff> listStaffs = staffService.getAllStaffs(keyword);
		 model.addAttribute("listStaffs", listStaffs);
		 model.addAttribute("keyword", keyword);
		 model.addAttribute("staffs", staffService.getAll());
		return "admin/track";
	}
	
	
	
	@RequestMapping(value = {"/adminstaffs/new"}, method = RequestMethod.GET)
	public String createStaffForm(Model model) {
		Staff staff = new Staff();
		model.addAttribute("staff", staff);
		return "admin/create_staff";
	}
	
	
	

	@RequestMapping(value = {"/adminlocstaffs/new"}, method = RequestMethod.GET)
	public String createlocStaffForm(Model model) {
		Staff staff = new Staff();
		model.addAttribute("staff", staff);
		return "admin/location";
	}
	
	
	

 @RequestMapping(value = {"/adminstaffs"}, method = RequestMethod.POST)
public String saveStaff(@ModelAttribute("staff") Staff staff) {
	 staffService.saveStaff(staff);
	return "redirect:/adminstaffs?keyword=Type in the Requisition ID";
}

 @RequestMapping(value = {"/admintrack/edit/{id}"}, method = RequestMethod.GET)
public String editStaffForm(@PathVariable Long id, Model model) {
	model.addAttribute("staff", staffService.getStaffById(id));
	return "admin/edit_staff";
}
 
 
 

 @RequestMapping(value = {"/admintrack/{id}"}, method = RequestMethod.POST)
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
	return "redirect:/adminstaffs?keyword=Type in the Requisition ID";
}

// handler method to handle delete staff request

 @RequestMapping(value = {"/adminstaffs/{id}"}, method = RequestMethod.GET)
	public String Staff(@PathVariable Long id) {
	staffService.deleteStaffById(id);
	return "redirect:/adminstaffs?keyword=Type in the Requisition ID";
 }
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 

	@RequestMapping(value = {"/adminstamem"}, method = RequestMethod.GET)
	public String listStamem(Model model, 
	   		 @Param("keyword") String keyword) {
		 List<Member> listMembers = memberService.getAllMembers(keyword);
		 model.addAttribute("listMembers", listMembers);
		 model.addAttribute("keyword", keyword);
		 model.addAttribute("members", memberService.getAll());
		return "admin/staffmem";
	}
	
	
	

	@RequestMapping(value = {"/adminstamempp"}, method = RequestMethod.GET)
	public String listStamempp(Model model, 
	   		 @Param("keyword") String keyword) {
		 List<Member> listMembers = memberService.getAllMembers(keyword);
		 model.addAttribute("listMembers", listMembers);
		 model.addAttribute("keyword", keyword);
		 model.addAttribute("members", memberService.getAll());
		return "admin/staffmempp";
	}
	
 
 

	@RequestMapping(value = {"/admintramem"}, method = RequestMethod.GET)
	public String listtrmem(Model model, 
	   		 @Param("keyword") String keyword) {
		 List<Member> listMembers = memberService.getAllMembers(keyword);
		 model.addAttribute("listMembers", listMembers);
		 model.addAttribute("keyword", keyword);
		 model.addAttribute("members", memberService.getAll());
		return "admin/trackmem";
	}
	
 
 
 


	@RequestMapping(value = {"/members/new"}, method = RequestMethod.GET)
	public String createMemberForm(Model model) {
		Member member = new Member();
		model.addAttribute("member", member);
		return "admin/create_member";
	}
	
	

	 @RequestMapping(value = {"/adminstamem"}, method = RequestMethod.POST)
	public String saveMember(@ModelAttribute("member") Member member) {
		memberService.saveMember(member);
		return "redirect:/adminstamem";
	}
	 
	 
	 
	 
	 

	 @RequestMapping(value = {"/members/edit/{id}"}, method = RequestMethod.GET)
	public String editMemberForm(@PathVariable Long id, Model model) {
		model.addAttribute("member", memberService.getMemberById(id));
		return "admin/edit_member";
	}
	 
	 
	 
	 
	 
	 

		
	 @RequestMapping(value = {"/adminstamem/{id}"}, method = RequestMethod.POST)
	public String updateMember(@PathVariable Long id, 
			@ModelAttribute("member") Member member,
			Model model) {
		
		//get members from database by id
		Member existingMember = memberService.getMemberById(id);
		existingMember.setId(id);
		existingMember.setRollNo(member.getRollNo());
		existingMember.setS1(member.getS1());
		existingMember.setS2(member.getS2());
		existingMember.setS3(member.getS3());
		existingMember.setS4(member.getS4());
		existingMember.setS5(member.getS5());
		existingMember.setS6(member.getS6());
		existingMember.setS7(member.getS7());
		existingMember.setS8(member.getS8());
		existingMember.setS9(member.getS9());
		existingMember.setS10(member.getS10());
		existingMember.setS91(member.getS91());
		existingMember.setS92(member.getS92());
		existingMember.setS93(member.getS93());
		existingMember.setS94(member.getS94());
		existingMember.setS95(member.getS95());
		existingMember.setS96(member.getS96());
		existingMember.setS97(member.getS97());
		existingMember.setS98(member.getS98());
		existingMember.setS99(member.getS99());
		existingMember.setS100(member.getS100());
		
		
		//save updated student object 
		memberService.updateMember(existingMember);
		return "redirect:/adminstamem";
	}
	 
	 
	 
	 
	 
		// handler method to handle delete member request

		 @RequestMapping(value = {"/members/{id}"}, method = RequestMethod.GET)
			public String deleteMember(@PathVariable Long id) {
			memberService.deleteMemberById(id);
			return "redirect:/adminmembers";
		}
		 
		
	
	 
	 
	 
	 
	 
	 
	 
	 
	
	

			@RequestMapping(value = {"/admintramat"}, method = RequestMethod.GET)
			public String listtrmat(Model model, 
			   		 @Param("keyword") String keyword) {
				 List<Maths> listMathss = mathsService.getAllMathss(keyword);
				 model.addAttribute("listMathss", listMathss);
				 model.addAttribute("keyword", keyword);
				 model.addAttribute("mathss", mathsService.getAll());
				return "admin/trackmat";
			}
			
	
	
	
	
	
	@RequestMapping(value = {"/maths"}, method = RequestMethod.GET)
	public String listMaths(Model model,
			 @Param("keyword") String keyword) {
		 List<Maths> listMathss = mathsService.getAllMathss(keyword);
		 model.addAttribute("listMathss", listMathss);
		 model.addAttribute("keyword", keyword);
		 model.addAttribute("mathss", mathsService.getAll());
		return "admin/staffmat";
	}
	
	

	@RequestMapping(value = {"/maths/new"}, method = RequestMethod.GET)
	public String createmathsForm(Model model) {
		Maths maths = new Maths();
		model.addAttribute("maths", maths);
		return "admin/create_maths";
	}
	
	

	 
	 @RequestMapping(value = {"/maths"}, method = RequestMethod.POST)
		public String saveMaths(@ModelAttribute("maths") Maths maths) {
		 mathsService.saveMaths(maths);
			return "redirect:/maths?keyword=Type in the Requisition ID";
		}
		 
	
	

	 @RequestMapping(value = {"/maths/edit/{id}"}, method = RequestMethod.GET)
	public String editMathsForm(@PathVariable Long id, Model model) {
		model.addAttribute("maths", mathsService.getMathsById(id));
		return "admin/edit_maths";
	}
	 
	 
		
	 @RequestMapping(value = {"/maths/{id}"}, method = RequestMethod.POST)
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
		return "redirect:/maths";
	}
	 
	 
	 
	 
	 
		// handler method to handle delete member request

		 @RequestMapping(value = {"/maths/{id}"}, method = RequestMethod.GET)
			public String deleteMaths(@PathVariable Long id) {
			mathsService.deleteMathsById(id);
			return "redirect:/maths";
		}
		 
		
	 
	 
	 
	 
	 
	 
	 
	


			@RequestMapping(value = {"/admintraque"}, method = RequestMethod.GET)
			public String listtrque(Model model, 
			   		 @Param("keyword") String keyword) {
				 List<Question> listQuestions = questionService.getAllQuestions(keyword);
				 model.addAttribute("listQuestions", listQuestions);
				 model.addAttribute("keyword", keyword);
				 model.addAttribute("questions", questionService.getAll());
				return "admin/trackque";
			}
			
		 
	
	
	@RequestMapping(value = {"/adminquestion"}, method = RequestMethod.GET)
	public String listQuestions(Model model,
			 @Param("keyword") String keyword) {
		 List<Question> listQuestions = questionService.getAllQuestions(keyword);
		 model.addAttribute("listQuestions", listQuestions);
		 model.addAttribute("keyword", keyword);
		 model.addAttribute("questions", questionService.getAll());
		return "admin/staffque";
	}
	
	
	
	

	@RequestMapping(value = {"/question/new"}, method = RequestMethod.GET)
	public String createquestionForm(Model model) {
		Question question = new Question();
		model.addAttribute("question", question);
		return "admin/create_question";
	}
	
	
	
	

	 @RequestMapping(value = {"/adminquestion"}, method = RequestMethod.POST)
		public String savequestion(@ModelAttribute("question") Question question) {
		 questionService.saveQuestion(question);
			return "redirect:/adminquestion";
		}
		 
	 
	 
	 
	 

	 @RequestMapping(value = {"/question/edit/{id}"}, method = RequestMethod.GET)
	public String editquestionForm(@PathVariable Long id, Model model) {
		model.addAttribute("question", questionService.getQuestionById(id));
		return "admin/edit_question";
	}
	 
	 
	 
	 

	 @RequestMapping(value = {"/question/{id}"}, method = RequestMethod.POST)
	public String updatequestion(@PathVariable Long id, 
			@ModelAttribute("question") Question question,
			Model model) {
		
		//get members from database by id
		 Question existingQuestion = questionService.getQuestionById(id);
		existingQuestion.setId(id);
		existingQuestion.setRollNo(question.getRollNo());
		existingQuestion.setS1(question.getS1());
		existingQuestion.setS2(question.getS2());
		existingQuestion.setS3(question.getS3());
		existingQuestion.setS4(question.getS4());
		existingQuestion.setS5(question.getS5());
		existingQuestion.setS6(question.getS6());
		existingQuestion.setS7(question.getS7());
		existingQuestion.setS8(question.getS8());
		existingQuestion.setS9(question.getS9());
		existingQuestion.setS10(question.getS10());
		existingQuestion.setS11(question.getS11());
		existingQuestion.setS12(question.getS12());
		existingQuestion.setS13(question.getS13());
		existingQuestion.setS14(question.getS14());
		existingQuestion.setS15(question.getS15());
		existingQuestion.setS16(question.getS16());
		existingQuestion.setS17(question.getS17());
		existingQuestion.setS18(question.getS18());
		existingQuestion.setS19(question.getS19());
		existingQuestion.setS20(question.getS20());
		existingQuestion.setS21(question.getS21());
		existingQuestion.setS22(question.getS22());
		existingQuestion.setS23(question.getS23());
		existingQuestion.setS24(question.getS24());
		existingQuestion.setS25(question.getS25());
		existingQuestion.setS26(question.getS26());
		existingQuestion.setS27(question.getS27());
		existingQuestion.setS28(question.getS28());
		existingQuestion.setS29(question.getS29());
		existingQuestion.setS30(question.getS30());
		existingQuestion.setS81(question.getS81());
		existingQuestion.setS82(question.getS82());
		existingQuestion.setS83(question.getS83());
		existingQuestion.setS84(question.getS84());
		existingQuestion.setS85(question.getS85());
		existingQuestion.setS86(question.getS86());
		existingQuestion.setS87(question.getS87());
		existingQuestion.setS88(question.getS88());
		existingQuestion.setS89(question.getS89());
		existingQuestion.setS90(question.getS90());
		existingQuestion.setS91(question.getS91());
		existingQuestion.setS92(question.getS92());
		existingQuestion.setS93(question.getS93());
		existingQuestion.setS94(question.getS94());
		existingQuestion.setS95(question.getS95());
		existingQuestion.setS96(question.getS96());
		existingQuestion.setS97(question.getS97());
		existingQuestion.setS98(question.getS98());
		existingQuestion.setS99(question.getS99());
		existingQuestion.setS100(question.getS100());
		
		
		
		//save updated student object 
		questionService.updateQuestion(existingQuestion);
		return "redirect:/question";
	}
	
	 
	 
	 
	 @RequestMapping(value = {"/question/{id}"}, method = RequestMethod.GET)
		public String deletequestions(@PathVariable Long id) {
		 questionService.deleteQuestionById(id);
		return "redirect:/question";
	}
	 
	
	 
	 
	 
	 
	 
	 
	
    

}