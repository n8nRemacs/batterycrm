package io.reactivex.rxjava3.internal.operators.maybe;

import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.Objects;

/* compiled from: MaybeMap.java */
/* loaded from: classes8.dex */
public final class Y<T, R> extends AbstractC41907a<T, R> {

    /* renamed from: c, reason: collision with root package name */
    public final l41.o<? super T, ? extends R> f403185c;

    /* compiled from: MaybeMap.java */
    public static final class a<T, R> implements io.reactivex.rxjava3.core.t<T>, io.reactivex.rxjava3.disposables.d {

        /* renamed from: b, reason: collision with root package name */
        public final io.reactivex.rxjava3.core.t<? super R> f403186b;

        /* renamed from: c, reason: collision with root package name */
        public final l41.o<? super T, ? extends R> f403187c;

        /* renamed from: d, reason: collision with root package name */
        public io.reactivex.rxjava3.disposables.d f403188d;

        public a(io.reactivex.rxjava3.core.t<? super R> tVar, l41.o<? super T, ? extends R> oVar) {
            this.f403186b = tVar;
            this.f403187c = oVar;
        }

        @Override // io.reactivex.rxjava3.core.t
        public final void b(io.reactivex.rxjava3.disposables.d dVar) {
            if (DisposableHelper.f(this.f403188d, dVar)) {
                this.f403188d = dVar;
                this.f403186b.b(this);
            }
        }

        @Override // io.reactivex.rxjava3.disposables.d
        public final void dispose() {
            io.reactivex.rxjava3.disposables.d dVar = this.f403188d;
            this.f403188d = DisposableHelper.f401986b;
            dVar.dispose();
        }

        @Override // io.reactivex.rxjava3.core.t
        public final void e() {
            this.f403186b.e();
        }

        @Override // io.reactivex.rxjava3.disposables.d
        /* renamed from: i */
        public final boolean getF318621e() {
            return this.f403188d.getF318621e();
        }

        @Override // io.reactivex.rxjava3.core.t
        public final void onError(Throwable th2) {
            this.f403186b.onError(th2);
        }

        @Override // io.reactivex.rxjava3.core.t
        public final void onSuccess(T t12) {
            io.reactivex.rxjava3.core.t<? super R> tVar = this.f403186b;
            try {
                R rApply = this.f403187c.apply(t12);
                Objects.requireNonNull(rApply, "The mapper returned a null item");
                tVar.onSuccess(rApply);
            } catch (Throwable th2) {
                io.reactivex.rxjava3.exceptions.a.a(th2);
                tVar.onError(th2);
            }
        }
    }

    public Y(io.reactivex.rxjava3.core.q qVar, l41.o oVar) {
        super(qVar);
        this.f403185c = oVar;
    }

    @Override // io.reactivex.rxjava3.core.q
    public final void o(io.reactivex.rxjava3.core.t<? super R> tVar) {
        this.f403189b.a(new a(tVar, this.f403185c));
    }
}
