package com.avito.android.mortgage.landing.mvi.builder;

import Y61.k;
import Y61.l;
import com.avito.android.mortgage.api.model.OffersResult;
import com.avito.android.mortgage.landing.list.items.LandingItem;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;

/* compiled from: LandingDataBuilder.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mortgage/landing/mvi/builder/b;", "", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface b {
    @k
    Map a(@k String str, @k String str2, @k Map map);

    @k
    Map<String, LandingItem> b(@k Map<String, ? extends LandingItem> map, @k String str, float f12);

    @k
    Map c(int i12, @k String str, @k Map map);

    @k
    Map<String, LandingItem> d(@k Map<String, ? extends LandingItem> map, boolean z12);

    @k
    Map e(@k String str, @k Map map);

    @k
    Map f(@k Map map);

    @k
    LinkedHashMap g(@k Map map);

    @k
    LinkedHashMap h(@k Map map, @l OffersResult offersResult);

    @k
    LinkedHashMap i(@k Map map, @k MZ.g gVar);

    @k
    Map j(@k String str, @k Map map, boolean z12);

    @k
    Map k(@k String str, @k Map map);
}
