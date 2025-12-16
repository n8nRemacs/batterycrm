package com.avito.android.serp.adapter.developments_catalog.filters.tabs_with_image;

import Y61.k;
import androidx.compose.runtime.internal.P;
import kotlin.Metadata;
import rn0.InterfaceC47690b;

/* compiled from: FiltersTabsPresenter.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/serp/adapter/developments_catalog/filters/tabs_with_image/f;", "Lcom/avito/android/serp/adapter/developments_catalog/filters/tabs_with_image/d;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class f implements d {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final h31.e<InterfaceC47690b> f269888b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final com.avito.android.serp.analytics.widgets_tracker.g f269889c;

    public f(@k com.avito.android.serp.analytics.widgets_tracker.g gVar, @k h31.e eVar) {
        this.f269888b = eVar;
        this.f269889c = gVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        FiltersTabsItem filtersTabsItem = (FiltersTabsItem) aVar;
        ((g) eVar).K2(new e(this, i12, filtersTabsItem), filtersTabsItem.f269872d);
    }
}
