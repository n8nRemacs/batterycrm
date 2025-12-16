package com.avito.android.iac_dialer.impl_module.notifications.new_impl;

import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.statsd.F;
import com.avito.android.analytics.statsd.y;
import com.avito.android.iac_dialer.impl_module.notifications.channels.IacNotificationChannelManager;
import com.avito.android.iac_dialer_models.abstract_module.IacCallDirection;
import com.squareup.anvil.annotations.ContributesBinding;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.collections.B0;
import kotlin.collections.b1;

/* compiled from: IacNotificationBuilder.kt */
@P
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/iac_dialer/impl_module/notifications/new_impl/l;", "Lcom/avito/android/iac_dialer/impl_module/notifications/new_impl/k;", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Singleton
/* loaded from: classes14.dex */
public final class l implements k {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f166132a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final F f166133b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public Object f166134c = B0.f406639b;

    @Inject
    public l(@Y61.k InterfaceC28373a interfaceC28373a, @Y61.k F f12) {
        this.f166132a = interfaceC28373a;
        this.f166133b = f12;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Set] */
    /* JADX WARN: Type inference failed for: r5v7, types: [java.lang.Object, java.util.Set] */
    @Override // com.avito.android.iac_dialer.impl_module.notifications.new_impl.k
    public final void a(@Y61.k String str, @Y61.k IacCallDirection iacCallDirection, @Y61.k IacNotificationChannelManager.RecreatingAnalyticsResult recreatingAnalyticsResult) {
        if (this.f166134c.contains(str)) {
            return;
        }
        y.a aVar = new y.a(this.f166133b.a("calls.iac.notification_channels", iacCallDirection.toString(), recreatingAnalyticsResult.toString(), "{{%app_ver%}}").f91030a, 1L);
        com.avito.android.iac_dialer_watcher.public_module.logging.logger.b.f168184a.a("IacNotificationTracker", aVar.f91091b, null);
        this.f166132a.c(aVar);
        this.f166134c = b1.i(this.f166134c, str);
    }
}
