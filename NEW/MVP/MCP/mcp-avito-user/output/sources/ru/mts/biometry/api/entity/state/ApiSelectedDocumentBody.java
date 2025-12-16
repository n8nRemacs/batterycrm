package ru.mts.biometry.api.entity.state;

import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import com.akita.compose.theme.re23.style.C0;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ApiSelectedDocumentBody.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\t\u001a\u0004\b\f\u0010\u000bR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lru/mts/biometry/api/entity/state/ApiSelectedDocumentBody;", "", "", "countryCode", "type", "", "canRetryDocumentTypeSelection", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)V", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "c", "Ljava/lang/Boolean;", "a", "()Ljava/lang/Boolean;", "api_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class ApiSelectedDocumentBody {

    @c("canRetryDocumentTypeSelection")
    @l
    private final Boolean canRetryDocumentTypeSelection;

    @c("countryCode")
    @k
    private final String countryCode;

    @c("type")
    @k
    private final String type;

    public ApiSelectedDocumentBody(@k String str, @k String str2, @l Boolean bool) {
        this.countryCode = str;
        this.type = str2;
        this.canRetryDocumentTypeSelection = bool;
    }

    @l
    /* renamed from: a, reason: from getter */
    public final Boolean getCanRetryDocumentTypeSelection() {
        return this.canRetryDocumentTypeSelection;
    }

    @k
    /* renamed from: b, reason: from getter */
    public final String getCountryCode() {
        return this.countryCode;
    }

    @k
    /* renamed from: c, reason: from getter */
    public final String getType() {
        return this.type;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ApiSelectedDocumentBody)) {
            return false;
        }
        ApiSelectedDocumentBody apiSelectedDocumentBody = (ApiSelectedDocumentBody) obj;
        return L.f(this.countryCode, apiSelectedDocumentBody.countryCode) && L.f(this.type, apiSelectedDocumentBody.type) && L.f(this.canRetryDocumentTypeSelection, apiSelectedDocumentBody.canRetryDocumentTypeSelection);
    }

    public final int hashCode() {
        int iD2 = H.d(this.countryCode.hashCode() * 31, 31, this.type);
        Boolean bool = this.canRetryDocumentTypeSelection;
        return iD2 + (bool == null ? 0 : bool.hashCode());
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ApiSelectedDocumentBody(countryCode=");
        sb2.append(this.countryCode);
        sb2.append(", type=");
        sb2.append(this.type);
        sb2.append(", canRetryDocumentTypeSelection=");
        return C0.g(sb2, this.canRetryDocumentTypeSelection, ')');
    }
}
