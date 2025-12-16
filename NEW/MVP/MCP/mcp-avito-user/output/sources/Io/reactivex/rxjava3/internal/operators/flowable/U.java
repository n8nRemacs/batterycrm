package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.InterfaceC41782o;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import java.util.NoSuchElementException;
import s41.C47998a;

/* compiled from: FlowableElementAt.java */
/* loaded from: classes8.dex */
public final class U<T> extends AbstractC41833b<T, T> {

    /* renamed from: d, reason: collision with root package name */
    public final boolean f402558d;

    /* compiled from: FlowableElementAt.java */
    public static final class a<T> extends o41.f<T> implements InterfaceC41782o<T> {
        private static final long serialVersionUID = 4066607327284737757L;

        /* renamed from: d, reason: collision with root package name */
        public final boolean f402559d;

        /* renamed from: e, reason: collision with root package name */
        public org.reactivestreams.e f402560e;

        /* renamed from: f, reason: collision with root package name */
        public long f402561f;

        /* renamed from: g, reason: collision with root package name */
        public boolean f402562g;

        public a(InterfaceC41782o interfaceC41782o, boolean z12) {
            super(interfaceC41782o);
            this.f402559d = z12;
        }

        @Override // org.reactivestreams.d
        public final void K(org.reactivestreams.e eVar) {
            if (SubscriptionHelper.i(this.f402560e, eVar)) {
                this.f402560e = eVar;
                this.f419376b.K(this);
                eVar.request(Long.MAX_VALUE);
            }
        }

        @Override // o41.f, org.reactivestreams.e
        public final void cancel() {
            super.cancel();
            this.f402560e.cancel();
        }

        @Override // org.reactivestreams.d
        public final void e() {
            if (this.f402562g) {
                return;
            }
            this.f402562g = true;
            boolean z12 = this.f402559d;
            org.reactivestreams.d<? super T> dVar = this.f419376b;
            if (z12) {
                dVar.onError(new NoSuchElementException());
            } else {
                dVar.e();
            }
        }

        @Override // org.reactivestreams.d
        public final void onError(Throwable th2) {
            if (this.f402562g) {
                C47998a.b(th2);
            } else {
                this.f402562g = true;
                this.f419376b.onError(th2);
            }
        }

        @Override // org.reactivestreams.d
        public final void onNext(T t12) {
            if (this.f402562g) {
                return;
            }
            long j12 = this.f402561f;
            if (j12 != 0) {
                this.f402561f = j12 + 1;
                return;
            }
            this.f402562g = true;
            this.f402560e.cancel();
            l(t12);
        }
    }

    public U(boolean z12) {
        super(null);
        this.f402558d = z12;
    }

    @Override // io.reactivex.rxjava3.core.AbstractC41777j
    public final void u(org.reactivestreams.d<? super T> dVar) {
        this.f402624c.q(new a((InterfaceC41782o) dVar, this.f402558d));
    }
}
