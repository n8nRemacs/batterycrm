package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.operators.observable.E1;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import s41.C47998a;

/* compiled from: ObservableTimeout.java */
/* loaded from: classes8.dex */
public final class D1<T, U, V> extends AbstractC41932a<T, T> {

    /* compiled from: ObservableTimeout.java */
    public static final class a extends AtomicReference<io.reactivex.rxjava3.disposables.d> implements io.reactivex.rxjava3.core.G<Object>, io.reactivex.rxjava3.disposables.d {
        private static final long serialVersionUID = 8708641127342403073L;

        @Override // io.reactivex.rxjava3.core.G
        public final void b(io.reactivex.rxjava3.disposables.d dVar) {
            DisposableHelper.e(this, dVar);
        }

        @Override // io.reactivex.rxjava3.disposables.d
        public final void dispose() {
            DisposableHelper.a(this);
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void e() {
            Object obj = get();
            DisposableHelper disposableHelper = DisposableHelper.f401986b;
            if (obj == disposableHelper) {
                return;
            }
            lazySet(disposableHelper);
            throw null;
        }

        @Override // io.reactivex.rxjava3.disposables.d
        /* renamed from: i */
        public final boolean getF318621e() {
            return DisposableHelper.b(get());
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void onError(Throwable th2) {
            Object obj = get();
            DisposableHelper disposableHelper = DisposableHelper.f401986b;
            if (obj == disposableHelper) {
                C47998a.b(th2);
            } else {
                lazySet(disposableHelper);
                throw null;
            }
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void onNext(Object obj) {
            io.reactivex.rxjava3.disposables.d dVar = (io.reactivex.rxjava3.disposables.d) get();
            DisposableHelper disposableHelper = DisposableHelper.f401986b;
            if (dVar == disposableHelper) {
                return;
            }
            dVar.dispose();
            lazySet(disposableHelper);
            throw null;
        }
    }

    /* compiled from: ObservableTimeout.java */
    public static final class b<T> extends AtomicReference<io.reactivex.rxjava3.disposables.d> implements io.reactivex.rxjava3.core.G<T>, io.reactivex.rxjava3.disposables.d, d {
        private static final long serialVersionUID = -7508389464265974549L;

        public b() {
            throw null;
        }

        @Override // io.reactivex.rxjava3.internal.operators.observable.D1.d
        public final void a(long j12, Throwable th2) {
            throw null;
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void b(io.reactivex.rxjava3.disposables.d dVar) {
            DisposableHelper.e(null, dVar);
        }

        @Override // io.reactivex.rxjava3.internal.operators.observable.E1.d
        public final void c(long j12) {
            throw null;
        }

        @Override // io.reactivex.rxjava3.disposables.d
        public final void dispose() {
            DisposableHelper.a(null);
            throw null;
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void e() {
            throw null;
        }

        @Override // io.reactivex.rxjava3.disposables.d
        /* renamed from: i */
        public final boolean getF318621e() {
            return DisposableHelper.b(get());
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void onError(Throwable th2) {
            throw null;
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void onNext(T t12) {
            throw null;
        }
    }

    /* compiled from: ObservableTimeout.java */
    public static final class c<T> extends AtomicLong implements io.reactivex.rxjava3.core.G<T>, io.reactivex.rxjava3.disposables.d, d {
        private static final long serialVersionUID = 3764492702657003550L;

        /* renamed from: b, reason: collision with root package name */
        public final io.reactivex.rxjava3.core.G<? super T> f403548b;

        /* renamed from: c, reason: collision with root package name */
        public final m41.d f403549c = new m41.d();

        /* renamed from: d, reason: collision with root package name */
        public final AtomicReference<io.reactivex.rxjava3.disposables.d> f403550d = new AtomicReference<>();

        public c(io.reactivex.rxjava3.core.G g12) {
            this.f403548b = g12;
        }

        @Override // io.reactivex.rxjava3.internal.operators.observable.D1.d
        public final void a(long j12, Throwable th2) {
            if (!compareAndSet(j12, Long.MAX_VALUE)) {
                C47998a.b(th2);
            } else {
                DisposableHelper.a(this.f403550d);
                this.f403548b.onError(th2);
            }
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void b(io.reactivex.rxjava3.disposables.d dVar) {
            DisposableHelper.e(this.f403550d, dVar);
        }

        @Override // io.reactivex.rxjava3.internal.operators.observable.E1.d
        public final void c(long j12) {
            if (compareAndSet(j12, Long.MAX_VALUE)) {
                DisposableHelper.a(this.f403550d);
                this.f403548b.onError(new TimeoutException());
            }
        }

        @Override // io.reactivex.rxjava3.disposables.d
        public final void dispose() {
            DisposableHelper.a(this.f403550d);
            m41.d dVar = this.f403549c;
            dVar.getClass();
            DisposableHelper.a(dVar);
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void e() {
            if (getAndSet(Long.MAX_VALUE) != Long.MAX_VALUE) {
                m41.d dVar = this.f403549c;
                dVar.getClass();
                DisposableHelper.a(dVar);
                this.f403548b.e();
            }
        }

        @Override // io.reactivex.rxjava3.disposables.d
        /* renamed from: i */
        public final boolean getF318621e() {
            return DisposableHelper.b(this.f403550d.get());
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void onError(Throwable th2) {
            if (getAndSet(Long.MAX_VALUE) == Long.MAX_VALUE) {
                C47998a.b(th2);
                return;
            }
            m41.d dVar = this.f403549c;
            dVar.getClass();
            DisposableHelper.a(dVar);
            this.f403548b.onError(th2);
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void onNext(T t12) {
            long j12 = get();
            if (j12 == Long.MAX_VALUE || !compareAndSet(j12, 1 + j12)) {
                return;
            }
            io.reactivex.rxjava3.disposables.d dVar = this.f403549c.get();
            if (dVar != null) {
                dVar.dispose();
            }
            io.reactivex.rxjava3.core.G<? super T> g12 = this.f403548b;
            g12.onNext(t12);
            try {
                throw null;
            } catch (Throwable th2) {
                io.reactivex.rxjava3.exceptions.a.a(th2);
                this.f403550d.get().dispose();
                getAndSet(Long.MAX_VALUE);
                g12.onError(th2);
            }
        }
    }

    /* compiled from: ObservableTimeout.java */
    public interface d extends E1.d {
        void a(long j12, Throwable th2);
    }

    @Override // io.reactivex.rxjava3.core.z
    public final void w0(io.reactivex.rxjava3.core.G<? super T> g12) {
        c cVar = new c(g12);
        g12.b(cVar);
        this.f403951b.c(cVar);
    }
}
