package ru.mts.biometry.api.entity.state.screen;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ApiPageTexts.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0004\u001a\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"Lru/mts/biometry/api/entity/state/screen/ApiPageTexts;", "", "", "text", "Ljava/lang/String;", "getText", "()Ljava/lang/String;", "description", "getDescription", "api_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class ApiPageTexts {

    @l
    private final String description;

    @l
    private final String text;

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ApiPageTexts)) {
            return false;
        }
        ApiPageTexts apiPageTexts = (ApiPageTexts) obj;
        return L.f(this.text, apiPageTexts.text) && L.f(this.description, apiPageTexts.description);
    }

    public final int hashCode() {
        String str = this.text;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.description;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ApiPageTexts(text=");
        sb2.append(this.text);
        sb2.append(", description=");
        return C22026a.c(sb2, this.description, ')');
    }
}
