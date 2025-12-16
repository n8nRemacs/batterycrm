package Yb;

import Y61.l;
import androidx.appcompat.app.r;
import com.avito.android.analytics.provider.clickstream.ParametrizedClickStreamEvent;
import java.util.Collections;
import java.util.Map;
import kotlin.Metadata;

/* compiled from: LocationPermissionStateChangeEvent.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"LYb/d;", "Lcc/e;", "Lcom/avito/android/analytics/provider/clickstream/a;", "_common_permissions_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class d implements cc.e, com.avito.android.analytics.provider.clickstream.a {

    /* renamed from: b, reason: collision with root package name */
    public final boolean f19531b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ParametrizedClickStreamEvent f19532c;

    public d(boolean z12) {
        this.f19531b = z12;
        this.f19532c = new ParametrizedClickStreamEvent(13480, 0, Collections.singletonMap("bool_param", Boolean.valueOf(z12)), null, 8, null);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d) && this.f19531b == ((d) obj).f19531b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId */
    public final int getF19677b() {
        return this.f19532c.f90247b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @Y61.k
    public final Map<String, Object> getParams() {
        return this.f19532c.f90249d;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion */
    public final int getF19678c() {
        return this.f19532c.f90248c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f19531b);
    }

    @Y61.k
    public final String toString() {
        return r.x(new StringBuilder("LocationPermissionStateChangeEvent(isEnable="), this.f19531b, ')');
    }
}
