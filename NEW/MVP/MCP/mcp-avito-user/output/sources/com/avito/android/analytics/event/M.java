package com.avito.android.analytics.event;

import com.avito.android.analytics.provider.clickstream.ParametrizedClickStreamEvent;
import com.avito.android.util.C35755b0;
import java.util.Map;
import kotlin.Metadata;

/* compiled from: GigApplyEvent.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/analytics/event/M;", "Lcom/avito/android/analytics/provider/clickstream/a;", "_avito-discouraged_avito-app_core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class M implements com.avito.android.analytics.provider.clickstream.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ParametrizedClickStreamEvent f89959b;

    public M(@Y61.l String str, @Y61.l Long l12, @Y61.l String str2, @Y61.l String str3, @Y61.k String str4, @Y61.l String str5, @Y61.l String str6) {
        this.f89959b = new ParametrizedClickStreamEvent(13630, 0, "Нажатие кнопки Записаться на смену", C35755b0.c(kotlin.collections.P0.g(new kotlin.Q("cid", str), new kotlin.Q("oid", str2), new kotlin.Q("mcid", str3), new kotlin.Q("iid", str4), new kotlin.Q("x", str5), new kotlin.Q("from_space", str6), new kotlin.Q("shift_id", l12))));
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId */
    public final int getF328428b() {
        return this.f89959b.f90247b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @Y61.k
    public final Map<String, Object> getParams() {
        return this.f89959b.f90249d;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion */
    public final int getF328429c() {
        return this.f89959b.f90248c;
    }
}
