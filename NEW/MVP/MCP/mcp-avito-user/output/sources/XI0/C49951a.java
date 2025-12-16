package xi0;

import Y61.k;
import Y61.l;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.builders.d;

/* compiled from: RecallMeSendFormEvent.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lxi0/a;", "Lcom/avito/android/analytics/provider/clickstream/a;", "_avito_recall-me_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: xi0.a, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C49951a implements com.avito.android.analytics.provider.clickstream.a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final d f442610b;

    public C49951a(@k String str, @l Long l12) {
        d dVar = new d();
        dVar.put("iid", str);
        if (l12 != null) {
            dVar.put("recallme_request_id", l12);
        }
        this.f442610b = dVar.b();
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId */
    public final int getF19127b() {
        return 6608;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @k
    public final Map<String, Object> getParams() {
        return this.f442610b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion */
    public final int getF11770c() {
        return 1;
    }
}
