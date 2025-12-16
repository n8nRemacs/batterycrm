package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: ObservableSubscribeOn.java */
/* renamed from: io.reactivex.rxjava3.internal.operators.observable.q1, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41982q1<T> extends AbstractC41932a<T, T> {

    /* renamed from: c, reason: collision with root package name */
    public final io.reactivex.rxjava3.core.H f404246c;

    /* compiled from: ObservableSubscribeOn.java */
    /* renamed from: io.reactivex.rxjava3.internal.operators.observable.q1$a */
    public static final class a<T> extends AtomicReference<io.reactivex.rxjava3.disposables.d> implements io.reactivex.rxjava3.core.G<T>, io.reactivex.rxjava3.disposables.d {
        private static final long serialVersionUID = 8094547886072529208L;

        /* renamed from: b, reason: collision with root package name */
        public final io.reactivex.rxjava3.core.G<? super T> f404247b;

        /* renamed from: c, reason: collision with root package name */
        public final AtomicReference<io.reactivex.rxjava3.disposables.d> f404248c = new AtomicReference<>();

        public a(io.reactivex.rxjava3.core.G<? super T> g12) {
            this.f404247b = g12;
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void b(io.reactivex.rxjava3.disposables.d dVar) {
            DisposableHelper.e(this.f404248c, dVar);
        }

        @Override // io.reactivex.rxjava3.disposables.d
        public final void dispose() {
            DisposableHelper.a(this.f404248c);
            DisposableHelper.a(this);
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void e() {
            this.f404247b.e();
        }

        @Override // io.reactivex.rxjava3.disposables.d
        public final boolean i() {
            return DisposableHelper.b(get());
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void onError(Throwable th2) {
            this.f404247b.onError(th2);
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void onNext(T t12) {
            this.f404247b.onNext(t12);
        }
    }

    /* compiled from: ObservableSubscribeOn.java */
    /* renamed from: io.reactivex.rxjava3.internal.operators.observable.q1$b */
    public final class b implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        public final a<T> f404249b;

        public b(a<T> aVar) {
            this.f404249b = aVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            C41982q1 c41982q1 = C41982q1.this;
            c41982q1.f403951b.c(this.f404249b);
        }
    }

    public C41982q1(io.reactivex.rxjava3.core.z zVar, io.reactivex.rxjava3.core.H h12) {
        super(zVar);
        this.f404246c = h12;
    }

    @Override // io.reactivex.rxjava3.core.z
    public final void w0(io.reactivex.rxjava3.core.G<? super T> g12) {
        a aVar = new a(g12);
        g12.b(aVar);
        DisposableHelper.e(aVar, this.f404246c.d(new b(aVar)));
    }
}
