package hu.akarnokd.rxjava3.operators;

import io.reactivex.rxjava3.core.AbstractC41777j;
import io.reactivex.rxjava3.core.InterfaceC41783p;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.atomic.AtomicInteger;
import s41.C47998a;

/* compiled from: FlowableOnBackpressureTimeout.java */
/* renamed from: hu.akarnokd.rxjava3.operators.z, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C41166z<T> extends AbstractC41777j<T> implements InterfaceC41783p<T, T> {

    /* compiled from: FlowableOnBackpressureTimeout.java */
    /* renamed from: hu.akarnokd.rxjava3.operators.z$a */
    public static final class a<T> extends AtomicInteger implements org.reactivestreams.d<T>, org.reactivestreams.e, Runnable {
        private static final long serialVersionUID = 2264324530873250941L;

        /* renamed from: b, reason: collision with root package name */
        public org.reactivestreams.e f398184b;

        /* renamed from: c, reason: collision with root package name */
        public volatile boolean f398185c;

        /* renamed from: d, reason: collision with root package name */
        public Throwable f398186d;

        /* renamed from: e, reason: collision with root package name */
        public volatile boolean f398187e;

        @Override // org.reactivestreams.d
        public final void K(org.reactivestreams.e eVar) {
            if (SubscriptionHelper.i(this.f398184b, eVar)) {
                this.f398184b = eVar;
                throw null;
            }
        }

        public final void a() {
            synchronized (this) {
                throw null;
            }
        }

        public final void b() {
            if (getAndIncrement() == 0) {
                throw null;
            }
        }

        public final void c(T t12) {
            if (t12 == null) {
                return;
            }
            try {
                throw null;
            } catch (Throwable th2) {
                io.reactivex.rxjava3.exceptions.a.a(th2);
                C47998a.b(th2);
            }
        }

        @Override // org.reactivestreams.e
        public final void cancel() {
            this.f398187e = true;
            this.f398184b.cancel();
            throw null;
        }

        @Override // org.reactivestreams.d
        public final void e() {
            this.f398185c = true;
            b();
        }

        @Override // org.reactivestreams.d
        public final void onError(Throwable th2) {
            this.f398186d = th2;
            this.f398185c = true;
            b();
        }

        @Override // org.reactivestreams.d
        public final void onNext(T t12) {
            synchronized (this) {
                throw null;
            }
        }

        @Override // org.reactivestreams.e
        public final void request(long j12) {
            if (SubscriptionHelper.h(j12)) {
                io.reactivex.rxjava3.internal.util.c.a(null, j12);
                b();
            }
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (this.f398187e) {
                return;
            }
            synchronized (this) {
                throw null;
            }
        }
    }

    @Override // io.reactivex.rxjava3.core.AbstractC41777j
    public final void u(org.reactivestreams.d<? super T> dVar) {
        throw null;
    }
}
