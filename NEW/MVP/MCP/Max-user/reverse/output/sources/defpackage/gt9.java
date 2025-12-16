package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class gt9 extends dtf implements sm6 {
    public final /* synthetic */ vu9 X;
    public final /* synthetic */ long Y;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gt9(vu9 vu9Var, long j, Continuation continuation) {
        super(2, continuation);
        this.X = vu9Var;
        this.Y = j;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((gt9) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new gt9(this.X, this.Y, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        vu9 vu9Var = this.X;
        ci5 ci5Var = vu9Var.I1;
        int i = this.o;
        long j = this.Y;
        if (i == 0) {
            g8j.b(obj);
            vr6 vr6Var = (vr6) vu9Var.a1.getValue();
            this.o = 1;
            obj = vr6.a(vr6Var, j, this);
            g84 g84Var = g84.a;
            if (obj == g84Var) {
                return g84Var;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            g8j.b(obj);
        }
        ku3 ku3Var = (ku3) obj;
        if (j == ((w4e) vu9Var.x0).s()) {
            xfh.r(ci5Var, new rye(new n5g(mvd.H1), (Integer) null, 6));
        } else if (ku3Var == null || ku3Var.m() != 0 || ku3Var.B()) {
            xfh.r(ci5Var, new rye(new n5g(l7b.P0), (Integer) null, 6));
        } else {
            xfh.r(vu9Var.J1, qr9.c.N0(j));
        }
        return qqg.a;
    }
}
