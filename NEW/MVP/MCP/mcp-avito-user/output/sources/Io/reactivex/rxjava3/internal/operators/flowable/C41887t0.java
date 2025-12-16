package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.AbstractC41777j;
import io.reactivex.rxjava3.core.InterfaceC41776i;
import io.reactivex.rxjava3.internal.subscriptions.EmptySubscription;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.atomic.AtomicLong;
import s41.C47998a;

/* compiled from: FlowableGenerate.java */
/* renamed from: io.reactivex.rxjava3.internal.operators.flowable.t0, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41887t0<T, S> extends AbstractC41777j<T> {

    /* compiled from: FlowableGenerate.java */
    /* renamed from: io.reactivex.rxjava3.internal.operators.flowable.t0$a */
    public static final class a<T, S> extends AtomicLong implements InterfaceC41776i<T>, org.reactivestreams.e {
        private static final long serialVersionUID = 7565982551505011832L;

        /* renamed from: b, reason: collision with root package name */
        public S f402978b;

        /* renamed from: c, reason: collision with root package name */
        public volatile boolean f402979c;

        /* renamed from: d, reason: collision with root package name */
        public boolean f402980d;

        /* renamed from: e, reason: collision with root package name */
        public boolean f402981e;

        public a() {
            throw null;
        }

        public final void b(S s5) {
            try {
                throw null;
            } catch (Throwable th2) {
                io.reactivex.rxjava3.exceptions.a.a(th2);
                C47998a.b(th2);
            }
        }

        @Override // org.reactivestreams.e
        public final void cancel() {
            if (this.f402979c) {
                return;
            }
            this.f402979c = true;
            if (io.reactivex.rxjava3.internal.util.c.a(this, 1L) == 0) {
                S s5 = this.f402978b;
                this.f402978b = null;
                b(s5);
            }
        }

        @Override // io.reactivex.rxjava3.core.InterfaceC41776i
        public final void e() {
            if (this.f402980d) {
                return;
            }
            this.f402980d = true;
            throw null;
        }

        @Override // io.reactivex.rxjava3.core.InterfaceC41776i
        public final void onError(Throwable th2) {
            if (this.f402980d) {
                C47998a.b(th2);
            } else {
                this.f402980d = true;
                throw null;
            }
        }

        @Override // io.reactivex.rxjava3.core.InterfaceC41776i
        public final void onNext(T t12) {
            if (this.f402980d) {
                return;
            }
            if (this.f402981e) {
                onError(new IllegalStateException("onNext already called in this generate turn"));
            } else if (t12 == null) {
                onError(io.reactivex.rxjava3.internal.util.h.b("onNext called with a null value."));
            } else {
                this.f402981e = true;
                throw null;
            }
        }

        @Override // org.reactivestreams.e
        public final void request(long j12) {
            if (SubscriptionHelper.h(j12) && io.reactivex.rxjava3.internal.util.c.a(this, j12) == 0) {
                S s5 = this.f402978b;
                while (0 == j12) {
                    j12 = get();
                    if (0 == j12) {
                        this.f402978b = s5;
                        j12 = addAndGet(-0L);
                        if (j12 == 0) {
                            return;
                        }
                    }
                }
                if (this.f402979c) {
                    this.f402978b = null;
                    b(s5);
                    return;
                }
                this.f402981e = false;
                try {
                    throw null;
                } catch (Throwable th2) {
                    io.reactivex.rxjava3.exceptions.a.a(th2);
                    this.f402979c = true;
                    this.f402978b = null;
                    onError(th2);
                    b(s5);
                }
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
