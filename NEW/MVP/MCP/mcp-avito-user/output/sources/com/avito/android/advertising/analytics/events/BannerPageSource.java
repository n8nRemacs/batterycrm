package com.avito.android.advertising.analytics.events;

import Y61.k;
import com.avito.android.beduin.common.component.input.single_line.SingleLineInputModel;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: BannerPageSource.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advertising/analytics/events/BannerPageSource;", "", "_avito_advertising_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class BannerPageSource {

    /* renamed from: c, reason: collision with root package name */
    public static final BannerPageSource f87777c;

    /* renamed from: d, reason: collision with root package name */
    public static final BannerPageSource f87778d;

    /* renamed from: e, reason: collision with root package name */
    public static final BannerPageSource f87779e;

    /* renamed from: f, reason: collision with root package name */
    public static final BannerPageSource f87780f;

    /* renamed from: g, reason: collision with root package name */
    public static final BannerPageSource f87781g;

    /* renamed from: h, reason: collision with root package name */
    public static final BannerPageSource f87782h;

    /* renamed from: i, reason: collision with root package name */
    public static final BannerPageSource f87783i;

    /* renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ BannerPageSource[] f87784j;

    /* renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f87785k;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f87786b;

    static {
        BannerPageSource bannerPageSource = new BannerPageSource("HOME", 0, "main");
        f87777c = bannerPageSource;
        BannerPageSource bannerPageSource2 = new BannerPageSource("SERP", 1, SingleLineInputModel.STYLE_SEARCH);
        f87778d = bannerPageSource2;
        BannerPageSource bannerPageSource3 = new BannerPageSource("ADVERT", 2, "item");
        f87779e = bannerPageSource3;
        BannerPageSource bannerPageSource4 = new BannerPageSource("AVL", 3, "avl");
        f87780f = bannerPageSource4;
        BannerPageSource bannerPageSource5 = new BannerPageSource("FAVORITES", 4, "favorites");
        f87781g = bannerPageSource5;
        BannerPageSource bannerPageSource6 = new BannerPageSource("CROSSVERTICAL", 5, "crossvertical");
        f87782h = bannerPageSource6;
        BannerPageSource bannerPageSource7 = new BannerPageSource("SELLER_PROFILE", 6, "seller_profile");
        f87783i = bannerPageSource7;
        BannerPageSource[] bannerPageSourceArr = {bannerPageSource, bannerPageSource2, bannerPageSource3, bannerPageSource4, bannerPageSource5, bannerPageSource6, bannerPageSource7};
        f87784j = bannerPageSourceArr;
        f87785k = kotlin.enums.c.a(bannerPageSourceArr);
    }

    public BannerPageSource(String str, int i12, String str2) {
        this.f87786b = str2;
    }

    public static BannerPageSource valueOf(String str) {
        return (BannerPageSource) Enum.valueOf(BannerPageSource.class, str);
    }

    public static BannerPageSource[] values() {
        return (BannerPageSource[]) f87784j.clone();
    }
}
