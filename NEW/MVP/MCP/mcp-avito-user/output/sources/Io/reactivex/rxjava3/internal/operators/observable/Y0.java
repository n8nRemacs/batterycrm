package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.exceptions.CompositeException;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: ObservableRetryBiPredicate.java */
/* loaded from: classes8.dex */
public final class Y0<T> extends AbstractC41932a<T, T> {

    /* compiled from: ObservableRetryBiPredicate.java */
    public static final class a<T> extends AtomicInteger implements io.reactivex.rxjava3.core.G<T> {
        private static final long serialVersionUID = -7098360935104053232L;

        /* renamed from: b, reason: collision with root package name */
        public final io.reactivex.rxjava3.core.G<? super T> f403931b;

        /* renamed from: c, reason: collision with root package name */
        public final m41.d f403932c;

        /* renamed from: d, reason: collision with root package name */
        public final io.reactivex.rxjava3.core.E<? extends T> f403933d;

        /* renamed from: e, reason: collision with root package name */
        public int f403934e;

        public a(io.reactivex.rxjava3.core.G g12, m41.d dVar, io.reactivex.rxjava3.core.E e12) {
            this.f403931b = g12;
            this.f403932c = dVar;
            this.f403933d = e12;
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void b(io.reactivex.rxjava3.disposables.d dVar) {
            m41.d dVar2 = this.f403932c;
            dVar2.getClass();
            DisposableHelper.c(dVar2, dVar);
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void e() {
            this.f403931b.e();
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void onError(Throwable th2) {
            try {
                this.f403934e++;
                throw null;
            } catch (Throwable th3) {
                io.reactivex.rxjava3.exceptions.a.a(th3);
                this.f403931b.onError(new CompositeException(th2, th3));
            }
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void onNext(T t12) {
            this.f403931b.onNext(t12);
        }
    }

    @Override // io.reactivex.rxjava3.core.z
    public final void w0(io.reactivex.rxjava3.core.G<? super T> g12) {
        m41.d dVar = new m41.d();
        g12.b(dVar);
        a aVar = new a(g12, dVar, this.f403951b);
        if (aVar.getAndIncrement() == 0) {
            int iAddAndGet = 1;
            while (!aVar.f403932c.getF318621e()) {
                aVar.f403933d.c(aVar);
                iAddAndGet = aVar.addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
            }
        }
    }
}
