package hu.akarnokd.rxjava3.operators;

import io.reactivex.rxjava3.core.AbstractC41777j;
import io.reactivex.rxjava3.core.InterfaceC41783p;
import io.reactivex.rxjava3.internal.subscriptions.EmptySubscription;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: FlowableSwitchIfEmptyMany.java */
/* loaded from: classes8.dex */
final class K<T> extends AbstractC41777j<T> implements InterfaceC41783p<T, T> {

    /* compiled from: FlowableSwitchIfEmptyMany.java */
    public static final class a<T> extends AtomicInteger implements org.reactivestreams.d<T>, org.reactivestreams.e {
        private static final long serialVersionUID = -174718617614474267L;

        /* renamed from: b, reason: collision with root package name */
        public boolean f397957b;

        /* renamed from: c, reason: collision with root package name */
        public volatile boolean f397958c;

        @Override // org.reactivestreams.d
        public final void K(org.reactivestreams.e eVar) {
            if (SubscriptionHelper.d(null, eVar)) {
                throw null;
            }
        }

        @Override // org.reactivestreams.e
        public final void cancel() {
            SubscriptionHelper.a(null);
        }

        @Override // org.reactivestreams.d
        public final void e() {
            if (this.f397957b) {
                throw null;
            }
            this.f397958c = false;
            if (getAndIncrement() == 0) {
                throw null;
            }
        }

        @Override // org.reactivestreams.d
        public final void onError(Throwable th2) {
            throw null;
        }

        @Override // org.reactivestreams.d
        public final void onNext(T t12) {
            if (!this.f397957b) {
                this.f397957b = true;
            }
            throw null;
        }

        @Override // org.reactivestreams.e
        public final void request(long j12) {
            if (SubscriptionHelper.h(j12)) {
                io.reactivex.rxjava3.internal.util.c.a(null, j12);
                throw null;
            }
        }
    }

    @Override // io.reactivex.rxjava3.core.AbstractC41777j
    public final void u(org.reactivestreams.d<? super T> dVar) {
        try {
            throw null;
        } catch (Throwable th2) {
            io.reactivex.rxjava3.exceptions.a.a(th2);
            EmptySubscription.b(th2, dVar);
        }
    }
}
