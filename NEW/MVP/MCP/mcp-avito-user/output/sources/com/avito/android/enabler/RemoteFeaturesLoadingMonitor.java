package com.avito.android.enabler;

import Y61.k;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.statsd.y;
import com.avito.android.util.C;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: RemoteFeaturesLoadingMonitor.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\t\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\r\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/avito/android/enabler/RemoteFeaturesLoadingMonitor;", "", "Lcom/avito/android/analytics/a;", "analytics", "Lcom/avito/android/util/C;", "buildInfo", "<init>", "(Lcom/avito/android/analytics/a;Lcom/avito/android/util/C;)V", "Lkotlin/G0;", "reportLoadingFailed", "()V", "reportLoadingSuccess", "Lcom/avito/android/analytics/a;", "Lcom/avito/android/util/C;", "_common_features-enabler_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class RemoteFeaturesLoadingMonitor {

    @k
    private final InterfaceC28373a analytics;

    @k
    private final C buildInfo;

    @Inject
    public RemoteFeaturesLoadingMonitor(@k InterfaceC28373a interfaceC28373a, @k C c12) {
        this.analytics = interfaceC28373a;
        this.buildInfo = c12;
    }

    public final void reportLoadingFailed() {
        this.analytics.c(new y.a(MonitorsKt.basePrefix(this.buildInfo) + ".startup.loading.error", 0L, 2, null));
    }

    public final void reportLoadingSuccess() {
        this.analytics.c(new y.a(MonitorsKt.basePrefix(this.buildInfo) + ".startup.loading.success", 0L, 2, null));
    }
}
