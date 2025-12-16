package io.reactivex.rxjava3.processors;

import io.reactivex.rxjava3.core.InterfaceC41782o;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import j41.InterfaceC42194a;
import java.util.concurrent.atomic.AtomicLong;
import s41.C47998a;

/* compiled from: MulticastProcessor.java */
@InterfaceC42194a
@j41.g
/* loaded from: classes8.dex */
public final class d<T> extends c<T> {

    /* renamed from: c, reason: collision with root package name */
    public volatile q41.g<T> f404911c;

    /* compiled from: MulticastProcessor.java */
    public static final class a<T> extends AtomicLong implements org.reactivestreams.e {
        private static final long serialVersionUID = -363282618957264509L;

        /* renamed from: b, reason: collision with root package name */
        public final InterfaceC41782o f404912b;

        /* renamed from: c, reason: collision with root package name */
        public final d<T> f404913c;

        public a(InterfaceC41782o interfaceC41782o, d dVar) {
            this.f404912b = interfaceC41782o;
            this.f404913c = dVar;
        }

        @Override // org.reactivestreams.e
        public final void cancel() {
            if (getAndSet(Long.MIN_VALUE) == Long.MIN_VALUE) {
                return;
            }
            this.f404913c.getClass();
            throw null;
        }

        @Override // org.reactivestreams.e
        public final void request(long j12) {
            if (SubscriptionHelper.h(j12)) {
                long jB2 = io.reactivex.rxjava3.internal.util.c.b(this, j12);
                if (jB2 == Long.MIN_VALUE || jB2 == Long.MAX_VALUE) {
                    return;
                }
                this.f404913c.getClass();
                throw null;
            }
        }
    }

    @Override // org.reactivestreams.d
    public final void K(@j41.e org.reactivestreams.e eVar) {
        if (SubscriptionHelper.f(null, eVar)) {
            if (eVar instanceof q41.d) {
                q41.d dVar = (q41.d) eVar;
                int iV2 = dVar.v(3);
                if (iV2 == 1) {
                    this.f404911c = dVar;
                    throw null;
                }
                if (iV2 == 2) {
                    this.f404911c = dVar;
                    eVar.request(0);
                    return;
                }
            }
            new q41.h(0);
            eVar.request(0);
        }
    }

    @Override // org.reactivestreams.d
    public final void e() {
        throw null;
    }

    @Override // org.reactivestreams.d
    public final void onError(@j41.e Throwable th2) {
        io.reactivex.rxjava3.internal.util.h.c(th2, "onError called with a null Throwable.");
        C47998a.b(th2);
    }

    @Override // io.reactivex.rxjava3.core.AbstractC41777j
    public final void u(@j41.e org.reactivestreams.d<? super T> dVar) {
        dVar.K(new a((InterfaceC41782o) dVar, this));
        throw null;
    }

    @Override // org.reactivestreams.d
    public final void onNext(@j41.e T t12) {
    }
}
