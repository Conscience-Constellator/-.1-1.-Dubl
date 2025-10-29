package CC.$.Q$Q;

//import CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Rflect.Clas_Rap;
//import static CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Stat_Notif.Init_StRt_Nd;
import CC.COd.Finishd;
import CC.COd.Lin_DclAr;
import CC.COd.Neds_Ovrid;
import static CC.COd.Neds_Ovrid.*;

//import CC.Util.By.LMNt.Get_Q_By_Byt;
//import CC.$.Q$Q_LMNt.Byt$Q;
//import CC.$.Q$Q_LMNt.Q$Dubl;
import java.util.Collection;

public interface
	Byt$Dubl //extends
//	Byt$Q,
//	Q$Dubl
{
	/*
	Clas_Rap Class=Init_StRt_Nd(Byt$Dubl.class,
		Clas_Rap.class);
	/*Dep ?done*/

	@Lin_DclAr
	double Byt$Dubl(byte In);
		@Lin_DclAr @Neds_Ovrid(NEds=No)
		default void Bytg$Dublg(byte[] From,double[] To)
		{
			for(int IndX=0;
				IndX<From.length;
				IndX+=1)
			{
				To[IndX]=(Byt$Dubl(
				From[IndX]));
			}
		}
			@Lin_DclAr @Neds_Ovrid(NEds=No)
			default double[] Bytg$Dublg(byte[] In)
			{
				double[] Out=new double[In.length];
				Bytg$Dublg(In,Out);

				return Out;
			}
		@Lin_DclAr @Neds_Ovrid(NEds=No)
		default void Bytg$Dublg(Iterable<Byte> From,Collection<Double> To)
		{
			for(byte In:From)
			{To.add(Byt$Dubl(In));}
		}
}