package ru.mts.biometry.api.entity.state.screen;

import Y61.k;
import Y61.l;
import com.akita.compose.theme.re23.style.C0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ApiOnboardingState.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\b\u0010\nR\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u000b\u0010\t\u001a\u0004\b\f\u0010\n¨\u0006\r"}, d2 = {"Lru/mts/biometry/api/entity/state/screen/ApiOnboardingUiSettings;", "", "", "icon", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "", "isPrivacyPolicyEnabled", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "isRecommendationButtonEnabled", "b", "api_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class ApiOnboardingUiSettings {

    @l
    private final String icon;

    @l
    private final Boolean isPrivacyPolicyEnabled;

    @l
    private final Boolean isRecommendationButtonEnabled;

    @l
    /* renamed from: a, reason: from getter */
    public final String getIcon() {
        return this.icon;
    }

    @l
    /* renamed from: b, reason: from getter */
    public final Boolean getIsRecommendationButtonEnabled() {
        return this.isRecommendationButtonEnabled;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ApiOnboardingUiSettings)) {
            return false;
        }
        ApiOnboardingUiSettings apiOnboardingUiSettings = (ApiOnboardingUiSettings) obj;
        return L.f(this.icon, apiOnboardingUiSettings.icon) && L.f(this.isPrivacyPolicyEnabled, apiOnboardingUiSettings.isPrivacyPolicyEnabled) && L.f(this.isRecommendationButtonEnabled, apiOnboardingUiSettings.isRecommendationButtonEnabled);
    }

    public final int hashCode() {
        String str = this.icon;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Boolean bool = this.isPrivacyPolicyEnabled;
        int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.isRecommendationButtonEnabled;
        return iHashCode2 + (bool2 != null ? bool2.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ApiOnboardingUiSettings(icon=");
        sb2.append(this.icon);
        sb2.append(", isPrivacyPolicyEnabled=");
        sb2.append(this.isPrivacyPolicyEnabled);
        sb2.append(", isRecommendationButtonEnabled=");
        return C0.g(sb2, this.isRecommendationButtonEnabled, ')');
    }
}
