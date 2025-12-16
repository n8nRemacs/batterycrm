package com.avito.android.search.filter;

import android.app.Application;
import android.content.Intent;
import com.avito.android.bottom_navigation.NavigationTabSetItem;
import com.avito.android.remote.model.PresentationType;
import com.avito.android.remote.model.PresentationTypeKt;
import com.avito.android.remote.model.SearchParams;
import com.avito.android.remote.model.search.map.Area;
import com.avito.android.search.filter.FiltersActivity;
import com.avito.android.search.filter.FiltersMode;
import com.squareup.anvil.annotations.ContributesBinding;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: FiltersIntentFactoryImpl.kt */
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/search/filter/v;", "Lcom/avito/android/search/filter/u;", "_avito_search_filter_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.search.filter.v, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C34600v implements InterfaceC34598u {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Application f263806a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.L f263807b;

    @Inject
    public C34600v(@Y61.k Application application, @Y61.k com.avito.android.L l12) {
        this.f263806a = application;
        this.f263807b = l12;
    }

    @Override // com.avito.android.search.filter.InterfaceC34598u
    @Y61.k
    public final Intent a(@Y61.k SearchParams searchParams, @Y61.l Area area, @Y61.l String str, boolean z12, @Y61.k FilterAnalyticsData filterAnalyticsData, @Y61.l NavigationTabSetItem navigationTabSetItem, @Y61.l PresentationType presentationType, @Y61.l String str2, @Y61.l String str3) {
        return c(searchParams, area, str, z12, filterAnalyticsData, navigationTabSetItem, presentationType, str2, FiltersMode.Default.f261858b, str3);
    }

    @Override // com.avito.android.search.filter.InterfaceC34598u
    @Y61.k
    public final Intent b(@Y61.k SearchParams searchParams, @Y61.l Area area, @Y61.l String str, boolean z12, @Y61.k FilterAnalyticsData filterAnalyticsData, @Y61.l NavigationTabSetItem navigationTabSetItem, @Y61.l PresentationType presentationType, @Y61.l String str2, @Y61.l String str3) {
        return c(searchParams, area, str, z12, filterAnalyticsData, navigationTabSetItem, presentationType, str2, new FiltersMode.ExtendedProfile(str3), null);
    }

    public final Intent c(SearchParams searchParams, Area area, String str, boolean z12, FilterAnalyticsData filterAnalyticsData, NavigationTabSetItem navigationTabSetItem, PresentationType presentationType, String str2, FiltersMode filtersMode, String str3) {
        if (navigationTabSetItem != null) {
            return this.f263807b.d(new FiltersFragmentData(new FiltersArguments(searchParams, area, str, z12, filterAnalyticsData, presentationType, str2, filtersMode, str3), navigationTabSetItem));
        }
        new FiltersActivity.a();
        Intent intentPutExtra = new Intent(this.f263806a, (Class<?>) FiltersActivity.class).putExtra("search_params", searchParams).putExtra("is_only_sort_shown", z12).putExtra("scroll_to_parameter_with_id", str2).putExtra(PresentationTypeKt.PRESENTATION_TYPE, presentationType).putExtra("mode", filtersMode).putExtra("search_context", str3);
        if (area != null) {
            intentPutExtra = intentPutExtra.putExtra("search_area", area);
        }
        if (str != null) {
            intentPutExtra = intentPutExtra.putExtra("map_search_state", str);
        }
        return filterAnalyticsData != null ? intentPutExtra.putExtra("filtersAnalyticsData", filterAnalyticsData) : intentPutExtra;
    }
}
