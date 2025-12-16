package com.avito.android.messenger.analytics;

import com.avito.android.analytics.provider.clickstream.ParametrizedClickStreamEvent;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.P0;

/* compiled from: AttachFileClickedEvent.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/analytics/a;", "Lcom/avito/android/analytics/provider/clickstream/a;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.messenger.analytics.a, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C31645a implements com.avito.android.analytics.provider.clickstream.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ParametrizedClickStreamEvent f186260b;

    public C31645a(@Y61.k String str, @Y61.k String str2) {
        this.f186260b = new ParametrizedClickStreamEvent(7851, 2, "Отправить файл (выбор из списка элементов для прикрепления)", P0.g(new kotlin.Q("item_id", str), new kotlin.Q("chatid", str2)));
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId */
    public final int getF83080b() {
        return this.f186260b.f90247b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @Y61.k
    public final Map<String, Object> getParams() {
        return this.f186260b.f90249d;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion */
    public final int getF83081c() {
        return this.f186260b.f90248c;
    }
}
