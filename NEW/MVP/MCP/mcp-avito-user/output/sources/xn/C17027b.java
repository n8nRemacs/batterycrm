package Xn;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.provider.clickstream.ParametrizedClickStreamEvent;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.P0;
import kotlin.jvm.internal.L;

/* compiled from: CategoryItemsShowEvent.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LXn/b;", "Lcom/avito/android/analytics/provider/clickstream/a;", "_avito_category-items-tree_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Xn.b, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final /* data */ class C17027b implements com.avito.android.analytics.provider.clickstream.a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f19070b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f19071c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ParametrizedClickStreamEvent f19072d;

    public C17027b(@k String str, @k String str2) {
        this.f19070b = str;
        this.f19071c = str2;
        this.f19072d = new ParametrizedClickStreamEvent(15106, 0, P0.g(new Q("promocampaign_type", str), new Q("from_page", str2)), null, 8, null);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C17027b)) {
            return false;
        }
        C17027b c17027b = (C17027b) obj;
        return L.f(this.f19070b, c17027b.f19070b) && L.f(this.f19071c, c17027b.f19071c);
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId */
    public final int getF328428b() {
        return this.f19072d.f90247b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @k
    public final Map<String, Object> getParams() {
        return this.f19072d.f90249d;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion */
    public final int getF328429c() {
        return this.f19072d.f90248c;
    }

    public final int hashCode() {
        return this.f19071c.hashCode() + (this.f19070b.hashCode() * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CategoryItemsShowEvent(promoType=");
        sb2.append(this.f19070b);
        sb2.append(", fromPage=");
        return C22026a.c(sb2, this.f19071c, ')');
    }
}
