package pH;

import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: GigSlotState.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LpH/v;", "", "_avito_gig_slot-screen_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class v {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final String f428433a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final String f428434b;

    public v(@Y61.k String str, @Y61.l String str2) {
        this.f428433a = str;
        this.f428434b = str2;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        return L.f(this.f428433a, vVar.f428433a) && L.f(this.f428434b, vVar.f428434b);
    }

    public final int hashCode() {
        int iHashCode = this.f428433a.hashCode() * 31;
        String str = this.f428434b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("GigSlotSeller(name=");
        sb2.append(this.f428433a);
        sb2.append(", logoUrl=");
        return C22026a.c(sb2, this.f428434b, ')');
    }
}
