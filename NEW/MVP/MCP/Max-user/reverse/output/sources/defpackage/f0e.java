package defpackage;

/* loaded from: classes.dex */
public final class f0e implements py4, Runnable {
    public final Runnable a;
    public final h0e b;
    public Thread c;

    public f0e(Runnable runnable, h0e h0eVar) {
        this.a = runnable;
        this.b = h0eVar;
    }

    @Override // defpackage.py4
    public final void dispose() {
        if (this.c == Thread.currentThread()) {
            h0e h0eVar = this.b;
            if (h0eVar instanceof eha) {
                eha ehaVar = (eha) h0eVar;
                if (ehaVar.b) {
                    return;
                }
                ehaVar.b = true;
                ehaVar.a.shutdown();
                return;
            }
        }
        this.b.dispose();
    }

    @Override // defpackage.py4
    public final boolean e() {
        return this.b.e();
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.c = Thread.currentThread();
        try {
            this.a.run();
        } finally {
        }
    }
}
