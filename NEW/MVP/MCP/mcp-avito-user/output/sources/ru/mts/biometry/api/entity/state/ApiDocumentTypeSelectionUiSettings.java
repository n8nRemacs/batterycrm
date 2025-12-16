package ru.mts.biometry.api.entity.state;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import kotlin.Metadata;

/* compiled from: ApiDocumentTypeSelectionState.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lru/mts/biometry/api/entity/state/ApiDocumentTypeSelectionUiSettings;", "", "", "isSingleDocumentTypeSelectorEnabled", "Z", "a", "()Z", "api_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class ApiDocumentTypeSelectionUiSettings {
    private final boolean isSingleDocumentTypeSelectorEnabled;

    /* renamed from: a, reason: from getter */
    public final boolean getIsSingleDocumentTypeSelectorEnabled() {
        return this.isSingleDocumentTypeSelectorEnabled;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ApiDocumentTypeSelectionUiSettings) && this.isSingleDocumentTypeSelectorEnabled == ((ApiDocumentTypeSelectionUiSettings) obj).isSingleDocumentTypeSelectorEnabled;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.isSingleDocumentTypeSelectorEnabled);
    }

    @k
    public final String toString() {
        return r.x(new StringBuilder("ApiDocumentTypeSelectionUiSettings(isSingleDocumentTypeSelectorEnabled="), this.isSingleDocumentTypeSelectorEnabled, ')');
    }
}
