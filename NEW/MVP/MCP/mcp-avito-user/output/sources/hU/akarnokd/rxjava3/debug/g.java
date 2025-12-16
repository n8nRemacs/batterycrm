package hu.akarnokd.rxjava3.debug;

import hu.akarnokd.rxjava3.debug.d;
import io.reactivex.rxjava3.core.AbstractC41777j;
import io.reactivex.rxjava3.internal.fuseable.ConditionalSubscriber;

/* compiled from: FlowableOnAssemblySupplier.java */
/* loaded from: classes8.dex */
final class g<T> extends AbstractC41777j<T> implements l41.s<T> {

    /* renamed from: c, reason: collision with root package name */
    public final AbstractC41777j f397828c;

    /* renamed from: d, reason: collision with root package name */
    public final RxJavaAssemblyException f397829d = new RxJavaAssemblyException();

    public g(AbstractC41777j abstractC41777j) {
        this.f397828c = abstractC41777j;
    }

    @Override // l41.s
    public final T get() {
        try {
            return (T) ((l41.s) this.f397828c).get();
        } catch (Throwable th2) {
            io.reactivex.rxjava3.exceptions.a.a(th2);
            this.f397829d.a(th2);
            throw th2;
        }
    }

    @Override // io.reactivex.rxjava3.core.AbstractC41777j
    public final void u(org.reactivestreams.d<? super T> dVar) {
        boolean z12 = dVar instanceof ConditionalSubscriber;
        RxJavaAssemblyException rxJavaAssemblyException = this.f397829d;
        AbstractC41777j abstractC41777j = this.f397828c;
        if (z12) {
            abstractC41777j.d(new d.a((ConditionalSubscriber) dVar, rxJavaAssemblyException));
        } else {
            abstractC41777j.d(new d.b(dVar, rxJavaAssemblyException));
        }
    }
}
