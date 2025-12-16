package com.avito.android.analytics.event;

import com.avito.android.analytics.provider.clickstream.ParametrizedClickStreamEvent;
import com.avito.android.remote.model.SearchParamsConverterKt;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;

/* compiled from: ClickSerpWidgetEvent.kt */
@androidx.compose.runtime.internal.P
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/analytics/event/y;", "Lcom/avito/android/analytics/provider/clickstream/a;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.analytics.event.y, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C28450y implements com.avito.android.analytics.provider.clickstream.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ParametrizedClickStreamEvent f90148b;

    public C28450y(@Y61.l String str, int i12) {
        LinkedHashMap linkedHashMapW = AK.c.w("from_page", "top_sellers_serp_widget");
        if (str != null) {
            linkedHashMapW.put("uid", str);
        }
        linkedHashMapW.put(SearchParamsConverterKt.SHOP_ID, Integer.valueOf(i12));
        kotlin.G0 g02 = kotlin.G0.f406611a;
        this.f90148b = new ParametrizedClickStreamEvent(6345, 1, linkedHashMapW, null, 8, null);
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId */
    public final int getF224266b() {
        return this.f90148b.f90247b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @Y61.k
    public final Map<String, Object> getParams() {
        return this.f90148b.f90249d;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion */
    public final int getF224267c() {
        return this.f90148b.f90248c;
    }
}
