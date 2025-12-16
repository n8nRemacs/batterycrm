package io.reactivex.rxjava3.internal.subscribers;

import io.reactivex.rxjava3.core.InterfaceC41782o;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;

/* compiled from: DeferredScalarSubscriber.java */
/* loaded from: classes8.dex */
public abstract class h<T, R> extends o41.f<R> implements InterfaceC41782o<T> {
    private static final long serialVersionUID = 2984505488220891551L;

    /* renamed from: d, reason: collision with root package name */
    public org.reactivestreams.e f404782d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f404783e;

    public h() {
        throw null;
    }

    public void K(org.reactivestreams.e eVar) {
        if (SubscriptionHelper.i(this.f404782d, eVar)) {
            this.f404782d = eVar;
            this.f419376b.K(this);
            eVar.request(Long.MAX_VALUE);
        }
    }

    @Override // o41.f, org.reactivestreams.e
    public void cancel() {
        super.cancel();
        this.f404782d.cancel();
    }

    public void e() {
        if (this.f404783e) {
            l(this.f419377c);
        } else {
            this.f419376b.e();
        }
    }

    public void onError(Throwable th2) {
        this.f419377c = null;
        this.f419376b.onError(th2);
    }
}
