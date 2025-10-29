package CC.$.Q$Q;

//import CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Rflect.Clas_Rap;
//import static CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Stat_Notif.Init_StRt_Nd;
import CC.COd.Finishd;
import CC.COd.Lin_DclAr;
import CC.COd.Neds_Ovrid;
import static CC.COd.Neds_Ovrid.*;

//import CC.$.Q$Q_LMNt.ChR$Q;
//import CC.$.Q$Q_LMNt.Q$Dubl;
import java.util.Collection;

public interface
	ChR$Dubl //extends
//	ChR$Q,
//	Q$Dubl
{
	/*
	Clas_Rap Class=Init_StRt_Nd(ChR$Dubl.class,
		Clas_Rap.class);
	/*Dep ?done*/

	@Lin_DclAr
	double ChR$Dubl(char In);
		@Lin_DclAr @Neds_Ovrid(NEds=No)
		default void ChRg$Dublg(char[] From,double[] To)
		{
			for(int IndX=0;
				IndX<From.length;
				IndX+=1)
			{
				To[IndX]=(ChR$Dubl(
				From[IndX]));
			}
		}
			@Lin_DclAr @Neds_Ovrid(NEds=No)
			default double[] ChRg$Dublg(char[] In)
			{
				double[] Out=new double[In.length];
				ChRg$Dublg(In,Out);

				return Out;
			}
		@Lin_DclAr @Neds_Ovrid(NEds=No)
		default void ChRg$Dublg(
			Iterable<Character> From,
			Collection<Double> To)
		{
			for(char In:From)
			{To.add(ChR$Dubl(In));}
		}
}