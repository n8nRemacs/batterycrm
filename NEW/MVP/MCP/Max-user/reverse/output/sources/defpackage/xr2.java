package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class xr2 extends dtf implements sm6 {
    public final /* synthetic */ zr2 X;
    public final /* synthetic */ fh9 Y;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xr2(zr2 zr2Var, fh9 fh9Var, Continuation continuation) {
        super(2, continuation);
        this.X = zr2Var;
        this.Y = fh9Var;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((xr2) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new xr2(this.X, this.Y, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) throws Throwable {
        zr2 zr2Var = this.X;
        k18 k18Var = (k18) zr2Var.d;
        int i = this.o;
        if (i == 0) {
            g8j.b(obj);
            cs2 cs2Var = (cs2) zr2Var.a;
            this.o = 1;
            obj = gw0.p(cs2Var.a, this);
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
        long jLongValue = ((Number) obj).longValue();
        qi9 qi9Var = (qi9) k18Var.getValue();
        fh9 fh9Var = this.Y;
        si9 si9VarI = qi9Var.i(jLongValue, fh9Var.a);
        if (si9VarI != null) {
            return si9VarI;
        }
        long jS = ((w4e) ((pb3) ((k18) zr2Var.f).getValue())).s();
        si9 si9VarM = ((qi9) k18Var.getValue()).m(((qi9) k18Var.getValue()).f(jLongValue, jS, this.Y));
        ((ve2) ((k18) zr2Var.e).getValue()).c0(jLongValue, fh9Var.d == jS, si9VarM, false, 0L);
        return si9VarM;
    }
}
