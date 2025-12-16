package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.util.ErrorMode;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import q41.InterfaceC47199b;
import s41.C47998a;

/* compiled from: ObservableConcatMap.java */
/* renamed from: io.reactivex.rxjava3.internal.operators.observable.u, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41991u<T, U> extends AbstractC41932a<T, U> {

    /* renamed from: c, reason: collision with root package name */
    public final l41.o<? super T, ? extends io.reactivex.rxjava3.core.E<? extends U>> f404315c;

    /* renamed from: d, reason: collision with root package name */
    public final int f404316d;

    /* renamed from: e, reason: collision with root package name */
    public final ErrorMode f404317e;

    /* compiled from: ObservableConcatMap.java */
    /* renamed from: io.reactivex.rxjava3.internal.operators.observable.u$a */
    public static final class a<T, R> extends AtomicInteger implements io.reactivex.rxjava3.core.G<T>, io.reactivex.rxjava3.disposables.d {
        private static final long serialVersionUID = -6951100001833242599L;

        /* renamed from: b, reason: collision with root package name */
        public final io.reactivex.rxjava3.core.G<? super R> f404318b;

        /* renamed from: c, reason: collision with root package name */
        public final l41.o<? super T, ? extends io.reactivex.rxjava3.core.E<? extends R>> f404319c;

        /* renamed from: d, reason: collision with root package name */
        public final int f404320d;

        /* renamed from: e, reason: collision with root package name */
        public final io.reactivex.rxjava3.internal.util.b f404321e = new io.reactivex.rxjava3.internal.util.b();

        /* renamed from: f, reason: collision with root package name */
        public final C11503a<R> f404322f;

        /* renamed from: g, reason: collision with root package name */
        public final boolean f404323g;

        /* renamed from: h, reason: collision with root package name */
        public q41.g<T> f404324h;

        /* renamed from: i, reason: collision with root package name */
        public io.reactivex.rxjava3.disposables.d f404325i;

        /* renamed from: j, reason: collision with root package name */
        public volatile boolean f404326j;

        /* renamed from: k, reason: collision with root package name */
        public volatile boolean f404327k;

        /* renamed from: l, reason: collision with root package name */
        public volatile boolean f404328l;

        /* renamed from: m, reason: collision with root package name */
        public int f404329m;

        /* compiled from: ObservableConcatMap.java */
        /* renamed from: io.reactivex.rxjava3.internal.operators.observable.u$a$a, reason: collision with other inner class name */
        public static final class C11503a<R> extends AtomicReference<io.reactivex.rxjava3.disposables.d> implements io.reactivex.rxjava3.core.G<R> {
            private static final long serialVersionUID = 2620149119579502636L;

            /* renamed from: b, reason: collision with root package name */
            public final io.reactivex.rxjava3.core.G<? super R> f404330b;

            /* renamed from: c, reason: collision with root package name */
            public final a<?, R> f404331c;

            public C11503a(io.reactivex.rxjava3.core.G<? super R> g12, a<?, R> aVar) {
                this.f404330b = g12;
                this.f404331c = aVar;
            }

            @Override // io.reactivex.rxjava3.core.G
            public final void b(io.reactivex.rxjava3.disposables.d dVar) {
                DisposableHelper.c(this, dVar);
            }

            @Override // io.reactivex.rxjava3.core.G
            public final void e() {
                a<?, R> aVar = this.f404331c;
                aVar.f404326j = false;
                aVar.a();
            }

            @Override // io.reactivex.rxjava3.core.G
            public final void onError(Throwable th2) {
                a<?, R> aVar = this.f404331c;
                if (aVar.f404321e.b(th2)) {
                    if (!aVar.f404323g) {
                        aVar.f404325i.dispose();
                    }
                    aVar.f404326j = false;
                    aVar.a();
                }
            }

            @Override // io.reactivex.rxjava3.core.G
            public final void onNext(R r12) {
                this.f404330b.onNext(r12);
            }
        }

        public a(io.reactivex.rxjava3.core.G<? super R> g12, l41.o<? super T, ? extends io.reactivex.rxjava3.core.E<? extends R>> oVar, int i12, boolean z12) {
            this.f404318b = g12;
            this.f404319c = oVar;
            this.f404320d = i12;
            this.f404323g = z12;
            this.f404322f = new C11503a<>(g12, this);
        }

        public final void a() {
            if (getAndIncrement() != 0) {
                return;
            }
            io.reactivex.rxjava3.core.G<? super R> g12 = this.f404318b;
            q41.g<T> gVar = this.f404324h;
            io.reactivex.rxjava3.internal.util.b bVar = this.f404321e;
            while (true) {
                if (!this.f404326j) {
                    if (this.f404328l) {
                        gVar.clear();
                        return;
                    }
                    if (!this.f404323g && bVar.get() != null) {
                        gVar.clear();
                        this.f404328l = true;
                        bVar.e(g12);
                        return;
                    }
                    boolean z12 = this.f404327k;
                    try {
                        T tPoll = gVar.poll();
                        boolean z13 = tPoll == null;
                        if (z12 && z13) {
                            this.f404328l = true;
                            bVar.e(g12);
                            return;
                        }
                        if (!z13) {
                            try {
                                io.reactivex.rxjava3.core.E<? extends R> eApply = this.f404319c.apply(tPoll);
                                Objects.requireNonNull(eApply, "The mapper returned a null ObservableSource");
                                io.reactivex.rxjava3.core.E<? extends R> e12 = eApply;
                                if (e12 instanceof l41.s) {
                                    try {
                                        A00.a aVar = (Object) ((l41.s) e12).get();
                                        if (aVar != null && !this.f404328l) {
                                            g12.onNext(aVar);
                                        }
                                    } catch (Throwable th2) {
                                        io.reactivex.rxjava3.exceptions.a.a(th2);
                                        bVar.b(th2);
                                    }
                                } else {
                                    this.f404326j = true;
                                    e12.c(this.f404322f);
                                }
                            } catch (Throwable th3) {
                                io.reactivex.rxjava3.exceptions.a.a(th3);
                                this.f404328l = true;
                                this.f404325i.dispose();
                                gVar.clear();
                                bVar.b(th3);
                                bVar.e(g12);
                                return;
                            }
                        }
                    } catch (Throwable th4) {
                        io.reactivex.rxjava3.exceptions.a.a(th4);
                        this.f404328l = true;
                        this.f404325i.dispose();
                        bVar.b(th4);
                        bVar.e(g12);
                        return;
                    }
                }
                if (decrementAndGet() == 0) {
                    return;
                }
            }
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void b(io.reactivex.rxjava3.disposables.d dVar) {
            if (DisposableHelper.f(this.f404325i, dVar)) {
                this.f404325i = dVar;
                if (dVar instanceof InterfaceC47199b) {
                    InterfaceC47199b interfaceC47199b = (InterfaceC47199b) dVar;
                    int iV2 = interfaceC47199b.v(3);
                    if (iV2 == 1) {
                        this.f404329m = iV2;
                        this.f404324h = interfaceC47199b;
                        this.f404327k = true;
                        this.f404318b.b(this);
                        a();
                        return;
                    }
                    if (iV2 == 2) {
                        this.f404329m = iV2;
                        this.f404324h = interfaceC47199b;
                        this.f404318b.b(this);
                        return;
                    }
                }
                this.f404324h = new q41.i(this.f404320d);
                this.f404318b.b(this);
            }
        }

        @Override // io.reactivex.rxjava3.disposables.d
        public final void dispose() {
            this.f404328l = true;
            this.f404325i.dispose();
            C11503a<R> c11503a = this.f404322f;
            c11503a.getClass();
            DisposableHelper.a(c11503a);
            this.f404321e.c();
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void e() {
            this.f404327k = true;
            a();
        }

        @Override // io.reactivex.rxjava3.disposables.d
        /* renamed from: i */
        public final boolean getF318621e() {
            return this.f404328l;
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void onError(Throwable th2) {
            if (this.f404321e.b(th2)) {
                this.f404327k = true;
                a();
            }
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void onNext(T t12) {
            if (this.f404329m == 0) {
                this.f404324h.offer(t12);
            }
            a();
        }
    }

    /* compiled from: ObservableConcatMap.java */
    /* renamed from: io.reactivex.rxjava3.internal.operators.observable.u$b */
    public static final class b<T, U> extends AtomicInteger implements io.reactivex.rxjava3.core.G<T>, io.reactivex.rxjava3.disposables.d {
        private static final long serialVersionUID = 8828587559905699186L;

        /* renamed from: b, reason: collision with root package name */
        public final io.reactivex.rxjava3.observers.m f404332b;

        /* renamed from: c, reason: collision with root package name */
        public final l41.o<? super T, ? extends io.reactivex.rxjava3.core.E<? extends U>> f404333c;

        /* renamed from: d, reason: collision with root package name */
        public final a<U> f404334d;

        /* renamed from: e, reason: collision with root package name */
        public final int f404335e;

        /* renamed from: f, reason: collision with root package name */
        public q41.g<T> f404336f;

        /* renamed from: g, reason: collision with root package name */
        public io.reactivex.rxjava3.disposables.d f404337g;

        /* renamed from: h, reason: collision with root package name */
        public volatile boolean f404338h;

        /* renamed from: i, reason: collision with root package name */
        public volatile boolean f404339i;

        /* renamed from: j, reason: collision with root package name */
        public volatile boolean f404340j;

        /* renamed from: k, reason: collision with root package name */
        public int f404341k;

        /* compiled from: ObservableConcatMap.java */
        /* renamed from: io.reactivex.rxjava3.internal.operators.observable.u$b$a */
        public static final class a<U> extends AtomicReference<io.reactivex.rxjava3.disposables.d> implements io.reactivex.rxjava3.core.G<U> {
            private static final long serialVersionUID = -7449079488798789337L;

            /* renamed from: b, reason: collision with root package name */
            public final io.reactivex.rxjava3.observers.m f404342b;

            /* renamed from: c, reason: collision with root package name */
            public final b<?, ?> f404343c;

            public a(io.reactivex.rxjava3.observers.m mVar, b bVar) {
                this.f404342b = mVar;
                this.f404343c = bVar;
            }

            @Override // io.reactivex.rxjava3.core.G
            public final void b(io.reactivex.rxjava3.disposables.d dVar) {
                DisposableHelper.c(this, dVar);
            }

            @Override // io.reactivex.rxjava3.core.G
            public final void e() {
                b<?, ?> bVar = this.f404343c;
                bVar.f404338h = false;
                bVar.a();
            }

            @Override // io.reactivex.rxjava3.core.G
            public final void onError(Throwable th2) {
                this.f404343c.dispose();
                this.f404342b.onError(th2);
            }

            @Override // io.reactivex.rxjava3.core.G
            public final void onNext(U u12) {
                this.f404342b.onNext(u12);
            }
        }

        public b(io.reactivex.rxjava3.observers.m mVar, l41.o oVar, int i12) {
            this.f404332b = mVar;
            this.f404333c = oVar;
            this.f404335e = i12;
            this.f404334d = new a<>(mVar, this);
        }

        public final void a() {
            if (getAndIncrement() != 0) {
                return;
            }
            while (!this.f404339i) {
                if (!this.f404338h) {
                    boolean z12 = this.f404340j;
                    try {
                        T tPoll = this.f404336f.poll();
                        boolean z13 = tPoll == null;
                        if (z12 && z13) {
                            this.f404339i = true;
                            this.f404332b.e();
                            return;
                        }
                        if (!z13) {
                            try {
                                io.reactivex.rxjava3.core.E<? extends U> eApply = this.f404333c.apply(tPoll);
                                Objects.requireNonNull(eApply, "The mapper returned a null ObservableSource");
                                io.reactivex.rxjava3.core.E<? extends U> e12 = eApply;
                                this.f404338h = true;
                                e12.c(this.f404334d);
                            } catch (Throwable th2) {
                                io.reactivex.rxjava3.exceptions.a.a(th2);
                                dispose();
                                this.f404336f.clear();
                                this.f404332b.onError(th2);
                                return;
                            }
                        }
                    } catch (Throwable th3) {
                        io.reactivex.rxjava3.exceptions.a.a(th3);
                        dispose();
                        this.f404336f.clear();
                        this.f404332b.onError(th3);
                        return;
                    }
                }
                if (decrementAndGet() == 0) {
                    return;
                }
            }
            this.f404336f.clear();
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void b(io.reactivex.rxjava3.disposables.d dVar) {
            if (DisposableHelper.f(this.f404337g, dVar)) {
                this.f404337g = dVar;
                if (dVar instanceof InterfaceC47199b) {
                    InterfaceC47199b interfaceC47199b = (InterfaceC47199b) dVar;
                    int iV2 = interfaceC47199b.v(3);
                    if (iV2 == 1) {
                        this.f404341k = iV2;
                        this.f404336f = interfaceC47199b;
                        this.f404340j = true;
                        this.f404332b.b(this);
                        a();
                        return;
                    }
                    if (iV2 == 2) {
                        this.f404341k = iV2;
                        this.f404336f = interfaceC47199b;
                        this.f404332b.b(this);
                        return;
                    }
                }
                this.f404336f = new q41.i(this.f404335e);
                this.f404332b.b(this);
            }
        }

        @Override // io.reactivex.rxjava3.disposables.d
        public final void dispose() {
            this.f404339i = true;
            a<U> aVar = this.f404334d;
            aVar.getClass();
            DisposableHelper.a(aVar);
            this.f404337g.dispose();
            if (getAndIncrement() == 0) {
                this.f404336f.clear();
            }
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void e() {
            if (this.f404340j) {
                return;
            }
            this.f404340j = true;
            a();
        }

        @Override // io.reactivex.rxjava3.disposables.d
        /* renamed from: i */
        public final boolean getF318621e() {
            return this.f404339i;
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void onError(Throwable th2) {
            if (this.f404340j) {
                C47998a.b(th2);
                return;
            }
            this.f404340j = true;
            dispose();
            this.f404332b.onError(th2);
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void onNext(T t12) {
            if (this.f404340j) {
                return;
            }
            if (this.f404341k == 0) {
                this.f404336f.offer(t12);
            }
            a();
        }
    }

    public C41991u(io.reactivex.rxjava3.core.z zVar, l41.o oVar, int i12, ErrorMode errorMode) {
        super(zVar);
        this.f404315c = oVar;
        this.f404317e = errorMode;
        this.f404316d = Math.max(8, i12);
    }

    @Override // io.reactivex.rxjava3.core.z
    public final void w0(io.reactivex.rxjava3.core.G<? super U> g12) {
        io.reactivex.rxjava3.core.E<T> e12 = this.f403951b;
        l41.o<? super T, ? extends io.reactivex.rxjava3.core.E<? extends U>> oVar = this.f404315c;
        if (C41943d1.b(e12, g12, oVar)) {
            return;
        }
        ErrorMode errorMode = ErrorMode.f404819b;
        int i12 = this.f404316d;
        ErrorMode errorMode2 = this.f404317e;
        if (errorMode2 == errorMode) {
            e12.c(new b(new io.reactivex.rxjava3.observers.m(g12), oVar, i12));
        } else {
            e12.c(new a(g12, oVar, i12, errorMode2 == ErrorMode.f404821d));
        }
    }
}
