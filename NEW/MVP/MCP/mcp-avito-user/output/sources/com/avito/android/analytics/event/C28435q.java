package com.avito.android.analytics.event;

import com.avito.android.analytics.provider.clickstream.ParametrizedClickStreamEvent;
import com.avito.android.util.C35755b0;
import java.util.Map;
import kotlin.Metadata;

/* compiled from: BuyContactEvent.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/analytics/event/q;", "Lcom/avito/android/analytics/provider/clickstream/a;", "_avito-discouraged_avito-app_core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.analytics.event.q, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C28435q implements com.avito.android.analytics.provider.clickstream.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ParametrizedClickStreamEvent f90126b;

    public C28435q(@Y61.l String str, @Y61.l String str2, @Y61.l String str3, @Y61.k String str4, @Y61.l String str5, @Y61.k String str6, @Y61.l String str7) {
        this.f90126b = new ParametrizedClickStreamEvent(13123, 0, "Нажатие кнопки Купить контакт", C35755b0.c(kotlin.collections.P0.g(new kotlin.Q("cid", str), new kotlin.Q("oid", str2), new kotlin.Q("mcid", str3), new kotlin.Q("iid", str4), new kotlin.Q("x", str5), new kotlin.Q("from_page", str6), new kotlin.Q("from_space", str7))));
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId */
    public final int getF328428b() {
        return this.f90126b.f90247b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @Y61.k
    public final Map<String, Object> getParams() {
        return this.f90126b.f90249d;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion */
    public final int getF328429c() {
        return this.f90126b.f90248c;
    }
}
