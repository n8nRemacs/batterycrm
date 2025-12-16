package com.avito.android.profile.edit.refactoring.adapter;

import com.avito.android.profile.edit.refactoring.adapter.item.SubLocationItem;
import com.avito.android.remote.model.NameIdEntity;
import kotlin.Metadata;

/* compiled from: SubLocationItemPresenter.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile/edit/refactoring/adapter/y;", "Lcom/avito/android/profile/edit/refactoring/adapter/w;", "_avito_profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class y implements w {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c f222286b;

    public y(@Y61.k com.jakewharton.rxrelay3.c cVar) {
        this.f222286b = cVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        v vVar = (v) eVar;
        SubLocationItem subLocationItem = (SubLocationItem) aVar;
        vVar.m3(subLocationItem.f222263c);
        NameIdEntity nameIdEntity = subLocationItem.f222265e;
        vVar.m(nameIdEntity != null ? nameIdEntity.getName() : null);
        vVar.w3(subLocationItem.f222266f);
        vVar.a(new x(this, subLocationItem));
    }
}
