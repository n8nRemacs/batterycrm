package defpackage;

import java.util.concurrent.atomic.AtomicLong;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class od2 extends dtf implements sm6 {
    public final /* synthetic */ x82 X;
    public final /* synthetic */ pb2 Y;
    public final /* synthetic */ sd2 o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public od2(sd2 sd2Var, x82 x82Var, pb2 pb2Var, Continuation continuation) {
        super(2, continuation);
        this.o = sd2Var;
        this.X = x82Var;
        this.Y = pb2Var;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        od2 od2Var = (od2) l((f84) obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        od2Var.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new od2(this.o, this.X, this.Y, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        long jG;
        pb2 pb2Var = this.Y;
        rf2 rf2Var = pb2Var.b;
        g8j.b(obj);
        sd2 sd2Var = this.o;
        k18 k18Var = sd2Var.q;
        AtomicLong atomicLong = sd2Var.x;
        x82 x82Var = this.X;
        int iOrdinal = x82Var.b.ordinal();
        if (iOrdinal == 0) {
            jG = ((hwa) k18Var.getValue()).g(pb2Var.a, rf2Var.a, 1, x82Var.c, false, null);
        } else {
            if (iOrdinal != 1) {
                throw new NoWhenBranchMatchedException();
            }
            jG = ((hwa) k18Var.getValue()).g(pb2Var.a, rf2Var.a, 2, null, false, null);
        }
        atomicLong.set(jG);
        sd2Var.A.set(true);
        return qqg.a;
    }
}
