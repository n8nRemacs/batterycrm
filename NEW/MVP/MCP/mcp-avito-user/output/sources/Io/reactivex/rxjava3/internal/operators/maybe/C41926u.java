package io.reactivex.rxjava3.internal.operators.maybe;

import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;
import s41.C47998a;

/* compiled from: MaybeDoOnLifecycle.java */
/* renamed from: io.reactivex.rxjava3.internal.operators.maybe.u, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41926u<T> extends AbstractC41907a<T, T> {

    /* compiled from: MaybeDoOnLifecycle.java */
    /* renamed from: io.reactivex.rxjava3.internal.operators.maybe.u$a */
    public static final class a<T> implements io.reactivex.rxjava3.core.t<T>, io.reactivex.rxjava3.disposables.d {

        /* renamed from: b, reason: collision with root package name */
        public final io.reactivex.rxjava3.core.t<? super T> f403326b;

        /* renamed from: c, reason: collision with root package name */
        public io.reactivex.rxjava3.disposables.d f403327c;

        public a(io.reactivex.rxjava3.core.t tVar) {
            this.f403326b = tVar;
        }

        @Override // io.reactivex.rxjava3.core.t
        public final void b(@j41.e io.reactivex.rxjava3.disposables.d dVar) {
            try {
                throw null;
            } catch (Throwable th2) {
                io.reactivex.rxjava3.exceptions.a.a(th2);
                dVar.dispose();
                this.f403327c = DisposableHelper.f401986b;
                EmptyDisposable.c(th2, this.f403326b);
            }
        }

        @Override // io.reactivex.rxjava3.disposables.d
        public final void dispose() {
            try {
                throw null;
            } catch (Throwable th2) {
                io.reactivex.rxjava3.exceptions.a.a(th2);
                C47998a.b(th2);
                this.f403327c.dispose();
                this.f403327c = DisposableHelper.f401986b;
            }
        }

        @Override // io.reactivex.rxjava3.core.t
        public final void e() {
            io.reactivex.rxjava3.disposables.d dVar = this.f403327c;
            DisposableHelper disposableHelper = DisposableHelper.f401986b;
            if (dVar != disposableHelper) {
                this.f403327c = disposableHelper;
                this.f403326b.e();
            }
        }

        @Override // io.reactivex.rxjava3.disposables.d
        /* renamed from: i */
        public final boolean getF318621e() {
            return this.f403327c.getF318621e();
        }

        @Override // io.reactivex.rxjava3.core.t
        public final void onError(@j41.e Throwable th2) {
            io.reactivex.rxjava3.disposables.d dVar = this.f403327c;
            DisposableHelper disposableHelper = DisposableHelper.f401986b;
            if (dVar == disposableHelper) {
                C47998a.b(th2);
            } else {
                this.f403327c = disposableHelper;
                this.f403326b.onError(th2);
            }
        }

        @Override // io.reactivex.rxjava3.core.t
        public final void onSuccess(@j41.e T t12) {
            io.reactivex.rxjava3.disposables.d dVar = this.f403327c;
            DisposableHelper disposableHelper = DisposableHelper.f401986b;
            if (dVar != disposableHelper) {
                this.f403327c = disposableHelper;
                this.f403326b.onSuccess(t12);
            }
        }
    }

    @Override // io.reactivex.rxjava3.core.q
    public final void o(io.reactivex.rxjava3.core.t<? super T> tVar) {
        this.f403189b.a(new a(tVar));
    }
}
