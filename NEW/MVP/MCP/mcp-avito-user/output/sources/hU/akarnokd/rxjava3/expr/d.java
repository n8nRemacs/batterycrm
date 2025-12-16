package hu.akarnokd.rxjava3.expr;

import io.reactivex.rxjava3.core.AbstractC41777j;
import io.reactivex.rxjava3.internal.subscriptions.EmptySubscription;

/* compiled from: FlowableSwitchCase.java */
/* loaded from: classes8.dex */
final class d<T, K> extends AbstractC41777j<T> {
    @Override // io.reactivex.rxjava3.core.AbstractC41777j
    public final void u(org.reactivestreams.d<? super T> dVar) {
        try {
            throw null;
        } catch (Throwable th2) {
            io.reactivex.rxjava3.exceptions.a.a(th2);
            EmptySubscription.b(th2, dVar);
        }
    }
}
