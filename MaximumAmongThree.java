package bridgeLabz.Java.Practice;
public class MaximumAmongThree <E extends Comparable<E>> {
	E n, m, o;
	
	public MaximumAmongThree(E n, E m, E o) {
		this.n = n;
		this.m = n;
		this.o = o;
	}
	
	public  E findMaximum() {
        return MaximumAmongThree.findMaximum(n, m, o);
    }
	
	public static <E extends Comparable<E>> E findMaximum(E n, E m, E o) {
		E max = n;
		if(m.compareTo(max) > 0 && m.compareTo(o) > 0) {
			max = m;
		}
		else if(o.compareTo(max) > 0) {
			max = o;
		}
		System.out.println(max);
		return max;
	}

	public static void main(String[] args) {
		System.out.println("Welcome to calculate Maximum Value Program");
	}
}


