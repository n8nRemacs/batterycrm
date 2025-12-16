package io.reactivex.rxjava3.internal.operators.single;

import io.reactivex.rxjava3.exceptions.CompositeException;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: SingleResumeNext.java */
/* loaded from: classes8.dex */
public final class V<T> extends io.reactivex.rxjava3.core.I<T> {

    /* renamed from: b, reason: collision with root package name */
    public final io.reactivex.rxjava3.core.I f404530b;

    /* renamed from: c, reason: collision with root package name */
    public final l41.o<? super Throwable, ? extends io.reactivex.rxjava3.core.O<? extends T>> f404531c;

    /* compiled from: SingleResumeNext.java */
    public static final class a<T> extends AtomicReference<io.reactivex.rxjava3.disposables.d> implements io.reactivex.rxjava3.core.L<T>, io.reactivex.rxjava3.disposables.d {
        private static final long serialVersionUID = -5314538511045349925L;

        /* renamed from: b, reason: collision with root package name */
        public final io.reactivex.rxjava3.core.L<? super T> f404532b;

        /* renamed from: c, reason: collision with root package name */
        public final l41.o<? super Throwable, ? extends io.reactivex.rxjava3.core.O<? extends T>> f404533c;

        public a(io.reactivex.rxjava3.core.L<? super T> l12, l41.o<? super Throwable, ? extends io.reactivex.rxjava3.core.O<? extends T>> oVar) {
            this.f404532b = l12;
            this.f404533c = oVar;
        }

        @Override // io.reactivex.rxjava3.core.L
        public final void b(io.reactivex.rxjava3.disposables.d dVar) {
            if (DisposableHelper.e(this, dVar)) {
                this.f404532b.b(this);
            }
        }

        @Override // io.reactivex.rxjava3.disposables.d
        public final void dispose() {
            DisposableHelper.a(this);
        }

        @Override // io.reactivex.rxjava3.disposables.d
        /* renamed from: i */
        public final boolean getF318621e() {
            return DisposableHelper.b(get());
        }

        @Override // io.reactivex.rxjava3.core.L
        public final void onError(Throwable th2) {
            io.reactivex.rxjava3.core.L<? super T> l12 = this.f404532b;
            try {
                io.reactivex.rxjava3.core.O<? extends T> oApply = this.f404533c.apply(th2);
                Objects.requireNonNull(oApply, "The nextFunction returned a null SingleSource.");
                oApply.a(new io.reactivex.rxjava3.internal.observers.D(l12, this));
            } catch (Throwable th3) {
                io.reactivex.rxjava3.exceptions.a.a(th3);
                l12.onError(new CompositeException(th2, th3));
            }
        }

        @Override // io.reactivex.rxjava3.core.L
        public final void onSuccess(T t12) {
            this.f404532b.onSuccess(t12);
        }
    }

    public V(io.reactivex.rxjava3.core.I i12, l41.o oVar) {
        this.f404530b = i12;
        this.f404531c = oVar;
    }

    @Override // io.reactivex.rxjava3.core.I
    public final void y(io.reactivex.rxjava3.core.L<? super T> l12) {
        this.f404530b.a(new a(l12, this.f404531c));
    }
}
