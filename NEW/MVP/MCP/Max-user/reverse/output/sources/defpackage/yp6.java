package defpackage;

import java.util.ArrayList;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class yp6 extends dtf implements sm6 {
    public final /* synthetic */ boolean X;
    public final /* synthetic */ tq6 o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yp6(tq6 tq6Var, boolean z, Continuation continuation) {
        super(2, continuation);
        this.o = tq6Var;
        this.X = z;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        yp6 yp6Var = (yp6) l((f84) obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        yp6Var.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new yp6(this.o, this.X, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        tq6 tq6Var = this.o;
        Iterable<op6> iterable = (Iterable) tq6Var.v0.getValue();
        ArrayList arrayList = new ArrayList(we3.q(iterable, 10));
        for (op6 op6VarB : iterable) {
            if (op6VarB.h != 0) {
                op6VarB = op6.b(op6VarB, null, null, null, 0, false, 0, null, 1983);
            }
            op6 op6VarB2 = op6VarB;
            if (this.X) {
                op6VarB2 = op6.b(op6VarB2, null, null, null, 0, false, 0, op6VarB2.c.u0, 991);
            }
            arrayList.add(op6VarB2);
        }
        tq6Var.v0.m(null, arrayList);
        return qqg.a;
    }
}
