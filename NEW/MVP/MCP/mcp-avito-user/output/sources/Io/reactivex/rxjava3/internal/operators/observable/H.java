package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import s41.C47998a;

/* compiled from: ObservableDelaySubscriptionOther.java */
/* loaded from: classes8.dex */
public final class H<T, U> extends io.reactivex.rxjava3.core.z<T> {

    /* renamed from: b, reason: collision with root package name */
    public final io.reactivex.rxjava3.core.z f403637b;

    /* renamed from: c, reason: collision with root package name */
    public final io.reactivex.rxjava3.core.z f403638c;

    /* compiled from: ObservableDelaySubscriptionOther.java */
    public final class a implements io.reactivex.rxjava3.core.G<U> {

        /* renamed from: b, reason: collision with root package name */
        public final m41.d f403639b;

        /* renamed from: c, reason: collision with root package name */
        public final io.reactivex.rxjava3.core.G<? super T> f403640c;

        /* renamed from: d, reason: collision with root package name */
        public boolean f403641d;

        /* compiled from: ObservableDelaySubscriptionOther.java */
        /* renamed from: io.reactivex.rxjava3.internal.operators.observable.H$a$a, reason: collision with other inner class name */
        public final class C11492a implements io.reactivex.rxjava3.core.G<T> {
            public C11492a() {
            }

            @Override // io.reactivex.rxjava3.core.G
            public final void b(io.reactivex.rxjava3.disposables.d dVar) {
                m41.d dVar2 = a.this.f403639b;
                dVar2.getClass();
                DisposableHelper.d(dVar2, dVar);
            }

            @Override // io.reactivex.rxjava3.core.G
            public final void e() {
                a.this.f403640c.e();
            }

            @Override // io.reactivex.rxjava3.core.G
            public final void onError(Throwable th2) {
                a.this.f403640c.onError(th2);
            }

            @Override // io.reactivex.rxjava3.core.G
            public final void onNext(T t12) {
                a.this.f403640c.onNext(t12);
            }
        }

        public a(m41.d dVar, io.reactivex.rxjava3.core.G<? super T> g12) {
            this.f403639b = dVar;
            this.f403640c = g12;
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void b(io.reactivex.rxjava3.disposables.d dVar) {
            m41.d dVar2 = this.f403639b;
            dVar2.getClass();
            DisposableHelper.d(dVar2, dVar);
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void e() {
            if (this.f403641d) {
                return;
            }
            this.f403641d = true;
            H h12 = H.this;
            h12.f403637b.c(new C11492a());
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void onError(Throwable th2) {
            if (this.f403641d) {
                C47998a.b(th2);
            } else {
                this.f403641d = true;
                this.f403640c.onError(th2);
            }
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void onNext(U u12) {
            e();
        }
    }

    public H(io.reactivex.rxjava3.core.z zVar, io.reactivex.rxjava3.core.z zVar2) {
        this.f403637b = zVar;
        this.f403638c = zVar2;
    }

    @Override // io.reactivex.rxjava3.core.z
    public final void w0(io.reactivex.rxjava3.core.G<? super T> g12) {
        m41.d dVar = new m41.d();
        g12.b(dVar);
        this.f403638c.c(new a(dVar, g12));
    }
}
