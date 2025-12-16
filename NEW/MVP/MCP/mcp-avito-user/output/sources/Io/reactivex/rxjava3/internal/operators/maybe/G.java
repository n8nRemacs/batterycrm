package io.reactivex.rxjava3.internal.operators.maybe;

import io.reactivex.rxjava3.exceptions.CompositeException;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: MaybeFlatMapNotification.java */
/* loaded from: classes8.dex */
public final class G<T, R> extends AbstractC41907a<T, R> {

    /* compiled from: MaybeFlatMapNotification.java */
    public static final class a<T, R> extends AtomicReference<io.reactivex.rxjava3.disposables.d> implements io.reactivex.rxjava3.core.t<T>, io.reactivex.rxjava3.disposables.d {
        private static final long serialVersionUID = 4375739915521278546L;

        /* renamed from: b, reason: collision with root package name */
        public final io.reactivex.rxjava3.core.t<? super R> f403151b;

        /* renamed from: c, reason: collision with root package name */
        public io.reactivex.rxjava3.disposables.d f403152c;

        /* compiled from: MaybeFlatMapNotification.java */
        /* renamed from: io.reactivex.rxjava3.internal.operators.maybe.G$a$a, reason: collision with other inner class name */
        public final class C11467a implements io.reactivex.rxjava3.core.t<R> {
            @Override // io.reactivex.rxjava3.core.t
            public final void b(io.reactivex.rxjava3.disposables.d dVar) {
                DisposableHelper.e(null, dVar);
            }

            @Override // io.reactivex.rxjava3.core.t
            public final void e() {
                throw null;
            }

            @Override // io.reactivex.rxjava3.core.t
            public final void onError(Throwable th2) {
                throw null;
            }

            @Override // io.reactivex.rxjava3.core.t
            public final void onSuccess(R r12) {
                throw null;
            }
        }

        public a(io.reactivex.rxjava3.core.t tVar) {
            this.f403151b = tVar;
        }

        @Override // io.reactivex.rxjava3.core.t
        public final void b(io.reactivex.rxjava3.disposables.d dVar) {
            if (DisposableHelper.f(this.f403152c, dVar)) {
                this.f403152c = dVar;
                this.f403151b.b(this);
            }
        }

        @Override // io.reactivex.rxjava3.disposables.d
        public final void dispose() {
            DisposableHelper.a(this);
            this.f403152c.dispose();
        }

        @Override // io.reactivex.rxjava3.core.t
        public final void e() {
            try {
                throw null;
            } catch (Throwable th2) {
                io.reactivex.rxjava3.exceptions.a.a(th2);
                this.f403151b.onError(th2);
            }
        }

        @Override // io.reactivex.rxjava3.disposables.d
        /* renamed from: i */
        public final boolean getF318621e() {
            return DisposableHelper.b(get());
        }

        @Override // io.reactivex.rxjava3.core.t
        public final void onError(Throwable th2) {
            try {
                throw null;
            } catch (Throwable th3) {
                io.reactivex.rxjava3.exceptions.a.a(th3);
                this.f403151b.onError(new CompositeException(th2, th3));
            }
        }

        @Override // io.reactivex.rxjava3.core.t
        public final void onSuccess(T t12) {
            try {
                throw null;
            } catch (Throwable th2) {
                io.reactivex.rxjava3.exceptions.a.a(th2);
                this.f403151b.onError(th2);
            }
        }
    }

    @Override // io.reactivex.rxjava3.core.q
    public final void o(io.reactivex.rxjava3.core.t<? super R> tVar) {
        this.f403189b.a(new a(tVar));
    }
}
