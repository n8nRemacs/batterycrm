package defpackage;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final class pc4 implements ThreadFactory {
    public final /* synthetic */ int a;
    public final String b;
    public final Object c;

    public pc4(String str, int i) {
        this.a = i;
        switch (i) {
            case 1:
                this.b = str;
                this.c = new AtomicInteger(1);
                break;
            case 2:
                this.c = Executors.defaultThreadFactory();
                this.b = str;
                break;
            default:
                this.c = new AtomicInteger(1);
                this.b = str;
                break;
        }
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        switch (this.a) {
            case 0:
                Thread thread = new Thread(runnable, xc0.e(((AtomicInteger) this.c).getAndIncrement(), this.b, "-"));
                thread.setDaemon(true);
                return thread;
            case 1:
                return new Thread(new d8c(this, 4, runnable), xc0.e(((AtomicInteger) this.c).getAndIncrement(), this.b, "-"));
            default:
                Thread threadNewThread = ((ThreadFactory) this.c).newThread(new twd(runnable, 3));
                threadNewThread.setName(this.b);
                return threadNewThread;
        }
    }
}
