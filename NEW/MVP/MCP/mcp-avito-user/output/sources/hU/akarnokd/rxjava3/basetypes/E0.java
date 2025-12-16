package hu.akarnokd.rxjava3.basetypes;

import io.reactivex.rxjava3.internal.subscriptions.EmptySubscription;

/* compiled from: PerhapsFromAction.java */
/* loaded from: classes8.dex */
final class E0<T> extends AbstractC41069k0<T> implements l41.s<T> {
    @Override // hu.akarnokd.rxjava3.basetypes.AbstractC41069k0
    public final void a(org.reactivestreams.d<? super T> dVar) {
        dVar.K(EmptySubscription.f404811b);
        try {
            throw null;
        } catch (Throwable th2) {
            io.reactivex.rxjava3.exceptions.a.a(th2);
            dVar.onError(th2);
        }
    }

    @Override // l41.s
    public final T get() {
        throw null;
    }
}
