package defpackage;

import java.io.IOException;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class sr2 extends dtf implements sm6 {
    public final /* synthetic */ vr2 X;
    public final /* synthetic */ Set o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sr2(Set set, vr2 vr2Var, Continuation continuation) {
        super(2, continuation);
        this.o = set;
        this.X = vr2Var;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) throws IOException {
        sr2 sr2Var = (sr2) l((f84) obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        sr2Var.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new sr2(this.o, this.X, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) throws IOException {
        g8j.b(obj);
        vr2 vr2Var = this.X;
        ci5 ci5Var = vr2Var.w0;
        d92 d92Var = new d92(4, vr2Var);
        Set set = this.o;
        String strN = ue3.N(set, ", ", null, null, d92Var, 30);
        int iV = az1.v(vr2Var.v0);
        if (iV == 0) {
            xfh.r(ci5Var, k6j.b(set, new n5g(x8b.j2), new r5g(strN)));
        } else {
            if (iV != 1) {
                throw new NoWhenBranchMatchedException();
            }
            xfh.r(ci5Var, k6j.c(set, new n5g(x8b.k2), new r5g(strN)));
        }
        return qqg.a;
    }
}
