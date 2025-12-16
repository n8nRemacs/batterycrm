package io.reactivex.rxjava3.internal.operators.mixed;

import io.reactivex.rxjava3.core.AbstractC41768a;
import io.reactivex.rxjava3.core.G;
import io.reactivex.rxjava3.core.InterfaceC41771d;
import io.reactivex.rxjava3.core.InterfaceC41774g;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;
import s41.C47998a;

/* compiled from: ObservableSwitchMapCompletable.java */
/* loaded from: classes8.dex */
public final class v<T> extends AbstractC41768a {

    /* renamed from: b, reason: collision with root package name */
    public final io.reactivex.rxjava3.core.z<T> f403457b;

    /* renamed from: c, reason: collision with root package name */
    public final l41.o<? super T, ? extends InterfaceC41774g> f403458c;

    /* compiled from: ObservableSwitchMapCompletable.java */
    public static final class a<T> implements G<T>, io.reactivex.rxjava3.disposables.d {

        /* renamed from: h, reason: collision with root package name */
        public static final C11484a f403459h = new C11484a(null);

        /* renamed from: b, reason: collision with root package name */
        public final InterfaceC41771d f403460b;

        /* renamed from: c, reason: collision with root package name */
        public final l41.o<? super T, ? extends InterfaceC41774g> f403461c;

        /* renamed from: d, reason: collision with root package name */
        public final io.reactivex.rxjava3.internal.util.b f403462d = new io.reactivex.rxjava3.internal.util.b();

        /* renamed from: e, reason: collision with root package name */
        public final AtomicReference<C11484a> f403463e = new AtomicReference<>();

        /* renamed from: f, reason: collision with root package name */
        public volatile boolean f403464f;

        /* renamed from: g, reason: collision with root package name */
        public io.reactivex.rxjava3.disposables.d f403465g;

        /* compiled from: ObservableSwitchMapCompletable.java */
        /* renamed from: io.reactivex.rxjava3.internal.operators.mixed.v$a$a, reason: collision with other inner class name */
        public static final class C11484a extends AtomicReference<io.reactivex.rxjava3.disposables.d> implements InterfaceC41771d {
            private static final long serialVersionUID = -8003404460084760287L;

            /* renamed from: b, reason: collision with root package name */
            public final a<?> f403466b;

            public C11484a(a<?> aVar) {
                this.f403466b = aVar;
            }

            @Override // io.reactivex.rxjava3.core.InterfaceC41771d
            public final void b(io.reactivex.rxjava3.disposables.d dVar) {
                DisposableHelper.e(this, dVar);
            }

            @Override // io.reactivex.rxjava3.core.InterfaceC41771d
            public final void e() {
                a<?> aVar = this.f403466b;
                AtomicReference<C11484a> atomicReference = aVar.f403463e;
                while (!atomicReference.compareAndSet(this, null)) {
                    if (atomicReference.get() != this) {
                        return;
                    }
                }
                if (aVar.f403464f) {
                    aVar.f403462d.d(aVar.f403460b);
                }
            }

            @Override // io.reactivex.rxjava3.core.InterfaceC41771d
            public final void onError(Throwable th2) {
                a<?> aVar = this.f403466b;
                AtomicReference<C11484a> atomicReference = aVar.f403463e;
                while (!atomicReference.compareAndSet(this, null)) {
                    if (atomicReference.get() != this) {
                        C47998a.b(th2);
                        return;
                    }
                }
                io.reactivex.rxjava3.internal.util.b bVar = aVar.f403462d;
                if (bVar.b(th2)) {
                    aVar.f403465g.dispose();
                    aVar.a();
                    bVar.d(aVar.f403460b);
                }
            }
        }

        public a(InterfaceC41771d interfaceC41771d, l41.o oVar) {
            this.f403460b = interfaceC41771d;
            this.f403461c = oVar;
        }

        public final void a() {
            AtomicReference<C11484a> atomicReference = this.f403463e;
            C11484a c11484a = f403459h;
            C11484a andSet = atomicReference.getAndSet(c11484a);
            if (andSet == null || andSet == c11484a) {
                return;
            }
            DisposableHelper.a(andSet);
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void b(io.reactivex.rxjava3.disposables.d dVar) {
            if (DisposableHelper.f(this.f403465g, dVar)) {
                this.f403465g = dVar;
                this.f403460b.b(this);
            }
        }

        @Override // io.reactivex.rxjava3.disposables.d
        public final void dispose() {
            this.f403465g.dispose();
            a();
            this.f403462d.c();
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void e() {
            this.f403464f = true;
            if (this.f403463e.get() == null) {
                this.f403462d.d(this.f403460b);
            }
        }

        @Override // io.reactivex.rxjava3.disposables.d
        /* renamed from: i */
        public final boolean getF318621e() {
            return this.f403463e.get() == f403459h;
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void onError(Throwable th2) {
            io.reactivex.rxjava3.internal.util.b bVar = this.f403462d;
            if (bVar.b(th2)) {
                a();
                bVar.d(this.f403460b);
            }
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void onNext(T t12) {
            try {
                InterfaceC41774g interfaceC41774gApply = this.f403461c.apply(t12);
                Objects.requireNonNull(interfaceC41774gApply, "The mapper returned a null CompletableSource");
                InterfaceC41774g interfaceC41774g = interfaceC41774gApply;
                C11484a c11484a = new C11484a(this);
                while (true) {
                    AtomicReference<C11484a> atomicReference = this.f403463e;
                    C11484a c11484a2 = atomicReference.get();
                    if (c11484a2 == f403459h) {
                        return;
                    }
                    while (!atomicReference.compareAndSet(c11484a2, c11484a)) {
                        if (atomicReference.get() != c11484a2) {
                            break;
                        }
                    }
                    if (c11484a2 != null) {
                        DisposableHelper.a(c11484a2);
                    }
                    interfaceC41774g.a(c11484a);
                    return;
                }
            } catch (Throwable th2) {
                io.reactivex.rxjava3.exceptions.a.a(th2);
                this.f403465g.dispose();
                onError(th2);
            }
        }
    }

    public v(io.reactivex.rxjava3.core.z zVar, l41.o oVar) {
        this.f403457b = zVar;
        this.f403458c = oVar;
    }

    @Override // io.reactivex.rxjava3.core.AbstractC41768a
    public final void w(InterfaceC41771d interfaceC41771d) {
        io.reactivex.rxjava3.core.z<T> zVar = this.f403457b;
        l41.o<? super T, ? extends InterfaceC41774g> oVar = this.f403458c;
        if (y.a(zVar, oVar, interfaceC41771d)) {
            return;
        }
        zVar.c(new a(interfaceC41771d, oVar));
    }
}
