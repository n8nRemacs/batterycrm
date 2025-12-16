package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.core.AbstractC41768a;
import io.reactivex.rxjava3.core.InterfaceC41771d;
import io.reactivex.rxjava3.core.InterfaceC41774g;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import n41.InterfaceC44188e;

/* compiled from: ObservableFlatMapCompletableCompletable.java */
/* loaded from: classes8.dex */
public final class Z<T> extends AbstractC41768a implements InterfaceC44188e<T> {

    /* renamed from: b, reason: collision with root package name */
    public final io.reactivex.rxjava3.core.z f403935b;

    /* renamed from: c, reason: collision with root package name */
    public final l41.o<? super T, ? extends InterfaceC41774g> f403936c;

    /* compiled from: ObservableFlatMapCompletableCompletable.java */
    public static final class a<T> extends AtomicInteger implements io.reactivex.rxjava3.disposables.d, io.reactivex.rxjava3.core.G<T> {
        private static final long serialVersionUID = 8443155186132538303L;

        /* renamed from: b, reason: collision with root package name */
        public final InterfaceC41771d f403937b;

        /* renamed from: d, reason: collision with root package name */
        public final l41.o<? super T, ? extends InterfaceC41774g> f403939d;

        /* renamed from: f, reason: collision with root package name */
        public io.reactivex.rxjava3.disposables.d f403941f;

        /* renamed from: g, reason: collision with root package name */
        public volatile boolean f403942g;

        /* renamed from: c, reason: collision with root package name */
        public final io.reactivex.rxjava3.internal.util.b f403938c = new io.reactivex.rxjava3.internal.util.b();

        /* renamed from: e, reason: collision with root package name */
        public final io.reactivex.rxjava3.disposables.c f403940e = new io.reactivex.rxjava3.disposables.c();

        /* compiled from: ObservableFlatMapCompletableCompletable.java */
        /* renamed from: io.reactivex.rxjava3.internal.operators.observable.Z$a$a, reason: collision with other inner class name */
        public final class C11497a extends AtomicReference<io.reactivex.rxjava3.disposables.d> implements InterfaceC41771d, io.reactivex.rxjava3.disposables.d {
            private static final long serialVersionUID = 8606673141535671828L;

            public C11497a() {
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
                aVar.f403940e.c(this);
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
                aVar.f403940e.c(this);
                aVar.onError(th2);
            }
        }

        public a(InterfaceC41771d interfaceC41771d, l41.o oVar) {
            this.f403937b = interfaceC41771d;
            this.f403939d = oVar;
            lazySet(1);
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void b(io.reactivex.rxjava3.disposables.d dVar) {
            if (DisposableHelper.f(this.f403941f, dVar)) {
                this.f403941f = dVar;
                this.f403937b.b(this);
            }
        }

        @Override // io.reactivex.rxjava3.disposables.d
        public final void dispose() {
            this.f403942g = true;
            this.f403941f.dispose();
            this.f403940e.dispose();
            this.f403938c.c();
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void e() {
            if (decrementAndGet() == 0) {
                this.f403938c.d(this.f403937b);
            }
        }

        @Override // io.reactivex.rxjava3.disposables.d
        /* renamed from: i */
        public final boolean getF318621e() {
            return this.f403941f.getF318621e();
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void onError(Throwable th2) {
            if (this.f403938c.b(th2)) {
                this.f403942g = true;
                this.f403941f.dispose();
                this.f403940e.dispose();
                this.f403938c.d(this.f403937b);
            }
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void onNext(T t12) {
            try {
                InterfaceC41774g interfaceC41774gApply = this.f403939d.apply(t12);
                Objects.requireNonNull(interfaceC41774gApply, "The mapper returned a null CompletableSource");
                InterfaceC41774g interfaceC41774g = interfaceC41774gApply;
                getAndIncrement();
                C11497a c11497a = new C11497a();
                if (this.f403942g || !this.f403940e.b(c11497a)) {
                    return;
                }
                interfaceC41774g.a(c11497a);
            } catch (Throwable th2) {
                io.reactivex.rxjava3.exceptions.a.a(th2);
                this.f403941f.dispose();
                onError(th2);
            }
        }
    }

    public Z(io.reactivex.rxjava3.core.z zVar, l41.o oVar) {
        this.f403935b = zVar;
        this.f403936c = oVar;
    }

    @Override // n41.InterfaceC44188e
    public final io.reactivex.rxjava3.core.z<T> d() {
        return new Y(this.f403935b, this.f403936c);
    }

    @Override // io.reactivex.rxjava3.core.AbstractC41768a
    public final void w(InterfaceC41771d interfaceC41771d) {
        this.f403935b.c(new a(interfaceC41771d, this.f403936c));
    }
}
