package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: ObservableTakeUntil.java */
/* loaded from: classes8.dex */
public final class x1<T, U> extends AbstractC41932a<T, T> {

    /* renamed from: c, reason: collision with root package name */
    public final io.reactivex.rxjava3.core.z f404402c;

    /* compiled from: ObservableTakeUntil.java */
    public static final class a<T, U> extends AtomicInteger implements io.reactivex.rxjava3.core.G<T>, io.reactivex.rxjava3.disposables.d {
        private static final long serialVersionUID = 1418547743690811973L;

        /* renamed from: b, reason: collision with root package name */
        public final io.reactivex.rxjava3.core.G<? super T> f404403b;

        /* renamed from: c, reason: collision with root package name */
        public final AtomicReference<io.reactivex.rxjava3.disposables.d> f404404c = new AtomicReference<>();

        /* renamed from: d, reason: collision with root package name */
        public final a<T, U>.C11505a f404405d = new C11505a();

        /* renamed from: e, reason: collision with root package name */
        public final io.reactivex.rxjava3.internal.util.b f404406e = new io.reactivex.rxjava3.internal.util.b();

        /* compiled from: ObservableTakeUntil.java */
        /* renamed from: io.reactivex.rxjava3.internal.operators.observable.x1$a$a, reason: collision with other inner class name */
        public final class C11505a extends AtomicReference<io.reactivex.rxjava3.disposables.d> implements io.reactivex.rxjava3.core.G<U> {
            private static final long serialVersionUID = -8693423678067375039L;

            public C11505a() {
            }

            @Override // io.reactivex.rxjava3.core.G
            public final void b(io.reactivex.rxjava3.disposables.d dVar) {
                DisposableHelper.e(this, dVar);
            }

            @Override // io.reactivex.rxjava3.core.G
            public final void e() {
                a aVar = a.this;
                DisposableHelper.a(aVar.f404404c);
                io.reactivex.rxjava3.internal.util.i.a(aVar.f404403b, aVar, aVar.f404406e);
            }

            @Override // io.reactivex.rxjava3.core.G
            public final void onError(Throwable th2) {
                a aVar = a.this;
                DisposableHelper.a(aVar.f404404c);
                io.reactivex.rxjava3.internal.util.i.c(aVar.f404403b, th2, aVar, aVar.f404406e);
            }

            @Override // io.reactivex.rxjava3.core.G
            public final void onNext(U u12) {
                DisposableHelper.a(this);
                a aVar = a.this;
                DisposableHelper.a(aVar.f404404c);
                io.reactivex.rxjava3.internal.util.i.a(aVar.f404403b, aVar, aVar.f404406e);
            }
        }

        public a(io.reactivex.rxjava3.core.G<? super T> g12) {
            this.f404403b = g12;
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void b(io.reactivex.rxjava3.disposables.d dVar) {
            DisposableHelper.e(this.f404404c, dVar);
        }

        @Override // io.reactivex.rxjava3.disposables.d
        public final void dispose() {
            DisposableHelper.a(this.f404404c);
            DisposableHelper.a(this.f404405d);
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void e() {
            DisposableHelper.a(this.f404405d);
            io.reactivex.rxjava3.internal.util.i.a(this.f404403b, this, this.f404406e);
        }

        @Override // io.reactivex.rxjava3.disposables.d
        /* renamed from: i */
        public final boolean getF318621e() {
            return DisposableHelper.b(this.f404404c.get());
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void onError(Throwable th2) {
            DisposableHelper.a(this.f404405d);
            io.reactivex.rxjava3.internal.util.i.c(this.f404403b, th2, this, this.f404406e);
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void onNext(T t12) {
            io.reactivex.rxjava3.internal.util.i.e(this.f404403b, t12, this, this.f404406e);
        }
    }

    public x1(io.reactivex.rxjava3.core.z zVar, io.reactivex.rxjava3.core.z zVar2) {
        super(zVar);
        this.f404402c = zVar2;
    }

    @Override // io.reactivex.rxjava3.core.z
    public final void w0(io.reactivex.rxjava3.core.G<? super T> g12) {
        a aVar = new a(g12);
        g12.b(aVar);
        this.f404402c.c(aVar.f404405d);
        this.f403951b.c(aVar);
    }
}
