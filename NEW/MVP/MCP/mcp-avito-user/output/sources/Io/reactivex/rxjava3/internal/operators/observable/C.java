package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import m41.C43880b;
import s41.C47998a;

/* compiled from: ObservableCreate.java */
/* loaded from: classes8.dex */
public final class C<T> extends io.reactivex.rxjava3.core.z<T> {

    /* renamed from: b, reason: collision with root package name */
    public final io.reactivex.rxjava3.core.C<T> f403528b;

    /* compiled from: ObservableCreate.java */
    public static final class a<T> extends AtomicReference<io.reactivex.rxjava3.disposables.d> implements io.reactivex.rxjava3.core.B<T>, io.reactivex.rxjava3.disposables.d {
        private static final long serialVersionUID = -3434801548987643227L;

        /* renamed from: b, reason: collision with root package name */
        public final io.reactivex.rxjava3.core.G<? super T> f403529b;

        public a(io.reactivex.rxjava3.core.G<? super T> g12) {
            this.f403529b = g12;
        }

        @Override // io.reactivex.rxjava3.core.B
        public final void a(io.reactivex.rxjava3.disposables.d dVar) {
            DisposableHelper.d(this, dVar);
        }

        @Override // io.reactivex.rxjava3.disposables.d
        public final void dispose() {
            DisposableHelper.a(this);
        }

        @Override // io.reactivex.rxjava3.core.InterfaceC41776i
        public final void e() {
            if (i()) {
                return;
            }
            try {
                this.f403529b.e();
            } finally {
                DisposableHelper.a(this);
            }
        }

        @Override // io.reactivex.rxjava3.core.B
        public final void f(l41.f fVar) {
            DisposableHelper.d(this, new C43880b(fVar));
        }

        @Override // io.reactivex.rxjava3.core.B
        public final boolean g(Throwable th2) {
            if (th2 == null) {
                th2 = io.reactivex.rxjava3.internal.util.h.b("onError called with a null Throwable.");
            }
            if (i()) {
                return false;
            }
            try {
                this.f403529b.onError(th2);
                DisposableHelper.a(this);
                return true;
            } catch (Throwable th3) {
                DisposableHelper.a(this);
                throw th3;
            }
        }

        @Override // io.reactivex.rxjava3.core.B, io.reactivex.rxjava3.disposables.d
        public final boolean i() {
            return DisposableHelper.b(get());
        }

        @Override // io.reactivex.rxjava3.core.InterfaceC41776i
        public final void onError(Throwable th2) {
            if (g(th2)) {
                return;
            }
            C47998a.b(th2);
        }

        @Override // io.reactivex.rxjava3.core.InterfaceC41776i
        public final void onNext(T t12) {
            if (t12 == null) {
                onError(io.reactivex.rxjava3.internal.util.h.b("onNext called with a null value."));
            } else {
                if (i()) {
                    return;
                }
                this.f403529b.onNext(t12);
            }
        }

        @Override // java.util.concurrent.atomic.AtomicReference
        public final String toString() {
            return androidx.media3.exoplayer.analytics.m.l(a.class.getSimpleName(), "{", super.toString(), "}");
        }
    }

    /* compiled from: ObservableCreate.java */
    public static final class b<T> extends AtomicInteger implements io.reactivex.rxjava3.core.B<T> {
        private static final long serialVersionUID = 4883307006032401862L;

        @Override // io.reactivex.rxjava3.core.B
        public final void a(io.reactivex.rxjava3.disposables.d dVar) {
            throw null;
        }

        @Override // io.reactivex.rxjava3.core.InterfaceC41776i
        public final void e() {
            throw null;
        }

        @Override // io.reactivex.rxjava3.core.B
        public final void f(l41.f fVar) {
            throw null;
        }

        @Override // io.reactivex.rxjava3.core.B
        public final boolean g(Throwable th2) {
            throw null;
        }

        @Override // io.reactivex.rxjava3.core.B, io.reactivex.rxjava3.disposables.d
        public final boolean i() {
            throw null;
        }

        @Override // io.reactivex.rxjava3.core.InterfaceC41776i
        public final void onError(Throwable th2) {
            g(th2);
            C47998a.b(th2);
        }

        @Override // io.reactivex.rxjava3.core.InterfaceC41776i
        public final void onNext(T t12) {
            throw null;
        }

        @Override // java.util.concurrent.atomic.AtomicInteger
        public final String toString() {
            throw null;
        }
    }

    public C(io.reactivex.rxjava3.core.C<T> c12) {
        this.f403528b = c12;
    }

    @Override // io.reactivex.rxjava3.core.z
    public final void w0(io.reactivex.rxjava3.core.G<? super T> g12) {
        a aVar = new a(g12);
        g12.b(aVar);
        try {
            this.f403528b.f(aVar);
        } catch (Throwable th2) {
            io.reactivex.rxjava3.exceptions.a.a(th2);
            aVar.onError(th2);
        }
    }
}
