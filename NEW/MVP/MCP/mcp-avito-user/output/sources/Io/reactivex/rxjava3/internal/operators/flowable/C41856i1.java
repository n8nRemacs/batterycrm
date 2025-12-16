package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.InterfaceC41782o;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: FlowableRepeat.java */
/* renamed from: io.reactivex.rxjava3.internal.operators.flowable.i1, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41856i1<T> extends AbstractC41833b<T, T> {

    /* compiled from: FlowableRepeat.java */
    /* renamed from: io.reactivex.rxjava3.internal.operators.flowable.i1$a */
    public static final class a<T> extends AtomicInteger implements InterfaceC41782o<T> {
        private static final long serialVersionUID = -7098360935104053232L;

        /* renamed from: b, reason: collision with root package name */
        public final InterfaceC41782o f402831b;

        /* renamed from: c, reason: collision with root package name */
        public final o41.h f402832c;

        /* renamed from: d, reason: collision with root package name */
        public final org.reactivestreams.c<? extends T> f402833d;

        /* renamed from: e, reason: collision with root package name */
        public long f402834e = -1;

        /* renamed from: f, reason: collision with root package name */
        public long f402835f;

        public a(InterfaceC41782o interfaceC41782o, o41.h hVar, org.reactivestreams.c cVar) {
            this.f402831b = interfaceC41782o;
            this.f402832c = hVar;
            this.f402833d = cVar;
        }

        @Override // org.reactivestreams.d
        public final void K(org.reactivestreams.e eVar) {
            this.f402832c.g(eVar);
        }

        public final void a() {
            if (getAndIncrement() == 0) {
                int iAddAndGet = 1;
                while (!this.f402832c.f419386h) {
                    long j12 = this.f402835f;
                    if (j12 != 0) {
                        this.f402835f = 0L;
                        this.f402832c.f(j12);
                    }
                    this.f402833d.d(this);
                    iAddAndGet = addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                }
            }
        }

        @Override // org.reactivestreams.d
        public final void e() {
            long j12 = this.f402834e;
            if (j12 != Long.MAX_VALUE) {
                this.f402834e = j12 - 1;
            }
            if (j12 != 0) {
                a();
            } else {
                this.f402831b.e();
            }
        }

        @Override // org.reactivestreams.d
        public final void onError(Throwable th2) {
            this.f402831b.onError(th2);
        }

        @Override // org.reactivestreams.d
        public final void onNext(T t12) {
            this.f402835f++;
            this.f402831b.onNext(t12);
        }
    }

    @Override // io.reactivex.rxjava3.core.AbstractC41777j
    public final void u(org.reactivestreams.d<? super T> dVar) {
        o41.h hVar = new o41.h(false);
        dVar.K(hVar);
        new a((InterfaceC41782o) dVar, hVar, this.f402624c).a();
    }
}
