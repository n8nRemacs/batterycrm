package hu.akarnokd.rxjava3.basetypes;

import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: SoloRetry.java */
/* loaded from: classes8.dex */
final class S1<T> extends AbstractC41073l1<T> {

    /* compiled from: SoloRetry.java */
    public static final class a<T> extends o41.f<T> implements org.reactivestreams.d<T> {
        private static final long serialVersionUID = -1726278593241855499L;

        /* renamed from: d, reason: collision with root package name */
        public final AtomicInteger f397621d;

        /* renamed from: e, reason: collision with root package name */
        public final AtomicReference<org.reactivestreams.e> f397622e;

        /* renamed from: f, reason: collision with root package name */
        public long f397623f;

        /* renamed from: g, reason: collision with root package name */
        public volatile boolean f397624g;

        public a(org.reactivestreams.d dVar) {
            super(dVar);
            this.f397623f = 0L;
            this.f397621d = new AtomicInteger();
            this.f397622e = new AtomicReference<>();
        }

        @Override // org.reactivestreams.d
        public final void K(org.reactivestreams.e eVar) {
            if (SubscriptionHelper.d(this.f397622e, eVar)) {
                eVar.request(Long.MAX_VALUE);
            }
        }

        @Override // o41.f, org.reactivestreams.e
        public final void cancel() {
            super.cancel();
            SubscriptionHelper.a(this.f397622e);
        }

        @Override // org.reactivestreams.d
        public final void e() {
            T t12 = this.f419377c;
            if (t12 == null) {
                this.f419376b.e();
            } else {
                this.f419377c = null;
                l(t12);
            }
        }

        public final void n() {
            if (this.f397621d.getAndIncrement() == 0) {
                while (SubscriptionHelper.f404813b != this.f397622e.get()) {
                    if (!this.f397624g) {
                        this.f397624g = true;
                        throw null;
                    }
                    if (this.f397621d.decrementAndGet() == 0) {
                        return;
                    }
                }
            }
        }

        @Override // org.reactivestreams.d
        public final void onError(Throwable th2) {
            long j12 = this.f397623f;
            if (j12 != Long.MAX_VALUE) {
                long j13 = j12 - 1;
                if (j13 == 0) {
                    this.f419376b.onError(th2);
                    return;
                }
                this.f397623f = j13;
            }
            this.f397624g = false;
            n();
        }

        @Override // org.reactivestreams.d
        public final void onNext(T t12) {
            this.f419377c = t12;
        }
    }

    @Override // hu.akarnokd.rxjava3.basetypes.AbstractC41073l1
    public final void a(org.reactivestreams.d<? super T> dVar) {
        a aVar = new a(dVar);
        dVar.K(aVar);
        aVar.n();
    }
}
