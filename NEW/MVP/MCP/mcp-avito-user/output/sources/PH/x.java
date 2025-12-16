package pH;

import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: GigSlotState.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LpH/x;", "", "_avito_gig_slot-screen_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class x {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final DeepLink f428477a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f428478b;

    public x(@Y61.k DeepLink deepLink, boolean z12) {
        this.f428477a = deepLink;
        this.f428478b = z12;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        return L.f(this.f428477a, xVar.f428477a) && this.f428478b == xVar.f428478b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f428478b) + (this.f428477a.hashCode() * 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("GigSlotSupportButton(chatDeeplink=");
        sb2.append(this.f428477a);
        sb2.append(", isUp=");
        return androidx.appcompat.app.r.x(sb2, this.f428478b, ')');
    }
}
