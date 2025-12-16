package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.core.InterfaceC41771d;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: ObservableMergeWithCompletable.java */
/* loaded from: classes8.dex */
public final class E0<T> extends AbstractC41932a<T, T> {

    /* compiled from: ObservableMergeWithCompletable.java */
    public static final class a<T> extends AtomicInteger implements io.reactivex.rxjava3.core.G<T>, io.reactivex.rxjava3.disposables.d {
        private static final long serialVersionUID = -4592979584110982903L;

        /* renamed from: b, reason: collision with root package name */
        public final io.reactivex.rxjava3.core.G<? super T> f403566b;

        /* renamed from: c, reason: collision with root package name */
        public final AtomicReference<io.reactivex.rxjava3.disposables.d> f403567c = new AtomicReference<>();

        /* renamed from: d, reason: collision with root package name */
        public final C11488a f403568d = new C11488a(this);

        /* renamed from: e, reason: collision with root package name */
        public final io.reactivex.rxjava3.internal.util.b f403569e = new io.reactivex.rxjava3.internal.util.b();

        /* renamed from: f, reason: collision with root package name */
        public volatile boolean f403570f;

        /* renamed from: g, reason: collision with root package name */
        public volatile boolean f403571g;

        /* compiled from: ObservableMergeWithCompletable.java */
        /* renamed from: io.reactivex.rxjava3.internal.operators.observable.E0$a$a, reason: collision with other inner class name */
        public static final class C11488a extends AtomicReference<io.reactivex.rxjava3.disposables.d> implements InterfaceC41771d {
            private static final long serialVersionUID = -2935427570954647017L;

            /* renamed from: b, reason: collision with root package name */
            public final a<?> f403572b;

            public C11488a(a<?> aVar) {
                this.f403572b = aVar;
            }

            @Override // io.reactivex.rxjava3.core.InterfaceC41771d
            public final void b(io.reactivex.rxjava3.disposables.d dVar) {
                DisposableHelper.e(this, dVar);
            }

            @Override // io.reactivex.rxjava3.core.InterfaceC41771d
            public final void e() {
                a<?> aVar = this.f403572b;
                aVar.f403571g = true;
                if (aVar.f403570f) {
                    io.reactivex.rxjava3.internal.util.i.a(aVar.f403566b, aVar, aVar.f403569e);
                }
            }

            @Override // io.reactivex.rxjava3.core.InterfaceC41771d
            public final void onError(Throwable th2) {
                a<?> aVar = this.f403572b;
                DisposableHelper.a(aVar.f403567c);
                io.reactivex.rxjava3.internal.util.i.c(aVar.f403566b, th2, aVar, aVar.f403569e);
            }
        }

        public a(io.reactivex.rxjava3.core.G<? super T> g12) {
            this.f403566b = g12;
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void b(io.reactivex.rxjava3.disposables.d dVar) {
            DisposableHelper.e(this.f403567c, dVar);
        }

        @Override // io.reactivex.rxjava3.disposables.d
        public final void dispose() {
            DisposableHelper.a(this.f403567c);
            DisposableHelper.a(this.f403568d);
            this.f403569e.c();
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void e() {
            this.f403570f = true;
            if (this.f403571g) {
                io.reactivex.rxjava3.internal.util.i.a(this.f403566b, this, this.f403569e);
            }
        }

        @Override // io.reactivex.rxjava3.disposables.d
        /* renamed from: i */
        public final boolean getF318621e() {
            return DisposableHelper.b(this.f403567c.get());
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void onError(Throwable th2) {
            DisposableHelper.a(this.f403568d);
            io.reactivex.rxjava3.internal.util.i.c(this.f403566b, th2, this, this.f403569e);
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void onNext(T t12) {
            io.reactivex.rxjava3.internal.util.i.e(this.f403566b, t12, this, this.f403569e);
        }
    }

    @Override // io.reactivex.rxjava3.core.z
    public final void w0(io.reactivex.rxjava3.core.G<? super T> g12) {
        a aVar = new a(g12);
        g12.b(aVar);
        this.f403951b.c(aVar);
        throw null;
    }
}
