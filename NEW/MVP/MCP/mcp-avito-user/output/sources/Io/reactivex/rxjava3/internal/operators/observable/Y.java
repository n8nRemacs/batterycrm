package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.core.InterfaceC41771d;
import io.reactivex.rxjava3.core.InterfaceC41774g;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.observers.AbstractC41805c;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: ObservableFlatMapCompletable.java */
/* loaded from: classes8.dex */
public final class Y<T> extends AbstractC41932a<T, T> {

    /* renamed from: c, reason: collision with root package name */
    public final l41.o<? super T, ? extends InterfaceC41774g> f403923c;

    public Y(io.reactivex.rxjava3.core.z zVar, l41.o oVar) {
        super(zVar);
        this.f403923c = oVar;
    }

    @Override // io.reactivex.rxjava3.core.z
    public final void w0(io.reactivex.rxjava3.core.G<? super T> g12) {
        this.f403951b.c(new a(g12, this.f403923c));
    }

    /* compiled from: ObservableFlatMapCompletable.java */
    public static final class a<T> extends AbstractC41805c<T> implements io.reactivex.rxjava3.core.G<T> {
        private static final long serialVersionUID = 8443155186132538303L;

        /* renamed from: b, reason: collision with root package name */
        public final io.reactivex.rxjava3.core.G<? super T> f403924b;

        /* renamed from: d, reason: collision with root package name */
        public final l41.o<? super T, ? extends InterfaceC41774g> f403926d;

        /* renamed from: f, reason: collision with root package name */
        public io.reactivex.rxjava3.disposables.d f403928f;

        /* renamed from: g, reason: collision with root package name */
        public volatile boolean f403929g;

        /* renamed from: c, reason: collision with root package name */
        public final io.reactivex.rxjava3.internal.util.b f403925c = new io.reactivex.rxjava3.internal.util.b();

        /* renamed from: e, reason: collision with root package name */
        public final io.reactivex.rxjava3.disposables.c f403927e = new io.reactivex.rxjava3.disposables.c();

        /* compiled from: ObservableFlatMapCompletable.java */
        /* renamed from: io.reactivex.rxjava3.internal.operators.observable.Y$a$a, reason: collision with other inner class name */
        public final class C11496a extends AtomicReference<io.reactivex.rxjava3.disposables.d> implements InterfaceC41771d, io.reactivex.rxjava3.disposables.d {
            private static final long serialVersionUID = 8606673141535671828L;

            public C11496a() {
            }

            @Override // io.reactivex.rxjava3.core.InterfaceC41771d
            public final void b(io.reactivex.rxjava3.disposables.d dVar) {
                DisposableHelper.e(this, dVar);
            }

            @Override // io.reactivex.rxjava3.disposables.d
            public final void dispose() {
                DisposableHelper.a(this);
            }

            @Override // io.reactivex.rxjava3.core.InterfaceC41771d
            public final void e() {
                a aVar = a.this;
                aVar.f403927e.c(this);
                aVar.e();
            }

            @Override // io.reactivex.rxjava3.disposables.d
            /* renamed from: i */
            public final boolean getF318621e() {
                return DisposableHelper.b(get());
            }

            @Override // io.reactivex.rxjava3.core.InterfaceC41771d
            public final void onError(Throwable th2) {
                a aVar = a.this;
                aVar.f403927e.c(this);
                aVar.onError(th2);
            }
        }

        public a(io.reactivex.rxjava3.core.G g12, l41.o oVar) {
            this.f403924b = g12;
            this.f403926d = oVar;
            lazySet(1);
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void b(io.reactivex.rxjava3.disposables.d dVar) {
            if (DisposableHelper.f(this.f403928f, dVar)) {
                this.f403928f = dVar;
                this.f403924b.b(this);
            }
        }

        @Override // io.reactivex.rxjava3.disposables.d
        public final void dispose() {
            this.f403929g = true;
            this.f403928f.dispose();
            this.f403927e.dispose();
            this.f403925c.c();
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void e() {
            if (decrementAndGet() == 0) {
                this.f403925c.e(this.f403924b);
            }
        }

        @Override // io.reactivex.rxjava3.disposables.d
        /* renamed from: i */
        public final boolean getF318621e() {
            return this.f403928f.getF318621e();
        }

        @Override // q41.g
        public final boolean isEmpty() {
            return true;
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void onError(Throwable th2) {
            if (this.f403925c.b(th2)) {
                this.f403929g = true;
                this.f403928f.dispose();
                this.f403927e.dispose();
                this.f403925c.e(this.f403924b);
            }
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void onNext(T t12) {
            try {
                InterfaceC41774g interfaceC41774gApply = this.f403926d.apply(t12);
                Objects.requireNonNull(interfaceC41774gApply, "The mapper returned a null CompletableSource");
                InterfaceC41774g interfaceC41774g = interfaceC41774gApply;
                getAndIncrement();
                C11496a c11496a = new C11496a();
                if (this.f403929g || !this.f403927e.b(c11496a)) {
                    return;
                }
                interfaceC41774g.a(c11496a);
            } catch (Throwable th2) {
                io.reactivex.rxjava3.exceptions.a.a(th2);
                this.f403928f.dispose();
                onError(th2);
            }
        }

        @Override // q41.g
        @j41.f
        public final T poll() {
            return null;
        }

        @Override // q41.InterfaceC47200c
        public final int v(int i12) {
            return 2;
        }

        @Override // q41.g
        public final void clear() {
        }
    }
}
