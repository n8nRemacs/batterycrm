package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: ObservableRepeatUntil.java */
/* loaded from: classes8.dex */
public final class V0<T> extends AbstractC41932a<T, T> {

    /* compiled from: ObservableRepeatUntil.java */
    public static final class a<T> extends AtomicInteger implements io.reactivex.rxjava3.core.G<T> {
        private static final long serialVersionUID = -7098360935104053232L;

        /* renamed from: b, reason: collision with root package name */
        public final io.reactivex.rxjava3.core.G<? super T> f403873b;

        /* renamed from: c, reason: collision with root package name */
        public final m41.d f403874c;

        /* renamed from: d, reason: collision with root package name */
        public final io.reactivex.rxjava3.core.E<? extends T> f403875d;

        public a(io.reactivex.rxjava3.core.G g12, m41.d dVar, io.reactivex.rxjava3.core.E e12) {
            this.f403873b = g12;
            this.f403874c = dVar;
            this.f403875d = e12;
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void b(io.reactivex.rxjava3.disposables.d dVar) {
            m41.d dVar2 = this.f403874c;
            dVar2.getClass();
            DisposableHelper.c(dVar2, dVar);
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void e() {
            try {
                throw null;
            } catch (Throwable th2) {
                io.reactivex.rxjava3.exceptions.a.a(th2);
                this.f403873b.onError(th2);
            }
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void onError(Throwable th2) {
            this.f403873b.onError(th2);
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void onNext(T t12) {
            this.f403873b.onNext(t12);
        }
    }

    @Override // io.reactivex.rxjava3.core.z
    public final void w0(io.reactivex.rxjava3.core.G<? super T> g12) {
        m41.d dVar = new m41.d();
        g12.b(dVar);
        a aVar = new a(g12, dVar, this.f403951b);
        if (aVar.getAndIncrement() == 0) {
            int iAddAndGet = 1;
            do {
                aVar.f403875d.c(aVar);
                iAddAndGet = aVar.addAndGet(-iAddAndGet);
            } while (iAddAndGet != 0);
        }
    }
}
