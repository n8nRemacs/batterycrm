package V80;

import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: PositionInfoRequest.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LV80/k;", "", "_avito_position-in-search_stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class k {

    /* renamed from: a, reason: collision with root package name */
    public final long f16983a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f16984b;

    public k(long j12, @Y61.k String str) {
        this.f16983a = j12;
        this.f16984b = str;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return this.f16983a == kVar.f16983a && L.f(this.f16984b, kVar.f16984b);
    }

    public final int hashCode() {
        return this.f16984b.hashCode() + (Long.hashCode(this.f16983a) * 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("PositionInfoRequest(itemId=");
        sb2.append(this.f16983a);
        sb2.append(", period=");
        return C22026a.c(sb2, this.f16984b, ')');
    }
}
