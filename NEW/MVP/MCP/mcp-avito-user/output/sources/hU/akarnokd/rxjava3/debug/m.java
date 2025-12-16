package hu.akarnokd.rxjava3.debug;

import hu.akarnokd.rxjava3.debug.k;
import io.reactivex.rxjava3.core.G;
import io.reactivex.rxjava3.internal.fuseable.ScalarSupplier;

/* compiled from: ObservableOnAssemblyScalarSupplier.java */
/* loaded from: classes8.dex */
final class m<T> extends io.reactivex.rxjava3.core.z<T> implements ScalarSupplier<T> {

    /* renamed from: b, reason: collision with root package name */
    public final io.reactivex.rxjava3.core.z f397844b;

    /* renamed from: c, reason: collision with root package name */
    public final RxJavaAssemblyException f397845c = new RxJavaAssemblyException();

    public m(io.reactivex.rxjava3.core.z zVar) {
        this.f397844b = zVar;
    }

    @Override // io.reactivex.rxjava3.core.z
    public final void w0(G<? super T> g12) {
        this.f397844b.c(new k.a(g12, this.f397845c));
    }
}
