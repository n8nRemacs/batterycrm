package io.reactivex.rxjava3.internal.operators.maybe;

import io.reactivex.rxjava3.core.AbstractC41777j;
import io.reactivex.rxjava3.core.InterfaceC41782o;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import io.reactivex.rxjava3.internal.util.NotificationLite;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: MaybeConcatArrayDelayError.java */
/* renamed from: io.reactivex.rxjava3.internal.operators.maybe.f, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41912f<T> extends AbstractC41777j<T> {

    /* compiled from: MaybeConcatArrayDelayError.java */
    /* renamed from: io.reactivex.rxjava3.internal.operators.maybe.f$a */
    public static final class a<T> extends AtomicInteger implements io.reactivex.rxjava3.core.t<T>, org.reactivestreams.e {
        private static final long serialVersionUID = 3520831347801429610L;

        /* renamed from: b, reason: collision with root package name */
        public final InterfaceC41782o f403220b;

        /* renamed from: g, reason: collision with root package name */
        public long f403225g;

        /* renamed from: c, reason: collision with root package name */
        public final AtomicLong f403221c = new AtomicLong();

        /* renamed from: e, reason: collision with root package name */
        public final m41.d f403223e = new m41.d();

        /* renamed from: d, reason: collision with root package name */
        public final AtomicReference<Object> f403222d = new AtomicReference<>(NotificationLite.f404825b);

        /* renamed from: f, reason: collision with root package name */
        public final io.reactivex.rxjava3.internal.util.b f403224f = new io.reactivex.rxjava3.internal.util.b();

        public a(InterfaceC41782o interfaceC41782o) {
            this.f403220b = interfaceC41782o;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final void a() {
            if (getAndIncrement() != 0) {
                return;
            }
            AtomicReference<Object> atomicReference = this.f403222d;
            do {
                m41.d dVar = this.f403223e;
                if (dVar.getF318621e()) {
                    atomicReference.lazySet(null);
                    return;
                }
                Object obj = atomicReference.get();
                if (obj != null) {
                    if (obj != NotificationLite.f404825b) {
                        long j12 = this.f403225g;
                        if (j12 != this.f403221c.get()) {
                            this.f403225g = j12 + 1;
                            atomicReference.lazySet(null);
                            this.f403220b.onNext(obj);
                        }
                    } else {
                        atomicReference.lazySet(null);
                    }
                    if (!dVar.getF318621e()) {
                        throw null;
                    }
                }
            } while (decrementAndGet() != 0);
        }

        @Override // io.reactivex.rxjava3.core.t
        public final void b(io.reactivex.rxjava3.disposables.d dVar) {
            m41.d dVar2 = this.f403223e;
            dVar2.getClass();
            DisposableHelper.c(dVar2, dVar);
        }

        @Override // org.reactivestreams.e
        public final void cancel() {
            m41.d dVar = this.f403223e;
            dVar.getClass();
            DisposableHelper.a(dVar);
            this.f403224f.c();
        }

        @Override // io.reactivex.rxjava3.core.t
        public final void e() {
            this.f403222d.lazySet(NotificationLite.f404825b);
            a();
        }

        @Override // io.reactivex.rxjava3.core.t
        public final void onError(Throwable th2) {
            this.f403222d.lazySet(NotificationLite.f404825b);
            if (this.f403224f.b(th2)) {
                a();
            }
        }

        @Override // io.reactivex.rxjava3.core.t
        public final void onSuccess(T t12) {
            this.f403222d.lazySet(t12);
            a();
        }

        @Override // org.reactivestreams.e
        public final void request(long j12) {
            if (SubscriptionHelper.h(j12)) {
                io.reactivex.rxjava3.internal.util.c.a(this.f403221c, j12);
                a();
            }
        }
    }

    @Override // io.reactivex.rxjava3.core.AbstractC41777j
    public final void u(org.reactivestreams.d<? super T> dVar) {
        a aVar = new a((InterfaceC41782o) dVar);
        dVar.K(aVar);
        aVar.a();
    }
}
