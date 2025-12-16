package com.avito.android.advertising.analytics.events;

import Y61.k;
import Y61.l;
import com.avito.android.advertising.analytics.events.BannerEvent;
import com.avito.android.advertising.loaders.BannerInfo;
import java.util.LinkedHashMap;
import kotlin.Metadata;

/* compiled from: HideAdEvent.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advertising/analytics/events/i;", "Lcom/avito/android/advertising/analytics/events/BannerEvent;", "_avito_advertising_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class i extends BannerEvent {

    /* renamed from: l, reason: collision with root package name */
    @k
    public final BannerInfo f87806l;

    /* renamed from: m, reason: collision with root package name */
    @l
    public final Integer f87807m;

    /* renamed from: n, reason: collision with root package name */
    @l
    public final String f87808n;

    public i(@k BannerInfo bannerInfo, @k BannerPageSource bannerPageSource, long j12, @l Integer num, @l String str) {
        super(bannerInfo, bannerPageSource, null, null, BannerEvent.Type.f87773b, j12, 7719, 5);
        this.f87806l = bannerInfo;
        this.f87807m = num;
        this.f87808n = str;
    }

    @Override // com.avito.android.advertising.analytics.events.BannerEvent
    public final void i(@k LinkedHashMap linkedHashMap) {
        BannerInfo bannerInfo = this.f87806l;
        k(linkedHashMap, "creative_id", bannerInfo.f87894y);
        k(linkedHashMap, "puid", bannerInfo.f87882m);
        k(linkedHashMap, "hide_reason_id", this.f87807m);
        k(linkedHashMap, "hide_reason_description", this.f87808n);
        j(linkedHashMap, bannerInfo.f());
    }
}
