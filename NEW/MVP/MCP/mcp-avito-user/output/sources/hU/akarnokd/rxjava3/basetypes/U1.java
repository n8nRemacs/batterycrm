package hu.akarnokd.rxjava3.basetypes;

import io.reactivex.rxjava3.exceptions.CompositeException;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: SoloRetryWhile.java */
/* loaded from: classes8.dex */
final class U1<T> extends AbstractC41073l1<T> {

    /* compiled from: SoloRetryWhile.java */
    public static final class a<T> extends o41.f<T> implements org.reactivestreams.d<T> {
        private static final long serialVersionUID = -1726278593241855499L;

        /* renamed from: d, reason: collision with root package name */
        public final AtomicInteger f397631d;

        /* renamed from: e, reason: collision with root package name */
        public final AtomicReference<org.reactivestreams.e> f397632e;

        /* renamed from: f, reason: collision with root package name */
        public volatile boolean f397633f;

        public a(org.reactivestreams.d dVar) {
            super(dVar);
            this.f397631d = new AtomicInteger();
            this.f397632e = new AtomicReference<>();
        }

        @Override // org.reactivestreams.d
        public final void K(org.reactivestreams.e eVar) {
            if (SubscriptionHelper.d(this.f397632e, eVar)) {
                eVar.request(Long.MAX_VALUE);
            }
        }

        @Override // o41.f, org.reactivestreams.e
        public final void cancel() {
            super.cancel();
            SubscriptionHelper.a(this.f397632e);
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

        @Override // org.reactivestreams.d
        public final void onError(Throwable th2) {
            try {
                throw null;
            } catch (Throwable th3) {
                io.reactivex.rxjava3.exceptions.a.a(th3);
                this.f419376b.onError(new CompositeException(th2, th3));
            }
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
        if (aVar.f397631d.getAndIncrement() == 0) {
            while (SubscriptionHelper.f404813b != aVar.f397632e.get()) {
                if (!aVar.f397633f) {
                    aVar.f397633f = true;
                    throw null;
                }
                if (aVar.f397631d.decrementAndGet() == 0) {
                    return;
                }
            }
        }
    }
}
