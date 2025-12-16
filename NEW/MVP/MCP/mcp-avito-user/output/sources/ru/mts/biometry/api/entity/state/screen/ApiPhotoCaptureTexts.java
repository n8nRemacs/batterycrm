package ru.mts.biometry.api.entity.state.screen;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ApiPhotoCaptureState.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0011\b\u0086\b\u0018\u00002\u00020\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0004\u001a\u0004\b\b\u0010\u0006R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u0004\u001a\u0004\b\n\u0010\u0006R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0004\u001a\u0004\b\f\u0010\u0006R\u0019\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u0004\u001a\u0004\b\u000e\u0010\u0006R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0004\u001a\u0004\b\u0010\u0010\u0006R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0004\u001a\u0004\b\u0012\u0010\u0006¨\u0006\u0013"}, d2 = {"Lru/mts/biometry/api/entity/state/screen/ApiPhotoCaptureTexts;", "", "", "languageTag", "Ljava/lang/String;", "getLanguageTag", "()Ljava/lang/String;", "navBarText", "a", "photoPageText", "d", "photoPageDescription", "c", "recognitionProcessingPageText", "e", "recommendations", "f", "okPageText", "b", "api_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class ApiPhotoCaptureTexts {

    @k
    private final String languageTag;

    @l
    private final String navBarText;

    @l
    private final String okPageText;

    @l
    private final String photoPageDescription;

    @l
    private final String photoPageText;

    @l
    private final String recognitionProcessingPageText;

    @l
    private final String recommendations;

    @l
    /* renamed from: a, reason: from getter */
    public final String getNavBarText() {
        return this.navBarText;
    }

    @l
    /* renamed from: b, reason: from getter */
    public final String getOkPageText() {
        return this.okPageText;
    }

    @l
    /* renamed from: c, reason: from getter */
    public final String getPhotoPageDescription() {
        return this.photoPageDescription;
    }

    @l
    /* renamed from: d, reason: from getter */
    public final String getPhotoPageText() {
        return this.photoPageText;
    }

    @l
    /* renamed from: e, reason: from getter */
    public final String getRecognitionProcessingPageText() {
        return this.recognitionProcessingPageText;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ApiPhotoCaptureTexts)) {
            return false;
        }
        ApiPhotoCaptureTexts apiPhotoCaptureTexts = (ApiPhotoCaptureTexts) obj;
        return L.f(this.languageTag, apiPhotoCaptureTexts.languageTag) && L.f(this.navBarText, apiPhotoCaptureTexts.navBarText) && L.f(this.photoPageText, apiPhotoCaptureTexts.photoPageText) && L.f(this.photoPageDescription, apiPhotoCaptureTexts.photoPageDescription) && L.f(this.recognitionProcessingPageText, apiPhotoCaptureTexts.recognitionProcessingPageText) && L.f(this.recommendations, apiPhotoCaptureTexts.recommendations) && L.f(this.okPageText, apiPhotoCaptureTexts.okPageText);
    }

    @l
    /* renamed from: f, reason: from getter */
    public final String getRecommendations() {
        return this.recommendations;
    }

    public final int hashCode() {
        int iHashCode = this.languageTag.hashCode() * 31;
        String str = this.navBarText;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.photoPageText;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.photoPageDescription;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.recognitionProcessingPageText;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.recommendations;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.okPageText;
        return iHashCode6 + (str6 != null ? str6.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ApiPhotoCaptureTexts(languageTag=");
        sb2.append(this.languageTag);
        sb2.append(", navBarText=");
        sb2.append(this.navBarText);
        sb2.append(", photoPageText=");
        sb2.append(this.photoPageText);
        sb2.append(", photoPageDescription=");
        sb2.append(this.photoPageDescription);
        sb2.append(", recognitionProcessingPageText=");
        sb2.append(this.recognitionProcessingPageText);
        sb2.append(", recommendations=");
        sb2.append(this.recommendations);
        sb2.append(", okPageText=");
        return C22026a.c(sb2, this.okPageText, ')');
    }
}
