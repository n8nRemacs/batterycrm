package com.avito.android.rating_ui.reviews.review;

import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.rating_ui.RatingItemsMarginHorizontal;
import com.avito.android.rating_ui.reviews.review.BaseRatingReviewItem;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.tns_gallery.t;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: RatingReviewItemView.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/rating_ui/reviews/review/o;", "LTV0/e;", "_avito_rating-ui_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public interface o extends TV0.e {

    /* compiled from: RatingReviewItemView.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a {
    }

    void Cb(@Y61.k String str, boolean z12, @Y61.k Y41.a aVar);

    void E(@Y61.k RatingItemsMarginHorizontal ratingItemsMarginHorizontal);

    void E6(boolean z12);

    void EO(boolean z12);

    void F8(boolean z12);

    void GJ(@Y61.l String str, @Y61.l String str2);

    void GK(@Y61.l String str, boolean z12);

    void J(@Y61.l String str);

    @Y61.k
    /* renamed from: Mc */
    t getF250373I();

    void Nh(@Y61.l String str);

    void R4(@Y61.k Y41.a<G0> aVar);

    void R7();

    void WX(@Y61.k BaseRatingReviewItem.ReviewStatus reviewStatus, @Y61.l String str, @Y61.l AttributedText attributedText, boolean z12, boolean z13, @Y61.k Y41.l<? super DeepLink, G0> lVar);

    @Y61.k
    /* renamed from: Z2 */
    t getF250372H();

    void a9(@Y61.k String str);

    void cP(@Y61.l String str, @Y61.l String str2);

    void k8(@Y61.l BaseRatingReviewItem.ReviewAnswer.ReviewAnswerStatus reviewAnswerStatus, @Y61.l String str, @Y61.l String str2, boolean z12);

    void s9(@Y61.k BaseRatingReviewItem.ReviewTextSection reviewTextSection, int i12, @Y61.k Y41.a aVar);

    void w30(@Y61.l String str, @Y61.l Float f12);

    void xa(@Y61.k com.avito.android.image_loader.a aVar, boolean z12);

    void xp(@Y61.k Y41.a<G0> aVar);

    void z5(@Y61.k com.avito.android.image_loader.k kVar);
}
