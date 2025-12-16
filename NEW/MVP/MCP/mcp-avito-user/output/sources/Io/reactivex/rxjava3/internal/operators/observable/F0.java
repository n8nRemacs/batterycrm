package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.core.AbstractC41777j;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: ObservableMergeWithMaybe.java */
/* loaded from: classes8.dex */
public final class F0<T> extends AbstractC41932a<T, T> {

    /* compiled from: ObservableMergeWithMaybe.java */
    public static final class a<T> extends AtomicInteger implements io.reactivex.rxjava3.core.G<T>, io.reactivex.rxjava3.disposables.d {
        private static final long serialVersionUID = -4592979584110982903L;

        /* renamed from: b, reason: collision with root package name */
        public final io.reactivex.rxjava3.core.G<? super T> f403596b;

        /* renamed from: c, reason: collision with root package name */
        public final AtomicReference<io.reactivex.rxjava3.disposables.d> f403597c = new AtomicReference<>();

        /* renamed from: d, reason: collision with root package name */
        public final C11489a<T> f403598d = new C11489a<>(this);

        /* renamed from: e, reason: collision with root package name */
        public final io.reactivex.rxjava3.internal.util.b f403599e = new io.reactivex.rxjava3.internal.util.b();

        /* renamed from: f, reason: collision with root package name */
        public volatile q41.i f403600f;

        /* renamed from: g, reason: collision with root package name */
        public T f403601g;

        /* renamed from: h, reason: collision with root package name */
        public volatile boolean f403602h;

        /* renamed from: i, reason: collision with root package name */
        public volatile boolean f403603i;

        /* renamed from: j, reason: collision with root package name */
        public volatile int f403604j;

        /* compiled from: ObservableMergeWithMaybe.java */
        /* renamed from: io.reactivex.rxjava3.internal.operators.observable.F0$a$a, reason: collision with other inner class name */
        public static final class C11489a<T> extends AtomicReference<io.reactivex.rxjava3.disposables.d> implements io.reactivex.rxjava3.core.t<T> {
            private static final long serialVersionUID = -2935427570954647017L;

            /* renamed from: b, reason: collision with root package name */
            public final a<T> f403605b;

            public C11489a(a<T> aVar) {
                this.f403605b = aVar;
            }

            @Override // io.reactivex.rxjava3.core.t
            public final void b(io.reactivex.rxjava3.disposables.d dVar) {
                DisposableHelper.e(this, dVar);
            }

            @Override // io.reactivex.rxjava3.core.t
            public final void e() {
                a<T> aVar = this.f403605b;
                aVar.f403604j = 2;
                if (aVar.getAndIncrement() == 0) {
                    aVar.a();
                }
            }

            @Override // io.reactivex.rxjava3.core.t
            public final void onError(Throwable th2) {
                a<T> aVar = this.f403605b;
                if (aVar.f403599e.b(th2)) {
                    DisposableHelper.a(aVar.f403597c);
                    if (aVar.getAndIncrement() == 0) {
                        aVar.a();
                    }
                }
            }

            @Override // io.reactivex.rxjava3.core.t
            public final void onSuccess(T t12) {
                a<T> aVar = this.f403605b;
                if (aVar.compareAndSet(0, 1)) {
                    aVar.f403596b.onNext(t12);
                    aVar.f403604j = 2;
                } else {
                    aVar.f403601g = t12;
                    aVar.f403604j = 1;
                    if (aVar.getAndIncrement() != 0) {
                        return;
                    }
                }
                aVar.a();
            }
        }

        public a(io.reactivex.rxjava3.core.G<? super T> g12) {
            this.f403596b = g12;
        }

        public final void a() {
            io.reactivex.rxjava3.core.G<? super T> g12 = this.f403596b;
            int iAddAndGet = 1;
            while (!this.f403602h) {
                if (this.f403599e.get() != null) {
                    this.f403601g = null;
                    this.f403600f = null;
                    this.f403599e.e(g12);
                    return;
                }
                int i12 = this.f403604j;
                if (i12 == 1) {
                    T t12 = this.f403601g;
                    this.f403601g = null;
                    this.f403604j = 2;
                    g12.onNext(t12);
                    i12 = 2;
                }
                boolean z12 = this.f403603i;
                q41.i iVar = this.f403600f;
                A00.b bVar = iVar != null ? (Object) iVar.poll() : null;
                boolean z13 = bVar == null;
                if (z12 && z13 && i12 == 2) {
                    this.f403600f = null;
                    g12.e();
                    return;
                } else if (z13) {
                    iAddAndGet = addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                } else {
                    g12.onNext(bVar);
                }
            }
            this.f403601g = null;
            this.f403600f = null;
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void b(io.reactivex.rxjava3.disposables.d dVar) {
            DisposableHelper.e(this.f403597c, dVar);
        }

        @Override // io.reactivex.rxjava3.disposables.d
        public final void dispose() {
            this.f403602h = true;
            DisposableHelper.a(this.f403597c);
            DisposableHelper.a(this.f403598d);
            this.f403599e.c();
            if (getAndIncrement() == 0) {
                this.f403600f = null;
                this.f403601g = null;
            }
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void e() {
            this.f403603i = true;
            if (getAndIncrement() == 0) {
                a();
            }
        }

        @Override // io.reactivex.rxjava3.disposables.d
        /* renamed from: i */
        public final boolean getF318621e() {
            return DisposableHelper.b(this.f403597c.get());
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void onError(Throwable th2) {
            if (this.f403599e.b(th2)) {
                DisposableHelper.a(this.f403598d);
                if (getAndIncrement() == 0) {
                    a();
                }
            }
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void onNext(T t12) {
            if (compareAndSet(0, 1)) {
                this.f403596b.onNext(t12);
                if (decrementAndGet() == 0) {
                    return;
                }
            } else {
                q41.i iVar = this.f403600f;
                if (iVar == null) {
                    iVar = new q41.i(AbstractC41777j.f401972b);
                    this.f403600f = iVar;
                }
                iVar.offer(t12);
                if (getAndIncrement() != 0) {
                    return;
                }
            }
            a();
        }
    }

    @Override // io.reactivex.rxjava3.core.z
    public final void w0(io.reactivex.rxjava3.core.G<? super T> g12) {
        a aVar = new a(g12);
        g12.b(aVar);
        this.f403951b.c(aVar);
        throw null;
    }
}
