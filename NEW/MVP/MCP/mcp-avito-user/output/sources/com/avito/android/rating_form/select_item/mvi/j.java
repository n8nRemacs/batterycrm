package com.avito.android.rating_form.select_item.mvi;

import com.avito.android.arch.mvi.t;
import com.avito.android.rating_form.select_item.mvi.entity.RatingFormSelectItemInternalAction;
import fh0.c;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: RatingFormSelectItemOneTimeEventProducer.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/rating_form/select_item/mvi/j;", "Lcom/avito/android/arch/mvi/t;", "Lcom/avito/android/rating_form/select_item/mvi/entity/RatingFormSelectItemInternalAction;", "Lfh0/c;", "<init>", "()V", "_avito_rating-form_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class j implements t<RatingFormSelectItemInternalAction, fh0.c> {
    @Inject
    public j() {
    }

    @Override // com.avito.android.arch.mvi.t
    public final fh0.c b(RatingFormSelectItemInternalAction ratingFormSelectItemInternalAction) {
        RatingFormSelectItemInternalAction ratingFormSelectItemInternalAction2 = ratingFormSelectItemInternalAction;
        if (!(ratingFormSelectItemInternalAction2 instanceof RatingFormSelectItemInternalAction.ShowErrorToastBar)) {
            return null;
        }
        RatingFormSelectItemInternalAction.ShowErrorToastBar showErrorToastBar = (RatingFormSelectItemInternalAction.ShowErrorToastBar) ratingFormSelectItemInternalAction2;
        return new c.a(showErrorToastBar.f249088b, showErrorToastBar.f249089c, showErrorToastBar.f249090d, showErrorToastBar.f249091e, showErrorToastBar.f249092f);
    }
}
