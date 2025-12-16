package com.avito.android.rating_ui.reviews.model_review;

import com.avito.android.rating_ui.RatingItemsMarginHorizontal;
import com.avito.android.rating_ui.reviews.review.BaseRatingReviewItem;
import com.avito.android.tns_gallery.t;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: RatingModelReviewItemView.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/rating_ui/reviews/model_review/m;", "LTV0/e;", "_avito_rating-ui_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public interface m extends TV0.e {

    /* compiled from: RatingModelReviewItemView.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a {
    }

    void Cb(@Y61.k String str, boolean z12, @Y61.k Y41.a aVar);

    void Dp(@Y61.k ReviewStatus reviewStatus, @Y61.l String str, boolean z12);

    void E(@Y61.k RatingItemsMarginHorizontal ratingItemsMarginHorizontal);

    void E6(boolean z12);

    void F8(boolean z12);

    @Y61.k
    /* renamed from: Mc */
    t getF250197H();

    void Mk(@Y61.l String str);

    void ON(@Y61.l com.avito.android.image_loader.a aVar, @Y61.l String str);

    void R4(@Y61.k Y41.a<G0> aVar);

    void R7();

    @Y61.k
    /* renamed from: Z2 */
    t getF250219w();

    void a9(@Y61.k String str);

    void k8(@Y61.l BaseRatingReviewItem.ReviewAnswer.ReviewAnswerStatus reviewAnswerStatus, @Y61.l String str, @Y61.l String str2, boolean z12);

    void o20(@Y61.l String str);

    void oY(@Y61.l String str);

    void s9(@Y61.k BaseRatingReviewItem.ReviewTextSection reviewTextSection, int i12, @Y61.k Y41.a aVar);

    void ue(boolean z12);

    void vA(@Y61.l String str);

    void vc(@Y61.l Float f12);

    void xa(@Y61.k com.avito.android.image_loader.a aVar, boolean z12);

    void xw(@Y61.l String str);
}
