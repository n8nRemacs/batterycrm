package hu.akarnokd.rxjava3.subjects;

import io.reactivex.rxjava3.core.G;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.util.h;
import io.reactivex.rxjava3.subjects.i;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: UnicastWorkSubject.java */
/* loaded from: classes8.dex */
public final class d<T> extends i<T> implements io.reactivex.rxjava3.disposables.d {

    /* compiled from: UnicastWorkSubject.java */
    public final class a extends AtomicBoolean implements io.reactivex.rxjava3.disposables.d {
        private static final long serialVersionUID = -3574708954225968389L;

        /* renamed from: b, reason: collision with root package name */
        public final G<? super T> f398279b;

        public a(G<? super T> g12) {
            this.f398279b = g12;
        }

        @Override // io.reactivex.rxjava3.disposables.d
        public final void dispose() {
            if (compareAndSet(false, true)) {
                d.this.getClass();
                throw null;
            }
        }

        @Override // io.reactivex.rxjava3.disposables.d
        /* renamed from: i */
        public final boolean getF318621e() {
            return get();
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
        Objects.requireNonNull(t12, "t is null");
        throw null;
    }

    @Override // io.reactivex.rxjava3.core.z
    public final void w0(G<? super T> g12) {
        g12.b(new a(g12));
        throw null;
    }
}
