package defpackage;

import android.os.Handler;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class c07 implements Runnable, py4 {
    public final /* synthetic */ int a = 0;
    public volatile boolean b;
    public final Object c;
    public final Object d;

    public c07(Handler handler, Runnable runnable) {
        this.c = handler;
        this.d = runnable;
    }

    @Override // defpackage.py4
    public final void dispose() {
        switch (this.a) {
            case 0:
                ((Handler) this.c).removeCallbacks(this);
                this.b = true;
                break;
            default:
                this.b = true;
                ((h0e) this.d).dispose();
                break;
        }
    }

    @Override // defpackage.py4
    public final boolean e() {
        switch (this.a) {
        }
        return this.b;
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Runnable, java.util.concurrent.atomic.AtomicReference] */
    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                try {
                    ((Runnable) this.d).run();
                    return;
                } catch (Throwable th) {
                    t8j.a(th);
                    return;
                }
            default:
                if (this.b) {
                    return;
                }
                try {
                    ((AtomicReference) this.c).run();
                    return;
                } catch (Throwable th2) {
                    dispose();
                    t8j.a(th2);
                    throw th2;
                }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public c07(Runnable runnable, h0e h0eVar) {
        this.c = (AtomicReference) runnable;
        this.d = h0eVar;
    }
}
