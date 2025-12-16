package i8;

import Y61.k;
import Y61.l;
import com.avito.android.analytics.provider.clickstream.ParametrizedClickStreamEvent;
import com.avito.android.util.C35755b0;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.P0;

/* compiled from: AdvertBeduinRenderingSuccess.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Li8/b;", "Lcom/avito/android/analytics/provider/clickstream/a;", "_avito_advert-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class b implements com.avito.android.analytics.provider.clickstream.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ParametrizedClickStreamEvent f398363b;

    public b(@k String str, @l String str2, int i12, @k String str3, @l Integer num, @l Integer num2, @l Integer num3, @l Integer num4, @l Boolean bool) {
        this.f398363b = new ParametrizedClickStreamEvent(11109, 3, "Событие содержит в себе результат рендера Beduin-сценария", C35755b0.c(P0.g(new Q("iid", str2), new Q("rqid", str), new Q("bricks_template_id", Integer.valueOf(i12)), new Q("bricks_template_slug", str3), new Q("bricks_node_id", num3), new Q("bricks_layout_version", num4), new Q("requested_bricks_node_id", Integer.valueOf(num.intValue())), new Q("requested_bricks_layout_version", Integer.valueOf(num2.intValue())), new Q("is_degraded", Boolean.valueOf(bool.booleanValue())))));
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId */
    public final int getF328428b() {
        return this.f398363b.f90247b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @k
    public final Map<String, Object> getParams() {
        return this.f398363b.f90249d;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion */
    public final int getF328429c() {
        return this.f398363b.f90248c;
    }
}
