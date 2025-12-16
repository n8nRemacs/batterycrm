package defpackage;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class ps7 extends h0e implements Runnable {
    public final os7 b;
    public final qs7 c;
    public final AtomicBoolean d = new AtomicBoolean();
    public final zl3 a = new zl3();

    public ps7(os7 os7Var) {
        qs7 qs7Var;
        qs7 qs7Var2;
        this.b = os7Var;
        if (os7Var.c.b) {
            qs7Var2 = rs7.h;
        } else {
            while (true) {
                if (os7Var.b.isEmpty()) {
                    qs7Var = new qs7(os7Var.X);
                    os7Var.c.a(qs7Var);
                    break;
                } else {
                    qs7Var = (qs7) os7Var.b.poll();
                    if (qs7Var != null) {
                        break;
                    }
                }
            }
            qs7Var2 = qs7Var;
        }
        this.c = qs7Var2;
    }

    @Override // defpackage.h0e
    public final py4 c(Runnable runnable, long j, TimeUnit timeUnit) {
        return this.a.b ? cd5.a : this.c.f(runnable, j, timeUnit, this.a);
    }

    @Override // defpackage.py4
    public final void dispose() {
        if (this.d.compareAndSet(false, true)) {
            this.a.dispose();
            if (rs7.i) {
                this.c.f(this, 0L, TimeUnit.NANOSECONDS, null);
                return;
            }
            os7 os7Var = this.b;
            os7Var.getClass();
            long jNanoTime = System.nanoTime() + os7Var.a;
            qs7 qs7Var = this.c;
            qs7Var.c = jNanoTime;
            os7Var.b.offer(qs7Var);
        }
    }

    @Override // defpackage.py4
    public final boolean e() {
        return this.d.get();
    }

    @Override // java.lang.Runnable
    public final void run() {
        os7 os7Var = this.b;
        os7Var.getClass();
        long jNanoTime = System.nanoTime() + os7Var.a;
        qs7 qs7Var = this.c;
        qs7Var.c = jNanoTime;
        os7Var.b.offer(qs7Var);
    }
}
