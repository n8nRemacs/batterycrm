package hu.akarnokd.rxjava3.debug;

import hu.akarnokd.rxjava3.debug.d;
import io.reactivex.rxjava3.internal.fuseable.ConditionalSubscriber;
import k41.AbstractC42503a;

/* compiled from: FlowableOnAssemblyConnectable.java */
/* loaded from: classes8.dex */
final class e<T> extends AbstractC42503a<T> {

    /* renamed from: c, reason: collision with root package name */
    public final AbstractC42503a<T> f397824c;

    /* renamed from: d, reason: collision with root package name */
    public final RxJavaAssemblyException f397825d = new RxJavaAssemblyException();

    public e(AbstractC42503a<T> abstractC42503a) {
        this.f397824c = abstractC42503a;
    }

    @Override // io.reactivex.rxjava3.core.AbstractC41777j
    public final void u(org.reactivestreams.d<? super T> dVar) {
        boolean z12 = dVar instanceof ConditionalSubscriber;
        RxJavaAssemblyException rxJavaAssemblyException = this.f397825d;
        AbstractC42503a<T> abstractC42503a = this.f397824c;
        if (z12) {
            abstractC42503a.q(new d.a((ConditionalSubscriber) dVar, rxJavaAssemblyException));
        } else {
            abstractC42503a.q(new d.b(dVar, rxJavaAssemblyException));
        }
    }
}
