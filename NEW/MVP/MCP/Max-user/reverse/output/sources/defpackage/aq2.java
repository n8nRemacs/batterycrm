package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class aq2 extends dtf implements sm6 {
    public final /* synthetic */ yq2 X;
    public final /* synthetic */ long Y;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aq2(yq2 yq2Var, long j, Continuation continuation) {
        super(2, continuation);
        this.X = yq2Var;
        this.Y = j;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((aq2) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new aq2(this.X, this.Y, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        int i = this.o;
        long j = this.Y;
        yq2 yq2Var = this.X;
        if (i == 0) {
            g8j.b(obj);
            vr6 vr6Var = (vr6) yq2Var.J0.getValue();
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
        k18 k18Var = yq2Var.K0;
        ci5 ci5Var = yq2Var.U0;
        long jS = ((w4e) ((pb3) k18Var.getValue())).s();
        qqg qqgVar = qqg.a;
        if (j == jS) {
            xfh.r(ci5Var, new vh5(new n5g(mvd.H1), (Integer) null, 6));
            return qqgVar;
        }
        if (ku3Var == null || ku3Var.m() != 0 || ku3Var.B()) {
            xfh.r(ci5Var, new vh5(new n5g(l7b.P0), (Integer) null, 6));
            return qqgVar;
        }
        ci5 ci5Var2 = yq2Var.V0;
        ko2.c.getClass();
        xc0.l(":profile?id=" + j + "&type=contact", ci5Var2);
        return qqgVar;
    }
}
