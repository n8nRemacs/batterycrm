package com.avito.android.rating.info_screen;

import Y61.k;
import Y61.l;
import android.content.Context;
import android.content.Intent;
import com.avito.android.rating_ui.reviews.review.BaseRatingReviewItem;
import com.avito.android.remote.model.text.AttributedText;
import kotlin.Metadata;

/* compiled from: RatingDetailsInfoIntentFactory.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/rating/info_screen/c;", "Lcom/avito/android/rating/info_screen/b;", "_avito_rating_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class c implements b {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final Context f247621a;

    public c(@k Context context) {
        this.f247621a = context;
    }

    @Override // com.avito.android.rating.info_screen.b
    @k
    public final Intent a(@l Long l12, @l AttributedText attributedText, @l BaseRatingReviewItem.ReviewAction.ReviewActionValue.ReviewActionInfoButtons reviewActionInfoButtons) {
        RatingDetailsInfoActivity.f247616p.getClass();
        return new Intent(this.f247621a, (Class<?>) RatingDetailsInfoActivity.class).putExtra("KEY_REVIEW_ID", l12).putExtra("KEY_CONTENT", attributedText).putExtra("KEY_BUTTONS", reviewActionInfoButtons);
    }
}
