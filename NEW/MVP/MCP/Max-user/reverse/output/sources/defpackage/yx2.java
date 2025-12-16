package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class yx2 extends dtf implements sm6 {
    public final /* synthetic */ zx2 X;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yx2(zx2 zx2Var, Continuation continuation) {
        super(2, continuation);
        this.X = zx2Var;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((yx2) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new yx2(this.X, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        int i = this.o;
        zx2 zx2Var = this.X;
        if (i == 0) {
            g8j.b(obj);
            this.o = 1;
            obj = zx2Var.D(this);
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
        long jLongValue = ((Number) obj).longValue();
        ve2 ve2VarI = zx2Var.X.i();
        pb2 pb2VarM = ve2VarI.M(jLongValue);
        if (pb2VarM != null) {
            ve2VarI.v(pb2VarM, 0L);
            ((hwa) ve2VarI.q.get()).m(pb2VarM.a);
        }
        xfh.r(zx2Var.d1, new iw2(avd.P, null, new Integer(yud.A), 2));
        return qqg.a;
    }
}
