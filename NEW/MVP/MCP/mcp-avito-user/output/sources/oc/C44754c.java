package oc;

import Y61.k;
import Y61.l;
import com.avito.android.analytics.provider.clickstream.ParametrizedClickStreamEvent;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: NotificationClickEvent2618.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Loc/c;", "Lcom/avito/android/analytics/provider/clickstream/a;", "_avito_analytics_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: oc.c, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C44754c implements com.avito.android.analytics.provider.clickstream.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ParametrizedClickStreamEvent f419963b;

    public C44754c(@k Map<String, String> map, @l String str) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (str != null) {
        }
        linkedHashMap.putAll(map);
        G0 g02 = G0.f406611a;
        this.f419963b = new ParametrizedClickStreamEvent(2618, 13, linkedHashMap, null, 8, null);
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId */
    public final int getF19677b() {
        return this.f419963b.f90247b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @k
    public final Map<String, Object> getParams() {
        return this.f419963b.f90249d;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion */
    public final int getF19678c() {
        return this.f419963b.f90248c;
    }

    public /* synthetic */ C44754c(Map map, String str, int i12, C42822w c42822w) {
        this(map, (i12 & 2) != 0 ? null : str);
    }
}
