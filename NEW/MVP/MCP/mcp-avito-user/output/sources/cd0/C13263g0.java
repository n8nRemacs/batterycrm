package Cd0;

import com.avito.android.analytics.provider.clickstream.ParametrizedClickStreamEvent;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import yc.C50213a;

/* compiled from: ItemAddScreenOpenEvent.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LCd0/g0;", "Lcom/avito/android/analytics/provider/clickstream/a;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Cd0.g0, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C13263g0 implements com.avito.android.analytics.provider.clickstream.a {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final C50213a f2440b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final String f2441c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final String f2442d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public final String f2443e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ParametrizedClickStreamEvent f2444f;

    public C13263g0(@Y61.l String str, @Y61.l String str2, @Y61.l String str3, @Y61.k C50213a c50213a) {
        this.f2440b = c50213a;
        this.f2441c = str;
        this.f2442d = str2;
        this.f2443e = str3;
        int i12 = str3 != null ? 1 : 0;
        LinkedHashMap linkedHashMapA = c50213a.a();
        if (str != null) {
            linkedHashMapA.put("item_add_screen", str);
        }
        if (str2 != null) {
            linkedHashMapA.put("from_source", str2);
        }
        if (str3 != null) {
            linkedHashMapA.put("string_param", str3);
        }
        this.f2444f = new ParametrizedClickStreamEvent(3071, i12, linkedHashMapA, null, 8, null);
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId */
    public final int getF328428b() {
        return this.f2444f.f90247b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @Y61.k
    public final Map<String, Object> getParams() {
        return this.f2444f.f90249d;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion */
    public final int getF328429c() {
        return this.f2444f.f90248c;
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ItemAddScreenOpenEvent (eventId = 3071, params = ");
        LinkedHashMap linkedHashMapA = this.f2440b.a();
        String str = this.f2441c;
        if (str != null) {
            linkedHashMapA.put("item_add_screen", str);
        }
        String str2 = this.f2442d;
        if (str2 != null) {
            linkedHashMapA.put("from_source", str2);
        }
        String str3 = this.f2443e;
        if (str3 != null) {
            linkedHashMapA.put("string_param", str3);
        }
        return org.webrtc.h.e(sb2, linkedHashMapA, ')');
    }

    public /* synthetic */ C13263g0(C50213a c50213a, String str, String str2, String str3, int i12, C42822w c42822w) {
        this(str, (i12 & 4) != 0 ? null : str2, (i12 & 8) != 0 ? null : str3, c50213a);
    }
}
