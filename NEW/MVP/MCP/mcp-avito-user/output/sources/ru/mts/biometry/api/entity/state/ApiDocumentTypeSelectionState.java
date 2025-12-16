package ru.mts.biometry.api.entity.state;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import com.google.gson.annotations.c;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ApiDocumentTypeSelectionState.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0086\b\u0018\u00002\u00020\u0001BW\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\u0014\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\t\u0012\u0014\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\r\u0018\u00010\t¢\u0006\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001f\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R%\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\f\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR%\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\r\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u001a\u001a\u0004\b\u001d\u0010\u001c¨\u0006\u001e"}, d2 = {"Lru/mts/biometry/api/entity/state/ApiDocumentTypeSelectionState;", "", "Lru/mts/biometry/api/entity/state/ApiDocumentTypeSelectionUiSettings;", "uiSettings", "Lru/mts/biometry/api/entity/state/ApiDocumentTypeSelectionTexts;", "texts", "", "Lru/mts/biometry/api/entity/state/ApiDocumentType;", "allowedDocumentTypes", "", "", "Lru/mts/biometry/api/entity/state/ApiDocumentCountryLocalized;", "countryDescriptions", "Lru/mts/biometry/api/entity/state/ApiDocumentPropLocalized;", "documentTypeDescriptions", "<init>", "(Lru/mts/biometry/api/entity/state/ApiDocumentTypeSelectionUiSettings;Lru/mts/biometry/api/entity/state/ApiDocumentTypeSelectionTexts;Ljava/util/List;Ljava/util/Map;Ljava/util/Map;)V", "Lru/mts/biometry/api/entity/state/ApiDocumentTypeSelectionUiSettings;", "e", "()Lru/mts/biometry/api/entity/state/ApiDocumentTypeSelectionUiSettings;", "Lru/mts/biometry/api/entity/state/ApiDocumentTypeSelectionTexts;", "d", "()Lru/mts/biometry/api/entity/state/ApiDocumentTypeSelectionTexts;", "Ljava/util/List;", "a", "()Ljava/util/List;", "Ljava/util/Map;", "b", "()Ljava/util/Map;", "c", "api_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class ApiDocumentTypeSelectionState {

    @l
    private final List<ApiDocumentType> allowedDocumentTypes;

    @l
    private final Map<String, ApiDocumentCountryLocalized> countryDescriptions;

    @l
    private final Map<String, ApiDocumentPropLocalized> documentTypeDescriptions;

    @c("i18n")
    @l
    private final ApiDocumentTypeSelectionTexts texts;

    @l
    private final ApiDocumentTypeSelectionUiSettings uiSettings;

    public ApiDocumentTypeSelectionState(@l ApiDocumentTypeSelectionUiSettings apiDocumentTypeSelectionUiSettings, @l ApiDocumentTypeSelectionTexts apiDocumentTypeSelectionTexts, @l List<ApiDocumentType> list, @l Map<String, ApiDocumentCountryLocalized> map, @l Map<String, ApiDocumentPropLocalized> map2) {
        this.uiSettings = apiDocumentTypeSelectionUiSettings;
        this.texts = apiDocumentTypeSelectionTexts;
        this.allowedDocumentTypes = list;
        this.countryDescriptions = map;
        this.documentTypeDescriptions = map2;
    }

    @l
    public final List<ApiDocumentType> a() {
        return this.allowedDocumentTypes;
    }

    @l
    public final Map<String, ApiDocumentCountryLocalized> b() {
        return this.countryDescriptions;
    }

    @l
    public final Map<String, ApiDocumentPropLocalized> c() {
        return this.documentTypeDescriptions;
    }

    @l
    /* renamed from: d, reason: from getter */
    public final ApiDocumentTypeSelectionTexts getTexts() {
        return this.texts;
    }

    @l
    /* renamed from: e, reason: from getter */
    public final ApiDocumentTypeSelectionUiSettings getUiSettings() {
        return this.uiSettings;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ApiDocumentTypeSelectionState)) {
            return false;
        }
        ApiDocumentTypeSelectionState apiDocumentTypeSelectionState = (ApiDocumentTypeSelectionState) obj;
        return L.f(this.uiSettings, apiDocumentTypeSelectionState.uiSettings) && L.f(this.texts, apiDocumentTypeSelectionState.texts) && L.f(this.allowedDocumentTypes, apiDocumentTypeSelectionState.allowedDocumentTypes) && L.f(this.countryDescriptions, apiDocumentTypeSelectionState.countryDescriptions) && L.f(this.documentTypeDescriptions, apiDocumentTypeSelectionState.documentTypeDescriptions);
    }

    public final int hashCode() {
        ApiDocumentTypeSelectionUiSettings apiDocumentTypeSelectionUiSettings = this.uiSettings;
        int iHashCode = (apiDocumentTypeSelectionUiSettings == null ? 0 : apiDocumentTypeSelectionUiSettings.hashCode()) * 31;
        ApiDocumentTypeSelectionTexts apiDocumentTypeSelectionTexts = this.texts;
        int iHashCode2 = (iHashCode + (apiDocumentTypeSelectionTexts == null ? 0 : apiDocumentTypeSelectionTexts.hashCode())) * 31;
        List<ApiDocumentType> list = this.allowedDocumentTypes;
        int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        Map<String, ApiDocumentCountryLocalized> map = this.countryDescriptions;
        int iHashCode4 = (iHashCode3 + (map == null ? 0 : map.hashCode())) * 31;
        Map<String, ApiDocumentPropLocalized> map2 = this.documentTypeDescriptions;
        return iHashCode4 + (map2 != null ? map2.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ApiDocumentTypeSelectionState(uiSettings=");
        sb2.append(this.uiSettings);
        sb2.append(", texts=");
        sb2.append(this.texts);
        sb2.append(", allowedDocumentTypes=");
        sb2.append(this.allowedDocumentTypes);
        sb2.append(", countryDescriptions=");
        sb2.append(this.countryDescriptions);
        sb2.append(", documentTypeDescriptions=");
        return r.w(sb2, this.documentTypeDescriptions, ')');
    }
}
