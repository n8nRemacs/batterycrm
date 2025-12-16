package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: ObservableWindow.java */
/* loaded from: classes8.dex */
public final class K1<T> extends AbstractC41932a<T, io.reactivex.rxjava3.core.z<T>> {

    /* compiled from: ObservableWindow.java */
    public static final class a<T> extends AtomicInteger implements io.reactivex.rxjava3.core.G<T>, io.reactivex.rxjava3.disposables.d, Runnable {
        private static final long serialVersionUID = -7481782523886138128L;

        /* renamed from: b, reason: collision with root package name */
        public final io.reactivex.rxjava3.core.G<? super io.reactivex.rxjava3.core.z<T>> f403689b;

        /* renamed from: c, reason: collision with root package name */
        public final AtomicBoolean f403690c = new AtomicBoolean();

        /* renamed from: d, reason: collision with root package name */
        public long f403691d;

        /* renamed from: e, reason: collision with root package name */
        public io.reactivex.rxjava3.disposables.d f403692e;

        /* renamed from: f, reason: collision with root package name */
        public io.reactivex.rxjava3.subjects.j<T> f403693f;

        public a(io.reactivex.rxjava3.core.G g12) {
            this.f403689b = g12;
            lazySet(1);
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void b(io.reactivex.rxjava3.disposables.d dVar) {
            if (DisposableHelper.f(this.f403692e, dVar)) {
                this.f403692e = dVar;
                this.f403689b.b(this);
            }
        }

        @Override // io.reactivex.rxjava3.disposables.d
        public final void dispose() {
            if (this.f403690c.compareAndSet(false, true)) {
                run();
            }
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void e() {
            io.reactivex.rxjava3.subjects.j<T> jVar = this.f403693f;
            if (jVar != null) {
                this.f403693f = null;
                jVar.e();
            }
            this.f403689b.e();
        }

        @Override // io.reactivex.rxjava3.disposables.d
        /* renamed from: i */
        public final boolean getF318621e() {
            return this.f403690c.get();
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void onError(Throwable th2) {
            io.reactivex.rxjava3.subjects.j<T> jVar = this.f403693f;
            if (jVar != null) {
                this.f403693f = null;
                jVar.onError(th2);
            }
            this.f403689b.onError(th2);
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void onNext(T t12) {
            N1 n12;
            io.reactivex.rxjava3.subjects.j<T> jVarN0 = this.f403693f;
            if (jVarN0 != null || this.f403690c.get()) {
                n12 = null;
            } else {
                getAndIncrement();
                jVarN0 = io.reactivex.rxjava3.subjects.j.N0(this);
                this.f403693f = jVarN0;
                n12 = new N1(jVarN0);
                this.f403689b.onNext(n12);
            }
            if (jVarN0 != null) {
                jVarN0.onNext(t12);
                long j12 = this.f403691d + 1;
                this.f403691d = j12;
                if (j12 >= 0) {
                    this.f403691d = 0L;
                    this.f403693f = null;
                    jVarN0.e();
                }
                if (n12 == null || !n12.M0()) {
                    return;
                }
                this.f403693f = null;
                jVarN0.e();
            }
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (decrementAndGet() == 0) {
                this.f403692e.dispose();
            }
        }
    }

    /* compiled from: ObservableWindow.java */
    public static final class b<T> extends AtomicInteger implements io.reactivex.rxjava3.core.G<T>, io.reactivex.rxjava3.disposables.d, Runnable {
        private static final long serialVersionUID = 3366976432059579510L;

        /* renamed from: b, reason: collision with root package name */
        public io.reactivex.rxjava3.disposables.d f403694b;

        public b() {
            throw null;
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void b(io.reactivex.rxjava3.disposables.d dVar) {
            if (DisposableHelper.f(this.f403694b, dVar)) {
                this.f403694b = dVar;
                throw null;
            }
        }

        @Override // io.reactivex.rxjava3.disposables.d
        public final void dispose() {
            throw null;
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void e() {
            throw null;
        }

        @Override // io.reactivex.rxjava3.disposables.d
        /* renamed from: i */
        public final boolean getF318621e() {
            throw null;
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void onError(Throwable th2) {
            throw null;
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void onNext(T t12) {
            if (0 % 0 != 0) {
                throw null;
            }
            throw null;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (decrementAndGet() == 0) {
                this.f403694b.dispose();
            }
        }
    }

    @Override // io.reactivex.rxjava3.core.z
    public final void w0(io.reactivex.rxjava3.core.G<? super io.reactivex.rxjava3.core.z<T>> g12) {
        this.f403951b.c(new a(g12));
    }
}
