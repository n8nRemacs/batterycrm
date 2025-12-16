package pH;

import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: GigSlotState.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LpH/u;", "", "_avito_gig_slot-screen_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class u {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final String f428431a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f428432b;

    public u(@Y61.k String str, @Y61.k String str2) {
        this.f428431a = str;
        this.f428432b = str2;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        return L.f(this.f428431a, uVar.f428431a) && L.f(this.f428432b, uVar.f428432b);
    }

    public final int hashCode() {
        return this.f428432b.hashCode() + (this.f428431a.hashCode() * 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("GigSlotRoute(route=");
        sb2.append(this.f428431a);
        sb2.append(", address=");
        return C22026a.c(sb2, this.f428432b, ')');
    }
}
