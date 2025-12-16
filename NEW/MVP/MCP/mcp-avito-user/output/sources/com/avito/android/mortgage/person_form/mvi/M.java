package com.avito.android.mortgage.person_form.mvi;

import E00.c;
import com.avito.android.mortgage.api.model.FormItemValueModel;
import com.avito.android.mortgage.api.model.items.form.SuggestFormContentItemValue;
import com.avito.android.mortgage.person_form.mvi.entity.PersonFormInternalAction;
import com.avito.android.mortgage.person_form.suggestion.model.SuggestionArguments;
import com.avito.android.remote.error.ApiError;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: PersonFormOneTimeEventProducer.kt */
@androidx.compose.runtime.internal.P
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/mortgage/person_form/mvi/M;", "Lcom/avito/android/arch/mvi/t;", "Lcom/avito/android/mortgage/person_form/mvi/entity/PersonFormInternalAction;", "LE00/c;", "<init>", "()V", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class M implements com.avito.android.arch.mvi.t<PersonFormInternalAction, E00.c> {
    @Inject
    public M() {
    }

    public static c.j a(ApiError apiError) {
        if (apiError.getMessage().length() <= 0) {
            apiError = new ApiError.UnknownError("Ошибка обработки запроса, попробуйте чуть позже", null, null, 6, null);
        }
        return new c.j(apiError);
    }

    @Override // com.avito.android.arch.mvi.t
    public final E00.c b(PersonFormInternalAction personFormInternalAction) {
        String value;
        PersonFormInternalAction personFormInternalAction2 = personFormInternalAction;
        if (personFormInternalAction2 instanceof PersonFormInternalAction.OpenSelector) {
            return new c.f(((PersonFormInternalAction.OpenSelector) personFormInternalAction2).f201196c);
        }
        if (personFormInternalAction2 instanceof PersonFormInternalAction.GoBack) {
            return c.b.f3657a;
        }
        if (personFormInternalAction2 instanceof PersonFormInternalAction.CloseFlow) {
            return c.a.f3656a;
        }
        if (personFormInternalAction2 instanceof PersonFormInternalAction.LoadingFailed) {
            return a(((PersonFormInternalAction.LoadingFailed) personFormInternalAction2).f201192b);
        }
        if (personFormInternalAction2 instanceof PersonFormInternalAction.UploadingFailed) {
            return a(((PersonFormInternalAction.UploadingFailed) personFormInternalAction2).f201219b);
        }
        if (personFormInternalAction2 instanceof PersonFormInternalAction.FieldUploadingFailed) {
            return a(((PersonFormInternalAction.FieldUploadingFailed) personFormInternalAction2).f201182b);
        }
        if (personFormInternalAction2 instanceof PersonFormInternalAction.ReloadingFailed) {
            return a(((PersonFormInternalAction.ReloadingFailed) personFormInternalAction2).f201204b);
        }
        if (personFormInternalAction2 instanceof PersonFormInternalAction.OpenStep) {
            PersonFormInternalAction.OpenStep openStep = (PersonFormInternalAction.OpenStep) personFormInternalAction2;
            return new c.g(openStep.f201198b, openStep.f201199c);
        }
        String str = null;
        if (!(personFormInternalAction2 instanceof PersonFormInternalAction.OpenSuggestion)) {
            if (personFormInternalAction2 instanceof PersonFormInternalAction.OpenPhoneConfirmationDialog) {
                return new c.e(((PersonFormInternalAction.OpenPhoneConfirmationDialog) personFormInternalAction2).f201194b);
            }
            if (personFormInternalAction2 instanceof PersonFormInternalAction.ScrollStarted) {
                return c.d.f3659a;
            }
            if (personFormInternalAction2 instanceof PersonFormInternalAction.ScrollTo) {
                return new c.i(((PersonFormInternalAction.ScrollTo) personFormInternalAction2).f201208b);
            }
            if (personFormInternalAction2 instanceof PersonFormInternalAction.ShowError) {
                return a(((PersonFormInternalAction.ShowError) personFormInternalAction2).f201210b);
            }
            if (personFormInternalAction2 instanceof PersonFormInternalAction.HandleDeeplink) {
                return new c.C0209c(((PersonFormInternalAction.HandleDeeplink) personFormInternalAction2).f201187b);
            }
            return null;
        }
        PersonFormInternalAction.OpenSuggestion openSuggestion = (PersonFormInternalAction.OpenSuggestion) personFormInternalAction2;
        SuggestFormContentItemValue suggestFormContentItemValue = openSuggestion.f201200b;
        String id2 = suggestFormContentItemValue.getId();
        String title = suggestFormContentItemValue.getTitle();
        FormItemValueModel value2 = suggestFormContentItemValue.getValue();
        if (value2 != null && (value = value2.getValue()) != null && !suggestFormContentItemValue.getIsMasked()) {
            str = value;
        }
        if (str == null) {
            str = "";
        }
        return new c.h(new SuggestionArguments(id2, title, str, suggestFormContentItemValue.getPlaceholder(), suggestFormContentItemValue.getSuggestType(), openSuggestion.f201201c));
    }
}
