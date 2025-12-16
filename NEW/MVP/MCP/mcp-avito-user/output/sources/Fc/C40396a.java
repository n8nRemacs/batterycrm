package fc;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import com.avito.android.analytics.provider.clickstream.ParametrizedClickStreamEvent;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.P0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: AuctionOfferShownEvent.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lfc/a;", "Lcom/avito/android/analytics/provider/clickstream/a;", "_avito_analytics_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: fc.a, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final /* data */ class C40396a implements com.avito.android.analytics.provider.clickstream.a {

    /* renamed from: b, reason: collision with root package name */
    @l
    public final String f395976b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final String f395977c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final String f395978d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final String f395979e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ParametrizedClickStreamEvent f395980f;

    public C40396a(@l String str, @l String str2, @l String str3, @l String str4) {
        this.f395976b = str;
        this.f395977c = str2;
        this.f395978d = str3;
        this.f395979e = str4;
        LinkedHashMap linkedHashMapJ = P0.j(new Q("business_platform", "3"));
        if (str != null) {
        }
        if (str2 != null) {
        }
        if (str3 != null) {
        }
        if (str4 != null) {
            linkedHashMapJ.put("item_draft_id", str4);
        }
        G0 g02 = G0.f406611a;
        this.f395980f = new ParametrizedClickStreamEvent(7857, 5, linkedHashMapJ, null, 8, null);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C40396a)) {
            return false;
        }
        C40396a c40396a = (C40396a) obj;
        return L.f(this.f395976b, c40396a.f395976b) && L.f(this.f395977c, c40396a.f395977c) && L.f(this.f395978d, c40396a.f395978d) && L.f(this.f395979e, c40396a.f395979e);
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId */
    public final int getF224266b() {
        return this.f395980f.f90247b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @k
    public final Map<String, Object> getParams() {
        return this.f395980f.f90249d;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion */
    public final int getF224267c() {
        return this.f395980f.f90248c;
    }

    public final int hashCode() {
        String str = this.f395976b;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f395977c;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f395978d;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f395979e;
        return iHashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AuctionOfferShownEvent(itemId=");
        sb2.append(this.f395976b);
        sb2.append(", locationId=");
        sb2.append(this.f395977c);
        sb2.append(", fromPage=");
        sb2.append(this.f395978d);
        sb2.append(", itemDraftId=");
        return C22026a.c(sb2, this.f395979e, ')');
    }

    public /* synthetic */ C40396a(String str, String str2, String str3, String str4, int i12, C42822w c42822w) {
        this(str, str2, str3, (i12 & 8) != 0 ? null : str4);
    }
}
