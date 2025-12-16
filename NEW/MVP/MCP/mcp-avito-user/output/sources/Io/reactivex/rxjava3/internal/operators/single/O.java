package io.reactivex.rxjava3.internal.operators.single;

import java.util.Objects;

/* compiled from: SingleMap.java */
/* loaded from: classes8.dex */
public final class O<T, R> extends io.reactivex.rxjava3.core.I<R> {

    /* renamed from: b, reason: collision with root package name */
    public final io.reactivex.rxjava3.core.I f404512b;

    /* renamed from: c, reason: collision with root package name */
    public final l41.o<? super T, ? extends R> f404513c;

    /* compiled from: SingleMap.java */
    public static final class a<T, R> implements io.reactivex.rxjava3.core.L<T> {

        /* renamed from: b, reason: collision with root package name */
        public final io.reactivex.rxjava3.core.L<? super R> f404514b;

        /* renamed from: c, reason: collision with root package name */
        public final l41.o<? super T, ? extends R> f404515c;

        public a(io.reactivex.rxjava3.core.L<? super R> l12, l41.o<? super T, ? extends R> oVar) {
            this.f404514b = l12;
            this.f404515c = oVar;
        }

        @Override // io.reactivex.rxjava3.core.L
        public final void b(io.reactivex.rxjava3.disposables.d dVar) {
            this.f404514b.b(dVar);
        }

        @Override // io.reactivex.rxjava3.core.L
        public final void onError(Throwable th2) {
            this.f404514b.onError(th2);
        }

        @Override // io.reactivex.rxjava3.core.L
        public final void onSuccess(T t12) {
            try {
                R rApply = this.f404515c.apply(t12);
                Objects.requireNonNull(rApply, "The mapper function returned a null value.");
                this.f404514b.onSuccess(rApply);
            } catch (Throwable th2) {
                io.reactivex.rxjava3.exceptions.a.a(th2);
                onError(th2);
            }
        }
    }

    public O(io.reactivex.rxjava3.core.I i12, l41.o oVar) {
        this.f404512b = i12;
        this.f404513c = oVar;
    }

    @Override // io.reactivex.rxjava3.core.I
    public final void y(io.reactivex.rxjava3.core.L<? super R> l12) {
        this.f404512b.a(new a(l12, this.f404513c));
    }
}
