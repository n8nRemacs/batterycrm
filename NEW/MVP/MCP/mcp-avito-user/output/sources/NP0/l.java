package NP0;

import androidx.compose.runtime.C22026a;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: LocationParameter.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LNP0/l;", "", "_avito_widget-filters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class l {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final String f11490a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final String f11491b;

    public l(@Y61.k String str, @Y61.l String str2) {
        this.f11490a = str;
        this.f11491b = str2;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return L.f(this.f11490a, lVar.f11490a) && L.f(this.f11491b, lVar.f11491b);
    }

    public final int hashCode() {
        int iHashCode = this.f11490a.hashCode() * 31;
        String str = this.f11491b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Location(id=");
        sb2.append(this.f11490a);
        sb2.append(", name=");
        return C22026a.c(sb2, this.f11491b, ')');
    }
}
