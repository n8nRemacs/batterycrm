package ru.mts.biometry.api.entity;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: SelectDocumentBody.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\n\u0010\t¨\u0006\u000b"}, d2 = {"Lru/mts/biometry/api/entity/SelectDocumentBody;", "", "", "countryCode", "type", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "Ljava/lang/String;", "getCountryCode", "()Ljava/lang/String;", "getType", "api_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class SelectDocumentBody {

    @c("countryCode")
    @k
    private final String countryCode;

    @c("type")
    @k
    private final String type;

    public SelectDocumentBody(@k String str, @k String str2) {
        this.countryCode = str;
        this.type = str2;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SelectDocumentBody)) {
            return false;
        }
        SelectDocumentBody selectDocumentBody = (SelectDocumentBody) obj;
        return L.f(this.countryCode, selectDocumentBody.countryCode) && L.f(this.type, selectDocumentBody.type);
    }

    public final int hashCode() {
        return this.type.hashCode() + (this.countryCode.hashCode() * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SelectDocumentBody(countryCode=");
        sb2.append(this.countryCode);
        sb2.append(", type=");
        return C22026a.c(sb2, this.type, ')');
    }
}
