package defpackage;

import android.os.Handler;
import java.util.concurrent.CountDownLatch;

/* loaded from: classes2.dex */
public final /* synthetic */ class p2e implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ q2e b;

    public /* synthetic */ p2e(q2e q2eVar, int i) {
        this.a = i;
        this.b = q2eVar;
    }

    @Override // java.lang.Runnable
    public final void run() throws InterruptedException {
        switch (this.a) {
            case 0:
                q2e q2eVar = this.b;
                if (q2eVar.Y) {
                    mj6 mj6Var = q2eVar.d;
                    if (mj6Var != null) {
                        mj6Var.d.c(new lj6(mj6Var, 0));
                    }
                    qj6 qj6Var = q2eVar.o;
                    if (qj6Var != null) {
                        qj6Var.c.c(new pj6(qj6Var, 1));
                    }
                    if (q2eVar.X != null) {
                        q2eVar.X.c(false);
                    }
                }
                mj6 mj6Var2 = q2eVar.d;
                if (mj6Var2 != null) {
                    mj6Var2.Y = null;
                    mj6Var2.d.a(new lj6(mj6Var2, 1));
                }
                qj6 qj6Var2 = q2eVar.o;
                if (qj6Var2 != null) {
                    qj6Var2.c.c(new pj6(qj6Var2, 1));
                    qj6Var2.c.a(new pj6(qj6Var2, 2));
                }
                if (q2eVar.X != null) {
                    q2eVar.X.c(false);
                }
                mj6 mj6Var3 = q2eVar.d;
                if (mj6Var3 != null) {
                    u44 u44Var = mj6Var3.d;
                    u44Var.getClass();
                    try {
                        ((CountDownLatch) u44Var.d).await();
                    } catch (InterruptedException unused) {
                    }
                }
                q2eVar.d = null;
                q2eVar.o = null;
                q2eVar.X = null;
                q2eVar.c = true;
                break;
            case 1:
                q2e q2eVar2 = this.b;
                mj6 mj6Var4 = q2eVar2.d;
                if (mj6Var4 != null) {
                    mj6Var4.d.c(new lj6(mj6Var4, 0));
                }
                qj6 qj6Var3 = q2eVar2.o;
                if (qj6Var3 != null) {
                    qj6Var3.c.c(new pj6(qj6Var3, 1));
                }
                if (q2eVar2.X != null) {
                    q2eVar2.X.c(false);
                    break;
                }
                break;
            default:
                q2e q2eVar3 = this.b;
                double dB = q2eVar3.d.Z.b();
                double dB2 = q2eVar3.o.t0.b();
                double dB3 = q2eVar3.o.u0.b();
                double dB4 = q2eVar3.X.f.b();
                q2eVar3.a.log("SSStat", "capturer: " + dB + " , encoder: " + dB2 + " | " + dB3 + " , sender: " + dB4);
                ((Handler) q2eVar3.b.b).postDelayed(q2eVar3.Z, 1000L);
                break;
        }
    }
}
