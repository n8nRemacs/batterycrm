package defpackage;

/* loaded from: classes.dex */
public final class gi5 extends hi5 {
    public final Runnable c;

    public gi5(Runnable runnable, long j) {
        super(j);
        this.c = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.c.run();
    }

    @Override // defpackage.hi5
    public final String toString() {
        return super.toString() + this.c;
    }
}
