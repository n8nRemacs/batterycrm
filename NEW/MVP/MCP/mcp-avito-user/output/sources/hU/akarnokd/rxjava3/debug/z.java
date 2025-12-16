package hu.akarnokd.rxjava3.debug;

import io.reactivex.rxjava3.core.I;
import io.reactivex.rxjava3.core.L;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;

/* compiled from: SingleOnAssembly.java */
/* loaded from: classes8.dex */
final class z<T> extends I<T> {

    /* renamed from: b, reason: collision with root package name */
    public final I f397871b;

    /* renamed from: c, reason: collision with root package name */
    public final RxJavaAssemblyException f397872c = new RxJavaAssemblyException();

    /* compiled from: SingleOnAssembly.java */
    public static final class a<T> implements L<T>, io.reactivex.rxjava3.disposables.d {

        /* renamed from: b, reason: collision with root package name */
        public final L<? super T> f397873b;

        /* renamed from: c, reason: collision with root package name */
        public final RxJavaAssemblyException f397874c;

        /* renamed from: d, reason: collision with root package name */
        public io.reactivex.rxjava3.disposables.d f397875d;

        public a(L<? super T> l12, RxJavaAssemblyException rxJavaAssemblyException) {
            this.f397873b = l12;
            this.f397874c = rxJavaAssemblyException;
        }

        @Override // io.reactivex.rxjava3.core.L
        public final void b(io.reactivex.rxjava3.disposables.d dVar) {
            if (DisposableHelper.f(this.f397875d, dVar)) {
                this.f397875d = dVar;
                this.f397873b.b(this);
            }
        }

        @Override // io.reactivex.rxjava3.disposables.d
        public final void dispose() {
            this.f397875d.dispose();
        }

        @Override // io.reactivex.rxjava3.disposables.d
        /* renamed from: i */
        public final boolean getF318621e() {
            return this.f397875d.getF318621e();
        }

        @Override // io.reactivex.rxjava3.core.L
        public final void onError(Throwable th2) {
            this.f397874c.a(th2);
            this.f397873b.onError(th2);
        }

        @Override // io.reactivex.rxjava3.core.L
        public final void onSuccess(T t12) {
            this.f397873b.onSuccess(t12);
        }
    }

    public z(I i12) {
        this.f397871b = i12;
    }

    @Override // io.reactivex.rxjava3.core.I
    public final void y(L<? super T> l12) {
        this.f397871b.a(new a(l12, this.f397872c));
    }
}
