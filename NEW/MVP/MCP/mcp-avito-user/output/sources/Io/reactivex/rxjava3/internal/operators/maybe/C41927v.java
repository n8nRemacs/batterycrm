package io.reactivex.rxjava3.internal.operators.maybe;

import io.reactivex.rxjava3.exceptions.CompositeException;

/* compiled from: MaybeDoOnTerminate.java */
/* renamed from: io.reactivex.rxjava3.internal.operators.maybe.v, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41927v<T> extends io.reactivex.rxjava3.core.q<T> {

    /* renamed from: b, reason: collision with root package name */
    public final g0 f403330b;

    /* renamed from: c, reason: collision with root package name */
    public final com.avito.android.code_confirmation.phone_management.k f403331c;

    /* compiled from: MaybeDoOnTerminate.java */
    /* renamed from: io.reactivex.rxjava3.internal.operators.maybe.v$a */
    public final class a implements io.reactivex.rxjava3.core.t<T> {

        /* renamed from: b, reason: collision with root package name */
        public final io.reactivex.rxjava3.core.t<? super T> f403332b;

        public a(io.reactivex.rxjava3.core.t<? super T> tVar) {
            this.f403332b = tVar;
        }

        @Override // io.reactivex.rxjava3.core.t
        public final void b(io.reactivex.rxjava3.disposables.d dVar) {
            this.f403332b.b(dVar);
        }

        @Override // io.reactivex.rxjava3.core.t
        public final void e() {
            io.reactivex.rxjava3.core.t<? super T> tVar = this.f403332b;
            try {
                C41927v.this.f403331c.run();
                tVar.e();
            } catch (Throwable th2) {
                io.reactivex.rxjava3.exceptions.a.a(th2);
                tVar.onError(th2);
            }
        }

        @Override // io.reactivex.rxjava3.core.t
        public final void onError(Throwable th2) {
            try {
                C41927v.this.f403331c.run();
            } catch (Throwable th3) {
                io.reactivex.rxjava3.exceptions.a.a(th3);
                th2 = new CompositeException(th2, th3);
            }
            this.f403332b.onError(th2);
        }

        @Override // io.reactivex.rxjava3.core.t
        public final void onSuccess(T t12) {
            io.reactivex.rxjava3.core.t<? super T> tVar = this.f403332b;
            try {
                C41927v.this.f403331c.run();
                tVar.onSuccess(t12);
            } catch (Throwable th2) {
                io.reactivex.rxjava3.exceptions.a.a(th2);
                tVar.onError(th2);
            }
        }
    }

    public C41927v(g0 g0Var, com.avito.android.code_confirmation.phone_management.k kVar) {
        this.f403330b = g0Var;
        this.f403331c = kVar;
    }

    @Override // io.reactivex.rxjava3.core.q
    public final void o(io.reactivex.rxjava3.core.t<? super T> tVar) {
        this.f403330b.a(new a(tVar));
    }
}
