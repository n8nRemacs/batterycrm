package defpackage;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class uee implements Executor {
    public final /* synthetic */ int a;
    public final Executor b;
    public final ArrayDeque c;
    public Runnable d;
    public final Object o;

    public uee(Executor executor, int i) {
        this.a = i;
        switch (i) {
            case 1:
                this.b = executor;
                this.c = new ArrayDeque();
                this.o = new Object();
                break;
            default:
                this.b = executor;
                this.c = new ArrayDeque();
                this.o = new Object();
                break;
        }
    }

    public final void a() {
        switch (this.a) {
            case 0:
                Runnable runnable = (Runnable) this.c.poll();
                this.d = runnable;
                if (runnable != null) {
                    this.b.execute(runnable);
                    return;
                }
                return;
            default:
                synchronized (this.o) {
                    Object objPoll = this.c.poll();
                    Runnable runnable2 = (Runnable) objPoll;
                    this.d = runnable2;
                    if (objPoll != null) {
                        this.b.execute(runnable2);
                    }
                }
                return;
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.a) {
            case 0:
                synchronized (this.o) {
                    try {
                        this.c.add(new c5e(this, 1, runnable));
                        if (this.d == null) {
                            a();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
            default:
                synchronized (this.o) {
                    this.c.offer(new aee(runnable, 26, this));
                    if (this.d == null) {
                        a();
                    }
                }
                return;
        }
    }
}
