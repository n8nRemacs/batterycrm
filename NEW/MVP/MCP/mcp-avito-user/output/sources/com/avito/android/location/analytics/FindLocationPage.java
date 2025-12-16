package com.avito.android.location.analytics;

import Y61.k;
import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.enums.c;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: FindLocationPage.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/location/analytics/FindLocationPage;", "", "_avito_user-location_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class FindLocationPage {

    /* renamed from: c, reason: collision with root package name */
    public static final FindLocationPage f181725c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ FindLocationPage[] f181726d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ a f181727e;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f181728b;

    static {
        FindLocationPage findLocationPage = new FindLocationPage("BUYER_ITEM_MAP", 0, "buyer_item_map");
        FindLocationPage findLocationPage2 = new FindLocationPage("SELLER_ITEM_MAP", 1, "seller_item_map");
        FindLocationPage findLocationPage3 = new FindLocationPage("ADD_ADV_MAP", 2, "add_map");
        FindLocationPage findLocationPage4 = new FindLocationPage("SEARCH_MAP", 3, "map");
        f181725c = findLocationPage4;
        FindLocationPage[] findLocationPageArr = {findLocationPage, findLocationPage2, findLocationPage3, findLocationPage4, new FindLocationPage("SMALL_RADIUS", 4, "radius"), new FindLocationPage("DELIVERY_MAP", 5, "delivery_map"), new FindLocationPage("NEW_DEVELOPMENTS_MAP", 6, "new_developments"), new FindLocationPage("SHARING_MAP", 7, "messenger_my_location"), new FindLocationPage("PLATFORM_MAP", 8, "messenger_alien_location"), new FindLocationPage("PVZ_MAP", 9, "pvz_map"), new FindLocationPage("FIRST_LAUNCH", 10, "first_launch"), new FindLocationPage("OPEN_APP", 11, "open_app"), new FindLocationPage("PROFILE", 12, "profile"), new FindLocationPage("DISTANCE_SORT", 13, "distance_sort"), new FindLocationPage("DELIVERY_COURIER_MAP", 14, "delivery_courier_map"), new FindLocationPage("UNIVERSAL_MAP", 15, "universal_map"), new FindLocationPage("FAVORITES", 16, "favorites"), new FindLocationPage("ADVERT_COLLECTION", 17, "advert_collection")};
        f181726d = findLocationPageArr;
        f181727e = c.a(findLocationPageArr);
    }

    public FindLocationPage(String str, int i12, String str2) {
        this.f181728b = str2;
    }

    public static FindLocationPage valueOf(String str) {
        return (FindLocationPage) Enum.valueOf(FindLocationPage.class, str);
    }

    public static FindLocationPage[] values() {
        return (FindLocationPage[]) f181726d.clone();
    }

    @k
    /* renamed from: a, reason: from getter */
    public final String getF181728b() {
        return this.f181728b;
    }
}
