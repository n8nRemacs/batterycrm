package l50;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import com.avito.android.orders_aggregation.api.remote.model.OrdersAggregationResult;
import i50.AbstractC41226a;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: ServicesOrdersTab.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Ll50/a;", "Li50/a;", "_avito_orders-aggregation_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: l50.a, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final /* data */ class C43546a extends AbstractC41226a {

    /* renamed from: f, reason: collision with root package name */
    @k
    public final String f413506f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public final Integer f413507g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f413508h;

    public /* synthetic */ C43546a(String str, Integer num, boolean z12, int i12, C42822w c42822w) {
        this((i12 & 2) != 0 ? null : num, str, (i12 & 4) != 0 ? false : z12);
    }

    @Override // i50.AbstractC41226a
    @l
    /* renamed from: a, reason: from getter */
    public final Integer getF413507g() {
        return this.f413507g;
    }

    @Override // i50.AbstractC41226a
    /* renamed from: b, reason: from getter */
    public final boolean getF413508h() {
        return this.f413508h;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C43546a)) {
            return false;
        }
        C43546a c43546a = (C43546a) obj;
        return L.f(this.f413506f, c43546a.f413506f) && L.f(this.f413507g, c43546a.f413507g) && this.f413508h == c43546a.f413508h;
    }

    @Override // i50.AbstractC41226a, com.avito.android.lib.deprecated_design.tab.a
    @k
    /* renamed from: getTitle, reason: from getter */
    public final String getF413506f() {
        return this.f413506f;
    }

    public final int hashCode() {
        int iHashCode = this.f413506f.hashCode() * 31;
        Integer num = this.f413507g;
        return Boolean.hashCode(this.f413508h) + ((iHashCode + (num == null ? 0 : num.hashCode())) * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ServicesOrdersTab(title=");
        sb2.append(this.f413506f);
        sb2.append(", count=");
        sb2.append(this.f413507g);
        sb2.append(", isTabPointShown=");
        return r.x(sb2, this.f413508h, ')');
    }

    public C43546a(@l Integer num, @k String str, boolean z12) {
        super(num, str, OrdersAggregationResult.Tab.Type.ORDERS_SERVICES.f210206b, z12);
        this.f413506f = str;
        this.f413507g = num;
        this.f413508h = z12;
    }
}
