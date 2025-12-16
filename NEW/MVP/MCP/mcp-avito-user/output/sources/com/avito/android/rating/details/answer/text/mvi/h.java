package com.avito.android.rating.details.answer.text.mvi;

import com.avito.android.arch.mvi.t;
import com.avito.android.rating.details.answer.text.mvi.entity.RatingAddAnswerTextInternalAction;
import javax.inject.Inject;
import kotlin.Metadata;
import xg0.InterfaceC49942b;

/* compiled from: RatingAddAnswerTextOneTimeEventProducer.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/rating/details/answer/text/mvi/h;", "Lcom/avito/android/arch/mvi/t;", "Lcom/avito/android/rating/details/answer/text/mvi/entity/RatingAddAnswerTextInternalAction;", "Lxg0/b;", "<init>", "()V", "_avito_rating_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class h implements t<RatingAddAnswerTextInternalAction, InterfaceC49942b> {
    @Inject
    public h() {
    }

    @Override // com.avito.android.arch.mvi.t
    public final InterfaceC49942b b(RatingAddAnswerTextInternalAction ratingAddAnswerTextInternalAction) {
        RatingAddAnswerTextInternalAction ratingAddAnswerTextInternalAction2 = ratingAddAnswerTextInternalAction;
        if (ratingAddAnswerTextInternalAction2.equals(RatingAddAnswerTextInternalAction.ShowKeyboard.f246880b)) {
            return InterfaceC49942b.c.f442602a;
        }
        if (ratingAddAnswerTextInternalAction2.equals(RatingAddAnswerTextInternalAction.HideKeyboard.f246879b)) {
            return InterfaceC49942b.a.f442600a;
        }
        if (ratingAddAnswerTextInternalAction2 instanceof RatingAddAnswerTextInternalAction.Continue) {
            return new InterfaceC49942b.C12876b(((RatingAddAnswerTextInternalAction.Continue) ratingAddAnswerTextInternalAction2).f246878b);
        }
        return null;
    }
}
