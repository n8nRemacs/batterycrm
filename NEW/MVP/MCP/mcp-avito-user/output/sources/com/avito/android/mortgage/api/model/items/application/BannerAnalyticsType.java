package com.avito.android.mortgage.api.model.items.application;

import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ApplicationCtaBannerItemValue.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/mortgage/api/model/items/application/BannerAnalyticsType;", "", "(Ljava/lang/String;I)V", "SEARCH_REALTY", "BUY_INSURANCE", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class BannerAnalyticsType {

    @c("buyInsurance")
    public static final BannerAnalyticsType BUY_INSURANCE;

    @c("searchRealty")
    public static final BannerAnalyticsType SEARCH_REALTY;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ BannerAnalyticsType[] f198222b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ a f198223c;

    static {
        BannerAnalyticsType bannerAnalyticsType = new BannerAnalyticsType("SEARCH_REALTY", 0);
        SEARCH_REALTY = bannerAnalyticsType;
        BannerAnalyticsType bannerAnalyticsType2 = new BannerAnalyticsType("BUY_INSURANCE", 1);
        BUY_INSURANCE = bannerAnalyticsType2;
        BannerAnalyticsType[] bannerAnalyticsTypeArr = {bannerAnalyticsType, bannerAnalyticsType2};
        f198222b = bannerAnalyticsTypeArr;
        f198223c = kotlin.enums.c.a(bannerAnalyticsTypeArr);
    }

    private BannerAnalyticsType(String str, int i12) {
    }

    public static BannerAnalyticsType valueOf(String str) {
        return (BannerAnalyticsType) Enum.valueOf(BannerAnalyticsType.class, str);
    }

    public static BannerAnalyticsType[] values() {
        return (BannerAnalyticsType[]) f198222b.clone();
    }
}
