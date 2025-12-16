package KJ;

import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: AvCallsNetworkTestResult.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LKJ/b;", "", "_avito_iac-avcalls_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class b {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final String f9390a;

    /* renamed from: b, reason: collision with root package name */
    @l
    public final String f9391b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final String f9392c;

    public b(@k String str, @l String str2, @l String str3) {
        this.f9390a = str;
        this.f9391b = str2;
        this.f9392c = str3;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        bVar.getClass();
        return this.f9390a.equals(bVar.f9390a) && L.f(this.f9391b, bVar.f9391b) && L.f(this.f9392c, bVar.f9392c);
    }

    public final int hashCode() {
        int iD2 = H.d(1680829951, 31, this.f9390a);
        String str = this.f9391b;
        int iHashCode = (iD2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f9392c;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AvCallsNetworkTestResult(scenario=app_foreground, testId=");
        sb2.append(this.f9390a);
        sb2.append(", report=");
        sb2.append(this.f9391b);
        sb2.append(", errorText=");
        return C22026a.c(sb2, this.f9392c, ')');
    }
}
