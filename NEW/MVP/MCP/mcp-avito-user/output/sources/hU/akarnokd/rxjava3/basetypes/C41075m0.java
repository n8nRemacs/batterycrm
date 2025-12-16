package hu.akarnokd.rxjava3.basetypes;

import hu.akarnokd.rxjava3.basetypes.C41076m1;

/* compiled from: PerhapsAmbIterable.java */
/* renamed from: hu.akarnokd.rxjava3.basetypes.m0, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C41075m0<T> extends AbstractC41069k0<T> {
    @Override // hu.akarnokd.rxjava3.basetypes.AbstractC41069k0
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
