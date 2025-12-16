package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: ObservableSkipLastTimed.java */
/* renamed from: io.reactivex.rxjava3.internal.operators.observable.n1, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41973n1<T> extends AbstractC41932a<T, T> {

    /* compiled from: ObservableSkipLastTimed.java */
    /* renamed from: io.reactivex.rxjava3.internal.operators.observable.n1$a */
    public static final class a<T> extends AtomicInteger implements io.reactivex.rxjava3.core.G<T>, io.reactivex.rxjava3.disposables.d {
        private static final long serialVersionUID = -5677354903406201275L;

        /* renamed from: b, reason: collision with root package name */
        public final io.reactivex.rxjava3.core.G<? super T> f404159b;

        /* renamed from: c, reason: collision with root package name */
        public final q41.i<Object> f404160c = new q41.i<>(0);

        /* renamed from: d, reason: collision with root package name */
        public io.reactivex.rxjava3.disposables.d f404161d;

        /* renamed from: e, reason: collision with root package name */
        public volatile boolean f404162e;

        public a(io.reactivex.rxjava3.core.G g12) {
            this.f404159b = g12;
        }

        public final void a() {
            if (getAndIncrement() != 0) {
                return;
            }
            q41.i<Object> iVar = this.f404160c;
            if (this.f404162e) {
                this.f404160c.clear();
            } else {
                throw null;
            }
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void b(io.reactivex.rxjava3.disposables.d dVar) {
            if (DisposableHelper.f(this.f404161d, dVar)) {
                this.f404161d = dVar;
                this.f404159b.b(this);
            }
        }

        @Override // io.reactivex.rxjava3.disposables.d
        public final void dispose() {
            if (this.f404162e) {
                return;
            }
            this.f404162e = true;
            this.f404161d.dispose();
            if (getAndIncrement() == 0) {
                this.f404160c.clear();
            }
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void e() {
            a();
        }

        @Override // io.reactivex.rxjava3.disposables.d
        /* renamed from: i */
        public final boolean getF318621e() {
            return this.f404162e;
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void onError(Throwable th2) {
            a();
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void onNext(T t12) {
            throw null;
        }
    }

    @Override // io.reactivex.rxjava3.core.z
    public final void w0(io.reactivex.rxjava3.core.G<? super T> g12) {
        this.f403951b.c(new a(g12));
    }
}
