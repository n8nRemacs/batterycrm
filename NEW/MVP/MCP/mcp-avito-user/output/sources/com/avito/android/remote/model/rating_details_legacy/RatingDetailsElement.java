package com.avito.android.remote.model.rating_details_legacy;

import Y61.k;
import android.os.Parcelable;
import kotlin.Metadata;

/* compiled from: RatingDetailsElement.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016\u0082\u0001\u0005\u0004\u0005\u0006\u0007\b¨\u0006\t"}, d2 = {"Lcom/avito/android/remote/model/rating_details_legacy/RatingDetailsElement;", "Landroid/os/Parcelable;", "describeContents", "", "Lcom/avito/android/remote/model/rating_details_legacy/ActionElement;", "Lcom/avito/android/remote/model/rating_details_legacy/ButtonElement;", "Lcom/avito/android/remote/model/rating_details_legacy/CommentElement;", "Lcom/avito/android/remote/model/rating_details_legacy/RatingScoreElement;", "Lcom/avito/android/remote/model/rating_details_legacy/TextElement;", "_avito-discouraged_avito-network_rating-details"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public interface RatingDetailsElement extends Parcelable {

    /* compiled from: RatingDetailsElement.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class DefaultImpls {
        public static int describeContents(@k RatingDetailsElement ratingDetailsElement) {
            return 0;
        }
    }

    @Override // android.os.Parcelable
    int describeContents();
}
