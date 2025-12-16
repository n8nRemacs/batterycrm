package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.AbstractC41777j;
import io.reactivex.rxjava3.core.InterfaceC41782o;
import q41.InterfaceC47198a;

/* compiled from: FlowableDoAfterNext.java */
/* loaded from: classes8.dex */
public final class P<T> extends AbstractC41833b<T, T> {

    /* renamed from: d, reason: collision with root package name */
    public final l41.g<? super T> f402482d;

    /* compiled from: FlowableDoAfterNext.java */
    public static final class a<T> extends io.reactivex.rxjava3.internal.subscribers.a<T, T> {

        /* renamed from: g, reason: collision with root package name */
        public final l41.g<? super T> f402483g;

        public a(InterfaceC47198a<? super T> interfaceC47198a, l41.g<? super T> gVar) {
            super(interfaceC47198a);
            this.f402483g = gVar;
        }

        @Override // q41.InterfaceC47198a
        public final boolean P(T t12) {
            boolean zP2 = this.f404769b.P(t12);
            try {
                this.f402483g.accept(t12);
            } catch (Throwable th2) {
                a(th2);
            }
            return zP2;
        }

        @Override // io.reactivex.rxjava3.internal.subscribers.a, org.reactivestreams.d
        public final void onNext(T t12) {
            this.f404769b.onNext(t12);
            if (this.f404773f == 0) {
                try {
                    this.f402483g.accept(t12);
                } catch (Throwable th2) {
                    a(th2);
                }
            }
        }

        @Override // q41.g
        @j41.f
        public final T poll() {
            T tPoll = this.f404771d.poll();
            if (tPoll != null) {
                this.f402483g.accept(tPoll);
            }
            return tPoll;
        }
    }

    /* compiled from: FlowableDoAfterNext.java */
    public static final class b<T> extends io.reactivex.rxjava3.internal.subscribers.b<T, T> {

        /* renamed from: g, reason: collision with root package name */
        public final l41.g<? super T> f402484g;

        public b(InterfaceC41782o interfaceC41782o, l41.g gVar) {
            super(interfaceC41782o);
            this.f402484g = gVar;
        }

        @Override // org.reactivestreams.d
        public final void onNext(T t12) {
            if (this.f404777e) {
                return;
            }
            this.f404774b.onNext(t12);
            if (this.f404778f == 0) {
                try {
                    this.f402484g.accept(t12);
                } catch (Throwable th2) {
                    a(th2);
                }
            }
        }

        @Override // q41.g
        @j41.f
        public final T poll() {
            T tPoll = this.f404776d.poll();
            if (tPoll != null) {
                this.f402484g.accept(tPoll);
            }
            return tPoll;
        }
    }

    public P(T t12, l41.g gVar) {
        super(t12);
        this.f402482d = gVar;
    }

    @Override // io.reactivex.rxjava3.core.AbstractC41777j
    public final void u(org.reactivestreams.d<? super T> dVar) {
        boolean z12 = dVar instanceof InterfaceC47198a;
        l41.g<? super T> gVar = this.f402482d;
        AbstractC41777j<T> abstractC41777j = this.f402624c;
        if (z12) {
            abstractC41777j.q(new a((InterfaceC47198a) dVar, gVar));
        } else {
            abstractC41777j.q(new b((InterfaceC41782o) dVar, gVar));
        }
    }
}
