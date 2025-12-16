package defpackage;

/* loaded from: classes.dex */
public final /* synthetic */ class wva extends hn6 implements um6 {
    public static final wva a = new wva(3, xva.class, "register", "register(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;)V", 0);

    @Override // defpackage.um6
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        xva xvaVar = (xva) obj;
        nbe nbeVar = (nbe) obj2;
        long j = xvaVar.a;
        qqg qqgVar = qqg.a;
        if (j <= 0) {
            ((mbe) nbeVar).o = qqgVar;
            return qqgVar;
        }
        zn6 zn6Var = new zn6(nbeVar, 19, xvaVar);
        mbe mbeVar = (mbe) nbeVar;
        x74 x74Var = mbeVar.a;
        mbeVar.c = s8j.e(x74Var).invokeOnTimeout(j, zn6Var, x74Var);
        return qqgVar;
    }
}
