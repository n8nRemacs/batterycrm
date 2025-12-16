package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class dd6 extends dtf implements sm6 {
    public final /* synthetic */ String X;
    public final /* synthetic */ gd6 o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dd6(gd6 gd6Var, String str, Continuation continuation) {
        super(2, continuation);
        this.o = gd6Var;
        this.X = str;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        dd6 dd6Var = (dd6) l((f84) obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        dd6Var.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new dd6(this.o, this.X, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        ccb ccbVar = (ccb) this.o.X.getValue();
        ccbVar.h(this.X);
        ccbVar.e(new qcb(yud.k));
        ccbVar.i();
        return qqg.a;
    }
}
