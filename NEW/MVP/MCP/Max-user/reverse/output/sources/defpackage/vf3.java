package defpackage;

import java.util.concurrent.atomic.AtomicInteger;
import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class vf3 extends dtf implements sm6 {
    public final /* synthetic */ x26[] X;
    public final /* synthetic */ int Y;
    public final /* synthetic */ AtomicInteger Z;
    public int o;
    public final /* synthetic */ pv0 s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vf3(x26[] x26VarArr, int i, AtomicInteger atomicInteger, pv0 pv0Var, Continuation continuation) {
        super(2, continuation);
        this.X = x26VarArr;
        this.Y = i;
        this.Z = atomicInteger;
        this.s0 = pv0Var;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((vf3) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new vf3(this.X, this.Y, this.Z, this.s0, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        int i = this.o;
        AtomicInteger atomicInteger = this.Z;
        pv0 pv0Var = this.s0;
        try {
            if (i == 0) {
                g8j.b(obj);
                x26[] x26VarArr = this.X;
                int i2 = this.Y;
                x26 x26Var = x26VarArr[i2];
                uf3 uf3Var = new uf3(pv0Var, i2, 0);
                this.o = 1;
                Object objD = x26Var.d(uf3Var, this);
                g84 g84Var = g84.a;
                if (objD == g84Var) {
                    return g84Var;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                g8j.b(obj);
            }
            if (atomicInteger.decrementAndGet() == 0) {
                pv0Var.i(null);
            }
            return qqg.a;
        } finally {
            if (atomicInteger.decrementAndGet() == 0) {
                pv0Var.i(null);
            }
        }
    }
}
