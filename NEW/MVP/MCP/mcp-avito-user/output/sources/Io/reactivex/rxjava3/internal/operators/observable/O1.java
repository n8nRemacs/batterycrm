package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.core.H;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: ObservableWindowTimed.java */
/* loaded from: classes8.dex */
public final class O1<T> extends AbstractC41932a<T, io.reactivex.rxjava3.core.z<T>> {

    /* compiled from: ObservableWindowTimed.java */
    public static abstract class a<T> extends AtomicInteger implements io.reactivex.rxjava3.core.G<T>, io.reactivex.rxjava3.disposables.d {
        private static final long serialVersionUID = 5724293814035355511L;

        /* renamed from: b, reason: collision with root package name */
        public final io.reactivex.rxjava3.core.G<? super io.reactivex.rxjava3.core.z<T>> f403769b;

        /* renamed from: d, reason: collision with root package name */
        public long f403771d;

        /* renamed from: e, reason: collision with root package name */
        public volatile boolean f403772e;

        /* renamed from: f, reason: collision with root package name */
        public Throwable f403773f;

        /* renamed from: g, reason: collision with root package name */
        public io.reactivex.rxjava3.disposables.d f403774g;

        /* renamed from: i, reason: collision with root package name */
        public volatile boolean f403776i;

        /* renamed from: c, reason: collision with root package name */
        public final io.reactivex.rxjava3.internal.queue.a f403770c = new io.reactivex.rxjava3.internal.queue.a();

        /* renamed from: h, reason: collision with root package name */
        public final AtomicBoolean f403775h = new AtomicBoolean();

        /* renamed from: j, reason: collision with root package name */
        public final AtomicInteger f403777j = new AtomicInteger(1);

        public a(io.reactivex.rxjava3.core.G g12) {
            this.f403769b = g12;
        }

        public abstract void a();

        @Override // io.reactivex.rxjava3.core.G
        public final void b(io.reactivex.rxjava3.disposables.d dVar) {
            if (DisposableHelper.f(this.f403774g, dVar)) {
                this.f403774g = dVar;
                this.f403769b.b(this);
                c();
            }
        }

        public abstract void c();

        public abstract void d();

        @Override // io.reactivex.rxjava3.disposables.d
        public final void dispose() {
            if (this.f403775h.compareAndSet(false, true)) {
                f();
            }
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void e() {
            this.f403772e = true;
            d();
        }

        public final void f() {
            if (this.f403777j.decrementAndGet() == 0) {
                a();
                this.f403774g.dispose();
                this.f403776i = true;
                d();
            }
        }

        @Override // io.reactivex.rxjava3.disposables.d
        /* renamed from: i */
        public final boolean getF318621e() {
            return this.f403775h.get();
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void onError(Throwable th2) {
            this.f403773f = th2;
            this.f403772e = true;
            d();
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void onNext(T t12) {
            this.f403770c.offer(t12);
            d();
        }

        public void run() {
            f();
        }
    }

    /* compiled from: ObservableWindowTimed.java */
    public static final class b<T> extends a<T> implements Runnable {
        private static final long serialVersionUID = -6130475889925953722L;

        /* renamed from: k, reason: collision with root package name */
        public final H.c f403778k;

        /* renamed from: l, reason: collision with root package name */
        public long f403779l;

        /* renamed from: m, reason: collision with root package name */
        public io.reactivex.rxjava3.subjects.j<T> f403780m;

        /* renamed from: n, reason: collision with root package name */
        public final m41.d f403781n;

        /* compiled from: ObservableWindowTimed.java */
        public static final class a implements Runnable {
            @Override // java.lang.Runnable
            public final void run() {
                throw null;
            }
        }

        public b(io.reactivex.rxjava3.core.G g12) {
            super(g12);
            this.f403778k = null;
            this.f403781n = new m41.d();
        }

        @Override // io.reactivex.rxjava3.internal.operators.observable.O1.a
        public final void a() {
            m41.d dVar = this.f403781n;
            dVar.getClass();
            DisposableHelper.a(dVar);
            H.c cVar = this.f403778k;
            if (cVar != null) {
                cVar.dispose();
            }
        }

        @Override // io.reactivex.rxjava3.internal.operators.observable.O1.a
        public final void c() {
            if (this.f403775h.get()) {
                return;
            }
            this.f403771d = 1L;
            this.f403777j.getAndIncrement();
            io.reactivex.rxjava3.subjects.j<T> jVarN0 = io.reactivex.rxjava3.subjects.j.N0(this);
            this.f403780m = jVarN0;
            this.f403769b.onNext(new N1(jVarN0));
            throw null;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // io.reactivex.rxjava3.internal.operators.observable.O1.a
        public final void d() {
            if (getAndIncrement() != 0) {
                return;
            }
            io.reactivex.rxjava3.internal.queue.a aVar = this.f403770c;
            io.reactivex.rxjava3.core.G<? super io.reactivex.rxjava3.core.z<T>> g12 = this.f403769b;
            io.reactivex.rxjava3.subjects.j<T> jVarG = this.f403780m;
            int iAddAndGet = 1;
            while (true) {
                if (this.f403776i) {
                    aVar.clear();
                    jVarG = 0;
                    this.f403780m = null;
                } else {
                    boolean z12 = this.f403772e;
                    Object objPoll = aVar.poll();
                    boolean z13 = objPoll == null;
                    if (z12 && z13) {
                        Throwable th2 = this.f403773f;
                        if (th2 != null) {
                            if (jVarG != 0) {
                                jVarG.onError(th2);
                            }
                            g12.onError(th2);
                        } else {
                            if (jVarG != 0) {
                                jVarG.e();
                            }
                            g12.e();
                        }
                        a();
                        this.f403776i = true;
                    } else if (!z13) {
                        if (objPoll instanceof a) {
                            ((a) objPoll).getClass();
                            this.f403779l = 0L;
                            jVarG = g(jVarG);
                        } else if (jVarG != 0) {
                            jVarG.onNext(objPoll);
                            long j12 = this.f403779l + 1;
                            if (j12 == 0) {
                                this.f403779l = 0L;
                                jVarG = g(jVarG);
                            } else {
                                this.f403779l = j12;
                            }
                        }
                    }
                }
                iAddAndGet = addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
            }
        }

        public final io.reactivex.rxjava3.subjects.j<T> g(io.reactivex.rxjava3.subjects.j<T> jVar) {
            if (jVar != null) {
                jVar.e();
                jVar = null;
            }
            if (this.f403775h.get()) {
                a();
            } else {
                this.f403771d++;
                this.f403777j.getAndIncrement();
                jVar = io.reactivex.rxjava3.subjects.j.N0(this);
                this.f403780m = jVar;
                N1 n12 = new N1(jVar);
                this.f403769b.onNext(n12);
                if (n12.M0()) {
                    jVar.e();
                }
            }
            return jVar;
        }
    }

    /* compiled from: ObservableWindowTimed.java */
    public static final class c<T> extends a<T> implements Runnable {

        /* renamed from: l, reason: collision with root package name */
        public static final Object f403782l = new Object();
        private static final long serialVersionUID = 1155822639622580836L;

        /* renamed from: k, reason: collision with root package name */
        public io.reactivex.rxjava3.subjects.j<T> f403783k;

        /* compiled from: ObservableWindowTimed.java */
        public final class a implements Runnable {
            @Override // java.lang.Runnable
            public final void run() {
                throw null;
            }
        }

        public c() {
            throw null;
        }

        @Override // io.reactivex.rxjava3.internal.operators.observable.O1.a
        public final void a() {
            throw null;
        }

        @Override // io.reactivex.rxjava3.internal.operators.observable.O1.a
        public final void c() {
            if (this.f403775h.get()) {
                return;
            }
            this.f403777j.getAndIncrement();
            io.reactivex.rxjava3.subjects.j<T> jVarN0 = io.reactivex.rxjava3.subjects.j.N0(null);
            this.f403783k = jVarN0;
            this.f403771d = 1L;
            this.f403769b.onNext(new N1(jVarN0));
            throw null;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r2v11, types: [io.reactivex.rxjava3.subjects.j] */
        @Override // io.reactivex.rxjava3.internal.operators.observable.O1.a
        public final void d() {
            if (getAndIncrement() != 0) {
                return;
            }
            io.reactivex.rxjava3.internal.queue.a aVar = this.f403770c;
            io.reactivex.rxjava3.core.G<? super io.reactivex.rxjava3.core.z<T>> g12 = this.f403769b;
            io.reactivex.rxjava3.subjects.j jVar = (io.reactivex.rxjava3.subjects.j<T>) this.f403783k;
            int iAddAndGet = 1;
            while (true) {
                if (this.f403776i) {
                    aVar.clear();
                    this.f403783k = null;
                    jVar = (io.reactivex.rxjava3.subjects.j<T>) null;
                } else {
                    boolean z12 = this.f403772e;
                    Object objPoll = aVar.poll();
                    boolean z13 = objPoll == null;
                    if (z12 && z13) {
                        Throwable th2 = this.f403773f;
                        if (th2 != null) {
                            if (jVar != null) {
                                jVar.onError(th2);
                            }
                            g12.onError(th2);
                            throw null;
                        }
                        if (jVar != null) {
                            jVar.e();
                        }
                        g12.e();
                        throw null;
                    }
                    if (!z13) {
                        if (objPoll == f403782l) {
                            if (jVar != null) {
                                jVar.e();
                                this.f403783k = null;
                            }
                            if (this.f403775h.get()) {
                                throw null;
                            }
                            this.f403771d++;
                            this.f403777j.getAndIncrement();
                            jVar = (io.reactivex.rxjava3.subjects.j<T>) io.reactivex.rxjava3.subjects.j.N0(null);
                            this.f403783k = jVar;
                            N1 n12 = new N1(jVar);
                            g12.onNext(n12);
                            if (n12.M0()) {
                                jVar.e();
                            }
                        } else if (jVar != null) {
                            jVar.onNext(objPoll);
                        }
                    }
                }
                iAddAndGet = addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // io.reactivex.rxjava3.internal.operators.observable.O1.a, java.lang.Runnable
        public final void run() {
            this.f403770c.offer(f403782l);
            d();
        }
    }

    /* compiled from: ObservableWindowTimed.java */
    public static final class d<T> extends a<T> implements Runnable {

        /* renamed from: k, reason: collision with root package name */
        public static final Object f403784k = new Object();

        /* renamed from: l, reason: collision with root package name */
        public static final Object f403785l = new Object();
        private static final long serialVersionUID = -7852870764194095894L;

        /* compiled from: ObservableWindowTimed.java */
        public static final class a implements Runnable {
            @Override // java.lang.Runnable
            public final void run() {
                throw null;
            }
        }

        public d() {
            throw null;
        }

        @Override // io.reactivex.rxjava3.internal.operators.observable.O1.a
        public final void a() {
            throw null;
        }

        @Override // io.reactivex.rxjava3.internal.operators.observable.O1.a
        public final void c() {
            if (this.f403775h.get()) {
                return;
            }
            this.f403771d = 1L;
            this.f403777j.getAndIncrement();
            io.reactivex.rxjava3.subjects.j.N0(this);
            throw null;
        }

        @Override // io.reactivex.rxjava3.internal.operators.observable.O1.a
        public final void d() {
            if (getAndIncrement() != 0) {
                return;
            }
            io.reactivex.rxjava3.internal.queue.a aVar = this.f403770c;
            int iAddAndGet = 1;
            while (!this.f403776i) {
                boolean z12 = this.f403772e;
                Object objPoll = aVar.poll();
                boolean z13 = objPoll == null;
                if (z12 && z13) {
                    this.f403773f.getClass();
                    throw null;
                }
                if (z13) {
                    iAddAndGet = addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                } else {
                    if (objPoll != f403784k) {
                        if (objPoll != f403785l) {
                            throw null;
                        }
                        throw null;
                    }
                    if (!this.f403775h.get()) {
                        this.f403771d++;
                        this.f403777j.getAndIncrement();
                        io.reactivex.rxjava3.subjects.j.N0(this);
                        throw null;
                    }
                }
            }
            aVar.clear();
            throw null;
        }
    }

    @Override // io.reactivex.rxjava3.core.z
    public final void w0(io.reactivex.rxjava3.core.G<? super io.reactivex.rxjava3.core.z<T>> g12) {
        this.f403951b.c(new b(g12));
    }
}
