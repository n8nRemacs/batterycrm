package com.avito.android.onboarding.dialog.mvi;

import C40.b;
import com.avito.android.arch.mvi.t;
import com.avito.android.onboarding.dialog.mvi.entity.OnboardingDialogInternalAction;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: OnboardingDialogOneTimeEventProducer.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/onboarding/dialog/mvi/p;", "Lcom/avito/android/arch/mvi/t;", "Lcom/avito/android/onboarding/dialog/mvi/entity/OnboardingDialogInternalAction;", "LC40/b;", "<init>", "()V", "_avito_onboarding_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class p implements t<OnboardingDialogInternalAction, C40.b> {
    @Inject
    public p() {
    }

    @Override // com.avito.android.arch.mvi.t
    public final C40.b b(OnboardingDialogInternalAction onboardingDialogInternalAction) {
        C40.b iVar;
        OnboardingDialogInternalAction onboardingDialogInternalAction2 = onboardingDialogInternalAction;
        if (onboardingDialogInternalAction2.equals(OnboardingDialogInternalAction.DismissDialog.f208892b)) {
            return b.a.f1917a;
        }
        if (onboardingDialogInternalAction2.equals(OnboardingDialogInternalAction.ShowPreviousQuizPage.f208902b)) {
            return b.h.f1924a;
        }
        if (onboardingDialogInternalAction2.equals(OnboardingDialogInternalAction.ShowNextQuizPage.f208901b)) {
            return b.g.f1923a;
        }
        if (onboardingDialogInternalAction2.equals(OnboardingDialogInternalAction.ShowNextCarouselPage.f208900b)) {
            return b.f.f1922a;
        }
        if (onboardingDialogInternalAction2 instanceof OnboardingDialogInternalAction.ShowMessage) {
            iVar = new b.e(((OnboardingDialogInternalAction.ShowMessage) onboardingDialogInternalAction2).f208899b);
        } else {
            if (onboardingDialogInternalAction2 instanceof OnboardingDialogInternalAction.ShowError) {
                String message = ((OnboardingDialogInternalAction.ShowError) onboardingDialogInternalAction2).f208898b.getMessage();
                if (message != null) {
                    iVar = new b.d(message);
                }
                return null;
            }
            if (onboardingDialogInternalAction2 instanceof OnboardingDialogInternalAction.GoToUri) {
                iVar = new b.C0089b(((OnboardingDialogInternalAction.GoToUri) onboardingDialogInternalAction2).f208893b);
            } else {
                if (!(onboardingDialogInternalAction2 instanceof OnboardingDialogInternalAction.GoToUriWithoutClosing)) {
                    if (onboardingDialogInternalAction2 instanceof OnboardingDialogInternalAction.ShowToastAndClose) {
                        iVar = new b.i(((OnboardingDialogInternalAction.ShowToastAndClose) onboardingDialogInternalAction2).f208903b);
                    }
                    return null;
                }
                iVar = new b.c(((OnboardingDialogInternalAction.GoToUriWithoutClosing) onboardingDialogInternalAction2).f208894b);
            }
        }
        return iVar;
    }
}
