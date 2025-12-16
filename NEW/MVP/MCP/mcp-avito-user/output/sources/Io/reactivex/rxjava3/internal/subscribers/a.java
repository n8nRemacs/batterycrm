package io.reactivex.rxjava3.internal.subscribers;

import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import q41.InterfaceC47198a;
import s41.C47998a;

/* compiled from: BasicFuseableConditionalSubscriber.java */
/* loaded from: classes8.dex */
public abstract class a<T, R> implements InterfaceC47198a<T>, q41.d<R> {

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC47198a<? super R> f404769b;

    /* renamed from: c, reason: collision with root package name */
    public org.reactivestreams.e f404770c;

    /* renamed from: d, reason: collision with root package name */
    public q41.d<T> f404771d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f404772e;

    /* renamed from: f, reason: collision with root package name */
    public int f404773f;

    public a(InterfaceC47198a<? super R> interfaceC47198a) {
        this.f404769b = interfaceC47198a;
    }

    @Override // org.reactivestreams.d
    public final void K(org.reactivestreams.e eVar) {
        if (SubscriptionHelper.i(this.f404770c, eVar)) {
            this.f404770c = eVar;
            if (eVar instanceof q41.d) {
                this.f404771d = (q41.d) eVar;
            }
            this.f404769b.K(this);
        }
    }

    public final void a(Throwable th2) {
        io.reactivex.rxjava3.exceptions.a.a(th2);
        this.f404770c.cancel();
        onError(th2);
    }

    public void cancel() {
        this.f404770c.cancel();
    }

    @Override // q41.g
    public final void clear() {
        this.f404771d.clear();
    }

    @Override // org.reactivestreams.d
    public void e() {
        if (this.f404772e) {
            return;
        }
        this.f404772e = true;
        this.f404769b.e();
    }

    @Override // q41.g
    public final boolean isEmpty() {
        return this.f404771d.isEmpty();
    }

    @Override // q41.g
    public final boolean offer(R r12) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    @Override // org.reactivestreams.d
    public void onError(Throwable th2) {
        if (this.f404772e) {
            C47998a.b(th2);
        } else {
            this.f404772e = true;
            this.f404769b.onError(th2);
        }
    }

    @Override // org.reactivestreams.d
    public void onNext(T t12) {
        P(t12);
    }

    public void request(long j12) {
        this.f404770c.request(j12);
    }

    public int v(int i12) {
        q41.d<T> dVar = this.f404771d;
        if (dVar == null || (i12 & 4) != 0) {
            return 0;
        }
        int iV2 = dVar.v(i12);
        if (iV2 == 0) {
            return iV2;
        }
        this.f404773f = iV2;
        return iV2;
    }
}
