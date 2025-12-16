package Lr0;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.provider.clickstream.ParametrizedClickStreamEvent;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import org.webrtc.h;

/* compiled from: SuggestAddressClickEvent.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LLr0/a;", "Lcom/avito/android/analytics/provider/clickstream/a;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Lr0.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C14433a implements com.avito.android.analytics.provider.clickstream.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ParametrizedClickStreamEvent f10145b;

    public C14433a(@l Integer num, @l Integer num2, @l Integer num3, @l String str) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("cid", Integer.valueOf(num.intValue()));
        linkedHashMap.put("mcid", Integer.valueOf(num2.intValue()));
        h.i(num3, "lid", linkedHashMap);
        if (str != null) {
            linkedHashMap.put("geo_session", str);
        }
        G0 g02 = G0.f406611a;
        this.f10145b = new ParametrizedClickStreamEvent(8459, 1, linkedHashMap, null, 8, null);
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId */
    public final int getF83080b() {
        return this.f10145b.f90247b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @k
    public final Map<String, Object> getParams() {
        return this.f10145b.f90249d;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion */
    public final int getF83081c() {
        return this.f10145b.f90248c;
    }
}
