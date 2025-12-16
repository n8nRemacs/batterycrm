package io.reactivex.rxjava3.subscribers;

import io.reactivex.rxjava3.core.InterfaceC41782o;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import io.reactivex.rxjava3.internal.util.NotificationLite;
import io.reactivex.rxjava3.internal.util.h;
import s41.C47998a;

/* compiled from: SerializedSubscriber.java */
/* loaded from: classes8.dex */
public final class e<T> implements InterfaceC41782o<T>, org.reactivestreams.e {

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC41782o f405043b;

    /* renamed from: c, reason: collision with root package name */
    public org.reactivestreams.e f405044c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f405045d;

    /* renamed from: e, reason: collision with root package name */
    public io.reactivex.rxjava3.internal.util.a<Object> f405046e;

    /* renamed from: f, reason: collision with root package name */
    public volatile boolean f405047f;

    public e() {
        throw null;
    }

    public e(InterfaceC41782o interfaceC41782o) {
        this.f405043b = interfaceC41782o;
    }

    @Override // org.reactivestreams.d
    public final void K(@j41.e org.reactivestreams.e eVar) {
        if (SubscriptionHelper.i(this.f405044c, eVar)) {
            this.f405044c = eVar;
            this.f405043b.K(this);
        }
    }

    @Override // org.reactivestreams.e
    public final void cancel() {
        this.f405044c.cancel();
    }

    @Override // org.reactivestreams.d
    public final void e() {
        if (this.f405047f) {
            return;
        }
        synchronized (this) {
            try {
                if (this.f405047f) {
                    return;
                }
                if (!this.f405045d) {
                    this.f405047f = true;
                    this.f405045d = true;
                    this.f405043b.e();
                } else {
                    io.reactivex.rxjava3.internal.util.a<Object> aVar = this.f405046e;
                    if (aVar == null) {
                        aVar = new io.reactivex.rxjava3.internal.util.a<>();
                        this.f405046e = aVar;
                    }
                    aVar.b(NotificationLite.f404825b);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // org.reactivestreams.d
    public final void onError(Throwable th2) {
        if (this.f405047f) {
            C47998a.b(th2);
            return;
        }
        synchronized (this) {
            try {
                boolean z12 = true;
                if (!this.f405047f) {
                    if (this.f405045d) {
                        this.f405047f = true;
                        io.reactivex.rxjava3.internal.util.a<Object> aVar = this.f405046e;
                        if (aVar == null) {
                            aVar = new io.reactivex.rxjava3.internal.util.a<>();
                            this.f405046e = aVar;
                        }
                        aVar.f404830a[0] = NotificationLite.e(th2);
                        return;
                    }
                    this.f405047f = true;
                    this.f405045d = true;
                    z12 = false;
                }
                if (z12) {
                    C47998a.b(th2);
                } else {
                    this.f405043b.onError(th2);
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @Override // org.reactivestreams.d
    public final void onNext(@j41.e T t12) {
        io.reactivex.rxjava3.internal.util.a<Object> aVar;
        if (this.f405047f) {
            return;
        }
        if (t12 == null) {
            this.f405044c.cancel();
            onError(h.b("onNext called with a null value."));
            return;
        }
        synchronized (this) {
            try {
                if (this.f405047f) {
                    return;
                }
                if (this.f405045d) {
                    io.reactivex.rxjava3.internal.util.a<Object> aVar2 = this.f405046e;
                    if (aVar2 == null) {
                        aVar2 = new io.reactivex.rxjava3.internal.util.a<>();
                        this.f405046e = aVar2;
                    }
                    aVar2.b(t12);
                    return;
                }
                this.f405045d = true;
                this.f405043b.onNext(t12);
                do {
                    synchronized (this) {
                        try {
                            aVar = this.f405046e;
                            if (aVar == null) {
                                this.f405045d = false;
                                return;
                            }
                            this.f405046e = null;
                        } finally {
                        }
                    }
                } while (!aVar.a(this.f405043b));
            } finally {
            }
        }
    }

    @Override // org.reactivestreams.e
    public final void request(long j12) {
        this.f405044c.request(j12);
    }
}
