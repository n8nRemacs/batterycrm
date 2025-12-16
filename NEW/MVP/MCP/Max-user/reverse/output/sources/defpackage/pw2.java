package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class pw2 extends dtf implements sm6 {
    public final /* synthetic */ long X;
    public final /* synthetic */ long Y;
    public final /* synthetic */ zx2 o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pw2(zx2 zx2Var, long j, long j2, Continuation continuation) {
        super(2, continuation);
        this.o = zx2Var;
        this.X = j;
        this.Y = j2;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        pw2 pw2Var = (pw2) l((f84) obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        pw2Var.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new pw2(this.o, this.X, this.Y, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        ve2 ve2VarI = this.o.X.i();
        pb2 pb2VarM = ve2VarI.M(this.X);
        if (pb2VarM != null) {
            ve2VarI.v(pb2VarM, this.Y);
            ((hwa) ve2VarI.q.get()).m(pb2VarM.a);
        }
        return qqg.a;
    }
}
