package io.reactivex.rxjava3.internal.operators.maybe;

import io.reactivex.rxjava3.exceptions.CompositeException;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: MaybeOnErrorNext.java */
/* loaded from: classes8.dex */
public final class e0<T> extends AbstractC41907a<T, T> {

    /* renamed from: c, reason: collision with root package name */
    public final l41.o<? super Throwable, ? extends io.reactivex.rxjava3.core.w<? extends T>> f403215c;

    /* compiled from: MaybeOnErrorNext.java */
    public static final class a<T> extends AtomicReference<io.reactivex.rxjava3.disposables.d> implements io.reactivex.rxjava3.core.t<T>, io.reactivex.rxjava3.disposables.d {
        private static final long serialVersionUID = 2026620218879969836L;

        /* renamed from: b, reason: collision with root package name */
        public final io.reactivex.rxjava3.core.t<? super T> f403216b;

        /* renamed from: c, reason: collision with root package name */
        public final l41.o<? super Throwable, ? extends io.reactivex.rxjava3.core.w<? extends T>> f403217c;

        /* compiled from: MaybeOnErrorNext.java */
        /* renamed from: io.reactivex.rxjava3.internal.operators.maybe.e0$a$a, reason: collision with other inner class name */
        public static final class C11469a<T> implements io.reactivex.rxjava3.core.t<T> {

            /* renamed from: b, reason: collision with root package name */
            public final io.reactivex.rxjava3.core.t<? super T> f403218b;

            /* renamed from: c, reason: collision with root package name */
            public final AtomicReference<io.reactivex.rxjava3.disposables.d> f403219c;

            public C11469a(io.reactivex.rxjava3.core.t<? super T> tVar, AtomicReference<io.reactivex.rxjava3.disposables.d> atomicReference) {
                this.f403218b = tVar;
                this.f403219c = atomicReference;
            }

            @Override // io.reactivex.rxjava3.core.t
            public final void b(io.reactivex.rxjava3.disposables.d dVar) {
                DisposableHelper.e(this.f403219c, dVar);
            }

            @Override // io.reactivex.rxjava3.core.t
            public final void e() {
                this.f403218b.e();
            }

            @Override // io.reactivex.rxjava3.core.t
            public final void onError(Throwable th2) {
                this.f403218b.onError(th2);
            }

            @Override // io.reactivex.rxjava3.core.t
            public final void onSuccess(T t12) {
                this.f403218b.onSuccess(t12);
            }
        }

        public a(io.reactivex.rxjava3.core.t<? super T> tVar, l41.o<? super Throwable, ? extends io.reactivex.rxjava3.core.w<? extends T>> oVar) {
            this.f403216b = tVar;
            this.f403217c = oVar;
        }

        @Override // io.reactivex.rxjava3.core.t
        public final void b(io.reactivex.rxjava3.disposables.d dVar) {
            if (DisposableHelper.e(this, dVar)) {
                this.f403216b.b(this);
            }
        }

        @Override // io.reactivex.rxjava3.disposables.d
        public final void dispose() {
            DisposableHelper.a(this);
        }

        @Override // io.reactivex.rxjava3.core.t
        public final void e() {
            this.f403216b.e();
        }

        @Override // io.reactivex.rxjava3.disposables.d
        /* renamed from: i */
        public final boolean getF318621e() {
            return DisposableHelper.b(get());
        }

        @Override // io.reactivex.rxjava3.core.t
        public final void onError(Throwable th2) {
            io.reactivex.rxjava3.core.t<? super T> tVar = this.f403216b;
            try {
                io.reactivex.rxjava3.core.w<? extends T> wVarApply = this.f403217c.apply(th2);
                Objects.requireNonNull(wVarApply, "The resumeFunction returned a null MaybeSource");
                io.reactivex.rxjava3.core.w<? extends T> wVar = wVarApply;
                DisposableHelper.c(this, null);
                wVar.a(new C11469a(tVar, this));
            } catch (Throwable th3) {
                io.reactivex.rxjava3.exceptions.a.a(th3);
                tVar.onError(new CompositeException(th2, th3));
            }
        }

        @Override // io.reactivex.rxjava3.core.t
        public final void onSuccess(T t12) {
            this.f403216b.onSuccess(t12);
        }
    }

    public e0(io.reactivex.rxjava3.core.q qVar, l41.o oVar) {
        super(qVar);
        this.f403215c = oVar;
    }

    @Override // io.reactivex.rxjava3.core.q
    public final void o(io.reactivex.rxjava3.core.t<? super T> tVar) {
        this.f403189b.a(new a(tVar, this.f403215c));
    }
}
