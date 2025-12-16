package com.avito.android.search.filter;

import android.content.Intent;
import com.avito.android.bottom_navigation.NavigationTabSetItem;
import com.avito.android.remote.model.PresentationType;
import com.avito.android.remote.model.SearchParams;
import com.avito.android.remote.model.search.map.Area;
import kotlin.Metadata;

/* compiled from: FiltersIntentFactory.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/search/filter/u;", "", "_avito_search_filter_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.search.filter.u, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public interface InterfaceC34598u {

    /* compiled from: FiltersIntentFactory.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.search.filter.u$a */
    public static final class a {
    }

    @Y61.k
    Intent a(@Y61.k SearchParams searchParams, @Y61.l Area area, @Y61.l String str, boolean z12, @Y61.k FilterAnalyticsData filterAnalyticsData, @Y61.l NavigationTabSetItem navigationTabSetItem, @Y61.l PresentationType presentationType, @Y61.l String str2, @Y61.l String str3);

    @Y61.k
    Intent b(@Y61.k SearchParams searchParams, @Y61.l Area area, @Y61.l String str, boolean z12, @Y61.k FilterAnalyticsData filterAnalyticsData, @Y61.l NavigationTabSetItem navigationTabSetItem, @Y61.l PresentationType presentationType, @Y61.l String str2, @Y61.l String str3);
}
