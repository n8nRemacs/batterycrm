package androidx.privacysandbox.ads.adservices.adid;

import Y61.k;
import Y61.l;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: AdId.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/privacysandbox/ads/adservices/adid/a;", "", "ads-adservices_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final String f53501a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f53502b;

    public a(@k String str, boolean z12) {
        this.f53501a = str;
        this.f53502b = z12;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return L.f(this.f53501a, aVar.f53501a) && this.f53502b == aVar.f53502b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f53502b) + (this.f53501a.hashCode() * 31);
    }

    @k
    public final String toString() {
        return "AdId: adId=" + this.f53501a + ", isLimitAdTrackingEnabled=" + this.f53502b;
    }

    public /* synthetic */ a(String str, boolean z12, int i12, C42822w c42822w) {
        this(str, (i12 & 2) != 0 ? false : z12);
    }
}
