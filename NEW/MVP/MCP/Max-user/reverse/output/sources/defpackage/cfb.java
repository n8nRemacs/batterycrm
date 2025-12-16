package defpackage;

import java.lang.Thread;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes2.dex */
public final class cfb implements ThreadFactory {
    public final String a;
    public final Thread.UncaughtExceptionHandler b;
    public final int c;
    public final s7g d;
    public final AtomicInteger o = new AtomicInteger(1);

    public cfb(String str, Thread.UncaughtExceptionHandler uncaughtExceptionHandler, int i, s7g s7gVar, fmf fmfVar) {
        this.a = str;
        this.b = uncaughtExceptionHandler;
        this.c = i;
        this.d = s7gVar;
        new bwf(new nwa(29));
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        bfb bfbVar = new bfb(runnable, xc0.e(this.o.getAndIncrement(), this.a, "-"));
        bfbVar.setUncaughtExceptionHandler(this.b);
        bfbVar.setPriority(this.c);
        bfbVar.b = this.d;
        return bfbVar;
    }
}
