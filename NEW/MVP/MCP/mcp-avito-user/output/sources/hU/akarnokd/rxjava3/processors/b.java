package hu.akarnokd.rxjava3.processors;

import io.reactivex.rxjava3.core.InterfaceC41782o;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.atomic.AtomicBoolean;
import org.reactivestreams.e;

/* compiled from: FlowableProcessorWrap.java */
/* loaded from: classes8.dex */
final class b<T> extends io.reactivex.rxjava3.processors.c<T> {

    /* compiled from: FlowableProcessorWrap.java */
    public final class a extends AtomicBoolean implements org.reactivestreams.d<T>, e {
        private static final long serialVersionUID = -6891177704330298695L;

        /* renamed from: b, reason: collision with root package name */
        public final InterfaceC41782o f398197b;

        /* renamed from: c, reason: collision with root package name */
        public e f398198c;

        public a(InterfaceC41782o interfaceC41782o) {
            this.f398197b = interfaceC41782o;
        }

        @Override // org.reactivestreams.d
        public final void K(e eVar) {
            this.f398198c = eVar;
            this.f398197b.K(this);
        }

        @Override // org.reactivestreams.e
        public final void cancel() {
            if (compareAndSet(false, true)) {
                this.f398198c.cancel();
                this.f398198c = SubscriptionHelper.f404813b;
            }
        }

        @Override // org.reactivestreams.d
        public final void e() {
            this.f398198c = SubscriptionHelper.f404813b;
            this.f398197b.e();
        }

        @Override // org.reactivestreams.d
        public final void onError(Throwable th2) {
            this.f398198c = SubscriptionHelper.f404813b;
            this.f398197b.onError(th2);
        }

        @Override // org.reactivestreams.d
        public final void onNext(T t12) {
            this.f398197b.onNext(t12);
        }

        @Override // org.reactivestreams.e
        public final void request(long j12) {
            this.f398198c.request(j12);
        }
    }

    @Override // org.reactivestreams.d
    public final void K(e eVar) {
        throw null;
    }

    @Override // org.reactivestreams.d
    public final void e() {
        throw null;
    }

    @Override // org.reactivestreams.d
    public final void onError(Throwable th2) {
        throw null;
    }

    @Override // org.reactivestreams.d
    public final void onNext(T t12) {
        throw null;
    }

    @Override // io.reactivex.rxjava3.core.AbstractC41777j
    public final void u(org.reactivestreams.d<? super T> dVar) {
        new a((InterfaceC41782o) dVar);
        throw null;
    }
}
