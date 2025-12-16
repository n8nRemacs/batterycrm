package hu.akarnokd.rxjava3.operators;

import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: ObservableObserveOnLatest.java */
/* loaded from: classes8.dex */
final class k0<T> extends io.reactivex.rxjava3.core.z<T> implements io.reactivex.rxjava3.core.F<T, T> {

    /* compiled from: ObservableObserveOnLatest.java */
    public static final class a<T> extends AtomicInteger implements io.reactivex.rxjava3.core.G<T>, io.reactivex.rxjava3.disposables.d, Runnable {
        private static final long serialVersionUID = -11696478502477044L;

        /* renamed from: b, reason: collision with root package name */
        public io.reactivex.rxjava3.disposables.d f398069b;

        /* renamed from: c, reason: collision with root package name */
        public volatile boolean f398070c;

        /* renamed from: d, reason: collision with root package name */
        public volatile boolean f398071d;

        /* renamed from: e, reason: collision with root package name */
        public Throwable f398072e;

        @Override // io.reactivex.rxjava3.core.G
        public final void b(io.reactivex.rxjava3.disposables.d dVar) {
            if (DisposableHelper.f(this.f398069b, dVar)) {
                this.f398069b = dVar;
                throw null;
            }
        }

        @Override // io.reactivex.rxjava3.disposables.d
        public final void dispose() {
            this.f398070c = true;
            this.f398069b.dispose();
            throw null;
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void e() {
            this.f398071d = true;
            if (getAndIncrement() == 0) {
                throw null;
            }
        }

        @Override // io.reactivex.rxjava3.disposables.d
        /* renamed from: i */
        public final boolean getF318621e() {
            return this.f398070c;
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void onError(Throwable th2) {
            this.f398072e = th2;
            this.f398071d = true;
            if (getAndIncrement() == 0) {
                throw null;
            }
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void onNext(T t12) {
            throw null;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (!this.f398070c) {
                throw null;
            }
            throw null;
        }
    }

    @Override // io.reactivex.rxjava3.core.F
    public final io.reactivex.rxjava3.core.E<T> a(io.reactivex.rxjava3.core.z<T> zVar) {
        return new k0();
    }

    @Override // io.reactivex.rxjava3.core.z
    public final void w0(io.reactivex.rxjava3.core.G<? super T> g12) {
        throw null;
    }
}
