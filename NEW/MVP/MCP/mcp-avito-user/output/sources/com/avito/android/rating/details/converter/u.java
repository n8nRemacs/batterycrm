package com.avito.android.rating.details.converter;

import com.avito.android.rating_ui.reviews.review.BaseRatingReviewItem;
import com.avito.android.remote.model.rating_details_mvi.ReviewEntry;
import java.util.List;
import kotlin.Metadata;

/* compiled from: RatingDetailsReviewAnswerConverter.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/rating/details/converter/u;", "", "_avito_rating_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public interface u {
    @Y61.l
    BaseRatingReviewItem.ReviewAnswer a(@Y61.l ReviewEntry.Answer answer, @Y61.l List<BaseRatingReviewItem.ReviewAction> list);
}
