package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.InterfaceC41782o;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.operators.flowable.U1;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import s41.C47998a;

/* compiled from: FlowableTimeout.java */
/* loaded from: classes8.dex */
public final class T1<T, U, V> extends AbstractC41833b<T, T> {

    /* compiled from: FlowableTimeout.java */
    public static final class a extends AtomicReference<org.reactivestreams.e> implements InterfaceC41782o<Object>, io.reactivex.rxjava3.disposables.d {
        private static final long serialVersionUID = 8708641127342403073L;

        @Override // org.reactivestreams.d
        public final void K(org.reactivestreams.e eVar) {
            SubscriptionHelper.e(this, eVar, Long.MAX_VALUE);
        }

        @Override // io.reactivex.rxjava3.disposables.d
        public final void dispose() {
            SubscriptionHelper.a(this);
        }

        @Override // org.reactivestreams.d
        public final void e() {
            Object obj = get();
            SubscriptionHelper subscriptionHelper = SubscriptionHelper.f404813b;
            if (obj == subscriptionHelper) {
                return;
            }
            lazySet(subscriptionHelper);
            throw null;
        }

        @Override // io.reactivex.rxjava3.disposables.d
        /* renamed from: i */
        public final boolean getF318621e() {
            return get() == SubscriptionHelper.f404813b;
        }

        @Override // org.reactivestreams.d
        public final void onError(Throwable th2) {
            Object obj = get();
            SubscriptionHelper subscriptionHelper = SubscriptionHelper.f404813b;
            if (obj == subscriptionHelper) {
                C47998a.b(th2);
            } else {
                lazySet(subscriptionHelper);
                throw null;
            }
        }

        @Override // org.reactivestreams.d
        public final void onNext(Object obj) {
            org.reactivestreams.e eVar = (org.reactivestreams.e) get();
            SubscriptionHelper subscriptionHelper = SubscriptionHelper.f404813b;
            if (eVar == subscriptionHelper) {
                return;
            }
            eVar.cancel();
            lazySet(subscriptionHelper);
            throw null;
        }
    }

    /* compiled from: FlowableTimeout.java */
    public static final class b<T> extends o41.h implements InterfaceC41782o<T>, c {
        private static final long serialVersionUID = 3764492702657003550L;

        public b() {
            throw null;
        }

        @Override // o41.h, org.reactivestreams.d
        public final void K(org.reactivestreams.e eVar) {
            if (SubscriptionHelper.f(null, eVar)) {
                g(eVar);
            }
        }

        @Override // io.reactivex.rxjava3.internal.operators.flowable.T1.c
        public final void a(long j12, Throwable th2) {
            throw null;
        }

        @Override // io.reactivex.rxjava3.internal.operators.flowable.U1.d
        public final void c(long j12) {
            throw null;
        }

        @Override // o41.h, org.reactivestreams.e
        public final void cancel() {
            super.cancel();
            throw null;
        }

        @Override // org.reactivestreams.d
        public final void e() {
            throw null;
        }

        @Override // org.reactivestreams.d
        public final void onError(Throwable th2) {
            throw null;
        }

        @Override // org.reactivestreams.d
        public final void onNext(T t12) {
            throw null;
        }
    }

    /* compiled from: FlowableTimeout.java */
    public interface c extends U1.d {
        void a(long j12, Throwable th2);
    }

    /* compiled from: FlowableTimeout.java */
    public static final class d<T> extends AtomicLong implements InterfaceC41782o<T>, org.reactivestreams.e, c {
        private static final long serialVersionUID = 3764492702657003550L;

        /* renamed from: b, reason: collision with root package name */
        public final InterfaceC41782o f402554b;

        /* renamed from: c, reason: collision with root package name */
        public final m41.d f402555c = new m41.d();

        /* renamed from: d, reason: collision with root package name */
        public final AtomicReference<org.reactivestreams.e> f402556d = new AtomicReference<>();

        /* renamed from: e, reason: collision with root package name */
        public final AtomicLong f402557e = new AtomicLong();

        public d(InterfaceC41782o interfaceC41782o) {
            this.f402554b = interfaceC41782o;
        }

        @Override // org.reactivestreams.d
        public final void K(org.reactivestreams.e eVar) {
            SubscriptionHelper.c(this.f402556d, this.f402557e, eVar);
        }

        @Override // io.reactivex.rxjava3.internal.operators.flowable.T1.c
        public final void a(long j12, Throwable th2) {
            if (!compareAndSet(j12, Long.MAX_VALUE)) {
                C47998a.b(th2);
            } else {
                SubscriptionHelper.a(this.f402556d);
                this.f402554b.onError(th2);
            }
        }

        @Override // io.reactivex.rxjava3.internal.operators.flowable.U1.d
        public final void c(long j12) {
            if (compareAndSet(j12, Long.MAX_VALUE)) {
                SubscriptionHelper.a(this.f402556d);
                this.f402554b.onError(new TimeoutException());
            }
        }

        @Override // org.reactivestreams.e
        public final void cancel() {
            SubscriptionHelper.a(this.f402556d);
            m41.d dVar = this.f402555c;
            dVar.getClass();
            DisposableHelper.a(dVar);
        }

        @Override // org.reactivestreams.d
        public final void e() {
            if (getAndSet(Long.MAX_VALUE) != Long.MAX_VALUE) {
                m41.d dVar = this.f402555c;
                dVar.getClass();
                DisposableHelper.a(dVar);
                this.f402554b.e();
            }
        }

        @Override // org.reactivestreams.d
        public final void onError(Throwable th2) {
            if (getAndSet(Long.MAX_VALUE) == Long.MAX_VALUE) {
                C47998a.b(th2);
                return;
            }
            m41.d dVar = this.f402555c;
            dVar.getClass();
            DisposableHelper.a(dVar);
            this.f402554b.onError(th2);
        }

        @Override // org.reactivestreams.d
        public final void onNext(T t12) {
            long j12 = get();
            if (j12 == Long.MAX_VALUE || !compareAndSet(j12, 1 + j12)) {
                return;
            }
            io.reactivex.rxjava3.disposables.d dVar = this.f402555c.get();
            if (dVar != null) {
                dVar.dispose();
            }
            InterfaceC41782o interfaceC41782o = this.f402554b;
            interfaceC41782o.onNext(t12);
            try {
                throw null;
            } catch (Throwable th2) {
                io.reactivex.rxjava3.exceptions.a.a(th2);
                this.f402556d.get().cancel();
                getAndSet(Long.MAX_VALUE);
                interfaceC41782o.onError(th2);
            }
        }

        @Override // org.reactivestreams.e
        public final void request(long j12) {
            SubscriptionHelper.b(this.f402556d, this.f402557e, j12);
        }
    }

    @Override // io.reactivex.rxjava3.core.AbstractC41777j
    public final void u(org.reactivestreams.d<? super T> dVar) {
        d dVar2 = new d((InterfaceC41782o) dVar);
        dVar.K(dVar2);
        this.f402624c.q(dVar2);
    }
}
