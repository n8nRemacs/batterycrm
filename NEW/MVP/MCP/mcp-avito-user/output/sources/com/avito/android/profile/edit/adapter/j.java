package com.avito.android.profile.edit.adapter;

import com.avito.android.R;
import com.avito.android.profile.edit.refactoring.adapter.item.LocationItem;
import com.avito.android.profile.edit.refactoring.adapter.v;
import com.avito.android.remote.model.Location;
import kotlin.Metadata;

/* compiled from: LocationItemPresenter.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile/edit/adapter/j;", "Lcom/avito/android/profile/edit/adapter/h;", "_avito_profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class j implements h {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c f222039b;

    public j(@Y61.k com.jakewharton.rxrelay3.c cVar) {
        this.f222039b = cVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        v vVar = (v) eVar;
        LocationItem locationItem = (LocationItem) aVar;
        vVar.xq(R.string.city_in_items);
        Location location = locationItem.f222256c;
        vVar.m(location != null ? location.getName() : null);
        vVar.w3(locationItem.f222257d);
        vVar.a(new i(this, locationItem));
    }
}
