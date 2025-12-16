package com.avito.android.rating_ui.reviews.model_review;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: BaseRatingModelReviewItem.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/rating_ui/reviews/model_review/ReviewStatus;", "", "_avito_rating-ui_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class ReviewStatus {

    /* renamed from: b, reason: collision with root package name */
    public static final ReviewStatus f250165b;

    /* renamed from: c, reason: collision with root package name */
    public static final ReviewStatus f250166c;

    /* renamed from: d, reason: collision with root package name */
    public static final ReviewStatus f250167d;

    /* renamed from: e, reason: collision with root package name */
    public static final ReviewStatus f250168e;

    /* renamed from: f, reason: collision with root package name */
    public static final ReviewStatus f250169f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ ReviewStatus[] f250170g;

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f250171h;

    static {
        ReviewStatus reviewStatus = new ReviewStatus("NONE", 0);
        f250165b = reviewStatus;
        ReviewStatus reviewStatus2 = new ReviewStatus("PUBLISHED", 1);
        f250166c = reviewStatus2;
        ReviewStatus reviewStatus3 = new ReviewStatus("DECLINED", 2);
        f250167d = reviewStatus3;
        ReviewStatus reviewStatus4 = new ReviewStatus("MODERATION", 3);
        f250168e = reviewStatus4;
        ReviewStatus reviewStatus5 = new ReviewStatus("APPROVED", 4);
        f250169f = reviewStatus5;
        ReviewStatus[] reviewStatusArr = {reviewStatus, reviewStatus2, reviewStatus3, reviewStatus4, reviewStatus5};
        f250170g = reviewStatusArr;
        f250171h = kotlin.enums.c.a(reviewStatusArr);
    }

    public ReviewStatus() {
        throw null;
    }

    public static ReviewStatus valueOf(String str) {
        return (ReviewStatus) Enum.valueOf(ReviewStatus.class, str);
    }

    public static ReviewStatus[] values() {
        return (ReviewStatus[]) f250170g.clone();
    }
}
