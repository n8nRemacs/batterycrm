package hu.akarnokd.rxjava3.processors;

import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import io.reactivex.rxjava3.internal.util.h;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import org.reactivestreams.e;

/* compiled from: DispatchWorkProcessor.java */
/* loaded from: classes8.dex */
public final class a<T> extends io.reactivex.rxjava3.processors.c<T> implements io.reactivex.rxjava3.disposables.d {

    /* compiled from: DispatchWorkProcessor.java */
    /* renamed from: hu.akarnokd.rxjava3.processors.a$a, reason: collision with other inner class name */
    public static final class RunnableC11349a<T> extends AtomicInteger implements e, Runnable {
        private static final long serialVersionUID = 7597704795244221647L;

        public RunnableC11349a() {
            throw null;
        }

        @Override // org.reactivestreams.e
        public final void cancel() {
            throw null;
        }

        @Override // org.reactivestreams.e
        public final void request(long j12) {
            io.reactivex.rxjava3.internal.util.c.a(null, j12);
            throw null;
        }

        @Override // java.lang.Runnable
        public final void run() {
            throw null;
        }
    }

    @Override // org.reactivestreams.d
    public final void K(e eVar) {
        if (SubscriptionHelper.f(null, eVar)) {
            eVar.request(0L);
        }
    }

    @Override // io.reactivex.rxjava3.disposables.d
    public final void dispose() {
        SubscriptionHelper.a(null);
        throw null;
    }

    @Override // org.reactivestreams.d
    public final void e() {
        Throwable th2 = h.f404834a;
        throw null;
    }

    @Override // io.reactivex.rxjava3.disposables.d
    /* renamed from: i */
    public final boolean getF318621e() {
        throw null;
    }

    @Override // org.reactivestreams.d
    public final void onError(Throwable th2) {
        Objects.requireNonNull(th2, "e is null");
        throw null;
    }

    @Override // org.reactivestreams.d
    public final void onNext(T t12) {
        throw null;
    }

    @Override // io.reactivex.rxjava3.core.AbstractC41777j
    public final void u(org.reactivestreams.d<? super T> dVar) {
        throw null;
    }
}
