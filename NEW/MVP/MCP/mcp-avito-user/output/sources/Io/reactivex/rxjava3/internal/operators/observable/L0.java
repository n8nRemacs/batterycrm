package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.exceptions.CompositeException;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;

/* compiled from: ObservableOnErrorReturn.java */
/* loaded from: classes8.dex */
public final class L0<T> extends AbstractC41932a<T, T> {

    /* renamed from: c, reason: collision with root package name */
    public final l41.o<? super Throwable, ? extends T> f403701c;

    /* compiled from: ObservableOnErrorReturn.java */
    public static final class a<T> implements io.reactivex.rxjava3.core.G<T>, io.reactivex.rxjava3.disposables.d {

        /* renamed from: b, reason: collision with root package name */
        public final io.reactivex.rxjava3.core.G<? super T> f403702b;

        /* renamed from: c, reason: collision with root package name */
        public final l41.o<? super Throwable, ? extends T> f403703c;

        /* renamed from: d, reason: collision with root package name */
        public io.reactivex.rxjava3.disposables.d f403704d;

        public a(io.reactivex.rxjava3.core.G<? super T> g12, l41.o<? super Throwable, ? extends T> oVar) {
            this.f403702b = g12;
            this.f403703c = oVar;
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void b(io.reactivex.rxjava3.disposables.d dVar) {
            if (DisposableHelper.f(this.f403704d, dVar)) {
                this.f403704d = dVar;
                this.f403702b.b(this);
            }
        }

        @Override // io.reactivex.rxjava3.disposables.d
        public final void dispose() {
            this.f403704d.dispose();
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void e() {
            this.f403702b.e();
        }

        @Override // io.reactivex.rxjava3.disposables.d
        public final boolean i() {
            return this.f403704d.i();
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void onError(Throwable th2) {
            io.reactivex.rxjava3.core.G<? super T> g12 = this.f403702b;
            try {
                T tApply = this.f403703c.apply(th2);
                if (tApply != null) {
                    g12.onNext(tApply);
                    g12.e();
                } else {
                    NullPointerException nullPointerException = new NullPointerException("The supplied value is null");
                    nullPointerException.initCause(th2);
                    g12.onError(nullPointerException);
                }
            } catch (Throwable th3) {
                io.reactivex.rxjava3.exceptions.a.a(th3);
                g12.onError(new CompositeException(th2, th3));
            }
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void onNext(T t12) {
            this.f403702b.onNext(t12);
        }
    }

    public L0(io.reactivex.rxjava3.core.z zVar, l41.o oVar) {
        super(zVar);
        this.f403701c = oVar;
    }

    @Override // io.reactivex.rxjava3.core.z
    public final void w0(io.reactivex.rxjava3.core.G<? super T> g12) {
        this.f403951b.c(new a(g12, this.f403701c));
    }
}
