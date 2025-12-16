package iI0;

import com.avito.android.analytics.provider.clickstream.ParametrizedClickStreamEvent;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.P0;
import kotlin.jvm.internal.C42822w;

/* compiled from: AutoPublishFromPushErrorEvent.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LiI0/d;", "Lcom/avito/android/analytics/provider/clickstream/a;", "_avito_user-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: iI0.d, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C41299d implements com.avito.android.analytics.provider.clickstream.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ParametrizedClickStreamEvent f398481b;

    public C41299d(@Y61.k String str, @Y61.l Integer num, @Y61.l String str2) {
        LinkedHashMap linkedHashMapJ = P0.j(new Q("iid", str));
        if (num != null) {
            linkedHashMapJ.put("err", num);
        }
        if (str2 != null) {
            linkedHashMapJ.put("errors_detailed", str2);
        }
        this.f398481b = new ParametrizedClickStreamEvent(4473, 0, linkedHashMapJ, null, 8, null);
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId */
    public final int getF90129b() {
        return this.f398481b.f90247b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @Y61.k
    public final Map<String, Object> getParams() {
        return this.f398481b.f90249d;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion */
    public final int getF90130c() {
        return this.f398481b.f90248c;
    }

    public /* synthetic */ C41299d(String str, Integer num, String str2, int i12, C42822w c42822w) {
        this(str, (i12 & 2) != 0 ? null : num, (i12 & 4) != 0 ? null : str2);
    }
}
