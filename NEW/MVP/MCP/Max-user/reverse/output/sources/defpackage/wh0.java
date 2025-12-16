package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class wh0 extends dtf implements sm6 {
    public final /* synthetic */ zh0 X;
    public final /* synthetic */ k18 Y;
    public /* synthetic */ boolean o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wh0(zh0 zh0Var, k18 k18Var, Continuation continuation) {
        super(2, continuation);
        this.X = zh0Var;
        this.Y = k18Var;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        wh0 wh0Var = (wh0) l(bool, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        wh0Var.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        wh0 wh0Var = new wh0(this.X, this.Y, continuation);
        wh0Var.o = ((Boolean) obj).booleanValue();
        return wh0Var;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        boolean z = this.o;
        yy7[] yy7VarArr = zh0.t0;
        zh0 zh0Var = this.X;
        zh0Var.s0.O(zh0Var, zh0.t0[0], svi.d(zh0Var.a, ((q2b) zh0Var.b).b(), i84.b, new vh0(zh0Var, this.Y, z, null)));
        return qqg.a;
    }
}
