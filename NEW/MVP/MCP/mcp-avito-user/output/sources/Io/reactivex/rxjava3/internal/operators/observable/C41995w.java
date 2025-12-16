package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import q41.InterfaceC47199b;
import s41.C47998a;

/* compiled from: ObservableConcatMapScheduler.java */
/* renamed from: io.reactivex.rxjava3.internal.operators.observable.w, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41995w<T, U> extends AbstractC41932a<T, U> {

    /* compiled from: ObservableConcatMapScheduler.java */
    /* renamed from: io.reactivex.rxjava3.internal.operators.observable.w$a */
    public static final class a<T, R> extends AtomicInteger implements io.reactivex.rxjava3.core.G<T>, io.reactivex.rxjava3.disposables.d, Runnable {
        private static final long serialVersionUID = -6951100001833242599L;

        /* renamed from: b, reason: collision with root package name */
        public q41.g<T> f404374b;

        /* renamed from: c, reason: collision with root package name */
        public io.reactivex.rxjava3.disposables.d f404375c;

        /* renamed from: d, reason: collision with root package name */
        public volatile boolean f404376d;

        /* renamed from: e, reason: collision with root package name */
        public int f404377e;

        /* compiled from: ObservableConcatMapScheduler.java */
        /* renamed from: io.reactivex.rxjava3.internal.operators.observable.w$a$a, reason: collision with other inner class name */
        public static final class C11504a<R> extends AtomicReference<io.reactivex.rxjava3.disposables.d> implements io.reactivex.rxjava3.core.G<R> {
            private static final long serialVersionUID = 2620149119579502636L;

            public C11504a() {
                throw null;
            }

            @Override // io.reactivex.rxjava3.core.G
            public final void b(io.reactivex.rxjava3.disposables.d dVar) {
                DisposableHelper.c(this, dVar);
            }

            @Override // io.reactivex.rxjava3.core.G
            public final void e() {
                throw null;
            }

            @Override // io.reactivex.rxjava3.core.G
            public final void onError(Throwable th2) {
                throw null;
            }

            @Override // io.reactivex.rxjava3.core.G
            public final void onNext(R r12) {
                throw null;
            }
        }

        public a() {
            throw null;
        }

        public final void a() {
            if (getAndIncrement() == 0) {
                throw null;
            }
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void b(io.reactivex.rxjava3.disposables.d dVar) {
            if (DisposableHelper.f(this.f404375c, dVar)) {
                this.f404375c = dVar;
                if (dVar instanceof InterfaceC47199b) {
                    InterfaceC47199b interfaceC47199b = (InterfaceC47199b) dVar;
                    int iV2 = interfaceC47199b.v(3);
                    if (iV2 == 1) {
                        this.f404377e = iV2;
                        this.f404374b = interfaceC47199b;
                        throw null;
                    }
                    if (iV2 == 2) {
                        this.f404377e = iV2;
                        this.f404374b = interfaceC47199b;
                        throw null;
                    }
                }
                this.f404374b = new q41.i(0);
                throw null;
            }
        }

        @Override // io.reactivex.rxjava3.disposables.d
        public final void dispose() {
            this.f404376d = true;
            this.f404375c.dispose();
            throw null;
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void e() {
            a();
        }

        @Override // io.reactivex.rxjava3.disposables.d
        /* renamed from: i */
        public final boolean getF318621e() {
            return this.f404376d;
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void onError(Throwable th2) {
            throw null;
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void onNext(T t12) {
            if (this.f404377e == 0) {
                this.f404374b.offer(t12);
            }
            a();
        }

        @Override // java.lang.Runnable
        public final void run() {
            q41.g<T> gVar = this.f404374b;
            if (!this.f404376d) {
                throw null;
            }
            gVar.clear();
        }
    }

    /* compiled from: ObservableConcatMapScheduler.java */
    /* renamed from: io.reactivex.rxjava3.internal.operators.observable.w$b */
    public static final class b<T, U> extends AtomicInteger implements io.reactivex.rxjava3.core.G<T>, io.reactivex.rxjava3.disposables.d, Runnable {
        private static final long serialVersionUID = 8828587559905699186L;

        /* renamed from: b, reason: collision with root package name */
        public q41.g<T> f404378b;

        /* renamed from: c, reason: collision with root package name */
        public io.reactivex.rxjava3.disposables.d f404379c;

        /* renamed from: d, reason: collision with root package name */
        public volatile boolean f404380d;

        /* renamed from: e, reason: collision with root package name */
        public volatile boolean f404381e;

        /* renamed from: f, reason: collision with root package name */
        public int f404382f;

        /* compiled from: ObservableConcatMapScheduler.java */
        /* renamed from: io.reactivex.rxjava3.internal.operators.observable.w$b$a */
        public static final class a<U> extends AtomicReference<io.reactivex.rxjava3.disposables.d> implements io.reactivex.rxjava3.core.G<U> {
            private static final long serialVersionUID = -7449079488798789337L;

            public a() {
                throw null;
            }

            @Override // io.reactivex.rxjava3.core.G
            public final void b(io.reactivex.rxjava3.disposables.d dVar) {
                DisposableHelper.c(this, dVar);
            }

            @Override // io.reactivex.rxjava3.core.G
            public final void e() {
                throw null;
            }

            @Override // io.reactivex.rxjava3.core.G
            public final void onError(Throwable th2) {
                throw null;
            }

            @Override // io.reactivex.rxjava3.core.G
            public final void onNext(U u12) {
                throw null;
            }
        }

        public b() {
            throw null;
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void b(io.reactivex.rxjava3.disposables.d dVar) {
            if (DisposableHelper.f(this.f404379c, dVar)) {
                this.f404379c = dVar;
                if (dVar instanceof InterfaceC47199b) {
                    InterfaceC47199b interfaceC47199b = (InterfaceC47199b) dVar;
                    int iV2 = interfaceC47199b.v(3);
                    if (iV2 == 1) {
                        this.f404382f = iV2;
                        this.f404378b = interfaceC47199b;
                        this.f404381e = true;
                        throw null;
                    }
                    if (iV2 == 2) {
                        this.f404382f = iV2;
                        this.f404378b = interfaceC47199b;
                        throw null;
                    }
                }
                this.f404378b = new q41.i(0);
                throw null;
            }
        }

        @Override // io.reactivex.rxjava3.disposables.d
        public final void dispose() {
            this.f404380d = true;
            throw null;
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void e() {
            if (this.f404381e) {
                return;
            }
            this.f404381e = true;
            if (getAndIncrement() == 0) {
                throw null;
            }
        }

        @Override // io.reactivex.rxjava3.disposables.d
        /* renamed from: i */
        public final boolean getF318621e() {
            return this.f404380d;
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void onError(Throwable th2) {
            if (this.f404381e) {
                C47998a.b(th2);
            } else {
                this.f404381e = true;
                this.f404380d = true;
                throw null;
            }
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void onNext(T t12) {
            if (this.f404381e) {
                return;
            }
            if (this.f404382f == 0) {
                this.f404378b.offer(t12);
            }
            if (getAndIncrement() == 0) {
                throw null;
            }
        }

        @Override // java.lang.Runnable
        public final void run() {
            while (!this.f404380d) {
                boolean z12 = this.f404381e;
                try {
                    boolean z13 = this.f404378b.poll() == null;
                    if (z12 && z13) {
                        this.f404380d = true;
                        throw null;
                    }
                    if (!z13) {
                        try {
                            throw null;
                        } finally {
                        }
                    } else if (decrementAndGet() == 0) {
                        return;
                    }
                } finally {
                }
            }
            this.f404378b.clear();
        }
    }

    @Override // io.reactivex.rxjava3.core.z
    public final void w0(io.reactivex.rxjava3.core.G<? super U> g12) {
        throw null;
    }
}
