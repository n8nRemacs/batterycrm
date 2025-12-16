package E91;

import androidx.compose.foundation.H;
import java.util.List;
import kotlin.jvm.internal.L;

/* loaded from: classes9.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final String f3843a;

    /* renamed from: b, reason: collision with root package name */
    public final String f3844b;

    /* renamed from: c, reason: collision with root package name */
    public final List f3845c;

    public f(String str, String str2, List list) {
        this.f3843a = str;
        this.f3844b = str2;
        this.f3845c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return L.f(this.f3843a, fVar.f3843a) && L.f(this.f3844b, fVar.f3844b) && L.f(this.f3845c, fVar.f3845c);
    }

    public final int hashCode() {
        String str = this.f3843a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f3844b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        List list = this.f3845c;
        return iHashCode2 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ErrorState(title=");
        sb2.append(this.f3843a);
        sb2.append(", description=");
        sb2.append(this.f3844b);
        sb2.append(", recommendations=");
        return H.p(sb2, this.f3845c, ')');
    }
}
