package com.avito.android.profile.edit.refactoring.adapter;

import com.avito.android.profile.edit.refactoring.adapter.item.PhoneInputItem;
import kotlin.Metadata;

/* compiled from: PhoneInputItemPresenter.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile/edit/refactoring/adapter/t;", "Lcom/avito/android/profile/edit/refactoring/adapter/p;", "_avito_profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class t implements p {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c f222282b;

    public t(@Y61.k com.jakewharton.rxrelay3.c cVar) {
        this.f222282b = cVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        f fVar = (f) eVar;
        PhoneInputItem phoneInputItem = (PhoneInputItem) aVar;
        io.reactivex.rxjava3.disposables.c cVar = new io.reactivex.rxjava3.disposables.c();
        fVar.d(new q(fVar, cVar));
        cVar.b(fVar.Vz(new r(phoneInputItem, this, fVar)));
        cVar.b(fVar.t1(new s(fVar, phoneInputItem)));
        fVar.m3(phoneInputItem.f222259c);
        fVar.g0(phoneInputItem.f222260d);
        fVar.w3(phoneInputItem.f222261e);
    }
}
