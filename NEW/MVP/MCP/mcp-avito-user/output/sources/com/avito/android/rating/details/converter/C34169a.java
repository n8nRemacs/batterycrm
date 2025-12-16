package com.avito.android.rating.details.converter;

import com.avito.android.rating.details.adapter.seller.RatingDetailsReviewItem;
import com.avito.android.rating_ui.RatingItemsMarginHorizontal;
import com.avito.android.rating_ui.reviews.review.BaseRatingReviewItem;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.rating_details_mvi.ReviewEntry;
import kotlin.Metadata;

/* compiled from: RatingDetailsReviewConverter.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/rating/details/converter/a;", "Lcom/avito/android/rating/details/converter/y;", "_avito_rating_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.rating.details.converter.a, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C34169a extends y {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final u f246919a;

    public C34169a(@Y61.k u uVar) {
        this.f246919a = uVar;
    }

    @Override // com.avito.android.rating.details.converter.y
    @Y61.k
    public final RatingDetailsReviewItem a(@Y61.k ReviewEntry reviewEntry, boolean z12, @Y61.k RatingItemsMarginHorizontal.MarginNormal marginNormal) {
        String str = "review:" + reviewEntry.getReviewId();
        Long reviewId = reviewEntry.getReviewId();
        Image avatar = reviewEntry.getAvatar();
        String rated = reviewEntry.getRated();
        BaseRatingReviewItem.ReviewStatus reviewStatus = BaseRatingReviewItem.ReviewStatus.f250323b;
        return new RatingDetailsReviewItem(str, reviewId, avatar, reviewEntry.getTitle(), rated, null, reviewStatus, null, null, reviewEntry.getScore(), reviewEntry.getStageTitle(), reviewEntry.getItemTitle(), null, reviewEntry.getImages(), z.a(reviewEntry.getTextSections()), this.f246919a.a(reviewEntry.getAnswer(), null), null, marginNormal, false, false, z12, reviewEntry.getAnalyticalParams(), null, 4980768, null);
    }
}
