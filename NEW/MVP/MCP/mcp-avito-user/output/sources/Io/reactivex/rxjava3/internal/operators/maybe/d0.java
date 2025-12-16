package io.reactivex.rxjava3.internal.operators.maybe;

import io.reactivex.rxjava3.exceptions.CompositeException;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;

/* compiled from: MaybeOnErrorComplete.java */
/* loaded from: classes8.dex */
public final class d0<T> extends AbstractC41907a<T, T> {

    /* renamed from: c, reason: collision with root package name */
    public final l41.r<? super Throwable> f403206c;

    /* compiled from: MaybeOnErrorComplete.java */
    public static final class a<T> implements io.reactivex.rxjava3.core.t<T>, io.reactivex.rxjava3.core.L<T>, io.reactivex.rxjava3.disposables.d {

        /* renamed from: b, reason: collision with root package name */
        public final io.reactivex.rxjava3.core.t<? super T> f403207b;

        /* renamed from: c, reason: collision with root package name */
        public final l41.r<? super Throwable> f403208c;

        /* renamed from: d, reason: collision with root package name */
        public io.reactivex.rxjava3.disposables.d f403209d;

        public a(io.reactivex.rxjava3.core.t<? super T> tVar, l41.r<? super Throwable> rVar) {
            this.f403207b = tVar;
            this.f403208c = rVar;
        }

        @Override // io.reactivex.rxjava3.core.t
        public final void b(io.reactivex.rxjava3.disposables.d dVar) {
            if (DisposableHelper.f(this.f403209d, dVar)) {
                this.f403209d = dVar;
                this.f403207b.b(this);
            }
        }

        @Override // io.reactivex.rxjava3.disposables.d
        public final void dispose() {
            this.f403209d.dispose();
        }

        @Override // io.reactivex.rxjava3.core.t
        public final void e() {
            this.f403207b.e();
        }

        @Override // io.reactivex.rxjava3.disposables.d
        public final boolean i() {
            return this.f403209d.i();
        }

        @Override // io.reactivex.rxjava3.core.t
        public final void onError(Throwable th2) {
            io.reactivex.rxjava3.core.t<? super T> tVar = this.f403207b;
            try {
                if (this.f403208c.test(th2)) {
                    tVar.e();
                } else {
                    tVar.onError(th2);
                }
            } catch (Throwable th3) {
                io.reactivex.rxjava3.exceptions.a.a(th3);
                tVar.onError(new CompositeException(th2, th3));
            }
        }

        @Override // io.reactivex.rxjava3.core.t
        public final void onSuccess(T t12) {
            this.f403207b.onSuccess(t12);
        }
    }

    public d0(io.reactivex.rxjava3.core.q qVar, l41.r rVar) {
        super(qVar);
        this.f403206c = rVar;
    }

    @Override // io.reactivex.rxjava3.core.q
    public final void o(io.reactivex.rxjava3.core.t<? super T> tVar) {
        this.f403189b.a(new a(tVar, this.f403206c));
    }
}
