package defpackage;

/* loaded from: classes.dex */
public final class k2a extends p1 implements Runnable {
    public final Runnable Z;

    public k2a(Runnable runnable) {
        runnable.getClass();
        this.Z = runnable;
    }

    @Override // defpackage.x1
    public final String i() {
        return "task=[" + this.Z + "]";
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.Z.run();
        } catch (Throwable th) {
            l(th);
            throw th;
        }
    }
}
