package io.reactivex.rxjava3.internal.jdk8;

import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;
import s41.C47998a;

/* compiled from: ObservableCollectWithCollector.java */
/* loaded from: classes8.dex */
public final class q<T, A, R> extends io.reactivex.rxjava3.core.z<R> {

    /* compiled from: ObservableCollectWithCollector.java */
    public static final class a<T, A, R> extends io.reactivex.rxjava3.internal.observers.n<R> implements io.reactivex.rxjava3.core.G<T> {
        private static final long serialVersionUID = -229544830565448758L;

        /* renamed from: d, reason: collision with root package name */
        public io.reactivex.rxjava3.disposables.d f402075d;

        /* renamed from: e, reason: collision with root package name */
        public boolean f402076e;

        /* renamed from: f, reason: collision with root package name */
        public A f402077f;

        @Override // io.reactivex.rxjava3.core.G
        public final void b(@j41.e io.reactivex.rxjava3.disposables.d dVar) {
            if (DisposableHelper.f(this.f402075d, dVar)) {
                this.f402075d = dVar;
                this.f402118b.b(this);
            }
        }

        @Override // io.reactivex.rxjava3.internal.observers.n, io.reactivex.rxjava3.disposables.d
        public final void dispose() {
            super.dispose();
            this.f402075d.dispose();
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void e() {
            if (this.f402076e) {
                return;
            }
            this.f402076e = true;
            this.f402075d = DisposableHelper.f401986b;
            this.f402077f = null;
            try {
                throw null;
            } catch (Throwable th2) {
                io.reactivex.rxjava3.exceptions.a.a(th2);
                this.f402118b.onError(th2);
            }
        }

        @Override // io.reactivex.rxjava3.internal.observers.n, org.reactivestreams.d
        public final void onError(Throwable th2) {
            if (this.f402076e) {
                C47998a.b(th2);
                return;
            }
            this.f402076e = true;
            this.f402075d = DisposableHelper.f401986b;
            this.f402077f = null;
            this.f402118b.onError(th2);
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void onNext(T t12) {
            if (this.f402076e) {
                return;
            }
            try {
                throw null;
            } catch (Throwable th2) {
                io.reactivex.rxjava3.exceptions.a.a(th2);
                this.f402075d.dispose();
                onError(th2);
            }
        }
    }

    @Override // io.reactivex.rxjava3.core.z
    public final void w0(@j41.e io.reactivex.rxjava3.core.G<? super R> g12) {
        try {
            throw null;
        } catch (Throwable th2) {
            io.reactivex.rxjava3.exceptions.a.a(th2);
            EmptyDisposable.d(th2, g12);
        }
    }
}
