package com.avito.android.travel_seller_banners.generated.api.api_1_str_seller_banners_get;

import Y61.k;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: Api1StrSellerBannersGetRequest.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/travel_seller_banners/generated/api/api_1_str_seller_banners_get/Page;", "", "", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "SellerOrdersList", "SellerOrdersCalendar", "_avito_travel-seller-banners_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class Page {

    @c("sellerOrdersCalendar")
    public static final Page SellerOrdersCalendar;

    @c("sellerOrdersList")
    public static final Page SellerOrdersList;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ Page[] f303302c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ a f303303d;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f303304b;

    static {
        Page page = new Page("SellerOrdersList", 0, "sellerOrdersList");
        SellerOrdersList = page;
        Page page2 = new Page("SellerOrdersCalendar", 1, "sellerOrdersCalendar");
        SellerOrdersCalendar = page2;
        Page[] pageArr = {page, page2};
        f303302c = pageArr;
        f303303d = kotlin.enums.c.a(pageArr);
    }

    private Page(String str, int i12, String str2) {
        this.f303304b = str2;
    }

    public static Page valueOf(String str) {
        return (Page) Enum.valueOf(Page.class, str);
    }

    public static Page[] values() {
        return (Page[]) f303302c.clone();
    }

    @Override // java.lang.Enum
    @k
    public final String toString() {
        return this.f303304b.toString();
    }
}
