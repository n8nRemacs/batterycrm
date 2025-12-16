package hu.akarnokd.rxjava3.basetypes;

import io.reactivex.rxjava3.internal.subscriptions.EmptySubscription;

/* compiled from: NonoDefer.java */
/* renamed from: hu.akarnokd.rxjava3.basetypes.u, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C41097u extends AbstractC41062i {
    @Override // hu.akarnokd.rxjava3.basetypes.AbstractC41062i
    public final void a(org.reactivestreams.d<? super Void> dVar) {
        try {
            throw null;
        } catch (Throwable th2) {
            io.reactivex.rxjava3.exceptions.a.a(th2);
            EmptySubscription.b(th2, dVar);
        }
    }
}
