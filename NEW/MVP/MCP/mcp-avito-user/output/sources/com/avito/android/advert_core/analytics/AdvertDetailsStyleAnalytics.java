package com.avito.android.advert_core.analytics;

import kotlin.Metadata;
import kotlin.enums.c;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AdvertDetailsStyleAnalytics.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert_core/analytics/AdvertDetailsStyleAnalytics;", "", "_avito_advert-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class AdvertDetailsStyleAnalytics {

    /* renamed from: c, reason: collision with root package name */
    public static final AdvertDetailsStyleAnalytics f82773c;

    /* renamed from: d, reason: collision with root package name */
    public static final AdvertDetailsStyleAnalytics f82774d;

    /* renamed from: e, reason: collision with root package name */
    public static final AdvertDetailsStyleAnalytics f82775e;

    /* renamed from: f, reason: collision with root package name */
    public static final AdvertDetailsStyleAnalytics f82776f;

    /* renamed from: g, reason: collision with root package name */
    public static final AdvertDetailsStyleAnalytics f82777g;

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ AdvertDetailsStyleAnalytics[] f82778h;

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f82779i;

    /* renamed from: b, reason: collision with root package name */
    public final int f82780b;

    static {
        AdvertDetailsStyleAnalytics advertDetailsStyleAnalytics = new AdvertDetailsStyleAnalytics("AVITO_DEFAULT", 0, 0);
        f82773c = advertDetailsStyleAnalytics;
        AdvertDetailsStyleAnalytics advertDetailsStyleAnalytics2 = new AdvertDetailsStyleAnalytics("AVITO_BLACK", 1, 4);
        f82774d = advertDetailsStyleAnalytics2;
        AdvertDetailsStyleAnalytics advertDetailsStyleAnalytics3 = new AdvertDetailsStyleAnalytics("AVITO_MALL", 2, 6);
        f82775e = advertDetailsStyleAnalytics3;
        AdvertDetailsStyleAnalytics advertDetailsStyleAnalytics4 = new AdvertDetailsStyleAnalytics("AVITO_FOR_BUSINESS", 3, 7);
        f82776f = advertDetailsStyleAnalytics4;
        AdvertDetailsStyleAnalytics advertDetailsStyleAnalytics5 = new AdvertDetailsStyleAnalytics("AVITO_REPAIR_PRICES", 4, 8);
        f82777g = advertDetailsStyleAnalytics5;
        AdvertDetailsStyleAnalytics[] advertDetailsStyleAnalyticsArr = {advertDetailsStyleAnalytics, advertDetailsStyleAnalytics2, advertDetailsStyleAnalytics3, advertDetailsStyleAnalytics4, advertDetailsStyleAnalytics5};
        f82778h = advertDetailsStyleAnalyticsArr;
        f82779i = c.a(advertDetailsStyleAnalyticsArr);
    }

    public AdvertDetailsStyleAnalytics(String str, int i12, int i13) {
        this.f82780b = i13;
    }

    public static AdvertDetailsStyleAnalytics valueOf(String str) {
        return (AdvertDetailsStyleAnalytics) Enum.valueOf(AdvertDetailsStyleAnalytics.class, str);
    }

    public static AdvertDetailsStyleAnalytics[] values() {
        return (AdvertDetailsStyleAnalytics[]) f82778h.clone();
    }
}
