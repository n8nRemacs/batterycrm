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

/* compiled from: UnsubscribeSellerButtonEvent.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Ljc/c;", "Lcom/avito/android/analytics/provider/clickstream/a;", "_avito_analytics_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: jc.c, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final /* data */ class C42354c implements com.avito.android.analytics.provider.clickstream.a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f405734b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final SubscriptionSource f405735c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ParametrizedClickStreamEvent f405736d;

    public C42354c(@k String str, @k SubscriptionSource subscriptionSource) {
        this.f405734b = str;
        this.f405735c = subscriptionSource;
        this.f405736d = new ParametrizedClickStreamEvent(4115, 1, P0.g(new Q("user_key", str), new Q("s", subscriptionSource.f90042b)), null, 8, null);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C42354c)) {
            return false;
        }
        C42354c c42354c = (C42354c) obj;
        return L.f(this.f405734b, c42354c.f405734b) && this.f405735c == c42354c.f405735c;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId */
    public final int getF328428b() {
        return this.f405736d.f90247b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @k
    public final Map<String, Object> getParams() {
        return this.f405736d.f90249d;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion */
    public final int getF328429c() {
        return this.f405736d.f90248c;
    }

    public final int hashCode() {
        return this.f405735c.hashCode() + (this.f405734b.hashCode() * 31);
    }

    @k
    public final String toString() {
        return "UnsubscribeSellerButtonEvent(userKey=" + this.f405734b + ", source=" + this.f405735c + ')';
    }
}
