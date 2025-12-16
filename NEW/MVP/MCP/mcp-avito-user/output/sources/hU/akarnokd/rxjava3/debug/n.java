package hu.akarnokd.rxjava3.debug;

import hu.akarnokd.rxjava3.debug.k;
import io.reactivex.rxjava3.core.G;

/* compiled from: ObservableOnAssemblySupplier.java */
/* loaded from: classes8.dex */
final class n<T> extends io.reactivex.rxjava3.core.z<T> implements l41.s<T> {

    /* renamed from: b, reason: collision with root package name */
    public final io.reactivex.rxjava3.core.z f397847b;

    /* renamed from: c, reason: collision with root package name */
    public final RxJavaAssemblyException f397848c = new RxJavaAssemblyException();

    public n(io.reactivex.rxjava3.core.z zVar) {
        this.f397847b = zVar;
    }

    @Override // l41.s
    public final T get() {
        try {
            return (T) ((l41.s) this.f397847b).get();
        } catch (Throwable th2) {
            io.reactivex.rxjava3.exceptions.a.a(th2);
            this.f397848c.a(th2);
            throw th2;
        }
    }

    @Override // io.reactivex.rxjava3.core.z
    public final void w0(G<? super T> g12) {
        this.f397847b.c(new k.a(g12, this.f397848c));
    }
}
