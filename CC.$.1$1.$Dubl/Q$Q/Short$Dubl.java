package CC.$.Q$Q;

//import CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Rflect.Clas_Rap;
//import static CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Stat_Notif.Init_StRt_Nd;
import CC.COd.Finishd;
import CC.COd.Lin_DclAr;
import CC.COd.Neds_Ovrid;
import static CC.COd.Neds_Ovrid.*;

//import CC.$.Q$Q_LMNt.Q$Dubl;
//import CC.$.Q$Q_LMNt.Short$Q;
import java.util.Collection;

public interface
	Short$Dubl //extends
//	Short$Q,
//	Q$Dubl
{
	/*
	Clas_Rap Class=Init_StRt_Nd(Short$Dubl.class,
		Clas_Rap.class);
	/*Dep ?done*/

	@Lin_DclAr @Neds_Ovrid(NEds=Yes) @Finishd(Is_Finishd=true)
	double Short$Dubl(short In);
		@Lin_DclAr @Neds_Ovrid(NEds=No) @Finishd(Is_Finishd=true)
		default void Shortg$Dublg(
			short[] From,
			double[] To)
		{
			for(int IndX=0;
				IndX<From.length;
				IndX+=1)
			{
				To[IndX]=(Short$Dubl(
				From[IndX]));
			}
		}
			@Lin_DclAr @Neds_Ovrid(NEds=No) @Finishd(Is_Finishd=true)
			default double[] Shortg$Dublg(short[] In)
			{
				double[] Out=new double[In.length];

				Shortg$Dublg(In,Out);

				return Out;
			}
		@Lin_DclAr @Neds_Ovrid(NEds=No) @Finishd(Is_Finishd=true)
		default void Shortg$Dublg(
			Iterable<Short> From,
			Collection<Double> To)
		{
			for(short In:From)
			{To.add(Short$Dubl(In));}
		}
}