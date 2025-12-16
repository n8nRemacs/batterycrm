package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicBoolean;
import s41.C47998a;

/* compiled from: ObservableUnsubscribeOn.java */
/* loaded from: classes8.dex */
public final class I1<T> extends AbstractC41932a<T, T> {

    /* renamed from: c, reason: collision with root package name */
    public final io.reactivex.rxjava3.core.H f403667c;

    /* compiled from: ObservableUnsubscribeOn.java */
    public static final class a<T> extends AtomicBoolean implements io.reactivex.rxjava3.core.G<T>, io.reactivex.rxjava3.disposables.d {
        private static final long serialVersionUID = 1015244841293359600L;

        /* renamed from: b, reason: collision with root package name */
        public final io.reactivex.rxjava3.core.G<? super T> f403668b;

        /* renamed from: c, reason: collision with root package name */
        public final io.reactivex.rxjava3.core.H f403669c;

        /* renamed from: d, reason: collision with root package name */
        public io.reactivex.rxjava3.disposables.d f403670d;

        /* compiled from: ObservableUnsubscribeOn.java */
        /* renamed from: io.reactivex.rxjava3.internal.operators.observable.I1$a$a, reason: collision with other inner class name */
        public final class RunnableC11493a implements Runnable {
            public RunnableC11493a() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                a.this.f403670d.dispose();
            }
        }

        public a(io.reactivex.rxjava3.core.G<? super T> g12, io.reactivex.rxjava3.core.H h12) {
            this.f403668b = g12;
            this.f403669c = h12;
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void b(io.reactivex.rxjava3.disposables.d dVar) {
            if (DisposableHelper.f(this.f403670d, dVar)) {
                this.f403670d = dVar;
                this.f403668b.b(this);
            }
        }

        @Override // io.reactivex.rxjava3.disposables.d
        public final void dispose() {
            if (compareAndSet(false, true)) {
                this.f403669c.d(new RunnableC11493a());
            }
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void e() {
            if (get()) {
                return;
            }
            this.f403668b.e();
        }

        @Override // io.reactivex.rxjava3.disposables.d
        /* renamed from: i */
        public final boolean getF318621e() {
            return get();
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void onError(Throwable th2) {
            if (get()) {
                C47998a.b(th2);
            } else {
                this.f403668b.onError(th2);
            }
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void onNext(T t12) {
            if (get()) {
                return;
            }
            this.f403668b.onNext(t12);
        }
    }

    public I1(io.reactivex.rxjava3.core.z zVar, io.reactivex.rxjava3.core.H h12) {
        super(zVar);
        this.f403667c = h12;
    }

    @Override // io.reactivex.rxjava3.core.z
    public final void w0(io.reactivex.rxjava3.core.G<? super T> g12) {
        this.f403951b.c(new a(g12, this.f403667c));
    }
}
