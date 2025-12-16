package io.reactivex.rxjava3.internal.operators.single;

import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: SingleFlatMapBiSelector.java */
/* renamed from: io.reactivex.rxjava3.internal.operators.single.z, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C42027z<T, U, R> extends io.reactivex.rxjava3.core.I<R> {

    /* compiled from: SingleFlatMapBiSelector.java */
    /* renamed from: io.reactivex.rxjava3.internal.operators.single.z$a */
    public static final class a<T, U, R> implements io.reactivex.rxjava3.core.L<T>, io.reactivex.rxjava3.disposables.d {

        /* renamed from: b, reason: collision with root package name */
        public final C11514a<T, U, R> f404657b;

        /* compiled from: SingleFlatMapBiSelector.java */
        /* renamed from: io.reactivex.rxjava3.internal.operators.single.z$a$a, reason: collision with other inner class name */
        public static final class C11514a<T, U, R> extends AtomicReference<io.reactivex.rxjava3.disposables.d> implements io.reactivex.rxjava3.core.L<U> {
            private static final long serialVersionUID = -2897979525538174559L;

            /* renamed from: b, reason: collision with root package name */
            public final io.reactivex.rxjava3.core.L<? super R> f404658b;

            /* renamed from: c, reason: collision with root package name */
            public T f404659c;

            public C11514a(io.reactivex.rxjava3.core.L l12) {
                this.f404658b = l12;
            }

            @Override // io.reactivex.rxjava3.core.L
            public final void b(io.reactivex.rxjava3.disposables.d dVar) {
                DisposableHelper.e(this, dVar);
            }

            @Override // io.reactivex.rxjava3.core.L
            public final void onError(Throwable th2) {
                this.f404658b.onError(th2);
            }

            @Override // io.reactivex.rxjava3.core.L
            public final void onSuccess(U u12) {
                try {
                    throw null;
                } catch (Throwable th2) {
                    io.reactivex.rxjava3.exceptions.a.a(th2);
                    this.f404658b.onError(th2);
                }
            }
        }

        public a(io.reactivex.rxjava3.core.L l12) {
            this.f404657b = new C11514a<>(l12);
        }

        @Override // io.reactivex.rxjava3.core.L
        public final void b(io.reactivex.rxjava3.disposables.d dVar) {
            C11514a<T, U, R> c11514a = this.f404657b;
            if (DisposableHelper.e(c11514a, dVar)) {
                c11514a.f404658b.b(this);
            }
        }

        @Override // io.reactivex.rxjava3.disposables.d
        public final void dispose() {
            DisposableHelper.a(this.f404657b);
        }

        @Override // io.reactivex.rxjava3.disposables.d
        /* renamed from: i */
        public final boolean getF318621e() {
            return DisposableHelper.b(this.f404657b.get());
        }

        @Override // io.reactivex.rxjava3.core.L
        public final void onError(Throwable th2) {
            this.f404657b.f404658b.onError(th2);
        }

        @Override // io.reactivex.rxjava3.core.L
        public final void onSuccess(T t12) {
            try {
                throw null;
            } catch (Throwable th2) {
                io.reactivex.rxjava3.exceptions.a.a(th2);
                this.f404657b.f404658b.onError(th2);
            }
        }
    }

    @Override // io.reactivex.rxjava3.core.I
    public final void y(io.reactivex.rxjava3.core.L<? super R> l12) {
        new a(l12);
        throw null;
    }
}
