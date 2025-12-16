package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: ObservableWithLatestFrom.java */
/* loaded from: classes8.dex */
public final class P1<T, U, R> extends AbstractC41932a<T, R> {

    /* renamed from: c, reason: collision with root package name */
    public final l41.c<? super T, ? super U, ? extends R> f403791c;

    /* renamed from: d, reason: collision with root package name */
    public final io.reactivex.rxjava3.core.E<? extends U> f403792d;

    /* compiled from: ObservableWithLatestFrom.java */
    public static final class a<T, U, R> extends AtomicReference<U> implements io.reactivex.rxjava3.core.G<T>, io.reactivex.rxjava3.disposables.d {
        private static final long serialVersionUID = -312246233408980075L;

        /* renamed from: b, reason: collision with root package name */
        public final io.reactivex.rxjava3.observers.m f403793b;

        /* renamed from: c, reason: collision with root package name */
        public final l41.c<? super T, ? super U, ? extends R> f403794c;

        /* renamed from: d, reason: collision with root package name */
        public final AtomicReference<io.reactivex.rxjava3.disposables.d> f403795d = new AtomicReference<>();

        /* renamed from: e, reason: collision with root package name */
        public final AtomicReference<io.reactivex.rxjava3.disposables.d> f403796e = new AtomicReference<>();

        public a(io.reactivex.rxjava3.observers.m mVar, l41.c cVar) {
            this.f403793b = mVar;
            this.f403794c = cVar;
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void b(io.reactivex.rxjava3.disposables.d dVar) {
            DisposableHelper.e(this.f403795d, dVar);
        }

        @Override // io.reactivex.rxjava3.disposables.d
        public final void dispose() {
            DisposableHelper.a(this.f403795d);
            DisposableHelper.a(this.f403796e);
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void e() {
            DisposableHelper.a(this.f403796e);
            this.f403793b.e();
        }

        @Override // io.reactivex.rxjava3.disposables.d
        /* renamed from: i */
        public final boolean getF318621e() {
            return DisposableHelper.b(this.f403795d.get());
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void onError(Throwable th2) {
            DisposableHelper.a(this.f403796e);
            this.f403793b.onError(th2);
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void onNext(T t12) {
            io.reactivex.rxjava3.observers.m mVar = this.f403793b;
            U u12 = get();
            if (u12 != null) {
                try {
                    R rApply = this.f403794c.apply(t12, u12);
                    Objects.requireNonNull(rApply, "The combiner returned a null value");
                    mVar.onNext(rApply);
                } catch (Throwable th2) {
                    io.reactivex.rxjava3.exceptions.a.a(th2);
                    dispose();
                    mVar.onError(th2);
                }
            }
        }
    }

    public P1(io.reactivex.rxjava3.core.z zVar, io.reactivex.rxjava3.core.E e12, l41.c cVar) {
        super(zVar);
        this.f403791c = cVar;
        this.f403792d = e12;
    }

    @Override // io.reactivex.rxjava3.core.z
    public final void w0(io.reactivex.rxjava3.core.G<? super R> g12) {
        io.reactivex.rxjava3.observers.m mVar = new io.reactivex.rxjava3.observers.m(g12);
        a aVar = new a(mVar, this.f403791c);
        mVar.b(aVar);
        this.f403792d.c(new b(aVar));
        this.f403951b.c(aVar);
    }

    /* compiled from: ObservableWithLatestFrom.java */
    public final class b implements io.reactivex.rxjava3.core.G<U> {

        /* renamed from: b, reason: collision with root package name */
        public final a<T, U, R> f403797b;

        public b(a aVar) {
            this.f403797b = aVar;
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void b(io.reactivex.rxjava3.disposables.d dVar) {
            DisposableHelper.e(this.f403797b.f403796e, dVar);
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void onError(Throwable th2) {
            a<T, U, R> aVar = this.f403797b;
            DisposableHelper.a(aVar.f403795d);
            aVar.f403793b.onError(th2);
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void onNext(U u12) {
            this.f403797b.lazySet(u12);
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void e() {
        }
    }
}
