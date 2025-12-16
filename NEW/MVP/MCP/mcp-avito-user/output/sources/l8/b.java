package l8;

import Y61.k;
import Y61.l;
import com.avito.android.advert_core.analytics.branding_gallery.AnalyticsBrandingType;
import com.avito.android.analytics.provider.clickstream.ParametrizedClickStreamEvent;
import com.avito.android.util.C35755b0;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.P0;
import kotlin.jvm.internal.L;

/* compiled from: BrandingShownEvent.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Ll8/b;", "Lcom/avito/android/analytics/provider/clickstream/a;", "_avito_advert-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class b implements com.avito.android.analytics.provider.clickstream.a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f413541b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final String f413542c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final AnalyticsBrandingType f413543d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ParametrizedClickStreamEvent f413544e;

    public b(@k String str, @l String str2, @k AnalyticsBrandingType analyticsBrandingType) {
        this.f413541b = str;
        this.f413542c = str2;
        this.f413543d = analyticsBrandingType;
        this.f413544e = new ParametrizedClickStreamEvent(14099, 0, C35755b0.c(P0.j(new Q("iid", str), new Q("cid", str2), new Q("branding", analyticsBrandingType.f82810b))), null, 8, null);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return L.f(this.f413541b, bVar.f413541b) && L.f(this.f413542c, bVar.f413542c) && this.f413543d == bVar.f413543d;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId */
    public final int getF224266b() {
        return this.f413544e.f90247b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @k
    public final Map<String, Object> getParams() {
        return this.f413544e.f90249d;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion */
    public final int getF224267c() {
        return this.f413544e.f90248c;
    }

    public final int hashCode() {
        int iHashCode = this.f413541b.hashCode() * 31;
        String str = this.f413542c;
        return this.f413543d.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    @k
    public final String toString() {
        return "BrandingShownEvent(iid=" + this.f413541b + ", cid=" + this.f413542c + ", analyticsBrandingType=" + this.f413543d + ')';
    }
}
