package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import m41.C43879a;

/* compiled from: ObservableSkipUntil.java */
/* renamed from: io.reactivex.rxjava3.internal.operators.observable.o1, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41976o1<T, U> extends AbstractC41932a<T, T> {

    /* compiled from: ObservableSkipUntil.java */
    /* renamed from: io.reactivex.rxjava3.internal.operators.observable.o1$a */
    public final class a implements io.reactivex.rxjava3.core.G<U> {

        /* renamed from: b, reason: collision with root package name */
        public io.reactivex.rxjava3.disposables.d f404185b;

        public a() {
            throw null;
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void b(io.reactivex.rxjava3.disposables.d dVar) {
            if (DisposableHelper.f(this.f404185b, dVar)) {
                this.f404185b = dVar;
                throw null;
            }
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void e() {
            throw null;
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void onError(Throwable th2) {
            throw null;
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void onNext(U u12) {
            this.f404185b.dispose();
            throw null;
        }
    }

    @Override // io.reactivex.rxjava3.core.z
    public final void w0(io.reactivex.rxjava3.core.G<? super T> g12) {
        new io.reactivex.rxjava3.observers.m(g12).b(new C43879a(2));
        throw null;
    }

    /* compiled from: ObservableSkipUntil.java */
    /* renamed from: io.reactivex.rxjava3.internal.operators.observable.o1$b */
    public static final class b<T> implements io.reactivex.rxjava3.core.G<T> {

        /* renamed from: b, reason: collision with root package name */
        public io.reactivex.rxjava3.disposables.d f404186b;

        public b() {
            throw null;
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void b(io.reactivex.rxjava3.disposables.d dVar) {
            if (DisposableHelper.f(this.f404186b, dVar)) {
                this.f404186b = dVar;
                throw null;
            }
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void e() {
            throw null;
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void onError(Throwable th2) {
            throw null;
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void onNext(T t12) {
        }
    }
}
