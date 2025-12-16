package XE0;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.travel_onboarding.generated.api.api_1_travel_onboarding_get.OnboardingButtonsCloseButton;
import com.avito.android.travel_onboarding.generated.api.api_1_travel_onboarding_get.OnboardingButtonsRedirectButton;
import kotlin.Metadata;

/* compiled from: Api1TravelOnboardingGetResponse.kt */
@P
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"LXE0/c;", "", "Lcom/avito/android/travel_onboarding/generated/api/api_1_travel_onboarding_get/OnboardingButtonsCloseButton;", "closeButton", "Lcom/avito/android/travel_onboarding/generated/api/api_1_travel_onboarding_get/OnboardingButtonsRedirectButton;", "redirectButton", "<init>", "(Lcom/avito/android/travel_onboarding/generated/api/api_1_travel_onboarding_get/OnboardingButtonsCloseButton;Lcom/avito/android/travel_onboarding/generated/api/api_1_travel_onboarding_get/OnboardingButtonsRedirectButton;)V", "Lcom/avito/android/travel_onboarding/generated/api/api_1_travel_onboarding_get/OnboardingButtonsCloseButton;", "a", "()Lcom/avito/android/travel_onboarding/generated/api/api_1_travel_onboarding_get/OnboardingButtonsCloseButton;", "Lcom/avito/android/travel_onboarding/generated/api/api_1_travel_onboarding_get/OnboardingButtonsRedirectButton;", "b", "()Lcom/avito/android/travel_onboarding/generated/api/api_1_travel_onboarding_get/OnboardingButtonsRedirectButton;", "_avito_travel-onboarding_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class c {

    @com.google.gson.annotations.c("closeButton")
    @k
    private final OnboardingButtonsCloseButton closeButton;

    @com.google.gson.annotations.c("redirectButton")
    @l
    private final OnboardingButtonsRedirectButton redirectButton;

    public c(@k OnboardingButtonsCloseButton onboardingButtonsCloseButton, @l OnboardingButtonsRedirectButton onboardingButtonsRedirectButton) {
        this.closeButton = onboardingButtonsCloseButton;
        this.redirectButton = onboardingButtonsRedirectButton;
    }

    @k
    /* renamed from: a, reason: from getter */
    public final OnboardingButtonsCloseButton getCloseButton() {
        return this.closeButton;
    }

    @l
    /* renamed from: b, reason: from getter */
    public final OnboardingButtonsRedirectButton getRedirectButton() {
        return this.redirectButton;
    }
}
