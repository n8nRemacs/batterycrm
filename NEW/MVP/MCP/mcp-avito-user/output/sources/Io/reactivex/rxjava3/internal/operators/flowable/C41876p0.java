package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.AbstractC41777j;
import io.reactivex.rxjava3.core.InterfaceC41782o;

/* compiled from: FlowableFromObservable.java */
/* renamed from: io.reactivex.rxjava3.internal.operators.flowable.p0, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41876p0<T> extends AbstractC41777j<T> {

    /* renamed from: c, reason: collision with root package name */
    public final io.reactivex.rxjava3.core.z f402929c;

    public C41876p0(io.reactivex.rxjava3.core.z zVar) {
        this.f402929c = zVar;
    }

    @Override // io.reactivex.rxjava3.core.AbstractC41777j
    public final void u(org.reactivestreams.d<? super T> dVar) {
        this.f402929c.c(new a((InterfaceC41782o) dVar));
    }

    /* compiled from: FlowableFromObservable.java */
    /* renamed from: io.reactivex.rxjava3.internal.operators.flowable.p0$a */
    public static final class a<T> implements io.reactivex.rxjava3.core.G<T>, org.reactivestreams.e {

        /* renamed from: b, reason: collision with root package name */
        public final InterfaceC41782o f402930b;

        /* renamed from: c, reason: collision with root package name */
        public io.reactivex.rxjava3.disposables.d f402931c;

        public a(InterfaceC41782o interfaceC41782o) {
            this.f402930b = interfaceC41782o;
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void b(io.reactivex.rxjava3.disposables.d dVar) {
            this.f402931c = dVar;
            this.f402930b.K(this);
        }

        @Override // org.reactivestreams.e
        public final void cancel() {
            this.f402931c.dispose();
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void e() {
            this.f402930b.e();
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void onError(Throwable th2) {
            this.f402930b.onError(th2);
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void onNext(T t12) {
            this.f402930b.onNext(t12);
        }

        @Override // org.reactivestreams.e
        public final void request(long j12) {
        }
    }
}
