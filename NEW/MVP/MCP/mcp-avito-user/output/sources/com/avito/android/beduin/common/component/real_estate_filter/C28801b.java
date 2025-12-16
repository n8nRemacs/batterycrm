package com.avito.android.beduin.common.component.real_estate_filter;

import com.avito.android.remote.model.SearchParamsConverterKt;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: BeduinRealEstateFilterAnalyticsInteractor.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_beduin_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.beduin.common.component.real_estate_filter.b, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C28801b {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static final Object a(RealEstateFilterState realEstateFilterState, String str) {
        switch (str.hashCode()) {
            case -2126155629:
                if (str.equals("priceFrom")) {
                    return realEstateFilterState.getPriceFrom();
                }
                return null;
            case -1666560553:
                if (str.equals("areaFrom")) {
                    return realEstateFilterState.getAreaFrom();
                }
                return null;
            case -1474744216:
                if (str.equals("finishTypeId")) {
                    return realEstateFilterState.getFinishTypeId();
                }
                return null;
            case -1409553432:
                if (str.equals("areaTo")) {
                    return realEstateFilterState.getAreaTo();
                }
                return null;
            case -1297661002:
                if (str.equals("developmentId")) {
                    return realEstateFilterState.getDevelopmentId();
                }
                return null;
            case -473513210:
                if (str.equals("roomsTypeIds")) {
                    return realEstateFilterState.getRoomsTypeIds();
                }
                return null;
            case -315060828:
                if (str.equals("priceTo")) {
                    return realEstateFilterState.getPriceTo();
                }
                return null;
            case 1521066100:
                if (str.equals("completionDateFrom")) {
                    return realEstateFilterState.getCompletionDateFrom();
                }
                return null;
            case 1541836720:
                if (str.equals(SearchParamsConverterKt.LOCATION_ID)) {
                    return realEstateFilterState.getLocationId();
                }
                return null;
            case 1945715141:
                if (str.equals("completionDateTo")) {
                    return realEstateFilterState.getCompletionDateTo();
                }
                return null;
            default:
                return null;
        }
    }
}
