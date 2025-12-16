package com.avito.android.rating.details.answer.text.mvi;

import com.avito.android.arch.mvi.u;
import com.avito.android.rating.details.answer.text.RatingAddAnswerTextValidationInteractor;
import com.avito.android.rating.details.answer.text.mvi.entity.RatingAddAnswerTextInternalAction;
import com.avito.android.rating.details.answer.text.mvi.entity.RatingAddAnswerTextState;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: RatingAddAnswerTextReducer.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/rating/details/answer/text/mvi/j;", "Lcom/avito/android/arch/mvi/u;", "Lcom/avito/android/rating/details/answer/text/mvi/entity/RatingAddAnswerTextInternalAction;", "Lcom/avito/android/rating/details/answer/text/mvi/entity/RatingAddAnswerTextState;", "<init>", "()V", "_avito_rating_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class j implements u<RatingAddAnswerTextInternalAction, RatingAddAnswerTextState> {
    @Inject
    public j() {
    }

    @Override // com.avito.android.arch.mvi.u
    public final RatingAddAnswerTextState a(RatingAddAnswerTextInternalAction ratingAddAnswerTextInternalAction, RatingAddAnswerTextState ratingAddAnswerTextState) {
        RatingAddAnswerTextInternalAction ratingAddAnswerTextInternalAction2 = ratingAddAnswerTextInternalAction;
        RatingAddAnswerTextState ratingAddAnswerTextState2 = ratingAddAnswerTextState;
        if (!(ratingAddAnswerTextInternalAction2 instanceof RatingAddAnswerTextInternalAction.UpdateState)) {
            return ratingAddAnswerTextState2;
        }
        RatingAddAnswerTextInternalAction.UpdateState updateState = (RatingAddAnswerTextInternalAction.UpdateState) ratingAddAnswerTextInternalAction2;
        String str = updateState.f246881b;
        if (str == null) {
            str = ratingAddAnswerTextState2.f246883b;
        }
        RatingAddAnswerTextValidationInteractor.ValidationTextResult validationTextResult = updateState.f246882c;
        if (validationTextResult == null) {
            validationTextResult = ratingAddAnswerTextState2.f246884c;
        }
        return new RatingAddAnswerTextState(str, validationTextResult);
    }
}
