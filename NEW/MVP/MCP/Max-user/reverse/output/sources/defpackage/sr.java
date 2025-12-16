package defpackage;

import android.content.Context;
import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class sr extends dtf implements sm6 {
    public final /* synthetic */ xr X;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sr(xr xrVar, Continuation continuation) {
        super(2, continuation);
        this.X = xrVar;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((sr) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new sr(this.X, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        int i = this.o;
        xr xrVar = this.X;
        if (i == 0) {
            g8j.b(obj);
            this.o = 1;
            yy7[] yy7VarArr = xr.I0;
            obj = svi.i(((q2b) xrVar.z()).a(), new rr(xrVar, null), this);
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
        pb2 pb2Var = (pb2) obj;
        yy7[] yy7VarArr2 = xr.I0;
        k18 k18Var = xrVar.X;
        k18 k18Var2 = xrVar.v0;
        k18 k18Var3 = xrVar.X;
        eh9 eh9VarT = xr.t(xrVar, -3, z7.e((Context) k18Var.getValue(), lwa.e), null, true);
        String strE = z7.e((Context) k18Var3.getValue(), lwa.g);
        x8d x8dVar = new x8d(((f7b) k18Var2.getValue()).j.e("🔥"));
        g9d g9dVar = g9d.b;
        return new qt2(pb2Var, eh9VarT, xr.t(xrVar, -1, z7.e((Context) k18Var3.getValue(), lwa.f), null, true), xr.t(xrVar, -2, strE, new xl9(ve3.j(new wl9(new f9d(g9dVar, x8dVar), 1), new wl9(new f9d(g9dVar, new x8d(((f7b) k18Var2.getValue()).j.e("❤️"))), 1)), 2, null), false), ghh.o, (gr9) xrVar.t0.getValue(), xrVar.z0.k().a());
    }
}
