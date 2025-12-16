package hu.akarnokd.rxjava3.basetypes;

import hu.akarnokd.rxjava3.basetypes.C41076m1;

/* compiled from: SoloAmbIterable.java */
/* renamed from: hu.akarnokd.rxjava3.basetypes.n1, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C41079n1<T> extends AbstractC41073l1<T> {
    @Override // hu.akarnokd.rxjava3.basetypes.AbstractC41073l1
    public final void a(org.reactivestreams.d<? super T> dVar) {
        C41076m1.a aVar = new C41076m1.a(dVar);
        dVar.K(aVar);
        try {
            throw null;
        } catch (Throwable th2) {
            io.reactivex.rxjava3.exceptions.a.a(th2);
            aVar.onError(th2);
        }
    }
}
