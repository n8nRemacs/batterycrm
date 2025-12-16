package com.avito.android.remote.model;

import Y61.k;
import kotlin.Metadata;
import q50.InterfaceC47203a;

/* compiled from: SearchParamsConverter.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b'\n\u0002\u0018\u0002\n\u0000\u001a\r\u0010(\u001a\u00020\u0001*\u00020)H\u0086\b\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0005\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0006\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0007\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\b\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\t\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\n\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u000b\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\f\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\r\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u000e\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u000f\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0010\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0011\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0012\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0013\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0014\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0015\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0016\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0017\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0018\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0019\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u001a\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u001b\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u001c\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u001d\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u001e\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u001f\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010 \u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010!\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\"\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010#\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010$\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010%\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010&\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010'\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000¨\u0006*"}, d2 = {"CATEGORY_ID", "", "COMPANY_KEY", "COMPANY_ONLY", "CV_2_VACANCY", "DIRECTION_ID", "DISTRICT_ID", "DRAW_ID", "EARLY_ACCESS", "EXPANDED", "FALSE", "FOOT_WALKING_METRO", "FROM", "GEO_COORDS", "ICON_TYPE", "LOCAL_PRIORITY", "LOCATION_ID", "METRO_ID", "MORE_EXPENSIVE", "OWNER", "PARAMS", "PRICE_MAX", "PRICE_MIN", "PRIVATE_KEY", "PRIVATE_ONLY", "QUERY", "RADIUS", "SEARCH_RADIUS", "SELLER_ID", "SHOP_ID", "SORT", "SOURCE", "SUGGEST_LOCATION", "TITLE", "TO", "TRUE", "TRUNCATE_TO_SUBTREE", "WIDGET_CATEGORY", "WITH_DELIVERY_ONLY", "WITH_IMAGES_ONLY", "toValue", "Lcom/avito/android/remote/model/Coordinates;", "_avito-discouraged_api-models_models"}, k = 2, mv = {1, 9, 0}, xi = 48)
@InterfaceC47203a
/* loaded from: classes17.dex */
public final class SearchParamsConverterKt {

    @k
    public static final String CATEGORY_ID = "categoryId";

    @k
    private static final String COMPANY_KEY = "company";

    @k
    private static final String COMPANY_ONLY = "companyOnly";

    @k
    public static final String CV_2_VACANCY = "cv2Vacancy";

    @k
    public static final String DIRECTION_ID = "directionId";

    @k
    public static final String DISTRICT_ID = "districtId";

    @k
    public static final String DRAW_ID = "drawId";

    @k
    public static final String EARLY_ACCESS = "earlyAccess";

    @k
    public static final String EXPANDED = "expanded";

    @k
    private static final String FALSE = "0";

    @k
    public static final String FOOT_WALKING_METRO = "footWalkingMetro";

    @k
    private static final String FROM = "from";

    @k
    public static final String GEO_COORDS = "geoCoords";

    @k
    private static final String ICON_TYPE = "iconType";

    @k
    public static final String LOCAL_PRIORITY = "localPriority";

    @k
    public static final String LOCATION_ID = "locationId";

    @k
    public static final String METRO_ID = "metroId";

    @k
    public static final String MORE_EXPENSIVE = "moreExpensive";

    @k
    public static final String OWNER = "owner";

    @k
    private static final String PARAMS = "params";

    @k
    public static final String PRICE_MAX = "priceMax";

    @k
    public static final String PRICE_MIN = "priceMin";

    @k
    private static final String PRIVATE_KEY = "private";

    @k
    private static final String PRIVATE_ONLY = "privateOnly";

    @k
    public static final String QUERY = "query";

    @k
    public static final String RADIUS = "radius";

    @k
    public static final String SEARCH_RADIUS = "searchRadius";

    @k
    public static final String SELLER_ID = "sellerId";

    @k
    public static final String SHOP_ID = "shopId";

    @k
    public static final String SORT = "sort";

    @k
    public static final String SOURCE = "source";

    @k
    private static final String SUGGEST_LOCATION = "suggestLocationId";

    @k
    public static final String TITLE = "title";

    /* renamed from: TO, reason: collision with root package name */
    @k
    private static final String f253660TO = "to";

    @k
    private static final String TRUE = "1";

    @k
    public static final String TRUNCATE_TO_SUBTREE = "truncateToSubtree";

    @k
    public static final String WIDGET_CATEGORY = "widgetCategory";

    @k
    public static final String WITH_DELIVERY_ONLY = "withDeliveryOnly";

    @k
    public static final String WITH_IMAGES_ONLY = "withImagesOnly";

    @k
    public static final String toValue(@k Coordinates coordinates) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(coordinates.getLatitude());
        sb2.append(',');
        sb2.append(coordinates.getLongitude());
        return sb2.toString();
    }
}
