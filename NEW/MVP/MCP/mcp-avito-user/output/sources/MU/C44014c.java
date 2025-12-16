package mU;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import com.avito.android.analytics.provider.clickstream.ParametrizedClickStreamEvent;
import com.avito.android.util.C35755b0;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.P0;
import kotlin.jvm.internal.L;

/* compiled from: OpenCartEvent.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LmU/c;", "Lcom/avito/android/analytics/provider/clickstream/a;", "_design-modules_beduin-v2_interactions_repository_domain_cart-total-quantity_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: mU.c, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final /* data */ class C44014c implements com.avito.android.analytics.provider.clickstream.a {

    /* renamed from: b, reason: collision with root package name */
    @l
    public final String f414518b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final String f414519c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final String f414520d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final String f414521e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ParametrizedClickStreamEvent f414522f;

    public C44014c(@l String str, @l String str2, @l String str3, @k String str4) {
        this.f414518b = str;
        this.f414519c = str2;
        this.f414520d = str3;
        this.f414521e = str4;
        this.f414522f = new ParametrizedClickStreamEvent(4647, 8, "Avito.Marketplace / Корзина / Переход на страницу корзины", C35755b0.c(P0.g(new Q("uid", str), new Q("iid", str2), new Q("x", str3), new Q("fromPage", str4), new Q("srcp", "header"))));
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C44014c)) {
            return false;
        }
        C44014c c44014c = (C44014c) obj;
        return L.f(this.f414518b, c44014c.f414518b) && L.f(this.f414519c, c44014c.f414519c) && L.f(this.f414520d, c44014c.f414520d) && L.f(this.f414521e, c44014c.f414521e);
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId */
    public final int getF224266b() {
        return this.f414522f.f90247b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @k
    public final Map<String, Object> getParams() {
        return this.f414522f.f90249d;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion */
    public final int getF224267c() {
        return this.f414522f.f90248c;
    }

    public final int hashCode() {
        String str = this.f414518b;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f414519c;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f414520d;
        return this.f414521e.hashCode() + ((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("OpenCartEvent(userId=");
        sb2.append(this.f414518b);
        sb2.append(", itemId=");
        sb2.append(this.f414519c);
        sb2.append(", xHash=");
        sb2.append(this.f414520d);
        sb2.append(", fromPage=");
        return C22026a.c(sb2, this.f414521e, ')');
    }
}
