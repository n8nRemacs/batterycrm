package hu.akarnokd.rxjava3.operators;

import io.reactivex.rxjava3.core.AbstractC41777j;
import io.reactivex.rxjava3.core.InterfaceC41782o;
import io.reactivex.rxjava3.core.InterfaceC41783p;
import io.reactivex.rxjava3.internal.fuseable.SimplePlainQueue;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import s41.C47998a;

/* compiled from: FlowableSwitchFlatMap.java */
/* loaded from: classes8.dex */
final class J<T, R> extends AbstractC41777j<R> implements InterfaceC41783p<T, R> {

    /* compiled from: FlowableSwitchFlatMap.java */
    public static final class a<T, R> extends AtomicInteger implements org.reactivestreams.d<T>, org.reactivestreams.e {
        private static final long serialVersionUID = 6801374887555723721L;

        /* renamed from: b, reason: collision with root package name */
        public final InterfaceC41782o f397945b;

        /* renamed from: f, reason: collision with root package name */
        public org.reactivestreams.e f397949f;

        /* renamed from: g, reason: collision with root package name */
        public volatile boolean f397950g;

        /* renamed from: h, reason: collision with root package name */
        public volatile boolean f397951h;

        /* renamed from: i, reason: collision with root package name */
        public volatile long f397952i;

        /* renamed from: k, reason: collision with root package name */
        public long f397954k;

        /* renamed from: c, reason: collision with root package name */
        public final ArrayDeque<C11322a<T, R>> f397946c = new ArrayDeque<>();

        /* renamed from: d, reason: collision with root package name */
        public final AtomicLong f397947d = new AtomicLong();

        /* renamed from: e, reason: collision with root package name */
        public final io.reactivex.rxjava3.internal.util.b f397948e = new io.reactivex.rxjava3.internal.util.b();

        /* renamed from: j, reason: collision with root package name */
        public final C11322a<T, R>[] f397953j = new C11322a[0];

        /* compiled from: FlowableSwitchFlatMap.java */
        /* renamed from: hu.akarnokd.rxjava3.operators.J$a$a, reason: collision with other inner class name */
        public static final class C11322a<T, R> extends AtomicReference<org.reactivestreams.e> implements org.reactivestreams.d<R> {
            private static final long serialVersionUID = 4011255448052082638L;

            /* renamed from: b, reason: collision with root package name */
            public long f397955b;

            /* renamed from: c, reason: collision with root package name */
            public volatile boolean f397956c;

            @Override // org.reactivestreams.d
            public final void K(org.reactivestreams.e eVar) {
                if (SubscriptionHelper.f(this, eVar)) {
                    eVar.request(0);
                }
            }

            public final void a(long j12) {
                long j13 = this.f397955b + j12;
                if (j13 < 0) {
                    this.f397955b = j13;
                } else {
                    this.f397955b = 0L;
                    get().request(j13);
                }
            }

            @Override // org.reactivestreams.d
            public final void e() {
                this.f397956c = true;
                throw null;
            }

            @Override // org.reactivestreams.d
            public final void onError(Throwable th2) {
                throw null;
            }

            @Override // org.reactivestreams.d
            public final void onNext(R r12) {
                SimplePlainQueue simplePlainQueue = null;
                simplePlainQueue.offer(r12);
                throw null;
            }
        }

        public a(InterfaceC41782o interfaceC41782o) {
            this.f397945b = interfaceC41782o;
        }

        @Override // org.reactivestreams.d
        public final void K(org.reactivestreams.e eVar) {
            if (SubscriptionHelper.i(this.f397949f, eVar)) {
                this.f397949f = eVar;
                this.f397945b.K(this);
                eVar.request(Long.MAX_VALUE);
            }
        }

        public final void a() {
            ArrayList arrayList = new ArrayList();
            synchronized (this) {
                arrayList.addAll(this.f397946c);
                this.f397946c.clear();
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                C11322a c11322a = (C11322a) it.next();
                c11322a.getClass();
                SubscriptionHelper.a(c11322a);
            }
        }

        public final void b() {
            Arrays.fill(this.f397953j, (Object) null);
        }

        public final void c() {
            if (getAndIncrement() == 0) {
                InterfaceC41782o interfaceC41782o = this.f397945b;
                C11322a<T, R>[] c11322aArr = this.f397953j;
                io.reactivex.rxjava3.internal.util.b bVar = this.f397948e;
                int iAddAndGet = 1;
                while (true) {
                    long j12 = this.f397947d.get();
                    while (!this.f397951h) {
                        boolean z12 = this.f397950g;
                        C11322a<T, R>[] c11322aArr2 = this.f397953j;
                        if (this.f397954k != this.f397952i) {
                            synchronized (this) {
                                try {
                                    Iterator<C11322a<T, R>> it = this.f397946c.iterator();
                                    int i12 = 0;
                                    while (it.hasNext()) {
                                        c11322aArr2[i12] = it.next();
                                        i12++;
                                    }
                                    while (i12 < c11322aArr2.length) {
                                        c11322aArr2[i12] = null;
                                        i12++;
                                    }
                                    this.f397954k = this.f397952i;
                                } finally {
                                }
                            }
                        }
                        long j13 = this.f397954k;
                        if (z12) {
                            if (bVar.get() != null) {
                                b();
                                interfaceC41782o.onError(bVar.a());
                                return;
                            } else if (c11322aArr[0] == null) {
                                interfaceC41782o.e();
                                return;
                            }
                        }
                        int i13 = 0;
                        for (C11322a<T, R> c11322a : c11322aArr) {
                            if (this.f397951h) {
                                b();
                                return;
                            }
                            if (c11322a == null) {
                                break;
                            }
                            if (j13 == this.f397952i) {
                                i13++;
                                SimplePlainQueue simplePlainQueue = null;
                                if (0 != j12) {
                                    if (this.f397951h) {
                                        b();
                                        return;
                                    }
                                    if (bVar.get() != null) {
                                        b();
                                        interfaceC41782o.onError(bVar.a());
                                        return;
                                    } else {
                                        if (j13 == this.f397952i) {
                                            simplePlainQueue.poll();
                                            throw null;
                                        }
                                        if (0 != 0) {
                                            io.reactivex.rxjava3.internal.util.c.e(this.f397947d, 0L);
                                        }
                                        if (0 != 0) {
                                            c11322a.a(0L);
                                        }
                                    }
                                } else {
                                    if (c11322a.f397956c) {
                                        simplePlainQueue.isEmpty();
                                        throw null;
                                    }
                                    if (0 != 0) {
                                        c11322a.a(0L);
                                    }
                                }
                            } else if (0 != 0) {
                                io.reactivex.rxjava3.internal.util.c.e(this.f397947d, 0L);
                            }
                        }
                        if (i13 == 0 || 0 == j12) {
                            if (0 != 0) {
                                io.reactivex.rxjava3.internal.util.c.e(this.f397947d, 0L);
                            }
                            iAddAndGet = addAndGet(-iAddAndGet);
                            if (iAddAndGet == 0) {
                                return;
                            }
                        }
                    }
                    b();
                    return;
                }
            }
        }

        @Override // org.reactivestreams.e
        public final void cancel() {
            if (this.f397951h) {
                return;
            }
            this.f397951h = true;
            this.f397949f.cancel();
            a();
            if (getAndIncrement() == 0) {
                b();
            }
        }

        public final void d(C11322a<T, R> c11322a) {
            synchronized (this) {
                this.f397946c.remove(c11322a);
                this.f397952i++;
            }
        }

        @Override // org.reactivestreams.d
        public final void e() {
            this.f397950g = true;
            c();
        }

        @Override // org.reactivestreams.d
        public final void onError(Throwable th2) {
            if (!this.f397948e.compareAndSet(null, th2)) {
                C47998a.b(th2);
                return;
            }
            a();
            this.f397950g = true;
            c();
        }

        @Override // org.reactivestreams.d
        public final void onNext(T t12) {
            try {
                throw null;
            } catch (Throwable th2) {
                io.reactivex.rxjava3.exceptions.a.a(th2);
                this.f397949f.cancel();
                onError(th2);
            }
        }

        @Override // org.reactivestreams.e
        public final void request(long j12) {
            if (SubscriptionHelper.h(j12)) {
                io.reactivex.rxjava3.internal.util.c.a(this.f397947d, j12);
                c();
            }
        }
    }

    @Override // io.reactivex.rxjava3.core.AbstractC41777j
    public final void u(org.reactivestreams.d<? super R> dVar) {
        new a((InterfaceC41782o) dVar);
        throw null;
    }
}
