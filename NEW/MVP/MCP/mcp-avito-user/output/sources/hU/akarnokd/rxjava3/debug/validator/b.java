package hu.akarnokd.rxjava3.debug.validator;

import hu.akarnokd.rxjava3.debug.validator.d;
import k41.AbstractC42503a;

/* compiled from: ConnectableFlowableValidator.java */
/* loaded from: classes8.dex */
final class b<T> extends AbstractC42503a<T> {

    /* renamed from: c, reason: collision with root package name */
    public final AbstractC42503a<T> f397853c;

    public b(AbstractC42503a abstractC42503a) {
        this.f397853c = abstractC42503a;
    }

    @Override // io.reactivex.rxjava3.core.AbstractC41777j
    public final void u(org.reactivestreams.d<? super T> dVar) {
        this.f397853c.q(new d.a(dVar));
    }
}
