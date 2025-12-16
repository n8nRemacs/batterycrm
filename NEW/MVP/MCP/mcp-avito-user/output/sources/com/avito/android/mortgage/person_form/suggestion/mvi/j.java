package com.avito.android.mortgage.person_form.suggestion.mvi;

import H00.b;
import androidx.compose.runtime.internal.P;
import com.avito.android.arch.mvi.t;
import com.avito.android.mortgage.person_form.suggestion.model.SuggestionResult;
import com.avito.android.mortgage.person_form.suggestion.mvi.entity.SuggestionInternalAction;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: SuggestionOneTimeEventProducer.kt */
@P
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/mortgage/person_form/suggestion/mvi/j;", "Lcom/avito/android/arch/mvi/t;", "Lcom/avito/android/mortgage/person_form/suggestion/mvi/entity/SuggestionInternalAction;", "LH00/b;", "<init>", "()V", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class j implements t<SuggestionInternalAction, H00.b> {
    @Inject
    public j() {
    }

    @Override // com.avito.android.arch.mvi.t
    public final H00.b b(SuggestionInternalAction suggestionInternalAction) {
        SuggestionInternalAction suggestionInternalAction2 = suggestionInternalAction;
        if (suggestionInternalAction2 instanceof SuggestionInternalAction.BackClicked) {
            SuggestionInternalAction.BackClicked backClicked = (SuggestionInternalAction.BackClicked) suggestionInternalAction2;
            return new b.a(new SuggestionResult.SuggestionSelected(backClicked.f201464b, backClicked.f201466d));
        }
        if (!(suggestionInternalAction2 instanceof SuggestionInternalAction.FillByHandsClicked)) {
            return null;
        }
        SuggestionInternalAction.FillByHandsClicked fillByHandsClicked = (SuggestionInternalAction.FillByHandsClicked) suggestionInternalAction2;
        return new b.a(new SuggestionResult.FillByHandsSelected(fillByHandsClicked.f201468b, fillByHandsClicked.f201469c));
    }
}
