package hu.akarnokd.rxjava3.basetypes;

import io.reactivex.rxjava3.internal.subscriptions.EmptySubscription;

/* compiled from: SoloZipIterable.java */
/* loaded from: classes8.dex */
final class g2<T, R> extends AbstractC41073l1<R> implements l41.o<T, R> {
    @Override // hu.akarnokd.rxjava3.basetypes.AbstractC41073l1
    public final void a(org.reactivestreams.d<? super R> dVar) {
        try {
            throw null;
        } catch (Throwable th2) {
            io.reactivex.rxjava3.exceptions.a.a(th2);
            EmptySubscription.b(th2, dVar);
        }
    }

    @Override // l41.o
    public final R apply(T t12) {
        throw null;
    }
}
