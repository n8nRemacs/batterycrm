package hu.akarnokd.rxjava3.subjects;

import io.reactivex.rxjava3.core.G;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.util.h;
import io.reactivex.rxjava3.subjects.i;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: DispatchWorkSubject.java */
/* loaded from: classes8.dex */
public final class a<T> extends i<T> implements io.reactivex.rxjava3.disposables.d {

    /* compiled from: DispatchWorkSubject.java */
    /* renamed from: hu.akarnokd.rxjava3.subjects.a$a, reason: collision with other inner class name */
    public static final class RunnableC11357a<T> extends AtomicInteger implements io.reactivex.rxjava3.disposables.d, Runnable {
        private static final long serialVersionUID = 7597704795244221647L;

        /* renamed from: b, reason: collision with root package name */
        public volatile boolean f398275b;

        public RunnableC11357a() {
            throw null;
        }

        @Override // io.reactivex.rxjava3.disposables.d
        public final void dispose() {
            this.f398275b = true;
            throw null;
        }

        @Override // io.reactivex.rxjava3.disposables.d
        /* renamed from: i */
        public final boolean getF318621e() {
            return this.f398275b;
        }

        @Override // java.lang.Runnable
        public final void run() {
            throw null;
        }
    }

    @Override // io.reactivex.rxjava3.core.G
    public final void b(io.reactivex.rxjava3.disposables.d dVar) {
        DisposableHelper.e(null, dVar);
    }

    @Override // io.reactivex.rxjava3.disposables.d
    public final void dispose() {
        DisposableHelper.a(null);
        throw null;
    }

    @Override // io.reactivex.rxjava3.core.G
    public final void e() {
        Throwable th2 = h.f404834a;
        throw null;
    }

    @Override // io.reactivex.rxjava3.disposables.d
    /* renamed from: i */
    public final boolean getF318621e() {
        throw null;
    }

    @Override // io.reactivex.rxjava3.core.G
    public final void onError(Throwable th2) {
        Objects.requireNonNull(th2, "e is null");
        throw null;
    }

    @Override // io.reactivex.rxjava3.core.G
    public final void onNext(T t12) {
        throw null;
    }

    @Override // io.reactivex.rxjava3.core.z
    public final void w0(G<? super T> g12) {
        throw null;
    }
}
