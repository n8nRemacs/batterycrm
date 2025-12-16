package pH;

import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: GigSlotState.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LpH/B;", "", "_avito_gig_slot-screen_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: pH.B, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final /* data */ class C46952B {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final String f428299a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final DeepLink f428300b;

    public C46952B(@Y61.k String str, @Y61.k DeepLink deepLink) {
        this.f428299a = str;
        this.f428300b = deepLink;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C46952B)) {
            return false;
        }
        C46952B c46952b = (C46952B) obj;
        return L.f(this.f428299a, c46952b.f428299a) && L.f(this.f428300b, c46952b.f428300b);
    }

    public final int hashCode() {
        return this.f428300b.hashCode() + (this.f428299a.hashCode() * 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RouteDetailState(title=");
        sb2.append(this.f428299a);
        sb2.append(", deeplink=");
        return com.avito.android.actions_sheet.a.v(sb2, this.f428300b, ')');
    }
}
