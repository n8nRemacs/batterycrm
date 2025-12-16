package Xz0;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.provider.clickstream.ParametrizedClickStreamEvent;
import com.avito.android.remote.model.search.InlineFilterValue;
import com.avito.android.str_seller_orders_important_to_note.domain.i;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.P0;

/* compiled from: ClickStreamAnalyticsEvent.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LXz0/a;", "Lcom/avito/android/analytics/provider/clickstream/a;", "_avito_str-seller-orders-important-to-note_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Xz0.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C17069a implements com.avito.android.analytics.provider.clickstream.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ParametrizedClickStreamEvent f19207b;

    public C17069a(int i12, int i13, @l i iVar) {
        Map mapC;
        if (iVar != null) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            if (iVar.f291327a != null) {
                linkedHashMap.put("actionType", iVar);
            }
            if (iVar.f291328b != null) {
                linkedHashMap.put(InlineFilterValue.InlineFilterDateRangeValue.FROM_PARAM_NAME, iVar);
            }
            if (iVar.f291329c != null) {
                linkedHashMap.put("fromPage", iVar);
            }
            if (iVar.f291330d != null) {
                linkedHashMap.put("iid", iVar);
            }
            if (iVar.f291331e != null) {
                linkedHashMap.put("orderidString", iVar);
            }
            String str = iVar.f291332f;
            if (str != null) {
                linkedHashMap.put("type", iVar);
            }
            if (str != null) {
                linkedHashMap.put("uid", iVar);
            }
            mapC = linkedHashMap;
        } else {
            mapC = P0.c();
        }
        this.f19207b = new ParametrizedClickStreamEvent(i12, i13, mapC, null, 8, null);
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId */
    public final int getF222438b() {
        return this.f19207b.f90247b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @k
    public final Map<String, Object> getParams() {
        return this.f19207b.f90249d;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion */
    public final int getF222439c() {
        return this.f19207b.f90248c;
    }
}
