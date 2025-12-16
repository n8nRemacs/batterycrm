package hu.akarnokd.rxjava3.basetypes;

import io.reactivex.rxjava3.internal.subscriptions.EmptySubscription;

/* compiled from: PerhapsZipIterable.java */
/* renamed from: hu.akarnokd.rxjava3.basetypes.k1, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C41070k1<T, R> extends AbstractC41069k0<R> {
    @Override // hu.akarnokd.rxjava3.basetypes.AbstractC41069k0
    public final void a(org.reactivestreams.d<? super R> dVar) {
        try {
            throw null;
        } catch (Throwable th2) {
            io.reactivex.rxjava3.exceptions.a.a(th2);
            EmptySubscription.b(th2, dVar);
        }
    }
}
