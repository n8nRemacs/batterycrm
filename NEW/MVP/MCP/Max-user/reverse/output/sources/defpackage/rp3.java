package defpackage;

import java.util.concurrent.CancellationException;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class rp3 extends dtf implements sm6 {
    public final /* synthetic */ vp3 X;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rp3(vp3 vp3Var, Continuation continuation) {
        super(2, continuation);
        this.X = vp3Var;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((rp3) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new rp3(this.X, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        int i = this.o;
        vp3 vp3Var = this.X;
        if (i == 0) {
            g8j.b(obj);
            z70 z70Var = (z70) vp3Var.Z.getValue();
            String str = vp3Var.o;
            this.o = 1;
            obj = z70Var.a(str, 2, this);
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
        y70 y70Var = (y70) obj;
        vp3Var.d = y70Var.c;
        long jI = v9j.i(y70Var.o, y65.MILLISECONDS);
        int i2 = s65.d;
        vp3Var.x0.m(null, new Long(s65.m(jI, y65.SECONDS)));
        x9f x9fVar = vp3Var.C0;
        if (x9fVar != null) {
            x9fVar.cancel((CancellationException) null);
        }
        vp3Var.C0 = xfh.o(vp3Var, null, new up3(vp3Var, null), 3);
        tw6 tw6Var = (tw6) vp3Var.t0.getValue();
        tw6Var.g = vp3Var.c;
        tw6Var.b();
        return qqg.a;
    }
}
