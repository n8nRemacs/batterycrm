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
import kotlin.jvm.internal.s0;

/* compiled from: StrBookingConfirmationSubmittedEvent.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LYv0/b;", "Lcom/avito/android/analytics/provider/clickstream/a;", "_avito_short-term-rent_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Yv0.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C18332b implements com.avito.android.analytics.provider.clickstream.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ParametrizedClickStreamEvent f19733b;

    public C18332b(@k String str, @l String str2, @l String str3) {
        LinkedHashMap linkedHashMapJ = P0.j(new Q("iid", str));
        if (str2 != null) {
            linkedHashMapJ.put("srcp", str2);
        }
        if (str3 != null) {
            linkedHashMapJ.put("x", str3);
        }
        G0 g02 = G0.f406611a;
        this.f19733b = new ParametrizedClickStreamEvent(2905, 3, linkedHashMapJ, null, 8, null);
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId */
    public final int getF328428b() {
        return this.f19733b.f90247b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @k
    public final Map<String, Object> getParams() {
        return this.f19733b.f90249d;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion */
    public final int getF328429c() {
        return this.f19733b.f90248c;
    }
}
