package defpackage;

import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class aw2 extends dtf implements sm6 {
    public final /* synthetic */ zx2 X;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aw2(zx2 zx2Var, Continuation continuation) {
        super(2, continuation);
        this.X = zx2Var;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        aw2 aw2Var = (aw2) l((sg2) obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        aw2Var.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        aw2 aw2Var = new aw2(this.X, continuation);
        aw2Var.o = obj;
        return aw2Var;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        if (!fni.a((sg2) this.o, sg2.a)) {
            throw new NoWhenBranchMatchedException();
        }
        xfh.r(this.X.d1, cw2.c);
        return qqg.a;
    }
}
