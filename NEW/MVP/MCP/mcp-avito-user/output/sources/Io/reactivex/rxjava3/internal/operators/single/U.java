package io.reactivex.rxjava3.internal.operators.single;

import io.reactivex.rxjava3.exceptions.CompositeException;

/* compiled from: SingleOnErrorReturn.java */
/* loaded from: classes8.dex */
public final class U<T> extends io.reactivex.rxjava3.core.I<T> {

    /* renamed from: b, reason: collision with root package name */
    public final io.reactivex.rxjava3.core.I f404525b;

    /* renamed from: c, reason: collision with root package name */
    public final l41.o<? super Throwable, ? extends T> f404526c;

    /* renamed from: d, reason: collision with root package name */
    public final T f404527d;

    /* compiled from: SingleOnErrorReturn.java */
    public final class a implements io.reactivex.rxjava3.core.L<T> {

        /* renamed from: b, reason: collision with root package name */
        public final io.reactivex.rxjava3.core.L<? super T> f404528b;

        public a(io.reactivex.rxjava3.core.L<? super T> l12) {
            this.f404528b = l12;
        }

        @Override // io.reactivex.rxjava3.core.L
        public final void b(io.reactivex.rxjava3.disposables.d dVar) {
            this.f404528b.b(dVar);
        }

        @Override // io.reactivex.rxjava3.core.L
        public final void onError(Throwable th2) {
            T tApply;
            U u12 = U.this;
            l41.o<? super Throwable, ? extends T> oVar = u12.f404526c;
            io.reactivex.rxjava3.core.L<? super T> l12 = this.f404528b;
            if (oVar != null) {
                try {
                    tApply = oVar.apply(th2);
                } catch (Throwable th3) {
                    io.reactivex.rxjava3.exceptions.a.a(th3);
                    l12.onError(new CompositeException(th2, th3));
                    return;
                }
            } else {
                tApply = u12.f404527d;
            }
            if (tApply != null) {
                l12.onSuccess(tApply);
                return;
            }
            NullPointerException nullPointerException = new NullPointerException("Value supplied was null");
            nullPointerException.initCause(th2);
            l12.onError(nullPointerException);
        }

        @Override // io.reactivex.rxjava3.core.L
        public final void onSuccess(T t12) {
            this.f404528b.onSuccess(t12);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public U(io.reactivex.rxjava3.core.I i12, l41.o oVar, Object obj) {
        this.f404525b = i12;
        this.f404526c = oVar;
        this.f404527d = obj;
    }

    @Override // io.reactivex.rxjava3.core.I
    public final void y(io.reactivex.rxjava3.core.L<? super T> l12) {
        this.f404525b.a(new a(l12));
    }
}
