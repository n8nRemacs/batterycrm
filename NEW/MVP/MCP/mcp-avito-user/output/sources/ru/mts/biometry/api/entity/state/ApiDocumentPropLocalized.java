package ru.mts.biometry.api.entity.state;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ApiDocumentPropLocalized.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\n\u0010\t¨\u0006\u000b"}, d2 = {"Lru/mts/biometry/api/entity/state/ApiDocumentPropLocalized;", "", "", "type", "name", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "a", "api_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class ApiDocumentPropLocalized {

    @c("name")
    @k
    private final String name;

    @c("type")
    @k
    private final String type;

    public ApiDocumentPropLocalized(@k String str, @k String str2) {
        this.type = str;
        this.name = str2;
    }

    @k
    /* renamed from: a, reason: from getter */
    public final String getName() {
        return this.name;
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
        if (!(obj instanceof ApiDocumentPropLocalized)) {
            return false;
        }
        ApiDocumentPropLocalized apiDocumentPropLocalized = (ApiDocumentPropLocalized) obj;
        return L.f(this.type, apiDocumentPropLocalized.type) && L.f(this.name, apiDocumentPropLocalized.name);
    }

    public final int hashCode() {
        return this.name.hashCode() + (this.type.hashCode() * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ApiDocumentPropLocalized(type=");
        sb2.append(this.type);
        sb2.append(", name=");
        return C22026a.c(sb2, this.name, ')');
    }
}
