package com.avito.android.analytics.event;

import com.avito.android.remote.model.category_parameters.MetroParameter;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;

/* compiled from: DevelopmentsCatalogShowPhoneEvent.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/analytics/event/D;", "Lcom/avito/android/analytics/provider/clickstream/a;", "_avito_analytics_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class D implements com.avito.android.analytics.provider.clickstream.a {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f89927b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final ArrayList f89928c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final String f89929d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public final String f89930e;

    public D(@Y61.k String str, @Y61.l String str2, @Y61.l String str3, @Y61.k ArrayList arrayList) {
        this.f89927b = str;
        this.f89928c = arrayList;
        this.f89929d = str2;
        this.f89930e = str3;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId */
    public final int getF420184b() {
        return 3461;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @Y61.k
    public final Map<String, Object> getParams() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("RealtyDevelopment_id", this.f89927b);
        ArrayList arrayList = this.f89928c;
        if (!arrayList.isEmpty()) {
            linkedHashMap.put(MetroParameter.TYPE, arrayList);
        }
        linkedHashMap.put("from_page", "item");
        String str = this.f89929d;
        if (str != null) {
            linkedHashMap.put("x", str);
        }
        linkedHashMap.put("mcid", 4918);
        linkedHashMap.put("cid", 24);
        String str2 = this.f89930e;
        if (str2 != null) {
            linkedHashMap.put("lid", str2);
        }
        return linkedHashMap;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    public final int getVersion() {
        return 2;
    }
}
