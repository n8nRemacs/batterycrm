package Bs;

import Y61.k;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.P0;
import kotlin.jvm.internal.s0;

/* compiled from: UnhandledInstallmentFormEvent.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"LBs/f;", "Lcom/avito/android/analytics/provider/clickstream/a;", "Lcc/e;", "_avito_credits_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class f implements com.avito.android.analytics.provider.clickstream.a, cc.e {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.analytics.provider.clickstream.b f1743b = new com.avito.android.analytics.provider.clickstream.b(9917, 0);

    /* renamed from: c, reason: collision with root package name */
    @k
    public final LinkedHashMap f1744c;

    public f(@k String str, @k kotlin.collections.builders.d dVar) {
        LinkedHashMap linkedHashMapJ = P0.j(new Q("js_event_type", str));
        linkedHashMapJ.putAll(dVar);
        this.f1744c = linkedHashMapJ;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId */
    public final int getF224266b() {
        return this.f1743b.f90262b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @k
    public final Map<String, Object> getParams() {
        return this.f1744c;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion */
    public final int getF224267c() {
        return this.f1743b.f90263c;
    }
}
