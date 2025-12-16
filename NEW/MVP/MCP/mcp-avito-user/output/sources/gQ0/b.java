package gq0;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.provider.clickstream.ParametrizedClickStreamEvent;
import com.avito.android.remote.model.category_parameters.MetroParameter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.P0;
import kotlin.jvm.internal.s0;

/* compiled from: SelectMetroCloseScreenEvent.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lgq0/b;", "Lcom/avito/android/analytics/provider/clickstream/a;", "_avito_select_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class b implements com.avito.android.analytics.provider.clickstream.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ParametrizedClickStreamEvent f396875b;

    public b(int i12, @l Integer num, boolean z12, @k ArrayList arrayList, @k String str) {
        HashMap mapE = P0.e(new Q("geo_session", str), new Q("lid", Integer.valueOf(i12)), new Q("from_block", Integer.valueOf(z12 ? 1 : 0)), new Q("from_page", MetroParameter.TYPE));
        if (num != null) {
            mapE.put("cid", Integer.valueOf(num.intValue()));
        }
        if (!arrayList.isEmpty()) {
            mapE.put(MetroParameter.TYPE, arrayList);
        }
        G0 g02 = G0.f406611a;
        this.f396875b = new ParametrizedClickStreamEvent(3378, 10, mapE, null, 8, null);
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId */
    public final int getF224266b() {
        return this.f396875b.f90247b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @k
    public final Map<String, Object> getParams() {
        return this.f396875b.f90249d;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion */
    public final int getF224267c() {
        return this.f396875b.f90248c;
    }
}
