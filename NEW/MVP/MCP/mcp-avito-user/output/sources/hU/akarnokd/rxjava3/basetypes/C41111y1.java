package hu.akarnokd.rxjava3.basetypes;

import io.reactivex.rxjava3.internal.subscriptions.EmptySubscription;

/* compiled from: SoloErrorSupplier.java */
/* renamed from: hu.akarnokd.rxjava3.basetypes.y1, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C41111y1<T> extends AbstractC41073l1<T> implements l41.s<T> {
    @Override // hu.akarnokd.rxjava3.basetypes.AbstractC41073l1
    public final void a(org.reactivestreams.d<? super T> dVar) {
        try {
            throw null;
        } catch (Throwable th2) {
            io.reactivex.rxjava3.exceptions.a.a(th2);
            EmptySubscription.b(th2, dVar);
        }
    }

    @Override // l41.s
    public final T get() {
        throw null;
    }
}
