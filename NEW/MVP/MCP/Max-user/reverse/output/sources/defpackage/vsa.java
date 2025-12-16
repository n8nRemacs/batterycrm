package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class vsa extends AtomicReference implements Runnable, gu3 {
    public final xsa a;
    public long b;
    public boolean c;
    public boolean d;

    public vsa(xsa xsaVar) {
        this.a = xsaVar;
    }

    @Override // defpackage.gu3
    public final void accept(Object obj) {
        ty4.d(this, (py4) obj);
        synchronized (this.a) {
            try {
                if (this.d) {
                    this.a.a.t();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.u(this);
    }
}
