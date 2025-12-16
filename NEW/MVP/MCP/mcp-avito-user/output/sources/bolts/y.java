package bolts;

/* compiled from: TaskCompletionSource.java */
/* loaded from: classes10.dex */
public class y<TResult> {

    /* renamed from: a, reason: collision with root package name */
    public final x<TResult> f57489a = new x<>();

    public final void a() {
        if (!this.f57489a.j()) {
            throw new IllegalStateException("Cannot cancel a completed task.");
        }
    }

    public final void b(Exception exc) {
        x<TResult> xVar = this.f57489a;
        synchronized (xVar.f57483a) {
            try {
                if (xVar.f57484b) {
                    throw new IllegalStateException("Cannot set the error on a completed task.");
                }
                xVar.f57484b = true;
                xVar.f57487e = exc;
                xVar.f57483a.notifyAll();
                xVar.i();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void c(TResult tresult) {
        if (!this.f57489a.k(tresult)) {
            throw new IllegalStateException("Cannot set the result of a completed task.");
        }
    }
}
