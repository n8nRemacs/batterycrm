package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: ObservableRepeat.java */
/* loaded from: classes8.dex */
public final class U0<T> extends AbstractC41932a<T, T> {

    /* compiled from: ObservableRepeat.java */
    public static final class a<T> extends AtomicInteger implements io.reactivex.rxjava3.core.G<T> {
        private static final long serialVersionUID = -7098360935104053232L;

        /* renamed from: b, reason: collision with root package name */
        public final io.reactivex.rxjava3.core.G<? super T> f403868b;

        /* renamed from: c, reason: collision with root package name */
        public final m41.d f403869c;

        /* renamed from: d, reason: collision with root package name */
        public final io.reactivex.rxjava3.core.E<? extends T> f403870d;

        /* renamed from: e, reason: collision with root package name */
        public long f403871e = -1;

        public a(io.reactivex.rxjava3.core.G g12, m41.d dVar, io.reactivex.rxjava3.core.E e12) {
            this.f403868b = g12;
            this.f403869c = dVar;
            this.f403870d = e12;
        }

        public final void a() {
            if (getAndIncrement() == 0) {
                int iAddAndGet = 1;
                while (!this.f403869c.getF318621e()) {
                    this.f403870d.c(this);
                    iAddAndGet = addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                }
            }
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void b(io.reactivex.rxjava3.disposables.d dVar) {
            m41.d dVar2 = this.f403869c;
            dVar2.getClass();
            DisposableHelper.c(dVar2, dVar);
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void e() {
            long j12 = this.f403871e;
            if (j12 != Long.MAX_VALUE) {
                this.f403871e = j12 - 1;
            }
            if (j12 != 0) {
                a();
            } else {
                this.f403868b.e();
            }
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void onError(Throwable th2) {
            this.f403868b.onError(th2);
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void onNext(T t12) {
            this.f403868b.onNext(t12);
        }
    }

    @Override // io.reactivex.rxjava3.core.z
    public final void w0(io.reactivex.rxjava3.core.G<? super T> g12) {
        m41.d dVar = new m41.d();
        g12.b(dVar);
        new a(g12, dVar, this.f403951b).a();
    }
}
