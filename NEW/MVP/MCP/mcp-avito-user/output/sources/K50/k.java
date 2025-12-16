package K50;

import androidx.appcompat.app.r;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ProfilesListResponse.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bR \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LK50/k;", "", "", "LK50/i;", "profiles", "", "count", "<init>", "(Ljava/util/List;I)V", "Ljava/util/List;", "getProfiles", "()Ljava/util/List;", "I", "getCount", "()I", "_avito_passport-lib_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class k {

    @com.google.gson.annotations.c("count")
    private final int count;

    @com.google.gson.annotations.c("profiles")
    @Y61.k
    private final List<i> profiles;

    public k(@Y61.k List<i> list, int i12) {
        this.profiles = list;
        this.count = i12;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return L.f(this.profiles, kVar.profiles) && this.count == kVar.count;
    }

    public final int hashCode() {
        return Integer.hashCode(this.count) + (this.profiles.hashCode() * 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ProfilesListResponse(profiles=");
        sb2.append(this.profiles);
        sb2.append(", count=");
        return r.t(sb2, this.count, ')');
    }
}
