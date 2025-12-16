package io.reactivex.rxjava3.internal.operators.mixed;

import io.reactivex.rxjava3.core.AbstractC41777j;
import io.reactivex.rxjava3.core.InterfaceC41782o;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import s41.C47998a;

/* compiled from: FlowableSwitchMapMaybe.java */
/* loaded from: classes8.dex */
public final class l<T, R> extends AbstractC41777j<R> {

    /* compiled from: FlowableSwitchMapMaybe.java */
    public static final class a<T, R> extends AtomicInteger implements InterfaceC41782o<T>, org.reactivestreams.e {

        /* renamed from: j, reason: collision with root package name */
        public static final C11479a<Object> f403397j = new C11479a<>(null);
        private static final long serialVersionUID = -5402190102429853762L;

        /* renamed from: b, reason: collision with root package name */
        public final InterfaceC41782o f403398b;

        /* renamed from: c, reason: collision with root package name */
        public final io.reactivex.rxjava3.internal.util.b f403399c = new io.reactivex.rxjava3.internal.util.b();

        /* renamed from: d, reason: collision with root package name */
        public final AtomicLong f403400d = new AtomicLong();

        /* renamed from: e, reason: collision with root package name */
        public final AtomicReference<C11479a<R>> f403401e = new AtomicReference<>();

        /* renamed from: f, reason: collision with root package name */
        public org.reactivestreams.e f403402f;

        /* renamed from: g, reason: collision with root package name */
        public volatile boolean f403403g;

        /* renamed from: h, reason: collision with root package name */
        public volatile boolean f403404h;

        /* renamed from: i, reason: collision with root package name */
        public long f403405i;

        /* compiled from: FlowableSwitchMapMaybe.java */
        /* renamed from: io.reactivex.rxjava3.internal.operators.mixed.l$a$a, reason: collision with other inner class name */
        public static final class C11479a<R> extends AtomicReference<io.reactivex.rxjava3.disposables.d> implements io.reactivex.rxjava3.core.t<R> {
            private static final long serialVersionUID = 8042919737683345351L;

            /* renamed from: b, reason: collision with root package name */
            public final a<?, R> f403406b;

            /* renamed from: c, reason: collision with root package name */
            public volatile R f403407c;

            public C11479a(a<?, R> aVar) {
                this.f403406b = aVar;
            }

            @Override // io.reactivex.rxjava3.core.t
            public final void b(io.reactivex.rxjava3.disposables.d dVar) {
                DisposableHelper.e(this, dVar);
            }

            @Override // io.reactivex.rxjava3.core.t
            public final void e() {
                a<?, R> aVar = this.f403406b;
                AtomicReference<C11479a<R>> atomicReference = aVar.f403401e;
                while (!atomicReference.compareAndSet(this, null)) {
                    if (atomicReference.get() != this) {
                        return;
                    }
                }
                aVar.b();
            }

            @Override // io.reactivex.rxjava3.core.t
            public final void onError(Throwable th2) {
                a<?, R> aVar = this.f403406b;
                AtomicReference<C11479a<R>> atomicReference = aVar.f403401e;
                while (!atomicReference.compareAndSet(this, null)) {
                    if (atomicReference.get() != this) {
                        C47998a.b(th2);
                        return;
                    }
                }
                if (aVar.f403399c.b(th2)) {
                    aVar.f403402f.cancel();
                    aVar.a();
                    aVar.b();
                }
            }

            @Override // io.reactivex.rxjava3.core.t
            public final void onSuccess(R r12) {
                this.f403407c = r12;
                this.f403406b.b();
            }
        }

        public a(InterfaceC41782o interfaceC41782o) {
            this.f403398b = interfaceC41782o;
        }

        @Override // org.reactivestreams.d
        public final void K(org.reactivestreams.e eVar) {
            if (SubscriptionHelper.i(this.f403402f, eVar)) {
                this.f403402f = eVar;
                this.f403398b.K(this);
                eVar.request(Long.MAX_VALUE);
            }
        }

        public final void a() {
            AtomicReference<C11479a<R>> atomicReference = this.f403401e;
            C11479a<Object> c11479a = f403397j;
            C11479a<Object> c11479a2 = (C11479a) atomicReference.getAndSet(c11479a);
            if (c11479a2 == null || c11479a2 == c11479a) {
                return;
            }
            DisposableHelper.a(c11479a2);
        }

        public final void b() {
            if (getAndIncrement() != 0) {
                return;
            }
            InterfaceC41782o interfaceC41782o = this.f403398b;
            io.reactivex.rxjava3.internal.util.b bVar = this.f403399c;
            AtomicReference<C11479a<R>> atomicReference = this.f403401e;
            AtomicLong atomicLong = this.f403400d;
            long j12 = this.f403405i;
            int iAddAndGet = 1;
            while (!this.f403404h) {
                if (bVar.get() != null) {
                    bVar.g(interfaceC41782o);
                    return;
                }
                boolean z12 = this.f403403g;
                C11479a<R> c11479a = atomicReference.get();
                boolean z13 = c11479a == null;
                if (z12 && z13) {
                    bVar.g(interfaceC41782o);
                    return;
                }
                if (z13 || c11479a.f403407c == null || j12 == atomicLong.get()) {
                    this.f403405i = j12;
                    iAddAndGet = addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                } else {
                    while (!atomicReference.compareAndSet(c11479a, null) && atomicReference.get() == c11479a) {
                    }
                    interfaceC41782o.onNext(c11479a.f403407c);
                    j12++;
                }
            }
        }

        @Override // org.reactivestreams.e
        public final void cancel() {
            this.f403404h = true;
            this.f403402f.cancel();
            a();
            this.f403399c.c();
        }

        @Override // org.reactivestreams.d
        public final void e() {
            this.f403403g = true;
            b();
        }

        @Override // org.reactivestreams.d
        public final void onError(Throwable th2) {
            if (this.f403399c.b(th2)) {
                a();
                this.f403403g = true;
                b();
            }
        }

        @Override // org.reactivestreams.d
        public final void onNext(T t12) {
            AtomicReference<C11479a<R>> atomicReference = this.f403401e;
            C11479a c11479a = (C11479a) atomicReference.get();
            if (c11479a != null) {
                DisposableHelper.a(c11479a);
            }
            try {
                throw null;
            } catch (Throwable th2) {
                io.reactivex.rxjava3.exceptions.a.a(th2);
                this.f403402f.cancel();
                atomicReference.getAndSet(f403397j);
                onError(th2);
            }
        }

        @Override // org.reactivestreams.e
        public final void request(long j12) {
            io.reactivex.rxjava3.internal.util.c.a(this.f403400d, j12);
            b();
        }
    }

    @Override // io.reactivex.rxjava3.core.AbstractC41777j
    public final void u(org.reactivestreams.d<? super R> dVar) {
        new a((InterfaceC41782o) dVar);
        throw null;
    }
}
