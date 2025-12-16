package pH;

import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: GigSlotState.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LpH/j;", "", "_avito_gig_slot-screen_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class j {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final String f428374a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final DeepLink f428375b;

    public j(@Y61.k String str, @Y61.l DeepLink deepLink) {
        this.f428374a = str;
        this.f428375b = deepLink;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return L.f(this.f428374a, jVar.f428374a) && L.f(this.f428375b, jVar.f428375b);
    }

    public final int hashCode() {
        int iHashCode = this.f428374a.hashCode() * 31;
        DeepLink deepLink = this.f428375b;
        return iHashCode + (deepLink == null ? 0 : deepLink.hashCode());
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("GigSlotButton(title=");
        sb2.append(this.f428374a);
        sb2.append(", deeplink=");
        return com.avito.android.actions_sheet.a.v(sb2, this.f428375b, ')');
    }

    public /* synthetic */ j(String str, DeepLink deepLink, int i12, C42822w c42822w) {
        this(str, (i12 & 2) != 0 ? null : deepLink);
    }
}
