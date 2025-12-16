package io.reactivex.rxjava3.internal.subscribers;

import io.reactivex.rxjava3.core.InterfaceC41782o;
import io.reactivex.rxjava3.exceptions.CompositeException;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableInternalHelper;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.atomic.AtomicReference;
import l41.InterfaceC43543a;
import s41.C47998a;

/* compiled from: LambdaSubscriber.java */
/* loaded from: classes8.dex */
public final class n<T> extends AtomicReference<org.reactivestreams.e> implements InterfaceC41782o<T>, org.reactivestreams.e, io.reactivex.rxjava3.disposables.d, io.reactivex.rxjava3.observers.g {
    private static final long serialVersionUID = -7251123623727029452L;

    /* renamed from: b, reason: collision with root package name */
    public final l41.g<? super T> f404791b;

    /* renamed from: c, reason: collision with root package name */
    public final l41.g<? super Throwable> f404792c;

    /* renamed from: d, reason: collision with root package name */
    public final InterfaceC43543a f404793d;

    /* renamed from: e, reason: collision with root package name */
    public final FlowableInternalHelper.RequestMax f404794e;

    public n(l41.g gVar, l41.g gVar2, InterfaceC43543a interfaceC43543a) {
        FlowableInternalHelper.RequestMax requestMax = FlowableInternalHelper.RequestMax.f402334b;
        this.f404791b = gVar;
        this.f404792c = gVar2;
        this.f404793d = interfaceC43543a;
        this.f404794e = requestMax;
    }

    @Override // org.reactivestreams.d
    public final void K(org.reactivestreams.e eVar) {
        if (SubscriptionHelper.f(this, eVar)) {
            try {
                this.f404794e.accept(this);
            } catch (Throwable th2) {
                io.reactivex.rxjava3.exceptions.a.a(th2);
                eVar.cancel();
                onError(th2);
            }
        }
    }

    @Override // org.reactivestreams.e
    public final void cancel() {
        SubscriptionHelper.a(this);
    }

    @Override // io.reactivex.rxjava3.disposables.d
    public final void dispose() {
        SubscriptionHelper.a(this);
    }

    @Override // org.reactivestreams.d
    public final void e() {
        org.reactivestreams.e eVar = get();
        SubscriptionHelper subscriptionHelper = SubscriptionHelper.f404813b;
        if (eVar != subscriptionHelper) {
            lazySet(subscriptionHelper);
            try {
                this.f404793d.run();
            } catch (Throwable th2) {
                io.reactivex.rxjava3.exceptions.a.a(th2);
                C47998a.b(th2);
            }
        }
    }

    @Override // io.reactivex.rxjava3.disposables.d
    /* renamed from: i */
    public final boolean getF318621e() {
        return get() == SubscriptionHelper.f404813b;
    }

    @Override // org.reactivestreams.d
    public final void onError(Throwable th2) {
        org.reactivestreams.e eVar = get();
        SubscriptionHelper subscriptionHelper = SubscriptionHelper.f404813b;
        if (eVar == subscriptionHelper) {
            C47998a.b(th2);
            return;
        }
        lazySet(subscriptionHelper);
        try {
            this.f404792c.accept(th2);
        } catch (Throwable th3) {
            io.reactivex.rxjava3.exceptions.a.a(th3);
            C47998a.b(new CompositeException(th2, th3));
        }
    }

    @Override // org.reactivestreams.d
    public final void onNext(T t12) {
        if (getF318621e()) {
            return;
        }
        try {
            this.f404791b.accept(t12);
        } catch (Throwable th2) {
            io.reactivex.rxjava3.exceptions.a.a(th2);
            get().cancel();
            onError(th2);
        }
    }

    @Override // org.reactivestreams.e
    public final void request(long j12) {
        get().request(j12);
    }
}
