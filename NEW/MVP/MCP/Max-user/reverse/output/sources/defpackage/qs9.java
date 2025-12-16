package defpackage;

import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class qs9 extends dtf implements sm6 {
    public final /* synthetic */ vu9 X;
    public final /* synthetic */ long Y;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qs9(vu9 vu9Var, long j, Continuation continuation) {
        super(2, continuation);
        this.X = vu9Var;
        this.Y = j;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        qs9 qs9Var = (qs9) l((j74) obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        qs9Var.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        qs9 qs9Var = new qs9(this.X, this.Y, continuation);
        qs9Var.o = obj;
        return qs9Var;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        rye ryeVar;
        g8j.b(obj);
        j74 j74Var = (j74) this.o;
        if (j74Var instanceof i74) {
            ryeVar = new rye(((i74) j74Var).a, (Integer) null, 6);
        } else {
            if (!(j74Var instanceof h74)) {
                throw new NoWhenBranchMatchedException();
            }
            ryeVar = new rye(((h74) j74Var).a, (Integer) null, 6);
        }
        vu9 vu9Var = this.X;
        xfh.r(vu9Var.I1, ryeVar);
        vu9Var.L1.l(this.Y);
        return qqg.a;
    }
}
