package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.InterfaceC41782o;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: FlowableRepeatUntil.java */
/* renamed from: io.reactivex.rxjava3.internal.operators.flowable.j1, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41859j1<T> extends AbstractC41833b<T, T> {

    /* compiled from: FlowableRepeatUntil.java */
    /* renamed from: io.reactivex.rxjava3.internal.operators.flowable.j1$a */
    public static final class a<T> extends AtomicInteger implements InterfaceC41782o<T> {
        private static final long serialVersionUID = -7098360935104053232L;

        /* renamed from: b, reason: collision with root package name */
        public final InterfaceC41782o f402840b;

        /* renamed from: c, reason: collision with root package name */
        public final o41.h f402841c;

        /* renamed from: d, reason: collision with root package name */
        public final org.reactivestreams.c<? extends T> f402842d;

        /* renamed from: e, reason: collision with root package name */
        public long f402843e;

        public a(InterfaceC41782o interfaceC41782o, o41.h hVar, org.reactivestreams.c cVar) {
            this.f402840b = interfaceC41782o;
            this.f402841c = hVar;
            this.f402842d = cVar;
        }

        @Override // org.reactivestreams.d
        public final void K(org.reactivestreams.e eVar) {
            this.f402841c.g(eVar);
        }

        @Override // org.reactivestreams.d
        public final void e() {
            try {
                throw null;
            } catch (Throwable th2) {
                io.reactivex.rxjava3.exceptions.a.a(th2);
                this.f402840b.onError(th2);
            }
        }

        @Override // org.reactivestreams.d
        public final void onError(Throwable th2) {
            this.f402840b.onError(th2);
        }

        @Override // org.reactivestreams.d
        public final void onNext(T t12) {
            this.f402843e++;
            this.f402840b.onNext(t12);
        }
    }

    @Override // io.reactivex.rxjava3.core.AbstractC41777j
    public final void u(org.reactivestreams.d<? super T> dVar) {
        o41.h hVar = new o41.h(false);
        dVar.K(hVar);
        a aVar = new a((InterfaceC41782o) dVar, hVar, this.f402624c);
        if (aVar.getAndIncrement() == 0) {
            int iAddAndGet = 1;
            while (!aVar.f402841c.f419386h) {
                long j12 = aVar.f402843e;
                if (j12 != 0) {
                    aVar.f402843e = 0L;
                    aVar.f402841c.f(j12);
                }
                aVar.f402842d.d(aVar);
                iAddAndGet = aVar.addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
            }
        }
    }
}
