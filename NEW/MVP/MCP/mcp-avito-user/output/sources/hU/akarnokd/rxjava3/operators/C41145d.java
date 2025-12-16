package hu.akarnokd.rxjava3.operators;

import io.reactivex.rxjava3.core.AbstractC41777j;
import io.reactivex.rxjava3.core.InterfaceC41769b;
import io.reactivex.rxjava3.core.InterfaceC41771d;
import io.reactivex.rxjava3.core.InterfaceC41782o;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: CompletableFlatMapSignalFlowable.java */
/* renamed from: hu.akarnokd.rxjava3.operators.d, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C41145d<R> extends AbstractC41777j<R> implements InterfaceC41769b<AbstractC41777j<R>> {

    /* compiled from: CompletableFlatMapSignalFlowable.java */
    /* renamed from: hu.akarnokd.rxjava3.operators.d$a */
    public static final class a<R> implements InterfaceC41771d, org.reactivestreams.e {

        /* renamed from: b, reason: collision with root package name */
        public final C11332a<R> f398002b;

        /* renamed from: c, reason: collision with root package name */
        public io.reactivex.rxjava3.disposables.d f398003c;

        /* compiled from: CompletableFlatMapSignalFlowable.java */
        /* renamed from: hu.akarnokd.rxjava3.operators.d$a$a, reason: collision with other inner class name */
        public static final class C11332a<R> extends AtomicReference<org.reactivestreams.e> implements InterfaceC41782o<R> {
            private static final long serialVersionUID = 314442824941893429L;

            /* renamed from: b, reason: collision with root package name */
            public final InterfaceC41782o f398004b;

            /* renamed from: c, reason: collision with root package name */
            public final AtomicLong f398005c = new AtomicLong();

            public C11332a(InterfaceC41782o interfaceC41782o) {
                this.f398004b = interfaceC41782o;
            }

            @Override // org.reactivestreams.d
            public final void K(org.reactivestreams.e eVar) {
                SubscriptionHelper.c(this, this.f398005c, eVar);
            }

            @Override // org.reactivestreams.d
            public final void e() {
                this.f398004b.e();
            }

            @Override // org.reactivestreams.d
            public final void onError(Throwable th2) {
                this.f398004b.onError(th2);
            }

            @Override // org.reactivestreams.d
            public final void onNext(R r12) {
                this.f398004b.onNext(r12);
            }
        }

        public a(InterfaceC41782o interfaceC41782o) {
            this.f398002b = new C11332a<>(interfaceC41782o);
        }

        @Override // io.reactivex.rxjava3.core.InterfaceC41771d
        public final void b(io.reactivex.rxjava3.disposables.d dVar) {
            if (DisposableHelper.f(this.f398003c, dVar)) {
                this.f398003c = dVar;
                this.f398002b.f398004b.K(this);
            }
        }

        @Override // org.reactivestreams.e
        public final void cancel() {
            this.f398003c.dispose();
            SubscriptionHelper.a(this.f398002b);
        }

        @Override // io.reactivex.rxjava3.core.InterfaceC41771d
        public final void e() {
            try {
                throw null;
            } catch (Throwable th2) {
                io.reactivex.rxjava3.exceptions.a.a(th2);
                this.f398002b.onError(th2);
            }
        }

        @Override // io.reactivex.rxjava3.core.InterfaceC41771d
        public final void onError(Throwable th2) {
            try {
                throw null;
            } catch (Throwable th3) {
                io.reactivex.rxjava3.exceptions.a.a(th3);
                this.f398002b.onError(th3);
            }
        }

        @Override // org.reactivestreams.e
        public final void request(long j12) {
            C11332a<R> c11332a = this.f398002b;
            SubscriptionHelper.b(c11332a, c11332a.f398005c, j12);
        }
    }

    @Override // io.reactivex.rxjava3.core.AbstractC41777j
    public final void u(org.reactivestreams.d<? super R> dVar) {
        new a((InterfaceC41782o) dVar);
        throw null;
    }
}
