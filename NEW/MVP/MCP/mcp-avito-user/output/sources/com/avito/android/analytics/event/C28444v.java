package com.avito.android.analytics.event;

import com.avito.android.analytics.provider.clickstream.ParametrizedClickStreamEvent;
import com.avito.android.util.C35755b0;
import java.util.Map;
import kotlin.Metadata;

/* compiled from: ClickOnSimilarEvent.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/analytics/event/v;", "Lcom/avito/android/analytics/provider/clickstream/a;", "_avito-discouraged_avito-libs_favorite-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.analytics.event.v, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C28444v implements com.avito.android.analytics.provider.clickstream.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ParametrizedClickStreamEvent f90144b;

    public C28444v(@Y61.k String str, @Y61.l String str2) {
        this.f90144b = new ParametrizedClickStreamEvent(4977, 2, "Пользовательские события / Закладки / Клик на показать похожие при распроданном объявлении в избранном", C35755b0.c(kotlin.collections.P0.g(new kotlin.Q("uid", str2 == null ? "" : str2), new kotlin.Q("iid", str))));
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId */
    public final int getF328428b() {
        return this.f90144b.f90247b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @Y61.k
    public final Map<String, Object> getParams() {
        return this.f90144b.f90249d;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion */
    public final int getF328429c() {
        return this.f90144b.f90248c;
    }
}
