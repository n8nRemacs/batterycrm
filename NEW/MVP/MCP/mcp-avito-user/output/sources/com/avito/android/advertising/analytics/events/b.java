package com.avito.android.advertising.analytics.events;

import Y61.k;
import Y61.l;
import com.avito.android.advertising.analytics.events.BannerEvent;
import com.avito.android.advertising.loaders.BannerInfo;
import java.util.LinkedHashMap;
import kotlin.Metadata;

/* compiled from: BannerLoadingFailedEvent.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advertising/analytics/events/b;", "Lcom/avito/android/advertising/analytics/events/BannerEvent;", "_avito_advertising_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class b extends BannerEvent {

    /* renamed from: l, reason: collision with root package name */
    public final boolean f87789l;

    /* renamed from: m, reason: collision with root package name */
    @l
    public final String f87790m;

    /* renamed from: n, reason: collision with root package name */
    @l
    public final Integer f87791n;

    public b(@k BannerInfo bannerInfo, boolean z12, @k BannerPageSource bannerPageSource, @l String str, @l Integer num, @k BannerEvent.Type type, @l String str2, @l Integer num2, long j12) {
        super(bannerInfo, bannerPageSource, str, num, type, j12, 3250, 21);
        this.f87789l = z12;
        this.f87790m = str2;
        this.f87791n = num2;
    }

    @Override // com.avito.android.advertising.analytics.events.BannerEvent
    public final void i(@k LinkedHashMap linkedHashMap) {
        k(linkedHashMap, "iid", this.f87790m);
        k(linkedHashMap, "err", this.f87791n);
        k(linkedHashMap, "req_num", Integer.valueOf(this.f87772k));
        k(linkedHashMap, "errors_detailed", this.f87789l ? "EmptyCreative" : "ErrorCreative");
    }
}
