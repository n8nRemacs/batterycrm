package hu.akarnokd.rxjava3.operators;

import io.reactivex.rxjava3.core.AbstractC41777j;
import io.reactivex.rxjava3.core.InterfaceC41782o;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* compiled from: FlowableZipLatest.java */
/* loaded from: classes8.dex */
final class U<T, R> extends AbstractC41777j<R> {

    /* compiled from: FlowableZipLatest.java */
    public static final class a<T, R> extends AtomicReferenceArray<T> implements org.reactivestreams.e, Runnable {
        private static final long serialVersionUID = -8321911708267957704L;

        /* compiled from: FlowableZipLatest.java */
        /* renamed from: hu.akarnokd.rxjava3.operators.U$a$a, reason: collision with other inner class name */
        public static final class C11325a<T> extends AtomicReference<org.reactivestreams.e> implements InterfaceC41782o<T> {
            private static final long serialVersionUID = -5384962852497888461L;

            public C11325a() {
                throw null;
            }

            @Override // org.reactivestreams.d
            public final void K(org.reactivestreams.e eVar) {
                if (SubscriptionHelper.f(this, eVar)) {
                    eVar.request(Long.MAX_VALUE);
                }
            }

            @Override // org.reactivestreams.d
            public final void e() {
                lazySet(SubscriptionHelper.f404813b);
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
        }

        public a() {
            throw null;
        }

        @Override // org.reactivestreams.e
        public final void cancel() {
            throw null;
        }

        @Override // org.reactivestreams.e
        public final void request(long j12) {
            if (SubscriptionHelper.h(j12)) {
                io.reactivex.rxjava3.internal.util.c.a(null, j12);
                throw null;
            }
        }

        @Override // java.lang.Runnable
        public final void run() {
            throw null;
        }
    }

    @Override // io.reactivex.rxjava3.core.AbstractC41777j
    public final void u(org.reactivestreams.d<? super R> dVar) {
        throw null;
    }
}
