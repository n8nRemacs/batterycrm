package ru.mts.biometry.api.entity.config;

import Y61.k;
import Y61.l;
import com.akita.compose.theme.re23.style.C0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ApiConfigSettings.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0004\u001a\u0004\b\b\u0010\u0006R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u0004\u001a\u0004\b\n\u0010\u0006R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0004\u001a\u0004\b\u0011\u0010\u0006¨\u0006\u0012"}, d2 = {"Lru/mts/biometry/api/entity/config/ApiConfigSettings;", "", "", "enableBioPassportUploadFromFile", "Ljava/lang/Boolean;", "getEnableBioPassportUploadFromFile", "()Ljava/lang/Boolean;", "esiaErrorText", "getEsiaErrorText", "enableBioOnboardingPage", "getEnableBioOnboardingPage", "", "hologramsCheckPhotoCount", "Ljava/lang/Integer;", "getHologramsCheckPhotoCount", "()Ljava/lang/Integer;", "enableDocumentRecognitionPhotoshopCheck", "getEnableDocumentRecognitionPhotoshopCheck", "api_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class ApiConfigSettings {

    @l
    private final Boolean enableBioOnboardingPage;

    @l
    private final Boolean enableBioPassportUploadFromFile;

    @l
    private final Boolean enableDocumentRecognitionPhotoshopCheck;

    @l
    private final Boolean esiaErrorText;

    @l
    private final Integer hologramsCheckPhotoCount;

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ApiConfigSettings)) {
            return false;
        }
        ApiConfigSettings apiConfigSettings = (ApiConfigSettings) obj;
        return L.f(this.enableBioPassportUploadFromFile, apiConfigSettings.enableBioPassportUploadFromFile) && L.f(this.esiaErrorText, apiConfigSettings.esiaErrorText) && L.f(this.enableBioOnboardingPage, apiConfigSettings.enableBioOnboardingPage) && L.f(this.hologramsCheckPhotoCount, apiConfigSettings.hologramsCheckPhotoCount) && L.f(this.enableDocumentRecognitionPhotoshopCheck, apiConfigSettings.enableDocumentRecognitionPhotoshopCheck);
    }

    public final int hashCode() {
        Boolean bool = this.enableBioPassportUploadFromFile;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Boolean bool2 = this.esiaErrorText;
        int iHashCode2 = (iHashCode + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.enableBioOnboardingPage;
        int iHashCode3 = (iHashCode2 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Integer num = this.hologramsCheckPhotoCount;
        int iHashCode4 = (iHashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        Boolean bool4 = this.enableDocumentRecognitionPhotoshopCheck;
        return iHashCode4 + (bool4 != null ? bool4.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ApiConfigSettings(enableBioPassportUploadFromFile=");
        sb2.append(this.enableBioPassportUploadFromFile);
        sb2.append(", esiaErrorText=");
        sb2.append(this.esiaErrorText);
        sb2.append(", enableBioOnboardingPage=");
        sb2.append(this.enableBioOnboardingPage);
        sb2.append(", hologramsCheckPhotoCount=");
        sb2.append(this.hologramsCheckPhotoCount);
        sb2.append(", enableDocumentRecognitionPhotoshopCheck=");
        return C0.g(sb2, this.enableDocumentRecognitionPhotoshopCheck, ')');
    }
}
