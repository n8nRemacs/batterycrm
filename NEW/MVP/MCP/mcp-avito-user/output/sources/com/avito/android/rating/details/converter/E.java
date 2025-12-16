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
import kotlin.Q;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;

/* compiled from: RatingDetailsReviewConverter.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/rating/details/converter/E;", "Lcom/avito/android/rating/details/converter/y;", "_avito_rating_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class E extends y {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final A f246913a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final u f246914b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final q f246915c;

    public E(@Y61.k A a12, @Y61.k u uVar, @Y61.k q qVar) {
        this.f246913a = a12;
        this.f246914b = uVar;
        this.f246915c = qVar;
    }

    @Override // com.avito.android.rating.details.converter.y
    @Y61.k
    public final RatingDetailsReviewItem a(@Y61.k ReviewEntry reviewEntry, boolean z12, @Y61.k RatingItemsMarginHorizontal.MarginNormal marginNormal) {
        Q q12;
        List<ReviewEntry.Action> actions = reviewEntry.getActions();
        ArrayList arrayList = null;
        if (actions != null) {
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            for (Object obj : actions) {
                if (((ReviewEntry.Action) obj).getType() != ReviewEntry.Action.ActionType.REMOVE_ANSWER) {
                    arrayList2.add(obj);
                } else {
                    arrayList3.add(obj);
                }
            }
            q12 = new Q(arrayList2, arrayList3);
        } else {
            q12 = new Q(null, null);
        }
        List list = (List) q12.f406619b;
        List list2 = (List) q12.f406620c;
        String str = "review:" + reviewEntry.getReviewId();
        Long reviewId = reviewEntry.getReviewId();
        Image avatar = reviewEntry.getAvatar();
        String title = reviewEntry.getTitle();
        String rated = reviewEntry.getRated();
        String titleCaption = reviewEntry.getTitleCaption();
        BaseRatingReviewItem.ReviewStatus reviewStatusA = this.f246913a.a(reviewEntry.getStatus());
        AttributedText attributedStatusText = reviewEntry.getAttributedStatusText();
        Float score = reviewEntry.getScore();
        String stageTitle = reviewEntry.getStageTitle();
        String itemTitle = reviewEntry.getItemTitle();
        String deliveryTitle = reviewEntry.getDeliveryTitle();
        List<TnsGalleryImage> images = reviewEntry.getImages();
        List<TextSection> textSections = reviewEntry.getTextSections();
        if (textSections != null) {
            List<TextSection> list3 = textSections;
            arrayList = new ArrayList(C42745f0.q(list3, 10));
            for (TextSection textSection : list3) {
                arrayList.add(new BaseRatingReviewItem.ReviewTextSection(textSection.getTitle(), textSection.getText(), null, false, 12, null));
            }
        }
        ArrayList arrayList4 = arrayList;
        ReviewEntry.Answer answer = reviewEntry.getAnswer();
        q qVar = this.f246915c;
        return new RatingDetailsReviewItem(str, reviewId, avatar, title, rated, titleCaption, reviewStatusA, null, attributedStatusText, score, stageTitle, itemTitle, deliveryTitle, images, arrayList4, this.f246914b.a(answer, qVar.a(list2)), qVar.a(list), marginNormal, false, false, z12, reviewEntry.getAnalyticalParams(), null, 4718592, null);
    }
}
