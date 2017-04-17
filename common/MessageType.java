package chat.common;

public interface MessageType {
	public String UserLogin = "@UsersLogin";	//�û���½��Ϣ
	public String UserRegister = "@UserRegister"; //�û�ע����Ϣ
	public String Login_Success = "@Login_Success";//��½�ɹ�
	public String Login_Fail = "@Login_Fail";//��½ʧ��
	public String Register_Success = "@Register_Success"; //ע��ɹ�
	public String Register_Fail = "Register_Fail";	//ע��ʧ��
	public String Common_Message_ToAll ="@Common_Message_ToAll";//������ͨ��Ϣ��������
	public String Common_Message_ToPerson ="@Common_Message_ToPerson" ;//������ͨ��Ϣ������
	public String Send_FileToAll = "@Send_FileToAll";//�����ļ���������
	public String Send_FileToPerson = "@Send_FileToPerson";//�����ļ�������
	public String Get_Online = "@Get_Online";//���������Ա
	public String Send_Online = "@Send_Online";//����������Ա
	public String SendUser = "@Send_User";//�����û���Ϣ
	public String CommonMessage ="@CommonMessage";	//��ͨ��Ϣ
	public String System_Messages = "@System_Messages"; //ϵͳ��Ϣ
	public String Login = "@Login";	//��½����
	public String NoLogin = "@NoLogin"; //û��½��
	public String Recive = "@Recive";	//����
	public String NoRecive = "@NoRevice";	//�ܾ�����
}
