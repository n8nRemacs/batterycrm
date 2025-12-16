package ru.mts.biometry.api.entity.state;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ApiDocumentTypeSelectionState.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0004\u001a\u0004\b\b\u0010\u0006R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u0004\u001a\u0004\b\n\u0010\u0006R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0004\u001a\u0004\b\f\u0010\u0006¨\u0006\r"}, d2 = {"Lru/mts/biometry/api/entity/state/ApiDocumentTypeSelectionTexts;", "", "", "title", "Ljava/lang/String;", "d", "()Ljava/lang/String;", "description", "b", "countryTitle", "a", "documentTypeTitle", "c", "api_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class ApiDocumentTypeSelectionTexts {

    @l
    private final String countryTitle;

    @l
    private final String description;

    @l
    private final String documentTypeTitle;

    @l
    private final String title;

    @l
    /* renamed from: a, reason: from getter */
    public final String getCountryTitle() {
        return this.countryTitle;
    }

    @l
    /* renamed from: b, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    @l
    /* renamed from: c, reason: from getter */
    public final String getDocumentTypeTitle() {
        return this.documentTypeTitle;
    }

    @l
    /* renamed from: d, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ApiDocumentTypeSelectionTexts)) {
            return false;
        }
        ApiDocumentTypeSelectionTexts apiDocumentTypeSelectionTexts = (ApiDocumentTypeSelectionTexts) obj;
        return L.f(this.title, apiDocumentTypeSelectionTexts.title) && L.f(this.description, apiDocumentTypeSelectionTexts.description) && L.f(this.countryTitle, apiDocumentTypeSelectionTexts.countryTitle) && L.f(this.documentTypeTitle, apiDocumentTypeSelectionTexts.documentTypeTitle);
    }

    public final int hashCode() {
        String str = this.title;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.description;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.countryTitle;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.documentTypeTitle;
        return iHashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ApiDocumentTypeSelectionTexts(title=");
        sb2.append(this.title);
        sb2.append(", description=");
        sb2.append(this.description);
        sb2.append(", countryTitle=");
        sb2.append(this.countryTitle);
        sb2.append(", documentTypeTitle=");
        return C22026a.c(sb2, this.documentTypeTitle, ')');
    }
}
