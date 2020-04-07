package cafe;


import javax.swing.JOptionPane;


public class Cafe {
public static void main(String[] args) {

	//*주문 관련 변수*	
	int choice=0;
	String orderMsg = "무엇을 주문하시겠습니까?\n1.음료\n2.디저트\n3.주문 취소\n4.주문완료\n5.나가기";
	String errMsg="잘못입력하셨습니다.\n";
	String orderCancel="주문 취소되었습니다.\n";
	String offProgram="프로그램을 종료합니다.\n";
	String lastMsg="이용해주셔서 감사합니다.";
	String arrMenu[][]= {{"핫커피","아이스커피","핫초코","주문 취소"},{"허니브레드","스콘","에그타르트","주문 취소"}};
	String drink="1.핫커피:2000원\n2.아이스커피:2500원\n3.핫초코:3000원\n4.주문 취소\n";
	String dessert="1.허니브레드:4000원\n2.스콘:2500원\n3.에그타르트:3000원\n4.주문 취소\n";
		
	int arrPrice[][]= {{2000,2500,3000},{4000,2500,3000}};
	int totalPrice=0;
	
	//마지막에 입력받은 메뉴의 번호를 의미한다. 
	int inputNum=0;
	
	//msgBox는 최종 메뉴가 들어가는 변수이다. 
	//ex) 핫커피:2000원, 잘못입력하셨습니다., 주문취소되었습니다. 등...
	String msgBox="";
	String previousMsgBox="";
	//msgBox 변수에 들어가는 값을 구별해주는 변수 (메뉴 vs errMsg, 주문취소 등...) 
	boolean menuCheck=false;
	
	//*주문*
	while(choice != 5)
	{
		
	choice=Integer.parseInt(JOptionPane.showInputDialog(null, orderMsg));
	switch(choice)
	{
		case 1: //음료
			inputNum=Integer.parseInt(JOptionPane.showInputDialog(null, drink));
			switch(inputNum)
			{
			case 1:
				msgBox+=arrMenu[0][inputNum-1];
				totalPrice += arrPrice[0][inputNum-1];
				break;
			
			case 2:
				msgBox+=arrMenu[0][inputNum-1];
				totalPrice += arrPrice[0][inputNum-1];
				break;

			case 3:
				msgBox+=arrMenu[0][inputNum-1];
				totalPrice += arrPrice[0][inputNum-1];
				break;
			
			case 4:
				msgBox+=arrMenu[0][inputNum-1];
				break;
			
			default:
				msgBox=errMsg;
				menuCheck=true;
				
			}
			break;
			
		case 2: //디저트
		
			inputNum=Integer.parseInt(JOptionPane.showInputDialog(null, dessert));
			switch(inputNum) {
			
			case 1:
				msgBox+=arrMenu[1][inputNum-1];
				totalPrice += arrPrice[1][inputNum-1];
				break;
			
			case 2:
				msgBox+=arrMenu[1][inputNum-1];
				totalPrice += arrPrice[1][inputNum-1];
				break;
				
			case 3:
				msgBox+=arrMenu[1][inputNum-1];
				totalPrice += arrPrice[1][inputNum-1];
				break;
			
			case 4:
				msgBox+=arrMenu[1][inputNum-1];
				break;
			
			default:
				msgBox=errMsg;
				menuCheck=true;
			}
			break;
				
				
		case 3://주문 취소
			msgBox=orderCancel;
			menuCheck=true;
			previousMsgBox=""; //previousMsgBox 초기화
			totalPrice=0; //전체 금액 초기화
			break;
			
		case 4://주문 완료
			msgBox=lastMsg;
			break;
			
		case 5://나가기
			msgBox=offProgram;
			menuCheck=true;
			break;
			
		default://오류메세지
			msgBox=errMsg;
			menuCheck=true;
			break;
		}

			if(!menuCheck)
			{
				if(choice==4)
				{
					previousMsgBox +="이(가) 주문되었습니다.\n총 결재하실 금액은 "+totalPrice+"입니다\n"+" 제품이 나올 떄까지 잠시만 기다려 주세요\n";
					JOptionPane.showMessageDialog(null, previousMsgBox);
					previousMsgBox=""; //previousMsgBox초기화
					totalPrice=0; //전체 금액 초기화
				}else {
					previousMsgBox+=msgBox+" ";
				}
			}
		JOptionPane.showMessageDialog(null, msgBox);
		msgBox="";
		menuCheck=false; //메뉴와 메세지를 구분해주는 Flag 초기화
			
	//사이즈업, 토핑 추가
	//tall, grande, venti	
	//*포인트*
	//*쿠폰*
	}

}
}
