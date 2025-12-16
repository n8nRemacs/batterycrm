package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.AbstractC41777j;
import io.reactivex.rxjava3.core.InterfaceC41782o;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: FlowableMergeWithSingle.java */
/* loaded from: classes8.dex */
public final class M0<T> extends AbstractC41833b<T, T> {

    /* compiled from: FlowableMergeWithSingle.java */
    public static final class a<T> extends AtomicInteger implements InterfaceC41782o<T>, org.reactivestreams.e {
        private static final long serialVersionUID = -4592979584110982903L;

        /* renamed from: b, reason: collision with root package name */
        public final InterfaceC41782o f402429b;

        /* renamed from: c, reason: collision with root package name */
        public final AtomicReference<org.reactivestreams.e> f402430c = new AtomicReference<>();

        /* renamed from: d, reason: collision with root package name */
        public final C11456a<T> f402431d = new C11456a<>(this);

        /* renamed from: e, reason: collision with root package name */
        public final io.reactivex.rxjava3.internal.util.b f402432e = new io.reactivex.rxjava3.internal.util.b();

        /* renamed from: f, reason: collision with root package name */
        public final AtomicLong f402433f = new AtomicLong();

        /* renamed from: g, reason: collision with root package name */
        public final int f402434g;

        /* renamed from: h, reason: collision with root package name */
        public final int f402435h;

        /* renamed from: i, reason: collision with root package name */
        public volatile q41.h f402436i;

        /* renamed from: j, reason: collision with root package name */
        public T f402437j;

        /* renamed from: k, reason: collision with root package name */
        public volatile boolean f402438k;

        /* renamed from: l, reason: collision with root package name */
        public volatile boolean f402439l;

        /* renamed from: m, reason: collision with root package name */
        public volatile int f402440m;

        /* renamed from: n, reason: collision with root package name */
        public long f402441n;

        /* renamed from: o, reason: collision with root package name */
        public int f402442o;

        /* compiled from: FlowableMergeWithSingle.java */
        /* renamed from: io.reactivex.rxjava3.internal.operators.flowable.M0$a$a, reason: collision with other inner class name */
        public static final class C11456a<T> extends AtomicReference<io.reactivex.rxjava3.disposables.d> implements io.reactivex.rxjava3.core.L<T> {
            private static final long serialVersionUID = -2935427570954647017L;

            /* renamed from: b, reason: collision with root package name */
            public final a<T> f402443b;

            public C11456a(a<T> aVar) {
                this.f402443b = aVar;
            }

            @Override // io.reactivex.rxjava3.core.L
            public final void b(io.reactivex.rxjava3.disposables.d dVar) {
                DisposableHelper.e(this, dVar);
            }

            @Override // io.reactivex.rxjava3.core.L
            public final void onError(Throwable th2) {
                a<T> aVar = this.f402443b;
                if (aVar.f402432e.b(th2)) {
                    SubscriptionHelper.a(aVar.f402430c);
                    if (aVar.getAndIncrement() == 0) {
                        aVar.a();
                    }
                }
            }

            @Override // io.reactivex.rxjava3.core.L
            public final void onSuccess(T t12) {
                a<T> aVar = this.f402443b;
                if (aVar.compareAndSet(0, 1)) {
                    long j12 = aVar.f402441n;
                    if (aVar.f402433f.get() != j12) {
                        aVar.f402441n = j12 + 1;
                        aVar.f402429b.onNext(t12);
                        aVar.f402440m = 2;
                    } else {
                        aVar.f402437j = t12;
                        aVar.f402440m = 1;
                        if (aVar.decrementAndGet() == 0) {
                            return;
                        }
                    }
                } else {
                    aVar.f402437j = t12;
                    aVar.f402440m = 1;
                    if (aVar.getAndIncrement() != 0) {
                        return;
                    }
                }
                aVar.a();
            }
        }

        public a(InterfaceC41782o interfaceC41782o) {
            this.f402429b = interfaceC41782o;
            int i12 = AbstractC41777j.f401972b;
            this.f402434g = i12;
            this.f402435h = i12 - (i12 >> 2);
        }

        @Override // org.reactivestreams.d
        public final void K(org.reactivestreams.e eVar) {
            SubscriptionHelper.e(this.f402430c, eVar, this.f402434g);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final void a() {
            InterfaceC41782o interfaceC41782o = this.f402429b;
            long j12 = this.f402441n;
            int i12 = this.f402442o;
            int i13 = this.f402435h;
            int i14 = 1;
            int iAddAndGet = 1;
            while (true) {
                long j13 = this.f402433f.get();
                while (j12 != j13) {
                    if (this.f402438k) {
                        this.f402437j = null;
                        this.f402436i = null;
                        return;
                    }
                    if (this.f402432e.get() != null) {
                        this.f402437j = null;
                        this.f402436i = null;
                        this.f402432e.g(this.f402429b);
                        return;
                    }
                    int i15 = this.f402440m;
                    if (i15 == i14) {
                        T t12 = this.f402437j;
                        this.f402437j = null;
                        this.f402440m = 2;
                        interfaceC41782o.onNext(t12);
                        j12++;
                    } else {
                        boolean z12 = this.f402439l;
                        q41.h hVar = this.f402436i;
                        Object objPoll = hVar != null ? hVar.poll() : null;
                        boolean z13 = objPoll == null;
                        if (z12 && z13 && i15 == 2) {
                            this.f402436i = null;
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
                                this.f402430c.get().request(i13);
                                i12 = 0;
                            }
                            i14 = 1;
                        }
                    }
                }
                if (j12 == j13) {
                    if (this.f402438k) {
                        this.f402437j = null;
                        this.f402436i = null;
                        return;
                    }
                    if (this.f402432e.get() != null) {
                        this.f402437j = null;
                        this.f402436i = null;
                        this.f402432e.g(this.f402429b);
                        return;
                    }
                    boolean z14 = this.f402439l;
                    q41.h hVar2 = this.f402436i;
                    boolean z15 = hVar2 == null || hVar2.isEmpty();
                    if (z14 && z15 && this.f402440m == 2) {
                        this.f402436i = null;
                        interfaceC41782o.e();
                        return;
                    }
                }
                this.f402441n = j12;
                this.f402442o = i12;
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
            this.f402438k = true;
            SubscriptionHelper.a(this.f402430c);
            DisposableHelper.a(this.f402431d);
            this.f402432e.c();
            if (getAndIncrement() == 0) {
                this.f402436i = null;
                this.f402437j = null;
            }
        }

        @Override // org.reactivestreams.d
        public final void e() {
            this.f402439l = true;
            if (getAndIncrement() == 0) {
                a();
            }
        }

        @Override // org.reactivestreams.d
        public final void onError(Throwable th2) {
            if (this.f402432e.b(th2)) {
                DisposableHelper.a(this.f402431d);
                if (getAndIncrement() == 0) {
                    a();
                }
            }
        }

        @Override // org.reactivestreams.d
        public final void onNext(T t12) {
            if (compareAndSet(0, 1)) {
                long j12 = this.f402441n;
                if (this.f402433f.get() != j12) {
                    q41.h hVar = this.f402436i;
                    if (hVar == null || hVar.isEmpty()) {
                        this.f402441n = j12 + 1;
                        this.f402429b.onNext(t12);
                        int i12 = this.f402442o + 1;
                        if (i12 == this.f402435h) {
                            this.f402442o = 0;
                            this.f402430c.get().request(i12);
                        } else {
                            this.f402442o = i12;
                        }
                    } else {
                        hVar.offer(t12);
                    }
                } else {
                    q41.h hVar2 = this.f402436i;
                    if (hVar2 == null) {
                        hVar2 = new q41.h(AbstractC41777j.f401972b);
                        this.f402436i = hVar2;
                    }
                    hVar2.offer(t12);
                }
                if (decrementAndGet() == 0) {
                    return;
                }
            } else {
                q41.h hVar3 = this.f402436i;
                if (hVar3 == null) {
                    hVar3 = new q41.h(AbstractC41777j.f401972b);
                    this.f402436i = hVar3;
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
            io.reactivex.rxjava3.internal.util.c.a(this.f402433f, j12);
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
