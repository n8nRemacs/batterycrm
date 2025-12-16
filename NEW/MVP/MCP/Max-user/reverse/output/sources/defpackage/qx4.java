package defpackage;

import com.facebook.imagepipeline.producers.DiskCacheDecision$DiskCacheDecisionNoDiskCacheChosenException;
import java.io.IOException;
import java.util.HashMap;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class qx4 extends ws4 {
    public final oac c;
    public final brf d;
    public final kk4 e;

    public qx4(hj0 hj0Var, oac oacVar, brf brfVar, kk4 kk4Var) {
        super(hj0Var);
        this.c = oacVar;
        this.d = brfVar;
        this.e = kk4Var;
    }

    /* JADX WARN: Type inference failed for: r7v5, types: [java.lang.Object, k18] */
    /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.Object, k18] */
    @Override // defpackage.hj0
    public final void h(int i, Object obj) throws IOException {
        ce5 ce5Var = (ce5) obj;
        hj0 hj0Var = this.b;
        oac oacVar = this.c;
        mk0 mk0Var = (mk0) oacVar;
        rac racVar = mk0Var.c;
        rac racVar2 = mk0Var.c;
        racVar.j(oacVar, "DiskCacheWriteProducer");
        if (!hj0.b(i) && ce5Var != null && (i & 10) == 0) {
            ce5Var.i0();
            if (ce5Var.b != me7.c) {
                rf7 rf7Var = mk0Var.a;
                kk4 kk4Var = this.e;
                kk4Var.getClass();
                c1f c1fVarS = kk4Var.s(rf7Var.b);
                tx4 tx4Var = (tx4) this.d.get();
                uv0 uv0VarA = g9j.a(rf7Var, (uv0) tx4Var.d.getValue(), tx4Var.a(), (bh7) tx4Var.f.getValue());
                if (uv0VarA == null) {
                    racVar2.d(oacVar, "DiskCacheWriteProducer", new DiskCacheDecision$DiskCacheDecisionNoDiskCacheChosenException("Got no disk cache for CacheChoice: " + Integer.valueOf(rf7Var.a.ordinal()).toString()), null);
                    hj0Var.g(i, ce5Var);
                    return;
                }
                Executor executor = uv0VarA.e;
                t9f t9fVar = uv0VarA.g;
                ml6.i();
                if (!ce5.h0(ce5Var)) {
                    throw new IllegalStateException("Check failed.");
                }
                synchronized (t9fVar) {
                    if (!ce5.h0(ce5Var)) {
                        throw new IllegalArgumentException();
                    }
                    ce5.d((ce5) ((HashMap) t9fVar.b).put(c1fVarS, ce5.c(ce5Var)));
                    t9fVar.q();
                }
                ce5 ce5VarC = ce5.c(ce5Var);
                try {
                    executor.execute(new cj(uv0VarA, c1fVarS, ce5VarC, 5));
                } catch (Exception e) {
                    op5.l(e, "Failed to schedule disk-cache write for %s", c1fVarS.a);
                    t9fVar.z(c1fVarS, ce5Var);
                    ce5.d(ce5VarC);
                }
                racVar2.a(oacVar, "DiskCacheWriteProducer", null);
                hj0Var.g(i, ce5Var);
                return;
            }
        }
        racVar2.a(oacVar, "DiskCacheWriteProducer", null);
        hj0Var.g(i, ce5Var);
    }
}
