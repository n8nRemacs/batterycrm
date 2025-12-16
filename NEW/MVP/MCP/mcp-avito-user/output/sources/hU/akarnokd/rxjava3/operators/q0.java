package hu.akarnokd.rxjava3.operators;

import io.reactivex.rxjava3.core.AbstractC41777j;
import io.reactivex.rxjava3.core.InterfaceC41782o;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: SingleFlatMapSignalFlowable.java */
/* loaded from: classes8.dex */
final class q0<T, R> extends AbstractC41777j<R> implements io.reactivex.rxjava3.core.J<T, AbstractC41777j<R>> {

    /* compiled from: SingleFlatMapSignalFlowable.java */
    public static final class a<T, R> implements io.reactivex.rxjava3.core.L<T>, org.reactivestreams.e {

        /* renamed from: b, reason: collision with root package name */
        public final C11344a<R> f398116b;

        /* renamed from: c, reason: collision with root package name */
        public io.reactivex.rxjava3.disposables.d f398117c;

        /* compiled from: SingleFlatMapSignalFlowable.java */
        /* renamed from: hu.akarnokd.rxjava3.operators.q0$a$a, reason: collision with other inner class name */
        public static final class C11344a<R> extends AtomicReference<org.reactivestreams.e> implements InterfaceC41782o<R> {
            private static final long serialVersionUID = 314442824941893429L;

            /* renamed from: b, reason: collision with root package name */
            public final InterfaceC41782o f398118b;

            /* renamed from: c, reason: collision with root package name */
            public final AtomicLong f398119c = new AtomicLong();

            public C11344a(InterfaceC41782o interfaceC41782o) {
                this.f398118b = interfaceC41782o;
            }

            @Override // org.reactivestreams.d
            public final void K(org.reactivestreams.e eVar) {
                SubscriptionHelper.c(this, this.f398119c, eVar);
            }

            @Override // org.reactivestreams.d
            public final void e() {
                this.f398118b.e();
            }

            @Override // org.reactivestreams.d
            public final void onError(Throwable th2) {
                this.f398118b.onError(th2);
            }

            @Override // org.reactivestreams.d
            public final void onNext(R r12) {
                this.f398118b.onNext(r12);
            }
        }

        public a(InterfaceC41782o interfaceC41782o) {
            this.f398116b = new C11344a<>(interfaceC41782o);
        }

        @Override // io.reactivex.rxjava3.core.L
        public final void b(io.reactivex.rxjava3.disposables.d dVar) {
            if (DisposableHelper.f(this.f398117c, dVar)) {
                this.f398117c = dVar;
                this.f398116b.f398118b.K(this);
            }
        }

        @Override // org.reactivestreams.e
        public final void cancel() {
            this.f398117c.dispose();
            SubscriptionHelper.a(this.f398116b);
        }

        @Override // io.reactivex.rxjava3.core.L
        public final void onError(Throwable th2) {
            try {
                throw null;
            } catch (Throwable th3) {
                io.reactivex.rxjava3.exceptions.a.a(th3);
                this.f398116b.onError(th3);
            }
        }

        @Override // io.reactivex.rxjava3.core.L
        public final void onSuccess(T t12) {
            try {
                throw null;
            } catch (Throwable th2) {
                io.reactivex.rxjava3.exceptions.a.a(th2);
                this.f398116b.onError(th2);
            }
        }

        @Override // org.reactivestreams.e
        public final void request(long j12) {
            C11344a<R> c11344a = this.f398116b;
            SubscriptionHelper.b(c11344a, c11344a.f398119c, j12);
        }
    }

    @Override // io.reactivex.rxjava3.core.AbstractC41777j
    public final void u(org.reactivestreams.d<? super R> dVar) {
        new a((InterfaceC41782o) dVar);
        throw null;
    }
}
