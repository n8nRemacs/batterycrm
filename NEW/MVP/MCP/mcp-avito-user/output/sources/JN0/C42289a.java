package jN0;

import Y61.k;
import Y61.l;
import com.avito.android.analytics.provider.clickstream.ParametrizedClickStreamEvent;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: ShowVideoRequirementsBottomSheetEvent.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LjN0/a;", "Lcom/avito/android/analytics/provider/clickstream/a;", "_avito_video-requirements_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: jN0.a, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C42289a implements com.avito.android.analytics.provider.clickstream.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ParametrizedClickStreamEvent f405600b;

    public C42289a(@l Integer num, @l String str, @l String str2, @l String str3) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (num != null) {
            linkedHashMap.put("cid", String.valueOf(num.intValue()));
        }
        if (str != null) {
            linkedHashMap.put("iid", str);
        }
        if (str2 != null) {
            linkedHashMap.put("esid", str2);
        }
        linkedHashMap.put("from_page", str3);
        G0 g02 = G0.f406611a;
        this.f405600b = new ParametrizedClickStreamEvent(14180, 3, linkedHashMap, null, 8, null);
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId */
    public final int getF19677b() {
        return this.f405600b.f90247b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @k
    public final Map<String, Object> getParams() {
        return this.f405600b.f90249d;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion */
    public final int getF19678c() {
        return this.f405600b.f90248c;
    }
}
