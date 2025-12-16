package com.avito.android.serp.adapter.filters_tabs_chips;

import Y61.k;
import androidx.compose.runtime.internal.P;
import javax.inject.Inject;
import kotlin.Metadata;
import rn0.InterfaceC47690b;

/* compiled from: FiltersTabsChipsPresenter.kt */
@P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/serp/adapter/filters_tabs_chips/d;", "LTV0/d;", "Lcom/avito/android/serp/adapter/filters_tabs_chips/f;", "Lcom/avito/android/serp/adapter/filters_tabs_chips/FiltersTabsChipsItem;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class d implements TV0.d<f, FiltersTabsChipsItem> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final h31.e<InterfaceC47690b> f269966b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final com.avito.android.serp.analytics.widgets_tracker.g f269967c;

    @Inject
    public d(@k com.avito.android.serp.analytics.widgets_tracker.g gVar, @k h31.e eVar) {
        this.f269966b = eVar;
        this.f269967c = gVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        FiltersTabsChipsItem filtersTabsChipsItem = (FiltersTabsChipsItem) aVar;
        ((f) eVar).K2(new c(this, i12, filtersTabsChipsItem), filtersTabsChipsItem.f269952d);
    }
}
