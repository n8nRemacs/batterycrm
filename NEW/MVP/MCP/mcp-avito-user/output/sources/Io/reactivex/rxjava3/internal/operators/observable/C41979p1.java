package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.internal.disposables.DisposableHelper;

/* compiled from: ObservableSkipWhile.java */
/* renamed from: io.reactivex.rxjava3.internal.operators.observable.p1, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41979p1<T> extends AbstractC41932a<T, T> {

    /* renamed from: c, reason: collision with root package name */
    public final l41.r<? super T> f404233c;

    /* compiled from: ObservableSkipWhile.java */
    /* renamed from: io.reactivex.rxjava3.internal.operators.observable.p1$a */
    public static final class a<T> implements io.reactivex.rxjava3.core.G<T>, io.reactivex.rxjava3.disposables.d {

        /* renamed from: b, reason: collision with root package name */
        public final io.reactivex.rxjava3.core.G<? super T> f404234b;

        /* renamed from: c, reason: collision with root package name */
        public final l41.r<? super T> f404235c;

        /* renamed from: d, reason: collision with root package name */
        public io.reactivex.rxjava3.disposables.d f404236d;

        /* renamed from: e, reason: collision with root package name */
        public boolean f404237e;

        public a(io.reactivex.rxjava3.core.G<? super T> g12, l41.r<? super T> rVar) {
            this.f404234b = g12;
            this.f404235c = rVar;
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void b(io.reactivex.rxjava3.disposables.d dVar) {
            if (DisposableHelper.f(this.f404236d, dVar)) {
                this.f404236d = dVar;
                this.f404234b.b(this);
            }
        }

        @Override // io.reactivex.rxjava3.disposables.d
        public final void dispose() {
            this.f404236d.dispose();
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void e() {
            this.f404234b.e();
        }

        @Override // io.reactivex.rxjava3.disposables.d
        /* renamed from: i */
        public final boolean getF318621e() {
            return this.f404236d.getF318621e();
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void onError(Throwable th2) {
            this.f404234b.onError(th2);
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void onNext(T t12) {
            boolean z12 = this.f404237e;
            io.reactivex.rxjava3.core.G<? super T> g12 = this.f404234b;
            if (z12) {
                g12.onNext(t12);
                return;
            }
            try {
                if (this.f404235c.test(t12)) {
                    return;
                }
                this.f404237e = true;
                g12.onNext(t12);
            } catch (Throwable th2) {
                io.reactivex.rxjava3.exceptions.a.a(th2);
                this.f404236d.dispose();
                g12.onError(th2);
            }
        }
    }

    public C41979p1(I0 i02, l41.r rVar) {
        super(i02);
        this.f404233c = rVar;
    }

    @Override // io.reactivex.rxjava3.core.z
    public final void w0(io.reactivex.rxjava3.core.G<? super T> g12) {
        this.f403951b.c(new a(g12, this.f404233c));
    }
}
