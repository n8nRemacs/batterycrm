package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: ObservableConcatWithMaybe.java */
/* renamed from: io.reactivex.rxjava3.internal.operators.observable.y, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41999y<T> extends AbstractC41932a<T, T> {

    /* compiled from: ObservableConcatWithMaybe.java */
    /* renamed from: io.reactivex.rxjava3.internal.operators.observable.y$a */
    public static final class a<T> extends AtomicReference<io.reactivex.rxjava3.disposables.d> implements io.reactivex.rxjava3.core.G<T>, io.reactivex.rxjava3.core.t<T>, io.reactivex.rxjava3.disposables.d {
        private static final long serialVersionUID = -1953724749712440952L;

        /* renamed from: b, reason: collision with root package name */
        public final io.reactivex.rxjava3.core.G<? super T> f404408b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f404409c;

        public a(io.reactivex.rxjava3.core.G g12) {
            this.f404408b = g12;
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void b(io.reactivex.rxjava3.disposables.d dVar) {
            if (!DisposableHelper.e(this, dVar) || this.f404409c) {
                return;
            }
            this.f404408b.b(this);
        }

        @Override // io.reactivex.rxjava3.disposables.d
        public final void dispose() {
            DisposableHelper.a(this);
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void e() {
            if (this.f404409c) {
                this.f404408b.e();
            } else {
                this.f404409c = true;
                DisposableHelper.c(this, null);
                throw null;
            }
        }

        @Override // io.reactivex.rxjava3.disposables.d
        /* renamed from: i */
        public final boolean getF318621e() {
            return DisposableHelper.b(get());
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void onError(Throwable th2) {
            this.f404408b.onError(th2);
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void onNext(T t12) {
            this.f404408b.onNext(t12);
        }

        @Override // io.reactivex.rxjava3.core.t
        public final void onSuccess(T t12) {
            io.reactivex.rxjava3.core.G<? super T> g12 = this.f404408b;
            g12.onNext(t12);
            g12.e();
        }
    }

    @Override // io.reactivex.rxjava3.core.z
    public final void w0(io.reactivex.rxjava3.core.G<? super T> g12) {
        this.f403951b.c(new a(g12));
    }
}
