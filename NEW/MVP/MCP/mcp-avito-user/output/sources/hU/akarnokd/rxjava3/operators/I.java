package hu.akarnokd.rxjava3.operators;

import io.reactivex.rxjava3.core.AbstractC41777j;
import io.reactivex.rxjava3.core.InterfaceC41783p;
import io.reactivex.rxjava3.internal.fuseable.SimplePlainQueue;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.TimeUnit;

/* compiled from: FlowableSpanout.java */
/* loaded from: classes8.dex */
final class I<T> extends AbstractC41777j<T> implements InterfaceC41783p<T, T> {

    /* compiled from: FlowableSpanout.java */
    public static final class a<T> implements org.reactivestreams.d<T>, org.reactivestreams.e, Runnable {

        /* renamed from: b, reason: collision with root package name */
        public long f397942b;

        /* renamed from: c, reason: collision with root package name */
        public org.reactivestreams.e f397943c;

        /* renamed from: d, reason: collision with root package name */
        public volatile Object f397944d;

        @Override // org.reactivestreams.d
        public final void K(org.reactivestreams.e eVar) {
            if (SubscriptionHelper.i(this.f397943c, eVar)) {
                this.f397943c = eVar;
                throw null;
            }
        }

        @Override // org.reactivestreams.e
        public final void cancel() {
            throw null;
        }

        @Override // org.reactivestreams.d
        public final void e() {
            this.f397944d = this;
            TimeUnit timeUnit = TimeUnit.NANOSECONDS;
            throw null;
        }

        @Override // org.reactivestreams.d
        public final void onError(Throwable th2) {
            this.f397944d = th2;
            throw null;
        }

        @Override // org.reactivestreams.d
        public final void onNext(T t12) {
            SimplePlainQueue simplePlainQueue = null;
            simplePlainQueue.offer(t12);
            throw null;
        }

        @Override // org.reactivestreams.e
        public final void request(long j12) {
            this.f397943c.request(j12);
        }

        @Override // java.lang.Runnable
        public final void run() {
            Object obj = this.f397944d;
            if (obj == null || obj == this) {
                SimplePlainQueue simplePlainQueue = null;
                simplePlainQueue.poll();
                throw null;
            }
            SimplePlainQueue simplePlainQueue2 = null;
            simplePlainQueue2.clear();
            throw null;
        }
    }

    @Override // io.reactivex.rxjava3.core.AbstractC41777j
    public final void u(org.reactivestreams.d<? super T> dVar) {
        throw null;
    }
}
