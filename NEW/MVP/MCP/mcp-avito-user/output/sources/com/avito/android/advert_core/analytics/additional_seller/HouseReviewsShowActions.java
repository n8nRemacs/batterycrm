package com.avito.android.advert_core.analytics.additional_seller;

import Y61.k;
import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.enums.c;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: HouseReviewsShow.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert_core/analytics/additional_seller/HouseReviewsShowActions;", "", "_avito_advert-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class HouseReviewsShowActions {

    /* renamed from: c, reason: collision with root package name */
    public static final HouseReviewsShowActions f82781c;

    /* renamed from: d, reason: collision with root package name */
    public static final HouseReviewsShowActions f82782d;

    /* renamed from: e, reason: collision with root package name */
    public static final HouseReviewsShowActions f82783e;

    /* renamed from: f, reason: collision with root package name */
    public static final HouseReviewsShowActions f82784f;

    /* renamed from: g, reason: collision with root package name */
    public static final HouseReviewsShowActions f82785g;

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ HouseReviewsShowActions[] f82786h;

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ a f82787i;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f82788b;

    static {
        HouseReviewsShowActions houseReviewsShowActions = new HouseReviewsShowActions("BLOCK_SHOW", 0, "block_show");
        f82781c = houseReviewsShowActions;
        HouseReviewsShowActions houseReviewsShowActions2 = new HouseReviewsShowActions("BLOCK_SHOW_EMPTY", 1, "block_show_empty");
        f82782d = houseReviewsShowActions2;
        HouseReviewsShowActions houseReviewsShowActions3 = new HouseReviewsShowActions("ONBOARDING_SHOW", 2, "onboarding_show");
        f82783e = houseReviewsShowActions3;
        HouseReviewsShowActions houseReviewsShowActions4 = new HouseReviewsShowActions("REVIEWS_PAGE", 3, "reviews_page");
        f82784f = houseReviewsShowActions4;
        HouseReviewsShowActions houseReviewsShowActions5 = new HouseReviewsShowActions("NOT_INTERESTED", 4, "not_interested");
        f82785g = houseReviewsShowActions5;
        HouseReviewsShowActions[] houseReviewsShowActionsArr = {houseReviewsShowActions, houseReviewsShowActions2, houseReviewsShowActions3, houseReviewsShowActions4, houseReviewsShowActions5};
        f82786h = houseReviewsShowActionsArr;
        f82787i = c.a(houseReviewsShowActionsArr);
    }

    public HouseReviewsShowActions(String str, int i12, String str2) {
        this.f82788b = str2;
    }

    public static HouseReviewsShowActions valueOf(String str) {
        return (HouseReviewsShowActions) Enum.valueOf(HouseReviewsShowActions.class, str);
    }

    public static HouseReviewsShowActions[] values() {
        return (HouseReviewsShowActions[]) f82786h.clone();
    }
}
