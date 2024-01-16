package com.opes.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.opes.model.Staff;
import com.opes.service.StaffService;

import jakarta.validation.Valid;

@Controller
public class UserController {
	

	
	StaffService staffService;

	public UserController(StaffService staffService) {
		this.staffService = staffService;
	}
	
	
	
	
	


	@RequestMapping(value = {"/dashboard"}, method = RequestMethod.GET)
    public String userHome(){
        return "user/dashboard";
    }
	
	
	

	@RequestMapping(value = {"/usaboutus"}, method = RequestMethod.GET)
    public String usabout(){
        return "user/aboutus";
    }
	

	@RequestMapping(value = {"/usservices"}, method = RequestMethod.GET)
    public String uservice(){
        return "user/services";
    }
	

	@RequestMapping(value = {"/detail"}, method = RequestMethod.GET)
    public String detail(){
        return "user/detail";
    }
	
	
	
	
	
	
	
	
	
	
	@RequestMapping(value = {"/staffs"}, method = RequestMethod.GET)
	public String listStaffs(Model model, 
	   		 @Param("keyword") String keyword) {
		 List<Staff> listStaffs = staffService.getAllStaffs(keyword);
		 model.addAttribute("listStaffs", listStaffs);
		 model.addAttribute("keyword", keyword);
		 model.addAttribute("staffs", staffService.getAll());
		return "user/track";
	}
	
	
	

	@RequestMapping(value = {"/receipt"}, method = RequestMethod.GET)
	public String listreceipts(Model model, 
	   		 @Param("keyword") String keyword) {
		 List<Staff> listStaffs = staffService.getAllStaffs(keyword);
		 model.addAttribute("listStaffs", listStaffs);
		 model.addAttribute("keyword", keyword);
		 model.addAttribute("staffs", staffService.getAll());
		return "user/receipt";
	}
	
	@RequestMapping(value = {"/staffs/new"}, method = RequestMethod.GET)
	public String createStaffForm(Model model) {
		Staff staff = new Staff();
		model.addAttribute("staff", staff);
		return "user/create_statrack";
	}

 @RequestMapping(value = {"/staffs"}, method = RequestMethod.POST)
public String saveStaff(@ModelAttribute("staff") Staff staff) {
	 staffService.saveStaff(staff);
	return "redirect:/staffs";
}

 @RequestMapping(value = {"/staffs/edit/{id}"}, method = RequestMethod.GET)
public String editStaffForm(@PathVariable Long id, Model model) {
	model.addAttribute("staff", staffService.getStaffById(id));
	return "user/edit_staff";
}

 @RequestMapping(value = {"/staffs/{id}"}, method = RequestMethod.POST)
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
	return "redirect:/staffs";
}

// handler method to handle delete staff request

 @RequestMapping(value = {"/staffs/{id}"}, method = RequestMethod.GET)
	public String Staff(@PathVariable Long id) {
	staffService.deleteStaffById(id);
	return "redirect:/staffs";
 }
 
 

	
	

 
 
	 
}
