package pH;

import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.akita.compose.theme.re23.style.C0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: GigSlotState.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LpH/g;", "", "_avito_gig_slot-screen_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: pH.g, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final /* data */ class C46959g {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final String f428342a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f428343b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final String f428344c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final String f428345d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public final Boolean f428346e;

    public C46959g(@Y61.k String str, @Y61.k String str2, @Y61.k String str3, @Y61.l String str4, @Y61.l Boolean bool) {
        this.f428342a = str;
        this.f428343b = str2;
        this.f428344c = str3;
        this.f428345d = str4;
        this.f428346e = bool;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C46959g)) {
            return false;
        }
        C46959g c46959g = (C46959g) obj;
        return L.f(this.f428342a, c46959g.f428342a) && L.f(this.f428343b, c46959g.f428343b) && L.f(this.f428344c, c46959g.f428344c) && L.f(this.f428345d, c46959g.f428345d) && L.f(this.f428346e, c46959g.f428346e);
    }

    public final int hashCode() {
        int iD2 = H.d(H.d(this.f428342a.hashCode() * 31, 31, this.f428343b), 31, this.f428344c);
        String str = this.f428345d;
        int iHashCode = (iD2 + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.f428346e;
        return iHashCode + (bool != null ? bool.hashCode() : 0);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("GigNavBarState(title=");
        sb2.append(this.f428342a);
        sb2.append(", date=");
        sb2.append(this.f428343b);
        sb2.append(", price=");
        sb2.append(this.f428344c);
        sb2.append(", logoUrl=");
        sb2.append(this.f428345d);
        sb2.append(", isTotalPriceHighlighted=");
        return C0.g(sb2, this.f428346e, ')');
    }
}
