package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class eu9 extends dtf implements sm6 {
    public /* synthetic */ Object X;
    public final /* synthetic */ vu9 Y;
    public final /* synthetic */ long Z;
    public int o;
    public final /* synthetic */ boolean s0;
    public final /* synthetic */ boolean t0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eu9(vu9 vu9Var, long j, boolean z, boolean z2, Continuation continuation) {
        super(2, continuation);
        this.Y = vu9Var;
        this.Z = j;
        this.s0 = z;
        this.t0 = z2;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((eu9) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        eu9 eu9Var = new eu9(this.Y, this.Z, this.s0, this.t0, continuation);
        eu9Var.X = obj;
        return eu9Var;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        f84 f84Var;
        eu9 eu9Var;
        int i = this.o;
        qqg qqgVar = qqg.a;
        vu9 vu9Var = this.Y;
        if (i == 0) {
            g8j.b(obj);
            f84Var = (f84) this.X;
            pb2 pb2Var = (pb2) vu9Var.B1.a.getValue();
            if (pb2Var == null) {
                return qqgVar;
            }
            nt2 nt2Var = (nt2) vu9Var.P0.getValue();
            long j = pb2Var.a;
            long j2 = pb2Var.b.a;
            this.X = f84Var;
            this.o = 1;
            eu9Var = this;
            Object objA = nt2Var.a(j, j2, this.Z, this.s0, eu9Var);
            g84 g84Var = g84.a;
            if (objA == g84Var) {
                return g84Var;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            f84Var = (f84) this.X;
            g8j.b(obj);
            eu9Var = this;
        }
        if (eu9Var.t0) {
            d7j.e(f84Var);
            xfh.r(vu9Var.I1, ol9.a);
            return qqgVar;
        }
        return qqgVar;
    }
}
