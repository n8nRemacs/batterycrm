package io.reactivex.rxjava3.internal.operators.maybe;

import io.reactivex.rxjava3.core.AbstractC41768a;
import io.reactivex.rxjava3.core.InterfaceC41771d;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: MaybeDelayWithCompletable.java */
/* renamed from: io.reactivex.rxjava3.internal.operators.maybe.o, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41921o<T> extends io.reactivex.rxjava3.core.q<T> {

    /* renamed from: b, reason: collision with root package name */
    public final io.reactivex.rxjava3.core.q f403289b;

    /* renamed from: c, reason: collision with root package name */
    public final AbstractC41768a f403290c;

    /* compiled from: MaybeDelayWithCompletable.java */
    /* renamed from: io.reactivex.rxjava3.internal.operators.maybe.o$a */
    public static final class a<T> implements io.reactivex.rxjava3.core.t<T> {

        /* renamed from: b, reason: collision with root package name */
        public final AtomicReference<io.reactivex.rxjava3.disposables.d> f403291b;

        /* renamed from: c, reason: collision with root package name */
        public final io.reactivex.rxjava3.core.t<? super T> f403292c;

        public a(io.reactivex.rxjava3.core.t tVar, AtomicReference atomicReference) {
            this.f403291b = atomicReference;
            this.f403292c = tVar;
        }

        @Override // io.reactivex.rxjava3.core.t
        public final void b(io.reactivex.rxjava3.disposables.d dVar) {
            DisposableHelper.c(this.f403291b, dVar);
        }

        @Override // io.reactivex.rxjava3.core.t
        public final void e() {
            this.f403292c.e();
        }

        @Override // io.reactivex.rxjava3.core.t
        public final void onError(Throwable th2) {
            this.f403292c.onError(th2);
        }

        @Override // io.reactivex.rxjava3.core.t
        public final void onSuccess(T t12) {
            this.f403292c.onSuccess(t12);
        }
    }

    /* compiled from: MaybeDelayWithCompletable.java */
    /* renamed from: io.reactivex.rxjava3.internal.operators.maybe.o$b */
    public static final class b<T> extends AtomicReference<io.reactivex.rxjava3.disposables.d> implements InterfaceC41771d, io.reactivex.rxjava3.disposables.d {
        private static final long serialVersionUID = 703409937383992161L;

        /* renamed from: b, reason: collision with root package name */
        public final io.reactivex.rxjava3.core.t<? super T> f403293b;

        /* renamed from: c, reason: collision with root package name */
        public final io.reactivex.rxjava3.core.q f403294c;

        public b(io.reactivex.rxjava3.core.t tVar, io.reactivex.rxjava3.core.q qVar) {
            this.f403293b = tVar;
            this.f403294c = qVar;
        }

        @Override // io.reactivex.rxjava3.core.InterfaceC41771d
        public final void b(io.reactivex.rxjava3.disposables.d dVar) {
            if (DisposableHelper.e(this, dVar)) {
                this.f403293b.b(this);
            }
        }

        @Override // io.reactivex.rxjava3.disposables.d
        public final void dispose() {
            DisposableHelper.a(this);
        }

        @Override // io.reactivex.rxjava3.core.InterfaceC41771d
        public final void e() {
            this.f403294c.a(new a(this.f403293b, this));
        }

        @Override // io.reactivex.rxjava3.disposables.d
        /* renamed from: i */
        public final boolean getF318621e() {
            return DisposableHelper.b(get());
        }

        @Override // io.reactivex.rxjava3.core.InterfaceC41771d
        public final void onError(Throwable th2) {
            this.f403293b.onError(th2);
        }
    }

    public C41921o(io.reactivex.rxjava3.core.q qVar, AbstractC41768a abstractC41768a) {
        this.f403289b = qVar;
        this.f403290c = abstractC41768a;
    }

    @Override // io.reactivex.rxjava3.core.q
    public final void o(io.reactivex.rxjava3.core.t<? super T> tVar) {
        this.f403290c.a(new b(tVar, this.f403289b));
    }
}
