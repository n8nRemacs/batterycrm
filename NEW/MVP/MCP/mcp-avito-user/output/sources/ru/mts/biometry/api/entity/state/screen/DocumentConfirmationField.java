package ru.mts.biometry.api.entity.state.screen;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: DocumentConfirmationField.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0004\u001a\u0004\b\b\u0010\u0006R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u0004\u001a\u0004\b\n\u0010\u0006¨\u0006\u000b"}, d2 = {"Lru/mts/biometry/api/entity/state/screen/DocumentConfirmationField;", "", "", "displayName", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "name", "getName", "value", "b", "api_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class DocumentConfirmationField {

    @l
    private final String displayName;

    @l
    private final String name;

    @l
    private final String value;

    @l
    /* renamed from: a, reason: from getter */
    public final String getDisplayName() {
        return this.displayName;
    }

    @l
    /* renamed from: b, reason: from getter */
    public final String getValue() {
        return this.value;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DocumentConfirmationField)) {
            return false;
        }
        DocumentConfirmationField documentConfirmationField = (DocumentConfirmationField) obj;
        return L.f(this.displayName, documentConfirmationField.displayName) && L.f(this.name, documentConfirmationField.name) && L.f(this.value, documentConfirmationField.value);
    }

    public final int hashCode() {
        String str = this.displayName;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.name;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.value;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("DocumentConfirmationField(displayName=");
        sb2.append(this.displayName);
        sb2.append(", name=");
        sb2.append(this.name);
        sb2.append(", value=");
        return C22026a.c(sb2, this.value, ')');
    }
}
