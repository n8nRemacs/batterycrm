package defpackage;

import java.util.ArrayList;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class du8 extends dtf implements sm6 {
    public final /* synthetic */ mu8 X;
    public final /* synthetic */ Long Y;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public du8(mu8 mu8Var, Long l, Continuation continuation) {
        super(2, continuation);
        this.X = mu8Var;
        this.Y = l;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((du8) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new du8(this.X, this.Y, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        qqg qqgVar = qqg.a;
        g84 g84Var = g84.a;
        int i = this.o;
        if (i == 0) {
            g8j.b(obj);
            gx9 gx9Var = (gx9) this.X.c.getValue();
            long jLongValue = this.Y.longValue();
            this.o = 1;
            obj = gx9Var.a.j(jLongValue, this);
            if (obj != g84Var) {
            }
            return g84Var;
        }
        if (i != 1) {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            g8j.b(obj);
            return qqgVar;
        }
        g8j.b(obj);
        si9 si9Var = (si9) obj;
        if (si9Var != null) {
            mu8 mu8Var = this.X;
            yy7[] yy7VarArr = mu8.J0;
            dce dceVarU = mu8Var.u();
            dceVarU.getClass();
            boolean zT = si9Var.t();
            jdc jdcVar = si9Var.x0;
            if (zT) {
                for (int i2 = 0; i2 < jdcVar.p(); i2++) {
                    g00 g00VarC = mni.C(jdcVar.o(i2), si9Var.Z, si9Var.b);
                    if (g00VarC != null) {
                        dceVarU.r(g00VarC);
                    }
                }
            }
            ArrayList arrayListB = pqi.b(this.X.u());
            this.X.y0.m(null, arrayListB);
            this.X.v0 = arrayListB;
            pv0 pv0Var = this.X.u0;
            ct8 ct8Var = ct8.a;
            this.o = 2;
            if (pv0Var.h(ct8Var, this) == g84Var) {
                return g84Var;
            }
        }
        return qqgVar;
    }
}
