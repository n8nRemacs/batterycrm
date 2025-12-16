package Yv0;

import Y61.k;
import Y61.l;
import com.avito.android.analytics.provider.clickstream.ParametrizedClickStreamEvent;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import kotlin.text.C43066x;

/* compiled from: StrBookingMoveToNextPageEvent.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LYv0/f;", "Lcom/avito/android/analytics/provider/clickstream/a;", "_avito_short-term-rent_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Yv0.f, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C18336f implements com.avito.android.analytics.provider.clickstream.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ParametrizedClickStreamEvent f19737b;

    public C18336f(@k String str, @l String str2) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Long lZ02 = C43066x.z0(str);
        if (lZ02 != null) {
            linkedHashMap.put("iid", Long.valueOf(lZ02.longValue()));
        }
        if (str2 != null) {
            linkedHashMap.put("x", str2);
        }
        G0 g02 = G0.f406611a;
        this.f19737b = new ParametrizedClickStreamEvent(14102, 6, linkedHashMap, null, 8, null);
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId */
    public final int getF75431b() {
        return this.f19737b.f90247b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @k
    public final Map<String, Object> getParams() {
        return this.f19737b.f90249d;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion */
    public final int getF75432c() {
        return this.f19737b.f90248c;
    }
}
