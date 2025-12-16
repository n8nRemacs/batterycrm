package io.reactivex.rxjava3.internal.operators.maybe;

import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: MaybeFlatten.java */
/* loaded from: classes8.dex */
public final class I<T, R> extends AbstractC41907a<T, R> {

    /* renamed from: c, reason: collision with root package name */
    public final l41.o<? super T, ? extends io.reactivex.rxjava3.core.w<? extends R>> f403159c;

    /* compiled from: MaybeFlatten.java */
    public static final class a<T, R> extends AtomicReference<io.reactivex.rxjava3.disposables.d> implements io.reactivex.rxjava3.core.t<T>, io.reactivex.rxjava3.disposables.d {
        private static final long serialVersionUID = 4375739915521278546L;

        /* renamed from: b, reason: collision with root package name */
        public final io.reactivex.rxjava3.core.t<? super R> f403160b;

        /* renamed from: c, reason: collision with root package name */
        public final l41.o<? super T, ? extends io.reactivex.rxjava3.core.w<? extends R>> f403161c;

        /* renamed from: d, reason: collision with root package name */
        public io.reactivex.rxjava3.disposables.d f403162d;

        /* compiled from: MaybeFlatten.java */
        /* renamed from: io.reactivex.rxjava3.internal.operators.maybe.I$a$a, reason: collision with other inner class name */
        public final class C11468a implements io.reactivex.rxjava3.core.t<R> {
            public C11468a() {
            }

            @Override // io.reactivex.rxjava3.core.t
            public final void b(io.reactivex.rxjava3.disposables.d dVar) {
                DisposableHelper.e(a.this, dVar);
            }

            @Override // io.reactivex.rxjava3.core.t
            public final void e() {
                a.this.f403160b.e();
            }

            @Override // io.reactivex.rxjava3.core.t
            public final void onError(Throwable th2) {
                a.this.f403160b.onError(th2);
            }

            @Override // io.reactivex.rxjava3.core.t
            public final void onSuccess(R r12) {
                a.this.f403160b.onSuccess(r12);
            }
        }

        public a(io.reactivex.rxjava3.core.t<? super R> tVar, l41.o<? super T, ? extends io.reactivex.rxjava3.core.w<? extends R>> oVar) {
            this.f403160b = tVar;
            this.f403161c = oVar;
        }

        @Override // io.reactivex.rxjava3.core.t
        public final void b(io.reactivex.rxjava3.disposables.d dVar) {
            if (DisposableHelper.f(this.f403162d, dVar)) {
                this.f403162d = dVar;
                this.f403160b.b(this);
            }
        }

        @Override // io.reactivex.rxjava3.disposables.d
        public final void dispose() {
            DisposableHelper.a(this);
            this.f403162d.dispose();
        }

        @Override // io.reactivex.rxjava3.core.t
        public final void e() {
            this.f403160b.e();
        }

        @Override // io.reactivex.rxjava3.disposables.d
        /* renamed from: i */
        public final boolean getF318621e() {
            return DisposableHelper.b(get());
        }

        @Override // io.reactivex.rxjava3.core.t
        public final void onError(Throwable th2) {
            this.f403160b.onError(th2);
        }

        @Override // io.reactivex.rxjava3.core.t
        public final void onSuccess(T t12) {
            try {
                io.reactivex.rxjava3.core.w<? extends R> wVarApply = this.f403161c.apply(t12);
                Objects.requireNonNull(wVarApply, "The mapper returned a null MaybeSource");
                io.reactivex.rxjava3.core.w<? extends R> wVar = wVarApply;
                if (getF318621e()) {
                    return;
                }
                wVar.a(new C11468a());
            } catch (Throwable th2) {
                io.reactivex.rxjava3.exceptions.a.a(th2);
                this.f403160b.onError(th2);
            }
        }
    }

    public I(io.reactivex.rxjava3.core.q qVar, l41.o oVar) {
        super(qVar);
        this.f403159c = oVar;
    }

    @Override // io.reactivex.rxjava3.core.q
    public final void o(io.reactivex.rxjava3.core.t<? super R> tVar) {
        this.f403189b.a(new a(tVar, this.f403159c));
    }
}
