package io.reactivex.rxjava3.internal.operators.maybe;

import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;

/* compiled from: MaybeAmb.java */
/* renamed from: io.reactivex.rxjava3.internal.operators.maybe.b, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41908b<T> extends io.reactivex.rxjava3.core.q<T> {

    /* compiled from: MaybeAmb.java */
    /* renamed from: io.reactivex.rxjava3.internal.operators.maybe.b$a */
    public static final class a<T> implements io.reactivex.rxjava3.core.t<T> {

        /* renamed from: b, reason: collision with root package name */
        public io.reactivex.rxjava3.disposables.d f403194b;

        public a() {
            throw null;
        }

        @Override // io.reactivex.rxjava3.core.t
        public final void b(io.reactivex.rxjava3.disposables.d dVar) {
            this.f403194b = dVar;
            throw null;
        }

        @Override // io.reactivex.rxjava3.core.t
        public final void e() {
            throw null;
        }

        @Override // io.reactivex.rxjava3.core.t
        public final void onError(Throwable th2) {
            throw null;
        }

        @Override // io.reactivex.rxjava3.core.t
        public final void onSuccess(T t12) {
            throw null;
        }
    }

    @Override // io.reactivex.rxjava3.core.q
    public final void o(io.reactivex.rxjava3.core.t<? super T> tVar) {
        try {
            throw null;
        } catch (Throwable th2) {
            io.reactivex.rxjava3.exceptions.a.a(th2);
            EmptyDisposable.c(th2, tVar);
        }
    }
}
