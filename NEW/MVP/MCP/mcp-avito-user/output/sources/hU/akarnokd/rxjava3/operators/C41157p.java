package hu.akarnokd.rxjava3.operators;

import io.reactivex.rxjava3.core.AbstractC41777j;
import io.reactivex.rxjava3.core.InterfaceC41782o;
import io.reactivex.rxjava3.core.InterfaceC41783p;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;

/* compiled from: FlowableEvery.java */
/* renamed from: hu.akarnokd.rxjava3.operators.p, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C41157p<T> extends AbstractC41777j<T> implements InterfaceC41783p<T, T> {

    /* compiled from: FlowableEvery.java */
    /* renamed from: hu.akarnokd.rxjava3.operators.p$a */
    public static final class a<T> implements org.reactivestreams.d<T>, org.reactivestreams.e {

        /* renamed from: b, reason: collision with root package name */
        public final InterfaceC41782o f398098b;

        /* renamed from: c, reason: collision with root package name */
        public long f398099c;

        /* renamed from: d, reason: collision with root package name */
        public org.reactivestreams.e f398100d;

        public a(InterfaceC41782o interfaceC41782o) {
            this.f398098b = interfaceC41782o;
        }

        @Override // org.reactivestreams.d
        public final void K(org.reactivestreams.e eVar) {
            if (SubscriptionHelper.i(this.f398100d, eVar)) {
                this.f398100d = eVar;
                this.f398098b.K(this);
            }
        }

        @Override // org.reactivestreams.e
        public final void cancel() {
            this.f398100d.cancel();
        }

        @Override // org.reactivestreams.d
        public final void e() {
            this.f398098b.e();
        }

        @Override // org.reactivestreams.d
        public final void onError(Throwable th2) {
            this.f398098b.onError(th2);
        }

        @Override // org.reactivestreams.d
        public final void onNext(T t12) {
            long j12 = this.f398099c + 1;
            if (j12 != 0) {
                this.f398099c = j12;
            } else {
                this.f398099c = 0L;
                this.f398098b.onNext(t12);
            }
        }

        @Override // org.reactivestreams.e
        public final void request(long j12) {
            if (SubscriptionHelper.h(j12)) {
                this.f398100d.request(io.reactivex.rxjava3.internal.util.c.d(j12, 0L));
            }
        }
    }

    @Override // io.reactivex.rxjava3.core.AbstractC41777j
    public final void u(org.reactivestreams.d<? super T> dVar) {
        new a((InterfaceC41782o) dVar);
        throw null;
    }
}
