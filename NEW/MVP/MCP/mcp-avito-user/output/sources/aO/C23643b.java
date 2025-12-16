package ao;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.provider.clickstream.ParametrizedClickStreamEvent;
import java.util.Collections;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: TreeShowEvent.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lao/b;", "Lcom/avito/android/analytics/provider/clickstream/a;", "_avito_category-items-tree_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: ao.b, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final /* data */ class C23643b implements com.avito.android.analytics.provider.clickstream.a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f56220b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ParametrizedClickStreamEvent f56221c;

    public C23643b(@k String str) {
        this.f56220b = str;
        this.f56221c = new ParametrizedClickStreamEvent(15103, 0, Collections.singletonMap("promocampaign_type", str), null, 8, null);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C23643b) && L.f(this.f56220b, ((C23643b) obj).f56220b);
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId */
    public final int getF19677b() {
        return this.f56221c.f90247b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @k
    public final Map<String, Object> getParams() {
        return this.f56221c.f90249d;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion */
    public final int getF19678c() {
        return this.f56221c.f90248c;
    }

    public final int hashCode() {
        return this.f56220b.hashCode();
    }

    @k
    public final String toString() {
        return C22026a.c(new StringBuilder("TreeShowEvent(promoType="), this.f56220b, ')');
    }
}
