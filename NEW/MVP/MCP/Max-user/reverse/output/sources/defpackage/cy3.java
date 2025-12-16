package defpackage;

import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class cy3 extends dtf implements sm6 {
    public final /* synthetic */ iy3 X;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cy3(iy3 iy3Var, Continuation continuation) {
        super(2, continuation);
        this.X = iy3Var;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        cy3 cy3Var = (cy3) l((rrb) obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        cy3Var.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        cy3 cy3Var = new cy3(this.X, continuation);
        cy3Var.o = obj;
        return cy3Var;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        if (((rrb) this.o) == null) {
            throw new NoWhenBranchMatchedException();
        }
        this.X.a();
        return qqg.a;
    }
}
