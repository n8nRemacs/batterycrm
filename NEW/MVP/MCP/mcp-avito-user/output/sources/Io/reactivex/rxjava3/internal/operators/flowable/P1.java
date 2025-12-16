package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.InterfaceC41782o;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import s41.C47998a;

/* compiled from: FlowableTakeWhile.java */
/* loaded from: classes8.dex */
public final class P1<T> extends AbstractC41833b<T, T> {

    /* renamed from: d, reason: collision with root package name */
    public final l41.r<? super T> f402497d;

    /* compiled from: FlowableTakeWhile.java */
    public static final class a<T> implements InterfaceC41782o<T>, org.reactivestreams.e {

        /* renamed from: b, reason: collision with root package name */
        public final InterfaceC41782o f402498b;

        /* renamed from: c, reason: collision with root package name */
        public final l41.r<? super T> f402499c;

        /* renamed from: d, reason: collision with root package name */
        public org.reactivestreams.e f402500d;

        /* renamed from: e, reason: collision with root package name */
        public boolean f402501e;

        public a(InterfaceC41782o interfaceC41782o, l41.r rVar) {
            this.f402498b = interfaceC41782o;
            this.f402499c = rVar;
        }

        @Override // org.reactivestreams.d
        public final void K(org.reactivestreams.e eVar) {
            if (SubscriptionHelper.i(this.f402500d, eVar)) {
                this.f402500d = eVar;
                this.f402498b.K(this);
            }
        }

        @Override // org.reactivestreams.e
        public final void cancel() {
            this.f402500d.cancel();
        }

        @Override // org.reactivestreams.d
        public final void e() {
            if (this.f402501e) {
                return;
            }
            this.f402501e = true;
            this.f402498b.e();
        }

        @Override // org.reactivestreams.d
        public final void onError(Throwable th2) {
            if (this.f402501e) {
                C47998a.b(th2);
            } else {
                this.f402501e = true;
                this.f402498b.onError(th2);
            }
        }

        @Override // org.reactivestreams.d
        public final void onNext(T t12) {
            if (this.f402501e) {
                return;
            }
            try {
                boolean zTest = this.f402499c.test(t12);
                InterfaceC41782o interfaceC41782o = this.f402498b;
                if (zTest) {
                    interfaceC41782o.onNext(t12);
                    return;
                }
                this.f402501e = true;
                this.f402500d.cancel();
                interfaceC41782o.e();
            } catch (Throwable th2) {
                io.reactivex.rxjava3.exceptions.a.a(th2);
                this.f402500d.cancel();
                onError(th2);
            }
        }

        @Override // org.reactivestreams.e
        public final void request(long j12) {
            this.f402500d.request(j12);
        }
    }

    public P1(G0 g02, l41.r rVar) {
        super(g02);
        this.f402497d = rVar;
    }

    @Override // io.reactivex.rxjava3.core.AbstractC41777j
    public final void u(org.reactivestreams.d<? super T> dVar) {
        this.f402624c.q(new a((InterfaceC41782o) dVar, this.f402497d));
    }
}
