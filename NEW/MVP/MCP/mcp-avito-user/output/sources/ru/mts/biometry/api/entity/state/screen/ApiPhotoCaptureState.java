package ru.mts.biometry.api.entity.state.screen;

import Y61.k;
import Y61.l;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ApiPhotoCaptureState.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0086\b\u0018\u00002\u00020\u0001B9\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Lru/mts/biometry/api/entity/state/screen/ApiPhotoCaptureState;", "", "", "type", "", "ratio", "", "photoCount", "Lru/mts/biometry/api/entity/state/screen/ApiPhotoCaptureUiSettings;", "uiSettings", "Lru/mts/biometry/api/entity/state/screen/ApiPhotoCaptureTexts;", "texts", "<init>", "(Ljava/lang/String;Ljava/lang/Float;Ljava/lang/Integer;Lru/mts/biometry/api/entity/state/screen/ApiPhotoCaptureUiSettings;Lru/mts/biometry/api/entity/state/screen/ApiPhotoCaptureTexts;)V", "Ljava/lang/String;", "d", "()Ljava/lang/String;", "Ljava/lang/Float;", "b", "()Ljava/lang/Float;", "Ljava/lang/Integer;", "a", "()Ljava/lang/Integer;", "Lru/mts/biometry/api/entity/state/screen/ApiPhotoCaptureUiSettings;", "getUiSettings", "()Lru/mts/biometry/api/entity/state/screen/ApiPhotoCaptureUiSettings;", "Lru/mts/biometry/api/entity/state/screen/ApiPhotoCaptureTexts;", "c", "()Lru/mts/biometry/api/entity/state/screen/ApiPhotoCaptureTexts;", "api_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class ApiPhotoCaptureState {

    @l
    private final Integer photoCount;

    @l
    private final Float ratio;

    @c("i18n")
    @l
    private final ApiPhotoCaptureTexts texts;

    @l
    private final String type;

    @l
    private final ApiPhotoCaptureUiSettings uiSettings;

    public ApiPhotoCaptureState(@l String str, @l Float f12, @l Integer num, @l ApiPhotoCaptureUiSettings apiPhotoCaptureUiSettings, @l ApiPhotoCaptureTexts apiPhotoCaptureTexts) {
        this.type = str;
        this.ratio = f12;
        this.photoCount = num;
        this.uiSettings = apiPhotoCaptureUiSettings;
        this.texts = apiPhotoCaptureTexts;
    }

    @l
    /* renamed from: a, reason: from getter */
    public final Integer getPhotoCount() {
        return this.photoCount;
    }

    @l
    /* renamed from: b, reason: from getter */
    public final Float getRatio() {
        return this.ratio;
    }

    @l
    /* renamed from: c, reason: from getter */
    public final ApiPhotoCaptureTexts getTexts() {
        return this.texts;
    }

    @l
    /* renamed from: d, reason: from getter */
    public final String getType() {
        return this.type;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ApiPhotoCaptureState)) {
            return false;
        }
        ApiPhotoCaptureState apiPhotoCaptureState = (ApiPhotoCaptureState) obj;
        return L.f(this.type, apiPhotoCaptureState.type) && L.f(this.ratio, apiPhotoCaptureState.ratio) && L.f(this.photoCount, apiPhotoCaptureState.photoCount) && L.f(this.uiSettings, apiPhotoCaptureState.uiSettings) && L.f(this.texts, apiPhotoCaptureState.texts);
    }

    public final int hashCode() {
        String str = this.type;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Float f12 = this.ratio;
        int iHashCode2 = (iHashCode + (f12 == null ? 0 : f12.hashCode())) * 31;
        Integer num = this.photoCount;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        ApiPhotoCaptureUiSettings apiPhotoCaptureUiSettings = this.uiSettings;
        int iHashCode4 = (iHashCode3 + (apiPhotoCaptureUiSettings == null ? 0 : apiPhotoCaptureUiSettings.hashCode())) * 31;
        ApiPhotoCaptureTexts apiPhotoCaptureTexts = this.texts;
        return iHashCode4 + (apiPhotoCaptureTexts != null ? apiPhotoCaptureTexts.hashCode() : 0);
    }

    @k
    public final String toString() {
        return "ApiPhotoCaptureState(type=" + this.type + ", ratio=" + this.ratio + ", photoCount=" + this.photoCount + ", uiSettings=" + this.uiSettings + ", texts=" + this.texts + ')';
    }
}
