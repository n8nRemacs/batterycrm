package io.reactivex.rxjava3.internal.operators.maybe;

import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: MaybeObserveOn.java */
/* loaded from: classes8.dex */
public final class c0<T> extends AbstractC41907a<T, T> {

    /* renamed from: c, reason: collision with root package name */
    public final io.reactivex.rxjava3.core.H f403198c;

    /* compiled from: MaybeObserveOn.java */
    public static final class a<T> extends AtomicReference<io.reactivex.rxjava3.disposables.d> implements io.reactivex.rxjava3.core.t<T>, io.reactivex.rxjava3.disposables.d, Runnable {
        private static final long serialVersionUID = 8571289934935992137L;

        /* renamed from: b, reason: collision with root package name */
        public final io.reactivex.rxjava3.core.t<? super T> f403199b;

        /* renamed from: c, reason: collision with root package name */
        public final io.reactivex.rxjava3.core.H f403200c;

        /* renamed from: d, reason: collision with root package name */
        public T f403201d;

        /* renamed from: e, reason: collision with root package name */
        public Throwable f403202e;

        public a(io.reactivex.rxjava3.core.t<? super T> tVar, io.reactivex.rxjava3.core.H h12) {
            this.f403199b = tVar;
            this.f403200c = h12;
        }

        @Override // io.reactivex.rxjava3.core.t
        public final void b(io.reactivex.rxjava3.disposables.d dVar) {
            if (DisposableHelper.e(this, dVar)) {
                this.f403199b.b(this);
            }
        }

        @Override // io.reactivex.rxjava3.disposables.d
        public final void dispose() {
            DisposableHelper.a(this);
        }

        @Override // io.reactivex.rxjava3.core.t
        public final void e() {
            DisposableHelper.c(this, this.f403200c.d(this));
        }

        @Override // io.reactivex.rxjava3.disposables.d
        public final boolean i() {
            return DisposableHelper.b(get());
        }

        @Override // io.reactivex.rxjava3.core.t
        public final void onError(Throwable th2) {
            this.f403202e = th2;
            DisposableHelper.c(this, this.f403200c.d(this));
        }

        @Override // io.reactivex.rxjava3.core.t
        public final void onSuccess(T t12) {
            this.f403201d = t12;
            DisposableHelper.c(this, this.f403200c.d(this));
        }

        @Override // java.lang.Runnable
        public final void run() {
            Throwable th2 = this.f403202e;
            io.reactivex.rxjava3.core.t<? super T> tVar = this.f403199b;
            if (th2 != null) {
                this.f403202e = null;
                tVar.onError(th2);
                return;
            }
            T t12 = this.f403201d;
            if (t12 == null) {
                tVar.e();
            } else {
                this.f403201d = null;
                tVar.onSuccess(t12);
            }
        }
    }

    public c0(io.reactivex.rxjava3.core.q qVar, io.reactivex.rxjava3.core.H h12) {
        super(qVar);
        this.f403198c = h12;
    }

    @Override // io.reactivex.rxjava3.core.q
    public final void o(io.reactivex.rxjava3.core.t<? super T> tVar) {
        this.f403189b.a(new a(tVar, this.f403198c));
    }
}
