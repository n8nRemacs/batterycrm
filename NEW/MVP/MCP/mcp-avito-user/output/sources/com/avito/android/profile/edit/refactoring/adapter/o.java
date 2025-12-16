package com.avito.android.profile.edit.refactoring.adapter;

import com.avito.android.profile.edit.refactoring.adapter.item.InputItem;
import kotlin.Metadata;

/* compiled from: InputItemPresenter.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile/edit/refactoring/adapter/o;", "Lcom/avito/android/profile/edit/refactoring/adapter/l;", "_avito_profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class o implements l {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c f222274b;

    public o(@Y61.k com.jakewharton.rxrelay3.c cVar) {
        this.f222274b = cVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        h hVar = (h) eVar;
        InputItem inputItem = (InputItem) aVar;
        hVar.CA(new m(inputItem, this, hVar));
        hVar.t1(new n(hVar, inputItem));
        hVar.m3(inputItem.f222252c);
        hVar.g0(inputItem.f222253d);
        hVar.w3(inputItem.f222254e);
    }
}
