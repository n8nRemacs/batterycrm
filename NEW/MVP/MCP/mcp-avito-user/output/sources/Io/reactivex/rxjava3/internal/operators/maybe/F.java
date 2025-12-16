package io.reactivex.rxjava3.internal.operators.maybe;

import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.observers.AbstractC41806d;
import java.util.Iterator;
import java.util.Objects;

/* compiled from: MaybeFlatMapIterableObservable.java */
/* loaded from: classes8.dex */
public final class F<T, R> extends io.reactivex.rxjava3.core.z<R> {

    /* compiled from: MaybeFlatMapIterableObservable.java */
    public static final class a<T, R> extends AbstractC41806d<R> implements io.reactivex.rxjava3.core.t<T> {

        /* renamed from: b, reason: collision with root package name */
        public final io.reactivex.rxjava3.core.G<? super R> f403147b;

        /* renamed from: c, reason: collision with root package name */
        public io.reactivex.rxjava3.disposables.d f403148c;

        /* renamed from: d, reason: collision with root package name */
        public volatile Iterator<? extends R> f403149d;

        /* renamed from: e, reason: collision with root package name */
        public volatile boolean f403150e;

        public a(io.reactivex.rxjava3.core.G g12) {
            this.f403147b = g12;
        }

        @Override // io.reactivex.rxjava3.core.t
        public final void b(io.reactivex.rxjava3.disposables.d dVar) {
            if (DisposableHelper.f(this.f403148c, dVar)) {
                this.f403148c = dVar;
                this.f403147b.b(this);
            }
        }

        @Override // q41.g
        public final void clear() {
            this.f403149d = null;
        }

        @Override // io.reactivex.rxjava3.disposables.d
        public final void dispose() {
            this.f403150e = true;
            this.f403148c.dispose();
            this.f403148c = DisposableHelper.f401986b;
        }

        @Override // io.reactivex.rxjava3.core.t
        public final void e() {
            this.f403147b.e();
        }

        @Override // io.reactivex.rxjava3.disposables.d
        /* renamed from: i */
        public final boolean getF318621e() {
            return this.f403150e;
        }

        @Override // q41.g
        public final boolean isEmpty() {
            return this.f403149d == null;
        }

        @Override // io.reactivex.rxjava3.core.t
        public final void onError(Throwable th2) {
            this.f403148c = DisposableHelper.f401986b;
            this.f403147b.onError(th2);
        }

        @Override // io.reactivex.rxjava3.core.t
        public final void onSuccess(T t12) {
            try {
                throw null;
            } catch (Throwable th2) {
                io.reactivex.rxjava3.exceptions.a.a(th2);
                this.f403147b.onError(th2);
            }
        }

        @Override // q41.g
        @j41.f
        public final R poll() {
            Iterator<? extends R> it = this.f403149d;
            if (it == null) {
                return null;
            }
            R next = it.next();
            Objects.requireNonNull(next, "The iterator returned a null value");
            if (!it.hasNext()) {
                this.f403149d = null;
            }
            return next;
        }

        @Override // q41.InterfaceC47200c
        public final int v(int i12) {
            return 2;
        }
    }

    @Override // io.reactivex.rxjava3.core.z
    public final void w0(io.reactivex.rxjava3.core.G<? super R> g12) {
        new a(g12);
        throw null;
    }
}
