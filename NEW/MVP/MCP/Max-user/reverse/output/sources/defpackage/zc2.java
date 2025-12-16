package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class zc2 extends dtf implements sm6 {
    public final /* synthetic */ sd2 X;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zc2(sd2 sd2Var, Continuation continuation) {
        super(2, continuation);
        this.X = sd2Var;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        zc2 zc2Var = (zc2) l((x82) obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        zc2Var.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        zc2 zc2Var = new zc2(this.X, continuation);
        zc2Var.o = obj;
        return zc2Var;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        x82 x82Var = (x82) this.o;
        sd2 sd2Var = this.X;
        tcf tcfVar = sd2Var.i;
        x82 x82Var2 = (x82) tcfVar.getValue();
        if ((x82Var2 != null ? x82Var2.b : null) == w82.b) {
            tcfVar.setValue(x82Var);
        }
        yy7[] yy7VarArr = sd2.B;
        sd2Var.d(sd2Var.u());
        return qqg.a;
    }
}
