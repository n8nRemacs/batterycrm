package com.avito.android.rating.details.answer.photo.mvi;

import com.avito.android.arch.mvi.u;
import com.avito.android.rating.details.answer.photo.mvi.entity.RatingAddAnswerPhotoInternalAction;
import com.avito.android.rating.details.answer.photo.mvi.entity.RatingAddAnswerPhotoState;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: RatingAddAnswerPhotoReducer.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/rating/details/answer/photo/mvi/m;", "Lcom/avito/android/arch/mvi/u;", "Lcom/avito/android/rating/details/answer/photo/mvi/entity/RatingAddAnswerPhotoInternalAction;", "Lcom/avito/android/rating/details/answer/photo/mvi/entity/RatingAddAnswerPhotoState;", "<init>", "()V", "_avito_rating_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class m implements u<RatingAddAnswerPhotoInternalAction, RatingAddAnswerPhotoState> {
    @Inject
    public m() {
    }

    @Override // com.avito.android.arch.mvi.u
    public final RatingAddAnswerPhotoState a(RatingAddAnswerPhotoInternalAction ratingAddAnswerPhotoInternalAction, RatingAddAnswerPhotoState ratingAddAnswerPhotoState) {
        RatingAddAnswerPhotoInternalAction ratingAddAnswerPhotoInternalAction2 = ratingAddAnswerPhotoInternalAction;
        RatingAddAnswerPhotoState ratingAddAnswerPhotoState2 = ratingAddAnswerPhotoState;
        if (ratingAddAnswerPhotoInternalAction2 instanceof RatingAddAnswerPhotoInternalAction.ImagesLoaded) {
            return new RatingAddAnswerPhotoState(((RatingAddAnswerPhotoInternalAction.ImagesLoaded) ratingAddAnswerPhotoInternalAction2).f246727b, false, true);
        }
        return ratingAddAnswerPhotoInternalAction2.equals(RatingAddAnswerPhotoInternalAction.LoadingImages.f246728b) ? true : ratingAddAnswerPhotoInternalAction2 instanceof RatingAddAnswerPhotoInternalAction.LoadingAnswer ? RatingAddAnswerPhotoState.a(ratingAddAnswerPhotoState2, true, false) : ratingAddAnswerPhotoInternalAction2.equals(RatingAddAnswerPhotoInternalAction.HideLoading.f246725b) ? RatingAddAnswerPhotoState.a(ratingAddAnswerPhotoState2, false, true) : ratingAddAnswerPhotoState2;
    }
}
