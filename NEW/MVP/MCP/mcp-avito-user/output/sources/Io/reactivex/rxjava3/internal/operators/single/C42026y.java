package io.reactivex.rxjava3.internal.operators.single;

import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: SingleFlatMap.java */
/* renamed from: io.reactivex.rxjava3.internal.operators.single.y, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C42026y<T, R> extends io.reactivex.rxjava3.core.I<R> {

    /* renamed from: b, reason: collision with root package name */
    public final io.reactivex.rxjava3.core.I f404651b;

    /* renamed from: c, reason: collision with root package name */
    public final l41.o<? super T, ? extends io.reactivex.rxjava3.core.O<? extends R>> f404652c;

    /* compiled from: SingleFlatMap.java */
    /* renamed from: io.reactivex.rxjava3.internal.operators.single.y$a */
    public static final class a<T, R> extends AtomicReference<io.reactivex.rxjava3.disposables.d> implements io.reactivex.rxjava3.core.L<T>, io.reactivex.rxjava3.disposables.d {
        private static final long serialVersionUID = 3258103020495908596L;

        /* renamed from: b, reason: collision with root package name */
        public final io.reactivex.rxjava3.core.L<? super R> f404653b;

        /* renamed from: c, reason: collision with root package name */
        public final l41.o<? super T, ? extends io.reactivex.rxjava3.core.O<? extends R>> f404654c;

        /* compiled from: SingleFlatMap.java */
        /* renamed from: io.reactivex.rxjava3.internal.operators.single.y$a$a, reason: collision with other inner class name */
        public static final class C11513a<R> implements io.reactivex.rxjava3.core.L<R> {

            /* renamed from: b, reason: collision with root package name */
            public final AtomicReference<io.reactivex.rxjava3.disposables.d> f404655b;

            /* renamed from: c, reason: collision with root package name */
            public final io.reactivex.rxjava3.core.L<? super R> f404656c;

            public C11513a(io.reactivex.rxjava3.core.L l12, AtomicReference atomicReference) {
                this.f404655b = atomicReference;
                this.f404656c = l12;
            }

            @Override // io.reactivex.rxjava3.core.L
            public final void b(io.reactivex.rxjava3.disposables.d dVar) {
                DisposableHelper.c(this.f404655b, dVar);
            }

            @Override // io.reactivex.rxjava3.core.L
            public final void onError(Throwable th2) {
                this.f404656c.onError(th2);
            }

            @Override // io.reactivex.rxjava3.core.L
            public final void onSuccess(R r12) {
                this.f404656c.onSuccess(r12);
            }
        }

        public a(io.reactivex.rxjava3.core.L<? super R> l12, l41.o<? super T, ? extends io.reactivex.rxjava3.core.O<? extends R>> oVar) {
            this.f404653b = l12;
            this.f404654c = oVar;
        }

        @Override // io.reactivex.rxjava3.core.L
        public final void b(io.reactivex.rxjava3.disposables.d dVar) {
            if (DisposableHelper.e(this, dVar)) {
                this.f404653b.b(this);
            }
        }

        @Override // io.reactivex.rxjava3.disposables.d
        public final void dispose() {
            DisposableHelper.a(this);
        }

        @Override // io.reactivex.rxjava3.disposables.d
        public final boolean i() {
            return DisposableHelper.b(get());
        }

        @Override // io.reactivex.rxjava3.core.L
        public final void onError(Throwable th2) {
            this.f404653b.onError(th2);
        }

        @Override // io.reactivex.rxjava3.core.L
        public final void onSuccess(T t12) {
            io.reactivex.rxjava3.core.L<? super R> l12 = this.f404653b;
            try {
                io.reactivex.rxjava3.core.O<? extends R> oApply = this.f404654c.apply(t12);
                Objects.requireNonNull(oApply, "The single returned by the mapper is null");
                io.reactivex.rxjava3.core.O<? extends R> o12 = oApply;
                if (i()) {
                    return;
                }
                o12.a(new C11513a(l12, this));
            } catch (Throwable th2) {
                io.reactivex.rxjava3.exceptions.a.a(th2);
                l12.onError(th2);
            }
        }
    }

    public C42026y(io.reactivex.rxjava3.core.I i12, l41.o oVar) {
        this.f404652c = oVar;
        this.f404651b = i12;
    }

    @Override // io.reactivex.rxjava3.core.I
    public final void y(io.reactivex.rxjava3.core.L<? super R> l12) {
        this.f404651b.a(new a(l12, this.f404652c));
    }
}
