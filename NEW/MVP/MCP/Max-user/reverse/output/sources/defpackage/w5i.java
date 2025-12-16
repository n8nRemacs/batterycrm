package defpackage;

/* loaded from: classes.dex */
public final class w5i implements Runnable {
    public final x5i a;
    public final v4i b;

    public w5i(x5i x5iVar, v4i v4iVar) {
        this.a = x5iVar;
        this.b = v4iVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.a.d) {
            try {
                if (((w5i) this.a.b.remove(this.b)) != null) {
                    v5i v5iVar = (v5i) this.a.c.remove(this.b);
                    if (v5iVar != null) {
                        v4i v4iVar = this.b;
                        ps4 ps4Var = (ps4) v5iVar;
                        cei.g().c(ps4.w0, "Exceeded time limits on execution for " + v4iVar);
                        ps4Var.Z.execute(new os4(ps4Var, 0));
                    }
                } else {
                    cei.g().c("WrkTimerRunnable", "Timer with " + this.b + " is already marked as complete.");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
