package io.reactivex.rxjava3.internal.operators.single;

import io.reactivex.rxjava3.exceptions.CompositeException;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: SingleFlatMapNotification.java */
/* loaded from: classes8.dex */
public final class E<T, R> extends io.reactivex.rxjava3.core.I<R> {

    /* compiled from: SingleFlatMapNotification.java */
    public static final class a<T, R> extends AtomicReference<io.reactivex.rxjava3.disposables.d> implements io.reactivex.rxjava3.core.L<T>, io.reactivex.rxjava3.disposables.d {
        private static final long serialVersionUID = 4375739915521278546L;

        /* renamed from: b, reason: collision with root package name */
        public final io.reactivex.rxjava3.core.L<? super R> f404498b;

        /* renamed from: c, reason: collision with root package name */
        public io.reactivex.rxjava3.disposables.d f404499c;

        /* compiled from: SingleFlatMapNotification.java */
        /* renamed from: io.reactivex.rxjava3.internal.operators.single.E$a$a, reason: collision with other inner class name */
        public final class C11509a implements io.reactivex.rxjava3.core.L<R> {
            @Override // io.reactivex.rxjava3.core.L
            public final void b(io.reactivex.rxjava3.disposables.d dVar) {
                DisposableHelper.e(null, dVar);
            }

            @Override // io.reactivex.rxjava3.core.L
            public final void onError(Throwable th2) {
                throw null;
            }

            @Override // io.reactivex.rxjava3.core.L
            public final void onSuccess(R r12) {
                throw null;
            }
        }

        public a(io.reactivex.rxjava3.core.L l12) {
            this.f404498b = l12;
        }

        @Override // io.reactivex.rxjava3.core.L
        public final void b(io.reactivex.rxjava3.disposables.d dVar) {
            if (DisposableHelper.f(this.f404499c, dVar)) {
                this.f404499c = dVar;
                this.f404498b.b(this);
            }
        }

        @Override // io.reactivex.rxjava3.disposables.d
        public final void dispose() {
            DisposableHelper.a(this);
            this.f404499c.dispose();
        }

        @Override // io.reactivex.rxjava3.disposables.d
        /* renamed from: i */
        public final boolean getF318621e() {
            return DisposableHelper.b(get());
        }

        @Override // io.reactivex.rxjava3.core.L
        public final void onError(Throwable th2) {
            try {
                throw null;
            } catch (Throwable th3) {
                io.reactivex.rxjava3.exceptions.a.a(th3);
                this.f404498b.onError(new CompositeException(th2, th3));
            }
        }

        @Override // io.reactivex.rxjava3.core.L
        public final void onSuccess(T t12) {
            try {
                throw null;
            } catch (Throwable th2) {
                io.reactivex.rxjava3.exceptions.a.a(th2);
                this.f404498b.onError(th2);
            }
        }
    }

    @Override // io.reactivex.rxjava3.core.I
    public final void y(io.reactivex.rxjava3.core.L<? super R> l12) {
        new a(l12);
        throw null;
    }
}
