package hu.akarnokd.rxjava3.debug;

import hu.akarnokd.rxjava3.debug.h;

/* compiled from: MaybeOnAssemblySupplier.java */
/* loaded from: classes8.dex */
final class j<T> extends io.reactivex.rxjava3.core.q<T> implements l41.s<T> {

    /* renamed from: b, reason: collision with root package name */
    public final io.reactivex.rxjava3.core.q f397837b;

    /* renamed from: c, reason: collision with root package name */
    public final RxJavaAssemblyException f397838c = new RxJavaAssemblyException();

    public j(io.reactivex.rxjava3.core.q qVar) {
        this.f397837b = qVar;
    }

    @Override // l41.s
    public final T get() throws Exception {
        try {
            return (T) ((l41.s) this.f397837b).get();
        } catch (Throwable th2) {
            io.reactivex.rxjava3.exceptions.a.a(th2);
            this.f397838c.a(th2);
            throw th2;
        }
    }

    @Override // io.reactivex.rxjava3.core.q
    public final void o(io.reactivex.rxjava3.core.t<? super T> tVar) {
        this.f397837b.a(new h.a(tVar, this.f397838c));
    }
}
