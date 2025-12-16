package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.InterfaceC41782o;
import io.reactivex.rxjava3.exceptions.CompositeException;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: FlowableRetryBiPredicate.java */
/* renamed from: io.reactivex.rxjava3.internal.operators.flowable.m1, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41868m1<T> extends AbstractC41833b<T, T> {

    /* compiled from: FlowableRetryBiPredicate.java */
    /* renamed from: io.reactivex.rxjava3.internal.operators.flowable.m1$a */
    public static final class a<T> extends AtomicInteger implements InterfaceC41782o<T> {
        private static final long serialVersionUID = -7098360935104053232L;

        /* renamed from: b, reason: collision with root package name */
        public final InterfaceC41782o f402883b;

        /* renamed from: c, reason: collision with root package name */
        public final o41.h f402884c;

        /* renamed from: d, reason: collision with root package name */
        public final org.reactivestreams.c<? extends T> f402885d;

        /* renamed from: e, reason: collision with root package name */
        public int f402886e;

        /* renamed from: f, reason: collision with root package name */
        public long f402887f;

        public a(InterfaceC41782o interfaceC41782o, o41.h hVar, org.reactivestreams.c cVar) {
            this.f402883b = interfaceC41782o;
            this.f402884c = hVar;
            this.f402885d = cVar;
        }

        @Override // org.reactivestreams.d
        public final void K(org.reactivestreams.e eVar) {
            this.f402884c.g(eVar);
        }

        @Override // org.reactivestreams.d
        public final void e() {
            this.f402883b.e();
        }

        @Override // org.reactivestreams.d
        public final void onError(Throwable th2) {
            try {
                this.f402886e++;
                throw null;
            } catch (Throwable th3) {
                io.reactivex.rxjava3.exceptions.a.a(th3);
                this.f402883b.onError(new CompositeException(th2, th3));
            }
        }

        @Override // org.reactivestreams.d
        public final void onNext(T t12) {
            this.f402887f++;
            this.f402883b.onNext(t12);
        }
    }

    @Override // io.reactivex.rxjava3.core.AbstractC41777j
    public final void u(org.reactivestreams.d<? super T> dVar) {
        o41.h hVar = new o41.h(false);
        dVar.K(hVar);
        a aVar = new a((InterfaceC41782o) dVar, hVar, this.f402624c);
        if (aVar.getAndIncrement() == 0) {
            int iAddAndGet = 1;
            while (!aVar.f402884c.f419386h) {
                long j12 = aVar.f402887f;
                if (j12 != 0) {
                    aVar.f402887f = 0L;
                    aVar.f402884c.f(j12);
                }
                aVar.f402885d.d(aVar);
                iAddAndGet = aVar.addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
            }
        }
    }
}
