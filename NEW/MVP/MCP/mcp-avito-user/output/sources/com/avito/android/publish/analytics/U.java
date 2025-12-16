package com.avito.android.publish.analytics;

import com.avito.android.analytics.InterfaceC28373a;
import javax.inject.Inject;
import kotlin.Metadata;
import sf0.C48167a;

/* compiled from: PublishNetworkStoresFakeDoorEventTracker.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/analytics/U;", "Lcom/avito/android/publish/analytics/T;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class U implements T {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f232185a;

    @Inject
    public U(@Y61.k InterfaceC28373a interfaceC28373a) {
        this.f232185a = interfaceC28373a;
    }

    @Override // com.avito.android.publish.analytics.T
    public final void a(@Y61.k String str) {
        this.f232185a.c(new C48167a(str));
    }
}
