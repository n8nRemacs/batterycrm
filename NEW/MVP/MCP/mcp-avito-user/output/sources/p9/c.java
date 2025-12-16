package p9;

import Y61.k;
import com.avito.android.advert_core.development_offers.analytics.PageScrollDirection;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: DevelopmentOfferPageChangeEvent.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lp9/c;", "Lcom/avito/android/analytics/provider/clickstream/a;", "_avito_advert-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class c implements com.avito.android.analytics.provider.clickstream.a {

    /* renamed from: b, reason: collision with root package name */
    public final int f428220b;

    /* renamed from: c, reason: collision with root package name */
    public final int f428221c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final Map<String, Object> f428222d;

    public c() {
        throw null;
    }

    public c(String str, String str2, PageScrollDirection pageScrollDirection, int i12, int i13, Map map, int i14, C42822w c42822w) {
        str = (i14 & 1) != 0 ? null : str;
        str2 = (i14 & 2) != 0 ? null : str2;
        i12 = (i14 & 8) != 0 ? 6546 : i12;
        i13 = (i14 & 16) != 0 ? 1 : i13;
        if ((i14 & 32) != 0) {
            map = new LinkedHashMap();
            if (str != null) {
                map.put("iid", str);
            }
            if (str2 != null) {
                map.put("development_id", str2);
            }
            map.put("catalog_jk_type", pageScrollDirection.name().toLowerCase(Locale.ROOT));
        }
        this.f428220b = i12;
        this.f428221c = i13;
        this.f428222d = map;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId, reason: from getter */
    public final int getF428220b() {
        return this.f428220b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @k
    public final Map<String, Object> getParams() {
        return this.f428222d;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion, reason: from getter */
    public final int getF428221c() {
        return this.f428221c;
    }
}
