package hu.akarnokd.rxjava3.basetypes;

import hu.akarnokd.rxjava3.basetypes.C41068k;

/* compiled from: NonoAmbArray.java */
/* renamed from: hu.akarnokd.rxjava3.basetypes.j, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C41065j extends AbstractC41062i {
    @Override // hu.akarnokd.rxjava3.basetypes.AbstractC41062i
    public final void a(org.reactivestreams.d<? super Void> dVar) {
        C41068k.a aVar = new C41068k.a(dVar);
        dVar.K(aVar);
        try {
            throw null;
        } catch (Throwable th2) {
            io.reactivex.rxjava3.exceptions.a.a(th2);
            aVar.onError(th2);
        }
    }
}
