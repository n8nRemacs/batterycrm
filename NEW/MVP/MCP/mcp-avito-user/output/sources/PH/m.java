package pH;

import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: GigSlotState.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LpH/m;", "", "_avito_gig_slot-screen_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class m {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final String f428411a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final DeepLink f428412b;

    public m(@Y61.k String str, @Y61.l DeepLink deepLink) {
        this.f428411a = str;
        this.f428412b = deepLink;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return L.f(this.f428411a, mVar.f428411a) && L.f(this.f428412b, mVar.f428412b);
    }

    public final int hashCode() {
        int iHashCode = this.f428411a.hashCode() * 31;
        DeepLink deepLink = this.f428412b;
        return iHashCode + (deepLink == null ? 0 : deepLink.hashCode());
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("GigSlotMapViewBottomButton(label=");
        sb2.append(this.f428411a);
        sb2.append(", deeplink=");
        return com.avito.android.actions_sheet.a.v(sb2, this.f428412b, ')');
    }
}
