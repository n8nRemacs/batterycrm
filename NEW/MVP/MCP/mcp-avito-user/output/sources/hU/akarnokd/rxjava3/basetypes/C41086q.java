package hu.akarnokd.rxjava3.basetypes;

import io.reactivex.rxjava3.exceptions.MissingBackpressureException;
import io.reactivex.rxjava3.internal.fuseable.QueueSubscription;
import io.reactivex.rxjava3.internal.fuseable.SimpleQueue;
import io.reactivex.rxjava3.internal.queue.SpscArrayQueue;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.atomic.AtomicReference;
import o41.AbstractC44583c;

/* compiled from: NonoConcat.java */
/* renamed from: hu.akarnokd.rxjava3.basetypes.q, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C41086q extends AbstractC41062i {

    /* compiled from: NonoConcat.java */
    /* renamed from: hu.akarnokd.rxjava3.basetypes.q$b */
    public static final class b extends a {
        private static final long serialVersionUID = -3402839602492103389L;

        @Override // hu.akarnokd.rxjava3.basetypes.C41086q.a
        public final void a(Throwable th2) {
            if (this.f397747d.b(th2)) {
                this.f397749f.cancel();
                this.f397753j = false;
                c();
            }
        }

        @Override // hu.akarnokd.rxjava3.basetypes.C41086q.a
        public final void c() {
            if (getAndIncrement() != 0) {
                return;
            }
            while (!this.f397755l) {
                if (!this.f397753j) {
                    if (this.f397747d.get() != null) {
                        this.f397750g.clear();
                        this.f397747d.g(this.f397745b);
                        return;
                    }
                    boolean z12 = this.f397754k;
                    try {
                        AbstractC41062i abstractC41062i = (AbstractC41062i) this.f397750g.poll();
                        boolean z13 = abstractC41062i == null;
                        if (z12 && z13) {
                            this.f397747d.g(this.f397745b);
                            return;
                        } else if (!z13) {
                            m();
                            this.f397753j = true;
                            abstractC41062i.d(this.f397748e);
                        }
                    } catch (Throwable th2) {
                        io.reactivex.rxjava3.exceptions.a.a(th2);
                        this.f397749f.cancel();
                        this.f397750g.clear();
                        this.f397747d.b(th2);
                        this.f397747d.g(this.f397745b);
                        return;
                    }
                }
                if (decrementAndGet() == 0) {
                    return;
                }
            }
            this.f397750g.clear();
        }

        @Override // org.reactivestreams.e
        public final void cancel() {
            this.f397755l = true;
            this.f397749f.cancel();
            this.f397748e.a();
            this.f397747d.c();
            if (getAndIncrement() == 0) {
                this.f397750g.clear();
            }
        }

        @Override // org.reactivestreams.d
        public final void e() {
            this.f397754k = true;
            c();
        }

        @Override // org.reactivestreams.d
        public final void onError(Throwable th2) {
            if (this.f397747d.b(th2)) {
                this.f397754k = true;
                c();
            }
        }
    }

    /* compiled from: NonoConcat.java */
    /* renamed from: hu.akarnokd.rxjava3.basetypes.q$c */
    public static final class c extends a {
        private static final long serialVersionUID = 6000895759062406410L;

        public c() {
            throw null;
        }

        @Override // hu.akarnokd.rxjava3.basetypes.C41086q.a
        public final void a(Throwable th2) {
            n(true);
            throw null;
        }

        @Override // hu.akarnokd.rxjava3.basetypes.C41086q.a
        public final void c() {
            throw null;
        }

        @Override // org.reactivestreams.e
        public final void cancel() {
            n(false);
            throw null;
        }

        @Override // org.reactivestreams.d
        public final void e() {
            this.f397754k = true;
            throw null;
        }

        public final void n(boolean z12) {
            this.f397755l = true;
            this.f397749f.cancel();
            this.f397748e.a();
            if (!z12) {
                this.f397747d.c();
            }
            throw null;
        }

        @Override // org.reactivestreams.d
        public final void onError(Throwable th2) {
            n(true);
            throw null;
        }
    }

    @Override // hu.akarnokd.rxjava3.basetypes.AbstractC41062i
    public final void a(org.reactivestreams.d<? super Void> dVar) {
        new b(dVar);
        throw null;
    }

    /* compiled from: NonoConcat.java */
    /* renamed from: hu.akarnokd.rxjava3.basetypes.q$a */
    public static abstract class a extends AbstractC44583c<Void> implements org.reactivestreams.d<AbstractC41062i> {
        private static final long serialVersionUID = -2273338080908719181L;

        /* renamed from: b, reason: collision with root package name */
        public final org.reactivestreams.d<? super Void> f397745b;

        /* renamed from: c, reason: collision with root package name */
        public final int f397746c = 0;

        /* renamed from: d, reason: collision with root package name */
        public final io.reactivex.rxjava3.internal.util.b f397747d = new io.reactivex.rxjava3.internal.util.b();

        /* renamed from: e, reason: collision with root package name */
        public final C11310a f397748e = new C11310a();

        /* renamed from: f, reason: collision with root package name */
        public org.reactivestreams.e f397749f;

        /* renamed from: g, reason: collision with root package name */
        public SimpleQueue<AbstractC41062i> f397750g;

        /* renamed from: h, reason: collision with root package name */
        public int f397751h;

        /* renamed from: i, reason: collision with root package name */
        public int f397752i;

        /* renamed from: j, reason: collision with root package name */
        public volatile boolean f397753j;

        /* renamed from: k, reason: collision with root package name */
        public volatile boolean f397754k;

        /* renamed from: l, reason: collision with root package name */
        public volatile boolean f397755l;

        /* compiled from: NonoConcat.java */
        /* renamed from: hu.akarnokd.rxjava3.basetypes.q$a$a, reason: collision with other inner class name */
        public final class C11310a extends AtomicReference<org.reactivestreams.e> implements org.reactivestreams.d<Void> {
            private static final long serialVersionUID = -1235060320533681511L;

            public C11310a() {
            }

            @Override // org.reactivestreams.d
            public final void K(org.reactivestreams.e eVar) {
                SubscriptionHelper.d(this, eVar);
            }

            public final void a() {
                SubscriptionHelper.a(this);
            }

            @Override // org.reactivestreams.d
            public final void e() {
                a.this.f397753j = false;
                a.this.c();
            }

            @Override // org.reactivestreams.d
            public final void onError(Throwable th2) {
                a.this.a(th2);
            }

            @Override // org.reactivestreams.d
            public final /* bridge */ /* synthetic */ void onNext(Void r12) {
            }
        }

        public a(org.reactivestreams.d dVar) {
            this.f397745b = dVar;
        }

        @Override // org.reactivestreams.d
        public final void K(org.reactivestreams.e eVar) {
            if (SubscriptionHelper.i(this.f397749f, eVar)) {
                this.f397749f = eVar;
                if (eVar instanceof QueueSubscription) {
                    QueueSubscription queueSubscription = (QueueSubscription) eVar;
                    int iRequestFusion = queueSubscription.requestFusion(3);
                    if (iRequestFusion == 1) {
                        this.f397751h = iRequestFusion;
                        this.f397750g = queueSubscription;
                        this.f397754k = true;
                        this.f397745b.K(this);
                        c();
                        return;
                    }
                    if (iRequestFusion == 2) {
                        this.f397751h = iRequestFusion;
                        this.f397750g = queueSubscription;
                        this.f397745b.K(this);
                        eVar.request(0);
                        return;
                    }
                }
                this.f397750g = new SpscArrayQueue(0);
                this.f397745b.K(this);
                eVar.request(0);
            }
        }

        public abstract void a(Throwable th2);

        public abstract void c();

        @Override // q41.g
        public final boolean isEmpty() {
            return true;
        }

        @Override // org.reactivestreams.d
        /* renamed from: l, reason: merged with bridge method [inline-methods] */
        public final void onNext(AbstractC41062i abstractC41062i) {
            if (this.f397751h != 0 || this.f397750g.offer(abstractC41062i)) {
                c();
            } else {
                this.f397749f.cancel();
                onError(new MissingBackpressureException());
            }
        }

        public final void m() {
            if (this.f397751h != 1) {
                int i12 = this.f397752i + 1;
                if (i12 != this.f397746c) {
                    this.f397752i = i12;
                } else {
                    this.f397752i = 0;
                    this.f397749f.request(i12);
                }
            }
        }

        @Override // q41.g
        public final /* bridge */ /* synthetic */ Object poll() {
            return null;
        }

        @Override // q41.InterfaceC47200c
        public final int v(int i12) {
            return i12 & 2;
        }

        @Override // q41.g
        public final void clear() {
        }

        @Override // org.reactivestreams.e
        public final void request(long j12) {
        }
    }
}
