package io.reactivex.rxjava3.internal.operators.parallel;

import io.reactivex.rxjava3.core.AbstractC41777j;
import io.reactivex.rxjava3.core.InterfaceC41782o;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: ParallelJoin.java */
/* loaded from: classes8.dex */
public final class j<T> extends AbstractC41777j<T> {

    /* compiled from: ParallelJoin.java */
    public static final class a<T> extends AtomicReference<org.reactivestreams.e> implements InterfaceC41782o<T> {
        private static final long serialVersionUID = 8410034718427740355L;

        public a() {
            throw null;
        }

        @Override // org.reactivestreams.d
        public final void K(org.reactivestreams.e eVar) {
            SubscriptionHelper.e(this, eVar, 0);
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
    }

    /* compiled from: ParallelJoin.java */
    public static final class b<T> extends c<T> {
        private static final long serialVersionUID = 6312374661811000451L;

        public b() {
            throw null;
        }
    }

    /* compiled from: ParallelJoin.java */
    public static abstract class c<T> extends AtomicInteger implements org.reactivestreams.e {
        private static final long serialVersionUID = 3100232009247827843L;

        /* renamed from: b, reason: collision with root package name */
        public volatile boolean f404452b;

        public c() {
            throw null;
        }

        @Override // org.reactivestreams.e
        public final void cancel() {
            if (this.f404452b) {
                return;
            }
            this.f404452b = true;
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

    /* compiled from: ParallelJoin.java */
    public static final class d<T> extends c<T> {
        private static final long serialVersionUID = -5737965195918321883L;

        public d() {
            throw null;
        }
    }

    @Override // io.reactivex.rxjava3.core.AbstractC41777j
    public final void u(org.reactivestreams.d<? super T> dVar) {
        throw null;
    }
}
