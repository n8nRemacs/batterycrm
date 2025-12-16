package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.AbstractC41777j;
import io.reactivex.rxjava3.core.InterfaceC41782o;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: FlowableMergeWithMaybe.java */
/* loaded from: classes8.dex */
public final class L0<T> extends AbstractC41833b<T, T> {

    /* compiled from: FlowableMergeWithMaybe.java */
    public static final class a<T> extends AtomicInteger implements InterfaceC41782o<T>, org.reactivestreams.e {
        private static final long serialVersionUID = -4592979584110982903L;

        /* renamed from: b, reason: collision with root package name */
        public final InterfaceC41782o f402405b;

        /* renamed from: c, reason: collision with root package name */
        public final AtomicReference<org.reactivestreams.e> f402406c = new AtomicReference<>();

        /* renamed from: d, reason: collision with root package name */
        public final C11455a<T> f402407d = new C11455a<>(this);

        /* renamed from: e, reason: collision with root package name */
        public final io.reactivex.rxjava3.internal.util.b f402408e = new io.reactivex.rxjava3.internal.util.b();

        /* renamed from: f, reason: collision with root package name */
        public final AtomicLong f402409f = new AtomicLong();

        /* renamed from: g, reason: collision with root package name */
        public final int f402410g;

        /* renamed from: h, reason: collision with root package name */
        public final int f402411h;

        /* renamed from: i, reason: collision with root package name */
        public volatile q41.h f402412i;

        /* renamed from: j, reason: collision with root package name */
        public T f402413j;

        /* renamed from: k, reason: collision with root package name */
        public volatile boolean f402414k;

        /* renamed from: l, reason: collision with root package name */
        public volatile boolean f402415l;

        /* renamed from: m, reason: collision with root package name */
        public volatile int f402416m;

        /* renamed from: n, reason: collision with root package name */
        public long f402417n;

        /* renamed from: o, reason: collision with root package name */
        public int f402418o;

        /* compiled from: FlowableMergeWithMaybe.java */
        /* renamed from: io.reactivex.rxjava3.internal.operators.flowable.L0$a$a, reason: collision with other inner class name */
        public static final class C11455a<T> extends AtomicReference<io.reactivex.rxjava3.disposables.d> implements io.reactivex.rxjava3.core.t<T> {
            private static final long serialVersionUID = -2935427570954647017L;

            /* renamed from: b, reason: collision with root package name */
            public final a<T> f402419b;

            public C11455a(a<T> aVar) {
                this.f402419b = aVar;
            }

            @Override // io.reactivex.rxjava3.core.t
            public final void b(io.reactivex.rxjava3.disposables.d dVar) {
                DisposableHelper.e(this, dVar);
            }

            @Override // io.reactivex.rxjava3.core.t
            public final void e() {
                a<T> aVar = this.f402419b;
                aVar.f402416m = 2;
                if (aVar.getAndIncrement() == 0) {
                    aVar.a();
                }
            }

            @Override // io.reactivex.rxjava3.core.t
            public final void onError(Throwable th2) {
                a<T> aVar = this.f402419b;
                if (aVar.f402408e.b(th2)) {
                    SubscriptionHelper.a(aVar.f402406c);
                    if (aVar.getAndIncrement() == 0) {
                        aVar.a();
                    }
                }
            }

            @Override // io.reactivex.rxjava3.core.t
            public final void onSuccess(T t12) {
                a<T> aVar = this.f402419b;
                if (aVar.compareAndSet(0, 1)) {
                    long j12 = aVar.f402417n;
                    if (aVar.f402409f.get() != j12) {
                        aVar.f402417n = j12 + 1;
                        aVar.f402405b.onNext(t12);
                        aVar.f402416m = 2;
                    } else {
                        aVar.f402413j = t12;
                        aVar.f402416m = 1;
                        if (aVar.decrementAndGet() == 0) {
                            return;
                        }
                    }
                } else {
                    aVar.f402413j = t12;
                    aVar.f402416m = 1;
                    if (aVar.getAndIncrement() != 0) {
                        return;
                    }
                }
                aVar.a();
            }
        }

        public a(InterfaceC41782o interfaceC41782o) {
            this.f402405b = interfaceC41782o;
            int i12 = AbstractC41777j.f401972b;
            this.f402410g = i12;
            this.f402411h = i12 - (i12 >> 2);
        }

        @Override // org.reactivestreams.d
        public final void K(org.reactivestreams.e eVar) {
            SubscriptionHelper.e(this.f402406c, eVar, this.f402410g);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final void a() {
            InterfaceC41782o interfaceC41782o = this.f402405b;
            long j12 = this.f402417n;
            int i12 = this.f402418o;
            int i13 = this.f402411h;
            int i14 = 1;
            int iAddAndGet = 1;
            while (true) {
                long j13 = this.f402409f.get();
                while (j12 != j13) {
                    if (this.f402414k) {
                        this.f402413j = null;
                        this.f402412i = null;
                        return;
                    }
                    if (this.f402408e.get() != null) {
                        this.f402413j = null;
                        this.f402412i = null;
                        this.f402408e.g(this.f402405b);
                        return;
                    }
                    int i15 = this.f402416m;
                    if (i15 == i14) {
                        T t12 = this.f402413j;
                        this.f402413j = null;
                        this.f402416m = 2;
                        interfaceC41782o.onNext(t12);
                        j12++;
                    } else {
                        boolean z12 = this.f402415l;
                        q41.h hVar = this.f402412i;
                        Object objPoll = hVar != null ? hVar.poll() : null;
                        boolean z13 = objPoll == null;
                        if (z12 && z13 && i15 == 2) {
                            this.f402412i = null;
                            interfaceC41782o.e();
                            return;
                        } else {
                            if (z13) {
                                break;
                            }
                            interfaceC41782o.onNext(objPoll);
                            j12++;
                            i12++;
                            if (i12 == i13) {
                                this.f402406c.get().request(i13);
                                i12 = 0;
                            }
                            i14 = 1;
                        }
                    }
                }
                if (j12 == j13) {
                    if (this.f402414k) {
                        this.f402413j = null;
                        this.f402412i = null;
                        return;
                    }
                    if (this.f402408e.get() != null) {
                        this.f402413j = null;
                        this.f402412i = null;
                        this.f402408e.g(this.f402405b);
                        return;
                    }
                    boolean z14 = this.f402415l;
                    q41.h hVar2 = this.f402412i;
                    boolean z15 = hVar2 == null || hVar2.isEmpty();
                    if (z14 && z15 && this.f402416m == 2) {
                        this.f402412i = null;
                        interfaceC41782o.e();
                        return;
                    }
                }
                this.f402417n = j12;
                this.f402418o = i12;
                iAddAndGet = addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                } else {
                    i14 = 1;
                }
            }
        }

        @Override // org.reactivestreams.e
        public final void cancel() {
            this.f402414k = true;
            SubscriptionHelper.a(this.f402406c);
            DisposableHelper.a(this.f402407d);
            this.f402408e.c();
            if (getAndIncrement() == 0) {
                this.f402412i = null;
                this.f402413j = null;
            }
        }

        @Override // org.reactivestreams.d
        public final void e() {
            this.f402415l = true;
            if (getAndIncrement() == 0) {
                a();
            }
        }

        @Override // org.reactivestreams.d
        public final void onError(Throwable th2) {
            if (this.f402408e.b(th2)) {
                DisposableHelper.a(this.f402407d);
                if (getAndIncrement() == 0) {
                    a();
                }
            }
        }

        @Override // org.reactivestreams.d
        public final void onNext(T t12) {
            if (compareAndSet(0, 1)) {
                long j12 = this.f402417n;
                if (this.f402409f.get() != j12) {
                    q41.h hVar = this.f402412i;
                    if (hVar == null || hVar.isEmpty()) {
                        this.f402417n = j12 + 1;
                        this.f402405b.onNext(t12);
                        int i12 = this.f402418o + 1;
                        if (i12 == this.f402411h) {
                            this.f402418o = 0;
                            this.f402406c.get().request(i12);
                        } else {
                            this.f402418o = i12;
                        }
                    } else {
                        hVar.offer(t12);
                    }
                } else {
                    q41.h hVar2 = this.f402412i;
                    if (hVar2 == null) {
                        hVar2 = new q41.h(AbstractC41777j.f401972b);
                        this.f402412i = hVar2;
                    }
                    hVar2.offer(t12);
                }
                if (decrementAndGet() == 0) {
                    return;
                }
            } else {
                q41.h hVar3 = this.f402412i;
                if (hVar3 == null) {
                    hVar3 = new q41.h(AbstractC41777j.f401972b);
                    this.f402412i = hVar3;
                }
                hVar3.offer(t12);
                if (getAndIncrement() != 0) {
                    return;
                }
            }
            a();
        }

        @Override // org.reactivestreams.e
        public final void request(long j12) {
            io.reactivex.rxjava3.internal.util.c.a(this.f402409f, j12);
            if (getAndIncrement() == 0) {
                a();
            }
        }
    }

    @Override // io.reactivex.rxjava3.core.AbstractC41777j
    public final void u(org.reactivestreams.d<? super T> dVar) {
        a aVar = new a((InterfaceC41782o) dVar);
        dVar.K(aVar);
        this.f402624c.q(aVar);
        throw null;
    }
}
