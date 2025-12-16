package hu.akarnokd.rxjava3.debug;

import io.reactivex.rxjava3.core.G;
import io.reactivex.rxjava3.internal.fuseable.QueueDisposable;
import io.reactivex.rxjava3.internal.observers.AbstractC41804b;

/* compiled from: ObservableOnAssembly.java */
/* loaded from: classes8.dex */
final class k<T> extends io.reactivex.rxjava3.core.z<T> {

    /* renamed from: b, reason: collision with root package name */
    public final io.reactivex.rxjava3.core.z f397839b;

    /* renamed from: c, reason: collision with root package name */
    public final RxJavaAssemblyException f397840c = new RxJavaAssemblyException();

    /* compiled from: ObservableOnAssembly.java */
    public static final class a<T> extends AbstractC41804b<T, T> {

        /* renamed from: g, reason: collision with root package name */
        public final RxJavaAssemblyException f397841g;

        public a(G<? super T> g12, RxJavaAssemblyException rxJavaAssemblyException) {
            super(g12);
            this.f397841g = rxJavaAssemblyException;
        }

        @Override // io.reactivex.rxjava3.internal.observers.AbstractC41804b, io.reactivex.rxjava3.core.G
        public final void onError(Throwable th2) {
            this.f397841g.a(th2);
            this.f402097b.onError(th2);
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void onNext(T t12) {
            this.f402097b.onNext(t12);
        }

        @Override // q41.g
        public final T poll() {
            return (T) this.qd.poll();
        }

        @Override // io.reactivex.rxjava3.internal.observers.AbstractC41804b, q41.InterfaceC47200c
        public final int v(int i12) {
            QueueDisposable queueDisposable = this.qd;
            if (queueDisposable == null) {
                return 0;
            }
            int iRequestFusion = queueDisposable.requestFusion(i12);
            this.f402101f = iRequestFusion;
            return iRequestFusion;
        }
    }

    public k(io.reactivex.rxjava3.core.z zVar) {
        this.f397839b = zVar;
    }

    @Override // io.reactivex.rxjava3.core.z
    public final void w0(G<? super T> g12) {
        this.f397839b.c(new a(g12, this.f397840c));
    }
}
