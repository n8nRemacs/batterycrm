package Yv0;

import Y61.k;
import Y61.l;
import com.avito.android.analytics.provider.clickstream.ParametrizedClickStreamEvent;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.P0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: StrBookingScreenShownEvent.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LYv0/h;", "Lcom/avito/android/analytics/provider/clickstream/a;", "_avito_short-term-rent_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Yv0.h, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C18338h implements com.avito.android.analytics.provider.clickstream.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ParametrizedClickStreamEvent f19739b;

    public C18338h(@l Integer num, @k String str, @l String str2, @l String str3, @l String str4, boolean z12) {
        LinkedHashMap linkedHashMapJ = P0.j(new Q("iid", str), new Q("no_refund_flag", Boolean.valueOf(z12)));
        if (str2 != null) {
            linkedHashMapJ.put("uid", str2);
        }
        if (str3 != null) {
            linkedHashMapJ.put("srcp", str3);
        }
        if (num != null) {
            linkedHashMapJ.put("dates_selected", num);
        }
        if (str4 != null) {
            linkedHashMapJ.put("from_page", str4);
        }
        G0 g02 = G0.f406611a;
        this.f19739b = new ParametrizedClickStreamEvent(2580, 12, linkedHashMapJ, null, 8, null);
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId */
    public final int getF328428b() {
        return this.f19739b.f90247b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @k
    public final Map<String, Object> getParams() {
        return this.f19739b.f90249d;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion */
    public final int getF328429c() {
        return this.f19739b.f90248c;
    }

    public /* synthetic */ C18338h(String str, String str2, String str3, Integer num, boolean z12, String str4, int i12, C42822w c42822w) {
        this((i12 & 8) != 0 ? null : num, str, (i12 & 2) != 0 ? null : str2, (i12 & 4) != 0 ? null : str3, (i12 & 32) != 0 ? null : str4, z12);
    }
}
