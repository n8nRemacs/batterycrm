package lI;

import Y61.k;
import Y61.l;
import com.avito.android.analytics.provider.clickstream.ParametrizedClickStreamEvent;
import java.util.HashMap;
import java.util.Map;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: ShowHeroBannerEvent.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LlI/b;", "Lcom/avito/android/analytics/provider/clickstream/a;", "_avito_bx-content_widget_hero-banner_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: lI.b, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C43639b implements com.avito.android.analytics.provider.clickstream.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ParametrizedClickStreamEvent f413692b;

    public C43639b(@l String str, @l String str2) {
        HashMap map = new HashMap();
        if (str != null) {
            map.put("target_page", str);
        }
        if (str2 != null) {
            map.put("attr_title", str2);
        }
        map.put("from_page", "main");
        G0 g02 = G0.f406611a;
        this.f413692b = new ParametrizedClickStreamEvent(11429, 1, map, null, 8, null);
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId */
    public final int getF19677b() {
        return this.f413692b.f90247b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @k
    public final Map<String, Object> getParams() {
        return this.f413692b.f90249d;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion */
    public final int getF19678c() {
        return this.f413692b.f90248c;
    }
}
