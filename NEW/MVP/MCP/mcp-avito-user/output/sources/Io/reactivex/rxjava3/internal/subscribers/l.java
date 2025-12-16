package io.reactivex.rxjava3.internal.subscribers;

import io.reactivex.rxjava3.core.InterfaceC41782o;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: InnerQueuedSubscriber.java */
/* loaded from: classes8.dex */
public final class l<T> extends AtomicReference<org.reactivestreams.e> implements InterfaceC41782o<T>, org.reactivestreams.e {
    private static final long serialVersionUID = 22876611072430776L;

    /* renamed from: b, reason: collision with root package name */
    public volatile q41.g<T> f404787b;

    /* renamed from: c, reason: collision with root package name */
    public volatile boolean f404788c;

    /* renamed from: d, reason: collision with root package name */
    public long f404789d;

    /* renamed from: e, reason: collision with root package name */
    public int f404790e;

    @Override // org.reactivestreams.d
    public final void K(org.reactivestreams.e eVar) {
        if (SubscriptionHelper.f(this, eVar)) {
            if (eVar instanceof q41.d) {
                q41.d dVar = (q41.d) eVar;
                int iV2 = dVar.v(3);
                if (iV2 == 1) {
                    this.f404790e = iV2;
                    this.f404787b = dVar;
                    this.f404788c = true;
                    throw null;
                }
                if (iV2 == 2) {
                    this.f404790e = iV2;
                    this.f404787b = dVar;
                    eVar.request(0);
                    return;
                }
            }
            this.f404787b = new q41.h(0);
            eVar.request(0);
        }
    }

    @Override // org.reactivestreams.e
    public final void cancel() {
        SubscriptionHelper.a(this);
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
        if (this.f404790e != 0) {
            throw null;
        }
        throw null;
    }

    @Override // org.reactivestreams.e
    public final void request(long j12) {
        if (this.f404790e != 1) {
            long j13 = this.f404789d + j12;
            if (j13 < 0) {
                this.f404789d = j13;
            } else {
                this.f404789d = 0L;
                get().request(j13);
            }
        }
    }
}
