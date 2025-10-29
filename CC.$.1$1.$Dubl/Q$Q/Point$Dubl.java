package CC.$.Q$Q;

//import CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Rflect.Clas_Rap;
//import static CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Stat_Notif.Init_StRt_Nd;
import CC.COd.Finishd;
import CC.COd.Lin_DclAr;
import CC.COd.Neds_Ovrid;
import static CC.COd.Neds_Ovrid.*;

//import CC.$.Q$Q_LMNt.Point$Q;
//import CC.$.Q$Q_LMNt.Q$Dubl;
import java.util.Collection;

public interface
	Point$Dubl<In_Typ> //extends
//	Point$Q<In_Typ>,
//	Q$Dubl
{
	/*
	Clas_Rap Class=Init_StRt_Nd(Point$Dubl.class,
		Clas_Rap.class);
	/*Dep ?done*/

	@Lin_DclAr @Neds_Ovrid(NEds=Yes) @Finishd(Is_Finishd=true)
	double Point$Dubl(In_Typ In);
		@Lin_DclAr @Neds_Ovrid(NEds=No) @Finishd(Is_Finishd=true)
		default <In extends In_Typ>void Pointg$Dublg(
			In[] From,
			double[] To)
		{
			for(int IndX=0;
				IndX<From.length;
				IndX+=1)
			{
				To[IndX]=Point$Dubl(
				From[IndX]);
			}
		}
			@Lin_DclAr @Neds_Ovrid(NEds=No) @Finishd(Is_Finishd=true)
			default <In extends In_Typ>double[] Pointg$Dublg(In[] From)
			{
				double[] Out=new double[From.length];

				Pointg$Dublg(From,Out);

				return Out;
			}
		@Lin_DclAr @Neds_Ovrid(NEds=No) @Finishd(Is_Finishd=true)
		default <In extends In_Typ>void Pointg$Dublg(
			Iterable<In> From,
			Collection<Double> To)
		{
			for(In In:From)
			{To.add(Point$Dubl(In));}
		}
}