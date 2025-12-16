package hu.akarnokd.rxjava3.operators;

import io.reactivex.rxjava3.core.AbstractC41777j;
import io.reactivex.rxjava3.core.InterfaceC41782o;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: MaybeFlatMapSignalFlowable.java */
/* loaded from: classes8.dex */
final class X<T, R> extends AbstractC41777j<R> implements io.reactivex.rxjava3.core.r<T, AbstractC41777j<R>> {

    /* compiled from: MaybeFlatMapSignalFlowable.java */
    public static final class a<T, R> implements io.reactivex.rxjava3.core.t<T>, org.reactivestreams.e {

        /* renamed from: b, reason: collision with root package name */
        public final C11327a<R> f397989b;

        /* renamed from: c, reason: collision with root package name */
        public io.reactivex.rxjava3.disposables.d f397990c;

        /* compiled from: MaybeFlatMapSignalFlowable.java */
        /* renamed from: hu.akarnokd.rxjava3.operators.X$a$a, reason: collision with other inner class name */
        public static final class C11327a<R> extends AtomicReference<org.reactivestreams.e> implements InterfaceC41782o<R> {
            private static final long serialVersionUID = 314442824941893429L;

            /* renamed from: b, reason: collision with root package name */
            public final InterfaceC41782o f397991b;

            /* renamed from: c, reason: collision with root package name */
            public final AtomicLong f397992c = new AtomicLong();

            public C11327a(InterfaceC41782o interfaceC41782o) {
                this.f397991b = interfaceC41782o;
            }

            @Override // org.reactivestreams.d
            public final void K(org.reactivestreams.e eVar) {
                SubscriptionHelper.c(this, this.f397992c, eVar);
            }

            @Override // org.reactivestreams.d
            public final void e() {
                this.f397991b.e();
            }

            @Override // org.reactivestreams.d
            public final void onError(Throwable th2) {
                this.f397991b.onError(th2);
            }

            @Override // org.reactivestreams.d
            public final void onNext(R r12) {
                this.f397991b.onNext(r12);
            }
        }

        public a(InterfaceC41782o interfaceC41782o) {
            this.f397989b = new C11327a<>(interfaceC41782o);
        }

        @Override // io.reactivex.rxjava3.core.t
        public final void b(io.reactivex.rxjava3.disposables.d dVar) {
            if (DisposableHelper.f(this.f397990c, dVar)) {
                this.f397990c = dVar;
                this.f397989b.f397991b.K(this);
            }
        }

        @Override // org.reactivestreams.e
        public final void cancel() {
            this.f397990c.dispose();
            SubscriptionHelper.a(this.f397989b);
        }

        @Override // io.reactivex.rxjava3.core.t
        public final void e() {
            try {
                throw null;
            } catch (Throwable th2) {
                io.reactivex.rxjava3.exceptions.a.a(th2);
                this.f397989b.onError(th2);
            }
        }

        @Override // io.reactivex.rxjava3.core.t
        public final void onError(Throwable th2) {
            try {
                throw null;
            } catch (Throwable th3) {
                io.reactivex.rxjava3.exceptions.a.a(th3);
                this.f397989b.onError(th3);
            }
        }

        @Override // io.reactivex.rxjava3.core.t
        public final void onSuccess(T t12) {
            try {
                throw null;
            } catch (Throwable th2) {
                io.reactivex.rxjava3.exceptions.a.a(th2);
                this.f397989b.onError(th2);
            }
        }

        @Override // org.reactivestreams.e
        public final void request(long j12) {
            C11327a<R> c11327a = this.f397989b;
            SubscriptionHelper.b(c11327a, c11327a.f397992c, j12);
        }
    }

    @Override // io.reactivex.rxjava3.core.AbstractC41777j
    public final void u(org.reactivestreams.d<? super R> dVar) {
        new a((InterfaceC41782o) dVar);
        throw null;
    }
}
