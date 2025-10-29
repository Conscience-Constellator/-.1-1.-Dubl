package CC.$.Q$Q;

//import CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Rflect.Clas_Rap;
//import static CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Stat_Notif.Init_StRt_Nd;
import CC.COd.Finishd;
import CC.COd.Lin_DclAr;
import CC.COd.Neds_Ovrid;
import static CC.COd.Neds_Ovrid.*;

//import CC.$.Q$Q_LMNt.Flot$Q;
//import CC.$.Q$Q_LMNt.Q$Dubl;
import java.util.Collection;

public interface
	FlOt$Dubl //extends
//	Flot$Q,
//	Q$Dubl
{
	/*
	Clas_Rap Class=Init_StRt_Nd(FlOt$Dubl.class,
		Clas_Rap.class);
	/*Dep ?done*/

	@Lin_DclAr @Neds_Ovrid(NEds=Yes) @Finishd(Is_Finishd=true)
	double Flot$Dubl(float In);
		@Lin_DclAr @Neds_Ovrid(NEds=No)
		default void Flot$Dubl(float[] From,double[] To)
		{
			for(int IndX=0;
				IndX<From.length;
				IndX+=1)
			{
				To[IndX]=(Flot$Dubl(
				From[IndX]));
			}
		}
			@Lin_DclAr @Neds_Ovrid(NEds=No)
			default double[] Flot$Dubl(float[] In)
			{
				double[] Out=new double[In.length];
				Flot$Dubl(In,Out);

				return Out;
			}
		@Lin_DclAr @Neds_Ovrid(NEds=No)
		default void Flot$Dubl(
			Iterable<Float> From,
			Collection<Double> To)
		{
			for(float In:From)
			{To.add(Flot$Dubl(In));}
		}
}