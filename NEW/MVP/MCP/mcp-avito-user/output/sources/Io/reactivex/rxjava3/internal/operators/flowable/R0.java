package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.InterfaceC41782o;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.atomic.AtomicLong;
import s41.C47998a;

/* compiled from: FlowableOnBackpressureDrop.java */
/* loaded from: classes8.dex */
public final class R0<T> extends AbstractC41833b<T, T> implements l41.g<T> {

    /* renamed from: d, reason: collision with root package name */
    public final R0 f402521d;

    /* compiled from: FlowableOnBackpressureDrop.java */
    public static final class a<T> extends AtomicLong implements InterfaceC41782o<T>, org.reactivestreams.e {
        private static final long serialVersionUID = -6246093802440953054L;

        /* renamed from: b, reason: collision with root package name */
        public final InterfaceC41782o f402522b;

        /* renamed from: c, reason: collision with root package name */
        public final R0 f402523c;

        /* renamed from: d, reason: collision with root package name */
        public org.reactivestreams.e f402524d;

        /* renamed from: e, reason: collision with root package name */
        public boolean f402525e;

        public a(InterfaceC41782o interfaceC41782o, R0 r02) {
            this.f402522b = interfaceC41782o;
            this.f402523c = r02;
        }

        @Override // org.reactivestreams.d
        public final void K(org.reactivestreams.e eVar) {
            if (SubscriptionHelper.i(this.f402524d, eVar)) {
                this.f402524d = eVar;
                this.f402522b.K(this);
                eVar.request(Long.MAX_VALUE);
            }
        }

        @Override // org.reactivestreams.e
        public final void cancel() {
            this.f402524d.cancel();
        }

        @Override // org.reactivestreams.d
        public final void e() {
            if (this.f402525e) {
                return;
            }
            this.f402525e = true;
            this.f402522b.e();
        }

        @Override // org.reactivestreams.d
        public final void onError(Throwable th2) {
            if (this.f402525e) {
                C47998a.b(th2);
            } else {
                this.f402525e = true;
                this.f402522b.onError(th2);
            }
        }

        @Override // org.reactivestreams.d
        public final void onNext(T t12) {
            if (this.f402525e) {
                return;
            }
            if (get() != 0) {
                this.f402522b.onNext(t12);
                io.reactivex.rxjava3.internal.util.c.e(this, 1L);
                return;
            }
            try {
                this.f402523c.getClass();
            } catch (Throwable th2) {
                io.reactivex.rxjava3.exceptions.a.a(th2);
                cancel();
                onError(th2);
            }
        }

        @Override // org.reactivestreams.e
        public final void request(long j12) {
            if (SubscriptionHelper.h(j12)) {
                io.reactivex.rxjava3.internal.util.c.a(this, j12);
            }
        }
    }

    public R0(C41876p0 c41876p0) {
        super(c41876p0);
        this.f402521d = this;
    }

    @Override // io.reactivex.rxjava3.core.AbstractC41777j
    public final void u(org.reactivestreams.d<? super T> dVar) {
        this.f402624c.q(new a((InterfaceC41782o) dVar, this.f402521d));
    }

    @Override // l41.g
    public final void accept(T t12) {
    }
}
