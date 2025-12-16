package com.avito.android.publish.analytics;

import com.avito.android.analytics.InterfaceC28373a;
import java.util.ArrayList;
import javax.inject.Inject;
import kotlin.Metadata;
import yc.C50213a;

/* compiled from: PublishImagePerceptionEventTracker.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/analytics/C;", "Lcom/avito/android/publish/analytics/B;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class C implements B {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f232139a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final C50213a f232140b;

    @Inject
    public C(@Y61.k InterfaceC28373a interfaceC28373a, @Y61.k C50213a c50213a) {
        this.f232139a = interfaceC28373a;
        this.f232140b = c50213a;
    }

    @Override // com.avito.android.publish.analytics.B
    public final void D0(long j12, @Y61.k ArrayList arrayList) {
        this.f232139a.c(new FM.c(j12, this.f232140b.b(), arrayList));
    }
}
