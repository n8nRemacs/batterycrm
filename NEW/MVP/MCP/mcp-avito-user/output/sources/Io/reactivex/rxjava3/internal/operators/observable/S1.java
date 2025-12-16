package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;
import s41.C47998a;

/* compiled from: ObservableZipIterable.java */
/* loaded from: classes8.dex */
public final class S1<T, U, V> extends io.reactivex.rxjava3.core.z<V> {

    /* compiled from: ObservableZipIterable.java */
    public static final class a<T, U, V> implements io.reactivex.rxjava3.core.G<T>, io.reactivex.rxjava3.disposables.d {

        /* renamed from: b, reason: collision with root package name */
        public io.reactivex.rxjava3.disposables.d f403843b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f403844c;

        public a() {
            throw null;
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void b(io.reactivex.rxjava3.disposables.d dVar) {
            if (DisposableHelper.f(this.f403843b, dVar)) {
                this.f403843b = dVar;
                throw null;
            }
        }

        @Override // io.reactivex.rxjava3.disposables.d
        public final void dispose() {
            this.f403843b.dispose();
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void e() {
            if (this.f403844c) {
                return;
            }
            this.f403844c = true;
            throw null;
        }

        @Override // io.reactivex.rxjava3.disposables.d
        /* renamed from: i */
        public final boolean getF318621e() {
            return this.f403843b.getF318621e();
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void onError(Throwable th2) {
            if (this.f403844c) {
                C47998a.b(th2);
            } else {
                this.f403844c = true;
                throw null;
            }
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void onNext(T t12) {
            throw null;
        }
    }

    @Override // io.reactivex.rxjava3.core.z
    public final void w0(io.reactivex.rxjava3.core.G<? super V> g12) {
        try {
            throw null;
        } catch (Throwable th2) {
            io.reactivex.rxjava3.exceptions.a.a(th2);
            EmptyDisposable.d(th2, g12);
        }
    }
}
