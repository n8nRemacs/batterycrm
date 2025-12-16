package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class io2 extends dtf implements sm6 {
    public final /* synthetic */ long X;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public io2(long j, Continuation continuation) {
        super(2, continuation);
        this.X = j;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        io2 io2Var = (io2) l((af2) obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        io2Var.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        io2 io2Var = new io2(this.X, continuation);
        io2Var.o = obj;
        return io2Var;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        af2 af2Var = (af2) this.o;
        df2 df2Var = af2Var.q;
        if (df2Var == null) {
            df2Var = df2.g;
        }
        cf2 cf2VarA = df2Var.a();
        cf2VarA.c = this.X;
        af2Var.q = cf2VarA.a();
        return qqg.a;
    }
}
