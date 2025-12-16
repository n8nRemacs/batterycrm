package com.avito.android.enabler;

import Y61.k;
import com.avito.android.InterfaceC29272c2;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.statsd.y;
import com.avito.android.beduin.common.component.cart_item.BeduinCartItemModel;
import com.avito.android.util.C;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: RemoteFeaturesStartupMonitor.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0016\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\r\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\rR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u000eR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/avito/android/enabler/RemoteFeaturesStartupMonitor;", "", "Lcom/avito/android/c2;", "remoteToggles", "Lcom/avito/android/analytics/a;", "analytics", "Lcom/avito/android/util/C;", "buildInfo", "<init>", "(Lcom/avito/android/c2;Lcom/avito/android/analytics/a;Lcom/avito/android/util/C;)V", "Lkotlin/G0;", "checkMonitorToggle", "()V", "Lcom/avito/android/c2;", "Lcom/avito/android/analytics/a;", "Lcom/avito/android/util/C;", "_common_features-enabler_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public class RemoteFeaturesStartupMonitor {

    @k
    private final InterfaceC28373a analytics;

    @k
    private final C buildInfo;

    @k
    private final InterfaceC29272c2 remoteToggles;

    @Inject
    public RemoteFeaturesStartupMonitor(@k InterfaceC29272c2 interfaceC29272c2, @k InterfaceC28373a interfaceC28373a, @k C c12) {
        this.remoteToggles = interfaceC29272c2;
        this.analytics = interfaceC28373a;
        this.buildInfo = c12;
    }

    public final void checkMonitorToggle() {
        this.analytics.c(new y.a(MonitorsKt.basePrefix(this.buildInfo) + ".startup-monitor." + (this.remoteToggles.l().invoke().booleanValue() ? "enabled" : BeduinCartItemModel.DISABLED_STRING), 0L, 2, null));
    }
}
