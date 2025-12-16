package com.avito.android.rating.details.converter;

import com.avito.android.rating.details.adapter.seller.RatingDetailsReviewItem;
import com.avito.android.rating_ui.RatingItemsMarginHorizontal;
import com.avito.android.rating_ui.reviews.review.BaseRatingReviewItem;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.TnsGalleryImage;
import com.avito.android.remote.model.rating_details_mvi.ReviewEntry;
import com.avito.android.remote.model.rating_details_mvi.TextSection;
import com.avito.android.remote.model.text.AttributedText;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: RatingDetailsReviewConverter.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/rating/details/converter/F;", "Lcom/avito/android/rating/details/converter/y;", "_avito_rating_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class F extends y {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final A f246916a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final u f246917b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final q f246918c;

    public F(@Y61.k A a12, @Y61.k u uVar, @Y61.k q qVar) {
        this.f246916a = a12;
        this.f246917b = uVar;
        this.f246918c = qVar;
    }

    @Override // com.avito.android.rating.details.converter.y
    @Y61.k
    public final RatingDetailsReviewItem a(@Y61.k ReviewEntry reviewEntry, boolean z12, @Y61.k RatingItemsMarginHorizontal.MarginNormal marginNormal) {
        ArrayList arrayList;
        String str = "review:" + reviewEntry.getReviewId();
        Long reviewId = reviewEntry.getReviewId();
        Image avatar = reviewEntry.getAvatar();
        String title = reviewEntry.getTitle();
        String rated = reviewEntry.getRated();
        BaseRatingReviewItem.ReviewStatus reviewStatusA = this.f246916a.a(reviewEntry.getStatus());
        String rejectMessage = L.f(reviewEntry.getStatus(), "declined") ? reviewEntry.getRejectMessage() : reviewEntry.getStatusText();
        AttributedText attributedStatusText = reviewEntry.getAttributedStatusText();
        Float score = reviewEntry.getScore();
        String stageTitle = reviewEntry.getStageTitle();
        String itemTitle = reviewEntry.getItemTitle();
        String deliveryTitle = reviewEntry.getDeliveryTitle();
        List<TnsGalleryImage> images = reviewEntry.getImages();
        List<TextSection> textSections = reviewEntry.getTextSections();
        if (textSections != null) {
            List<TextSection> list = textSections;
            ArrayList arrayList2 = new ArrayList(C42745f0.q(list, 10));
            for (TextSection textSection : list) {
                arrayList2.add(new BaseRatingReviewItem.ReviewTextSection(textSection.getTitle(), textSection.getText(), null, false, 12, null));
            }
            arrayList = arrayList2;
        } else {
            arrayList = null;
        }
        return new RatingDetailsReviewItem(str, reviewId, avatar, title, rated, null, reviewStatusA, rejectMessage, attributedStatusText, score, stageTitle, itemTitle, deliveryTitle, images, arrayList, this.f246917b.a(reviewEntry.getAnswer(), null), this.f246918c.a(reviewEntry.getActions()), marginNormal, false, false, z12, reviewEntry.getAnalyticalParams(), Boolean.TRUE, 786464, null);
    }
}
