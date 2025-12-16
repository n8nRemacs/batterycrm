package com.avito.android.profile.pro.impl.screen.item.dashboard_list_item;

import Y61.k;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ProfileOtherDashboardItem.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile/pro/impl/screen/item/dashboard_list_item/ItemSlug;", "", "_avito_profile-pro_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class ItemSlug {

    /* renamed from: d, reason: collision with root package name */
    public static final ItemSlug f223103d;

    /* renamed from: e, reason: collision with root package name */
    public static final ItemSlug f223104e;

    /* renamed from: f, reason: collision with root package name */
    public static final ItemSlug f223105f;

    /* renamed from: g, reason: collision with root package name */
    public static final ItemSlug f223106g;

    /* renamed from: h, reason: collision with root package name */
    public static final ItemSlug f223107h;

    /* renamed from: i, reason: collision with root package name */
    public static final ItemSlug f223108i;

    /* renamed from: j, reason: collision with root package name */
    public static final ItemSlug f223109j;

    /* renamed from: k, reason: collision with root package name */
    public static final ItemSlug f223110k;

    /* renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ ItemSlug[] f223111l;

    /* renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f223112m;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f223113b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f223114c;

    static {
        ItemSlug itemSlug = new ItemSlug("ACTIVE", 0, "sellerItemsStatuses", "user_adverts");
        f223103d = itemSlug;
        ItemSlug itemSlug2 = new ItemSlug("ADS", 1, "sellingCoachPromo", "hints");
        f223104e = itemSlug2;
        ItemSlug itemSlug3 = new ItemSlug("CALLS", 2, "serviceQualityCalls", "bottom_sheet");
        f223105f = itemSlug3;
        ItemSlug itemSlug4 = new ItemSlug("MESSAGES", 3, "serviceQualityChats", "channels");
        f223106g = itemSlug4;
        ItemSlug itemSlug5 = new ItemSlug("ORDERS", 4, "serviceQualityDelivery", "orders");
        f223107h = itemSlug5;
        ItemSlug itemSlug6 = new ItemSlug("QUALITY", 5, "serviceQualityGrade", "quality_state");
        f223108i = itemSlug6;
        ItemSlug itemSlug7 = new ItemSlug("MARKET", 6, "market", "user_adverts");
        f223109j = itemSlug7;
        ItemSlug itemSlug8 = new ItemSlug("PROMOTE", 7, "promote", "user_adverts");
        f223110k = itemSlug8;
        ItemSlug[] itemSlugArr = {itemSlug, itemSlug2, itemSlug3, itemSlug4, itemSlug5, itemSlug6, itemSlug7, itemSlug8};
        f223111l = itemSlugArr;
        f223112m = kotlin.enums.c.a(itemSlugArr);
    }

    public ItemSlug(String str, int i12, String str2, String str3) {
        this.f223113b = str2;
        this.f223114c = str3;
    }

    public static ItemSlug valueOf(String str) {
        return (ItemSlug) Enum.valueOf(ItemSlug.class, str);
    }

    public static ItemSlug[] values() {
        return (ItemSlug[]) f223111l.clone();
    }
}
