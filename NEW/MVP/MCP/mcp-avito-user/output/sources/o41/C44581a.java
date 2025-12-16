package o41;

import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* compiled from: ArrayCompositeSubscription.java */
/* renamed from: o41.a, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44581a extends AtomicReferenceArray<org.reactivestreams.e> implements io.reactivex.rxjava3.disposables.d {
    private static final long serialVersionUID = 2746389416410565408L;

    @Override // io.reactivex.rxjava3.disposables.d
    public final void dispose() {
        org.reactivestreams.e andSet;
        org.reactivestreams.e eVar = get(0);
        SubscriptionHelper subscriptionHelper = SubscriptionHelper.f404813b;
        if (eVar != subscriptionHelper) {
            int length = length();
            for (int i12 = 0; i12 < length; i12++) {
                if (get(i12) != subscriptionHelper && (andSet = getAndSet(i12, subscriptionHelper)) != subscriptionHelper && andSet != null) {
                    andSet.cancel();
                }
            }
        }
    }

    @Override // io.reactivex.rxjava3.disposables.d
    public final boolean i() {
        return get(0) == SubscriptionHelper.f404813b;
    }
}
