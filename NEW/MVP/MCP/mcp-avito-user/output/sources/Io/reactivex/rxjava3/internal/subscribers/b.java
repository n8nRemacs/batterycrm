package io.reactivex.rxjava3.internal.subscribers;

import io.reactivex.rxjava3.core.InterfaceC41782o;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import s41.C47998a;

/* compiled from: BasicFuseableSubscriber.java */
/* loaded from: classes8.dex */
public abstract class b<T, R> implements InterfaceC41782o<T>, q41.d<R> {

    /* renamed from: b, reason: collision with root package name */
    public final org.reactivestreams.d<? super R> f404774b;

    /* renamed from: c, reason: collision with root package name */
    public org.reactivestreams.e f404775c;

    /* renamed from: d, reason: collision with root package name */
    public q41.d<T> f404776d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f404777e;

    /* renamed from: f, reason: collision with root package name */
    public int f404778f;

    public b(org.reactivestreams.d<? super R> dVar) {
        this.f404774b = dVar;
    }

    @Override // org.reactivestreams.d
    public final void K(org.reactivestreams.e eVar) {
        if (SubscriptionHelper.i(this.f404775c, eVar)) {
            this.f404775c = eVar;
            if (eVar instanceof q41.d) {
                this.f404776d = (q41.d) eVar;
            }
            this.f404774b.K(this);
        }
    }

    public final void a(Throwable th2) {
        io.reactivex.rxjava3.exceptions.a.a(th2);
        this.f404775c.cancel();
        onError(th2);
    }

    public void cancel() {
        this.f404775c.cancel();
    }

    public void clear() {
        this.f404776d.clear();
    }

    @Override // org.reactivestreams.d
    public void e() {
        if (this.f404777e) {
            return;
        }
        this.f404777e = true;
        this.f404774b.e();
    }

    @Override // q41.g
    public final boolean isEmpty() {
        return this.f404776d.isEmpty();
    }

    @Override // q41.g
    public final boolean offer(R r12) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    @Override // org.reactivestreams.d
    public void onError(Throwable th2) {
        if (this.f404777e) {
            C47998a.b(th2);
        } else {
            this.f404777e = true;
            this.f404774b.onError(th2);
        }
    }

    public void request(long j12) {
        this.f404775c.request(j12);
    }

    public int v(int i12) {
        q41.d<T> dVar = this.f404776d;
        if (dVar == null || (i12 & 4) != 0) {
            return 0;
        }
        int iV2 = dVar.v(i12);
        if (iV2 == 0) {
            return iV2;
        }
        this.f404778f = iV2;
        return iV2;
    }
}
