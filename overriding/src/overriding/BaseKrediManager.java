package overriding;

public class BaseKrediManager {
	
	public double hesapla(double tutar) {
		return tutar*1.18;
	}
	
	// bu methodtda public den sonra final kosaydık hiçbir sınıf override edemezdi
	

}
