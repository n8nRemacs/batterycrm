package io.reactivex.rxjava3.internal.operators.maybe;

import io.reactivex.rxjava3.internal.disposables.DisposableHelper;

/* compiled from: MaybeDetach.java */
/* renamed from: io.reactivex.rxjava3.internal.operators.maybe.q, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41923q<T> extends AbstractC41907a<T, T> {

    /* compiled from: MaybeDetach.java */
    /* renamed from: io.reactivex.rxjava3.internal.operators.maybe.q$a */
    public static final class a<T> implements io.reactivex.rxjava3.core.t<T>, io.reactivex.rxjava3.disposables.d {

        /* renamed from: b, reason: collision with root package name */
        public io.reactivex.rxjava3.core.t<? super T> f403305b;

        /* renamed from: c, reason: collision with root package name */
        public io.reactivex.rxjava3.disposables.d f403306c;

        public a() {
            throw null;
        }

        @Override // io.reactivex.rxjava3.core.t
        public final void b(io.reactivex.rxjava3.disposables.d dVar) {
            if (DisposableHelper.f(this.f403306c, dVar)) {
                this.f403306c = dVar;
                this.f403305b.b(this);
            }
        }

        @Override // io.reactivex.rxjava3.disposables.d
        public final void dispose() {
            this.f403305b = null;
            this.f403306c.dispose();
            this.f403306c = DisposableHelper.f401986b;
        }

        @Override // io.reactivex.rxjava3.core.t
        public final void e() {
            this.f403306c = DisposableHelper.f401986b;
            io.reactivex.rxjava3.core.t<? super T> tVar = this.f403305b;
            if (tVar != null) {
                this.f403305b = null;
                tVar.e();
            }
        }

        @Override // io.reactivex.rxjava3.disposables.d
        public final boolean i() {
            return this.f403306c.i();
        }

        @Override // io.reactivex.rxjava3.core.t
        public final void onError(Throwable th2) {
            this.f403306c = DisposableHelper.f401986b;
            io.reactivex.rxjava3.core.t<? super T> tVar = this.f403305b;
            if (tVar != null) {
                this.f403305b = null;
                tVar.onError(th2);
            }
        }

        @Override // io.reactivex.rxjava3.core.t
        public final void onSuccess(T t12) {
            this.f403306c = DisposableHelper.f401986b;
            io.reactivex.rxjava3.core.t<? super T> tVar = this.f403305b;
            if (tVar != null) {
                this.f403305b = null;
                tVar.onSuccess(t12);
            }
        }
    }

    @Override // io.reactivex.rxjava3.core.q
    public final void o(io.reactivex.rxjava3.core.t<? super T> tVar) {
        a aVar = new a();
        aVar.f403305b = tVar;
        this.f403189b.a(aVar);
    }
}
