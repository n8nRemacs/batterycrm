package hu.akarnokd.rxjava3.basetypes;

import io.reactivex.rxjava3.internal.subscriptions.EmptySubscription;

/* compiled from: NonoFromAction.java */
/* loaded from: classes8.dex */
final class C extends AbstractC41062i implements l41.s<Void> {
    @Override // hu.akarnokd.rxjava3.basetypes.AbstractC41062i
    public final void a(org.reactivestreams.d<? super Void> dVar) {
        dVar.K(EmptySubscription.f404811b);
        try {
            throw null;
        } catch (Throwable th2) {
            io.reactivex.rxjava3.exceptions.a.a(th2);
            dVar.onError(th2);
        }
    }

    @Override // l41.s
    public final Void get() {
        throw null;
    }
}
