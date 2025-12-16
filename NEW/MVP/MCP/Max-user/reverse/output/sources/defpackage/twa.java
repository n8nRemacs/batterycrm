package defpackage;

import kotlin.coroutines.Continuation;
import one.me.android.OneMeApplication;

/* loaded from: classes.dex */
public final class twa extends dtf implements sm6 {
    public final /* synthetic */ OneMeApplication X;
    public final /* synthetic */ vwa Y;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public twa(OneMeApplication oneMeApplication, vwa vwaVar, Continuation continuation) {
        super(2, continuation);
        this.X = oneMeApplication;
        this.Y = vwaVar;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((twa) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new twa(this.X, this.Y, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        int i = this.o;
        qqg qqgVar = qqg.a;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            g8j.b(obj);
            return qqgVar;
        }
        g8j.b(obj);
        a93 a93VarX = a93.s0.x(this.X);
        jl8 jl8Var = new jl8(0, 1, vwa.class, this.Y, "weakActivities", "getWeakActivities()Ljava/util/concurrent/CopyOnWriteArrayList;");
        this.o = 1;
        a93VarX.getClass();
        Object objD = d7j.d(new z83(a93VarX, jl8Var, null), this);
        g84 g84Var = g84.a;
        if (objD != g84Var) {
            objD = qqgVar;
        }
        return objD == g84Var ? g84Var : qqgVar;
    }
}
