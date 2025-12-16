package com.avito.android.rating;

import android.os.Bundle;
import com.avito.android.analytics_ratings_reviews.ReviewsOpenPageFrom;
import com.avito.android.rating.details.RatingDetailsArguments;
import com.avito.android.rating.details.RatingDetailsFragment;
import com.squareup.anvil.annotations.ContributesBinding;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: RatingFragmentFactoryImpl.kt */
@ContributesBinding
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/rating/c;", "Lcom/avito/android/rating/b;", "<init>", "()V", "_avito_rating_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class c implements b {
    @Inject
    public c() {
    }

    @Override // com.avito.android.rating.b
    public final RatingDetailsFragment a(String str, String str2, ReviewsOpenPageFrom.PublicProfileTabs publicProfileTabs, String str3, Long l12) {
        RatingDetailsFragment.C34165a c34165a = RatingDetailsFragment.f246422S0;
        RatingDetailsArguments.PublicProfileRating publicProfileRating = new RatingDetailsArguments.PublicProfileRating(str2, publicProfileTabs, str, str3, l12, null, 32, null);
        c34165a.getClass();
        RatingDetailsFragment ratingDetailsFragment = new RatingDetailsFragment();
        Bundle bundle = new Bundle();
        bundle.putParcelable("key_arguments", publicProfileRating);
        ratingDetailsFragment.setArguments(bundle);
        return ratingDetailsFragment;
    }
}
