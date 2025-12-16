package com.avito.android.remote.model.item_reviews;

import Y61.k;
import aW.InterfaceC19825c;
import android.os.Parcelable;
import kotlin.Metadata;

/* compiled from: ItemReviewsEntry.kt */
@InterfaceC19825c
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016\u0082\u0001\u000b\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e¨\u0006\u000f"}, d2 = {"Lcom/avito/android/remote/model/item_reviews/ItemReviewsEntry;", "Landroid/os/Parcelable;", "describeContents", "", "Lcom/avito/android/remote/model/item_reviews/BadgeScoreEntry;", "Lcom/avito/android/remote/model/item_reviews/BuyerReviewEntry;", "Lcom/avito/android/remote/model/item_reviews/GalleryEntry;", "Lcom/avito/android/remote/model/item_reviews/ModelRatingEntry;", "Lcom/avito/android/remote/model/item_reviews/RatingAttributedTextEntry;", "Lcom/avito/android/remote/model/item_reviews/RatingBannerEntry;", "Lcom/avito/android/remote/model/item_reviews/RatingButtonEntry;", "Lcom/avito/android/remote/model/item_reviews/RatingEntry;", "Lcom/avito/android/remote/model/item_reviews/RatingInfoEntry;", "Lcom/avito/android/remote/model/item_reviews/RatingLLMSummaryEntry;", "Lcom/avito/android/remote/model/item_reviews/RatingStatisticEntry;", "_avito-discouraged_avito-api_rating"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public interface ItemReviewsEntry extends Parcelable {

    /* compiled from: ItemReviewsEntry.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class DefaultImpls {
        public static int describeContents(@k ItemReviewsEntry itemReviewsEntry) {
            return 0;
        }
    }

    @Override // android.os.Parcelable
    int describeContents();
}
