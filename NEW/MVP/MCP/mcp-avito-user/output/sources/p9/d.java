package p9;

import Y61.k;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: DevelopmentOfferShowEvent.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lp9/d;", "Lcom/avito/android/analytics/provider/clickstream/a;", "_avito_advert-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class d implements com.avito.android.analytics.provider.clickstream.a {

    /* renamed from: b, reason: collision with root package name */
    public final int f428223b;

    /* renamed from: c, reason: collision with root package name */
    public final int f428224c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final Map<String, Object> f428225d;

    public d() {
        this(null, null, 0, 0, null, 31, null);
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId, reason: from getter */
    public final int getF428223b() {
        return this.f428223b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @k
    public final Map<String, Object> getParams() {
        return this.f428225d;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion, reason: from getter */
    public final int getF428224c() {
        return this.f428224c;
    }

    public d(String str, String str2, int i12, int i13, Map map, int i14, C42822w c42822w) {
        str = (i14 & 1) != 0 ? null : str;
        str2 = (i14 & 2) != 0 ? null : str2;
        i12 = (i14 & 4) != 0 ? 6532 : i12;
        i13 = (i14 & 8) != 0 ? 3 : i13;
        if ((i14 & 16) != 0) {
            map = new LinkedHashMap();
            if (str != null) {
                map.put("iid", str);
            }
            if (str2 != null) {
                map.put("development_id", str2);
            }
        }
        this.f428223b = i12;
        this.f428224c = i13;
        this.f428225d = map;
    }
}
