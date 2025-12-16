package io.reactivex.rxjava3.internal.operators.flowable;

import com.avito.android.C34429s0;
import io.reactivex.rxjava3.core.AbstractC41777j;
import io.reactivex.rxjava3.core.InterfaceC41782o;
import io.reactivex.rxjava3.internal.subscriptions.EmptySubscription;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import s41.C47998a;

/* compiled from: FlowableDoOnLifecycle.java */
/* loaded from: classes8.dex */
public final class T<T> extends AbstractC41833b<T, T> {

    /* renamed from: d, reason: collision with root package name */
    public final l41.g<? super org.reactivestreams.e> f402546d;

    /* renamed from: e, reason: collision with root package name */
    public final l41.q f402547e;

    /* renamed from: f, reason: collision with root package name */
    public final C34429s0 f402548f;

    /* compiled from: FlowableDoOnLifecycle.java */
    public static final class a<T> implements InterfaceC41782o<T>, org.reactivestreams.e {

        /* renamed from: b, reason: collision with root package name */
        public final InterfaceC41782o f402549b;

        /* renamed from: c, reason: collision with root package name */
        public final l41.g<? super org.reactivestreams.e> f402550c;

        /* renamed from: d, reason: collision with root package name */
        public final l41.q f402551d;

        /* renamed from: e, reason: collision with root package name */
        public final C34429s0 f402552e;

        /* renamed from: f, reason: collision with root package name */
        public org.reactivestreams.e f402553f;

        public a(InterfaceC41782o interfaceC41782o, l41.g gVar, l41.q qVar, C34429s0 c34429s0) {
            this.f402549b = interfaceC41782o;
            this.f402550c = gVar;
            this.f402552e = c34429s0;
            this.f402551d = qVar;
        }

        @Override // org.reactivestreams.d
        public final void K(org.reactivestreams.e eVar) {
            InterfaceC41782o interfaceC41782o = this.f402549b;
            try {
                this.f402550c.getClass();
                if (SubscriptionHelper.i(this.f402553f, eVar)) {
                    this.f402553f = eVar;
                    interfaceC41782o.K(this);
                }
            } catch (Throwable th2) {
                io.reactivex.rxjava3.exceptions.a.a(th2);
                eVar.cancel();
                this.f402553f = SubscriptionHelper.f404813b;
                EmptySubscription.b(th2, interfaceC41782o);
            }
        }

        @Override // org.reactivestreams.e
        public final void cancel() {
            org.reactivestreams.e eVar = this.f402553f;
            SubscriptionHelper subscriptionHelper = SubscriptionHelper.f404813b;
            if (eVar != subscriptionHelper) {
                this.f402553f = subscriptionHelper;
                try {
                    this.f402552e.run();
                } catch (Throwable th2) {
                    io.reactivex.rxjava3.exceptions.a.a(th2);
                    C47998a.b(th2);
                }
                eVar.cancel();
            }
        }

        @Override // org.reactivestreams.d
        public final void e() {
            if (this.f402553f != SubscriptionHelper.f404813b) {
                this.f402549b.e();
            }
        }

        @Override // org.reactivestreams.d
        public final void onError(Throwable th2) {
            if (this.f402553f != SubscriptionHelper.f404813b) {
                this.f402549b.onError(th2);
            } else {
                C47998a.b(th2);
            }
        }

        @Override // org.reactivestreams.d
        public final void onNext(T t12) {
            this.f402549b.onNext(t12);
        }

        @Override // org.reactivestreams.e
        public final void request(long j12) {
            try {
                this.f402551d.getClass();
            } catch (Throwable th2) {
                io.reactivex.rxjava3.exceptions.a.a(th2);
                C47998a.b(th2);
            }
            this.f402553f.request(j12);
        }
    }

    public T(AbstractC41777j abstractC41777j, l41.g gVar, l41.q qVar, C34429s0 c34429s0) {
        super(abstractC41777j);
        this.f402546d = gVar;
        this.f402547e = qVar;
        this.f402548f = c34429s0;
    }

    @Override // io.reactivex.rxjava3.core.AbstractC41777j
    public final void u(org.reactivestreams.d<? super T> dVar) {
        InterfaceC41782o interfaceC41782o = (InterfaceC41782o) dVar;
        this.f402624c.q(new a(interfaceC41782o, this.f402546d, this.f402547e, this.f402548f));
    }
}
