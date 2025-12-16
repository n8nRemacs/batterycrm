package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.InterfaceC41782o;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import s41.C47998a;

/* compiled from: FlowableTakeUntilPredicate.java */
/* loaded from: classes8.dex */
public final class O1<T> extends AbstractC41833b<T, T> {

    /* compiled from: FlowableTakeUntilPredicate.java */
    public static final class a<T> implements InterfaceC41782o<T>, org.reactivestreams.e {

        /* renamed from: b, reason: collision with root package name */
        public final InterfaceC41782o f402479b;

        /* renamed from: c, reason: collision with root package name */
        public org.reactivestreams.e f402480c;

        /* renamed from: d, reason: collision with root package name */
        public boolean f402481d;

        public a(InterfaceC41782o interfaceC41782o) {
            this.f402479b = interfaceC41782o;
        }

        @Override // org.reactivestreams.d
        public final void K(org.reactivestreams.e eVar) {
            if (SubscriptionHelper.i(this.f402480c, eVar)) {
                this.f402480c = eVar;
                this.f402479b.K(this);
            }
        }

        @Override // org.reactivestreams.e
        public final void cancel() {
            this.f402480c.cancel();
        }

        @Override // org.reactivestreams.d
        public final void e() {
            if (this.f402481d) {
                return;
            }
            this.f402481d = true;
            this.f402479b.e();
        }

        @Override // org.reactivestreams.d
        public final void onError(Throwable th2) {
            if (this.f402481d) {
                C47998a.b(th2);
            } else {
                this.f402481d = true;
                this.f402479b.onError(th2);
            }
        }

        @Override // org.reactivestreams.d
        public final void onNext(T t12) {
            if (this.f402481d) {
                return;
            }
            this.f402479b.onNext(t12);
            try {
                throw null;
            } catch (Throwable th2) {
                io.reactivex.rxjava3.exceptions.a.a(th2);
                this.f402480c.cancel();
                onError(th2);
            }
        }

        @Override // org.reactivestreams.e
        public final void request(long j12) {
            this.f402480c.request(j12);
        }
    }

    @Override // io.reactivex.rxjava3.core.AbstractC41777j
    public final void u(org.reactivestreams.d<? super T> dVar) {
        this.f402624c.q(new a((InterfaceC41782o) dVar));
    }
}
