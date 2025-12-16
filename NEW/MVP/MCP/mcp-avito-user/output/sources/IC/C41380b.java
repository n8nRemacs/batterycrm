package ic;

import Y61.k;
import Y61.l;
import com.avito.android.analytics.provider.clickstream.ParametrizedClickStreamEvent;
import com.avito.android.util.C35755b0;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.P0;

/* compiled from: BeduinRenderingSuccess.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lic/b;", "Lcom/avito/android/analytics/provider/clickstream/a;", "_avito_analytics_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: ic.b, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C41380b implements com.avito.android.analytics.provider.clickstream.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ParametrizedClickStreamEvent f398586b;

    public C41380b(@k String str, int i12, @k String str2, @l Integer num, @l Integer num2, @l Integer num3, @l Integer num4, @l Boolean bool) {
        this.f398586b = new ParametrizedClickStreamEvent(11109, 2, "Событие содержит в себе результат рендера Beduin-сценария", C35755b0.c(P0.g(new Q("rqid", str), new Q("bricks_template_id", Integer.valueOf(i12)), new Q("bricks_template_slug", str2), new Q("bricks_node_id", num3), new Q("bricks_layout_version", num4), new Q("requested_bricks_node_id", Integer.valueOf(num.intValue())), new Q("requested_bricks_layout_version", Integer.valueOf(num2.intValue())), new Q("is_degraded", Boolean.valueOf(bool.booleanValue())))));
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId */
    public final int getF328428b() {
        return this.f398586b.f90247b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @k
    public final Map<String, Object> getParams() {
        return this.f398586b.f90249d;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion */
    public final int getF328429c() {
        return this.f398586b.f90248c;
    }
}
