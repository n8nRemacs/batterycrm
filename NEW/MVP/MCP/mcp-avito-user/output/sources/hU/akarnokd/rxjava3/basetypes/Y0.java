package hu.akarnokd.rxjava3.basetypes;

import io.reactivex.rxjava3.exceptions.CompositeException;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PerhapsRetryWhile.java */
/* loaded from: classes8.dex */
final class Y0<T> extends AbstractC41069k0<T> {

    /* compiled from: PerhapsRetryWhile.java */
    public static final class a<T> extends o41.f<T> implements org.reactivestreams.d<T> {
        private static final long serialVersionUID = -1726278593241855499L;

        /* renamed from: d, reason: collision with root package name */
        public final AtomicInteger f397664d;

        /* renamed from: e, reason: collision with root package name */
        public final AtomicReference<org.reactivestreams.e> f397665e;

        /* renamed from: f, reason: collision with root package name */
        public volatile boolean f397666f;

        public a(org.reactivestreams.d dVar) {
            super(dVar);
            this.f397664d = new AtomicInteger();
            this.f397665e = new AtomicReference<>();
        }

        @Override // org.reactivestreams.d
        public final void K(org.reactivestreams.e eVar) {
            if (SubscriptionHelper.d(this.f397665e, eVar)) {
                eVar.request(Long.MAX_VALUE);
            }
        }

        @Override // o41.f, org.reactivestreams.e
        public final void cancel() {
            super.cancel();
            SubscriptionHelper.a(this.f397665e);
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

    @Override // hu.akarnokd.rxjava3.basetypes.AbstractC41069k0
    public final void a(org.reactivestreams.d<? super T> dVar) {
        a aVar = new a(dVar);
        dVar.K(aVar);
        if (aVar.f397664d.getAndIncrement() == 0) {
            while (SubscriptionHelper.f404813b != aVar.f397665e.get()) {
                if (!aVar.f397666f) {
                    aVar.f397666f = true;
                    throw null;
                }
                if (aVar.f397664d.decrementAndGet() == 0) {
                    return;
                }
            }
        }
    }
}
