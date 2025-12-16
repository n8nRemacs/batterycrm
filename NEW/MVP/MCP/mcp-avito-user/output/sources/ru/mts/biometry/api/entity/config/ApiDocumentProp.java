package ru.mts.biometry.api.entity.config;

import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ApiDocumentProp.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\b\u001a\u0004\b\u000b\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\b\u001a\u0004\b\f\u0010\n¨\u0006\r"}, d2 = {"Lru/mts/biometry/api/entity/config/ApiDocumentProp;", "", "", "type", "nameRu", "nameEn", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "b", "a", "api_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class ApiDocumentProp {

    @c("nameEn")
    @k
    private final String nameEn;

    @c("nameRu")
    @k
    private final String nameRu;

    @c("type")
    @k
    private final String type;

    public ApiDocumentProp(@k String str, @k String str2, @k String str3) {
        this.type = str;
        this.nameRu = str2;
        this.nameEn = str3;
    }

    @k
    /* renamed from: a, reason: from getter */
    public final String getNameEn() {
        return this.nameEn;
    }

    @k
    /* renamed from: b, reason: from getter */
    public final String getNameRu() {
        return this.nameRu;
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
        if (!(obj instanceof ApiDocumentProp)) {
            return false;
        }
        ApiDocumentProp apiDocumentProp = (ApiDocumentProp) obj;
        return L.f(this.type, apiDocumentProp.type) && L.f(this.nameRu, apiDocumentProp.nameRu) && L.f(this.nameEn, apiDocumentProp.nameEn);
    }

    public final int hashCode() {
        return this.nameEn.hashCode() + H.d(this.type.hashCode() * 31, 31, this.nameRu);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ApiDocumentProp(type=");
        sb2.append(this.type);
        sb2.append(", nameRu=");
        sb2.append(this.nameRu);
        sb2.append(", nameEn=");
        return C22026a.c(sb2, this.nameEn, ')');
    }
}
