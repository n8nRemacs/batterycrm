package hu.akarnokd.rxjava3.basetypes;

import io.reactivex.rxjava3.internal.subscriptions.EmptySubscription;

/* compiled from: PerhapsDefer.java */
/* renamed from: hu.akarnokd.rxjava3.basetypes.r0, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C41089r0<T> extends AbstractC41069k0<T> {
    @Override // hu.akarnokd.rxjava3.basetypes.AbstractC41069k0
    public final void a(org.reactivestreams.d<? super T> dVar) {
        try {
            throw null;
        } catch (Throwable th2) {
            io.reactivex.rxjava3.exceptions.a.a(th2);
            EmptySubscription.b(th2, dVar);
        }
    }
}
