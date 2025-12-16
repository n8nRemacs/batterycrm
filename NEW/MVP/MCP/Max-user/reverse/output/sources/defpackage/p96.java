package defpackage;

import android.net.Uri;
import java.util.Set;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class p96 extends dtf implements sm6 {
    public final /* synthetic */ ca6 X;
    public final /* synthetic */ k18 Y;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p96(ca6 ca6Var, k18 k18Var, Continuation continuation) {
        super(2, continuation);
        this.X = ca6Var;
        this.Y = k18Var;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((p96) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new p96(this.X, this.Y, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        Object objH;
        ku3 ku3VarN;
        qqg qqgVar = qqg.a;
        g84 g84Var = g84.a;
        int i = this.o;
        int i2 = 1;
        if (i == 0) {
            g8j.b(obj);
            ca6 ca6Var = this.X;
            yy7[] yy7VarArr = ca6.H0;
            w63 w63Var = (w63) ca6Var.v0.getValue();
            long j = this.X.c;
            this.o = 1;
            objH = w63Var.h(j, this);
            if (objH == g84Var) {
                return g84Var;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            g8j.b(obj);
            objH = obj;
        }
        pb2 pb2Var = (pb2) objH;
        f86 f86Var = this.X.E0;
        Set set = f86Var != null ? f86Var.s0 : null;
        if (set == null) {
            set = rd5.a;
        }
        g96 g96Var = new g96(null, !set.contains(ra6.d));
        if (pb2Var == null) {
            this.X.z0.m(null, ve3.j(g96Var, new ga6(2)));
            return qqgVar;
        }
        this.X.C0.updateAndGet(new nb2(pb2Var, i2));
        k18 k18Var = this.Y;
        o98 o98VarD = ve3.d();
        o98VarD.add(g96Var);
        o98VarD.add(new ga6(536870914));
        Uri uriW = ca6.w(pb2Var);
        long j2 = pb2Var.b.a;
        String string = uriW != null ? uriW.toString() : null;
        ((ij2) k18Var.getValue()).getClass();
        pb2Var.p0();
        CharSequence charSequence = pb2Var.t0;
        long jH = pb2Var.h();
        pb2Var.q0();
        o98VarD.add(new ha6(j2, string, charSequence, jH, pb2Var.w0, pb2Var.b0() || ((ku3VarN = pb2Var.n()) != null && ku3VarN.x()), -2147483644));
        this.X.z0.setValue(ve3.a(o98VarD));
        return qqgVar;
    }
}
