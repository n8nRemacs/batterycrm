package io.reactivex.rxjava3.internal.operators.single;

import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;

/* compiled from: SingleAmb.java */
/* renamed from: io.reactivex.rxjava3.internal.operators.single.a, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C42003a<T> extends io.reactivex.rxjava3.core.I<T> {

    /* compiled from: SingleAmb.java */
    /* renamed from: io.reactivex.rxjava3.internal.operators.single.a$a, reason: collision with other inner class name */
    public static final class C11511a<T> implements io.reactivex.rxjava3.core.L<T> {

        /* renamed from: b, reason: collision with root package name */
        public io.reactivex.rxjava3.disposables.d f404555b;

        public C11511a() {
            throw null;
        }

        @Override // io.reactivex.rxjava3.core.L
        public final void b(io.reactivex.rxjava3.disposables.d dVar) {
            this.f404555b = dVar;
            throw null;
        }

        @Override // io.reactivex.rxjava3.core.L
        public final void onError(Throwable th2) {
            throw null;
        }

        @Override // io.reactivex.rxjava3.core.L
        public final void onSuccess(T t12) {
            throw null;
        }
    }

    @Override // io.reactivex.rxjava3.core.I
    public final void y(io.reactivex.rxjava3.core.L<? super T> l12) {
        try {
            throw null;
        } catch (Throwable th2) {
            io.reactivex.rxjava3.exceptions.a.a(th2);
            EmptyDisposable.e(th2, l12);
        }
    }
}
