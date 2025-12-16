package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.AbstractC41768a;
import io.reactivex.rxjava3.core.AbstractC41777j;
import io.reactivex.rxjava3.core.InterfaceC41771d;
import io.reactivex.rxjava3.core.InterfaceC41774g;
import io.reactivex.rxjava3.core.InterfaceC41782o;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import n41.InterfaceC44186c;

/* compiled from: FlowableFlatMapCompletableCompletable.java */
/* renamed from: io.reactivex.rxjava3.internal.operators.flowable.d0, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41840d0<T> extends AbstractC41768a implements InterfaceC44186c<T> {

    /* renamed from: b, reason: collision with root package name */
    public final AbstractC41777j<T> f402716b;

    /* renamed from: c, reason: collision with root package name */
    public final com.avito.android.blueprints.publish.reg_number.d f402717c;

    /* renamed from: d, reason: collision with root package name */
    public final int f402718d = Integer.MAX_VALUE;

    /* compiled from: FlowableFlatMapCompletableCompletable.java */
    /* renamed from: io.reactivex.rxjava3.internal.operators.flowable.d0$a */
    public static final class a<T> extends AtomicInteger implements InterfaceC41782o<T>, io.reactivex.rxjava3.disposables.d {
        private static final long serialVersionUID = 8443155186132538303L;

        /* renamed from: b, reason: collision with root package name */
        public final InterfaceC41771d f402719b;

        /* renamed from: d, reason: collision with root package name */
        public final com.avito.android.blueprints.publish.reg_number.d f402721d;

        /* renamed from: f, reason: collision with root package name */
        public final int f402723f;

        /* renamed from: g, reason: collision with root package name */
        public org.reactivestreams.e f402724g;

        /* renamed from: h, reason: collision with root package name */
        public volatile boolean f402725h;

        /* renamed from: c, reason: collision with root package name */
        public final io.reactivex.rxjava3.internal.util.b f402720c = new io.reactivex.rxjava3.internal.util.b();

        /* renamed from: e, reason: collision with root package name */
        public final io.reactivex.rxjava3.disposables.c f402722e = new io.reactivex.rxjava3.disposables.c();

        /* compiled from: FlowableFlatMapCompletableCompletable.java */
        /* renamed from: io.reactivex.rxjava3.internal.operators.flowable.d0$a$a, reason: collision with other inner class name */
        public final class C11461a extends AtomicReference<io.reactivex.rxjava3.disposables.d> implements InterfaceC41771d, io.reactivex.rxjava3.disposables.d {
            private static final long serialVersionUID = 8606673141535671828L;

            public C11461a() {
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
                aVar.f402722e.c(this);
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
                aVar.f402722e.c(this);
                aVar.onError(th2);
            }
        }

        public a(InterfaceC41771d interfaceC41771d, com.avito.android.blueprints.publish.reg_number.d dVar, int i12) {
            this.f402719b = interfaceC41771d;
            this.f402721d = dVar;
            this.f402723f = i12;
            lazySet(1);
        }

        @Override // org.reactivestreams.d
        public final void K(org.reactivestreams.e eVar) {
            if (SubscriptionHelper.i(this.f402724g, eVar)) {
                this.f402724g = eVar;
                this.f402719b.b(this);
                int i12 = this.f402723f;
                if (i12 == Integer.MAX_VALUE) {
                    eVar.request(Long.MAX_VALUE);
                } else {
                    eVar.request(i12);
                }
            }
        }

        @Override // io.reactivex.rxjava3.disposables.d
        public final void dispose() {
            this.f402725h = true;
            this.f402724g.cancel();
            this.f402722e.dispose();
            this.f402720c.c();
        }

        @Override // org.reactivestreams.d
        public final void e() {
            if (decrementAndGet() == 0) {
                this.f402720c.d(this.f402719b);
            } else if (this.f402723f != Integer.MAX_VALUE) {
                this.f402724g.request(1L);
            }
        }

        @Override // io.reactivex.rxjava3.disposables.d
        /* renamed from: i */
        public final boolean getF318621e() {
            return this.f402722e.f401978c;
        }

        @Override // org.reactivestreams.d
        public final void onError(Throwable th2) {
            if (this.f402720c.b(th2)) {
                this.f402725h = true;
                this.f402724g.cancel();
                this.f402722e.dispose();
                this.f402720c.d(this.f402719b);
            }
        }

        @Override // org.reactivestreams.d
        public final void onNext(T t12) {
            try {
                Object objApply = this.f402721d.apply(t12);
                Objects.requireNonNull(objApply, "The mapper returned a null CompletableSource");
                InterfaceC41774g interfaceC41774g = (InterfaceC41774g) objApply;
                getAndIncrement();
                C11461a c11461a = new C11461a();
                if (this.f402725h || !this.f402722e.b(c11461a)) {
                    return;
                }
                interfaceC41774g.a(c11461a);
            } catch (Throwable th2) {
                io.reactivex.rxjava3.exceptions.a.a(th2);
                this.f402724g.cancel();
                onError(th2);
            }
        }
    }

    public C41840d0(AbstractC41777j abstractC41777j, com.avito.android.blueprints.publish.reg_number.d dVar) {
        this.f402716b = abstractC41777j;
        this.f402717c = dVar;
    }

    @Override // n41.InterfaceC44186c
    public final AbstractC41777j<T> f() {
        return new C41837c0(this.f402716b, this.f402717c, this.f402718d);
    }

    @Override // io.reactivex.rxjava3.core.AbstractC41768a
    public final void w(InterfaceC41771d interfaceC41771d) {
        this.f402716b.q(new a(interfaceC41771d, this.f402717c, this.f402718d));
    }
}
