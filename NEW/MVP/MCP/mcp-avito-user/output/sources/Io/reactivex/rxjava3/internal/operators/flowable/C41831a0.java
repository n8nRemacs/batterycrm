package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.AbstractC41777j;
import io.reactivex.rxjava3.core.InterfaceC41782o;
import q41.InterfaceC47198a;

/* compiled from: FlowableFilter.java */
/* renamed from: io.reactivex.rxjava3.internal.operators.flowable.a0, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41831a0<T> extends AbstractC41833b<T, T> {

    /* renamed from: d, reason: collision with root package name */
    public final l41.r<? super T> f402596d;

    /* compiled from: FlowableFilter.java */
    /* renamed from: io.reactivex.rxjava3.internal.operators.flowable.a0$a */
    public static final class a<T> extends io.reactivex.rxjava3.internal.subscribers.a<T, T> {

        /* renamed from: g, reason: collision with root package name */
        public final l41.r<? super T> f402597g;

        public a(InterfaceC47198a<? super T> interfaceC47198a, l41.r<? super T> rVar) {
            super(interfaceC47198a);
            this.f402597g = rVar;
        }

        @Override // q41.InterfaceC47198a
        public final boolean P(T t12) {
            if (this.f404772e) {
                return false;
            }
            int i12 = this.f404773f;
            InterfaceC47198a<? super R> interfaceC47198a = this.f404769b;
            if (i12 != 0) {
                return interfaceC47198a.P(null);
            }
            try {
                return this.f402597g.test(t12) && interfaceC47198a.P(t12);
            } catch (Throwable th2) {
                a(th2);
                return true;
            }
        }

        @Override // io.reactivex.rxjava3.internal.subscribers.a, org.reactivestreams.d
        public final void onNext(T t12) {
            if (P(t12)) {
                return;
            }
            this.f404770c.request(1L);
        }

        @Override // q41.g
        @j41.f
        public final T poll() {
            q41.d<T> dVar = this.f404771d;
            while (true) {
                T tPoll = dVar.poll();
                if (tPoll == null) {
                    return null;
                }
                if (this.f402597g.test(tPoll)) {
                    return tPoll;
                }
                if (this.f404773f == 2) {
                    dVar.request(1L);
                }
            }
        }
    }

    /* compiled from: FlowableFilter.java */
    /* renamed from: io.reactivex.rxjava3.internal.operators.flowable.a0$b */
    public static final class b<T> extends io.reactivex.rxjava3.internal.subscribers.b<T, T> implements InterfaceC47198a<T> {

        /* renamed from: g, reason: collision with root package name */
        public final l41.r<? super T> f402598g;

        public b(InterfaceC41782o interfaceC41782o, l41.r rVar) {
            super(interfaceC41782o);
            this.f402598g = rVar;
        }

        @Override // q41.InterfaceC47198a
        public final boolean P(T t12) {
            if (this.f404777e) {
                return false;
            }
            int i12 = this.f404778f;
            org.reactivestreams.d<? super R> dVar = this.f404774b;
            if (i12 != 0) {
                dVar.onNext(null);
                return true;
            }
            try {
                boolean zTest = this.f402598g.test(t12);
                if (zTest) {
                    dVar.onNext(t12);
                }
                return zTest;
            } catch (Throwable th2) {
                a(th2);
                return true;
            }
        }

        @Override // org.reactivestreams.d
        public final void onNext(T t12) {
            if (P(t12)) {
                return;
            }
            this.f404775c.request(1L);
        }

        @Override // q41.g
        @j41.f
        public final T poll() {
            q41.d<T> dVar = this.f404776d;
            while (true) {
                T tPoll = dVar.poll();
                if (tPoll == null) {
                    return null;
                }
                if (this.f402598g.test(tPoll)) {
                    return tPoll;
                }
                if (this.f404778f == 2) {
                    dVar.request(1L);
                }
            }
        }
    }

    public C41831a0(AbstractC41777j<T> abstractC41777j, l41.r<? super T> rVar) {
        super(abstractC41777j);
        this.f402596d = rVar;
    }

    @Override // io.reactivex.rxjava3.core.AbstractC41777j
    public final void u(org.reactivestreams.d<? super T> dVar) {
        boolean z12 = dVar instanceof InterfaceC47198a;
        l41.r<? super T> rVar = this.f402596d;
        AbstractC41777j<T> abstractC41777j = this.f402624c;
        if (z12) {
            abstractC41777j.q(new a((InterfaceC47198a) dVar, rVar));
        } else {
            abstractC41777j.q(new b((InterfaceC41782o) dVar, rVar));
        }
    }
}
