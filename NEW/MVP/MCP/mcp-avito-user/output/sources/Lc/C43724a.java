package lc;

import Y61.k;
import Y61.l;
import com.avito.android.analytics.event.imv_cars.EntryPointType;
import com.avito.android.analytics.provider.clickstream.ParametrizedClickStreamEvent;
import com.avito.android.util.C35755b0;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.P0;
import kotlin.jvm.internal.L;

/* compiled from: ImvCarsInformationButtonShownEvent.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Llc/a;", "Lcom/avito/android/analytics/provider/clickstream/a;", "_avito_analytics_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: lc.a, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final /* data */ class C43724a implements com.avito.android.analytics.provider.clickstream.a {

    /* renamed from: b, reason: collision with root package name */
    @l
    public final String f413937b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final EntryPointType f413938c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ParametrizedClickStreamEvent f413939d;

    public C43724a(@l String str, @k EntryPointType entryPointType) {
        this.f413937b = str;
        this.f413938c = entryPointType;
        this.f413939d = new ParametrizedClickStreamEvent(9301, 2, C35755b0.c(P0.j(new Q("business_platform", "3"), new Q("iid", str), new Q("icon_type", entryPointType.f90091b))), null, 8, null);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C43724a)) {
            return false;
        }
        C43724a c43724a = (C43724a) obj;
        return L.f(this.f413937b, c43724a.f413937b) && this.f413938c == c43724a.f413938c;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId */
    public final int getF224266b() {
        return this.f413939d.f90247b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @k
    public final Map<String, Object> getParams() {
        return this.f413939d.f90249d;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion */
    public final int getF224267c() {
        return this.f413939d.f90248c;
    }

    public final int hashCode() {
        String str = this.f413937b;
        return this.f413938c.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }

    @k
    public final String toString() {
        return "ImvCarsInformationButtonShownEvent(itemId=" + this.f413937b + ", entryPointType=" + this.f413938c + ')';
    }
}
