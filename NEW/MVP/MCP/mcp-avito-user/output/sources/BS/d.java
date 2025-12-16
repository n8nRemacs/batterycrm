package Bs;

import Y61.k;
import Y61.l;
import com.avito.android.remote.model.AdvertDetailsBlockIdKt;
import com.avito.android.remote.model.notifications_settings.NotificationsSettings;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: FloatingViewToggleEvent.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LBs/d;", "Lcom/avito/android/analytics/provider/clickstream/a;", "_avito_credits_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class d implements com.avito.android.analytics.provider.clickstream.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.analytics.provider.clickstream.b f1739b = new com.avito.android.analytics.provider.clickstream.b(14182, 3);

    /* renamed from: c, reason: collision with root package name */
    @k
    public final kotlin.collections.builders.d f1740c;

    public d(@l String str, @k String str2, boolean z12, @l String str3) {
        kotlin.collections.builders.d dVar = new kotlin.collections.builders.d();
        dVar.put("item_id", str2);
        if (str != null) {
            dVar.put("from_page", str);
        }
        dVar.put("action_value", z12 ? AdvertDetailsBlockIdKt.BLOCK_ID_CREDIT_CALCULATOR : NotificationsSettings.Section.SECTION_DELIVERY);
        if (str3 != null) {
            dVar.put("installments_plan", str3);
        }
        this.f1740c = dVar.b();
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId */
    public final int getF270967b() {
        return this.f1739b.f90262b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @k
    public final Map<String, Object> getParams() {
        return this.f1740c;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion */
    public final int getF270968c() {
        return this.f1739b.f90263c;
    }
}
