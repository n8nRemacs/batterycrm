package io.reactivex.rxjava3.internal.subscribers;

import io.reactivex.rxjava3.core.InterfaceC41782o;
import io.reactivex.rxjava3.exceptions.CompositeException;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.atomic.AtomicReference;
import s41.C47998a;

/* compiled from: BoundedSubscriber.java */
/* loaded from: classes8.dex */
public final class g<T> extends AtomicReference<org.reactivestreams.e> implements InterfaceC41782o<T>, org.reactivestreams.e, io.reactivex.rxjava3.disposables.d, io.reactivex.rxjava3.observers.g {
    private static final long serialVersionUID = -7251123623727029452L;

    @Override // org.reactivestreams.d
    public final void K(org.reactivestreams.e eVar) {
        if (SubscriptionHelper.f(this, eVar)) {
            try {
                throw null;
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
        if (eVar == subscriptionHelper) {
            return;
        }
        lazySet(subscriptionHelper);
        try {
            throw null;
        } catch (Throwable th2) {
            io.reactivex.rxjava3.exceptions.a.a(th2);
            C47998a.b(th2);
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
            throw null;
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
            throw null;
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
