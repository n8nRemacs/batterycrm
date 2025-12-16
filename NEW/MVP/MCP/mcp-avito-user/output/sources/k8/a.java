package K8;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import com.avito.android.analytics.provider.clickstream.ParametrizedClickStreamEvent;
import com.avito.android.util.C35755b0;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.P0;
import kotlin.jvm.internal.L;

/* compiled from: MultiAddressesShowOnMapClickedEvent.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LK8/a;", "Lcom/avito/android/analytics/provider/clickstream/a;", "_avito_advert-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class a implements com.avito.android.analytics.provider.clickstream.a {

    /* renamed from: b, reason: collision with root package name */
    @l
    public final String f9276b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final String f9277c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final String f9278d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final String f9279e;

    /* renamed from: f, reason: collision with root package name */
    public final int f9280f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ ParametrizedClickStreamEvent f9281g;

    public a(@l String str, int i12, @l String str2, @k String str3, @l String str4) {
        this.f9276b = str;
        this.f9277c = str2;
        this.f9278d = str3;
        this.f9279e = str4;
        this.f9280f = i12;
        this.f9281g = new ParametrizedClickStreamEvent(9741, 0, C35755b0.c(P0.j(new Q("mcid", str), new Q("cid", str2), new Q("iid", str3), new Q("x", str4), new Q("address_id", Integer.valueOf(i12)))), null, 8, null);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return L.f(this.f9276b, aVar.f9276b) && L.f(this.f9277c, aVar.f9277c) && L.f(this.f9278d, aVar.f9278d) && L.f(this.f9279e, aVar.f9279e) && this.f9280f == aVar.f9280f;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId */
    public final int getF328428b() {
        return this.f9281g.f90247b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @k
    public final Map<String, Object> getParams() {
        return this.f9281g.f90249d;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion */
    public final int getF328429c() {
        return this.f9281g.f90248c;
    }

    public final int hashCode() {
        String str = this.f9276b;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f9277c;
        int iD2 = H.d((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.f9278d);
        String str3 = this.f9279e;
        return Integer.hashCode(this.f9280f) + ((iD2 + (str3 != null ? str3.hashCode() : 0)) * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("MultiAddressesShowOnMapClickedEvent(mcid=");
        sb2.append(this.f9276b);
        sb2.append(", cid=");
        sb2.append(this.f9277c);
        sb2.append(", iid=");
        sb2.append(this.f9278d);
        sb2.append(", x=");
        sb2.append(this.f9279e);
        sb2.append(", addressId=");
        return r.t(sb2, this.f9280f, ')');
    }
}
