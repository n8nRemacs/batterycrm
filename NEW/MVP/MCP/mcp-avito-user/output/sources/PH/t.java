package pH;

import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: GigSlotState.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LpH/t;", "", "_avito_gig_slot-screen_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class t {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f428429a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final DeepLink f428430b;

    /* JADX WARN: Multi-variable type inference failed */
    public t() {
        this(false, null, 3, 0 == true ? 1 : 0);
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        return this.f428429a == tVar.f428429a && L.f(this.f428430b, tVar.f428430b);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.f428429a) * 31;
        DeepLink deepLink = this.f428430b;
        return iHashCode + (deepLink == null ? 0 : deepLink.hashCode());
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("GigSlotRequisitesBanner(isVisible=");
        sb2.append(this.f428429a);
        sb2.append(", bannerDeepLink=");
        return com.avito.android.actions_sheet.a.v(sb2, this.f428430b, ')');
    }

    public t(@Y61.l DeepLink deepLink, boolean z12) {
        this.f428429a = z12;
        this.f428430b = deepLink;
    }

    public /* synthetic */ t(boolean z12, DeepLink deepLink, int i12, C42822w c42822w) {
        this((i12 & 2) != 0 ? null : deepLink, (i12 & 1) != 0 ? false : z12);
    }
}
