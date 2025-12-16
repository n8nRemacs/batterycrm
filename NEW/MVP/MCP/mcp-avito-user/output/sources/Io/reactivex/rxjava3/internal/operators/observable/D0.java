package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.Objects;

/* compiled from: ObservableMaterialize.java */
/* loaded from: classes8.dex */
public final class D0<T> extends AbstractC41932a<T, io.reactivex.rxjava3.core.y<T>> {

    /* compiled from: ObservableMaterialize.java */
    public static final class a<T> implements io.reactivex.rxjava3.core.G<T>, io.reactivex.rxjava3.disposables.d {

        /* renamed from: b, reason: collision with root package name */
        public final io.reactivex.rxjava3.core.G<? super io.reactivex.rxjava3.core.y<T>> f403546b;

        /* renamed from: c, reason: collision with root package name */
        public io.reactivex.rxjava3.disposables.d f403547c;

        public a(io.reactivex.rxjava3.core.G<? super io.reactivex.rxjava3.core.y<T>> g12) {
            this.f403546b = g12;
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void b(io.reactivex.rxjava3.disposables.d dVar) {
            if (DisposableHelper.f(this.f403547c, dVar)) {
                this.f403547c = dVar;
                this.f403546b.b(this);
            }
        }

        @Override // io.reactivex.rxjava3.disposables.d
        public final void dispose() {
            this.f403547c.dispose();
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void e() {
            io.reactivex.rxjava3.core.y<Object> yVar = io.reactivex.rxjava3.core.y.f401974b;
            io.reactivex.rxjava3.core.G<? super io.reactivex.rxjava3.core.y<T>> g12 = this.f403546b;
            g12.onNext(yVar);
            g12.e();
        }

        @Override // io.reactivex.rxjava3.disposables.d
        /* renamed from: i */
        public final boolean getF318621e() {
            return this.f403547c.getF318621e();
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void onError(Throwable th2) {
            io.reactivex.rxjava3.core.y yVarA = io.reactivex.rxjava3.core.y.a(th2);
            io.reactivex.rxjava3.core.G<? super io.reactivex.rxjava3.core.y<T>> g12 = this.f403546b;
            g12.onNext(yVarA);
            g12.e();
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void onNext(T t12) {
            Objects.requireNonNull(t12, "value is null");
            this.f403546b.onNext(new io.reactivex.rxjava3.core.y(t12));
        }
    }

    public D0(io.reactivex.rxjava3.core.z zVar) {
        super(zVar);
    }

    @Override // io.reactivex.rxjava3.core.z
    public final void w0(io.reactivex.rxjava3.core.G<? super io.reactivex.rxjava3.core.y<T>> g12) {
        this.f403951b.c(new a(g12));
    }
}
