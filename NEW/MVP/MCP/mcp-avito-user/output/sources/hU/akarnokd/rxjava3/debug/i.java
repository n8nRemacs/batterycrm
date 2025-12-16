package hu.akarnokd.rxjava3.debug;

import hu.akarnokd.rxjava3.debug.h;
import io.reactivex.rxjava3.internal.fuseable.ScalarSupplier;

/* compiled from: MaybeOnAssemblyScalarSupplier.java */
/* loaded from: classes8.dex */
final class i<T> extends io.reactivex.rxjava3.core.q<T> implements ScalarSupplier<T> {

    /* renamed from: b, reason: collision with root package name */
    public final io.reactivex.rxjava3.core.q f397835b;

    /* renamed from: c, reason: collision with root package name */
    public final RxJavaAssemblyException f397836c = new RxJavaAssemblyException();

    public i(io.reactivex.rxjava3.core.q qVar) {
        this.f397835b = qVar;
    }

    @Override // io.reactivex.rxjava3.core.q
    public final void o(io.reactivex.rxjava3.core.t<? super T> tVar) {
        this.f397835b.a(new h.a(tVar, this.f397836c));
    }
}
