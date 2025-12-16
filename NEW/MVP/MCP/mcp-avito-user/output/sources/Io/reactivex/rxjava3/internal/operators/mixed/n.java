package io.reactivex.rxjava3.internal.operators.mixed;

import io.reactivex.rxjava3.core.AbstractC41777j;
import io.reactivex.rxjava3.core.InterfaceC41782o;
import io.reactivex.rxjava3.core.L;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import s41.C47998a;

/* compiled from: FlowableSwitchMapSingle.java */
/* loaded from: classes8.dex */
public final class n<T, R> extends AbstractC41777j<R> {

    /* compiled from: FlowableSwitchMapSingle.java */
    public static final class a<T, R> extends AtomicInteger implements InterfaceC41782o<T>, org.reactivestreams.e {

        /* renamed from: j, reason: collision with root package name */
        public static final C11480a<Object> f403408j = new C11480a<>(null);
        private static final long serialVersionUID = -5402190102429853762L;

        /* renamed from: b, reason: collision with root package name */
        public final InterfaceC41782o f403409b;

        /* renamed from: c, reason: collision with root package name */
        public final io.reactivex.rxjava3.internal.util.b f403410c = new io.reactivex.rxjava3.internal.util.b();

        /* renamed from: d, reason: collision with root package name */
        public final AtomicLong f403411d = new AtomicLong();

        /* renamed from: e, reason: collision with root package name */
        public final AtomicReference<C11480a<R>> f403412e = new AtomicReference<>();

        /* renamed from: f, reason: collision with root package name */
        public org.reactivestreams.e f403413f;

        /* renamed from: g, reason: collision with root package name */
        public volatile boolean f403414g;

        /* renamed from: h, reason: collision with root package name */
        public volatile boolean f403415h;

        /* renamed from: i, reason: collision with root package name */
        public long f403416i;

        /* compiled from: FlowableSwitchMapSingle.java */
        /* renamed from: io.reactivex.rxjava3.internal.operators.mixed.n$a$a, reason: collision with other inner class name */
        public static final class C11480a<R> extends AtomicReference<io.reactivex.rxjava3.disposables.d> implements L<R> {
            private static final long serialVersionUID = 8042919737683345351L;

            /* renamed from: b, reason: collision with root package name */
            public final a<?, R> f403417b;

            /* renamed from: c, reason: collision with root package name */
            public volatile R f403418c;

            public C11480a(a<?, R> aVar) {
                this.f403417b = aVar;
            }

            @Override // io.reactivex.rxjava3.core.L
            public final void b(io.reactivex.rxjava3.disposables.d dVar) {
                DisposableHelper.e(this, dVar);
            }

            @Override // io.reactivex.rxjava3.core.L
            public final void onError(Throwable th2) {
                a<?, R> aVar = this.f403417b;
                AtomicReference<C11480a<R>> atomicReference = aVar.f403412e;
                while (!atomicReference.compareAndSet(this, null)) {
                    if (atomicReference.get() != this) {
                        C47998a.b(th2);
                        return;
                    }
                }
                if (aVar.f403410c.b(th2)) {
                    aVar.f403413f.cancel();
                    aVar.a();
                    aVar.b();
                }
            }

            @Override // io.reactivex.rxjava3.core.L
            public final void onSuccess(R r12) {
                this.f403418c = r12;
                this.f403417b.b();
            }
        }

        public a(InterfaceC41782o interfaceC41782o) {
            this.f403409b = interfaceC41782o;
        }

        @Override // org.reactivestreams.d
        public final void K(org.reactivestreams.e eVar) {
            if (SubscriptionHelper.i(this.f403413f, eVar)) {
                this.f403413f = eVar;
                this.f403409b.K(this);
                eVar.request(Long.MAX_VALUE);
            }
        }

        public final void a() {
            AtomicReference<C11480a<R>> atomicReference = this.f403412e;
            C11480a<Object> c11480a = f403408j;
            C11480a<Object> c11480a2 = (C11480a) atomicReference.getAndSet(c11480a);
            if (c11480a2 == null || c11480a2 == c11480a) {
                return;
            }
            DisposableHelper.a(c11480a2);
        }

        public final void b() {
            if (getAndIncrement() != 0) {
                return;
            }
            InterfaceC41782o interfaceC41782o = this.f403409b;
            io.reactivex.rxjava3.internal.util.b bVar = this.f403410c;
            AtomicReference<C11480a<R>> atomicReference = this.f403412e;
            AtomicLong atomicLong = this.f403411d;
            long j12 = this.f403416i;
            int iAddAndGet = 1;
            while (!this.f403415h) {
                if (bVar.get() != null) {
                    bVar.g(interfaceC41782o);
                    return;
                }
                boolean z12 = this.f403414g;
                C11480a<R> c11480a = atomicReference.get();
                boolean z13 = c11480a == null;
                if (z12 && z13) {
                    bVar.g(interfaceC41782o);
                    return;
                }
                if (z13 || c11480a.f403418c == null || j12 == atomicLong.get()) {
                    this.f403416i = j12;
                    iAddAndGet = addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                } else {
                    while (!atomicReference.compareAndSet(c11480a, null) && atomicReference.get() == c11480a) {
                    }
                    interfaceC41782o.onNext(c11480a.f403418c);
                    j12++;
                }
            }
        }

        @Override // org.reactivestreams.e
        public final void cancel() {
            this.f403415h = true;
            this.f403413f.cancel();
            a();
            this.f403410c.c();
        }

        @Override // org.reactivestreams.d
        public final void e() {
            this.f403414g = true;
            b();
        }

        @Override // org.reactivestreams.d
        public final void onError(Throwable th2) {
            if (this.f403410c.b(th2)) {
                a();
                this.f403414g = true;
                b();
            }
        }

        @Override // org.reactivestreams.d
        public final void onNext(T t12) {
            AtomicReference<C11480a<R>> atomicReference = this.f403412e;
            C11480a c11480a = (C11480a) atomicReference.get();
            if (c11480a != null) {
                DisposableHelper.a(c11480a);
            }
            try {
                throw null;
            } catch (Throwable th2) {
                io.reactivex.rxjava3.exceptions.a.a(th2);
                this.f403413f.cancel();
                atomicReference.getAndSet(f403408j);
                onError(th2);
            }
        }

        @Override // org.reactivestreams.e
        public final void request(long j12) {
            io.reactivex.rxjava3.internal.util.c.a(this.f403411d, j12);
            b();
        }
    }

    @Override // io.reactivex.rxjava3.core.AbstractC41777j
    public final void u(org.reactivestreams.d<? super R> dVar) {
        new a((InterfaceC41782o) dVar);
        throw null;
    }
}
