package defpackage;

import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final class pgg extends h0e {
    public final PriorityBlockingQueue a = new PriorityBlockingQueue();
    public final AtomicInteger b = new AtomicInteger();
    public final AtomicInteger c = new AtomicInteger();
    public volatile boolean d;

    @Override // defpackage.h0e
    public final py4 b(Runnable runnable) {
        return f(runnable, h0e.a(TimeUnit.MILLISECONDS));
    }

    @Override // defpackage.h0e
    public final py4 c(Runnable runnable, long j, TimeUnit timeUnit) {
        long millis = timeUnit.toMillis(j) + h0e.a(TimeUnit.MILLISECONDS);
        return f(new lcf(runnable, this, millis), millis);
    }

    @Override // defpackage.py4
    public final void dispose() {
        this.d = true;
    }

    @Override // defpackage.py4
    public final boolean e() {
        return this.d;
    }

    public final py4 f(Runnable runnable, long j) {
        cd5 cd5Var = cd5.a;
        if (!this.d) {
            ogg oggVar = new ogg(runnable, Long.valueOf(j), this.c.incrementAndGet());
            this.a.add(oggVar);
            if (this.b.getAndIncrement() != 0) {
                return new z6(1, new c5e(this, oggVar, false, 6));
            }
            int iAddAndGet = 1;
            while (!this.d) {
                ogg oggVar2 = (ogg) this.a.poll();
                if (oggVar2 == null) {
                    iAddAndGet = this.b.addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                    }
                } else if (!oggVar2.d) {
                    oggVar2.a.run();
                }
            }
            this.a.clear();
            return cd5Var;
        }
        return cd5Var;
    }
}
