class Mark{
	public static void main(String[] args){
		cal_Marks(new int[] {35,36,37,38,39});
	}
	public static void cal_Marks(int[] marks){
		int total = 0;
		for(int mark:marks){
			//total = total + mark;
			total+=mark;
		}
		System.out.println(total);
	}
}