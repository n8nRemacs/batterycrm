package defpackage;

import java.util.concurrent.atomic.AtomicLong;
import java.util.function.LongUnaryOperator;
import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class dq2 extends dtf implements sm6 {
    public int X;
    public final /* synthetic */ yq2 Y;
    public final /* synthetic */ int Z;
    public long o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dq2(int i, yq2 yq2Var, Continuation continuation) {
        super(2, continuation);
        this.Y = yq2Var;
        this.Z = i;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((dq2) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new dq2(this.Z, this.Y, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        final long j;
        yq2 yq2Var = this.Y;
        tcf tcfVar = yq2Var.Z0;
        AtomicLong atomicLong = yq2Var.T0;
        int i = this.X;
        qqg qqgVar = qqg.a;
        if (i == 0) {
            g8j.b(obj);
            g2h g2hVar = ((lp2) yq2Var.e1.a.getValue()).b;
            if (g2hVar == null) {
                wqi.c(yq2Var.w0, "Can't load frame for preview because videoContent is null", new Object[0]);
                return qqgVar;
            }
            long j2 = atomicLong.get();
            long duration = g2hVar.getDuration();
            int i2 = this.Z;
            if (duration != 0 && Math.abs(j2 - i2) <= g2hVar.getDuration() * 0.01d) {
                return qqgVar;
            }
            tcfVar.m(null, gp2.a((gp2) tcfVar.getValue(), new fp2(null, 5)));
            j = i2;
            uj6 uj6Var = (uj6) yq2Var.D0.getValue();
            this.o = j;
            this.X = 1;
            obj = uj6Var.b(j, this);
            g84 g84Var = g84.a;
            if (obj == g84Var) {
                return g84Var;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j = this.o;
            g8j.b(obj);
        }
        tcfVar.m(null, gp2.a((gp2) tcfVar.getValue(), new fp2((sj6) obj, 6)));
        atomicLong.updateAndGet(new LongUnaryOperator() { // from class: cq2
            @Override // java.util.function.LongUnaryOperator
            public final long applyAsLong(long j3) {
                return j;
            }
        });
        return qqgVar;
    }
}
