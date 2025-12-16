package ru.mts.biometry.api.entity.state;

import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ApiDocumentType.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R\u0017\u0010\b\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\f\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\f\u0010\t\u001a\u0004\b\r\u0010\u000b¨\u0006\u000e"}, d2 = {"Lru/mts/biometry/api/entity/state/ApiDocumentType;", "", "", "", "countryCodes", "Ljava/util/List;", "a", "()Ljava/util/List;", "type", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "version", "getVersion", "api_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class ApiDocumentType {

    @k
    private final List<String> countryCodes;

    @k
    private final String type;

    @k
    private final String version;

    @k
    public final List<String> a() {
        return this.countryCodes;
    }

    @k
    /* renamed from: b, reason: from getter */
    public final String getType() {
        return this.type;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ApiDocumentType)) {
            return false;
        }
        ApiDocumentType apiDocumentType = (ApiDocumentType) obj;
        return L.f(this.countryCodes, apiDocumentType.countryCodes) && L.f(this.type, apiDocumentType.type) && L.f(this.version, apiDocumentType.version);
    }

    public final int hashCode() {
        return this.version.hashCode() + H.d(this.countryCodes.hashCode() * 31, 31, this.type);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ApiDocumentType(countryCodes=");
        sb2.append(this.countryCodes);
        sb2.append(", type=");
        sb2.append(this.type);
        sb2.append(", version=");
        return C22026a.c(sb2, this.version, ')');
    }
}
