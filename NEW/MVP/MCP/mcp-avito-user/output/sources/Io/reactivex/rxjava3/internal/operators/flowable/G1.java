package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.InterfaceC41782o;

/* compiled from: FlowableSwitchIfEmpty.java */
/* loaded from: classes8.dex */
public final class G1<T> extends AbstractC41833b<T, T> {

    /* renamed from: d, reason: collision with root package name */
    public final C0 f402346d;

    /* compiled from: FlowableSwitchIfEmpty.java */
    public static final class a<T> implements InterfaceC41782o<T> {

        /* renamed from: b, reason: collision with root package name */
        public final InterfaceC41782o f402347b;

        /* renamed from: c, reason: collision with root package name */
        public final C0 f402348c;

        /* renamed from: e, reason: collision with root package name */
        public boolean f402350e = true;

        /* renamed from: d, reason: collision with root package name */
        public final o41.h f402349d = new o41.h(false);

        public a(InterfaceC41782o interfaceC41782o, C0 c02) {
            this.f402347b = interfaceC41782o;
            this.f402348c = c02;
        }

        @Override // org.reactivestreams.d
        public final void K(org.reactivestreams.e eVar) {
            this.f402349d.g(eVar);
        }

        @Override // org.reactivestreams.d
        public final void e() {
            if (!this.f402350e) {
                this.f402347b.e();
            } else {
                this.f402350e = false;
                this.f402348c.d(this);
            }
        }

        @Override // org.reactivestreams.d
        public final void onError(Throwable th2) {
            this.f402347b.onError(th2);
        }

        @Override // org.reactivestreams.d
        public final void onNext(T t12) {
            if (this.f402350e) {
                this.f402350e = false;
            }
            this.f402347b.onNext(t12);
        }
    }

    public G1(G0 g02, C0 c02) {
        super(g02);
        this.f402346d = c02;
    }

    @Override // io.reactivex.rxjava3.core.AbstractC41777j
    public final void u(org.reactivestreams.d<? super T> dVar) {
        a aVar = new a((InterfaceC41782o) dVar, this.f402346d);
        dVar.K(aVar.f402349d);
        this.f402624c.q(aVar);
    }
}
