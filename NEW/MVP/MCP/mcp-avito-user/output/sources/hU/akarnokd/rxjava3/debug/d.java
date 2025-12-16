package hu.akarnokd.rxjava3.debug;

import io.reactivex.rxjava3.core.AbstractC41777j;
import io.reactivex.rxjava3.internal.fuseable.ConditionalSubscriber;
import io.reactivex.rxjava3.internal.fuseable.QueueSubscription;

/* compiled from: FlowableOnAssembly.java */
/* loaded from: classes8.dex */
final class d<T> extends AbstractC41777j<T> {

    /* renamed from: c, reason: collision with root package name */
    public final AbstractC41777j f397820c;

    /* renamed from: d, reason: collision with root package name */
    public final RxJavaAssemblyException f397821d = new RxJavaAssemblyException();

    /* compiled from: FlowableOnAssembly.java */
    public static final class a<T> extends io.reactivex.rxjava3.internal.subscribers.a<T, T> {

        /* renamed from: g, reason: collision with root package name */
        public final RxJavaAssemblyException f397822g;

        public a(ConditionalSubscriber<? super T> conditionalSubscriber, RxJavaAssemblyException rxJavaAssemblyException) {
            super(conditionalSubscriber);
            this.f397822g = rxJavaAssemblyException;
        }

        @Override // q41.InterfaceC47198a
        public final boolean P(T t12) {
            return this.downstream.tryOnNext(t12);
        }

        @Override // io.reactivex.rxjava3.internal.subscribers.a, org.reactivestreams.d
        public final void onError(Throwable th2) {
            ConditionalSubscriber conditionalSubscriber = this.downstream;
            this.f397822g.a(th2);
            conditionalSubscriber.onError(th2);
        }

        @Override // io.reactivex.rxjava3.internal.subscribers.a, org.reactivestreams.d
        public final void onNext(T t12) {
            this.downstream.onNext(t12);
        }

        @Override // q41.g
        public final T poll() {
            return (T) this.qs.poll();
        }

        @Override // io.reactivex.rxjava3.internal.subscribers.a, q41.InterfaceC47200c
        public final int v(int i12) {
            QueueSubscription queueSubscription = this.qs;
            if (queueSubscription == null) {
                return 0;
            }
            int iRequestFusion = queueSubscription.requestFusion(i12);
            this.f404773f = iRequestFusion;
            return iRequestFusion;
        }
    }

    /* compiled from: FlowableOnAssembly.java */
    public static final class b<T> extends io.reactivex.rxjava3.internal.subscribers.b<T, T> {

        /* renamed from: g, reason: collision with root package name */
        public final RxJavaAssemblyException f397823g;

        public b(org.reactivestreams.d<? super T> dVar, RxJavaAssemblyException rxJavaAssemblyException) {
            super(dVar);
            this.f397823g = rxJavaAssemblyException;
        }

        @Override // io.reactivex.rxjava3.internal.subscribers.b, org.reactivestreams.d
        public final void onError(Throwable th2) {
            this.f397823g.a(th2);
            this.f404774b.onError(th2);
        }

        @Override // org.reactivestreams.d
        public final void onNext(T t12) {
            this.f404774b.onNext(t12);
        }

        @Override // q41.g
        public final T poll() {
            return (T) this.qs.poll();
        }

        @Override // io.reactivex.rxjava3.internal.subscribers.b, q41.InterfaceC47200c
        public final int v(int i12) {
            QueueSubscription queueSubscription = this.qs;
            if (queueSubscription == null) {
                return 0;
            }
            int iRequestFusion = queueSubscription.requestFusion(i12);
            this.f404778f = iRequestFusion;
            return iRequestFusion;
        }
    }

    public d(AbstractC41777j abstractC41777j) {
        this.f397820c = abstractC41777j;
    }

    @Override // io.reactivex.rxjava3.core.AbstractC41777j
    public final void u(org.reactivestreams.d<? super T> dVar) {
        boolean z12 = dVar instanceof ConditionalSubscriber;
        RxJavaAssemblyException rxJavaAssemblyException = this.f397821d;
        AbstractC41777j abstractC41777j = this.f397820c;
        if (z12) {
            abstractC41777j.d(new a((ConditionalSubscriber) dVar, rxJavaAssemblyException));
        } else {
            abstractC41777j.d(new b(dVar, rxJavaAssemblyException));
        }
    }
}
