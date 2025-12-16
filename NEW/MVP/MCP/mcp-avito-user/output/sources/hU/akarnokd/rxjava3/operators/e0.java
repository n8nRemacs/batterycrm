package hu.akarnokd.rxjava3.operators;

import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.queue.SpscLinkedArrayQueue;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import s41.C47998a;

/* compiled from: ObservableFilterAsync.java */
/* loaded from: classes8.dex */
final class e0<T> extends io.reactivex.rxjava3.core.z<T> implements io.reactivex.rxjava3.core.F<T, T> {

    /* renamed from: b, reason: collision with root package name */
    public final io.reactivex.rxjava3.core.z f398015b;

    /* compiled from: ObservableFilterAsync.java */
    public static final class a<T> extends AtomicInteger implements io.reactivex.rxjava3.core.G<T>, io.reactivex.rxjava3.disposables.d {
        private static final long serialVersionUID = -204261674817426393L;

        /* renamed from: b, reason: collision with root package name */
        public final io.reactivex.rxjava3.core.G<? super T> f398016b;

        /* renamed from: c, reason: collision with root package name */
        public final SpscLinkedArrayQueue<T> f398017c = new SpscLinkedArrayQueue<>(0);

        /* renamed from: d, reason: collision with root package name */
        public final io.reactivex.rxjava3.internal.util.b f398018d = new io.reactivex.rxjava3.internal.util.b();

        /* renamed from: e, reason: collision with root package name */
        public final AtomicReference<io.reactivex.rxjava3.disposables.d> f398019e = new AtomicReference<>();

        /* renamed from: f, reason: collision with root package name */
        public io.reactivex.rxjava3.disposables.d f398020f;

        /* renamed from: g, reason: collision with root package name */
        public volatile boolean f398021g;

        /* renamed from: h, reason: collision with root package name */
        public volatile boolean f398022h;

        /* renamed from: i, reason: collision with root package name */
        public T f398023i;

        /* renamed from: j, reason: collision with root package name */
        public volatile int f398024j;

        /* compiled from: ObservableFilterAsync.java */
        /* renamed from: hu.akarnokd.rxjava3.operators.e0$a$a, reason: collision with other inner class name */
        public final class C11335a implements io.reactivex.rxjava3.core.G<Boolean> {

            /* renamed from: b, reason: collision with root package name */
            public boolean f398025b;

            @Override // io.reactivex.rxjava3.core.G
            public final void b(io.reactivex.rxjava3.disposables.d dVar) {
                throw null;
            }

            @Override // io.reactivex.rxjava3.core.G
            public final void e() {
                if (!this.f398025b) {
                    throw null;
                }
            }

            @Override // io.reactivex.rxjava3.core.G
            public final void onError(Throwable th2) {
                if (!this.f398025b) {
                    throw null;
                }
                C47998a.b(th2);
            }

            @Override // io.reactivex.rxjava3.core.G
            public final void onNext(Boolean bool) {
                if (this.f398025b) {
                    return;
                }
                this.f398025b = true;
                throw null;
            }
        }

        public a(io.reactivex.rxjava3.core.G g12) {
            this.f398016b = g12;
        }

        public final void a() {
            if (getAndIncrement() != 0) {
                return;
            }
            int iAddAndGet = 1;
            while (true) {
                if (this.f398022h) {
                    this.f398023i = null;
                    this.f398017c.clear();
                } else if (this.f398018d.get() != null) {
                    this.f398022h = true;
                    this.f398018d.e(this.f398016b);
                } else {
                    int i12 = this.f398024j;
                    if (i12 == 0) {
                        boolean z12 = this.f398021g;
                        T t12 = (T) this.f398017c.poll();
                        boolean z13 = t12 == null;
                        if (z12 && z13) {
                            this.f398016b.e();
                        } else if (!z13) {
                            this.f398023i = t12;
                            try {
                                throw null;
                            } catch (Throwable th2) {
                                io.reactivex.rxjava3.exceptions.a.a(th2);
                                this.f398022h = true;
                                this.f398020f.dispose();
                                this.f398018d.b(th2);
                                this.f398018d.e(this.f398016b);
                            }
                        }
                    } else if (i12 == 2) {
                        T t13 = this.f398023i;
                        this.f398023i = null;
                        this.f398016b.onNext(t13);
                        this.f398024j = 0;
                    } else if (i12 == 3) {
                        this.f398023i = null;
                        this.f398024j = 0;
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
            if (DisposableHelper.f(this.f398020f, dVar)) {
                this.f398020f = dVar;
                this.f398016b.b(this);
            }
        }

        @Override // io.reactivex.rxjava3.disposables.d
        public final void dispose() {
            this.f398022h = true;
            this.f398020f.dispose();
            DisposableHelper.a(this.f398019e);
            this.f398018d.c();
            a();
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void e() {
            this.f398021g = true;
            a();
        }

        @Override // io.reactivex.rxjava3.disposables.d
        /* renamed from: i */
        public final boolean getF318621e() {
            return this.f398022h;
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void onError(Throwable th2) {
            DisposableHelper.a(this.f398019e);
            if (this.f398018d.b(th2)) {
                this.f398021g = true;
                a();
            }
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void onNext(T t12) {
            this.f398017c.offer(t12);
            a();
        }
    }

    public e0(io.reactivex.rxjava3.core.z zVar) {
        this.f398015b = zVar;
    }

    @Override // io.reactivex.rxjava3.core.F
    public final io.reactivex.rxjava3.core.E<T> a(io.reactivex.rxjava3.core.z<T> zVar) {
        return new e0(zVar);
    }

    @Override // io.reactivex.rxjava3.core.z
    public final void w0(io.reactivex.rxjava3.core.G<? super T> g12) {
        this.f398015b.c(new a(g12));
    }
}
