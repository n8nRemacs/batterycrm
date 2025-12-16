package Xn;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.provider.clickstream.ParametrizedClickStreamEvent;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.P0;
import kotlin.jvm.internal.L;

/* compiled from: CategoryItemClickEvent.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LXn/a;", "Lcom/avito/android/analytics/provider/clickstream/a;", "_avito_category-items-tree_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Xn.a, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final /* data */ class C17026a implements com.avito.android.analytics.provider.clickstream.a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f19065b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f19066c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final String f19067d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f19068e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ParametrizedClickStreamEvent f19069f;

    public C17026a(@k String str, @k String str2, @k String str3, boolean z12) {
        this.f19065b = str;
        this.f19066c = str2;
        this.f19067d = str3;
        this.f19068e = z12;
        this.f19069f = new ParametrizedClickStreamEvent(15080, 1, P0.g(new Q("item_id", str), new Q("success", Boolean.valueOf(z12)), new Q("from_page", str3), new Q("promocampaign_type", str2)), null, 8, null);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C17026a)) {
            return false;
        }
        C17026a c17026a = (C17026a) obj;
        return L.f(this.f19065b, c17026a.f19065b) && L.f(this.f19066c, c17026a.f19066c) && L.f(this.f19067d, c17026a.f19067d) && this.f19068e == c17026a.f19068e;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId */
    public final int getF328428b() {
        return this.f19069f.f90247b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @k
    public final Map<String, Object> getParams() {
        return this.f19069f.f90249d;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion */
    public final int getF328429c() {
        return this.f19069f.f90248c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f19068e) + H.d(H.d(this.f19065b.hashCode() * 31, 31, this.f19066c), 31, this.f19067d);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CategoryItemClickEvent(itemId=");
        sb2.append(this.f19065b);
        sb2.append(", promoType=");
        sb2.append(this.f19066c);
        sb2.append(", fromPage=");
        sb2.append(this.f19067d);
        sb2.append(", isEnabled=");
        return r.x(sb2, this.f19068e, ')');
    }
}
