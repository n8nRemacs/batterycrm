package io.reactivex.rxjava3.internal.operators.single;

import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: SingleSubscribeOn.java */
/* loaded from: classes8.dex */
public final class W<T> extends io.reactivex.rxjava3.core.I<T> {

    /* renamed from: b, reason: collision with root package name */
    public final io.reactivex.rxjava3.core.I f404534b;

    /* renamed from: c, reason: collision with root package name */
    public final io.reactivex.rxjava3.core.H f404535c;

    /* compiled from: SingleSubscribeOn.java */
    public static final class a<T> extends AtomicReference<io.reactivex.rxjava3.disposables.d> implements io.reactivex.rxjava3.core.L<T>, io.reactivex.rxjava3.disposables.d, Runnable {
        private static final long serialVersionUID = 7000911171163930287L;

        /* renamed from: b, reason: collision with root package name */
        public final io.reactivex.rxjava3.core.L<? super T> f404536b;

        /* renamed from: c, reason: collision with root package name */
        public final m41.d f404537c = new m41.d();

        /* renamed from: d, reason: collision with root package name */
        public final io.reactivex.rxjava3.core.I f404538d;

        public a(io.reactivex.rxjava3.core.L l12, io.reactivex.rxjava3.core.I i12) {
            this.f404536b = l12;
            this.f404538d = i12;
        }

        @Override // io.reactivex.rxjava3.core.L
        public final void b(io.reactivex.rxjava3.disposables.d dVar) {
            DisposableHelper.e(this, dVar);
        }

        @Override // io.reactivex.rxjava3.disposables.d
        public final void dispose() {
            DisposableHelper.a(this);
            m41.d dVar = this.f404537c;
            dVar.getClass();
            DisposableHelper.a(dVar);
        }

        @Override // io.reactivex.rxjava3.disposables.d
        public final boolean i() {
            return DisposableHelper.b(get());
        }

        @Override // io.reactivex.rxjava3.core.L
        public final void onError(Throwable th2) {
            this.f404536b.onError(th2);
        }

        @Override // io.reactivex.rxjava3.core.L
        public final void onSuccess(T t12) {
            this.f404536b.onSuccess(t12);
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f404538d.a(this);
        }
    }

    public W(io.reactivex.rxjava3.core.I i12, io.reactivex.rxjava3.core.H h12) {
        this.f404534b = i12;
        this.f404535c = h12;
    }

    @Override // io.reactivex.rxjava3.core.I
    public final void y(io.reactivex.rxjava3.core.L<? super T> l12) {
        a aVar = new a(l12, this.f404534b);
        l12.b(aVar);
        io.reactivex.rxjava3.disposables.d dVarD = this.f404535c.d(aVar);
        m41.d dVar = aVar.f404537c;
        dVar.getClass();
        DisposableHelper.c(dVar, dVarD);
    }
}
