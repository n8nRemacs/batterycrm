package io.reactivex.rxjava3.internal.operators.parallel;

import io.reactivex.rxjava3.core.InterfaceC41782o;
import io.reactivex.rxjava3.exceptions.MissingBackpressureException;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.atomic.AtomicInteger;
import r41.AbstractC47491a;

/* compiled from: ParallelFromPublisher.java */
/* loaded from: classes8.dex */
public final class i<T> extends AbstractC47491a<T> {

    /* compiled from: ParallelFromPublisher.java */
    public static final class a<T> extends AtomicInteger implements InterfaceC41782o<T> {
        private static final long serialVersionUID = -4470634016609963609L;

        /* renamed from: b, reason: collision with root package name */
        public org.reactivestreams.e f404441b;

        /* renamed from: c, reason: collision with root package name */
        public q41.g<T> f404442c;

        /* renamed from: d, reason: collision with root package name */
        public Throwable f404443d;

        /* renamed from: e, reason: collision with root package name */
        public volatile boolean f404444e;

        /* renamed from: f, reason: collision with root package name */
        public int f404445f;

        /* renamed from: g, reason: collision with root package name */
        public volatile boolean f404446g;

        /* renamed from: h, reason: collision with root package name */
        public int f404447h;

        /* renamed from: i, reason: collision with root package name */
        public int f404448i;

        /* compiled from: ParallelFromPublisher.java */
        /* renamed from: io.reactivex.rxjava3.internal.operators.parallel.i$a$a, reason: collision with other inner class name */
        public final class C11508a implements org.reactivestreams.e {

            /* renamed from: b, reason: collision with root package name */
            public final int f404449b;

            /* renamed from: c, reason: collision with root package name */
            public final int f404450c;

            public C11508a(int i12, int i13) {
                this.f404449b = i12;
                this.f404450c = i13;
            }

            @Override // org.reactivestreams.e
            public final void cancel() {
                a.this.getClass();
                throw null;
            }

            @Override // org.reactivestreams.e
            public final void request(long j12) {
                if (SubscriptionHelper.h(j12)) {
                    a.this.getClass();
                    throw null;
                }
            }
        }

        @Override // org.reactivestreams.d
        public final void K(org.reactivestreams.e eVar) {
            if (SubscriptionHelper.i(this.f404441b, eVar)) {
                this.f404441b = eVar;
                if (eVar instanceof q41.d) {
                    q41.d dVar = (q41.d) eVar;
                    int iV2 = dVar.v(7);
                    if (iV2 == 1) {
                        this.f404448i = iV2;
                        this.f404442c = dVar;
                        this.f404444e = true;
                        b();
                        a();
                        return;
                    }
                    if (iV2 == 2) {
                        this.f404448i = iV2;
                        this.f404442c = dVar;
                        b();
                        eVar.request(0);
                        return;
                    }
                }
                this.f404442c = new q41.h(0);
                b();
                eVar.request(0);
            }
        }

        public final void a() {
            if (getAndIncrement() != 0) {
                return;
            }
            if (this.f404448i != 1) {
                throw null;
            }
            throw null;
        }

        public final void b() {
            throw null;
        }

        @Override // org.reactivestreams.d
        public final void e() {
            this.f404444e = true;
            a();
        }

        @Override // org.reactivestreams.d
        public final void onError(Throwable th2) {
            this.f404443d = th2;
            this.f404444e = true;
            a();
        }

        @Override // org.reactivestreams.d
        public final void onNext(T t12) {
            if (this.f404448i != 0 || this.f404442c.offer(t12)) {
                a();
            } else {
                this.f404441b.cancel();
                onError(new MissingBackpressureException("Queue is full?"));
            }
        }
    }
}
