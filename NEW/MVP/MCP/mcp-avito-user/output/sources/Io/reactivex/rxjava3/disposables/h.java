package io.reactivex.rxjava3.disposables;

/* compiled from: RunnableDisposable.java */
/* loaded from: classes8.dex */
final class h extends g<Runnable> {
    private static final long serialVersionUID = -8219729196779211169L;

    @Override // io.reactivex.rxjava3.disposables.g
    public final void a(@j41.e Runnable runnable) {
        runnable.run();
    }

    @Override // java.util.concurrent.atomic.AtomicReference
    public final String toString() {
        return "RunnableDisposable(disposed=" + i() + ", " + get() + ")";
    }
}
