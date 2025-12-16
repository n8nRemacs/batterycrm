package j50;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import com.avito.android.orders_aggregation.OrdersAggregationIntentFactory;
import com.avito.android.orders_aggregation.api.remote.model.OrdersAggregationResult;
import i50.AbstractC41226a;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: GeneralOrdersAggregationTab.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lj50/a;", "Li50/a;", "_avito_orders-aggregation_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: j50.a, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final /* data */ class C42199a extends AbstractC41226a {

    /* renamed from: f, reason: collision with root package name */
    @k
    public final String f405425f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public final Integer f405426g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f405427h;

    /* renamed from: i, reason: collision with root package name */
    @l
    public final OrdersAggregationIntentFactory.GeneralOrdersData f405428i;

    /* JADX WARN: Illegal instructions before constructor call */
    public C42199a(String str, Integer num, boolean z12, OrdersAggregationIntentFactory.GeneralOrdersData generalOrdersData, int i12, C42822w c42822w) {
        num = (i12 & 2) != 0 ? null : num;
        z12 = (i12 & 4) != 0 ? false : z12;
        generalOrdersData = (i12 & 8) != 0 ? null : generalOrdersData;
        super(num, str, OrdersAggregationResult.Tab.Type.GOODS.f210206b, z12);
        this.f405425f = str;
        this.f405426g = num;
        this.f405427h = z12;
        this.f405428i = generalOrdersData;
    }

    @Override // i50.AbstractC41226a
    @l
    /* renamed from: a, reason: from getter */
    public final Integer getF413507g() {
        return this.f405426g;
    }

    @Override // i50.AbstractC41226a
    /* renamed from: b, reason: from getter */
    public final boolean getF413508h() {
        return this.f405427h;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C42199a)) {
            return false;
        }
        C42199a c42199a = (C42199a) obj;
        return L.f(this.f405425f, c42199a.f405425f) && L.f(this.f405426g, c42199a.f405426g) && this.f405427h == c42199a.f405427h && L.f(this.f405428i, c42199a.f405428i);
    }

    @Override // i50.AbstractC41226a, com.avito.android.lib.deprecated_design.tab.a
    @k
    /* renamed from: getTitle, reason: from getter */
    public final String getF86187d() {
        return this.f405425f;
    }

    public final int hashCode() {
        int iHashCode = this.f405425f.hashCode() * 31;
        Integer num = this.f405426g;
        int i12 = r.i((iHashCode + (num == null ? 0 : num.hashCode())) * 31, 31, this.f405427h);
        OrdersAggregationIntentFactory.GeneralOrdersData generalOrdersData = this.f405428i;
        return i12 + (generalOrdersData != null ? generalOrdersData.hashCode() : 0);
    }

    @k
    public final String toString() {
        return "GeneralOrdersAggregationTab(title=" + this.f405425f + ", count=" + this.f405426g + ", isTabPointShown=" + this.f405427h + ", arguments=" + this.f405428i + ')';
    }
}
