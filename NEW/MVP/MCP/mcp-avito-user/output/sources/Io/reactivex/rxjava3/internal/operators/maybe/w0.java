package io.reactivex.rxjava3.internal.operators.maybe;

import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: MaybeZipArray.java */
/* loaded from: classes8.dex */
public final class w0<T, R> extends io.reactivex.rxjava3.core.q<R> {

    /* compiled from: MaybeZipArray.java */
    public final class a implements l41.o<T, R> {
        @Override // l41.o
        public final R apply(T t12) {
            throw null;
        }
    }

    /* compiled from: MaybeZipArray.java */
    public static final class b<T, R> extends AtomicInteger implements io.reactivex.rxjava3.disposables.d {
        private static final long serialVersionUID = -5556924161382950569L;

        public b() {
            throw null;
        }

        @Override // io.reactivex.rxjava3.disposables.d
        public final void dispose() {
            if (getAndSet(0) > 0) {
                throw null;
            }
        }

        @Override // io.reactivex.rxjava3.disposables.d
        /* renamed from: i */
        public final boolean getF318621e() {
            return get() <= 0;
        }
    }

    /* compiled from: MaybeZipArray.java */
    public static final class c<T> extends AtomicReference<io.reactivex.rxjava3.disposables.d> implements io.reactivex.rxjava3.core.t<T> {
        private static final long serialVersionUID = 3323743579927613702L;

        public c() {
            throw null;
        }

        @Override // io.reactivex.rxjava3.core.t
        public final void b(io.reactivex.rxjava3.disposables.d dVar) {
            DisposableHelper.e(this, dVar);
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
    public final void o(io.reactivex.rxjava3.core.t<? super R> tVar) {
        throw null;
    }
}
