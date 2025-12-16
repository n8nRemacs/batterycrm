package com.avito.android.advertising.analytics.events;

import Y61.k;
import java.util.LinkedHashMap;
import kotlin.Metadata;

/* compiled from: BannerRequestEvent.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advertising/analytics/events/g;", "Lcom/avito/android/advertising/analytics/events/BannerEvent;", "_avito_advertising_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class g extends BannerEvent {
    @Override // com.avito.android.advertising.analytics.events.BannerEvent
    public final void i(@k LinkedHashMap linkedHashMap) {
        k(linkedHashMap, "req_num", Integer.valueOf(this.f87772k));
    }
}
