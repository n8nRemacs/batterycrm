package PE0;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: StatisticsBlock.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LPE0/j;", "", "_avito_travel-guest-profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class j {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final String f12910a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f12911b;

    /* renamed from: c, reason: collision with root package name */
    public final int f12912c;

    public j(@k String str, @k String str2, int i12) {
        this.f12910a = str;
        this.f12911b = str2;
        this.f12912c = i12;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return L.f(this.f12910a, jVar.f12910a) && L.f(this.f12911b, jVar.f12911b) && this.f12912c == jVar.f12912c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f12912c) + H.d(this.f12910a.hashCode() * 31, 31, this.f12911b);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("StatisticsGroupInfo(title=");
        sb2.append(this.f12910a);
        sb2.append(", color=");
        sb2.append(this.f12911b);
        sb2.append(", value=");
        return r.t(sb2, this.f12912c, ')');
    }
}
