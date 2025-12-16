package com.avito.android.travel_seller_banners.models;

import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.enums.c;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PageForBanner.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/travel_seller_banners/models/PageForBanner;", "", "_avito_travel-seller-banners_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class PageForBanner {

    /* renamed from: b, reason: collision with root package name */
    public static final PageForBanner f303306b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ PageForBanner[] f303307c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ a f303308d;

    static {
        PageForBanner pageForBanner = new PageForBanner("SELLER_ORDERS_LIST", 0);
        PageForBanner pageForBanner2 = new PageForBanner("SELLER_ORDERS_CALENDAR", 1);
        f303306b = pageForBanner2;
        PageForBanner[] pageForBannerArr = {pageForBanner, pageForBanner2};
        f303307c = pageForBannerArr;
        f303308d = c.a(pageForBannerArr);
    }

    public PageForBanner() {
        throw null;
    }

    public static PageForBanner valueOf(String str) {
        return (PageForBanner) Enum.valueOf(PageForBanner.class, str);
    }

    public static PageForBanner[] values() {
        return (PageForBanner[]) f303307c.clone();
    }
}
