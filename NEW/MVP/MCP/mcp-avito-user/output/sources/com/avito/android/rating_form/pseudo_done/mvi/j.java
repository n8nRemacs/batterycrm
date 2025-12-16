package com.avito.android.rating_form.pseudo_done.mvi;

import com.avito.android.arch.mvi.t;
import com.avito.android.rating_form.pseudo_done.mvi.entity.RatingFormPseudoDoneInternalAction;
import eh0.InterfaceC40106b;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: RatingFormPseudoDoneOneTimeEventProducer.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/rating_form/pseudo_done/mvi/j;", "Lcom/avito/android/arch/mvi/t;", "Lcom/avito/android/rating_form/pseudo_done/mvi/entity/RatingFormPseudoDoneInternalAction;", "Leh0/b;", "<init>", "()V", "_avito_rating-form_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class j implements t<RatingFormPseudoDoneInternalAction, InterfaceC40106b> {
    @Inject
    public j() {
    }

    @Override // com.avito.android.arch.mvi.t
    public final InterfaceC40106b b(RatingFormPseudoDoneInternalAction ratingFormPseudoDoneInternalAction) {
        RatingFormPseudoDoneInternalAction ratingFormPseudoDoneInternalAction2 = ratingFormPseudoDoneInternalAction;
        if (ratingFormPseudoDoneInternalAction2 instanceof RatingFormPseudoDoneInternalAction.Close) {
            return InterfaceC40106b.a.f395317a;
        }
        if (ratingFormPseudoDoneInternalAction2 instanceof RatingFormPseudoDoneInternalAction.Empty) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }
}
