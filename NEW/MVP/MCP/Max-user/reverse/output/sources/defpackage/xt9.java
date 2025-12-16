package defpackage;

import java.util.List;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class xt9 extends dtf implements sm6 {
    public int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ vu9 Z;
    public Long o;
    public final /* synthetic */ List s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xt9(vu9 vu9Var, List list, Continuation continuation) {
        super(2, continuation);
        this.Z = vu9Var;
        this.s0 = list;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((xt9) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        xt9 xt9Var = new xt9(this.Z, this.s0, continuation);
        xt9Var.Y = obj;
        return xt9Var;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        f84 f84Var;
        Long l;
        int i = this.X;
        qqg qqgVar = qqg.a;
        vu9 vu9Var = this.Z;
        if (i == 0) {
            g8j.b(obj);
            f84 f84Var2 = (f84) this.Y;
            pb2 pb2Var = (pb2) vu9Var.B1.a.getValue();
            Long l2 = (Long) ue3.I(this.s0);
            if (pb2Var != null && l2 != null && pb2Var.o != null) {
                wz2 wz2Var = (wz2) vu9Var.Q0.getValue();
                long j = pb2Var.a;
                long j2 = pb2Var.b.a;
                this.Y = f84Var2;
                this.o = l2;
                this.X = 1;
                wz2Var.a(j, j2);
                g84 g84Var = g84.a;
                if (qqgVar == g84Var) {
                    return g84Var;
                }
                f84Var = f84Var2;
                l = l2;
            }
            return qqgVar;
        }
        if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        l = this.o;
        f84Var = (f84) this.Y;
        g8j.b(obj);
        d7j.e(f84Var);
        xfh.r(vu9Var.I1, new wye(l.longValue()));
        return qqgVar;
    }
}
