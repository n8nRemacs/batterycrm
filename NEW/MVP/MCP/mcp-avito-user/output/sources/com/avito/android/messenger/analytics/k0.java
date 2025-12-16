package com.avito.android.messenger.analytics;

import java.util.Map;
import kotlin.Metadata;

/* compiled from: SupportChatFormOpenedEvent.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/messenger/analytics/k0;", "Lcom/avito/android/analytics/provider/clickstream/a;", "<init>", "()V", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class k0 implements com.avito.android.analytics.provider.clickstream.a {

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public static final k0 f186294c = new k0();

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.analytics.provider.clickstream.b f186295b = new com.avito.android.analytics.provider.clickstream.b(4842, 0);

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId */
    public final int getF441796b() {
        return this.f186295b.f90262b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @Y61.k
    public final Map<String, Object> getParams() {
        return this.f186295b.f90264d;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion */
    public final int getF441797c() {
        return this.f186295b.f90263c;
    }
}
