package io.reactivex.rxjava3.internal.operators.maybe;

import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;
import java.util.concurrent.atomic.AtomicReference;
import s41.C47998a;

/* compiled from: MaybeUsing.java */
/* loaded from: classes8.dex */
public final class v0<T, D> extends io.reactivex.rxjava3.core.q<T> {

    /* compiled from: MaybeUsing.java */
    public static final class a<T, D> extends AtomicReference<Object> implements io.reactivex.rxjava3.core.t<T>, io.reactivex.rxjava3.disposables.d {
        private static final long serialVersionUID = -674404550052917487L;

        /* renamed from: b, reason: collision with root package name */
        public io.reactivex.rxjava3.disposables.d f403334b;

        public a() {
            throw null;
        }

        @Override // io.reactivex.rxjava3.core.t
        public final void b(io.reactivex.rxjava3.disposables.d dVar) {
            if (DisposableHelper.f(this.f403334b, dVar)) {
                this.f403334b = dVar;
                throw null;
            }
        }

        @Override // io.reactivex.rxjava3.disposables.d
        public final void dispose() {
            DisposableHelper disposableHelper = DisposableHelper.f401986b;
            this.f403334b.dispose();
            this.f403334b = disposableHelper;
            if (getAndSet(this) == this) {
                return;
            }
            try {
                throw null;
            } catch (Throwable th2) {
                io.reactivex.rxjava3.exceptions.a.a(th2);
                C47998a.b(th2);
            }
        }

        @Override // io.reactivex.rxjava3.core.t
        public final void e() {
            this.f403334b = DisposableHelper.f401986b;
            throw null;
        }

        @Override // io.reactivex.rxjava3.disposables.d
        /* renamed from: i */
        public final boolean getF318621e() {
            return this.f403334b.getF318621e();
        }

        @Override // io.reactivex.rxjava3.core.t
        public final void onError(Throwable th2) {
            this.f403334b = DisposableHelper.f401986b;
            throw null;
        }

        @Override // io.reactivex.rxjava3.core.t
        public final void onSuccess(T t12) {
            this.f403334b = DisposableHelper.f401986b;
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
