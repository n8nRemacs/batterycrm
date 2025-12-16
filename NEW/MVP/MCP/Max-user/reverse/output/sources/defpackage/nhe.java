package defpackage;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public final class nhe extends ehe {
    public xt4 x0;

    @Override // defpackage.ehe, defpackage.ghe
    public final long w(pb2 pb2Var, long j) throws Throwable {
        kx5 kx5Var;
        w10 w10VarD;
        long jW;
        xt4 xt4Var = this.x0;
        jx5 jx5Var = jx5.a;
        if (xt4Var != null) {
            ((CountDownLatch) xt4Var.b).await(8000L, TimeUnit.MILLISECONDS);
            kx5Var = (kx5) ((AtomicReference) xt4Var.c).get();
            if (kx5Var == null) {
                kx5Var = jx5Var;
            }
        } else {
            kx5Var = null;
        }
        if (fni.a(kx5Var, jx5Var)) {
            jW = super.w(pb2Var, j);
        } else {
            si9 si9VarM = m().m(j);
            if (si9VarM == null || (w10VarD = si9VarM.d(s10.d)) == null) {
                return 0L;
            }
            l().q(si9VarM, w10VarD.r, p10.d);
            jW = 0;
        }
        this.x0 = null;
        return jW;
    }
}
