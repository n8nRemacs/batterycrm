package ru.mts.biometry.api.entity.state;

import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import com.google.gson.annotations.c;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ApiDocumentCountryLocalized.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\t\u001a\u0004\b\f\u0010\u000bR\"\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lru/mts/biometry/api/entity/state/ApiDocumentCountryLocalized;", "", "", "code", "name", "", "documentTypes", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "c", "Ljava/util/List;", "b", "()Ljava/util/List;", "api_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class ApiDocumentCountryLocalized {

    @c("code")
    @l
    private final String code;

    @c("documentTypes")
    @l
    private final List<String> documentTypes;

    @c("name")
    @l
    private final String name;

    public ApiDocumentCountryLocalized(@l String str, @l String str2, @l List<String> list) {
        this.code = str;
        this.name = str2;
        this.documentTypes = list;
    }

    @l
    /* renamed from: a, reason: from getter */
    public final String getCode() {
        return this.code;
    }

    @l
    public final List<String> b() {
        return this.documentTypes;
    }

    @l
    /* renamed from: c, reason: from getter */
    public final String getName() {
        return this.name;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ApiDocumentCountryLocalized)) {
            return false;
        }
        ApiDocumentCountryLocalized apiDocumentCountryLocalized = (ApiDocumentCountryLocalized) obj;
        return L.f(this.code, apiDocumentCountryLocalized.code) && L.f(this.name, apiDocumentCountryLocalized.name) && L.f(this.documentTypes, apiDocumentCountryLocalized.documentTypes);
    }

    public final int hashCode() {
        String str = this.code;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.name;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<String> list = this.documentTypes;
        return iHashCode2 + (list != null ? list.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ApiDocumentCountryLocalized(code=");
        sb2.append(this.code);
        sb2.append(", name=");
        sb2.append(this.name);
        sb2.append(", documentTypes=");
        return H.p(sb2, this.documentTypes, ')');
    }
}
