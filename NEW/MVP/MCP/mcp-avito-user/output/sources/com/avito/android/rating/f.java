package com.avito.android.rating;

import Y61.l;
import android.content.Intent;
import com.avito.android.analytics_ratings_reviews.ReviewsOpenPageFrom;
import com.avito.android.remote.model.FloatingBuyBlock;
import kotlin.Metadata;

/* compiled from: RatingIntentFactory.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/rating/f;", "", "_avito_rating_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public interface f {
    @Y61.k
    Intent a(@l String str);

    @Y61.k
    Intent b(@l String str);

    @Y61.k
    Intent c(@l String str, @l ReviewsOpenPageFrom reviewsOpenPageFrom);

    @Y61.k
    Intent d(long j12, @l ReviewsOpenPageFrom reviewsOpenPageFrom, @l String str);

    @Y61.k
    Intent e(@l ReviewsOpenPageFrom reviewsOpenPageFrom, @l FloatingBuyBlock floatingBuyBlock, @l Long l12, @Y61.k String str, @l String str2, @l String str3);
}
