


	class Data {
	    private String name;

	    
	    public String getName() {
	        return this.name;//getter
	    }
	    
	    public void setName(String name) {
	        this.name= name;//setter
	    }
	}
	public class acessmodifier1 {
	    public static void main(String[] main){
	        Data d = new Data();

	       
	        d.setName("Program is running");
	        System.out.println(d.getName());
	    }
	}