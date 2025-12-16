package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: ObservableRepeatWhen.java */
/* loaded from: classes8.dex */
public final class W0<T> extends AbstractC41932a<T, T> {

    /* compiled from: ObservableRepeatWhen.java */
    public static final class a<T> extends AtomicInteger implements io.reactivex.rxjava3.core.G<T>, io.reactivex.rxjava3.disposables.d {
        private static final long serialVersionUID = 802743776666017014L;

        /* compiled from: ObservableRepeatWhen.java */
        /* renamed from: io.reactivex.rxjava3.internal.operators.observable.W0$a$a, reason: collision with other inner class name */
        public final class C11495a extends AtomicReference<io.reactivex.rxjava3.disposables.d> implements io.reactivex.rxjava3.core.G<Object> {
            private static final long serialVersionUID = 3254781284376480842L;

            @Override // io.reactivex.rxjava3.core.G
            public final void b(io.reactivex.rxjava3.disposables.d dVar) {
                DisposableHelper.e(this, dVar);
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
            public final void onNext(Object obj) {
                throw null;
            }
        }

        public a() {
            throw null;
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
            DisposableHelper.c(null, null);
            throw null;
        }

        @Override // io.reactivex.rxjava3.disposables.d
        /* renamed from: i */
        public final boolean getF318621e() {
            throw null;
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void onError(Throwable th2) {
            DisposableHelper.a(null);
            throw null;
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void onNext(T t12) {
            io.reactivex.rxjava3.internal.util.i.e(null, t12, this, null);
        }
    }

    @Override // io.reactivex.rxjava3.core.z
    public final void w0(io.reactivex.rxjava3.core.G<? super T> g12) {
        new io.reactivex.rxjava3.subjects.e().M0();
        try {
            throw null;
        } catch (Throwable th2) {
            io.reactivex.rxjava3.exceptions.a.a(th2);
            EmptyDisposable.d(th2, g12);
        }
    }
}
