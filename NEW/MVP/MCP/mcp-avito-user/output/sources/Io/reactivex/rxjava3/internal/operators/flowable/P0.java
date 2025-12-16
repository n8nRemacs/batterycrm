package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.InterfaceC41782o;
import io.reactivex.rxjava3.exceptions.MissingBackpressureException;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.atomic.AtomicLong;
import l41.InterfaceC43543a;
import o41.AbstractC44583c;

/* compiled from: FlowableOnBackpressureBuffer.java */
/* loaded from: classes8.dex */
public final class P0<T> extends AbstractC41833b<T, T> {

    /* renamed from: d, reason: collision with root package name */
    public final int f402485d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f402486e;

    /* renamed from: f, reason: collision with root package name */
    public final InterfaceC43543a f402487f;

    /* compiled from: FlowableOnBackpressureBuffer.java */
    public static final class a<T> extends AbstractC44583c<T> implements InterfaceC41782o<T> {
        private static final long serialVersionUID = -2514538129242366402L;

        /* renamed from: b, reason: collision with root package name */
        public final InterfaceC41782o f402488b;

        /* renamed from: c, reason: collision with root package name */
        public final q41.f<T> f402489c;

        /* renamed from: d, reason: collision with root package name */
        public final InterfaceC43543a f402490d;

        /* renamed from: e, reason: collision with root package name */
        public org.reactivestreams.e f402491e;

        /* renamed from: f, reason: collision with root package name */
        public volatile boolean f402492f;

        /* renamed from: g, reason: collision with root package name */
        public volatile boolean f402493g;

        /* renamed from: h, reason: collision with root package name */
        public Throwable f402494h;

        /* renamed from: i, reason: collision with root package name */
        public final AtomicLong f402495i = new AtomicLong();

        /* renamed from: j, reason: collision with root package name */
        public boolean f402496j;

        public a(InterfaceC41782o interfaceC41782o, int i12, boolean z12, InterfaceC43543a interfaceC43543a) {
            this.f402488b = interfaceC41782o;
            this.f402490d = interfaceC43543a;
            this.f402489c = z12 ? new q41.i<>(i12) : new q41.h<>(i12);
        }

        @Override // org.reactivestreams.d
        public final void K(org.reactivestreams.e eVar) {
            if (SubscriptionHelper.i(this.f402491e, eVar)) {
                this.f402491e = eVar;
                this.f402488b.K(this);
                eVar.request(Long.MAX_VALUE);
            }
        }

        public final void c() {
            if (getAndIncrement() == 0) {
                q41.f<T> fVar = this.f402489c;
                InterfaceC41782o interfaceC41782o = this.f402488b;
                int iAddAndGet = 1;
                while (!l(this.f402493g, fVar.isEmpty(), interfaceC41782o)) {
                    long j12 = this.f402495i.get();
                    long j13 = 0;
                    while (j13 != j12) {
                        boolean z12 = this.f402493g;
                        T tPoll = fVar.poll();
                        boolean z13 = tPoll == null;
                        if (l(z12, z13, interfaceC41782o)) {
                            return;
                        }
                        if (z13) {
                            break;
                        }
                        interfaceC41782o.onNext(tPoll);
                        j13++;
                    }
                    if (j13 == j12 && l(this.f402493g, fVar.isEmpty(), interfaceC41782o)) {
                        return;
                    }
                    if (j13 != 0 && j12 != Long.MAX_VALUE) {
                        this.f402495i.addAndGet(-j13);
                    }
                    iAddAndGet = addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                }
            }
        }

        @Override // org.reactivestreams.e
        public final void cancel() {
            if (this.f402492f) {
                return;
            }
            this.f402492f = true;
            this.f402491e.cancel();
            if (this.f402496j || getAndIncrement() != 0) {
                return;
            }
            this.f402489c.clear();
        }

        @Override // q41.g
        public final void clear() {
            this.f402489c.clear();
        }

        @Override // org.reactivestreams.d
        public final void e() {
            this.f402493g = true;
            if (this.f402496j) {
                this.f402488b.e();
            } else {
                c();
            }
        }

        @Override // q41.g
        public final boolean isEmpty() {
            return this.f402489c.isEmpty();
        }

        public final boolean l(boolean z12, boolean z13, org.reactivestreams.d<? super T> dVar) {
            if (this.f402492f) {
                this.f402489c.clear();
                return true;
            }
            if (!z12) {
                return false;
            }
            Throwable th2 = this.f402494h;
            if (th2 != null) {
                this.f402489c.clear();
                dVar.onError(th2);
                return true;
            }
            if (!z13) {
                return false;
            }
            dVar.e();
            return true;
        }

        @Override // org.reactivestreams.d
        public final void onError(Throwable th2) {
            this.f402494h = th2;
            this.f402493g = true;
            if (this.f402496j) {
                this.f402488b.onError(th2);
            } else {
                c();
            }
        }

        @Override // org.reactivestreams.d
        public final void onNext(T t12) {
            if (this.f402489c.offer(t12)) {
                if (this.f402496j) {
                    this.f402488b.onNext(null);
                    return;
                } else {
                    c();
                    return;
                }
            }
            this.f402491e.cancel();
            MissingBackpressureException missingBackpressureException = new MissingBackpressureException("Buffer is full");
            try {
                this.f402490d.getClass();
            } catch (Throwable th2) {
                io.reactivex.rxjava3.exceptions.a.a(th2);
                missingBackpressureException.initCause(th2);
            }
            onError(missingBackpressureException);
        }

        @Override // q41.g
        @j41.f
        public final T poll() {
            return this.f402489c.poll();
        }

        @Override // org.reactivestreams.e
        public final void request(long j12) {
            if (this.f402496j || !SubscriptionHelper.h(j12)) {
                return;
            }
            io.reactivex.rxjava3.internal.util.c.a(this.f402495i, j12);
            c();
        }

        @Override // q41.InterfaceC47200c
        public final int v(int i12) {
            if ((i12 & 2) == 0) {
                return 0;
            }
            this.f402496j = true;
            return 2;
        }
    }

    public P0(C41876p0 c41876p0, int i12, InterfaceC43543a interfaceC43543a) {
        super(c41876p0);
        this.f402485d = i12;
        this.f402486e = true;
        this.f402487f = interfaceC43543a;
    }

    @Override // io.reactivex.rxjava3.core.AbstractC41777j
    public final void u(org.reactivestreams.d<? super T> dVar) {
        InterfaceC43543a interfaceC43543a = this.f402487f;
        this.f402624c.q(new a((InterfaceC41782o) dVar, this.f402485d, this.f402486e, interfaceC43543a));
    }
}
