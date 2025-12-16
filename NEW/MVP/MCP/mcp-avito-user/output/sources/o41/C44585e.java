package o41;

import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: BooleanSubscription.java */
/* renamed from: o41.e, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44585e extends AtomicBoolean implements org.reactivestreams.e {
    private static final long serialVersionUID = -8127758972444290902L;

    @Override // org.reactivestreams.e
    public final void cancel() {
        lazySet(true);
    }

    @Override // org.reactivestreams.e
    public final void request(long j12) {
        SubscriptionHelper.h(j12);
    }

    @Override // java.util.concurrent.atomic.AtomicBoolean
    public final String toString() {
        return "BooleanSubscription(cancelled=" + get() + ")";
    }
}
