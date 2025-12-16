package defpackage;

import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class hth extends dtf implements sm6 {
    public /* synthetic */ Object X;
    public final /* synthetic */ ith Y;
    public final /* synthetic */ lth Z;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hth(ith ithVar, lth lthVar, Continuation continuation) {
        super(2, continuation);
        this.Y = ithVar;
        this.Z = lthVar;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((hth) l((Throwable) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        hth hthVar = new hth(this.Y, this.Z, continuation);
        hthVar.X = obj;
        return hthVar;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        aw7 yv7Var;
        int i = this.o;
        if (i == 0) {
            g8j.b(obj);
            Throwable th = (Throwable) this.X;
            ith ithVar = this.Y;
            ithVar.getClass();
            dth dthVar = th instanceof dth ? (dth) th : null;
            if (dthVar != null) {
                yv7Var = new yv7(new bw7("request_denied", 0));
            } else {
                if (dthVar != null) {
                    throw new NoWhenBranchMatchedException();
                }
                yv7Var = zv7.d;
            }
            aw7 aw7Var = yv7Var;
            xh3 xh3Var = (xh3) ithVar.c.getValue();
            pv0 pv0Var = ithVar.e;
            String str = this.Z.a;
            this.o = 1;
            Object objA = xh3Var.a(pv0Var, aw7Var, eth.a, str, this);
            g84 g84Var = g84.a;
            if (objA == g84Var) {
                return g84Var;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            g8j.b(obj);
        }
        return qqg.a;
    }
}
