package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.exceptions.CompositeException;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: ObservableRetryPredicate.java */
/* loaded from: classes8.dex */
public final class Z0<T> extends AbstractC41932a<T, T> {

    /* renamed from: c, reason: collision with root package name */
    public final l41.r<? super Throwable> f403944c;

    /* renamed from: d, reason: collision with root package name */
    public final long f403945d;

    /* compiled from: ObservableRetryPredicate.java */
    public static final class a<T> extends AtomicInteger implements io.reactivex.rxjava3.core.G<T> {
        private static final long serialVersionUID = -7098360935104053232L;

        /* renamed from: b, reason: collision with root package name */
        public final io.reactivex.rxjava3.core.G<? super T> f403946b;

        /* renamed from: c, reason: collision with root package name */
        public final m41.d f403947c;

        /* renamed from: d, reason: collision with root package name */
        public final io.reactivex.rxjava3.core.E<? extends T> f403948d;

        /* renamed from: e, reason: collision with root package name */
        public final l41.r<? super Throwable> f403949e;

        /* renamed from: f, reason: collision with root package name */
        public long f403950f;

        public a(io.reactivex.rxjava3.core.G<? super T> g12, long j12, l41.r<? super Throwable> rVar, m41.d dVar, io.reactivex.rxjava3.core.E<? extends T> e12) {
            this.f403946b = g12;
            this.f403947c = dVar;
            this.f403948d = e12;
            this.f403949e = rVar;
            this.f403950f = j12;
        }

        public final void a() {
            if (getAndIncrement() == 0) {
                int iAddAndGet = 1;
                while (!this.f403947c.getF318621e()) {
                    this.f403948d.c(this);
                    iAddAndGet = addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                }
            }
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void b(io.reactivex.rxjava3.disposables.d dVar) {
            m41.d dVar2 = this.f403947c;
            dVar2.getClass();
            DisposableHelper.c(dVar2, dVar);
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void e() {
            this.f403946b.e();
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void onError(Throwable th2) {
            long j12 = this.f403950f;
            if (j12 != Long.MAX_VALUE) {
                this.f403950f = j12 - 1;
            }
            io.reactivex.rxjava3.core.G<? super T> g12 = this.f403946b;
            if (j12 == 0) {
                g12.onError(th2);
                return;
            }
            try {
                if (this.f403949e.test(th2)) {
                    a();
                } else {
                    g12.onError(th2);
                }
            } catch (Throwable th3) {
                io.reactivex.rxjava3.exceptions.a.a(th3);
                g12.onError(new CompositeException(th2, th3));
            }
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void onNext(T t12) {
            this.f403946b.onNext(t12);
        }
    }

    public Z0(io.reactivex.rxjava3.core.z zVar, l41.r rVar) {
        super(zVar);
        this.f403944c = rVar;
        this.f403945d = Long.MAX_VALUE;
    }

    @Override // io.reactivex.rxjava3.core.z
    public final void w0(io.reactivex.rxjava3.core.G<? super T> g12) {
        m41.d dVar = new m41.d();
        g12.b(dVar);
        new a(g12, this.f403945d, this.f403944c, dVar, this.f403951b).a();
    }
}
