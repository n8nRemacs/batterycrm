package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.AbstractC41777j;
import io.reactivex.rxjava3.core.InterfaceC41782o;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import java.util.NoSuchElementException;
import s41.C47998a;

/* compiled from: FlowableSingle.java */
/* renamed from: io.reactivex.rxjava3.internal.operators.flowable.x1, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41900x1<T> extends AbstractC41833b<T, T> {

    /* renamed from: d, reason: collision with root package name */
    public final boolean f403100d;

    /* compiled from: FlowableSingle.java */
    /* renamed from: io.reactivex.rxjava3.internal.operators.flowable.x1$a */
    public static final class a<T> extends o41.f<T> implements InterfaceC41782o<T> {
        private static final long serialVersionUID = -5526049321428043809L;

        /* renamed from: d, reason: collision with root package name */
        public final boolean f403101d;

        /* renamed from: e, reason: collision with root package name */
        public org.reactivestreams.e f403102e;

        /* renamed from: f, reason: collision with root package name */
        public boolean f403103f;

        public a(InterfaceC41782o interfaceC41782o, boolean z12) {
            super(interfaceC41782o);
            this.f403101d = z12;
        }

        @Override // org.reactivestreams.d
        public final void K(org.reactivestreams.e eVar) {
            if (SubscriptionHelper.i(this.f403102e, eVar)) {
                this.f403102e = eVar;
                this.f419376b.K(this);
                eVar.request(Long.MAX_VALUE);
            }
        }

        @Override // o41.f, org.reactivestreams.e
        public final void cancel() {
            super.cancel();
            this.f403102e.cancel();
        }

        @Override // org.reactivestreams.d
        public final void e() {
            if (this.f403103f) {
                return;
            }
            this.f403103f = true;
            T t12 = this.f419377c;
            this.f419377c = null;
            if (t12 == null) {
                t12 = null;
            }
            if (t12 != null) {
                l(t12);
                return;
            }
            boolean z12 = this.f403101d;
            org.reactivestreams.d<? super T> dVar = this.f419376b;
            if (z12) {
                dVar.onError(new NoSuchElementException());
            } else {
                dVar.e();
            }
        }

        @Override // org.reactivestreams.d
        public final void onError(Throwable th2) {
            if (this.f403103f) {
                C47998a.b(th2);
            } else {
                this.f403103f = true;
                this.f419376b.onError(th2);
            }
        }

        @Override // org.reactivestreams.d
        public final void onNext(T t12) {
            if (this.f403103f) {
                return;
            }
            if (this.f419377c == null) {
                this.f419377c = t12;
                return;
            }
            this.f403103f = true;
            this.f403102e.cancel();
            this.f419376b.onError(new IllegalArgumentException("Sequence contains more than one element!"));
        }
    }

    public C41900x1(AbstractC41777j abstractC41777j, boolean z12) {
        super(abstractC41777j);
        this.f403100d = z12;
    }

    @Override // io.reactivex.rxjava3.core.AbstractC41777j
    public final void u(org.reactivestreams.d<? super T> dVar) {
        this.f402624c.q(new a((InterfaceC41782o) dVar, this.f403100d));
    }
}
