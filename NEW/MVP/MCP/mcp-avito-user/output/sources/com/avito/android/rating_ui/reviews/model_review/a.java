package com.avito.android.rating_ui.reviews.model_review;

import android.os.Parcelable;
import com.avito.android.rating_ui.RatingItemsMarginHorizontal;
import com.avito.android.rating_ui.reviews.review.BaseRatingReviewItem;
import com.avito.android.remote.model.TnsGalleryImage;
import java.util.List;
import kotlin.Metadata;

/* compiled from: BaseRatingModelReviewItem.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/rating_ui/reviews/model_review/a;", "Lcom/avito/conveyor_item/a;", "_avito_rating-ui_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public interface a extends com.avito.conveyor_item.a {

    /* compiled from: BaseRatingModelReviewItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.rating_ui.reviews.model_review.a$a, reason: collision with other inner class name */
    public static final class C7504a {
    }

    @Y61.l
    BaseRatingReviewItem.ReviewAnswer B0();

    void K(@Y61.l Parcelable parcelable);

    @Y61.l
    Parcelable Y0();

    @Y61.k
    RatingItemsMarginHorizontal c();

    @Y61.l
    List<ModelAction> getActions();

    @Y61.l
    Author getAuthor();

    @Y61.l
    List<TnsGalleryImage> getImages();

    @Y61.l
    String getModelTitle();

    @Y61.l
    String getRated();

    @Y61.l
    String getRejectMessage();

    @Y61.l
    Long getReviewId();

    @Y61.l
    Float getScore();

    @Y61.l
    String getScoreDescription();

    @Y61.l
    ReviewStatus getStatus();

    @Y61.l
    String getStatusText();

    @Y61.l
    List<BaseRatingReviewItem.ReviewTextSection> getTextSections();

    @Y61.l
    String l0();

    boolean x();

    boolean y();
}
