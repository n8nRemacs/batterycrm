package io.reactivex.rxjava3.internal.operators.single;

import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: SingleFlatMapMaybe.java */
/* loaded from: classes8.dex */
public final class D<T, R> extends io.reactivex.rxjava3.core.q<R> {

    /* renamed from: b, reason: collision with root package name */
    public final io.reactivex.rxjava3.core.I f404492b;

    /* renamed from: c, reason: collision with root package name */
    public final l41.o<? super T, ? extends io.reactivex.rxjava3.core.w<? extends R>> f404493c;

    /* compiled from: SingleFlatMapMaybe.java */
    public static final class a<R> implements io.reactivex.rxjava3.core.t<R> {

        /* renamed from: b, reason: collision with root package name */
        public final AtomicReference<io.reactivex.rxjava3.disposables.d> f404494b;

        /* renamed from: c, reason: collision with root package name */
        public final io.reactivex.rxjava3.core.t<? super R> f404495c;

        public a(io.reactivex.rxjava3.core.t tVar, AtomicReference atomicReference) {
            this.f404494b = atomicReference;
            this.f404495c = tVar;
        }

        @Override // io.reactivex.rxjava3.core.t
        public final void b(io.reactivex.rxjava3.disposables.d dVar) {
            DisposableHelper.c(this.f404494b, dVar);
        }

        @Override // io.reactivex.rxjava3.core.t
        public final void e() {
            this.f404495c.e();
        }

        @Override // io.reactivex.rxjava3.core.t
        public final void onError(Throwable th2) {
            this.f404495c.onError(th2);
        }

        @Override // io.reactivex.rxjava3.core.t
        public final void onSuccess(R r12) {
            this.f404495c.onSuccess(r12);
        }
    }

    /* compiled from: SingleFlatMapMaybe.java */
    public static final class b<T, R> extends AtomicReference<io.reactivex.rxjava3.disposables.d> implements io.reactivex.rxjava3.core.L<T>, io.reactivex.rxjava3.disposables.d {
        private static final long serialVersionUID = -5843758257109742742L;

        /* renamed from: b, reason: collision with root package name */
        public final io.reactivex.rxjava3.core.t<? super R> f404496b;

        /* renamed from: c, reason: collision with root package name */
        public final l41.o<? super T, ? extends io.reactivex.rxjava3.core.w<? extends R>> f404497c;

        public b(io.reactivex.rxjava3.core.t<? super R> tVar, l41.o<? super T, ? extends io.reactivex.rxjava3.core.w<? extends R>> oVar) {
            this.f404496b = tVar;
            this.f404497c = oVar;
        }

        @Override // io.reactivex.rxjava3.core.L
        public final void b(io.reactivex.rxjava3.disposables.d dVar) {
            if (DisposableHelper.e(this, dVar)) {
                this.f404496b.b(this);
            }
        }

        @Override // io.reactivex.rxjava3.disposables.d
        public final void dispose() {
            DisposableHelper.a(this);
        }

        @Override // io.reactivex.rxjava3.disposables.d
        /* renamed from: i */
        public final boolean getF318621e() {
            return DisposableHelper.b(get());
        }

        @Override // io.reactivex.rxjava3.core.L
        public final void onError(Throwable th2) {
            this.f404496b.onError(th2);
        }

        @Override // io.reactivex.rxjava3.core.L
        public final void onSuccess(T t12) {
            try {
                io.reactivex.rxjava3.core.w<? extends R> wVarApply = this.f404497c.apply(t12);
                Objects.requireNonNull(wVarApply, "The mapper returned a null MaybeSource");
                io.reactivex.rxjava3.core.w<? extends R> wVar = wVarApply;
                if (getF318621e()) {
                    return;
                }
                wVar.a(new a(this.f404496b, this));
            } catch (Throwable th2) {
                io.reactivex.rxjava3.exceptions.a.a(th2);
                onError(th2);
            }
        }
    }

    public D(io.reactivex.rxjava3.core.I i12, l41.o oVar) {
        this.f404493c = oVar;
        this.f404492b = i12;
    }

    @Override // io.reactivex.rxjava3.core.q
    public final void o(io.reactivex.rxjava3.core.t<? super R> tVar) {
        this.f404492b.a(new b(tVar, this.f404493c));
    }
}
