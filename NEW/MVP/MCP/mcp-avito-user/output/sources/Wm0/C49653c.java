package wm0;

import Y61.k;
import Y61.l;
import com.avito.android.analytics.provider.clickstream.ParametrizedClickStreamEvent;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.P0;

/* compiled from: RealtyRepairCalculatorRepairClickEvent.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lwm0/c;", "Lcom/avito/android/analytics/provider/clickstream/a;", "_avito_repair-calculator_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: wm0.c, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C49653c implements com.avito.android.analytics.provider.clickstream.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ParametrizedClickStreamEvent f441776b;

    public C49653c(@k String str, @l String str2, @l String str3) {
        this.f441776b = new ParametrizedClickStreamEvent(13343, 0, P0.j(new Q("x", str2 == null ? "" : str2), new Q("iid", str), new Q("services_repair_type", str3)), null, 8, null);
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId */
    public final int getF90129b() {
        return this.f441776b.f90247b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @k
    public final Map<String, Object> getParams() {
        return this.f441776b.f90249d;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion */
    public final int getF90130c() {
        return this.f441776b.f90248c;
    }
}
