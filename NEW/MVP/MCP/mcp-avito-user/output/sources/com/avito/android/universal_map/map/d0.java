package com.avito.android.universal_map.map;

import com.avito.android.map_core.beduin.BeduinSetMapFiltersAction;
import com.avito.android.universal_map.map.pin_filters.j;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.P0;

/* compiled from: UniversalPointsViewModel.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/map_core/beduin/BeduinSetMapFiltersAction;", "action", "Lkotlin/G0;", "accept", "(Lcom/avito/android/map_core/beduin/BeduinSetMapFiltersAction;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes4.dex */
final class d0<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g0 f305015b;

    public d0(g0 g0Var) {
        this.f305015b = g0Var;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        BeduinSetMapFiltersAction beduinSetMapFiltersAction = (BeduinSetMapFiltersAction) obj;
        com.avito.android.util.architecture_components.D<j.b> d12 = this.f305015b.f305196Y;
        Map<String, Object> filters = beduinSetMapFiltersAction.getFilters();
        if (filters == null) {
            filters = P0.c();
        }
        boolean z12 = !filters.isEmpty();
        Map<String, Object> filters2 = beduinSetMapFiltersAction.getFilters();
        if (filters2 == null) {
            filters2 = P0.c();
        }
        d12.postValue(new j.b(z12, filters2));
    }
}
