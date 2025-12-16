package hu.akarnokd.rxjava3.operators;

import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.queue.SpscLinkedArrayQueue;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import s41.C47998a;

/* compiled from: ObservableMapAsync.java */
/* loaded from: classes8.dex */
final class i0<T, U, R> extends io.reactivex.rxjava3.core.z<R> implements io.reactivex.rxjava3.core.F<T, R> {

    /* renamed from: b, reason: collision with root package name */
    public final io.reactivex.rxjava3.core.z f398050b;

    /* compiled from: ObservableMapAsync.java */
    public static final class a<T, U, R> extends AtomicInteger implements io.reactivex.rxjava3.core.G<T>, io.reactivex.rxjava3.disposables.d {
        private static final long serialVersionUID = -204261674817426393L;

        /* renamed from: b, reason: collision with root package name */
        public final io.reactivex.rxjava3.core.G<? super R> f398051b;

        /* renamed from: c, reason: collision with root package name */
        public final SpscLinkedArrayQueue<T> f398052c = new SpscLinkedArrayQueue<>(0);

        /* renamed from: d, reason: collision with root package name */
        public final io.reactivex.rxjava3.internal.util.b f398053d = new io.reactivex.rxjava3.internal.util.b();

        /* renamed from: e, reason: collision with root package name */
        public final AtomicReference<io.reactivex.rxjava3.disposables.d> f398054e = new AtomicReference<>();

        /* renamed from: f, reason: collision with root package name */
        public io.reactivex.rxjava3.disposables.d f398055f;

        /* renamed from: g, reason: collision with root package name */
        public volatile boolean f398056g;

        /* renamed from: h, reason: collision with root package name */
        public volatile boolean f398057h;

        /* renamed from: i, reason: collision with root package name */
        public T f398058i;

        /* renamed from: j, reason: collision with root package name */
        public volatile int f398059j;

        /* renamed from: k, reason: collision with root package name */
        public U f398060k;

        /* compiled from: ObservableMapAsync.java */
        /* renamed from: hu.akarnokd.rxjava3.operators.i0$a$a, reason: collision with other inner class name */
        public final class C11340a implements io.reactivex.rxjava3.core.G<U> {

            /* renamed from: b, reason: collision with root package name */
            public boolean f398061b;

            @Override // io.reactivex.rxjava3.core.G
            public final void b(io.reactivex.rxjava3.disposables.d dVar) {
                throw null;
            }

            @Override // io.reactivex.rxjava3.core.G
            public final void e() {
                if (!this.f398061b) {
                    throw null;
                }
            }

            @Override // io.reactivex.rxjava3.core.G
            public final void onError(Throwable th2) {
                if (!this.f398061b) {
                    throw null;
                }
                C47998a.b(th2);
            }

            @Override // io.reactivex.rxjava3.core.G
            public final void onNext(U u12) {
                if (this.f398061b) {
                    return;
                }
                this.f398061b = true;
                throw null;
            }
        }

        public a(io.reactivex.rxjava3.core.G g12) {
            this.f398051b = g12;
        }

        public final void a() {
            if (getAndIncrement() != 0) {
                return;
            }
            int iAddAndGet = 1;
            while (true) {
                if (this.f398057h) {
                    this.f398052c.clear();
                } else if (this.f398053d.get() != null) {
                    this.f398057h = true;
                    this.f398053d.e(this.f398051b);
                } else {
                    int i12 = this.f398059j;
                    if (i12 == 0) {
                        boolean z12 = this.f398056g;
                        T t12 = (T) this.f398052c.poll();
                        boolean z13 = t12 == null;
                        if (z12 && z13) {
                            this.f398051b.e();
                        } else if (!z13) {
                            this.f398058i = t12;
                            try {
                                throw null;
                            } catch (Throwable th2) {
                                io.reactivex.rxjava3.exceptions.a.a(th2);
                                this.f398057h = true;
                                this.f398055f.dispose();
                                this.f398053d.b(th2);
                                this.f398053d.e(this.f398051b);
                            }
                        }
                    } else if (i12 == 2) {
                        try {
                            throw null;
                        } catch (Throwable th3) {
                            io.reactivex.rxjava3.exceptions.a.a(th3);
                            this.f398057h = true;
                            this.f398055f.dispose();
                            this.f398053d.b(th3);
                            this.f398053d.e(this.f398051b);
                        }
                    } else if (i12 == 3) {
                        this.f398059j = 0;
                    }
                }
                iAddAndGet = addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
            }
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void b(io.reactivex.rxjava3.disposables.d dVar) {
            if (DisposableHelper.f(this.f398055f, dVar)) {
                this.f398055f = dVar;
                this.f398051b.b(this);
            }
        }

        @Override // io.reactivex.rxjava3.disposables.d
        public final void dispose() {
            this.f398057h = true;
            this.f398055f.dispose();
            DisposableHelper.a(this.f398054e);
            this.f398053d.c();
            a();
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void e() {
            this.f398056g = true;
            a();
        }

        @Override // io.reactivex.rxjava3.disposables.d
        /* renamed from: i */
        public final boolean getF318621e() {
            return this.f398057h;
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void onError(Throwable th2) {
            DisposableHelper.a(this.f398054e);
            if (this.f398053d.b(th2)) {
                this.f398056g = true;
                a();
            }
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void onNext(T t12) {
            this.f398052c.offer(t12);
            a();
        }
    }

    public i0(io.reactivex.rxjava3.core.z zVar) {
        this.f398050b = zVar;
    }

    @Override // io.reactivex.rxjava3.core.F
    public final io.reactivex.rxjava3.core.E<R> a(io.reactivex.rxjava3.core.z<T> zVar) {
        return new i0(zVar);
    }

    @Override // io.reactivex.rxjava3.core.z
    public final void w0(io.reactivex.rxjava3.core.G<? super R> g12) {
        this.f398050b.c(new a(g12));
    }
}
