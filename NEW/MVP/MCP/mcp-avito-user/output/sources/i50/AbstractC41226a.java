package i50;

import Y61.k;
import Y61.l;
import kotlin.Metadata;

/* compiled from: OrdersAggregationTab.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b&\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Li50/a;", "Lcom/avito/android/lib/deprecated_design/tab/a;", "_avito_orders-aggregation_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: i50.a, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public abstract class AbstractC41226a implements com.avito.android.lib.deprecated_design.tab.a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f398357b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final Integer f398358c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final String f398359d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f398360e;

    public AbstractC41226a(@l Integer num, @k String str, @k String str2, boolean z12) {
        this.f398357b = str;
        this.f398358c = num;
        this.f398359d = str2;
        this.f398360e = z12;
    }

    @l
    /* renamed from: a, reason: from getter */
    public Integer getF398358c() {
        return this.f398358c;
    }

    /* renamed from: b, reason: from getter */
    public boolean getF398360e() {
        return this.f398360e;
    }

    @Override // com.avito.android.lib.deprecated_design.tab.a
    @l
    public final String getLabel() {
        Integer f398358c = getF398358c();
        if (f398358c != null) {
            return f398358c.toString();
        }
        return null;
    }

    @Override // com.avito.android.lib.deprecated_design.tab.a
    @k
    /* renamed from: getTitle, reason: from getter */
    public String getF398357b() {
        return this.f398357b;
    }
}
