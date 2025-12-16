package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.AbstractC41777j;
import io.reactivex.rxjava3.core.InterfaceC41782o;
import q41.InterfaceC47198a;

/* compiled from: FlowableDistinctUntilChanged.java */
/* loaded from: classes8.dex */
public final class O<T, K> extends AbstractC41833b<T, T> {

    /* renamed from: d, reason: collision with root package name */
    public final l41.o<? super T, K> f402452d;

    /* renamed from: e, reason: collision with root package name */
    public final l41.d<? super K, ? super K> f402453e;

    /* compiled from: FlowableDistinctUntilChanged.java */
    public static final class a<T, K> extends io.reactivex.rxjava3.internal.subscribers.a<T, T> {

        /* renamed from: g, reason: collision with root package name */
        public final l41.o<? super T, K> f402454g;

        /* renamed from: h, reason: collision with root package name */
        public final l41.d<? super K, ? super K> f402455h;

        /* renamed from: i, reason: collision with root package name */
        public K f402456i;

        /* renamed from: j, reason: collision with root package name */
        public boolean f402457j;

        public a(InterfaceC47198a<? super T> interfaceC47198a, l41.o<? super T, K> oVar, l41.d<? super K, ? super K> dVar) {
            super(interfaceC47198a);
            this.f402454g = oVar;
            this.f402455h = dVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // q41.InterfaceC47198a
        public final boolean P(T t12) {
            if (this.f404772e) {
                return false;
            }
            int i12 = this.f404773f;
            InterfaceC47198a<? super R> interfaceC47198a = this.f404769b;
            if (i12 != 0) {
                return interfaceC47198a.P(t12);
            }
            try {
                this.f402454g.apply(t12);
                if (this.f402457j) {
                    boolean zA2 = this.f402455h.a(this.f402456i, t12);
                    this.f402456i = t12;
                    if (zA2) {
                        return false;
                    }
                } else {
                    this.f402457j = true;
                    this.f402456i = t12;
                }
                interfaceC47198a.onNext(t12);
                return true;
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

        /* JADX WARN: Type inference failed for: r0v1, types: [K, T, java.lang.Object] */
        @Override // q41.g
        @j41.f
        public final T poll() {
            while (true) {
                T tPoll = this.f404771d.poll();
                if (tPoll == 0) {
                    return null;
                }
                this.f402454g.apply(tPoll);
                if (!this.f402457j) {
                    this.f402457j = true;
                    this.f402456i = tPoll;
                    return tPoll;
                }
                if (!this.f402455h.a(this.f402456i, tPoll)) {
                    this.f402456i = tPoll;
                    return tPoll;
                }
                this.f402456i = tPoll;
                if (this.f404773f != 1) {
                    this.f404770c.request(1L);
                }
            }
        }
    }

    /* compiled from: FlowableDistinctUntilChanged.java */
    public static final class b<T, K> extends io.reactivex.rxjava3.internal.subscribers.b<T, T> implements InterfaceC47198a<T> {

        /* renamed from: g, reason: collision with root package name */
        public final l41.o<? super T, K> f402458g;

        /* renamed from: h, reason: collision with root package name */
        public final l41.d<? super K, ? super K> f402459h;

        /* renamed from: i, reason: collision with root package name */
        public K f402460i;

        /* renamed from: j, reason: collision with root package name */
        public boolean f402461j;

        public b(InterfaceC41782o interfaceC41782o, l41.o oVar, l41.d dVar) {
            super(interfaceC41782o);
            this.f402458g = oVar;
            this.f402459h = dVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // q41.InterfaceC47198a
        public final boolean P(T t12) {
            if (this.f404777e) {
                return false;
            }
            int i12 = this.f404778f;
            org.reactivestreams.d<? super R> dVar = this.f404774b;
            if (i12 != 0) {
                dVar.onNext(t12);
                return true;
            }
            try {
                this.f402458g.apply(t12);
                if (this.f402461j) {
                    boolean zA2 = this.f402459h.a(this.f402460i, t12);
                    this.f402460i = t12;
                    if (zA2) {
                        return false;
                    }
                } else {
                    this.f402461j = true;
                    this.f402460i = t12;
                }
                dVar.onNext(t12);
                return true;
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

        /* JADX WARN: Type inference failed for: r0v1, types: [K, T, java.lang.Object] */
        @Override // q41.g
        @j41.f
        public final T poll() {
            while (true) {
                T tPoll = this.f404776d.poll();
                if (tPoll == 0) {
                    return null;
                }
                this.f402458g.apply(tPoll);
                if (!this.f402461j) {
                    this.f402461j = true;
                    this.f402460i = tPoll;
                    return tPoll;
                }
                if (!this.f402459h.a(this.f402460i, tPoll)) {
                    this.f402460i = tPoll;
                    return tPoll;
                }
                this.f402460i = tPoll;
                if (this.f404778f != 1) {
                    this.f404775c.request(1L);
                }
            }
        }
    }

    public O(AbstractC41777j<T> abstractC41777j, l41.o<? super T, K> oVar, l41.d<? super K, ? super K> dVar) {
        super(abstractC41777j);
        this.f402452d = oVar;
        this.f402453e = dVar;
    }

    @Override // io.reactivex.rxjava3.core.AbstractC41777j
    public final void u(org.reactivestreams.d<? super T> dVar) {
        boolean z12 = dVar instanceof InterfaceC47198a;
        l41.d<? super K, ? super K> dVar2 = this.f402453e;
        l41.o<? super T, K> oVar = this.f402452d;
        AbstractC41777j<T> abstractC41777j = this.f402624c;
        if (z12) {
            abstractC41777j.q(new a((InterfaceC47198a) dVar, oVar, dVar2));
        } else {
            abstractC41777j.q(new b((InterfaceC41782o) dVar, oVar, dVar2));
        }
    }
}
