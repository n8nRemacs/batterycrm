package io.reactivex.rxjava3.disposables;

/* compiled from: AutoCloseableDisposable.java */
/* loaded from: classes8.dex */
final class b extends g<AutoCloseable> {
    private static final long serialVersionUID = -6646144244598696847L;

    @Override // io.reactivex.rxjava3.disposables.g
    public final void a(@j41.e AutoCloseable autoCloseable) {
        try {
            autoCloseable.close();
        } catch (Throwable th2) {
            throw io.reactivex.rxjava3.internal.util.h.f(th2);
        }
    }

    @Override // java.util.concurrent.atomic.AtomicReference
    public final String toString() {
        return "AutoCloseableDisposable(disposed=" + i() + ", " + get() + ")";
    }
}
