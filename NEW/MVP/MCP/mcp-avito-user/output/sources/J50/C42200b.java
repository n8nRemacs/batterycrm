package j50;

import Y61.k;
import Y61.l;
import androidx.fragment.app.Fragment;
import com.avito.android.orders_aggregation.OrdersAggregationIntentFactory;
import com.avito.android.orders_aggregation_core.h;
import kotlin.Metadata;

/* compiled from: GeneralTabBlueprint.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lj50/b;", "Lcom/avito/android/lib/deprecated_design/tab/b;", "Lj50/a;", "_avito_orders-aggregation_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: j50.b, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C42200b implements com.avito.android.lib.deprecated_design.tab.b<C42199a> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final h f405429a;

    public C42200b(@k h hVar) {
        this.f405429a = hVar;
    }

    @Override // com.avito.android.lib.deprecated_design.tab.b
    @l
    public final Fragment a(@k com.avito.android.lib.deprecated_design.tab.a aVar) {
        OrdersAggregationIntentFactory.GeneralOrdersData generalOrdersData = ((C42199a) aVar).f405428i;
        return this.f405429a.a(generalOrdersData != null ? generalOrdersData.f210199b : null, generalOrdersData != null ? generalOrdersData.f210200c : null);
    }

    @Override // com.avito.android.lib.deprecated_design.tab.b
    public final boolean b(@k com.avito.android.lib.deprecated_design.tab.a aVar) {
        return aVar instanceof C42199a;
    }
}
