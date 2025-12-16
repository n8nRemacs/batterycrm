package ru.mts.biometry.api.entity.state.screen;

import Y61.k;
import Y61.l;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ApiOnboardingState.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lru/mts/biometry/api/entity/state/screen/ApiOnboardingState;", "", "Lru/mts/biometry/api/entity/state/screen/ApiOnboardingUiSettings;", "uiSettings", "Lru/mts/biometry/api/entity/state/screen/ApiOnboardingTexts;", "texts", "<init>", "(Lru/mts/biometry/api/entity/state/screen/ApiOnboardingUiSettings;Lru/mts/biometry/api/entity/state/screen/ApiOnboardingTexts;)V", "Lru/mts/biometry/api/entity/state/screen/ApiOnboardingUiSettings;", "b", "()Lru/mts/biometry/api/entity/state/screen/ApiOnboardingUiSettings;", "Lru/mts/biometry/api/entity/state/screen/ApiOnboardingTexts;", "a", "()Lru/mts/biometry/api/entity/state/screen/ApiOnboardingTexts;", "api_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class ApiOnboardingState {

    @c("i18n")
    @l
    private final ApiOnboardingTexts texts;

    @c("uiSettings")
    @l
    private final ApiOnboardingUiSettings uiSettings;

    public ApiOnboardingState(@l ApiOnboardingUiSettings apiOnboardingUiSettings, @l ApiOnboardingTexts apiOnboardingTexts) {
        this.uiSettings = apiOnboardingUiSettings;
        this.texts = apiOnboardingTexts;
    }

    @l
    /* renamed from: a, reason: from getter */
    public final ApiOnboardingTexts getTexts() {
        return this.texts;
    }

    @l
    /* renamed from: b, reason: from getter */
    public final ApiOnboardingUiSettings getUiSettings() {
        return this.uiSettings;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ApiOnboardingState)) {
            return false;
        }
        ApiOnboardingState apiOnboardingState = (ApiOnboardingState) obj;
        return L.f(this.uiSettings, apiOnboardingState.uiSettings) && L.f(this.texts, apiOnboardingState.texts);
    }

    public final int hashCode() {
        ApiOnboardingUiSettings apiOnboardingUiSettings = this.uiSettings;
        int iHashCode = (apiOnboardingUiSettings == null ? 0 : apiOnboardingUiSettings.hashCode()) * 31;
        ApiOnboardingTexts apiOnboardingTexts = this.texts;
        return iHashCode + (apiOnboardingTexts != null ? apiOnboardingTexts.hashCode() : 0);
    }

    @k
    public final String toString() {
        return "ApiOnboardingState(uiSettings=" + this.uiSettings + ", texts=" + this.texts + ')';
    }
}
