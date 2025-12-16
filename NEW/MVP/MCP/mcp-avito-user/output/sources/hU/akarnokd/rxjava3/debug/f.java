package hu.akarnokd.rxjava3.debug;

import hu.akarnokd.rxjava3.debug.d;
import io.reactivex.rxjava3.core.AbstractC41777j;
import io.reactivex.rxjava3.internal.fuseable.ConditionalSubscriber;
import io.reactivex.rxjava3.internal.fuseable.ScalarSupplier;

/* compiled from: FlowableOnAssemblyScalarSupplier.java */
/* loaded from: classes8.dex */
final class f<T> extends AbstractC41777j<T> implements ScalarSupplier<T> {

    /* renamed from: c, reason: collision with root package name */
    public final AbstractC41777j f397826c;

    /* renamed from: d, reason: collision with root package name */
    public final RxJavaAssemblyException f397827d = new RxJavaAssemblyException();

    public f(AbstractC41777j abstractC41777j) {
        this.f397826c = abstractC41777j;
    }

    @Override // io.reactivex.rxjava3.core.AbstractC41777j
    public final void u(org.reactivestreams.d<? super T> dVar) {
        if (dVar instanceof ConditionalSubscriber) {
            this.f397826c.d(new d.a((ConditionalSubscriber) dVar, this.f397827d));
        } else {
            this.f397826c.d(new d.b(dVar, this.f397827d));
        }
    }
}
