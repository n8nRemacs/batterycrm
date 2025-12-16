package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.NoSuchElementException;

/* compiled from: ObservableLastSingle.java */
/* renamed from: io.reactivex.rxjava3.internal.operators.observable.z0, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C42002z0<T> extends io.reactivex.rxjava3.core.I<T> {

    /* renamed from: b, reason: collision with root package name */
    public final E1 f404421b;

    /* compiled from: ObservableLastSingle.java */
    /* renamed from: io.reactivex.rxjava3.internal.operators.observable.z0$a */
    public static final class a<T> implements io.reactivex.rxjava3.core.G<T>, io.reactivex.rxjava3.disposables.d {

        /* renamed from: b, reason: collision with root package name */
        public final io.reactivex.rxjava3.core.L<? super T> f404422b;

        /* renamed from: c, reason: collision with root package name */
        public io.reactivex.rxjava3.disposables.d f404423c;

        /* renamed from: d, reason: collision with root package name */
        public T f404424d;

        public a(io.reactivex.rxjava3.core.L l12) {
            this.f404422b = l12;
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void b(io.reactivex.rxjava3.disposables.d dVar) {
            if (DisposableHelper.f(this.f404423c, dVar)) {
                this.f404423c = dVar;
                this.f404422b.b(this);
            }
        }

        @Override // io.reactivex.rxjava3.disposables.d
        public final void dispose() {
            this.f404423c.dispose();
            this.f404423c = DisposableHelper.f401986b;
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void e() {
            this.f404423c = DisposableHelper.f401986b;
            T t12 = this.f404424d;
            io.reactivex.rxjava3.core.L<? super T> l12 = this.f404422b;
            if (t12 == null) {
                l12.onError(new NoSuchElementException());
            } else {
                this.f404424d = null;
                l12.onSuccess(t12);
            }
        }

        @Override // io.reactivex.rxjava3.disposables.d
        /* renamed from: i */
        public final boolean getF318621e() {
            return this.f404423c == DisposableHelper.f401986b;
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void onError(Throwable th2) {
            this.f404423c = DisposableHelper.f401986b;
            this.f404424d = null;
            this.f404422b.onError(th2);
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void onNext(T t12) {
            this.f404424d = t12;
        }
    }

    public C42002z0(E1 e12) {
        this.f404421b = e12;
    }

    @Override // io.reactivex.rxjava3.core.I
    public final void y(io.reactivex.rxjava3.core.L<? super T> l12) {
        this.f404421b.c(new a(l12));
    }
}
