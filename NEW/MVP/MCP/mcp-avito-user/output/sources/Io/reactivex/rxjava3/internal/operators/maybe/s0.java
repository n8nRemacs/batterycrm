package io.reactivex.rxjava3.internal.operators.maybe;

import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.NoSuchElementException;
import n41.InterfaceC44190g;

/* compiled from: MaybeToSingle.java */
/* loaded from: classes8.dex */
public final class s0<T> extends io.reactivex.rxjava3.core.I<T> implements InterfaceC44190g<T> {

    /* renamed from: b, reason: collision with root package name */
    public final io.reactivex.rxjava3.core.q f403317b;

    /* renamed from: c, reason: collision with root package name */
    public final T f403318c;

    /* compiled from: MaybeToSingle.java */
    public static final class a<T> implements io.reactivex.rxjava3.core.t<T>, io.reactivex.rxjava3.disposables.d {

        /* renamed from: b, reason: collision with root package name */
        public final io.reactivex.rxjava3.core.L<? super T> f403319b;

        /* renamed from: c, reason: collision with root package name */
        public final T f403320c;

        /* renamed from: d, reason: collision with root package name */
        public io.reactivex.rxjava3.disposables.d f403321d;

        public a(io.reactivex.rxjava3.core.L<? super T> l12, T t12) {
            this.f403319b = l12;
            this.f403320c = t12;
        }

        @Override // io.reactivex.rxjava3.core.t
        public final void b(io.reactivex.rxjava3.disposables.d dVar) {
            if (DisposableHelper.f(this.f403321d, dVar)) {
                this.f403321d = dVar;
                this.f403319b.b(this);
            }
        }

        @Override // io.reactivex.rxjava3.disposables.d
        public final void dispose() {
            this.f403321d.dispose();
            this.f403321d = DisposableHelper.f401986b;
        }

        @Override // io.reactivex.rxjava3.core.t
        public final void e() {
            this.f403321d = DisposableHelper.f401986b;
            io.reactivex.rxjava3.core.L<? super T> l12 = this.f403319b;
            T t12 = this.f403320c;
            if (t12 != null) {
                l12.onSuccess(t12);
            } else {
                l12.onError(new NoSuchElementException("The MaybeSource is empty"));
            }
        }

        @Override // io.reactivex.rxjava3.disposables.d
        /* renamed from: i */
        public final boolean getF318621e() {
            return this.f403321d.getF318621e();
        }

        @Override // io.reactivex.rxjava3.core.t
        public final void onError(Throwable th2) {
            this.f403321d = DisposableHelper.f401986b;
            this.f403319b.onError(th2);
        }

        @Override // io.reactivex.rxjava3.core.t
        public final void onSuccess(T t12) {
            this.f403321d = DisposableHelper.f401986b;
            this.f403319b.onSuccess(t12);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public s0(io.reactivex.rxjava3.core.q qVar, Object obj) {
        this.f403317b = qVar;
        this.f403318c = obj;
    }

    @Override // io.reactivex.rxjava3.core.I
    public final void y(io.reactivex.rxjava3.core.L<? super T> l12) {
        this.f403317b.a(new a(l12, this.f403318c));
    }
}
