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

/* compiled from: FakeDoorCloseClickEvent.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LkC/b;", "Lcom/avito/android/analytics/provider/clickstream/a;", "_avito_fakedoor-dialog_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: kC.b, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C42567b implements com.avito.android.analytics.provider.clickstream.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ParametrizedClickStreamEvent f406197b;

    public C42567b(@k String str, @l Map<String, String> map) {
        LinkedHashMap linkedHashMapJ = P0.j(new Q("from_page", str));
        if (map != null) {
            linkedHashMapJ.putAll(C35755b0.c(map));
        }
        G0 g02 = G0.f406611a;
        this.f406197b = new ParametrizedClickStreamEvent(6874, 1, linkedHashMapJ, null, 8, null);
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId */
    public final int getF328428b() {
        return this.f406197b.f90247b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @k
    public final Map<String, Object> getParams() {
        return this.f406197b.f90249d;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion */
    public final int getF328429c() {
        return this.f406197b.f90248c;
    }
}
