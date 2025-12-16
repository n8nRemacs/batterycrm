package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class o33 extends dtf implements sm6 {
    public final /* synthetic */ b43 X;
    public final /* synthetic */ long Y;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o33(b43 b43Var, long j, Continuation continuation) {
        super(2, continuation);
        this.X = b43Var;
        this.Y = j;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((o33) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new o33(this.X, this.Y, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        int i = this.o;
        b43 b43Var = this.X;
        if (i == 0) {
            g8j.b(obj);
            qv3 qv3Var = ((l24) b43Var.w0.getValue()).a;
            qv3Var.getClass();
            long j = this.Y;
            bwd.a(new mv3(qv3Var, j, 0), new df3(4), qv3Var.l);
            w63 w63VarV = b43Var.v();
            this.o = 1;
            obj = w63VarV.p(j, this);
            g84 g84Var = g84.a;
            if (obj == g84Var) {
                return g84Var;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            g8j.b(obj);
        }
        pb2 pb2Var = (pb2) obj;
        if (pb2Var != null) {
            xfh.r(b43Var.L0, a63.M0(a63.c, pb2Var.a));
        }
        return qqg.a;
    }
}
