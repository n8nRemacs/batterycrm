package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class jx2 extends dtf implements sm6 {
    public int X;
    public final /* synthetic */ zx2 Y;
    public final /* synthetic */ Long Z;
    public long o;
    public final /* synthetic */ long s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jx2(zx2 zx2Var, Long l, long j, Continuation continuation) {
        super(2, continuation);
        this.Y = zx2Var;
        this.Z = l;
        this.s0 = j;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((jx2) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new jx2(this.Y, this.Z, this.s0, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        long j;
        int i = this.X;
        qqg qqgVar = qqg.a;
        zx2 zx2Var = this.Y;
        if (i == 0) {
            g8j.b(obj);
            pb2 pb2Var = (pb2) zx2Var.a1.a.getValue();
            if (pb2Var != null) {
                j = pb2Var.a;
                uq9 uq9Var = (uq9) zx2Var.I0.getValue();
                this.o = j;
                this.X = 1;
                obj = uq9Var.a(j, this.Z, this);
                g84 g84Var = g84.a;
                if (obj == g84Var) {
                    return g84Var;
                }
            }
            return qqgVar;
        }
        if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        j = this.o;
        g8j.b(obj);
        xge xgeVar = new xge(1, j, this.s0);
        xgeVar.b = (sk9) obj;
        ((c6i) zx2Var.H0.getValue()).b(new yge(xgeVar));
        return qqgVar;
    }
}
