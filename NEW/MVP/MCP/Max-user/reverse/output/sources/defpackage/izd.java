package defpackage;

/* loaded from: classes.dex */
public final class izd extends s0 implements Runnable {
    @Override // java.lang.Runnable
    public final void run() {
        this.c = Thread.currentThread();
        try {
            this.a.run();
            this.c = null;
        } catch (Throwable th) {
            dispose();
            this.c = null;
            t8j.a(th);
            throw th;
        }
    }
}
