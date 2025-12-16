package io.reactivex.rxjava3.internal.operators.completable;

import io.reactivex.rxjava3.core.AbstractC41768a;
import io.reactivex.rxjava3.core.InterfaceC41771d;
import io.reactivex.rxjava3.core.InterfaceC41774g;
import io.reactivex.rxjava3.core.InterfaceC41782o;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: CompletableMerge.java */
/* loaded from: classes8.dex */
public final class B extends AbstractC41768a {

    /* compiled from: CompletableMerge.java */
    public static final class a extends AtomicInteger implements InterfaceC41782o<InterfaceC41774g>, io.reactivex.rxjava3.disposables.d {
        private static final long serialVersionUID = -2108443387387077490L;

        /* renamed from: b, reason: collision with root package name */
        public final InterfaceC41771d f402143b;

        /* renamed from: e, reason: collision with root package name */
        public org.reactivestreams.e f402146e;

        /* renamed from: d, reason: collision with root package name */
        public final io.reactivex.rxjava3.disposables.c f402145d = new io.reactivex.rxjava3.disposables.c();

        /* renamed from: c, reason: collision with root package name */
        public final io.reactivex.rxjava3.internal.util.b f402144c = new io.reactivex.rxjava3.internal.util.b();

        /* compiled from: CompletableMerge.java */
        /* renamed from: io.reactivex.rxjava3.internal.operators.completable.B$a$a, reason: collision with other inner class name */
        public final class C11443a extends AtomicReference<io.reactivex.rxjava3.disposables.d> implements InterfaceC41771d, io.reactivex.rxjava3.disposables.d {
            private static final long serialVersionUID = 251330541679988317L;

            public C11443a() {
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
                aVar.f402145d.c(this);
                if (aVar.decrementAndGet() == 0) {
                    aVar.f402144c.d(aVar.f402143b);
                } else {
                    aVar.f402146e.request(1L);
                }
            }

            @Override // io.reactivex.rxjava3.disposables.d
            /* renamed from: i */
            public final boolean getF318621e() {
                return DisposableHelper.b(get());
            }

            @Override // io.reactivex.rxjava3.core.InterfaceC41771d
            public final void onError(Throwable th2) {
                a aVar = a.this;
                io.reactivex.rxjava3.disposables.c cVar = aVar.f402145d;
                cVar.c(this);
                aVar.f402146e.cancel();
                cVar.dispose();
                io.reactivex.rxjava3.internal.util.b bVar = aVar.f402144c;
                if (!bVar.b(th2) || aVar.getAndSet(0) <= 0) {
                    return;
                }
                bVar.d(aVar.f402143b);
            }
        }

        public a(InterfaceC41771d interfaceC41771d) {
            this.f402143b = interfaceC41771d;
            lazySet(1);
        }

        @Override // org.reactivestreams.d
        public final void K(org.reactivestreams.e eVar) {
            if (SubscriptionHelper.i(this.f402146e, eVar)) {
                this.f402146e = eVar;
                this.f402143b.b(this);
                eVar.request(0);
            }
        }

        @Override // io.reactivex.rxjava3.disposables.d
        public final void dispose() {
            this.f402146e.cancel();
            this.f402145d.dispose();
            this.f402144c.c();
        }

        @Override // org.reactivestreams.d
        public final void e() {
            if (decrementAndGet() == 0) {
                this.f402144c.d(this.f402143b);
            }
        }

        @Override // io.reactivex.rxjava3.disposables.d
        /* renamed from: i */
        public final boolean getF318621e() {
            return this.f402145d.f401978c;
        }

        @Override // org.reactivestreams.d
        public final void onError(Throwable th2) {
            this.f402145d.dispose();
            io.reactivex.rxjava3.internal.util.b bVar = this.f402144c;
            if (!bVar.b(th2) || getAndSet(0) <= 0) {
                return;
            }
            bVar.d(this.f402143b);
        }

        @Override // org.reactivestreams.d
        public final void onNext(Object obj) {
            getAndIncrement();
            C11443a c11443a = new C11443a();
            this.f402145d.b(c11443a);
            ((InterfaceC41774g) obj).a(c11443a);
        }
    }

    @Override // io.reactivex.rxjava3.core.AbstractC41768a
    public final void w(InterfaceC41771d interfaceC41771d) {
        new a(interfaceC41771d);
        throw null;
    }
}
