package com.avito.android.rating_form.step.mvi;

import com.avito.android.rating_form.step.mvi.entity.RatingFormStepInternalAction;
import ih0.InterfaceC41403b;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: RatingFormStepOneTimeEventProducer.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/rating_form/step/mvi/x;", "Lcom/avito/android/arch/mvi/t;", "Lcom/avito/android/rating_form/step/mvi/entity/RatingFormStepInternalAction;", "Lih0/b;", "<init>", "()V", "_avito_rating-form_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class x implements com.avito.android.arch.mvi.t<RatingFormStepInternalAction, InterfaceC41403b> {
    @Inject
    public x() {
    }

    @Override // com.avito.android.arch.mvi.t
    public final InterfaceC41403b b(RatingFormStepInternalAction ratingFormStepInternalAction) {
        RatingFormStepInternalAction ratingFormStepInternalAction2 = ratingFormStepInternalAction;
        if (ratingFormStepInternalAction2 instanceof RatingFormStepInternalAction.StartSelectBottomSheet) {
            return new InterfaceC41403b.j(((RatingFormStepInternalAction.StartSelectBottomSheet) ratingFormStepInternalAction2).f249587b);
        }
        if (ratingFormStepInternalAction2 instanceof RatingFormStepInternalAction.StartAddressScreen) {
            RatingFormStepInternalAction.StartAddressScreen startAddressScreen = (RatingFormStepInternalAction.StartAddressScreen) ratingFormStepInternalAction2;
            return new InterfaceC41403b.h(startAddressScreen.f249583b, startAddressScreen.f249584c);
        }
        if (ratingFormStepInternalAction2 instanceof RatingFormStepInternalAction.StartDevelopmentScreen) {
            RatingFormStepInternalAction.StartDevelopmentScreen startDevelopmentScreen = (RatingFormStepInternalAction.StartDevelopmentScreen) ratingFormStepInternalAction2;
            return new InterfaceC41403b.i(startDevelopmentScreen.f249585b, startDevelopmentScreen.f249586c);
        }
        if (ratingFormStepInternalAction2 instanceof RatingFormStepInternalAction.OpenUrl) {
            return new InterfaceC41403b.c(((RatingFormStepInternalAction.OpenUrl) ratingFormStepInternalAction2).f249576b);
        }
        if (ratingFormStepInternalAction2 instanceof RatingFormStepInternalAction.OpenDeeplink) {
            return new InterfaceC41403b.C11386b(((RatingFormStepInternalAction.OpenDeeplink) ratingFormStepInternalAction2).f249575b);
        }
        if (ratingFormStepInternalAction2 instanceof RatingFormStepInternalAction.ShowErrorToast) {
            RatingFormStepInternalAction.ShowErrorToast showErrorToast = (RatingFormStepInternalAction.ShowErrorToast) ratingFormStepInternalAction2;
            return new InterfaceC41403b.f(showErrorToast.f249579b, showErrorToast.f249580c);
        }
        if (ratingFormStepInternalAction2 instanceof RatingFormStepInternalAction.ShowDialog) {
            return new InterfaceC41403b.e(((RatingFormStepInternalAction.ShowDialog) ratingFormStepInternalAction2).f249578b);
        }
        if (ratingFormStepInternalAction2 instanceof RatingFormStepInternalAction.RequestFocus) {
            return new InterfaceC41403b.d(((RatingFormStepInternalAction.RequestFocus) ratingFormStepInternalAction2).f249577b);
        }
        if (ratingFormStepInternalAction2 instanceof RatingFormStepInternalAction.ShowFilePicker) {
            RatingFormStepInternalAction.ShowFilePicker showFilePicker = (RatingFormStepInternalAction.ShowFilePicker) ratingFormStepInternalAction2;
            return new InterfaceC41403b.g(showFilePicker.f249581b, showFilePicker.f249582c);
        }
        if (ratingFormStepInternalAction2 instanceof RatingFormStepInternalAction.Close) {
            return InterfaceC41403b.a.f398655a;
        }
        if (ratingFormStepInternalAction2 instanceof RatingFormStepInternalAction.Content ? true : ratingFormStepInternalAction2.equals(RatingFormStepInternalAction.Empty.f249573b) ? true : ratingFormStepInternalAction2 instanceof RatingFormStepInternalAction.FinishButton ? true : ratingFormStepInternalAction2 instanceof RatingFormStepInternalAction.ButtonList ? true : ratingFormStepInternalAction2 instanceof RatingFormStepInternalAction.UpdateItems ? true : ratingFormStepInternalAction2 instanceof RatingFormStepInternalAction.UpdateFiles ? true : ratingFormStepInternalAction2 instanceof RatingFormStepInternalAction.ChangeRedesignDisclaimerVisibility) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }
}
