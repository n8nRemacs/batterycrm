package defpackage;

import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class un1 extends dtf implements sm6 {
    public final /* synthetic */ wo1 X;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public un1(wo1 wo1Var, Continuation continuation) {
        super(2, continuation);
        this.X = wo1Var;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        un1 un1Var = (un1) l((f2e) obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        un1Var.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        un1 un1Var = new un1(this.X, continuation);
        un1Var.o = obj;
        return un1Var;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        int iOrdinal = ((f2e) this.o).ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                xfh.r(this.X.L0, en1.r);
            } else if (iOrdinal != 2 && iOrdinal != 3) {
                throw new NoWhenBranchMatchedException();
            }
        }
        return qqg.a;
    }
}
