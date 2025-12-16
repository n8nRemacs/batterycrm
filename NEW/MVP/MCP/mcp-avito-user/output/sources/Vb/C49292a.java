package vb;

import Y61.k;
import Y61.l;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.P0;

/* compiled from: BrandspaceEntryPointViewEvent.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lvb/a;", "Lcom/avito/android/analytics/provider/clickstream/a;", "_avito_advertising_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: vb.a, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C49292a implements com.avito.android.analytics.provider.clickstream.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.analytics.provider.clickstream.b f440868b = new com.avito.android.analytics.provider.clickstream.b(4749, 1);

    /* renamed from: c, reason: collision with root package name */
    @k
    public final LinkedHashMap f440869c;

    public C49292a(@l String str, @k String str2) {
        this.f440869c = P0.j(new Q("brand_slug", str2), new Q("bs_entry_point_type", str));
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId */
    public final int getF270967b() {
        return this.f440868b.f90262b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @k
    public final Map<String, Object> getParams() {
        return this.f440869c;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion */
    public final int getF270968c() {
        return this.f440868b.f90263c;
    }
}
