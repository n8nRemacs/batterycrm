package io.reactivex.rxjava3.internal.operators.mixed;

import io.reactivex.rxjava3.core.G;
import io.reactivex.rxjava3.core.L;
import io.reactivex.rxjava3.core.O;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import s41.C47998a;

/* compiled from: ObservableSwitchMapSingle.java */
/* loaded from: classes8.dex */
public final class x<T, R> extends io.reactivex.rxjava3.core.z<R> {

    /* renamed from: b, reason: collision with root package name */
    public final io.reactivex.rxjava3.core.z<T> f403479b;

    /* renamed from: c, reason: collision with root package name */
    public final l41.o<? super T, ? extends O<? extends R>> f403480c;

    /* compiled from: ObservableSwitchMapSingle.java */
    public static final class a<T, R> extends AtomicInteger implements G<T>, io.reactivex.rxjava3.disposables.d {

        /* renamed from: i, reason: collision with root package name */
        public static final C11486a<Object> f403481i = new C11486a<>(null);
        private static final long serialVersionUID = -5402190102429853762L;

        /* renamed from: b, reason: collision with root package name */
        public final G<? super R> f403482b;

        /* renamed from: c, reason: collision with root package name */
        public final l41.o<? super T, ? extends O<? extends R>> f403483c;

        /* renamed from: d, reason: collision with root package name */
        public final io.reactivex.rxjava3.internal.util.b f403484d = new io.reactivex.rxjava3.internal.util.b();

        /* renamed from: e, reason: collision with root package name */
        public final AtomicReference<C11486a<R>> f403485e = new AtomicReference<>();

        /* renamed from: f, reason: collision with root package name */
        public io.reactivex.rxjava3.disposables.d f403486f;

        /* renamed from: g, reason: collision with root package name */
        public volatile boolean f403487g;

        /* renamed from: h, reason: collision with root package name */
        public volatile boolean f403488h;

        /* compiled from: ObservableSwitchMapSingle.java */
        /* renamed from: io.reactivex.rxjava3.internal.operators.mixed.x$a$a, reason: collision with other inner class name */
        public static final class C11486a<R> extends AtomicReference<io.reactivex.rxjava3.disposables.d> implements L<R> {
            private static final long serialVersionUID = 8042919737683345351L;

            /* renamed from: b, reason: collision with root package name */
            public final a<?, R> f403489b;

            /* renamed from: c, reason: collision with root package name */
            public volatile R f403490c;

            public C11486a(a<?, R> aVar) {
                this.f403489b = aVar;
            }

            @Override // io.reactivex.rxjava3.core.L
            public final void b(io.reactivex.rxjava3.disposables.d dVar) {
                DisposableHelper.e(this, dVar);
            }

            @Override // io.reactivex.rxjava3.core.L
            public final void onError(Throwable th2) {
                a<?, R> aVar = this.f403489b;
                AtomicReference<C11486a<R>> atomicReference = aVar.f403485e;
                while (!atomicReference.compareAndSet(this, null)) {
                    if (atomicReference.get() != this) {
                        C47998a.b(th2);
                        return;
                    }
                }
                if (aVar.f403484d.b(th2)) {
                    aVar.f403486f.dispose();
                    aVar.a();
                    aVar.c();
                }
            }

            @Override // io.reactivex.rxjava3.core.L
            public final void onSuccess(R r12) {
                this.f403490c = r12;
                this.f403489b.c();
            }
        }

        public a(G g12, l41.o oVar) {
            this.f403482b = g12;
            this.f403483c = oVar;
        }

        public final void a() {
            AtomicReference<C11486a<R>> atomicReference = this.f403485e;
            C11486a<Object> c11486a = f403481i;
            C11486a<Object> c11486a2 = (C11486a) atomicReference.getAndSet(c11486a);
            if (c11486a2 == null || c11486a2 == c11486a) {
                return;
            }
            DisposableHelper.a(c11486a2);
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void b(io.reactivex.rxjava3.disposables.d dVar) {
            if (DisposableHelper.f(this.f403486f, dVar)) {
                this.f403486f = dVar;
                this.f403482b.b(this);
            }
        }

        public final void c() {
            if (getAndIncrement() != 0) {
                return;
            }
            G<? super R> g12 = this.f403482b;
            io.reactivex.rxjava3.internal.util.b bVar = this.f403484d;
            AtomicReference<C11486a<R>> atomicReference = this.f403485e;
            int iAddAndGet = 1;
            while (!this.f403488h) {
                if (bVar.get() != null) {
                    bVar.e(g12);
                    return;
                }
                boolean z12 = this.f403487g;
                C11486a<R> c11486a = atomicReference.get();
                boolean z13 = c11486a == null;
                if (z12 && z13) {
                    bVar.e(g12);
                    return;
                }
                if (z13 || c11486a.f403490c == null) {
                    iAddAndGet = addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                } else {
                    while (!atomicReference.compareAndSet(c11486a, null) && atomicReference.get() == c11486a) {
                    }
                    g12.onNext(c11486a.f403490c);
                }
            }
        }

        @Override // io.reactivex.rxjava3.disposables.d
        public final void dispose() {
            this.f403488h = true;
            this.f403486f.dispose();
            a();
            this.f403484d.c();
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void e() {
            this.f403487g = true;
            c();
        }

        @Override // io.reactivex.rxjava3.disposables.d
        /* renamed from: i */
        public final boolean getF318621e() {
            return this.f403488h;
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void onError(Throwable th2) {
            if (this.f403484d.b(th2)) {
                a();
                this.f403487g = true;
                c();
            }
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void onNext(T t12) {
            C11486a<Object> c11486a = f403481i;
            AtomicReference<C11486a<R>> atomicReference = this.f403485e;
            C11486a c11486a2 = (C11486a) atomicReference.get();
            if (c11486a2 != null) {
                DisposableHelper.a(c11486a2);
            }
            try {
                O<? extends R> oApply = this.f403483c.apply(t12);
                Objects.requireNonNull(oApply, "The mapper returned a null SingleSource");
                O<? extends R> o12 = oApply;
                C11486a c11486a3 = new C11486a(this);
                while (true) {
                    C11486a<Object> c11486a4 = (C11486a) atomicReference.get();
                    if (c11486a4 == c11486a) {
                        return;
                    }
                    while (!atomicReference.compareAndSet(c11486a4, c11486a3)) {
                        if (atomicReference.get() != c11486a4) {
                            break;
                        }
                    }
                    o12.a(c11486a3);
                    return;
                }
            } catch (Throwable th2) {
                io.reactivex.rxjava3.exceptions.a.a(th2);
                this.f403486f.dispose();
                atomicReference.getAndSet(c11486a);
                onError(th2);
            }
        }
    }

    public x(io.reactivex.rxjava3.core.z zVar, l41.o oVar) {
        this.f403479b = zVar;
        this.f403480c = oVar;
    }

    @Override // io.reactivex.rxjava3.core.z
    public final void w0(G<? super R> g12) {
        io.reactivex.rxjava3.core.z<T> zVar = this.f403479b;
        l41.o<? super T, ? extends O<? extends R>> oVar = this.f403480c;
        if (y.c(zVar, oVar, g12)) {
            return;
        }
        zVar.c(new a(g12, oVar));
    }
}
