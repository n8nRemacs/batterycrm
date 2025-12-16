package com.avito.android.analytics.event;

import com.avito.android.remote.model.text.TooltipAttribute;
import com.avito.android.shortcut_navigation_bar.analytics.InlineFiltersGeo;
import com.avito.android.util.C35755b0;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: GeoTitleClickEvent.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/analytics/event/L;", "Lcom/avito/android/analytics/provider/clickstream/a;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class L implements com.avito.android.analytics.provider.clickstream.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.analytics.provider.clickstream.b f89957b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final LinkedHashMap f89958c;

    public L(String str, String str2, InlineFiltersGeo.FromPage fromPage, int i12, C42822w c42822w) {
        str2 = (i12 & 2) != 0 ? null : str2;
        fromPage = (i12 & 4) != 0 ? null : fromPage;
        this.f89957b = new com.avito.android.analytics.provider.clickstream.b(6555, 1);
        this.f89958c = C35755b0.c(kotlin.collections.P0.j(new kotlin.Q("cid", str), new kotlin.Q("mcid", str2), new kotlin.Q("from_page", fromPage != null ? TooltipAttribute.ATTRIBUTE_TYPE : null)));
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId */
    public final int getF224266b() {
        return this.f89957b.f90262b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @Y61.k
    public final Map<String, Object> getParams() {
        return this.f89958c;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion */
    public final int getF224267c() {
        return this.f89957b.f90263c;
    }
}
