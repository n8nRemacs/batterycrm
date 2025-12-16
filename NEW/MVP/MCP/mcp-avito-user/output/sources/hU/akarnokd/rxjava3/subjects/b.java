package hu.akarnokd.rxjava3.subjects;

import io.reactivex.rxjava3.core.G;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.subjects.i;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: RefCountSubject.java */
/* loaded from: classes8.dex */
final class b<T> extends i<T> implements io.reactivex.rxjava3.disposables.d {

    /* compiled from: RefCountSubject.java */
    public static final class a<T> extends AtomicBoolean implements G<T>, io.reactivex.rxjava3.disposables.d {
        private static final long serialVersionUID = -4317488092687530631L;

        /* renamed from: b, reason: collision with root package name */
        public final G<? super T> f398276b;

        /* renamed from: c, reason: collision with root package name */
        public final b<T> f398277c;

        /* renamed from: d, reason: collision with root package name */
        public io.reactivex.rxjava3.disposables.d f398278d;

        public a(G<? super T> g12, b<T> bVar) {
            this.f398276b = g12;
            this.f398277c = bVar;
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void b(io.reactivex.rxjava3.disposables.d dVar) {
            this.f398278d = dVar;
            this.f398276b.b(this);
        }

        @Override // io.reactivex.rxjava3.disposables.d
        public final void dispose() {
            lazySet(true);
            this.f398278d.dispose();
            this.f398277c.getClass();
            throw null;
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void e() {
            this.f398276b.e();
        }

        @Override // io.reactivex.rxjava3.disposables.d
        public final boolean i() {
            return this.f398278d.i();
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void onError(Throwable th2) {
            this.f398276b.onError(th2);
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void onNext(T t12) {
            this.f398276b.onNext(t12);
        }
    }

    @Override // io.reactivex.rxjava3.core.G
    public final void b(io.reactivex.rxjava3.disposables.d dVar) {
        if (DisposableHelper.e(null, dVar)) {
            throw null;
        }
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
    public final boolean i() {
        throw null;
    }

    @Override // io.reactivex.rxjava3.core.G
    public final void onError(Throwable th2) {
        throw null;
    }

    @Override // io.reactivex.rxjava3.core.G
    public final void onNext(T t12) {
        throw null;
    }

    @Override // io.reactivex.rxjava3.core.z
    public final void w0(G<? super T> g12) {
        new a(g12, this);
        throw null;
    }
}
