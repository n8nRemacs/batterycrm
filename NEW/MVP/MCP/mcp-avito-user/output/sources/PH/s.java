package pH;

import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.UniversalImage;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: GigSlotState.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LpH/s;", "", "_avito_gig_slot-screen_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class s {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final UniversalImage f428426a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f428427b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final DeepLink f428428c;

    public s(@Y61.k UniversalImage universalImage, @Y61.l DeepLink deepLink, @Y61.k String str) {
        this.f428426a = universalImage;
        this.f428427b = str;
        this.f428428c = deepLink;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        return L.f(this.f428426a, sVar.f428426a) && L.f(this.f428427b, sVar.f428427b) && L.f(this.f428428c, sVar.f428428c);
    }

    public final int hashCode() {
        int iD2 = H.d(this.f428426a.hashCode() * 31, 31, this.f428427b);
        DeepLink deepLink = this.f428428c;
        return iD2 + (deepLink == null ? 0 : deepLink.hashCode());
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("GigSlotPaymentInfoRequisites(icon=");
        sb2.append(this.f428426a);
        sb2.append(", title=");
        sb2.append(this.f428427b);
        sb2.append(", deeplink=");
        return com.avito.android.actions_sheet.a.v(sb2, this.f428428c, ')');
    }
}
