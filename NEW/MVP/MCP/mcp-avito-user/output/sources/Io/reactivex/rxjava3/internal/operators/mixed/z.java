package io.reactivex.rxjava3.internal.operators.mixed;

import io.reactivex.rxjava3.core.E;
import io.reactivex.rxjava3.core.G;
import io.reactivex.rxjava3.core.I;
import io.reactivex.rxjava3.core.L;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: SingleFlatMapObservable.java */
/* loaded from: classes8.dex */
public final class z<T, R> extends io.reactivex.rxjava3.core.z<R> {

    /* renamed from: b, reason: collision with root package name */
    public final I f403491b;

    /* renamed from: c, reason: collision with root package name */
    public final l41.o<? super T, ? extends E<? extends R>> f403492c;

    /* compiled from: SingleFlatMapObservable.java */
    public static final class a<T, R> extends AtomicReference<io.reactivex.rxjava3.disposables.d> implements G<R>, L<T>, io.reactivex.rxjava3.disposables.d {
        private static final long serialVersionUID = -8948264376121066672L;

        /* renamed from: b, reason: collision with root package name */
        public final G<? super R> f403493b;

        /* renamed from: c, reason: collision with root package name */
        public final l41.o<? super T, ? extends E<? extends R>> f403494c;

        public a(G<? super R> g12, l41.o<? super T, ? extends E<? extends R>> oVar) {
            this.f403493b = g12;
            this.f403494c = oVar;
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void b(io.reactivex.rxjava3.disposables.d dVar) {
            DisposableHelper.c(this, dVar);
        }

        @Override // io.reactivex.rxjava3.disposables.d
        public final void dispose() {
            DisposableHelper.a(this);
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void e() {
            this.f403493b.e();
        }

        @Override // io.reactivex.rxjava3.disposables.d
        /* renamed from: i */
        public final boolean getF318621e() {
            return DisposableHelper.b(get());
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void onError(Throwable th2) {
            this.f403493b.onError(th2);
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void onNext(R r12) {
            this.f403493b.onNext(r12);
        }

        @Override // io.reactivex.rxjava3.core.L
        public final void onSuccess(T t12) {
            try {
                E<? extends R> eApply = this.f403494c.apply(t12);
                Objects.requireNonNull(eApply, "The mapper returned a null Publisher");
                E<? extends R> e12 = eApply;
                if (getF318621e()) {
                    return;
                }
                e12.c(this);
            } catch (Throwable th2) {
                io.reactivex.rxjava3.exceptions.a.a(th2);
                this.f403493b.onError(th2);
            }
        }
    }

    public z(I i12, l41.o oVar) {
        this.f403491b = i12;
        this.f403492c = oVar;
    }

    @Override // io.reactivex.rxjava3.core.z
    public final void w0(G<? super R> g12) {
        a aVar = new a(g12, this.f403492c);
        g12.b(aVar);
        this.f403491b.a(aVar);
    }
}
