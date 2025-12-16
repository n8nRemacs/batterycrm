package io.reactivex.rxjava3.internal.operators.single;

import io.reactivex.rxjava3.exceptions.CompositeException;

/* compiled from: SingleDoOnError.java */
/* renamed from: io.reactivex.rxjava3.internal.operators.single.q, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C42019q<T> extends io.reactivex.rxjava3.core.I<T> {

    /* renamed from: b, reason: collision with root package name */
    public final io.reactivex.rxjava3.core.I f404628b;

    /* renamed from: c, reason: collision with root package name */
    public final l41.g<? super Throwable> f404629c;

    /* compiled from: SingleDoOnError.java */
    /* renamed from: io.reactivex.rxjava3.internal.operators.single.q$a */
    public final class a implements io.reactivex.rxjava3.core.L<T> {

        /* renamed from: b, reason: collision with root package name */
        public final io.reactivex.rxjava3.core.L<? super T> f404630b;

        public a(io.reactivex.rxjava3.core.L<? super T> l12) {
            this.f404630b = l12;
        }

        @Override // io.reactivex.rxjava3.core.L
        public final void b(io.reactivex.rxjava3.disposables.d dVar) {
            this.f404630b.b(dVar);
        }

        @Override // io.reactivex.rxjava3.core.L
        public final void onError(Throwable th2) {
            try {
                C42019q.this.f404629c.accept(th2);
            } catch (Throwable th3) {
                io.reactivex.rxjava3.exceptions.a.a(th3);
                th2 = new CompositeException(th2, th3);
            }
            this.f404630b.onError(th2);
        }

        @Override // io.reactivex.rxjava3.core.L
        public final void onSuccess(T t12) {
            this.f404630b.onSuccess(t12);
        }
    }

    public C42019q(io.reactivex.rxjava3.core.I i12, l41.g gVar) {
        this.f404628b = i12;
        this.f404629c = gVar;
    }

    @Override // io.reactivex.rxjava3.core.I
    public final void y(io.reactivex.rxjava3.core.L<? super T> l12) {
        this.f404628b.a(new a(l12));
    }
}
