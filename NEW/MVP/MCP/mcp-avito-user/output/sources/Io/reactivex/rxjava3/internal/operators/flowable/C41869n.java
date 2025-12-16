package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.InterfaceC41782o;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import java.util.ArrayDeque;
import java.util.Collection;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import s41.C47998a;

/* compiled from: FlowableBuffer.java */
/* renamed from: io.reactivex.rxjava3.internal.operators.flowable.n, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41869n<T, C extends Collection<? super T>> extends AbstractC41833b<T, C> {

    /* compiled from: FlowableBuffer.java */
    /* renamed from: io.reactivex.rxjava3.internal.operators.flowable.n$a */
    public static final class a<T, C extends Collection<? super T>> implements InterfaceC41782o<T>, org.reactivestreams.e {

        /* renamed from: b, reason: collision with root package name */
        public final InterfaceC41782o f402888b;

        /* renamed from: c, reason: collision with root package name */
        public C f402889c;

        /* renamed from: d, reason: collision with root package name */
        public org.reactivestreams.e f402890d;

        /* renamed from: e, reason: collision with root package name */
        public boolean f402891e;

        /* renamed from: f, reason: collision with root package name */
        public int f402892f;

        public a(InterfaceC41782o interfaceC41782o) {
            this.f402888b = interfaceC41782o;
        }

        @Override // org.reactivestreams.d
        public final void K(org.reactivestreams.e eVar) {
            if (SubscriptionHelper.i(this.f402890d, eVar)) {
                this.f402890d = eVar;
                this.f402888b.K(this);
            }
        }

        @Override // org.reactivestreams.e
        public final void cancel() {
            this.f402890d.cancel();
        }

        @Override // org.reactivestreams.d
        public final void e() {
            if (this.f402891e) {
                return;
            }
            this.f402891e = true;
            C c12 = this.f402889c;
            this.f402889c = null;
            InterfaceC41782o interfaceC41782o = this.f402888b;
            if (c12 != null) {
                interfaceC41782o.onNext(c12);
            }
            interfaceC41782o.e();
        }

        @Override // org.reactivestreams.d
        public final void onError(Throwable th2) {
            if (this.f402891e) {
                C47998a.b(th2);
                return;
            }
            this.f402889c = null;
            this.f402891e = true;
            this.f402888b.onError(th2);
        }

        @Override // org.reactivestreams.d
        public final void onNext(T t12) {
            if (this.f402891e) {
                return;
            }
            C c12 = this.f402889c;
            if (c12 == null) {
                try {
                    throw null;
                } catch (Throwable th2) {
                    io.reactivex.rxjava3.exceptions.a.a(th2);
                    cancel();
                    onError(th2);
                    return;
                }
            }
            c12.add(t12);
            int i12 = this.f402892f + 1;
            if (i12 != 0) {
                this.f402892f = i12;
                return;
            }
            this.f402892f = 0;
            this.f402889c = null;
            this.f402888b.onNext(c12);
        }

        @Override // org.reactivestreams.e
        public final void request(long j12) {
            if (SubscriptionHelper.h(j12)) {
                this.f402890d.request(io.reactivex.rxjava3.internal.util.c.d(j12, 0));
            }
        }
    }

    /* compiled from: FlowableBuffer.java */
    /* renamed from: io.reactivex.rxjava3.internal.operators.flowable.n$b */
    public static final class b<T, C extends Collection<? super T>> extends AtomicLong implements InterfaceC41782o<T>, org.reactivestreams.e, l41.e {
        private static final long serialVersionUID = -7370244972039324525L;

        /* renamed from: b, reason: collision with root package name */
        public org.reactivestreams.e f402893b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f402894c;

        /* renamed from: d, reason: collision with root package name */
        public volatile boolean f402895d;

        public b() {
            throw null;
        }

        @Override // org.reactivestreams.d
        public final void K(org.reactivestreams.e eVar) {
            if (SubscriptionHelper.i(this.f402893b, eVar)) {
                this.f402893b = eVar;
                throw null;
            }
        }

        @Override // l41.e
        public final boolean a() {
            return this.f402895d;
        }

        @Override // org.reactivestreams.e
        public final void cancel() {
            this.f402895d = true;
            this.f402893b.cancel();
        }

        @Override // org.reactivestreams.d
        public final void e() {
            if (this.f402894c) {
                return;
            }
            this.f402894c = true;
            if (0 != 0) {
                io.reactivex.rxjava3.internal.util.c.e(this, 0L);
            }
            throw null;
        }

        @Override // org.reactivestreams.d
        public final void onError(Throwable th2) {
            if (this.f402894c) {
                C47998a.b(th2);
            } else {
                this.f402894c = true;
                throw null;
            }
        }

        @Override // org.reactivestreams.d
        public final void onNext(T t12) {
            if (this.f402894c) {
                return;
            }
            try {
                throw null;
            } catch (Throwable th2) {
                io.reactivex.rxjava3.exceptions.a.a(th2);
                cancel();
                onError(th2);
            }
        }

        @Override // org.reactivestreams.e
        public final void request(long j12) {
            long j13;
            if (!SubscriptionHelper.h(j12)) {
                return;
            }
            do {
                j13 = get();
            } while (!compareAndSet(j13, io.reactivex.rxjava3.internal.util.c.c(Long.MAX_VALUE & j13, j12) | (j13 & Long.MIN_VALUE)));
            ArrayDeque arrayDeque = null;
            if (j13 != Long.MIN_VALUE) {
                throw null;
            }
            long j14 = j12 | Long.MIN_VALUE;
            long j15 = j14 & Long.MIN_VALUE;
            while (true) {
                boolean zA2 = true;
                if (j15 != j14) {
                    try {
                        zA2 = a();
                    } catch (Throwable th2) {
                        io.reactivex.rxjava3.exceptions.a.a(th2);
                    }
                    if (zA2) {
                        return;
                    }
                    arrayDeque.poll().getClass();
                    throw null;
                }
                try {
                    zA2 = a();
                } catch (Throwable th3) {
                    io.reactivex.rxjava3.exceptions.a.a(th3);
                }
                if (zA2) {
                    return;
                }
                if (arrayDeque.isEmpty()) {
                    throw null;
                }
                j14 = get();
                if (j14 == j15) {
                    long jAddAndGet = addAndGet(-(j15 & Long.MAX_VALUE));
                    if ((Long.MAX_VALUE & jAddAndGet) == 0) {
                        return;
                    }
                    j14 = jAddAndGet;
                    j15 = jAddAndGet & Long.MIN_VALUE;
                }
            }
        }
    }

    /* compiled from: FlowableBuffer.java */
    /* renamed from: io.reactivex.rxjava3.internal.operators.flowable.n$c */
    public static final class c<T, C extends Collection<? super T>> extends AtomicInteger implements InterfaceC41782o<T>, org.reactivestreams.e {
        private static final long serialVersionUID = -5616169793639412593L;

        /* renamed from: b, reason: collision with root package name */
        public C f402896b;

        /* renamed from: c, reason: collision with root package name */
        public org.reactivestreams.e f402897c;

        /* renamed from: d, reason: collision with root package name */
        public boolean f402898d;

        /* renamed from: e, reason: collision with root package name */
        public int f402899e;

        public c() {
            throw null;
        }

        @Override // org.reactivestreams.d
        public final void K(org.reactivestreams.e eVar) {
            if (SubscriptionHelper.i(this.f402897c, eVar)) {
                this.f402897c = eVar;
                throw null;
            }
        }

        @Override // org.reactivestreams.e
        public final void cancel() {
            this.f402897c.cancel();
        }

        @Override // org.reactivestreams.d
        public final void e() {
            if (this.f402898d) {
                return;
            }
            this.f402898d = true;
            C c12 = this.f402896b;
            this.f402896b = null;
            c12.getClass();
            throw null;
        }

        @Override // org.reactivestreams.d
        public final void onError(Throwable th2) {
            if (this.f402898d) {
                C47998a.b(th2);
            } else {
                this.f402898d = true;
                this.f402896b = null;
                throw null;
            }
        }

        @Override // org.reactivestreams.d
        public final void onNext(T t12) {
            if (this.f402898d) {
                return;
            }
            C c12 = this.f402896b;
            int i12 = this.f402899e;
            int i13 = i12 + 1;
            if (i12 == 0) {
                try {
                    throw null;
                } catch (Throwable th2) {
                    io.reactivex.rxjava3.exceptions.a.a(th2);
                    cancel();
                    onError(th2);
                    return;
                }
            }
            if (c12 != null) {
                c12.add(t12);
                if (c12.size() == 0) {
                    this.f402896b = null;
                    throw null;
                }
            }
            if (i13 == 0) {
                i13 = 0;
            }
            this.f402899e = i13;
        }

        @Override // org.reactivestreams.e
        public final void request(long j12) {
            if (SubscriptionHelper.h(j12)) {
                if (get() != 0 || !compareAndSet(0, 1)) {
                    this.f402897c.request(io.reactivex.rxjava3.internal.util.c.d(0, j12));
                    return;
                }
                this.f402897c.request(io.reactivex.rxjava3.internal.util.c.c(io.reactivex.rxjava3.internal.util.c.d(j12, 0), io.reactivex.rxjava3.internal.util.c.d(0, j12 - 1)));
            }
        }
    }

    @Override // io.reactivex.rxjava3.core.AbstractC41777j
    public final void u(org.reactivestreams.d<? super C> dVar) {
        this.f402624c.q(new a((InterfaceC41782o) dVar));
    }
}
