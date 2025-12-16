package io.reactivex.rxjava3.internal.operators.mixed;

import io.reactivex.rxjava3.core.G;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import s41.C47998a;

/* compiled from: ObservableSwitchMapMaybe.java */
/* loaded from: classes8.dex */
public final class w<T, R> extends io.reactivex.rxjava3.core.z<R> {

    /* renamed from: b, reason: collision with root package name */
    public final io.reactivex.rxjava3.core.z<T> f403467b;

    /* renamed from: c, reason: collision with root package name */
    public final l41.o<? super T, ? extends io.reactivex.rxjava3.core.w<? extends R>> f403468c;

    /* compiled from: ObservableSwitchMapMaybe.java */
    public static final class a<T, R> extends AtomicInteger implements G<T>, io.reactivex.rxjava3.disposables.d {

        /* renamed from: i, reason: collision with root package name */
        public static final C11485a<Object> f403469i = new C11485a<>(null);
        private static final long serialVersionUID = -5402190102429853762L;

        /* renamed from: b, reason: collision with root package name */
        public final G<? super R> f403470b;

        /* renamed from: c, reason: collision with root package name */
        public final l41.o<? super T, ? extends io.reactivex.rxjava3.core.w<? extends R>> f403471c;

        /* renamed from: d, reason: collision with root package name */
        public final io.reactivex.rxjava3.internal.util.b f403472d = new io.reactivex.rxjava3.internal.util.b();

        /* renamed from: e, reason: collision with root package name */
        public final AtomicReference<C11485a<R>> f403473e = new AtomicReference<>();

        /* renamed from: f, reason: collision with root package name */
        public io.reactivex.rxjava3.disposables.d f403474f;

        /* renamed from: g, reason: collision with root package name */
        public volatile boolean f403475g;

        /* renamed from: h, reason: collision with root package name */
        public volatile boolean f403476h;

        /* compiled from: ObservableSwitchMapMaybe.java */
        /* renamed from: io.reactivex.rxjava3.internal.operators.mixed.w$a$a, reason: collision with other inner class name */
        public static final class C11485a<R> extends AtomicReference<io.reactivex.rxjava3.disposables.d> implements io.reactivex.rxjava3.core.t<R> {
            private static final long serialVersionUID = 8042919737683345351L;

            /* renamed from: b, reason: collision with root package name */
            public final a<?, R> f403477b;

            /* renamed from: c, reason: collision with root package name */
            public volatile R f403478c;

            public C11485a(a<?, R> aVar) {
                this.f403477b = aVar;
            }

            @Override // io.reactivex.rxjava3.core.t
            public final void b(io.reactivex.rxjava3.disposables.d dVar) {
                DisposableHelper.e(this, dVar);
            }

            @Override // io.reactivex.rxjava3.core.t
            public final void e() {
                a<?, R> aVar = this.f403477b;
                AtomicReference<C11485a<R>> atomicReference = aVar.f403473e;
                while (!atomicReference.compareAndSet(this, null)) {
                    if (atomicReference.get() != this) {
                        return;
                    }
                }
                aVar.c();
            }

            @Override // io.reactivex.rxjava3.core.t
            public final void onError(Throwable th2) {
                a<?, R> aVar = this.f403477b;
                AtomicReference<C11485a<R>> atomicReference = aVar.f403473e;
                while (!atomicReference.compareAndSet(this, null)) {
                    if (atomicReference.get() != this) {
                        C47998a.b(th2);
                        return;
                    }
                }
                if (aVar.f403472d.b(th2)) {
                    aVar.f403474f.dispose();
                    aVar.a();
                    aVar.c();
                }
            }

            @Override // io.reactivex.rxjava3.core.t
            public final void onSuccess(R r12) {
                this.f403478c = r12;
                this.f403477b.c();
            }
        }

        public a(G g12, l41.o oVar) {
            this.f403470b = g12;
            this.f403471c = oVar;
        }

        public final void a() {
            AtomicReference<C11485a<R>> atomicReference = this.f403473e;
            C11485a<Object> c11485a = f403469i;
            C11485a<Object> c11485a2 = (C11485a) atomicReference.getAndSet(c11485a);
            if (c11485a2 == null || c11485a2 == c11485a) {
                return;
            }
            DisposableHelper.a(c11485a2);
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void b(io.reactivex.rxjava3.disposables.d dVar) {
            if (DisposableHelper.f(this.f403474f, dVar)) {
                this.f403474f = dVar;
                this.f403470b.b(this);
            }
        }

        public final void c() {
            if (getAndIncrement() != 0) {
                return;
            }
            G<? super R> g12 = this.f403470b;
            io.reactivex.rxjava3.internal.util.b bVar = this.f403472d;
            AtomicReference<C11485a<R>> atomicReference = this.f403473e;
            int iAddAndGet = 1;
            while (!this.f403476h) {
                if (bVar.get() != null) {
                    bVar.e(g12);
                    return;
                }
                boolean z12 = this.f403475g;
                C11485a<R> c11485a = atomicReference.get();
                boolean z13 = c11485a == null;
                if (z12 && z13) {
                    bVar.e(g12);
                    return;
                }
                if (z13 || c11485a.f403478c == null) {
                    iAddAndGet = addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                } else {
                    while (!atomicReference.compareAndSet(c11485a, null) && atomicReference.get() == c11485a) {
                    }
                    g12.onNext(c11485a.f403478c);
                }
            }
        }

        @Override // io.reactivex.rxjava3.disposables.d
        public final void dispose() {
            this.f403476h = true;
            this.f403474f.dispose();
            a();
            this.f403472d.c();
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void e() {
            this.f403475g = true;
            c();
        }

        @Override // io.reactivex.rxjava3.disposables.d
        /* renamed from: i */
        public final boolean getF318621e() {
            return this.f403476h;
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void onError(Throwable th2) {
            if (this.f403472d.b(th2)) {
                a();
                this.f403475g = true;
                c();
            }
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void onNext(T t12) {
            C11485a<Object> c11485a = f403469i;
            AtomicReference<C11485a<R>> atomicReference = this.f403473e;
            C11485a c11485a2 = (C11485a) atomicReference.get();
            if (c11485a2 != null) {
                DisposableHelper.a(c11485a2);
            }
            try {
                io.reactivex.rxjava3.core.w<? extends R> wVarApply = this.f403471c.apply(t12);
                Objects.requireNonNull(wVarApply, "The mapper returned a null MaybeSource");
                io.reactivex.rxjava3.core.w<? extends R> wVar = wVarApply;
                C11485a c11485a3 = new C11485a(this);
                while (true) {
                    C11485a<Object> c11485a4 = (C11485a) atomicReference.get();
                    if (c11485a4 == c11485a) {
                        return;
                    }
                    while (!atomicReference.compareAndSet(c11485a4, c11485a3)) {
                        if (atomicReference.get() != c11485a4) {
                            break;
                        }
                    }
                    wVar.a(c11485a3);
                    return;
                }
            } catch (Throwable th2) {
                io.reactivex.rxjava3.exceptions.a.a(th2);
                this.f403474f.dispose();
                atomicReference.getAndSet(c11485a);
                onError(th2);
            }
        }
    }

    public w(io.reactivex.rxjava3.core.z zVar, l41.o oVar) {
        this.f403467b = zVar;
        this.f403468c = oVar;
    }

    @Override // io.reactivex.rxjava3.core.z
    public final void w0(G<? super R> g12) {
        io.reactivex.rxjava3.core.z<T> zVar = this.f403467b;
        l41.o<? super T, ? extends io.reactivex.rxjava3.core.w<? extends R>> oVar = this.f403468c;
        if (y.b(zVar, oVar, g12)) {
            return;
        }
        zVar.c(new a(g12, oVar));
    }
}
