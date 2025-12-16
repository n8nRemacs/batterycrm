package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.operators.single.C42022u;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: ObservableConcatWithSingle.java */
/* renamed from: io.reactivex.rxjava3.internal.operators.observable.z, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C42001z<T> extends AbstractC41932a<T, T> {

    /* renamed from: c, reason: collision with root package name */
    public final C42022u f404417c;

    /* compiled from: ObservableConcatWithSingle.java */
    /* renamed from: io.reactivex.rxjava3.internal.operators.observable.z$a */
    public static final class a<T> extends AtomicReference<io.reactivex.rxjava3.disposables.d> implements io.reactivex.rxjava3.core.G<T>, io.reactivex.rxjava3.core.L<T>, io.reactivex.rxjava3.disposables.d {
        private static final long serialVersionUID = -1953724749712440952L;

        /* renamed from: b, reason: collision with root package name */
        public final io.reactivex.rxjava3.core.G<? super T> f404418b;

        /* renamed from: c, reason: collision with root package name */
        public C42022u f404419c;

        /* renamed from: d, reason: collision with root package name */
        public boolean f404420d;

        public a(io.reactivex.rxjava3.core.G g12, C42022u c42022u) {
            this.f404418b = g12;
            this.f404419c = c42022u;
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void b(io.reactivex.rxjava3.disposables.d dVar) {
            if (!DisposableHelper.e(this, dVar) || this.f404420d) {
                return;
            }
            this.f404418b.b(this);
        }

        @Override // io.reactivex.rxjava3.disposables.d
        public final void dispose() {
            DisposableHelper.a(this);
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void e() {
            this.f404420d = true;
            DisposableHelper.c(this, null);
            C42022u c42022u = this.f404419c;
            this.f404419c = null;
            c42022u.a(this);
        }

        @Override // io.reactivex.rxjava3.disposables.d
        /* renamed from: i */
        public final boolean getF318621e() {
            return DisposableHelper.b(get());
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void onError(Throwable th2) {
            this.f404418b.onError(th2);
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void onNext(T t12) {
            this.f404418b.onNext(t12);
        }

        @Override // io.reactivex.rxjava3.core.L
        public final void onSuccess(T t12) {
            io.reactivex.rxjava3.core.G<? super T> g12 = this.f404418b;
            g12.onNext(t12);
            g12.e();
        }
    }

    public C42001z(C41998x0 c41998x0, C42022u c42022u) {
        super(c41998x0);
        this.f404417c = c42022u;
    }

    @Override // io.reactivex.rxjava3.core.z
    public final void w0(io.reactivex.rxjava3.core.G<? super T> g12) {
        this.f403951b.c(new a(g12, this.f404417c));
    }
}
