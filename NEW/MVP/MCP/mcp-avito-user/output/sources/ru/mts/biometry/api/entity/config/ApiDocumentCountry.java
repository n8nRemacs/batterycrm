package ru.mts.biometry.api.entity.config;

import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import com.google.gson.annotations.c;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ApiDocumentCountry.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B5\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\n\u001a\u0004\b\r\u0010\fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\n\u001a\u0004\b\u000e\u0010\fR\"\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lru/mts/biometry/api/entity/config/ApiDocumentCountry;", "", "", "code", "nameRu", "nameEn", "", "documentTypes", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "d", "c", "Ljava/util/List;", "b", "()Ljava/util/List;", "api_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class ApiDocumentCountry {

    @c("code")
    @l
    private final String code;

    @c("documentTypes")
    @l
    private final List<String> documentTypes;

    @c("nameEn")
    @l
    private final String nameEn;

    @c("nameRu")
    @l
    private final String nameRu;

    public ApiDocumentCountry(@l String str, @l String str2, @l String str3, @l List<String> list) {
        this.code = str;
        this.nameRu = str2;
        this.nameEn = str3;
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
    public final String getNameEn() {
        return this.nameEn;
    }

    @l
    /* renamed from: d, reason: from getter */
    public final String getNameRu() {
        return this.nameRu;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ApiDocumentCountry)) {
            return false;
        }
        ApiDocumentCountry apiDocumentCountry = (ApiDocumentCountry) obj;
        return L.f(this.code, apiDocumentCountry.code) && L.f(this.nameRu, apiDocumentCountry.nameRu) && L.f(this.nameEn, apiDocumentCountry.nameEn) && L.f(this.documentTypes, apiDocumentCountry.documentTypes);
    }

    public final int hashCode() {
        String str = this.code;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.nameRu;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.nameEn;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        List<String> list = this.documentTypes;
        return iHashCode3 + (list != null ? list.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ApiDocumentCountry(code=");
        sb2.append(this.code);
        sb2.append(", nameRu=");
        sb2.append(this.nameRu);
        sb2.append(", nameEn=");
        sb2.append(this.nameEn);
        sb2.append(", documentTypes=");
        return H.p(sb2, this.documentTypes, ')');
    }
}
