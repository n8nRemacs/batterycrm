package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.AbstractC41777j;
import io.reactivex.rxjava3.core.InterfaceC41782o;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import s41.C47998a;

/* compiled from: FlowableRefCount.java */
/* renamed from: io.reactivex.rxjava3.internal.operators.flowable.h1, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41853h1<T> extends AbstractC41777j<T> {

    /* renamed from: c, reason: collision with root package name */
    public a f402794c;

    /* compiled from: FlowableRefCount.java */
    /* renamed from: io.reactivex.rxjava3.internal.operators.flowable.h1$a */
    public static final class a extends AtomicReference<io.reactivex.rxjava3.disposables.d> implements Runnable, l41.g<io.reactivex.rxjava3.disposables.d> {
        private static final long serialVersionUID = -4552101107598366241L;

        /* renamed from: b, reason: collision with root package name */
        public final C41853h1<?> f402795b;

        /* renamed from: c, reason: collision with root package name */
        public long f402796c;

        /* renamed from: d, reason: collision with root package name */
        public boolean f402797d;

        /* renamed from: e, reason: collision with root package name */
        public boolean f402798e;

        public a(C41853h1<?> c41853h1) {
            this.f402795b = c41853h1;
        }

        @Override // l41.g
        public final void accept(io.reactivex.rxjava3.disposables.d dVar) {
            DisposableHelper.c(this, dVar);
            synchronized (this.f402795b) {
                try {
                    if (this.f402798e) {
                        this.f402795b.getClass();
                        throw null;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f402795b.A(this);
        }
    }

    /* compiled from: FlowableRefCount.java */
    /* renamed from: io.reactivex.rxjava3.internal.operators.flowable.h1$b */
    public static final class b<T> extends AtomicBoolean implements InterfaceC41782o<T>, org.reactivestreams.e {
        private static final long serialVersionUID = -7419642935409022375L;

        /* renamed from: b, reason: collision with root package name */
        public final InterfaceC41782o f402799b;

        /* renamed from: c, reason: collision with root package name */
        public final C41853h1<T> f402800c;

        /* renamed from: d, reason: collision with root package name */
        public final a f402801d;

        /* renamed from: e, reason: collision with root package name */
        public org.reactivestreams.e f402802e;

        public b(InterfaceC41782o interfaceC41782o, C41853h1 c41853h1, a aVar) {
            this.f402799b = interfaceC41782o;
            this.f402800c = c41853h1;
            this.f402801d = aVar;
        }

        @Override // org.reactivestreams.d
        public final void K(org.reactivestreams.e eVar) {
            if (SubscriptionHelper.i(this.f402802e, eVar)) {
                this.f402802e = eVar;
                this.f402799b.K(this);
            }
        }

        @Override // org.reactivestreams.e
        public final void cancel() {
            this.f402802e.cancel();
            if (compareAndSet(false, true)) {
                C41853h1<T> c41853h1 = this.f402800c;
                a aVar = this.f402801d;
                synchronized (c41853h1) {
                    try {
                        a aVar2 = c41853h1.f402794c;
                        if (aVar2 != null && aVar2 == aVar) {
                            long j12 = aVar.f402796c - 1;
                            aVar.f402796c = j12;
                            if (j12 == 0 && aVar.f402797d) {
                                c41853h1.A(aVar);
                            }
                        }
                    } finally {
                    }
                }
            }
        }

        @Override // org.reactivestreams.d
        public final void e() {
            if (compareAndSet(false, true)) {
                this.f402800c.z(this.f402801d);
                this.f402799b.e();
            }
        }

        @Override // org.reactivestreams.d
        public final void onError(Throwable th2) {
            if (!compareAndSet(false, true)) {
                C47998a.b(th2);
            } else {
                this.f402800c.z(this.f402801d);
                this.f402799b.onError(th2);
            }
        }

        @Override // org.reactivestreams.d
        public final void onNext(T t12) {
            this.f402799b.onNext(t12);
        }

        @Override // org.reactivestreams.e
        public final void request(long j12) {
            this.f402802e.request(j12);
        }
    }

    public final void A(a aVar) {
        synchronized (this) {
            try {
                if (aVar.f402796c == 0 && aVar == this.f402794c) {
                    this.f402794c = null;
                    io.reactivex.rxjava3.disposables.d dVar = aVar.get();
                    DisposableHelper.a(aVar);
                    if (dVar != null) {
                        throw null;
                    }
                    aVar.f402798e = true;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // io.reactivex.rxjava3.core.AbstractC41777j
    public final void u(org.reactivestreams.d<? super T> dVar) {
        a aVar;
        synchronized (this) {
            try {
                aVar = this.f402794c;
                if (aVar == null) {
                    aVar = new a(this);
                    this.f402794c = aVar;
                }
                long j12 = aVar.f402796c + 1;
                aVar.f402796c = j12;
                if (!aVar.f402797d && j12 == 0) {
                    aVar.f402797d = true;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        new b((InterfaceC41782o) dVar, this, aVar);
        throw null;
    }

    public final void z(a aVar) {
        synchronized (this) {
            try {
                if (this.f402794c == aVar) {
                    aVar.getClass();
                    long j12 = aVar.f402796c - 1;
                    aVar.f402796c = j12;
                    if (j12 == 0) {
                        this.f402794c = null;
                        throw null;
                    }
                }
            } finally {
            }
        }
    }
}
