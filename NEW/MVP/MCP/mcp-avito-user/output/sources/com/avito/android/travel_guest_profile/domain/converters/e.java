package com.avito.android.travel_guest_profile.domain.converters;

import com.avito.android.rating_ui.reviews.review.BaseRatingReviewItem;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.TnsGalleryImage;
import com.avito.android.remote.model.rating_details_mvi.ReviewEntry;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: TravelGuestProfileRatingAnswerConverter.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/travel_guest_profile/domain/converters/e;", "", "<init>", "()V", "_avito_travel-guest-profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class e {
    @Inject
    public e() {
    }

    @Y61.l
    public static BaseRatingReviewItem.ReviewAnswer a(@Y61.l ReviewEntry.Answer answer, @Y61.l ArrayList arrayList) {
        BaseRatingReviewItem.ReviewAnswer.ReviewAnswerStatus reviewAnswerStatus = null;
        if (answer == null) {
            return null;
        }
        long id2 = answer.getId();
        Image avatar = answer.getAvatar();
        String title = answer.getTitle();
        String titleCaption = answer.getTitleCaption();
        String answered = answer.getAnswered();
        String status = answer.getStatus();
        if (status != null) {
            int iHashCode = status.hashCode();
            if (iHashCode != -2016287450) {
                if (iHashCode != -1422950650) {
                    if (iHashCode == 568196142 && status.equals("declined")) {
                        reviewAnswerStatus = BaseRatingReviewItem.ReviewAnswer.ReviewAnswerStatus.f250320d;
                    }
                } else if (status.equals("active")) {
                    reviewAnswerStatus = BaseRatingReviewItem.ReviewAnswer.ReviewAnswerStatus.f250319c;
                }
            } else if (status.equals("moderation")) {
                reviewAnswerStatus = BaseRatingReviewItem.ReviewAnswer.ReviewAnswerStatus.f250318b;
            }
        }
        BaseRatingReviewItem.ReviewAnswer.ReviewAnswerStatus reviewAnswerStatus2 = reviewAnswerStatus;
        String statusText = answer.getStatusText();
        String rejectMessage = answer.getRejectMessage();
        String text = answer.getText();
        List<TnsGalleryImage> images = answer.getImages();
        Boolean isShop = answer.getIsShop();
        return new BaseRatingReviewItem.ReviewAnswer(Long.valueOf(id2), avatar, title, answered, titleCaption, reviewAnswerStatus2, statusText, rejectMessage, text, images, isShop != null ? isShop.booleanValue() : false, answer.getLink(), arrayList, false, null, 24576, null);
    }
}
