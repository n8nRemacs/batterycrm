package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.AbstractC41777j;
import io.reactivex.rxjava3.core.InterfaceC41771d;
import io.reactivex.rxjava3.core.InterfaceC41774g;
import io.reactivex.rxjava3.core.InterfaceC41782o;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;
import o41.AbstractC44583c;

/* compiled from: FlowableFlatMapCompletable.java */
/* renamed from: io.reactivex.rxjava3.internal.operators.flowable.c0, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41837c0<T> extends AbstractC41833b<T, T> {

    /* renamed from: d, reason: collision with root package name */
    public final com.avito.android.blueprints.publish.reg_number.d f402683d;

    /* renamed from: e, reason: collision with root package name */
    public final int f402684e;

    public C41837c0(AbstractC41777j abstractC41777j, com.avito.android.blueprints.publish.reg_number.d dVar, int i12) {
        super(abstractC41777j);
        this.f402683d = dVar;
        this.f402684e = i12;
    }

    @Override // io.reactivex.rxjava3.core.AbstractC41777j
    public final void u(org.reactivestreams.d<? super T> dVar) {
        this.f402624c.q(new a((InterfaceC41782o) dVar, this.f402683d, this.f402684e));
    }

    /* compiled from: FlowableFlatMapCompletable.java */
    /* renamed from: io.reactivex.rxjava3.internal.operators.flowable.c0$a */
    public static final class a<T> extends AbstractC44583c<T> implements InterfaceC41782o<T> {
        private static final long serialVersionUID = 8443155186132538303L;

        /* renamed from: b, reason: collision with root package name */
        public final InterfaceC41782o f402685b;

        /* renamed from: d, reason: collision with root package name */
        public final com.avito.android.blueprints.publish.reg_number.d f402687d;

        /* renamed from: f, reason: collision with root package name */
        public final int f402689f;

        /* renamed from: g, reason: collision with root package name */
        public org.reactivestreams.e f402690g;

        /* renamed from: h, reason: collision with root package name */
        public volatile boolean f402691h;

        /* renamed from: c, reason: collision with root package name */
        public final io.reactivex.rxjava3.internal.util.b f402686c = new io.reactivex.rxjava3.internal.util.b();

        /* renamed from: e, reason: collision with root package name */
        public final io.reactivex.rxjava3.disposables.c f402688e = new io.reactivex.rxjava3.disposables.c();

        /* compiled from: FlowableFlatMapCompletable.java */
        /* renamed from: io.reactivex.rxjava3.internal.operators.flowable.c0$a$a, reason: collision with other inner class name */
        public final class C11459a extends AtomicReference<io.reactivex.rxjava3.disposables.d> implements InterfaceC41771d, io.reactivex.rxjava3.disposables.d {
            private static final long serialVersionUID = 8606673141535671828L;

            public C11459a() {
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
                aVar.f402688e.c(this);
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
                aVar.f402688e.c(this);
                aVar.onError(th2);
            }
        }

        public a(InterfaceC41782o interfaceC41782o, com.avito.android.blueprints.publish.reg_number.d dVar, int i12) {
            this.f402685b = interfaceC41782o;
            this.f402687d = dVar;
            this.f402689f = i12;
            lazySet(1);
        }

        @Override // org.reactivestreams.d
        public final void K(org.reactivestreams.e eVar) {
            if (SubscriptionHelper.i(this.f402690g, eVar)) {
                this.f402690g = eVar;
                this.f402685b.K(this);
                int i12 = this.f402689f;
                if (i12 == Integer.MAX_VALUE) {
                    eVar.request(Long.MAX_VALUE);
                } else {
                    eVar.request(i12);
                }
            }
        }

        @Override // org.reactivestreams.e
        public final void cancel() {
            this.f402691h = true;
            this.f402690g.cancel();
            this.f402688e.dispose();
            this.f402686c.c();
        }

        @Override // org.reactivestreams.d
        public final void e() {
            if (decrementAndGet() == 0) {
                this.f402686c.g(this.f402685b);
            } else if (this.f402689f != Integer.MAX_VALUE) {
                this.f402690g.request(1L);
            }
        }

        @Override // q41.g
        public final boolean isEmpty() {
            return true;
        }

        @Override // org.reactivestreams.d
        public final void onError(Throwable th2) {
            if (this.f402686c.b(th2)) {
                this.f402691h = true;
                this.f402690g.cancel();
                this.f402688e.dispose();
                this.f402686c.g(this.f402685b);
            }
        }

        @Override // org.reactivestreams.d
        public final void onNext(T t12) {
            try {
                Object objApply = this.f402687d.apply(t12);
                Objects.requireNonNull(objApply, "The mapper returned a null CompletableSource");
                InterfaceC41774g interfaceC41774g = (InterfaceC41774g) objApply;
                getAndIncrement();
                C11459a c11459a = new C11459a();
                if (this.f402691h || !this.f402688e.b(c11459a)) {
                    return;
                }
                interfaceC41774g.a(c11459a);
            } catch (Throwable th2) {
                io.reactivex.rxjava3.exceptions.a.a(th2);
                this.f402690g.cancel();
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
            return i12 & 2;
        }

        @Override // q41.g
        public final void clear() {
        }

        @Override // org.reactivestreams.e
        public final void request(long j12) {
        }
    }
}
