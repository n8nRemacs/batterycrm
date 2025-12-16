package com.avito.android.rating.details.converter;

import com.avito.android.di.InterfaceC30272y;
import com.avito.android.rating.details.adapter.seller.RatingDetailsReviewItem;
import com.avito.android.rating_ui.RatingItemsMarginHorizontal;
import com.avito.android.rating_ui.reviews.review.BaseRatingReviewItem;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.TnsGalleryImage;
import com.avito.android.remote.model.rating_details_mvi.BuyerReviewEntry;
import com.avito.android.remote.model.rating_details_mvi.TextSection;
import com.avito.android.remote.model.text.AttributedText;
import com.squareup.anvil.annotations.ContributesBinding;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: RatingDetailsBuyerReviewConverter.kt */
@s0
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/rating/details/converter/d;", "Lcom/avito/android/rating/details/converter/c;", "_avito_rating_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC30272y
/* renamed from: com.avito.android.rating.details.converter.d, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C34172d implements InterfaceC34171c {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final A f246922a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final q f246923b;

    @Inject
    public C34172d(@Y61.k A a12, @Y61.k q qVar) {
        this.f246922a = a12;
        this.f246923b = qVar;
    }

    @Override // com.avito.android.rating.details.converter.InterfaceC34171c
    @Y61.k
    public final RatingDetailsReviewItem a(@Y61.k BuyerReviewEntry buyerReviewEntry, boolean z12, @Y61.k RatingItemsMarginHorizontal.MarginNormal marginNormal) {
        String str = "review:" + buyerReviewEntry.getId();
        Long id2 = buyerReviewEntry.getId();
        BuyerReviewEntry.Recipient recipient = buyerReviewEntry.getRecipient();
        ArrayList arrayList = null;
        Image avatar = recipient != null ? recipient.getAvatar() : null;
        BuyerReviewEntry.Recipient recipient2 = buyerReviewEntry.getRecipient();
        String title = recipient2 != null ? recipient2.getTitle() : null;
        String createdAt = buyerReviewEntry.getCreatedAt();
        BaseRatingReviewItem.ReviewStatus reviewStatusA = this.f246922a.a(buyerReviewEntry.getStatus());
        String rejectMessage = L.f(buyerReviewEntry.getStatus(), "declined") ? buyerReviewEntry.getRejectMessage() : buyerReviewEntry.getStatusText();
        AttributedText attributedStatusText = buyerReviewEntry.getAttributedStatusText();
        Float score = buyerReviewEntry.getScore();
        String stageTitle = buyerReviewEntry.getStageTitle();
        String itemTitle = buyerReviewEntry.getItemTitle();
        String reviewSubtitle = buyerReviewEntry.getReviewSubtitle();
        List<TnsGalleryImage> images = buyerReviewEntry.getImages();
        List<TextSection> textSections = buyerReviewEntry.getTextSections();
        if (textSections != null) {
            List<TextSection> list = textSections;
            arrayList = new ArrayList(C42745f0.q(list, 10));
            for (TextSection textSection : list) {
                arrayList.add(new BaseRatingReviewItem.ReviewTextSection(textSection.getTitle(), textSection.getText(), null, false, 12, null));
            }
        }
        return new RatingDetailsReviewItem(str, id2, avatar, title, createdAt, null, reviewStatusA, rejectMessage, attributedStatusText, score, stageTitle, itemTitle, reviewSubtitle, images, arrayList, null, this.f246923b.a(buyerReviewEntry.getActions()), marginNormal, false, false, z12, null, null, 4980768, null);
    }
}
