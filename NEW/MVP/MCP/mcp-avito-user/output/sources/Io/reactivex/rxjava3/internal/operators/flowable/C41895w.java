package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.AbstractC41777j;
import io.reactivex.rxjava3.core.InterfaceC41782o;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import io.reactivex.rxjava3.internal.util.ErrorMode;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: FlowableConcatMap.java */
/* renamed from: io.reactivex.rxjava3.internal.operators.flowable.w, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41895w<T, R> extends AbstractC41833b<T, R> {

    /* renamed from: d, reason: collision with root package name */
    public final l41.o<? super T, ? extends org.reactivestreams.c<? extends R>> f403064d;

    /* renamed from: e, reason: collision with root package name */
    public final int f403065e;

    /* renamed from: f, reason: collision with root package name */
    public final ErrorMode f403066f;

    /* compiled from: FlowableConcatMap.java */
    /* renamed from: io.reactivex.rxjava3.internal.operators.flowable.w$a */
    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f403067a;

        static {
            int[] iArr = new int[ErrorMode.values().length];
            f403067a = iArr;
            try {
                iArr[1] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f403067a[2] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* compiled from: FlowableConcatMap.java */
    /* renamed from: io.reactivex.rxjava3.internal.operators.flowable.w$b */
    public static abstract class b<T, R> extends AtomicInteger implements InterfaceC41782o<T>, f<R>, org.reactivestreams.e {
        private static final long serialVersionUID = -3511336836796789179L;

        /* renamed from: c, reason: collision with root package name */
        public final l41.o<? super T, ? extends org.reactivestreams.c<? extends R>> f403069c;

        /* renamed from: d, reason: collision with root package name */
        public final int f403070d;

        /* renamed from: e, reason: collision with root package name */
        public final int f403071e;

        /* renamed from: f, reason: collision with root package name */
        public org.reactivestreams.e f403072f;

        /* renamed from: g, reason: collision with root package name */
        public int f403073g;

        /* renamed from: h, reason: collision with root package name */
        public q41.g<T> f403074h;

        /* renamed from: i, reason: collision with root package name */
        public volatile boolean f403075i;

        /* renamed from: j, reason: collision with root package name */
        public volatile boolean f403076j;

        /* renamed from: l, reason: collision with root package name */
        public volatile boolean f403078l;

        /* renamed from: m, reason: collision with root package name */
        public int f403079m;

        /* renamed from: b, reason: collision with root package name */
        public final e<R> f403068b = new e<>(this);

        /* renamed from: k, reason: collision with root package name */
        public final io.reactivex.rxjava3.internal.util.b f403077k = new io.reactivex.rxjava3.internal.util.b();

        public b(l41.o<? super T, ? extends org.reactivestreams.c<? extends R>> oVar, int i12) {
            this.f403069c = oVar;
            this.f403070d = i12;
            this.f403071e = i12;
        }

        @Override // org.reactivestreams.d
        public final void K(org.reactivestreams.e eVar) {
            if (SubscriptionHelper.i(this.f403072f, eVar)) {
                this.f403072f = eVar;
                if (eVar instanceof q41.d) {
                    q41.d dVar = (q41.d) eVar;
                    int iV2 = dVar.v(7);
                    if (iV2 == 1) {
                        this.f403079m = iV2;
                        this.f403074h = dVar;
                        this.f403075i = true;
                        f();
                        d();
                        return;
                    }
                    if (iV2 == 2) {
                        this.f403079m = iV2;
                        this.f403074h = dVar;
                        f();
                        eVar.request(this.f403070d);
                        return;
                    }
                }
                this.f403074h = new q41.h(this.f403070d);
                f();
                eVar.request(this.f403070d);
            }
        }

        @Override // io.reactivex.rxjava3.internal.operators.flowable.C41895w.f
        public final void b() {
            this.f403078l = false;
            d();
        }

        public abstract void d();

        @Override // org.reactivestreams.d
        public final void e() {
            this.f403075i = true;
            d();
        }

        public abstract void f();

        @Override // org.reactivestreams.d
        public final void onNext(T t12) {
            if (this.f403079m == 2 || this.f403074h.offer(t12)) {
                d();
            } else {
                this.f403072f.cancel();
                onError(new IllegalStateException("Queue full?!"));
            }
        }
    }

    /* compiled from: FlowableConcatMap.java */
    /* renamed from: io.reactivex.rxjava3.internal.operators.flowable.w$c */
    public static final class c<T, R> extends b<T, R> {
        private static final long serialVersionUID = -2945777694260521066L;

        /* renamed from: n, reason: collision with root package name */
        public final org.reactivestreams.d<? super R> f403080n;

        /* renamed from: o, reason: collision with root package name */
        public final boolean f403081o;

        public c(org.reactivestreams.d<? super R> dVar, l41.o<? super T, ? extends org.reactivestreams.c<? extends R>> oVar, int i12, boolean z12) {
            super(oVar, i12);
            this.f403080n = dVar;
            this.f403081o = z12;
        }

        @Override // io.reactivex.rxjava3.internal.operators.flowable.C41895w.f
        public final void a(Throwable th2) {
            if (this.f403077k.b(th2)) {
                if (!this.f403081o) {
                    this.f403072f.cancel();
                    this.f403075i = true;
                }
                this.f403078l = false;
                d();
            }
        }

        @Override // io.reactivex.rxjava3.internal.operators.flowable.C41895w.f
        public final void c(R r12) {
            this.f403080n.onNext(r12);
        }

        @Override // org.reactivestreams.e
        public final void cancel() {
            if (this.f403076j) {
                return;
            }
            this.f403076j = true;
            this.f403068b.cancel();
            this.f403072f.cancel();
            this.f403077k.c();
        }

        @Override // io.reactivex.rxjava3.internal.operators.flowable.C41895w.b
        public final void d() {
            Object obj;
            if (getAndIncrement() == 0) {
                while (!this.f403076j) {
                    if (!this.f403078l) {
                        boolean z12 = this.f403075i;
                        if (z12 && !this.f403081o && this.f403077k.get() != null) {
                            this.f403077k.g(this.f403080n);
                            return;
                        }
                        try {
                            T tPoll = this.f403074h.poll();
                            boolean z13 = tPoll == null;
                            if (z12 && z13) {
                                this.f403077k.g(this.f403080n);
                                return;
                            }
                            if (!z13) {
                                try {
                                    org.reactivestreams.c<? extends R> cVarApply = this.f403069c.apply(tPoll);
                                    Objects.requireNonNull(cVarApply, "The mapper returned a null Publisher");
                                    org.reactivestreams.c<? extends R> cVar = cVarApply;
                                    if (this.f403079m != 1) {
                                        int i12 = this.f403073g + 1;
                                        if (i12 == this.f403071e) {
                                            this.f403073g = 0;
                                            this.f403072f.request(i12);
                                        } else {
                                            this.f403073g = i12;
                                        }
                                    }
                                    if (cVar instanceof l41.s) {
                                        try {
                                            obj = ((l41.s) cVar).get();
                                        } catch (Throwable th2) {
                                            io.reactivex.rxjava3.exceptions.a.a(th2);
                                            this.f403077k.b(th2);
                                            if (!this.f403081o) {
                                                this.f403072f.cancel();
                                                this.f403077k.g(this.f403080n);
                                                return;
                                            }
                                            obj = null;
                                        }
                                        if (obj == null) {
                                            continue;
                                        } else if (this.f403068b.f419387i) {
                                            this.f403080n.onNext(obj);
                                        } else {
                                            this.f403078l = true;
                                            this.f403068b.g(new g(obj, this.f403068b));
                                        }
                                    } else {
                                        this.f403078l = true;
                                        cVar.d(this.f403068b);
                                    }
                                } catch (Throwable th3) {
                                    io.reactivex.rxjava3.exceptions.a.a(th3);
                                    this.f403072f.cancel();
                                    this.f403077k.b(th3);
                                    this.f403077k.g(this.f403080n);
                                    return;
                                }
                            }
                        } catch (Throwable th4) {
                            io.reactivex.rxjava3.exceptions.a.a(th4);
                            this.f403072f.cancel();
                            this.f403077k.b(th4);
                            this.f403077k.g(this.f403080n);
                            return;
                        }
                    }
                    if (decrementAndGet() == 0) {
                        return;
                    }
                }
            }
        }

        @Override // io.reactivex.rxjava3.internal.operators.flowable.C41895w.b
        public final void f() {
            this.f403080n.K(this);
        }

        @Override // org.reactivestreams.d
        public final void onError(Throwable th2) {
            if (this.f403077k.b(th2)) {
                this.f403075i = true;
                d();
            }
        }

        @Override // org.reactivestreams.e
        public final void request(long j12) {
            this.f403068b.request(j12);
        }
    }

    /* compiled from: FlowableConcatMap.java */
    /* renamed from: io.reactivex.rxjava3.internal.operators.flowable.w$d */
    public static final class d<T, R> extends b<T, R> {
        private static final long serialVersionUID = 7898995095634264146L;

        /* renamed from: n, reason: collision with root package name */
        public final org.reactivestreams.d<? super R> f403082n;

        /* renamed from: o, reason: collision with root package name */
        public final AtomicInteger f403083o;

        public d(org.reactivestreams.d<? super R> dVar, l41.o<? super T, ? extends org.reactivestreams.c<? extends R>> oVar, int i12) {
            super(oVar, i12);
            this.f403082n = dVar;
            this.f403083o = new AtomicInteger();
        }

        @Override // io.reactivex.rxjava3.internal.operators.flowable.C41895w.f
        public final void a(Throwable th2) {
            this.f403072f.cancel();
            io.reactivex.rxjava3.internal.util.i.d(this.f403082n, th2, this, this.f403077k);
        }

        @Override // io.reactivex.rxjava3.internal.operators.flowable.C41895w.f
        public final void c(R r12) {
            io.reactivex.rxjava3.internal.util.i.f(this.f403082n, r12, this, this.f403077k);
        }

        @Override // org.reactivestreams.e
        public final void cancel() {
            if (this.f403076j) {
                return;
            }
            this.f403076j = true;
            this.f403068b.cancel();
            this.f403072f.cancel();
            this.f403077k.c();
        }

        @Override // io.reactivex.rxjava3.internal.operators.flowable.C41895w.b
        public final void d() {
            if (this.f403083o.getAndIncrement() == 0) {
                while (!this.f403076j) {
                    if (!this.f403078l) {
                        boolean z12 = this.f403075i;
                        try {
                            T tPoll = this.f403074h.poll();
                            boolean z13 = tPoll == null;
                            if (z12 && z13) {
                                this.f403082n.e();
                                return;
                            }
                            if (!z13) {
                                try {
                                    org.reactivestreams.c<? extends R> cVarApply = this.f403069c.apply(tPoll);
                                    Objects.requireNonNull(cVarApply, "The mapper returned a null Publisher");
                                    org.reactivestreams.c<? extends R> cVar = cVarApply;
                                    if (this.f403079m != 1) {
                                        int i12 = this.f403073g + 1;
                                        if (i12 == this.f403071e) {
                                            this.f403073g = 0;
                                            this.f403072f.request(i12);
                                        } else {
                                            this.f403073g = i12;
                                        }
                                    }
                                    if (cVar instanceof l41.s) {
                                        try {
                                            Object obj = ((l41.s) cVar).get();
                                            if (obj == null) {
                                                continue;
                                            } else if (!this.f403068b.f419387i) {
                                                this.f403078l = true;
                                                this.f403068b.g(new g(obj, this.f403068b));
                                            } else if (!io.reactivex.rxjava3.internal.util.i.f(this.f403082n, obj, this, this.f403077k)) {
                                                return;
                                            }
                                        } catch (Throwable th2) {
                                            io.reactivex.rxjava3.exceptions.a.a(th2);
                                            this.f403072f.cancel();
                                            this.f403077k.b(th2);
                                            this.f403077k.g(this.f403082n);
                                            return;
                                        }
                                    } else {
                                        this.f403078l = true;
                                        cVar.d(this.f403068b);
                                    }
                                } catch (Throwable th3) {
                                    io.reactivex.rxjava3.exceptions.a.a(th3);
                                    this.f403072f.cancel();
                                    this.f403077k.b(th3);
                                    this.f403077k.g(this.f403082n);
                                    return;
                                }
                            }
                        } catch (Throwable th4) {
                            io.reactivex.rxjava3.exceptions.a.a(th4);
                            this.f403072f.cancel();
                            this.f403077k.b(th4);
                            this.f403077k.g(this.f403082n);
                            return;
                        }
                    }
                    if (this.f403083o.decrementAndGet() == 0) {
                        return;
                    }
                }
            }
        }

        @Override // io.reactivex.rxjava3.internal.operators.flowable.C41895w.b
        public final void f() {
            this.f403082n.K(this);
        }

        @Override // org.reactivestreams.d
        public final void onError(Throwable th2) {
            this.f403068b.cancel();
            io.reactivex.rxjava3.internal.util.i.d(this.f403082n, th2, this, this.f403077k);
        }

        @Override // org.reactivestreams.e
        public final void request(long j12) {
            this.f403068b.request(j12);
        }
    }

    /* compiled from: FlowableConcatMap.java */
    /* renamed from: io.reactivex.rxjava3.internal.operators.flowable.w$e */
    public static final class e<R> extends o41.h implements InterfaceC41782o<R> {
        private static final long serialVersionUID = 897683679971470653L;

        /* renamed from: j, reason: collision with root package name */
        public final AtomicInteger f403084j;

        /* renamed from: k, reason: collision with root package name */
        public long f403085k;

        /* JADX WARN: Multi-variable type inference failed */
        public e(f<R> fVar) {
            super(false);
            this.f403084j = (AtomicInteger) fVar;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [io.reactivex.rxjava3.internal.operators.flowable.w$f, java.util.concurrent.atomic.AtomicInteger] */
        @Override // org.reactivestreams.d
        public final void e() {
            long j12 = this.f403085k;
            if (j12 != 0) {
                this.f403085k = 0L;
                f(j12);
            }
            this.f403084j.b();
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [io.reactivex.rxjava3.internal.operators.flowable.w$f, java.util.concurrent.atomic.AtomicInteger] */
        @Override // org.reactivestreams.d
        public final void onError(Throwable th2) {
            long j12 = this.f403085k;
            if (j12 != 0) {
                this.f403085k = 0L;
                f(j12);
            }
            this.f403084j.a(th2);
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [io.reactivex.rxjava3.internal.operators.flowable.w$f, java.util.concurrent.atomic.AtomicInteger] */
        @Override // org.reactivestreams.d
        public final void onNext(R r12) {
            this.f403085k++;
            this.f403084j.c(r12);
        }
    }

    /* compiled from: FlowableConcatMap.java */
    /* renamed from: io.reactivex.rxjava3.internal.operators.flowable.w$f */
    public interface f<T> {
        void a(Throwable th2);

        void b();

        void c(T t12);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C41895w(AbstractC41777j abstractC41777j, l41.o oVar) {
        super(abstractC41777j);
        ErrorMode errorMode = ErrorMode.f404819b;
        this.f403064d = oVar;
        this.f403065e = 2;
        this.f403066f = errorMode;
    }

    @Override // io.reactivex.rxjava3.core.AbstractC41777j
    public final void u(org.reactivestreams.d<? super R> dVar) {
        l41.o<? super T, ? extends org.reactivestreams.c<? extends R>> oVar = this.f403064d;
        AbstractC41777j<T> abstractC41777j = this.f402624c;
        if (C41882r1.b(abstractC41777j, (InterfaceC41782o) dVar, oVar)) {
            return;
        }
        int i12 = this.f403065e;
        int iOrdinal = this.f403066f.ordinal();
        abstractC41777j.d(iOrdinal != 1 ? iOrdinal != 2 ? new d<>(dVar, oVar, i12) : new c<>(dVar, oVar, i12, true) : new c<>(dVar, oVar, i12, false));
    }

    /* compiled from: FlowableConcatMap.java */
    /* renamed from: io.reactivex.rxjava3.internal.operators.flowable.w$g */
    public static final class g<T> extends AtomicBoolean implements org.reactivestreams.e {
        private static final long serialVersionUID = -7606889335172043256L;

        /* renamed from: b, reason: collision with root package name */
        public final org.reactivestreams.d<? super T> f403086b;

        /* renamed from: c, reason: collision with root package name */
        public final T f403087c;

        public g(T t12, org.reactivestreams.d<? super T> dVar) {
            this.f403087c = t12;
            this.f403086b = dVar;
        }

        @Override // org.reactivestreams.e
        public final void request(long j12) {
            if (j12 <= 0 || !compareAndSet(false, true)) {
                return;
            }
            org.reactivestreams.d<? super T> dVar = this.f403086b;
            dVar.onNext(this.f403087c);
            dVar.e();
        }

        @Override // org.reactivestreams.e
        public final void cancel() {
        }
    }
}
