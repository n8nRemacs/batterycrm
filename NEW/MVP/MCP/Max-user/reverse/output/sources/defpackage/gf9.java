package defpackage;

import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class gf9 extends dtf implements sm6 {
    public final /* synthetic */ hf9 X;
    public final /* synthetic */ boolean Y;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gf9(hf9 hf9Var, boolean z, Continuation continuation) {
        super(2, continuation);
        this.X = hf9Var;
        this.Y = z;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        gf9 gf9Var = (gf9) l((pc9) obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        gf9Var.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        gf9 gf9Var = new gf9(this.X, this.Y, continuation);
        gf9Var.o = obj;
        return gf9Var;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        pc9 pc9Var = (pc9) this.o;
        yy7[] yy7VarArr = hf9.K0;
        hf9 hf9Var = this.X;
        pb2 pb2VarW = hf9Var.w();
        qqg qqgVar = qqg.a;
        if (pb2VarW != null) {
            if (fni.a(pc9Var, nc9.a)) {
                hf9Var.C0.O(hf9Var, hf9.K0[1], xfh.o(hf9Var, ((q2b) hf9Var.Y).a(), new ef9(hf9Var, pb2VarW, null), 2));
                return qqgVar;
            }
            if (!fni.a(pc9Var, oc9.a)) {
                throw new NoWhenBranchMatchedException();
            }
            if (this.Y) {
                hf9Var.D0.O(hf9Var, hf9.K0[2], xfh.o(hf9Var, ((q2b) hf9Var.Y).a(), new ff9(hf9Var, pb2VarW, null), 2));
                return qqgVar;
            }
        }
        return qqgVar;
    }
}
