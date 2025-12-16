package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class oq6 extends dtf implements sm6 {
    public final /* synthetic */ vo6 X;
    public final /* synthetic */ tq6 Y;
    public final /* synthetic */ vo6 Z;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oq6(vo6 vo6Var, tq6 tq6Var, vo6 vo6Var2, Continuation continuation) {
        super(2, continuation);
        this.X = vo6Var;
        this.Y = tq6Var;
        this.Z = vo6Var2;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((oq6) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new oq6(this.X, this.Y, this.Z, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        int i = this.o;
        qqg qqgVar = qqg.a;
        tq6 tq6Var = this.Y;
        if (i == 0) {
            g8j.b(obj);
            vo6 vo6Var = this.X;
            if (vo6Var != null) {
                de8 de8Var = tq6Var.o;
                uo6 uo6Var = vo6Var.a;
                int i2 = tq6Var.x0.b;
                this.o = 1;
                bj7 bj7Var = (bj7) de8Var;
                Object objI = svi.i(((q2b) bj7Var.c).b().plus(bj7Var.b), new aj7(bj7Var, uo6Var, i2, null), this);
                g84 g84Var = g84.a;
                if (objI != g84Var) {
                    objI = qqgVar;
                }
                if (objI == g84Var) {
                    return g84Var;
                }
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            g8j.b(obj);
        }
        tq6Var.G0 = xfh.o(tq6Var, ((q2b) tq6Var.v()).f().plus(tq6Var.d), new aq6(tq6Var, this.Z, null), 2);
        return qqgVar;
    }
}
