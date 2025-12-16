package com.avito.android.rating.details.converter;

import com.avito.android.rating.details.adapter.seller.RatingDetailsReviewItem;
import com.avito.android.rating_ui.RatingItemsMarginHorizontal;
import com.avito.android.rating_ui.reviews.review.BaseRatingReviewItem;
import com.avito.android.remote.model.rating_details_mvi.ReviewEntry;
import kotlin.Metadata;

/* compiled from: RatingDetailsReviewConverter.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/rating/details/converter/b;", "Lcom/avito/android/rating/details/converter/y;", "_avito_rating_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.rating.details.converter.b, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C34170b extends y {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final u f246920a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final q f246921b;

    public C34170b(@Y61.k u uVar, @Y61.k q qVar) {
        this.f246920a = uVar;
        this.f246921b = qVar;
    }

    @Override // com.avito.android.rating.details.converter.y
    @Y61.k
    public final RatingDetailsReviewItem a(@Y61.k ReviewEntry reviewEntry, boolean z12, @Y61.k RatingItemsMarginHorizontal.MarginNormal marginNormal) {
        return new RatingDetailsReviewItem("review:" + reviewEntry.getReviewId(), reviewEntry.getReviewId(), reviewEntry.getAvatar(), reviewEntry.getTitle(), reviewEntry.getRated(), reviewEntry.getTitleCaption(), BaseRatingReviewItem.ReviewStatus.f250323b, null, null, reviewEntry.getScore(), reviewEntry.getStageTitle(), reviewEntry.getItemTitle(), reviewEntry.getDeliveryTitle(), reviewEntry.getImages(), z.a(reviewEntry.getTextSections()), this.f246920a.a(reviewEntry.getAnswer(), null), this.f246921b.a(reviewEntry.getActions()), marginNormal, true, false, z12, reviewEntry.getAnalyticalParams(), null, 4718592, null);
    }
}
