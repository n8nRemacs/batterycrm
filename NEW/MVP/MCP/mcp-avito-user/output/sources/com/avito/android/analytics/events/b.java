package com.avito.android.analytics.events;

import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.provider.clickstream.ParametrizedClickStreamEvent;
import com.huawei.updatesdk.service.otaupdate.UpdateDialogStatusCode;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import yc.C50213a;

/* compiled from: ClickDescriptionUrlEvent.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/analytics/events/b;", "Lcom/avito/android/analytics/provider/clickstream/a;", "_avito-discouraged_avito-libs_publish-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class b implements com.avito.android.analytics.provider.clickstream.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ParametrizedClickStreamEvent f90153b;

    public b(@Y61.k C50213a c50213a) {
        LinkedHashMap linkedHashMapA = c50213a.a();
        c50213a.c();
        linkedHashMapA.put("esid", c50213a.c().f406620c);
        this.f90153b = new ParametrizedClickStreamEvent(UpdateDialogStatusCode.DISMISS, 0, linkedHashMapA, null, 8, null);
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId */
    public final int getF90129b() {
        return this.f90153b.f90247b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @Y61.k
    public final Map<String, Object> getParams() {
        return this.f90153b.f90249d;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion */
    public final int getF90130c() {
        return this.f90153b.f90248c;
    }
}
