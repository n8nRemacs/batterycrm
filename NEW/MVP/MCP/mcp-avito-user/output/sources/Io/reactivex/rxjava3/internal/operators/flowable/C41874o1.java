package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.AbstractC41777j;
import io.reactivex.rxjava3.core.InterfaceC41782o;
import io.reactivex.rxjava3.internal.operators.flowable.C41862k1;
import io.reactivex.rxjava3.internal.subscriptions.EmptySubscription;
import java.util.Objects;

/* compiled from: FlowableRetryWhen.java */
/* renamed from: io.reactivex.rxjava3.internal.operators.flowable.o1, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41874o1<T> extends AbstractC41833b<T, T> {

    /* renamed from: d, reason: collision with root package name */
    public final l41.o<? super AbstractC41777j<Throwable>, ? extends org.reactivestreams.c<?>> f402926d;

    /* compiled from: FlowableRetryWhen.java */
    /* renamed from: io.reactivex.rxjava3.internal.operators.flowable.o1$a */
    public static final class a<T> extends C41862k1.c<T, Throwable> {
        private static final long serialVersionUID = -2680129890138081029L;

        public a() {
            throw null;
        }

        @Override // org.reactivestreams.d
        public final void e() {
            ((C41862k1.b) this.f402858l).cancel();
            this.f402856j.e();
        }
    }

    public C41874o1(AbstractC41777j<T> abstractC41777j, l41.o<? super AbstractC41777j<Throwable>, ? extends org.reactivestreams.c<?>> oVar) {
        super(abstractC41777j);
        this.f402926d = oVar;
    }

    @Override // io.reactivex.rxjava3.core.AbstractC41777j
    public final void u(org.reactivestreams.d<? super T> dVar) {
        io.reactivex.rxjava3.subscribers.e eVar = new io.reactivex.rxjava3.subscribers.e((InterfaceC41782o) dVar);
        io.reactivex.rxjava3.internal.functions.b.a(8, "capacityHint");
        io.reactivex.rxjava3.processors.c<T> cVarZ = new io.reactivex.rxjava3.processors.h(8, null).z();
        try {
            org.reactivestreams.c<?> cVarApply = this.f402926d.apply(cVarZ);
            Objects.requireNonNull(cVarApply, "handler returned a null Publisher");
            org.reactivestreams.c<?> cVar = cVarApply;
            C41862k1.b bVar = new C41862k1.b(this.f402624c);
            a aVar = new a(eVar, cVarZ, bVar);
            bVar.f402855e = aVar;
            dVar.K(aVar);
            cVar.d(bVar);
            bVar.onNext(0);
        } catch (Throwable th2) {
            io.reactivex.rxjava3.exceptions.a.a(th2);
            EmptySubscription.b(th2, dVar);
        }
    }
}
