class Test{
	public static void add(){
		System.out.println("Zero-Arguments");
	}
	public static void add(int a){
		System.out.println("One-Arguments");
	}
	public static void add(int a, int b){
		System.out.println("Twoo-Arguments");
	}
	public static void main(String[] args){
		add();
		add(10);
		add(10,20);
	}
}
		