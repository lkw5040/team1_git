package cafe;


import javax.swing.JOptionPane;


public class Cafe {
public static void main(String[] args) {

	//*�ֹ� ���� ����*	
	int choice=0;
	String orderMsg = "������ �ֹ��Ͻðڽ��ϱ�?\n1.����\n2.����Ʈ\n3.�ֹ� ���\n4.�ֹ��Ϸ�\n5.������";
	String errMsg="�߸��Է��ϼ̽��ϴ�.\n";
	String orderCancel="�ֹ� ��ҵǾ����ϴ�.\n";
	String offProgram="���α׷��� �����մϴ�.\n";
	String lastMsg="�̿����ּż� �����մϴ�.";
	String arrMenu[][]= {{"��Ŀ��","���̽�Ŀ��","������","�ֹ� ���"},{"��Ϻ극��","����","����Ÿ��Ʈ","�ֹ� ���"}};
	String drink="1.��Ŀ��:2000��\n2.���̽�Ŀ��:2500��\n3.������:3000��\n4.�ֹ� ���\n";
	String dessert="1.��Ϻ극��:4000��\n2.����:2500��\n3.����Ÿ��Ʈ:3000��\n4.�ֹ� ���\n";
		
	int arrPrice[][]= {{2000,2500,3000},{4000,2500,3000}};
	int totalPrice=0;
	
	//�������� �Է¹��� �޴��� ��ȣ�� �ǹ��Ѵ�. 
	int inputNum=0;
	
	//msgBox�� ���� �޴��� ���� �����̴�. 
	//ex) ��Ŀ��:2000��, �߸��Է��ϼ̽��ϴ�., �ֹ���ҵǾ����ϴ�. ��...
	String msgBox="";
	String previousMsgBox="";
	//msgBox ������ ���� ���� �������ִ� ���� (�޴� vs errMsg, �ֹ���� ��...) 
	boolean menuCheck=false;
	
	//*�ֹ�*
	while(choice != 5)
	{
		
	choice=Integer.parseInt(JOptionPane.showInputDialog(null, orderMsg));
	switch(choice)
	{
		case 1: //����
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
			
		case 2: //����Ʈ
		
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
				
				
		case 3://�ֹ� ���
			msgBox=orderCancel;
			menuCheck=true;
			previousMsgBox=""; //previousMsgBox �ʱ�ȭ
			totalPrice=0; //��ü �ݾ� �ʱ�ȭ
			break;
			
		case 4://�ֹ� �Ϸ�
			msgBox=lastMsg;
			break;
			
		case 5://������
			msgBox=offProgram;
			menuCheck=true;
			break;
			
		default://�����޼���
			msgBox=errMsg;
			menuCheck=true;
			break;
		}

			if(!menuCheck)
			{
				if(choice==4)
				{
					previousMsgBox +="��(��) �ֹ��Ǿ����ϴ�.\n�� �����Ͻ� �ݾ��� "+totalPrice+"�Դϴ�\n"+" ��ǰ�� ���� ������ ��ø� ��ٷ� �ּ���\n";
					JOptionPane.showMessageDialog(null, previousMsgBox);
					previousMsgBox=""; //previousMsgBox�ʱ�ȭ
					totalPrice=0; //��ü �ݾ� �ʱ�ȭ
				}else {
					previousMsgBox+=msgBox+" ";
				}
			}
		JOptionPane.showMessageDialog(null, msgBox);
		msgBox="";
		menuCheck=false; //�޴��� �޼����� �������ִ� Flag �ʱ�ȭ
			
	//�������, ���� �߰�
	//tall, grande, venti	
	//*����Ʈ*
	//*����*
	}

}
}
