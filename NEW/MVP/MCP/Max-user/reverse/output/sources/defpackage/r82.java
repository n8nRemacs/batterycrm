package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class r82 extends dtf implements sm6 {
    public final /* synthetic */ u82 X;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r82(u82 u82Var, Continuation continuation) {
        super(2, continuation);
        this.X = u82Var;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        r82 r82Var = (r82) l((ddc) obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        r82Var.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        r82 r82Var = new r82(this.X, continuation);
        r82Var.o = obj;
        return r82Var;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        xfh.r(this.X.Z, (ddc) this.o);
        return qqg.a;
    }
}
