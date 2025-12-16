package hu.akarnokd.rxjava3.basetypes;

import io.reactivex.rxjava3.internal.subscriptions.EmptySubscription;

/* compiled from: SoloError.java */
/* renamed from: hu.akarnokd.rxjava3.basetypes.x1, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C41108x1<T> extends AbstractC41073l1<T> implements l41.s<T> {
    @Override // hu.akarnokd.rxjava3.basetypes.AbstractC41073l1
    public final void a(org.reactivestreams.d<? super T> dVar) {
        EmptySubscription.b(null, dVar);
    }

    @Override // l41.s
    public final T get() {
        throw null;
    }
}
