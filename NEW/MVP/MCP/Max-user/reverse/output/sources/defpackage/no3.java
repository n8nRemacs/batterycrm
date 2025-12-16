package defpackage;

import java.io.Serializable;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final class no3 implements ThreadFactory {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final Serializable c;

    public no3(String str, boolean z) {
        this.a = 1;
        this.c = str;
        this.b = z;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        switch (this.a) {
            case 0:
                StringBuilder sbM = az1.m(this.b ? "WM.task-" : "androidx.work-");
                sbM.append(((AtomicInteger) this.c).incrementAndGet());
                return new Thread(runnable, sbM.toString());
            default:
                Thread thread = new Thread(runnable, (String) this.c);
                thread.setDaemon(this.b);
                return thread;
        }
    }

    public no3(boolean z) {
        this.a = 0;
        this.b = z;
        this.c = new AtomicInteger(0);
    }
}
