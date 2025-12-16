package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.InterfaceC41782o;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import s41.C47998a;

/* compiled from: FlowableAll.java */
/* renamed from: io.reactivex.rxjava3.internal.operators.flowable.g, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41848g<T> extends AbstractC41833b<T, Boolean> {

    /* compiled from: FlowableAll.java */
    /* renamed from: io.reactivex.rxjava3.internal.operators.flowable.g$a */
    public static final class a<T> extends o41.f<Boolean> implements InterfaceC41782o<T> {
        private static final long serialVersionUID = -3521127104134758517L;

        /* renamed from: d, reason: collision with root package name */
        public org.reactivestreams.e f402775d;

        /* renamed from: e, reason: collision with root package name */
        public boolean f402776e;

        @Override // org.reactivestreams.d
        public final void K(org.reactivestreams.e eVar) {
            if (SubscriptionHelper.i(this.f402775d, eVar)) {
                this.f402775d = eVar;
                this.f419376b.K(this);
                eVar.request(Long.MAX_VALUE);
            }
        }

        @Override // o41.f, org.reactivestreams.e
        public final void cancel() {
            super.cancel();
            this.f402775d.cancel();
        }

        @Override // org.reactivestreams.d
        public final void e() {
            if (this.f402776e) {
                return;
            }
            this.f402776e = true;
            l(Boolean.TRUE);
        }

        @Override // org.reactivestreams.d
        public final void onError(Throwable th2) {
            if (this.f402776e) {
                C47998a.b(th2);
            } else {
                this.f402776e = true;
                this.f419376b.onError(th2);
            }
        }

        @Override // org.reactivestreams.d
        public final void onNext(T t12) {
            if (this.f402776e) {
                return;
            }
            try {
                throw null;
            } catch (Throwable th2) {
                io.reactivex.rxjava3.exceptions.a.a(th2);
                this.f402775d.cancel();
                onError(th2);
            }
        }
    }

    public C41848g() {
        super(null);
    }

    @Override // io.reactivex.rxjava3.core.AbstractC41777j
    public final void u(org.reactivestreams.d<? super Boolean> dVar) {
        this.f402624c.q(new a((InterfaceC41782o) dVar));
    }
}
