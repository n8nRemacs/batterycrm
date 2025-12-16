package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.AbstractC41777j;
import io.reactivex.rxjava3.core.InterfaceC41782o;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import o41.AbstractC44583c;
import q41.InterfaceC47198a;
import s41.C47998a;

/* compiled from: FlowableDoFinally.java */
/* loaded from: classes8.dex */
public final class Q<T> extends AbstractC41833b<T, T> {

    /* compiled from: FlowableDoFinally.java */
    public static final class a<T> extends AbstractC44583c<T> implements InterfaceC47198a<T> {
        private static final long serialVersionUID = 4109457741734051389L;

        /* renamed from: b, reason: collision with root package name */
        public final InterfaceC47198a<? super T> f402502b;

        /* renamed from: c, reason: collision with root package name */
        public org.reactivestreams.e f402503c;

        /* renamed from: d, reason: collision with root package name */
        public q41.d<T> f402504d;

        /* renamed from: e, reason: collision with root package name */
        public boolean f402505e;

        public a(InterfaceC47198a interfaceC47198a) {
            this.f402502b = interfaceC47198a;
        }

        @Override // org.reactivestreams.d
        public final void K(org.reactivestreams.e eVar) {
            if (SubscriptionHelper.i(this.f402503c, eVar)) {
                this.f402503c = eVar;
                if (eVar instanceof q41.d) {
                    this.f402504d = (q41.d) eVar;
                }
                this.f402502b.K(this);
            }
        }

        @Override // q41.InterfaceC47198a
        public final boolean P(T t12) {
            return this.f402502b.P(t12);
        }

        @Override // org.reactivestreams.e
        public final void cancel() {
            this.f402503c.cancel();
            l();
        }

        @Override // q41.g
        public final void clear() {
            this.f402504d.clear();
        }

        @Override // org.reactivestreams.d
        public final void e() {
            this.f402502b.e();
            l();
        }

        @Override // q41.g
        public final boolean isEmpty() {
            return this.f402504d.isEmpty();
        }

        public final void l() {
            if (compareAndSet(0, 1)) {
                try {
                    throw null;
                } catch (Throwable th2) {
                    io.reactivex.rxjava3.exceptions.a.a(th2);
                    C47998a.b(th2);
                }
            }
        }

        @Override // org.reactivestreams.d
        public final void onError(Throwable th2) {
            this.f402502b.onError(th2);
            l();
        }

        @Override // org.reactivestreams.d
        public final void onNext(T t12) {
            this.f402502b.onNext(t12);
        }

        @Override // q41.g
        @j41.f
        public final T poll() {
            T tPoll = this.f402504d.poll();
            if (tPoll == null && this.f402505e) {
                l();
            }
            return tPoll;
        }

        @Override // org.reactivestreams.e
        public final void request(long j12) {
            this.f402503c.request(j12);
        }

        @Override // q41.InterfaceC47200c
        public final int v(int i12) {
            q41.d<T> dVar = this.f402504d;
            if (dVar == null || (i12 & 4) != 0) {
                return 0;
            }
            int iV2 = dVar.v(i12);
            if (iV2 != 0) {
                this.f402505e = iV2 == 1;
            }
            return iV2;
        }
    }

    /* compiled from: FlowableDoFinally.java */
    public static final class b<T> extends AbstractC44583c<T> implements InterfaceC41782o<T> {
        private static final long serialVersionUID = 4109457741734051389L;

        /* renamed from: b, reason: collision with root package name */
        public final InterfaceC41782o f402506b;

        /* renamed from: c, reason: collision with root package name */
        public org.reactivestreams.e f402507c;

        /* renamed from: d, reason: collision with root package name */
        public q41.d<T> f402508d;

        /* renamed from: e, reason: collision with root package name */
        public boolean f402509e;

        public b(InterfaceC41782o interfaceC41782o) {
            this.f402506b = interfaceC41782o;
        }

        @Override // org.reactivestreams.d
        public final void K(org.reactivestreams.e eVar) {
            if (SubscriptionHelper.i(this.f402507c, eVar)) {
                this.f402507c = eVar;
                if (eVar instanceof q41.d) {
                    this.f402508d = (q41.d) eVar;
                }
                this.f402506b.K(this);
            }
        }

        @Override // org.reactivestreams.e
        public final void cancel() {
            this.f402507c.cancel();
            l();
        }

        @Override // q41.g
        public final void clear() {
            this.f402508d.clear();
        }

        @Override // org.reactivestreams.d
        public final void e() {
            this.f402506b.e();
            l();
        }

        @Override // q41.g
        public final boolean isEmpty() {
            return this.f402508d.isEmpty();
        }

        public final void l() {
            if (compareAndSet(0, 1)) {
                try {
                    throw null;
                } catch (Throwable th2) {
                    io.reactivex.rxjava3.exceptions.a.a(th2);
                    C47998a.b(th2);
                }
            }
        }

        @Override // org.reactivestreams.d
        public final void onError(Throwable th2) {
            this.f402506b.onError(th2);
            l();
        }

        @Override // org.reactivestreams.d
        public final void onNext(T t12) {
            this.f402506b.onNext(t12);
        }

        @Override // q41.g
        @j41.f
        public final T poll() {
            T tPoll = this.f402508d.poll();
            if (tPoll == null && this.f402509e) {
                l();
            }
            return tPoll;
        }

        @Override // org.reactivestreams.e
        public final void request(long j12) {
            this.f402507c.request(j12);
        }

        @Override // q41.InterfaceC47200c
        public final int v(int i12) {
            q41.d<T> dVar = this.f402508d;
            if (dVar == null || (i12 & 4) != 0) {
                return 0;
            }
            int iV2 = dVar.v(i12);
            if (iV2 != 0) {
                this.f402509e = iV2 == 1;
            }
            return iV2;
        }
    }

    @Override // io.reactivex.rxjava3.core.AbstractC41777j
    public final void u(org.reactivestreams.d<? super T> dVar) {
        boolean z12 = dVar instanceof InterfaceC47198a;
        AbstractC41777j<T> abstractC41777j = this.f402624c;
        if (z12) {
            abstractC41777j.q(new a((InterfaceC47198a) dVar));
        } else {
            abstractC41777j.q(new b((InterfaceC41782o) dVar));
        }
    }
}
