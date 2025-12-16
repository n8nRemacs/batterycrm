package com.avito.android.rating;

import Y61.l;
import android.content.Context;
import android.content.Intent;
import com.avito.android.analytics_ratings_reviews.ReviewsOpenPageFrom;
import com.avito.android.rating.details.RatingDetailsActivity;
import com.avito.android.rating.details.RatingDetailsArguments;
import com.avito.android.rating.user_contacts.UserContactsActivity;
import com.avito.android.remote.model.FloatingBuyBlock;
import com.squareup.anvil.annotations.ContributesBinding;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: RatingIntentFactoryImpl.kt */
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/rating/g;", "Lcom/avito/android/rating/f;", "_avito_rating_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class g implements f {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Context f247574a;

    @Inject
    public g(@Y61.k Context context) {
        this.f247574a = context;
    }

    @Override // com.avito.android.rating.f
    @Y61.k
    public final Intent a(@l String str) {
        UserContactsActivity.f247653z.getClass();
        Intent intentPutExtra = new Intent(this.f247574a, (Class<?>) UserContactsActivity.class).putExtra("context", str);
        intentPutExtra.setFlags(603979776);
        return intentPutExtra;
    }

    @Override // com.avito.android.rating.f
    @Y61.k
    public final Intent b(@l String str) {
        RatingDetailsActivity.a aVar = RatingDetailsActivity.f246407m;
        RatingDetailsArguments.UserReviews userReviews = new RatingDetailsArguments.UserReviews(str);
        aVar.getClass();
        return RatingDetailsActivity.a.a(this.f247574a, userReviews);
    }

    @Override // com.avito.android.rating.f
    @Y61.k
    public final Intent c(@l String str, @l ReviewsOpenPageFrom reviewsOpenPageFrom) {
        RatingDetailsActivity.a aVar = RatingDetailsActivity.f246407m;
        RatingDetailsArguments.UserRating userRating = new RatingDetailsArguments.UserRating(str, reviewsOpenPageFrom);
        aVar.getClass();
        return RatingDetailsActivity.a.a(this.f247574a, userRating);
    }

    @Override // com.avito.android.rating.f
    @Y61.k
    public final Intent d(long j12, @l ReviewsOpenPageFrom reviewsOpenPageFrom, @l String str) {
        RatingDetailsActivity.a aVar = RatingDetailsActivity.f246407m;
        RatingDetailsArguments.ItemReviews itemReviews = new RatingDetailsArguments.ItemReviews(j12, reviewsOpenPageFrom, str);
        aVar.getClass();
        return RatingDetailsActivity.a.a(this.f247574a, itemReviews);
    }

    @Override // com.avito.android.rating.f
    @Y61.k
    public final Intent e(@l ReviewsOpenPageFrom reviewsOpenPageFrom, @l FloatingBuyBlock floatingBuyBlock, @l Long l12, @Y61.k String str, @l String str2, @l String str3) {
        RatingDetailsActivity.a aVar = RatingDetailsActivity.f246407m;
        RatingDetailsArguments.PublicProfileRating publicProfileRating = new RatingDetailsArguments.PublicProfileRating(reviewsOpenPageFrom, floatingBuyBlock, l12, str2, str, str3);
        aVar.getClass();
        return RatingDetailsActivity.a.a(this.f247574a, publicProfileRating);
    }
}
