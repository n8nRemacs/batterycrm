package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.InterfaceC41782o;
import io.reactivex.rxjava3.exceptions.MissingBackpressureException;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: FlowableSampleTimed.java */
/* renamed from: io.reactivex.rxjava3.internal.operators.flowable.q1, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41880q1<T> extends AbstractC41833b<T, T> {

    /* compiled from: FlowableSampleTimed.java */
    /* renamed from: io.reactivex.rxjava3.internal.operators.flowable.q1$a */
    public static final class a<T> extends c<T> {
        private static final long serialVersionUID = -7139995637533111443L;

        public a() {
            throw null;
        }

        @Override // io.reactivex.rxjava3.internal.operators.flowable.C41880q1.c
        public final void a() {
            b();
            throw null;
        }

        @Override // io.reactivex.rxjava3.internal.operators.flowable.C41880q1.c, java.lang.Runnable
        public final void run() {
            throw null;
        }
    }

    /* compiled from: FlowableSampleTimed.java */
    /* renamed from: io.reactivex.rxjava3.internal.operators.flowable.q1$b */
    public static final class b<T> extends c<T> {
        private static final long serialVersionUID = -7139995637533111443L;

        public b() {
            throw null;
        }

        @Override // io.reactivex.rxjava3.internal.operators.flowable.C41880q1.c
        public final void a() {
            this.f402942b.e();
        }
    }

    /* compiled from: FlowableSampleTimed.java */
    /* renamed from: io.reactivex.rxjava3.internal.operators.flowable.q1$c */
    public static abstract class c<T> extends AtomicReference<T> implements InterfaceC41782o<T>, org.reactivestreams.e, Runnable {
        private static final long serialVersionUID = -3517602651313910099L;

        /* renamed from: b, reason: collision with root package name */
        public final io.reactivex.rxjava3.subscribers.e f402942b;

        /* renamed from: c, reason: collision with root package name */
        public final AtomicLong f402943c = new AtomicLong();

        /* renamed from: d, reason: collision with root package name */
        public final m41.d f402944d = new m41.d();

        /* renamed from: e, reason: collision with root package name */
        public org.reactivestreams.e f402945e;

        public c(io.reactivex.rxjava3.subscribers.e eVar) {
            this.f402942b = eVar;
        }

        @Override // org.reactivestreams.d
        public final void K(org.reactivestreams.e eVar) {
            if (SubscriptionHelper.i(this.f402945e, eVar)) {
                this.f402945e = eVar;
                this.f402942b.K(this);
                throw null;
            }
        }

        public abstract void a();

        public final void b() {
            T andSet = getAndSet(null);
            if (andSet != null) {
                AtomicLong atomicLong = this.f402943c;
                long j12 = atomicLong.get();
                io.reactivex.rxjava3.subscribers.e eVar = this.f402942b;
                if (j12 != 0) {
                    eVar.onNext(andSet);
                    io.reactivex.rxjava3.internal.util.c.e(atomicLong, 1L);
                } else {
                    cancel();
                    eVar.onError(new MissingBackpressureException("Couldn't emit value due to lack of requests!"));
                }
            }
        }

        @Override // org.reactivestreams.e
        public final void cancel() {
            DisposableHelper.a(this.f402944d);
            this.f402945e.cancel();
        }

        @Override // org.reactivestreams.d
        public final void e() {
            DisposableHelper.a(this.f402944d);
            a();
        }

        @Override // org.reactivestreams.d
        public final void onError(Throwable th2) {
            DisposableHelper.a(this.f402944d);
            this.f402942b.onError(th2);
        }

        @Override // org.reactivestreams.d
        public final void onNext(T t12) {
            lazySet(t12);
        }

        @Override // org.reactivestreams.e
        public final void request(long j12) {
            if (SubscriptionHelper.h(j12)) {
                io.reactivex.rxjava3.internal.util.c.a(this.f402943c, j12);
            }
        }

        public void run() {
            b();
        }
    }

    @Override // io.reactivex.rxjava3.core.AbstractC41777j
    public final void u(org.reactivestreams.d<? super T> dVar) {
        this.f402624c.q(new b(new io.reactivex.rxjava3.subscribers.e((InterfaceC41782o) dVar)));
    }
}
