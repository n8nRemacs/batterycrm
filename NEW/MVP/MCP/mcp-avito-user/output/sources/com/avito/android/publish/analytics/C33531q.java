package com.avito.android.publish.analytics;

import com.avito.android.analytics.InterfaceC28373a;
import javax.inject.Inject;
import kotlin.Metadata;
import yc.C50213a;

/* compiled from: PublishDeliveryDbsEventTracker.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/analytics/q;", "Lcom/avito/android/publish/analytics/p;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.publish.analytics.q, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C33531q implements InterfaceC33530p {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f232269a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final C50213a f232270b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.analytics.provider.a f232271c;

    @Inject
    public C33531q(@Y61.k InterfaceC28373a interfaceC28373a, @Y61.k C50213a c50213a, @Y61.k com.avito.android.analytics.provider.a aVar) {
        this.f232269a = interfaceC28373a;
        this.f232270b = c50213a;
        this.f232271c = aVar;
    }

    @Override // com.avito.android.publish.analytics.InterfaceC33530p
    public final void S(boolean z12) {
        this.f232269a.c(new Cd0.O("Delivery by seller / Вкл-Выкл Свои курьеры для объявления на подаче", 6869, 1, this.f232270b.c(), this.f232271c.a(), z12));
    }

    @Override // com.avito.android.publish.analytics.InterfaceC33530p
    public final void b0(boolean z12) {
        this.f232269a.c(new Cd0.L("Delivery by seller / Вкл-Выкл Свои партнеры для объявления на подаче", 6868, 2, this.f232270b.c(), this.f232271c.a(), z12));
    }

    @Override // com.avito.android.publish.analytics.InterfaceC33530p
    public final void n(boolean z12) {
        this.f232269a.c(new Cd0.J(this.f232270b.c(), z12));
    }
}
