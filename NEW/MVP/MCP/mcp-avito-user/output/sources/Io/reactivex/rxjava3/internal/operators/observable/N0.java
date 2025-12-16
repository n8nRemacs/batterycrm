package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: ObservablePublishSelector.java */
/* loaded from: classes8.dex */
public final class N0<T, R> extends AbstractC41932a<T, R> {

    /* renamed from: c, reason: collision with root package name */
    public final l41.o<? super io.reactivex.rxjava3.core.z<T>, ? extends io.reactivex.rxjava3.core.E<R>> f403748c;

    /* compiled from: ObservablePublishSelector.java */
    public static final class a<T> implements io.reactivex.rxjava3.core.G<T> {

        /* renamed from: b, reason: collision with root package name */
        public final io.reactivex.rxjava3.subjects.e<T> f403749b;

        /* renamed from: c, reason: collision with root package name */
        public final AtomicReference<io.reactivex.rxjava3.disposables.d> f403750c;

        public a(io.reactivex.rxjava3.subjects.e<T> eVar, AtomicReference<io.reactivex.rxjava3.disposables.d> atomicReference) {
            this.f403749b = eVar;
            this.f403750c = atomicReference;
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void b(io.reactivex.rxjava3.disposables.d dVar) {
            DisposableHelper.e(this.f403750c, dVar);
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void e() {
            this.f403749b.e();
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void onError(Throwable th2) {
            this.f403749b.onError(th2);
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void onNext(T t12) {
            this.f403749b.onNext(t12);
        }
    }

    /* compiled from: ObservablePublishSelector.java */
    public static final class b<R> extends AtomicReference<io.reactivex.rxjava3.disposables.d> implements io.reactivex.rxjava3.core.G<R>, io.reactivex.rxjava3.disposables.d {
        private static final long serialVersionUID = 854110278590336484L;

        /* renamed from: b, reason: collision with root package name */
        public final io.reactivex.rxjava3.core.G<? super R> f403751b;

        /* renamed from: c, reason: collision with root package name */
        public io.reactivex.rxjava3.disposables.d f403752c;

        public b(io.reactivex.rxjava3.core.G<? super R> g12) {
            this.f403751b = g12;
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void b(io.reactivex.rxjava3.disposables.d dVar) {
            if (DisposableHelper.f(this.f403752c, dVar)) {
                this.f403752c = dVar;
                this.f403751b.b(this);
            }
        }

        @Override // io.reactivex.rxjava3.disposables.d
        public final void dispose() {
            this.f403752c.dispose();
            DisposableHelper.a(this);
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void e() {
            DisposableHelper.a(this);
            this.f403751b.e();
        }

        @Override // io.reactivex.rxjava3.disposables.d
        /* renamed from: i */
        public final boolean getF318621e() {
            return this.f403752c.getF318621e();
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void onError(Throwable th2) {
            DisposableHelper.a(this);
            this.f403751b.onError(th2);
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void onNext(R r12) {
            this.f403751b.onNext(r12);
        }
    }

    public N0(io.reactivex.rxjava3.core.z zVar, l41.o oVar) {
        super(zVar);
        this.f403748c = oVar;
    }

    @Override // io.reactivex.rxjava3.core.z
    public final void w0(io.reactivex.rxjava3.core.G<? super R> g12) {
        io.reactivex.rxjava3.subjects.e eVar = new io.reactivex.rxjava3.subjects.e();
        try {
            io.reactivex.rxjava3.core.E<R> eApply = this.f403748c.apply(eVar);
            Objects.requireNonNull(eApply, "The selector returned a null ObservableSource");
            io.reactivex.rxjava3.core.E<R> e12 = eApply;
            b bVar = new b(g12);
            e12.c(bVar);
            this.f403951b.c(new a(eVar, bVar));
        } catch (Throwable th2) {
            io.reactivex.rxjava3.exceptions.a.a(th2);
            EmptyDisposable.d(th2, g12);
        }
    }
}
