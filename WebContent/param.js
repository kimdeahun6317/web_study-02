/**
 * 
 */

/*function check() {
	if(document.frm.id.value == ""){
		alter("아이디를 입력해주세요.");
		document.frm.id.focus();
		return false;
	}else if(document.frm.age.value == ""){
		alter("나이를 입력해주세요.");
		document.frm.age.focus();
		return false;
	}else if(isNaN(document.frm.age.value)){
		alter("숫자로 입력해주세요.");
		document.frm.age.focus();
		return false;
	}else{
		return true;
	}
}
*/
$(function(){
	   $(".submit_btn").click(function(){
	      if ($("#userid").val() == ""){
	         alert("아이디를 입력해주세요.");
	         $("#userid").focus();
	         return false;
	      } else if ($("#userpwd").val() == ""){
	         alert("패스워드를 입력해주세요.");
	         $("#userpwd").focus();
	         return false;
	      } else if ($("#age").val() == ""){
	         alert("나이를 입력해주세요.");
	         $("#age").focus();
	         return false;
	      } else {
	         return true;
	      }
	   })
	})