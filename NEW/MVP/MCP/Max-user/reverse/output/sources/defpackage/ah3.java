package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class ah3 extends dtf implements sm6 {
    public final /* synthetic */ bh3 X;
    public final /* synthetic */ gj7 Y;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ah3(bh3 bh3Var, gj7 gj7Var, Continuation continuation) {
        super(2, continuation);
        this.X = bh3Var;
        this.Y = gj7Var;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((ah3) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new ah3(this.X, this.Y, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        w10 w10VarD;
        d10 d10Var;
        gj7 gj7Var = this.Y;
        long j = gj7Var.b;
        int i = this.o;
        wg3 ug3Var = null;
        bh3 bh3Var = this.X;
        if (i == 0) {
            g8j.b(obj);
            z74 z74VarB = ((q2b) bh3Var.b).b();
            zg3 zg3Var = new zg3(bh3Var, gj7Var, null);
            this.o = 1;
            obj = svi.i(z74VarB, zg3Var, this);
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
        eh9 eh9Var = (eh9) obj;
        qqg qqgVar = qqg.a;
        if (eh9Var != null && (w10VarD = eh9Var.a.d(s10.b)) != null && (d10Var = w10VarD.c) != null) {
            c10 c10Var = d10Var.a;
            int i2 = c10Var == null ? -1 : yg3.$EnumSwitchMapping$0[c10Var.ordinal()];
            if (i2 == 1 || i2 == 2 || i2 == 3) {
                ug3Var = new ug3(j);
            } else if (i2 == 4 || i2 == 5) {
                ug3Var = new vg3(j);
            }
            if (ug3Var != null) {
                bh3Var.a(ug3Var);
            }
        }
        return qqgVar;
    }
}
