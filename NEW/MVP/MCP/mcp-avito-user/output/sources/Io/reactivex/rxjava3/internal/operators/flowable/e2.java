package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.AbstractC41777j;
import io.reactivex.rxjava3.core.H;
import io.reactivex.rxjava3.core.InterfaceC41782o;
import io.reactivex.rxjava3.exceptions.MissingBackpressureException;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: FlowableWindowTimed.java */
/* loaded from: classes8.dex */
public final class e2<T> extends AbstractC41833b<T, AbstractC41777j<T>> {

    /* compiled from: FlowableWindowTimed.java */
    public static abstract class a<T> extends AtomicInteger implements InterfaceC41782o<T>, org.reactivestreams.e {
        private static final long serialVersionUID = 5724293814035355511L;

        /* renamed from: b, reason: collision with root package name */
        public final InterfaceC41782o f402743b;

        /* renamed from: e, reason: collision with root package name */
        public long f402746e;

        /* renamed from: f, reason: collision with root package name */
        public volatile boolean f402747f;

        /* renamed from: g, reason: collision with root package name */
        public Throwable f402748g;

        /* renamed from: h, reason: collision with root package name */
        public org.reactivestreams.e f402749h;

        /* renamed from: j, reason: collision with root package name */
        public volatile boolean f402751j;

        /* renamed from: c, reason: collision with root package name */
        public final io.reactivex.rxjava3.internal.queue.a f402744c = new io.reactivex.rxjava3.internal.queue.a();

        /* renamed from: d, reason: collision with root package name */
        public final AtomicLong f402745d = new AtomicLong();

        /* renamed from: i, reason: collision with root package name */
        public final AtomicBoolean f402750i = new AtomicBoolean();

        /* renamed from: k, reason: collision with root package name */
        public final AtomicInteger f402752k = new AtomicInteger(1);

        public a(InterfaceC41782o interfaceC41782o) {
            this.f402743b = interfaceC41782o;
        }

        @Override // org.reactivestreams.d
        public final void K(org.reactivestreams.e eVar) {
            if (SubscriptionHelper.i(this.f402749h, eVar)) {
                this.f402749h = eVar;
                this.f402743b.K(this);
                b();
            }
        }

        public abstract void a();

        public abstract void b();

        public abstract void c();

        @Override // org.reactivestreams.e
        public final void cancel() {
            if (this.f402750i.compareAndSet(false, true)) {
                d();
            }
        }

        public final void d() {
            if (this.f402752k.decrementAndGet() == 0) {
                a();
                this.f402749h.cancel();
                this.f402751j = true;
                c();
            }
        }

        @Override // org.reactivestreams.d
        public final void e() {
            this.f402747f = true;
            c();
        }

        @Override // org.reactivestreams.d
        public final void onError(Throwable th2) {
            this.f402748g = th2;
            this.f402747f = true;
            c();
        }

        @Override // org.reactivestreams.d
        public final void onNext(T t12) {
            this.f402744c.offer(t12);
            c();
        }

        @Override // org.reactivestreams.e
        public final void request(long j12) {
            if (SubscriptionHelper.h(j12)) {
                io.reactivex.rxjava3.internal.util.c.a(this.f402745d, j12);
            }
        }

        public void run() {
            d();
        }
    }

    /* compiled from: FlowableWindowTimed.java */
    public static final class b<T> extends a<T> implements Runnable {
        private static final long serialVersionUID = -6130475889925953722L;

        /* renamed from: l, reason: collision with root package name */
        public final H.c f402753l;

        /* renamed from: m, reason: collision with root package name */
        public long f402754m;

        /* renamed from: n, reason: collision with root package name */
        public io.reactivex.rxjava3.processors.h<T> f402755n;

        /* renamed from: o, reason: collision with root package name */
        public final m41.d f402756o;

        /* compiled from: FlowableWindowTimed.java */
        public static final class a implements Runnable {
            @Override // java.lang.Runnable
            public final void run() {
                throw null;
            }
        }

        public b(InterfaceC41782o interfaceC41782o) {
            super(interfaceC41782o);
            this.f402753l = null;
            this.f402756o = new m41.d();
        }

        @Override // io.reactivex.rxjava3.internal.operators.flowable.e2.a
        public final void a() {
            m41.d dVar = this.f402756o;
            dVar.getClass();
            DisposableHelper.a(dVar);
            H.c cVar = this.f402753l;
            if (cVar != null) {
                cVar.dispose();
            }
        }

        @Override // io.reactivex.rxjava3.internal.operators.flowable.e2.a
        public final void b() {
            if (this.f402750i.get()) {
                return;
            }
            if (this.f402745d.get() == 0) {
                this.f402749h.cancel();
                this.f402743b.onError(new MissingBackpressureException(e2.z(this.f402746e)));
                a();
                this.f402751j = true;
                return;
            }
            this.f402746e = 1L;
            this.f402752k.getAndIncrement();
            this.f402755n = io.reactivex.rxjava3.processors.h.B(0, this);
            this.f402743b.onNext(new d2(this.f402755n));
            throw null;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // io.reactivex.rxjava3.internal.operators.flowable.e2.a
        public final void c() {
            if (getAndIncrement() != 0) {
                return;
            }
            io.reactivex.rxjava3.internal.queue.a aVar = this.f402744c;
            InterfaceC41782o interfaceC41782o = this.f402743b;
            io.reactivex.rxjava3.processors.h<T> hVarF = this.f402755n;
            int iAddAndGet = 1;
            while (true) {
                if (this.f402751j) {
                    aVar.clear();
                    hVarF = 0;
                    this.f402755n = null;
                } else {
                    boolean z12 = this.f402747f;
                    Object objPoll = aVar.poll();
                    boolean z13 = objPoll == null;
                    if (z12 && z13) {
                        Throwable th2 = this.f402748g;
                        if (th2 != null) {
                            if (hVarF != 0) {
                                hVarF.onError(th2);
                            }
                            interfaceC41782o.onError(th2);
                        } else {
                            if (hVarF != 0) {
                                hVarF.e();
                            }
                            interfaceC41782o.e();
                        }
                        a();
                        this.f402751j = true;
                    } else if (!z13) {
                        if (objPoll instanceof a) {
                            ((a) objPoll).getClass();
                            this.f402754m = 0L;
                            hVarF = f(hVarF);
                        } else if (hVarF != 0) {
                            hVarF.onNext(objPoll);
                            long j12 = this.f402754m + 1;
                            if (j12 == 0) {
                                this.f402754m = 0L;
                                hVarF = f(hVarF);
                            } else {
                                this.f402754m = j12;
                            }
                        }
                    }
                }
                iAddAndGet = addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
            }
        }

        public final io.reactivex.rxjava3.processors.h<T> f(io.reactivex.rxjava3.processors.h<T> hVar) {
            if (hVar != null) {
                hVar.e();
                hVar = null;
            }
            if (this.f402750i.get()) {
                a();
            } else {
                long j12 = this.f402746e;
                if (this.f402745d.get() == j12) {
                    this.f402749h.cancel();
                    a();
                    this.f402751j = true;
                    this.f402743b.onError(new MissingBackpressureException(e2.z(j12)));
                } else {
                    this.f402746e = j12 + 1;
                    this.f402752k.getAndIncrement();
                    hVar = io.reactivex.rxjava3.processors.h.B(0, this);
                    this.f402755n = hVar;
                    d2 d2Var = new d2(hVar);
                    this.f402743b.onNext(d2Var);
                    if (d2Var.z()) {
                        hVar.e();
                    }
                }
            }
            return hVar;
        }
    }

    /* compiled from: FlowableWindowTimed.java */
    public static final class c<T> extends a<T> implements Runnable {

        /* renamed from: m, reason: collision with root package name */
        public static final Object f402757m = new Object();
        private static final long serialVersionUID = 1155822639622580836L;

        /* renamed from: l, reason: collision with root package name */
        public io.reactivex.rxjava3.processors.h<T> f402758l;

        /* compiled from: FlowableWindowTimed.java */
        public final class a implements Runnable {
            @Override // java.lang.Runnable
            public final void run() {
                throw null;
            }
        }

        public c() {
            throw null;
        }

        @Override // io.reactivex.rxjava3.internal.operators.flowable.e2.a
        public final void a() {
            throw null;
        }

        @Override // io.reactivex.rxjava3.internal.operators.flowable.e2.a
        public final void b() {
            if (this.f402750i.get()) {
                return;
            }
            if (this.f402745d.get() != 0) {
                this.f402752k.getAndIncrement();
                io.reactivex.rxjava3.processors.h.B(0, null);
                throw null;
            }
            this.f402749h.cancel();
            this.f402743b.onError(new MissingBackpressureException(e2.z(this.f402746e)));
            throw null;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // io.reactivex.rxjava3.internal.operators.flowable.e2.a
        public final void c() {
            if (getAndIncrement() != 0) {
                return;
            }
            io.reactivex.rxjava3.internal.queue.a aVar = this.f402744c;
            InterfaceC41782o interfaceC41782o = this.f402743b;
            io.reactivex.rxjava3.processors.h<T> hVar = this.f402758l;
            int iAddAndGet = 1;
            while (true) {
                if (this.f402751j) {
                    aVar.clear();
                    this.f402758l = null;
                    hVar = 0;
                } else {
                    boolean z12 = this.f402747f;
                    Object objPoll = aVar.poll();
                    boolean z13 = objPoll == null;
                    if (z12 && z13) {
                        Throwable th2 = this.f402748g;
                        if (th2 != null) {
                            if (hVar != 0) {
                                hVar.onError(th2);
                            }
                            interfaceC41782o.onError(th2);
                            throw null;
                        }
                        if (hVar != 0) {
                            hVar.e();
                        }
                        interfaceC41782o.e();
                        throw null;
                    }
                    if (!z13) {
                        if (objPoll == f402757m) {
                            if (hVar != 0) {
                                hVar.e();
                                this.f402758l = null;
                            }
                            if (this.f402750i.get()) {
                                throw null;
                            }
                            long j12 = this.f402745d.get();
                            long j13 = this.f402746e;
                            if (j12 == j13) {
                                this.f402749h.cancel();
                                throw null;
                            }
                            this.f402746e = j13 + 1;
                            this.f402752k.getAndIncrement();
                            io.reactivex.rxjava3.processors.h.B(0, null);
                            throw null;
                        }
                        if (hVar != 0) {
                            hVar.onNext(objPoll);
                        }
                    }
                }
                iAddAndGet = addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // io.reactivex.rxjava3.internal.operators.flowable.e2.a, java.lang.Runnable
        public final void run() {
            this.f402744c.offer(f402757m);
            c();
        }
    }

    /* compiled from: FlowableWindowTimed.java */
    public static final class d<T> extends a<T> implements Runnable {

        /* renamed from: l, reason: collision with root package name */
        public static final Object f402759l = new Object();

        /* renamed from: m, reason: collision with root package name */
        public static final Object f402760m = new Object();
        private static final long serialVersionUID = -7852870764194095894L;

        /* compiled from: FlowableWindowTimed.java */
        public static final class a implements Runnable {
            @Override // java.lang.Runnable
            public final void run() {
                throw null;
            }
        }

        public d() {
            throw null;
        }

        @Override // io.reactivex.rxjava3.internal.operators.flowable.e2.a
        public final void a() {
            throw null;
        }

        @Override // io.reactivex.rxjava3.internal.operators.flowable.e2.a
        public final void b() {
            if (this.f402750i.get()) {
                return;
            }
            long j12 = this.f402745d.get();
            InterfaceC41782o interfaceC41782o = this.f402743b;
            if (j12 == 0) {
                this.f402749h.cancel();
                interfaceC41782o.onError(new MissingBackpressureException(e2.z(this.f402746e)));
                throw null;
            }
            this.f402746e = 1L;
            this.f402752k.getAndIncrement();
            io.reactivex.rxjava3.processors.h.B(0, this);
            throw null;
        }

        @Override // io.reactivex.rxjava3.internal.operators.flowable.e2.a
        public final void c() {
            if (getAndIncrement() != 0) {
                return;
            }
            io.reactivex.rxjava3.internal.queue.a aVar = this.f402744c;
            int iAddAndGet = 1;
            while (!this.f402751j) {
                boolean z12 = this.f402747f;
                Object objPoll = aVar.poll();
                boolean z13 = objPoll == null;
                if (z12 && z13) {
                    this.f402748g.getClass();
                    throw null;
                }
                if (z13) {
                    iAddAndGet = addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                } else {
                    if (objPoll != f402759l) {
                        if (objPoll != f402760m) {
                            throw null;
                        }
                        throw null;
                    }
                    if (!this.f402750i.get()) {
                        long j12 = this.f402746e;
                        if (this.f402745d.get() == j12) {
                            this.f402749h.cancel();
                            new MissingBackpressureException(e2.z(j12));
                            throw null;
                        }
                        this.f402746e = j12 + 1;
                        this.f402752k.getAndIncrement();
                        io.reactivex.rxjava3.processors.h.B(0, this);
                        throw null;
                    }
                }
            }
            aVar.clear();
            throw null;
        }
    }

    public static String z(long j12) {
        return androidx.compose.ui.graphics.colorspace.e.i(j12, "Unable to emit the next window (#", ") due to lack of requests. Please make sure the downstream is ready to consume windows.");
    }

    @Override // io.reactivex.rxjava3.core.AbstractC41777j
    public final void u(org.reactivestreams.d<? super AbstractC41777j<T>> dVar) {
        this.f402624c.q(new b((InterfaceC41782o) dVar));
    }
}
