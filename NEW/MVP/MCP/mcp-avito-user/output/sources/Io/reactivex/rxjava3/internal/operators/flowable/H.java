package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.InterfaceC41782o;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import s41.C47998a;

/* compiled from: FlowableDebounceTimed.java */
/* loaded from: classes8.dex */
public final class H<T> extends AbstractC41833b<T, T> {

    /* compiled from: FlowableDebounceTimed.java */
    public static final class a<T> extends AtomicReference<io.reactivex.rxjava3.disposables.d> implements Runnable, io.reactivex.rxjava3.disposables.d {
        private static final long serialVersionUID = 6812032969491025141L;

        /* renamed from: b, reason: collision with root package name */
        public final T f402351b;

        /* renamed from: c, reason: collision with root package name */
        public final long f402352c;

        /* renamed from: d, reason: collision with root package name */
        public final b<T> f402353d;

        /* renamed from: e, reason: collision with root package name */
        public final AtomicBoolean f402354e = new AtomicBoolean();

        public a(T t12, long j12, b<T> bVar) {
            this.f402351b = t12;
            this.f402352c = j12;
            this.f402353d = bVar;
        }

        public final void a() {
            if (this.f402354e.compareAndSet(false, true)) {
                b<T> bVar = this.f402353d;
                if (this.f402352c == bVar.f402357d) {
                    if (bVar.get() != 0) {
                        throw null;
                    }
                    bVar.cancel();
                    throw null;
                }
            }
        }

        @Override // io.reactivex.rxjava3.disposables.d
        public final void dispose() {
            DisposableHelper.a(this);
        }

        @Override // io.reactivex.rxjava3.disposables.d
        /* renamed from: i */
        public final boolean getF318621e() {
            return get() == DisposableHelper.f401986b;
        }

        @Override // java.lang.Runnable
        public final void run() {
            a();
        }
    }

    /* compiled from: FlowableDebounceTimed.java */
    public static final class b<T> extends AtomicLong implements InterfaceC41782o<T>, org.reactivestreams.e {
        private static final long serialVersionUID = -9102637559663639004L;

        /* renamed from: b, reason: collision with root package name */
        public org.reactivestreams.e f402355b;

        /* renamed from: c, reason: collision with root package name */
        public io.reactivex.rxjava3.disposables.d f402356c;

        /* renamed from: d, reason: collision with root package name */
        public volatile long f402357d;

        /* renamed from: e, reason: collision with root package name */
        public boolean f402358e;

        public b() {
            throw null;
        }

        @Override // org.reactivestreams.d
        public final void K(org.reactivestreams.e eVar) {
            if (SubscriptionHelper.i(this.f402355b, eVar)) {
                this.f402355b = eVar;
                throw null;
            }
        }

        @Override // org.reactivestreams.e
        public final void cancel() {
            this.f402355b.cancel();
            throw null;
        }

        @Override // org.reactivestreams.d
        public final void e() {
            if (this.f402358e) {
                return;
            }
            this.f402358e = true;
            io.reactivex.rxjava3.disposables.d dVar = this.f402356c;
            if (dVar != null) {
                DisposableHelper.a((a) dVar);
            }
            a aVar = (a) dVar;
            if (aVar != null) {
                aVar.a();
            }
            throw null;
        }

        @Override // org.reactivestreams.d
        public final void onError(Throwable th2) {
            if (this.f402358e) {
                C47998a.b(th2);
                return;
            }
            this.f402358e = true;
            io.reactivex.rxjava3.disposables.d dVar = this.f402356c;
            if (dVar != null) {
                DisposableHelper.a((a) dVar);
            }
            throw null;
        }

        @Override // org.reactivestreams.d
        public final void onNext(T t12) {
            if (this.f402358e) {
                return;
            }
            long j12 = this.f402357d + 1;
            this.f402357d = j12;
            io.reactivex.rxjava3.disposables.d dVar = this.f402356c;
            if (dVar != null) {
                DisposableHelper.a((a) dVar);
            }
            this.f402356c = new a(t12, j12, this);
            throw null;
        }

        @Override // org.reactivestreams.e
        public final void request(long j12) {
            if (SubscriptionHelper.h(j12)) {
                io.reactivex.rxjava3.internal.util.c.a(this, j12);
            }
        }
    }

    @Override // io.reactivex.rxjava3.core.AbstractC41777j
    public final void u(org.reactivestreams.d<? super T> dVar) {
        throw null;
    }
}
