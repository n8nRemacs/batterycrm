package YE0;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: TravelOnboardingBlocksInfo.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LYE0/a;", "", "_avito_travel-onboarding_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class a {

    /* renamed from: a, reason: collision with root package name */
    public final long f19385a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f19386b;

    public a(long j12, @k String str) {
        this.f19385a = j12;
        this.f19386b = str;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f19385a == aVar.f19385a && L.f(this.f19386b, aVar.f19386b);
    }

    public final int hashCode() {
        return this.f19386b.hashCode() + (Long.hashCode(this.f19385a) * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("TravelOnboardingAnalyticsInfo(strOnboardingId=");
        sb2.append(this.f19385a);
        sb2.append(", fromPage=");
        return C22026a.c(sb2, this.f19386b, ')');
    }
}
