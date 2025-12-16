package ik0;

import Y61.k;
import Y61.l;
import com.avito.android.analytics.provider.clickstream.ParametrizedClickStreamEvent;
import java.util.HashMap;
import java.util.Map;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: NativeVideoParsingError.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lik0/a;", "Lcom/avito/android/analytics/provider/clickstream/a;", "_avito-discouraged_avito-api_user-advert"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: ik0.a, reason: case insensitive filesystem */
/* loaded from: classes17.dex */
public final class C41419a implements com.avito.android.analytics.provider.clickstream.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ParametrizedClickStreamEvent f398714b;

    public C41419a(@l String str, @l String str2, @l String str3) {
        HashMap map = new HashMap();
        if (str != null) {
            map.put("mcid", str);
        }
        if (str2 != null) {
            map.put("iid", str2);
        }
        if (str3 != null) {
            map.put("error_detailed", str3);
        }
        G0 g02 = G0.f406611a;
        this.f398714b = new ParametrizedClickStreamEvent(12637, 2, map, null, 8, null);
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId */
    public final int getF19677b() {
        return this.f398714b.f90247b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @k
    public final Map<String, Object> getParams() {
        return this.f398714b.f90249d;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion */
    public final int getF19678c() {
        return this.f398714b.f90248c;
    }
}
