package io.reactivex.rxjava3.internal.operators.single;

import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: SingleObserveOn.java */
/* loaded from: classes8.dex */
public final class S<T> extends io.reactivex.rxjava3.core.I<T> {

    /* renamed from: b, reason: collision with root package name */
    public final io.reactivex.rxjava3.core.I f404517b;

    /* renamed from: c, reason: collision with root package name */
    public final io.reactivex.rxjava3.core.H f404518c;

    /* compiled from: SingleObserveOn.java */
    public static final class a<T> extends AtomicReference<io.reactivex.rxjava3.disposables.d> implements io.reactivex.rxjava3.core.L<T>, io.reactivex.rxjava3.disposables.d, Runnable {
        private static final long serialVersionUID = 3528003840217436037L;

        /* renamed from: b, reason: collision with root package name */
        public final io.reactivex.rxjava3.core.L<? super T> f404519b;

        /* renamed from: c, reason: collision with root package name */
        public final io.reactivex.rxjava3.core.H f404520c;

        /* renamed from: d, reason: collision with root package name */
        public T f404521d;

        /* renamed from: e, reason: collision with root package name */
        public Throwable f404522e;

        public a(io.reactivex.rxjava3.core.L<? super T> l12, io.reactivex.rxjava3.core.H h12) {
            this.f404519b = l12;
            this.f404520c = h12;
        }

        @Override // io.reactivex.rxjava3.core.L
        public final void b(io.reactivex.rxjava3.disposables.d dVar) {
            if (DisposableHelper.e(this, dVar)) {
                this.f404519b.b(this);
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
            this.f404522e = th2;
            DisposableHelper.c(this, this.f404520c.d(this));
        }

        @Override // io.reactivex.rxjava3.core.L
        public final void onSuccess(T t12) {
            this.f404521d = t12;
            DisposableHelper.c(this, this.f404520c.d(this));
        }

        @Override // java.lang.Runnable
        public final void run() {
            Throwable th2 = this.f404522e;
            io.reactivex.rxjava3.core.L<? super T> l12 = this.f404519b;
            if (th2 != null) {
                l12.onError(th2);
            } else {
                l12.onSuccess(this.f404521d);
            }
        }
    }

    public S(io.reactivex.rxjava3.core.I i12, io.reactivex.rxjava3.core.H h12) {
        this.f404517b = i12;
        this.f404518c = h12;
    }

    @Override // io.reactivex.rxjava3.core.I
    public final void y(io.reactivex.rxjava3.core.L<? super T> l12) {
        this.f404517b.a(new a(l12, this.f404518c));
    }
}
