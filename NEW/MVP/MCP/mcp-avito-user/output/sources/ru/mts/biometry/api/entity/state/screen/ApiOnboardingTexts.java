package ru.mts.biometry.api.entity.state.screen;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ApiOnboardingState.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\b\u001a\u0004\b\u000b\u0010\nR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\b\u001a\u0004\b\f\u0010\n¨\u0006\r"}, d2 = {"Lru/mts/biometry/api/entity/state/screen/ApiOnboardingTexts;", "", "", "title", "recommendationShort", "recommendationFull", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "b", "a", "api_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class ApiOnboardingTexts {

    @c("fullRecommendations")
    @l
    private final String recommendationFull;

    @c("shortRecommendations")
    @l
    private final String recommendationShort;

    @l
    private final String title;

    public ApiOnboardingTexts(@l String str, @l String str2, @l String str3) {
        this.title = str;
        this.recommendationShort = str2;
        this.recommendationFull = str3;
    }

    @l
    /* renamed from: a, reason: from getter */
    public final String getRecommendationFull() {
        return this.recommendationFull;
    }

    @l
    /* renamed from: b, reason: from getter */
    public final String getRecommendationShort() {
        return this.recommendationShort;
    }

    @l
    /* renamed from: c, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ApiOnboardingTexts)) {
            return false;
        }
        ApiOnboardingTexts apiOnboardingTexts = (ApiOnboardingTexts) obj;
        return L.f(this.title, apiOnboardingTexts.title) && L.f(this.recommendationShort, apiOnboardingTexts.recommendationShort) && L.f(this.recommendationFull, apiOnboardingTexts.recommendationFull);
    }

    public final int hashCode() {
        String str = this.title;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.recommendationShort;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.recommendationFull;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ApiOnboardingTexts(title=");
        sb2.append(this.title);
        sb2.append(", recommendationShort=");
        sb2.append(this.recommendationShort);
        sb2.append(", recommendationFull=");
        return C22026a.c(sb2, this.recommendationFull, ')');
    }
}
