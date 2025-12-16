package androidx.core.os;

import android.os.CancellationSignal;
import j.P;

/* compiled from: CancellationSignal.java */
@Deprecated
/* renamed from: androidx.core.os.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C22778f {

    /* renamed from: a, reason: collision with root package name */
    public boolean f44798a;

    /* renamed from: b, reason: collision with root package name */
    public a f44799b;

    /* renamed from: c, reason: collision with root package name */
    public CancellationSignal f44800c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f44801d;

    /* compiled from: CancellationSignal.java */
    /* renamed from: androidx.core.os.f$a */
    public interface a {
        void onCancel();
    }

    public final void a() {
        synchronized (this) {
            try {
                if (this.f44798a) {
                    return;
                }
                this.f44798a = true;
                this.f44801d = true;
                a aVar = this.f44799b;
                CancellationSignal cancellationSignal = this.f44800c;
                if (aVar != null) {
                    try {
                        aVar.onCancel();
                    } catch (Throwable th2) {
                        synchronized (this) {
                            this.f44801d = false;
                            notifyAll();
                            throw th2;
                        }
                    }
                }
                if (cancellationSignal != null) {
                    cancellationSignal.cancel();
                }
                synchronized (this) {
                    this.f44801d = false;
                    notifyAll();
                }
            } finally {
            }
        }
    }

    @P
    public final Object b() {
        CancellationSignal cancellationSignal;
        synchronized (this) {
            try {
                if (this.f44800c == null) {
                    CancellationSignal cancellationSignal2 = new CancellationSignal();
                    this.f44800c = cancellationSignal2;
                    if (this.f44798a) {
                        cancellationSignal2.cancel();
                    }
                }
                cancellationSignal = this.f44800c;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return cancellationSignal;
    }

    public final void c(@P a aVar) {
        synchronized (this) {
            while (this.f44801d) {
                try {
                    try {
                        wait();
                    } catch (InterruptedException unused) {
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            if (this.f44799b == aVar) {
                return;
            }
            this.f44799b = aVar;
            if (this.f44798a) {
                aVar.onCancel();
            }
        }
    }
}
