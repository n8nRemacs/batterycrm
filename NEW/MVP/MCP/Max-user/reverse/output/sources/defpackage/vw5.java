package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class vw5 extends dtf implements sm6 {
    public final /* synthetic */ ww5 X;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vw5(ww5 ww5Var, Continuation continuation) {
        super(2, continuation);
        this.X = ww5Var;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        vw5 vw5Var = (vw5) l((xz) obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        vw5Var.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        vw5 vw5Var = new vw5(this.X, continuation);
        vw5Var.o = obj;
        return vw5Var;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        this.X.I((xz) this.o);
        return qqg.a;
    }
}
