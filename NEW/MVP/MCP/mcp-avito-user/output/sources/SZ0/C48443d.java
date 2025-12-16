package sz0;

import Y61.k;
import Y61.l;
import androidx.media3.exoplayer.analytics.m;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: StrSellerOrdersResponse.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lsz0/d;", "", "_avito_str-seller-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: sz0.d, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final /* data */ class C48443d {

    /* renamed from: a, reason: collision with root package name */
    @l
    public final String f438986a;

    /* renamed from: b, reason: collision with root package name */
    @l
    public final Boolean f438987b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final Long f438988c;

    public C48443d(@l String str, @l Boolean bool, @l Long l12) {
        this.f438986a = str;
        this.f438987b = bool;
        this.f438988c = l12;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C48443d)) {
            return false;
        }
        C48443d c48443d = (C48443d) obj;
        return L.f(this.f438986a, c48443d.f438986a) && L.f(this.f438987b, c48443d.f438987b) && L.f(this.f438988c, c48443d.f438988c);
    }

    public final int hashCode() {
        String str = this.f438986a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Boolean bool = this.f438987b;
        int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Long l12 = this.f438988c;
        return iHashCode2 + (l12 != null ? l12.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Pagination(cursor=");
        sb2.append(this.f438986a);
        sb2.append(", hasMore=");
        sb2.append(this.f438987b);
        sb2.append(", limit=");
        return m.m(sb2, this.f438988c, ')');
    }
}
