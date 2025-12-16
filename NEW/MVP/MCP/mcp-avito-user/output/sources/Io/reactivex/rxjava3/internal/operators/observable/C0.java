package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.exceptions.CompositeException;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;

/* compiled from: ObservableMapNotification.java */
/* loaded from: classes8.dex */
public final class C0<T, R> extends AbstractC41932a<T, io.reactivex.rxjava3.core.E<? extends R>> {

    /* compiled from: ObservableMapNotification.java */
    public static final class a<T, R> implements io.reactivex.rxjava3.core.G<T>, io.reactivex.rxjava3.disposables.d {

        /* renamed from: b, reason: collision with root package name */
        public final io.reactivex.rxjava3.core.G<? super io.reactivex.rxjava3.core.E<? extends R>> f403530b;

        /* renamed from: c, reason: collision with root package name */
        public io.reactivex.rxjava3.disposables.d f403531c;

        public a(io.reactivex.rxjava3.core.G g12) {
            this.f403530b = g12;
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void b(io.reactivex.rxjava3.disposables.d dVar) {
            if (DisposableHelper.f(this.f403531c, dVar)) {
                this.f403531c = dVar;
                this.f403530b.b(this);
            }
        }

        @Override // io.reactivex.rxjava3.disposables.d
        public final void dispose() {
            this.f403531c.dispose();
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void e() {
            try {
                throw null;
            } catch (Throwable th2) {
                io.reactivex.rxjava3.exceptions.a.a(th2);
                this.f403530b.onError(th2);
            }
        }

        @Override // io.reactivex.rxjava3.disposables.d
        /* renamed from: i */
        public final boolean getF318621e() {
            return this.f403531c.getF318621e();
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void onError(Throwable th2) {
            try {
                throw null;
            } catch (Throwable th3) {
                io.reactivex.rxjava3.exceptions.a.a(th3);
                this.f403530b.onError(new CompositeException(th2, th3));
            }
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void onNext(T t12) {
            try {
                throw null;
            } catch (Throwable th2) {
                io.reactivex.rxjava3.exceptions.a.a(th2);
                this.f403530b.onError(th2);
            }
        }
    }

    @Override // io.reactivex.rxjava3.core.z
    public final void w0(io.reactivex.rxjava3.core.G<? super io.reactivex.rxjava3.core.E<? extends R>> g12) {
        this.f403951b.c(new a(g12));
    }
}
