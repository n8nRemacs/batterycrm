package defpackage;

import android.os.Handler;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public final class lcf implements Runnable {
    public final /* synthetic */ int a = 1;
    public long b;
    public final Object c;
    public final Object d;

    public lcf(y87 y87Var) {
        this.d = y87Var;
        this.c = new kcf(y87Var, this);
    }

    @Override // java.lang.Runnable
    public final void run() throws InterruptedException {
        switch (this.a) {
            case 0:
                y87 y87Var = (y87) this.d;
                ((em6) y87Var.h).invoke((kcf) this.c);
                ((Handler) y87Var.k).removeCallbacks(this);
                ((Handler) y87Var.k).postDelayed(this, 1000L);
                this.b++;
                break;
            default:
                if (!((pgg) this.d).d) {
                    long jA = h0e.a(TimeUnit.MILLISECONDS);
                    long j = this.b;
                    if (j > jA) {
                        try {
                            Thread.sleep(j - jA);
                        } catch (InterruptedException e) {
                            Thread.currentThread().interrupt();
                            t8j.a(e);
                            return;
                        }
                    }
                    if (!((pgg) this.d).d) {
                        ((Runnable) this.c).run();
                        break;
                    }
                }
                break;
        }
    }

    public lcf(Runnable runnable, pgg pggVar, long j) {
        this.c = runnable;
        this.d = pggVar;
        this.b = j;
    }
}
