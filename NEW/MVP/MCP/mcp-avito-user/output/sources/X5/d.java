package x5;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.provider.clickstream.ParametrizedClickStreamEvent;
import com.avito.android.util.C35755b0;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.P0;
import kotlin.jvm.internal.L;

/* compiled from: AdvertDetailsAddressGeoDistanceShownEvent.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lx5/d;", "Lcom/avito/android/analytics/provider/clickstream/a;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class d implements com.avito.android.analytics.provider.clickstream.a {

    /* renamed from: b, reason: collision with root package name */
    @l
    public final String f442217b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f442218c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final String f442219d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ParametrizedClickStreamEvent f442220e;

    public d(@l String str, @k String str2, @k String str3) {
        this.f442217b = str;
        this.f442218c = str2;
        this.f442219d = str3;
        this.f442220e = new ParametrizedClickStreamEvent(12227, 3, C35755b0.c(P0.g(new Q("cid", str), new Q("iid", str2), new Q("from_page", "item_card"), new Q("payload_object", str3), new Q("from_block_name", "header"))), null, 8, null);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return L.f(this.f442217b, dVar.f442217b) && L.f(this.f442218c, dVar.f442218c) && this.f442219d.equals(dVar.f442219d);
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId */
    public final int getF328428b() {
        return this.f442220e.f90247b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @k
    public final Map<String, Object> getParams() {
        return this.f442220e.f90249d;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion */
    public final int getF328429c() {
        return this.f442220e.f90248c;
    }

    public final int hashCode() {
        return ((this.f442219d.hashCode() + ((((this.f442218c.hashCode() + ((this.f442217b == null ? 0 : r0.hashCode()) * 31)) * 31) - 2141672260) * 31)) * 31) - 1221270899;
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AdvertDetailsAddressGeoDistanceShownEvent(categoryId=");
        sb2.append(this.f442217b);
        sb2.append(", advertId=");
        sb2.append(this.f442218c);
        sb2.append(", fromPage=item_card, payloadObject=");
        return AK.c.s(sb2, this.f442219d, ", fromBlockName=header)");
    }
}
