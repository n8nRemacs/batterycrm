package com.avito.android.analytics.event;

import com.avito.android.util.C35755b0;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: ScreenNavigationEvent.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/analytics/event/y0;", "Lcom/avito/android/analytics/provider/clickstream/a;", "_avito_analytics_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.analytics.event.y0, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C28451y0 implements com.avito.android.analytics.provider.clickstream.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.analytics.provider.clickstream.b f90149b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final LinkedHashMap f90150c;

    public C28451y0(@Y61.k String str, @Y61.k String str2, boolean z12, @Y61.l String str3) {
        this.f90149b = new com.avito.android.analytics.provider.clickstream.b(3253, 4);
        this.f90150c = C35755b0.c(kotlin.collections.P0.g(new kotlin.Q("from_page", z12 ? "tabbar" : "drawer"), new kotlin.Q("target_page", str), new kotlin.Q("current_tab", str2), new kotlin.Q("from_source", str3)));
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId */
    public final int getF83080b() {
        return this.f90149b.f90262b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @Y61.k
    public final Map<String, String> getParams() {
        return this.f90150c;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion */
    public final int getF83081c() {
        return this.f90149b.f90263c;
    }

    public /* synthetic */ C28451y0(String str, String str2, boolean z12, String str3, int i12, C42822w c42822w) {
        this(str, str2, z12, (i12 & 8) != 0 ? null : str3);
    }
}
