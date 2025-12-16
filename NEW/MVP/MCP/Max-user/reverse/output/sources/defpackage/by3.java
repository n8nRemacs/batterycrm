package defpackage;

import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class by3 extends dtf implements sm6 {
    public final /* synthetic */ iy3 X;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public by3(iy3 iy3Var, Continuation continuation) {
        super(2, continuation);
        this.X = iy3Var;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        by3 by3Var = (by3) l((xw3) obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        by3Var.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        by3 by3Var = new by3(this.X, continuation);
        by3Var.o = obj;
        return by3Var;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        xw3 xw3Var = (xw3) this.o;
        boolean zA = fni.a(xw3Var, vw3.a);
        iy3 iy3Var = this.X;
        if (!zA && !(xw3Var instanceof ww3)) {
            throw new NoWhenBranchMatchedException();
        }
        iy3Var.a();
        return qqg.a;
    }
}
