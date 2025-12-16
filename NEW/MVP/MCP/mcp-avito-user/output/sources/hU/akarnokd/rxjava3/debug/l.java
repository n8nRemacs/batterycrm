package hu.akarnokd.rxjava3.debug;

import hu.akarnokd.rxjava3.debug.k;
import io.reactivex.rxjava3.core.G;
import p41.AbstractC46894a;

/* compiled from: ObservableOnAssemblyConnectable.java */
/* loaded from: classes8.dex */
final class l<T> extends AbstractC46894a<T> {

    /* renamed from: b, reason: collision with root package name */
    public final AbstractC46894a<T> f397842b;

    /* renamed from: c, reason: collision with root package name */
    public final RxJavaAssemblyException f397843c = new RxJavaAssemblyException();

    public l(AbstractC46894a<T> abstractC46894a) {
        this.f397842b = abstractC46894a;
    }

    @Override // p41.AbstractC46894a
    public final void O0(l41.g<? super io.reactivex.rxjava3.disposables.d> gVar) {
        this.f397842b.O0(gVar);
    }

    @Override // p41.AbstractC46894a
    public final void P0() {
        this.f397842b.P0();
    }

    @Override // io.reactivex.rxjava3.core.z
    public final void w0(G<? super T> g12) {
        this.f397842b.c(new k.a(g12, this.f397843c));
    }
}
