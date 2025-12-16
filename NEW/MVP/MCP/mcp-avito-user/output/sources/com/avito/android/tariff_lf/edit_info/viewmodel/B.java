package com.avito.android.tariff_lf.edit_info.viewmodel;

import com.avito.android.util.P2;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;

/* compiled from: EditInfoViewModel.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "accept", "(Z)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes4.dex */
final class B<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r f299078b;

    public B(r rVar) {
        this.f299078b = rVar;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [io.reactivex.rxjava3.disposables.d, java.util.concurrent.atomic.AtomicReference] */
    @Override // l41.g
    public final void accept(Object obj) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        r rVar = this.f299078b;
        rVar.f299123P.dispose();
        ArrayList arrayListLe = r.le(rVar.f299121N, zBooleanValue, false);
        rVar.f299126S.postValue(arrayListLe);
        rVar.f299121N = arrayListLe;
        rVar.f299123P = (AtomicReference) rVar.f299117J.c(zBooleanValue).r0(P2.c.f318721a).j0(rVar.f299119L.e()).v0(new D(rVar, zBooleanValue), new E(rVar), io.reactivex.rxjava3.internal.functions.a.f401993c);
    }
}
