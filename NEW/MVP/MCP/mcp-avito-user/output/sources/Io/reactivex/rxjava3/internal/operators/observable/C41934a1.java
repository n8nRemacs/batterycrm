package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: ObservableRetryWhen.java */
/* renamed from: io.reactivex.rxjava3.internal.operators.observable.a1, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41934a1<T> extends AbstractC41932a<T, T> {

    /* renamed from: c, reason: collision with root package name */
    public final l41.o<? super io.reactivex.rxjava3.core.z<Throwable>, ? extends io.reactivex.rxjava3.core.E<?>> f403962c;

    /* compiled from: ObservableRetryWhen.java */
    /* renamed from: io.reactivex.rxjava3.internal.operators.observable.a1$a */
    public static final class a<T> extends AtomicInteger implements io.reactivex.rxjava3.core.G<T>, io.reactivex.rxjava3.disposables.d {
        private static final long serialVersionUID = 802743776666017014L;

        /* renamed from: b, reason: collision with root package name */
        public final io.reactivex.rxjava3.core.G<? super T> f403963b;

        /* renamed from: e, reason: collision with root package name */
        public final io.reactivex.rxjava3.subjects.i<Throwable> f403966e;

        /* renamed from: h, reason: collision with root package name */
        public final io.reactivex.rxjava3.core.E<T> f403969h;

        /* renamed from: i, reason: collision with root package name */
        public volatile boolean f403970i;

        /* renamed from: c, reason: collision with root package name */
        public final AtomicInteger f403964c = new AtomicInteger();

        /* renamed from: d, reason: collision with root package name */
        public final io.reactivex.rxjava3.internal.util.b f403965d = new io.reactivex.rxjava3.internal.util.b();

        /* renamed from: f, reason: collision with root package name */
        public final a<T>.C11499a f403967f = new C11499a();

        /* renamed from: g, reason: collision with root package name */
        public final AtomicReference<io.reactivex.rxjava3.disposables.d> f403968g = new AtomicReference<>();

        /* compiled from: ObservableRetryWhen.java */
        /* renamed from: io.reactivex.rxjava3.internal.operators.observable.a1$a$a, reason: collision with other inner class name */
        public final class C11499a extends AtomicReference<io.reactivex.rxjava3.disposables.d> implements io.reactivex.rxjava3.core.G<Object> {
            private static final long serialVersionUID = 3254781284376480842L;

            public C11499a() {
            }

            @Override // io.reactivex.rxjava3.core.G
            public final void b(io.reactivex.rxjava3.disposables.d dVar) {
                DisposableHelper.e(this, dVar);
            }

            @Override // io.reactivex.rxjava3.core.G
            public final void e() {
                a aVar = a.this;
                DisposableHelper.a(aVar.f403968g);
                io.reactivex.rxjava3.internal.util.i.a(aVar.f403963b, aVar, aVar.f403965d);
            }

            @Override // io.reactivex.rxjava3.core.G
            public final void onError(Throwable th2) {
                a aVar = a.this;
                DisposableHelper.a(aVar.f403968g);
                io.reactivex.rxjava3.internal.util.i.c(aVar.f403963b, th2, aVar, aVar.f403965d);
            }

            @Override // io.reactivex.rxjava3.core.G
            public final void onNext(Object obj) {
                a.this.a();
            }
        }

        public a(io.reactivex.rxjava3.core.G<? super T> g12, io.reactivex.rxjava3.subjects.i<Throwable> iVar, io.reactivex.rxjava3.core.E<T> e12) {
            this.f403963b = g12;
            this.f403966e = iVar;
            this.f403969h = e12;
        }

        public final void a() {
            if (this.f403964c.getAndIncrement() == 0) {
                while (!getF318621e()) {
                    if (!this.f403970i) {
                        this.f403970i = true;
                        this.f403969h.c(this);
                    }
                    if (this.f403964c.decrementAndGet() == 0) {
                        return;
                    }
                }
            }
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void b(io.reactivex.rxjava3.disposables.d dVar) {
            DisposableHelper.c(this.f403968g, dVar);
        }

        @Override // io.reactivex.rxjava3.disposables.d
        public final void dispose() {
            DisposableHelper.a(this.f403968g);
            DisposableHelper.a(this.f403967f);
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void e() {
            DisposableHelper.a(this.f403967f);
            io.reactivex.rxjava3.internal.util.i.a(this.f403963b, this, this.f403965d);
        }

        @Override // io.reactivex.rxjava3.disposables.d
        /* renamed from: i */
        public final boolean getF318621e() {
            return DisposableHelper.b(this.f403968g.get());
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void onError(Throwable th2) {
            DisposableHelper.c(this.f403968g, null);
            this.f403970i = false;
            this.f403966e.onNext(th2);
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void onNext(T t12) {
            io.reactivex.rxjava3.internal.util.i.e(this.f403963b, t12, this, this.f403965d);
        }
    }

    public C41934a1(io.reactivex.rxjava3.core.z zVar, l41.o oVar) {
        super(zVar);
        this.f403962c = oVar;
    }

    @Override // io.reactivex.rxjava3.core.z
    public final void w0(io.reactivex.rxjava3.core.G<? super T> g12) {
        io.reactivex.rxjava3.subjects.i<T> iVarM0 = new io.reactivex.rxjava3.subjects.e().M0();
        try {
            io.reactivex.rxjava3.core.E<?> eApply = this.f403962c.apply(iVarM0);
            Objects.requireNonNull(eApply, "The handler returned a null ObservableSource");
            io.reactivex.rxjava3.core.E<?> e12 = eApply;
            a aVar = new a(g12, iVarM0, this.f403951b);
            g12.b(aVar);
            e12.c(aVar.f403967f);
            aVar.a();
        } catch (Throwable th2) {
            io.reactivex.rxjava3.exceptions.a.a(th2);
            EmptyDisposable.d(th2, g12);
        }
    }
}
