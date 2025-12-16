package com.avito.android.installments.fakedoor;

import androidx.compose.runtime.internal.P;
import java.util.Map;
import kotlin.Metadata;

/* compiled from: InstallmentsFakedoorShownEvent.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/installments/fakedoor/k;", "Lcom/avito/android/analytics/provider/clickstream/a;", "_avito_installments_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class k implements com.avito.android.analytics.provider.clickstream.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.analytics.provider.clickstream.b f172559b = new com.avito.android.analytics.provider.clickstream.b(15044, 0);

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final kotlin.collections.builders.d f172560c;

    public k(@Y61.k String str, long j12, @Y61.k String str2) {
        kotlin.collections.builders.d dVar = new kotlin.collections.builders.d();
        dVar.put("item_id", Long.valueOf(j12));
        dVar.put("installments_plan", str2);
        dVar.put("from_page", str);
        this.f172560c = dVar.b();
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId */
    public final int getF6279b() {
        return this.f172559b.f90262b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @Y61.k
    public final Map<String, Object> getParams() {
        return this.f172560c;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion */
    public final int getF6280c() {
        return this.f172559b.f90263c;
    }
}
