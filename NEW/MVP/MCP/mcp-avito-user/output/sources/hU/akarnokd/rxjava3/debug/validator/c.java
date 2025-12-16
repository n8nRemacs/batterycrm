package hu.akarnokd.rxjava3.debug.validator;

import hu.akarnokd.rxjava3.debug.validator.f;
import io.reactivex.rxjava3.core.G;
import p41.AbstractC46894a;

/* compiled from: ConnectableObservableValidator.java */
/* loaded from: classes8.dex */
final class c<T> extends AbstractC46894a<T> {

    /* renamed from: b, reason: collision with root package name */
    public final AbstractC46894a<T> f397854b;

    public c(AbstractC46894a abstractC46894a) {
        this.f397854b = abstractC46894a;
    }

    @Override // p41.AbstractC46894a
    public final void O0(l41.g<? super io.reactivex.rxjava3.disposables.d> gVar) {
        this.f397854b.O0(gVar);
    }

    @Override // p41.AbstractC46894a
    public final void P0() {
        this.f397854b.P0();
    }

    @Override // io.reactivex.rxjava3.core.z
    public final void w0(G<? super T> g12) {
        this.f397854b.c(new f.a(g12));
    }
}
