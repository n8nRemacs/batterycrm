package com.avito.android.rating.details.answer;

import Y61.k;
import Y61.l;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Parcelable;
import com.avito.android.rating.details.answer.RatingAddAnswerActivity;
import com.avito.android.rating.details.answer.upload.ReviewReplyState;
import com.avito.android.rating.g;
import com.avito.android.rating_ui.reviews.review.BaseRatingReviewItem;
import com.avito.android.ratings.RatingActionAnswerLengthValidationData;
import i.AbstractC41201a;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: RatingAddAnswerActivityResultContract.kt */
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001:\u0001\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/rating/details/answer/a;", "Li/a;", "Lcom/avito/android/rating/details/answer/a$a;", "Lcom/avito/android/rating/details/answer/upload/ReviewReplyState$Result;", "a", "_avito_rating_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class a extends AbstractC41201a<C7394a, ReviewReplyState.Result> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final g f246594b;

    /* compiled from: RatingAddAnswerActivityResultContract.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/rating/details/answer/a$a;", "", "_avito_rating_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.rating.details.answer.a$a, reason: collision with other inner class name */
    public static final /* data */ class C7394a {

        /* renamed from: a, reason: collision with root package name */
        @l
        public final Long f246595a;

        /* renamed from: b, reason: collision with root package name */
        @l
        public final BaseRatingReviewItem.ReviewAction.ReviewActionValue.ReviewActionAnswerLengthValidation f246596b;

        public C7394a(@l Long l12, @l BaseRatingReviewItem.ReviewAction.ReviewActionValue.ReviewActionAnswerLengthValidation reviewActionAnswerLengthValidation) {
            this.f246595a = l12;
            this.f246596b = reviewActionAnswerLengthValidation;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C7394a)) {
                return false;
            }
            C7394a c7394a = (C7394a) obj;
            return L.f(this.f246595a, c7394a.f246595a) && L.f(this.f246596b, c7394a.f246596b);
        }

        public final int hashCode() {
            Long l12 = this.f246595a;
            int iHashCode = (l12 == null ? 0 : l12.hashCode()) * 31;
            BaseRatingReviewItem.ReviewAction.ReviewActionValue.ReviewActionAnswerLengthValidation reviewActionAnswerLengthValidation = this.f246596b;
            return iHashCode + (reviewActionAnswerLengthValidation != null ? reviewActionAnswerLengthValidation.hashCode() : 0);
        }

        @k
        public final String toString() {
            return "Params(reviewId=" + this.f246595a + ", answerLengthValidation=" + this.f246596b + ')';
        }
    }

    @Inject
    public a(@k g gVar) {
        this.f246594b = gVar;
    }

    @Override // i.AbstractC41201a
    public final Intent createIntent(Context context, C7394a c7394a) {
        C7394a c7394a2 = c7394a;
        BaseRatingReviewItem.ReviewAction.ReviewActionValue.ReviewActionAnswerLengthValidation reviewActionAnswerLengthValidation = c7394a2.f246596b;
        RatingActionAnswerLengthValidationData ratingActionAnswerLengthValidationData = reviewActionAnswerLengthValidation != null ? new RatingActionAnswerLengthValidationData(reviewActionAnswerLengthValidation.f250283b, reviewActionAnswerLengthValidation.f250284c) : null;
        g gVar = this.f246594b;
        gVar.getClass();
        RatingAddAnswerActivity.a aVar = RatingAddAnswerActivity.f246573p;
        RatingAddAnswerArguments ratingAddAnswerArguments = new RatingAddAnswerArguments(c7394a2.f246595a, ratingActionAnswerLengthValidationData);
        aVar.getClass();
        return new Intent(gVar.f247574a, (Class<?>) RatingAddAnswerActivity.class).putExtra("key_arguments", ratingAddAnswerArguments);
    }

    @Override // i.AbstractC41201a
    public final ReviewReplyState.Result parseResult(int i12, Intent intent) {
        ReviewReplyState.Result result;
        if (intent != null) {
            RatingAddAnswerActivity.f246573p.getClass();
            result = (ReviewReplyState.Result) (Build.VERSION.SDK_INT >= 33 ? (Parcelable) intent.getParcelableExtra("key_result", ReviewReplyState.Result.class) : intent.getParcelableExtra("key_result"));
        } else {
            result = null;
        }
        if (i12 == -1) {
            return result;
        }
        return null;
    }
}
