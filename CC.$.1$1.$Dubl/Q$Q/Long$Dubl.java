package CC.$.Q$Q;

//import CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Rflect.Clas_Rap;
//import static CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Stat_Notif.Init_StRt_Nd;
import CC.COd.Finishd;
import CC.COd.Lin_DclAr;
import CC.COd.Neds_Ovrid;
import static CC.COd.Neds_Ovrid.*;

//import CC.$.Q$Q_LMNt.Long$Q;
//import CC.$.Q$Q_LMNt.Q$Dubl;
import java.util.Collection;

public interface
	Long$Dubl //extends
//	Long$Q,
//	Q$Dubl
{
	/*
	Clas_Rap Class=Init_StRt_Nd(Long$Dubl.class,
		Clas_Rap.class);
	/*Dep ?done*/

	@Lin_DclAr @Neds_Ovrid(NEds=Yes) @Finishd(Is_Finishd=true)
	double Long$Dubl(long In);
		@Lin_DclAr @Neds_Ovrid(NEds=No) @Finishd(Is_Finishd=true)
		default void Longg$Dublg(long[] From,double[] To)
		{
			for(int IndX=0;
				IndX<From.length;
				IndX+=1)
			{
				To[IndX]=(Long$Dubl(
				From[IndX]));
			}
		}
			@Lin_DclAr @Neds_Ovrid(NEds=No) @Finishd(Is_Finishd=true)
			default double[] Longg$Dublg(long[] In)
			{
				double[] Out=new double[In.length];

				Longg$Dublg(In,Out);

				return Out;
			}
		@Lin_DclAr @Neds_Ovrid(NEds=No) @Finishd(Is_Finishd=true)
		default void Longg$Dublg(
			Iterable<Long> From,
			Collection<Double> To)
		{
			for(long In:From)
			{To.add(Long$Dubl(In));}
		}
}