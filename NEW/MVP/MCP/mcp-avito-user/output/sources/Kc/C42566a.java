package kC;

import Y61.k;
import Y61.l;
import com.avito.android.analytics.provider.clickstream.ParametrizedClickStreamEvent;
import com.avito.android.util.C35755b0;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.P0;

/* compiled from: FakeDoorButtonClickEvent.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LkC/a;", "Lcom/avito/android/analytics/provider/clickstream/a;", "_avito_fakedoor-dialog_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: kC.a, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C42566a implements com.avito.android.analytics.provider.clickstream.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ParametrizedClickStreamEvent f406196b;

    public C42566a(@k String str, @k String str2, @l Map<String, String> map) {
        LinkedHashMap linkedHashMapJ = P0.j(new Q("from_page", str), new Q("action_value", str2));
        if (map != null) {
            linkedHashMapJ.putAll(C35755b0.c(map));
        }
        G0 g02 = G0.f406611a;
        this.f406196b = new ParametrizedClickStreamEvent(6873, 1, linkedHashMapJ, null, 8, null);
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId */
    public final int getF328428b() {
        return this.f406196b.f90247b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @k
    public final Map<String, Object> getParams() {
        return this.f406196b.f90249d;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion */
    public final int getF328429c() {
        return this.f406196b.f90248c;
    }
}
