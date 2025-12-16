package IW;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: AnalyticsInfo.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LIW/b;", "", "_avito_loyalty_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class b {

    /* renamed from: a, reason: collision with root package name */
    @l
    public final String f8187a;

    /* renamed from: b, reason: collision with root package name */
    @l
    public final String f8188b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final String f8189c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final String f8190d;

    public b(@l String str, @l String str2, @l String str3, @l String str4) {
        this.f8187a = str;
        this.f8188b = str2;
        this.f8189c = str3;
        this.f8190d = str4;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return L.f(this.f8187a, bVar.f8187a) && L.f(this.f8188b, bVar.f8188b) && L.f(this.f8189c, bVar.f8189c) && L.f(this.f8190d, bVar.f8190d);
    }

    public final int hashCode() {
        String str = this.f8187a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f8188b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f8189c;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f8190d;
        return iHashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AnalyticsInfo(segment=");
        sb2.append(this.f8187a);
        sb2.append(", serviceQualityGrade=");
        sb2.append(this.f8188b);
        sb2.append(", reputationId=");
        sb2.append(this.f8189c);
        sb2.append(", reputationStateId=");
        return C22026a.c(sb2, this.f8190d, ')');
    }
}
