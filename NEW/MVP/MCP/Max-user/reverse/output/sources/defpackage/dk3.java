package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class dk3 extends dtf implements sm6 {
    public final /* synthetic */ gk3 X;
    public final /* synthetic */ int Y;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dk3(gk3 gk3Var, int i, Continuation continuation) {
        super(2, continuation);
        this.X = gk3Var;
        this.Y = i;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((dk3) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new dk3(this.X, this.Y, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        int i = this.o;
        qqg qqgVar = qqg.a;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            g8j.b(obj);
            return qqgVar;
        }
        g8j.b(obj);
        gk3 gk3Var = this.X;
        boolean zBooleanValue = ((Boolean) gk3Var.A0.getValue()).booleanValue();
        int i2 = this.Y;
        if (zBooleanValue) {
            this.o = 1;
            Object objU = gk3.u(gk3Var, i2, this);
            g84 g84Var = g84.a;
            if (objU == g84Var) {
                return g84Var;
            }
        } else {
            sj3[] sj3VarArrValues = sj3.values();
            sj3 sj3Var = (i2 < 0 || i2 > sj3VarArrValues.length - 1) ? null : sj3VarArrValues[i2];
            if (sj3Var != null) {
                hwa hwaVar = (hwa) gk3Var.X.getValue();
                long jU = ys.u(gk3Var.b);
                if (hwaVar.j(jU)) {
                    hwa.r(hwaVar, new wd2(hwaVar.t().a.k(), jU, sj3Var));
                }
                xfh.r(gk3Var.z0, yj3.a);
                return qqgVar;
            }
        }
        return qqgVar;
    }
}
