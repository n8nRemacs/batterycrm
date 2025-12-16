package Bs;

import Y61.k;
import Y61.l;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: InstallmentsPlanSelectEvent.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LBs/e;", "Lcom/avito/android/analytics/provider/clickstream/a;", "_avito_credits_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class e implements com.avito.android.analytics.provider.clickstream.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.analytics.provider.clickstream.b f1741b = new com.avito.android.analytics.provider.clickstream.b(10923, 4);

    /* renamed from: c, reason: collision with root package name */
    @k
    public final kotlin.collections.builders.d f1742c;

    public e(@l String str, @l String str2, @l String str3) {
        kotlin.collections.builders.d dVar = new kotlin.collections.builders.d();
        if (str != null) {
            dVar.put("from_page", str);
        }
        if (str2 != null) {
            dVar.put("installments_plan", str2);
        }
        if (str3 != null) {
            dVar.put("item_id", str3);
        }
        this.f1742c = dVar.b();
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId */
    public final int getF270967b() {
        return this.f1741b.f90262b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @k
    public final Map<String, Object> getParams() {
        return this.f1742c;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion */
    public final int getF270968c() {
        return this.f1741b.f90263c;
    }
}
