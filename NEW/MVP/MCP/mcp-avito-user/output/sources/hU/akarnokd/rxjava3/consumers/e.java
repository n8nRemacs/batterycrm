package hu.akarnokd.rxjava3.consumers;

import io.reactivex.rxjava3.core.InterfaceC41782o;
import io.reactivex.rxjava3.exceptions.OnErrorNotImplementedException;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.atomic.AtomicReference;
import s41.C47998a;

/* compiled from: DisposableAutoReleaseSubscriber.java */
/* loaded from: classes8.dex */
final class e<T> extends AtomicReference<org.reactivestreams.e> implements InterfaceC41782o<T>, io.reactivex.rxjava3.disposables.d, io.reactivex.rxjava3.observers.g {
    private static final long serialVersionUID = 8924480688481408726L;

    @Override // org.reactivestreams.d
    public final void K(org.reactivestreams.e eVar) {
        if (SubscriptionHelper.f(this, eVar)) {
            eVar.request(Long.MAX_VALUE);
        }
    }

    @Override // io.reactivex.rxjava3.disposables.d
    public final void dispose() {
        SubscriptionHelper.a(this);
        throw null;
    }

    @Override // org.reactivestreams.d
    public final void e() {
        org.reactivestreams.e eVar = get();
        SubscriptionHelper subscriptionHelper = SubscriptionHelper.f404813b;
        if (eVar == subscriptionHelper) {
            throw null;
        }
        lazySet(subscriptionHelper);
        try {
            throw null;
        } catch (Throwable th2) {
            io.reactivex.rxjava3.exceptions.a.a(th2);
            C47998a.b(th2);
            throw null;
        }
    }

    @Override // io.reactivex.rxjava3.disposables.d
    /* renamed from: i */
    public final boolean getF318621e() {
        return SubscriptionHelper.f404813b == get();
    }

    @Override // org.reactivestreams.d
    public final void onError(Throwable th2) {
        org.reactivestreams.e eVar = get();
        SubscriptionHelper subscriptionHelper = SubscriptionHelper.f404813b;
        if (eVar != subscriptionHelper) {
            lazySet(subscriptionHelper);
            C47998a.b(new OnErrorNotImplementedException(th2));
        } else {
            C47998a.b(th2);
        }
        throw null;
    }

    @Override // org.reactivestreams.d
    public final void onNext(T t12) {
        if (get() == SubscriptionHelper.f404813b) {
            return;
        }
        try {
            throw null;
        } catch (Throwable th2) {
            io.reactivex.rxjava3.exceptions.a.a(th2);
            get().cancel();
            onError(th2);
            throw null;
        }
    }
}
