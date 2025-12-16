package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.InterfaceC41782o;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.atomic.AtomicBoolean;
import s41.C47998a;

/* compiled from: FlowableUnsubscribeOn.java */
/* loaded from: classes8.dex */
public final class Y1<T> extends AbstractC41833b<T, T> {

    /* compiled from: FlowableUnsubscribeOn.java */
    public static final class a<T> extends AtomicBoolean implements InterfaceC41782o<T>, org.reactivestreams.e {
        private static final long serialVersionUID = 1015244841293359600L;

        /* renamed from: b, reason: collision with root package name */
        public final InterfaceC41782o f402581b;

        /* renamed from: c, reason: collision with root package name */
        public org.reactivestreams.e f402582c;

        /* compiled from: FlowableUnsubscribeOn.java */
        /* renamed from: io.reactivex.rxjava3.internal.operators.flowable.Y1$a$a, reason: collision with other inner class name */
        public final class RunnableC11458a implements Runnable {
            @Override // java.lang.Runnable
            public final void run() {
                throw null;
            }
        }

        public a(InterfaceC41782o interfaceC41782o) {
            this.f402581b = interfaceC41782o;
        }

        @Override // org.reactivestreams.d
        public final void K(org.reactivestreams.e eVar) {
            if (SubscriptionHelper.i(this.f402582c, eVar)) {
                this.f402582c = eVar;
                this.f402581b.K(this);
            }
        }

        @Override // org.reactivestreams.e
        public final void cancel() {
            if (compareAndSet(false, true)) {
                throw null;
            }
        }

        @Override // org.reactivestreams.d
        public final void e() {
            if (get()) {
                return;
            }
            this.f402581b.e();
        }

        @Override // org.reactivestreams.d
        public final void onError(Throwable th2) {
            if (get()) {
                C47998a.b(th2);
            } else {
                this.f402581b.onError(th2);
            }
        }

        @Override // org.reactivestreams.d
        public final void onNext(T t12) {
            if (get()) {
                return;
            }
            this.f402581b.onNext(t12);
        }

        @Override // org.reactivestreams.e
        public final void request(long j12) {
            this.f402582c.request(j12);
        }
    }

    @Override // io.reactivex.rxjava3.core.AbstractC41777j
    public final void u(org.reactivestreams.d<? super T> dVar) {
        this.f402624c.q(new a((InterfaceC41782o) dVar));
    }
}
