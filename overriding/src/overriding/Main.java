package overriding;

public class Main {

	public static void main(String[] args) {
		
	OgretmenKrediManager ogretmenKrediManager = new OgretmenKrediManager();
	
	System.out.println(ogretmenKrediManager.hesapla(125));
		
	BaseKrediManager[] baseKrediManagers = {new OgretmenKrediManager(),new TarimKrediManager(),new OgrenciKrediManager()};

	for (BaseKrediManager baseKrediManager : baseKrediManagers) {
		System.out.println(baseKrediManager.hesapla(1000));
	}
	
	}

}
