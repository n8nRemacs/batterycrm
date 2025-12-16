package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.exceptions.CompositeException;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;

/* compiled from: ObservableOnErrorComplete.java */
/* loaded from: classes8.dex */
public final class J0<T> extends AbstractC41932a<T, T> {

    /* renamed from: c, reason: collision with root package name */
    public final l41.r<? super Throwable> f403674c;

    /* compiled from: ObservableOnErrorComplete.java */
    public static final class a<T> implements io.reactivex.rxjava3.core.G<T>, io.reactivex.rxjava3.disposables.d {

        /* renamed from: b, reason: collision with root package name */
        public final io.reactivex.rxjava3.core.G<? super T> f403675b;

        /* renamed from: c, reason: collision with root package name */
        public final l41.r<? super Throwable> f403676c;

        /* renamed from: d, reason: collision with root package name */
        public io.reactivex.rxjava3.disposables.d f403677d;

        public a(io.reactivex.rxjava3.core.G<? super T> g12, l41.r<? super Throwable> rVar) {
            this.f403675b = g12;
            this.f403676c = rVar;
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void b(io.reactivex.rxjava3.disposables.d dVar) {
            if (DisposableHelper.f(this.f403677d, dVar)) {
                this.f403677d = dVar;
                this.f403675b.b(this);
            }
        }

        @Override // io.reactivex.rxjava3.disposables.d
        public final void dispose() {
            this.f403677d.dispose();
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void e() {
            this.f403675b.e();
        }

        @Override // io.reactivex.rxjava3.disposables.d
        /* renamed from: i */
        public final boolean getF318621e() {
            return this.f403677d.getF318621e();
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void onError(Throwable th2) {
            io.reactivex.rxjava3.core.G<? super T> g12 = this.f403675b;
            try {
                this.f403676c.test(th2);
                g12.e();
            } catch (Throwable th3) {
                io.reactivex.rxjava3.exceptions.a.a(th3);
                g12.onError(new CompositeException(th2, th3));
            }
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void onNext(T t12) {
            this.f403675b.onNext(t12);
        }
    }

    public J0(io.reactivex.rxjava3.core.z zVar, l41.r rVar) {
        super(zVar);
        this.f403674c = rVar;
    }

    @Override // io.reactivex.rxjava3.core.z
    public final void w0(io.reactivex.rxjava3.core.G<? super T> g12) {
        this.f403951b.c(new a(g12, this.f403674c));
    }
}
