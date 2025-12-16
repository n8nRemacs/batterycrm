package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.core.InterfaceC41771d;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: ObservableConcatWithCompletable.java */
/* renamed from: io.reactivex.rxjava3.internal.operators.observable.x, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41997x<T> extends AbstractC41932a<T, T> {

    /* renamed from: c, reason: collision with root package name */
    public final io.reactivex.rxjava3.internal.operators.completable.P f404397c;

    /* compiled from: ObservableConcatWithCompletable.java */
    /* renamed from: io.reactivex.rxjava3.internal.operators.observable.x$a */
    public static final class a<T> extends AtomicReference<io.reactivex.rxjava3.disposables.d> implements io.reactivex.rxjava3.core.G<T>, InterfaceC41771d, io.reactivex.rxjava3.disposables.d {
        private static final long serialVersionUID = -1953724749712440952L;

        /* renamed from: b, reason: collision with root package name */
        public final io.reactivex.rxjava3.core.G<? super T> f404398b;

        /* renamed from: c, reason: collision with root package name */
        public io.reactivex.rxjava3.internal.operators.completable.P f404399c;

        /* renamed from: d, reason: collision with root package name */
        public boolean f404400d;

        public a(io.reactivex.rxjava3.core.G g12, io.reactivex.rxjava3.internal.operators.completable.P p12) {
            this.f404398b = g12;
            this.f404399c = p12;
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void b(io.reactivex.rxjava3.disposables.d dVar) {
            if (!DisposableHelper.e(this, dVar) || this.f404400d) {
                return;
            }
            this.f404398b.b(this);
        }

        @Override // io.reactivex.rxjava3.disposables.d
        public final void dispose() {
            DisposableHelper.a(this);
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void e() {
            if (this.f404400d) {
                this.f404398b.e();
                return;
            }
            this.f404400d = true;
            DisposableHelper.c(this, null);
            io.reactivex.rxjava3.internal.operators.completable.P p12 = this.f404399c;
            this.f404399c = null;
            p12.a(this);
        }

        @Override // io.reactivex.rxjava3.disposables.d
        /* renamed from: i */
        public final boolean getF318621e() {
            return DisposableHelper.b(get());
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void onError(Throwable th2) {
            this.f404398b.onError(th2);
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void onNext(T t12) {
            this.f404398b.onNext(t12);
        }
    }

    public C41997x(io.reactivex.rxjava3.core.z zVar, io.reactivex.rxjava3.internal.operators.completable.P p12) {
        super(zVar);
        this.f404397c = p12;
    }

    @Override // io.reactivex.rxjava3.core.z
    public final void w0(io.reactivex.rxjava3.core.G<? super T> g12) {
        this.f403951b.c(new a(g12, this.f404397c));
    }
}
