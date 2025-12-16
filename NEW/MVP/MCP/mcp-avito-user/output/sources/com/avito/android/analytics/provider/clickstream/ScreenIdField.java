package com.avito.android.analytics.provider.clickstream;

import Y61.k;
import com.avito.android.remote.model.notifications_settings.NotificationsSettings;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ScreenIdField.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/analytics/provider/clickstream/ScreenIdField;", "", "_avito_analytics_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class ScreenIdField {

    /* renamed from: c, reason: collision with root package name */
    public static final ScreenIdField f90251c;

    /* renamed from: d, reason: collision with root package name */
    public static final ScreenIdField f90252d;

    /* renamed from: e, reason: collision with root package name */
    public static final ScreenIdField f90253e;

    /* renamed from: f, reason: collision with root package name */
    public static final ScreenIdField f90254f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ ScreenIdField[] f90255g;

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f90256h;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f90257b;

    static {
        ScreenIdField screenIdField = new ScreenIdField("MAIN", 0, "main");
        ScreenIdField screenIdField2 = new ScreenIdField("SERP", 1, "serp");
        f90251c = screenIdField2;
        ScreenIdField screenIdField3 = new ScreenIdField("ADVERT_DETAILS", 2, "item");
        ScreenIdField screenIdField4 = new ScreenIdField("MY_ADVERT_DETAILS", 3, "profile_item");
        ScreenIdField screenIdField5 = new ScreenIdField("CHANNELS", 4, "channels");
        ScreenIdField screenIdField6 = new ScreenIdField("CHANNEL", 5, "channel");
        ScreenIdField screenIdField7 = new ScreenIdField("AUTHENTICATION", 6, "auth");
        ScreenIdField screenIdField8 = new ScreenIdField("SHOPS_LIST", 7, "shops_list");
        ScreenIdField screenIdField9 = new ScreenIdField("SHOP_DETAILS", 8, "shop_info");
        ScreenIdField screenIdField10 = new ScreenIdField("ADVERT_EDIT", 9, "edit_item");
        ScreenIdField screenIdField11 = new ScreenIdField("PROFILE", 10, "profile");
        ScreenIdField screenIdField12 = new ScreenIdField("PUBLIC_PROFILE", 11, "public_profile");
        ScreenIdField screenIdField13 = new ScreenIdField("PUBLISH_WIZARD", 12, "publish_wizard");
        ScreenIdField screenIdField14 = new ScreenIdField("PROFILE_ITEMS", 13, "account");
        ScreenIdField screenIdField15 = new ScreenIdField("FAVORITE_ITEMS", 14, "favorite_items");
        f90252d = screenIdField15;
        ScreenIdField screenIdField16 = new ScreenIdField("DELIVERY_ORDER", 15, "delivery_order_create");
        ScreenIdField screenIdField17 = new ScreenIdField("FILTERS", 16, "filters");
        ScreenIdField screenIdField18 = new ScreenIdField("CATEGORY", 17, "category");
        ScreenIdField screenIdField19 = new ScreenIdField("SAVED_SEARCHES", 18, "saved_searches");
        ScreenIdField screenIdField20 = new ScreenIdField("NOTIFICATIONS", 19, "notifications");
        ScreenIdField screenIdField21 = new ScreenIdField("MESSENGER", 20, NotificationsSettings.Section.SECTION_MESSENGER);
        ScreenIdField screenIdField22 = new ScreenIdField("MESSENGER_RECOMMENDATIONS", 21, "msg_recommendations");
        ScreenIdField screenIdField23 = new ScreenIdField("SETTINGS", 22, "settings");
        ScreenIdField screenIdField24 = new ScreenIdField("NEW_ADVERT", 23, "new_advert");
        ScreenIdField screenIdField25 = new ScreenIdField("BRANDSPACE", 24, "brandspace");
        ScreenIdField screenIdField26 = new ScreenIdField("EXTENDED_PROFILE", 25, "extended_profile");
        ScreenIdField screenIdField27 = new ScreenIdField("ADVERT_COLLECTION", 26, "advert_collection");
        ScreenIdField screenIdField28 = new ScreenIdField("BX_CONTENT", 27, "bx_content");
        ScreenIdField screenIdField29 = new ScreenIdField("RECOMMENDATION_SNIPPET", 28, "item_i2i_rec");
        f90253e = screenIdField29;
        ScreenIdField screenIdField30 = new ScreenIdField("VERTICAL_RECENT_ITEMS", 29, "vertical_recent_items");
        f90254f = screenIdField30;
        ScreenIdField[] screenIdFieldArr = {screenIdField, screenIdField2, screenIdField3, screenIdField4, screenIdField5, screenIdField6, screenIdField7, screenIdField8, screenIdField9, screenIdField10, screenIdField11, screenIdField12, screenIdField13, screenIdField14, screenIdField15, screenIdField16, screenIdField17, screenIdField18, screenIdField19, screenIdField20, screenIdField21, screenIdField22, screenIdField23, screenIdField24, screenIdField25, screenIdField26, screenIdField27, screenIdField28, screenIdField29, screenIdField30, new ScreenIdField("AVL", 30, "avl"), new ScreenIdField("JOB_MY_APPLIES", 31, "job_my_applies"), new ScreenIdField("ITEM_PRICE_HISTORY", 32, "price_history"), new ScreenIdField("PHOTO_GALLERY", 33, "item_gallery"), new ScreenIdField("VIEWED", 34, "user_viewed"), new ScreenIdField("ITEM_MAP", 35, "fullmap")};
        f90255g = screenIdFieldArr;
        f90256h = kotlin.enums.c.a(screenIdFieldArr);
    }

    public ScreenIdField(String str, int i12, String str2) {
        this.f90257b = str2;
    }

    public static ScreenIdField valueOf(String str) {
        return (ScreenIdField) Enum.valueOf(ScreenIdField.class, str);
    }

    public static ScreenIdField[] values() {
        return (ScreenIdField[]) f90255g.clone();
    }
}
