package jc;

import Y61.k;
import Y61.l;
import com.avito.android.analytics.event.favorite.SubscriptionSource;
import com.avito.android.analytics.provider.clickstream.ParametrizedClickStreamEvent;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.P0;
import kotlin.jvm.internal.L;

/* compiled from: SubscribeSellerButtonEvent.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Ljc/b;", "Lcom/avito/android/analytics/provider/clickstream/a;", "_avito_analytics_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: jc.b, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final /* data */ class C42353b implements com.avito.android.analytics.provider.clickstream.a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f405731b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final SubscriptionSource f405732c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ParametrizedClickStreamEvent f405733d;

    public C42353b(@k String str, @k SubscriptionSource subscriptionSource) {
        this.f405731b = str;
        this.f405732c = subscriptionSource;
        this.f405733d = new ParametrizedClickStreamEvent(4114, 1, P0.g(new Q("user_key", str), new Q("s", subscriptionSource.f90042b)), null, 8, null);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C42353b)) {
            return false;
        }
        C42353b c42353b = (C42353b) obj;
        return L.f(this.f405731b, c42353b.f405731b) && this.f405732c == c42353b.f405732c;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId */
    public final int getF328428b() {
        return this.f405733d.f90247b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @k
    public final Map<String, Object> getParams() {
        return this.f405733d.f90249d;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion */
    public final int getF328429c() {
        return this.f405733d.f90248c;
    }

    public final int hashCode() {
        return this.f405732c.hashCode() + (this.f405731b.hashCode() * 31);
    }

    @k
    public final String toString() {
        return "SubscribeSellerButtonEvent(userKey=" + this.f405731b + ", source=" + this.f405732c + ')';
    }
}
