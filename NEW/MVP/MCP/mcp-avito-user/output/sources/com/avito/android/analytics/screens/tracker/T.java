package com.avito.android.analytics.screens.tracker;

import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.statsd.y;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: StabilityTracker.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/analytics/screens/tracker/T;", "Lcom/avito/android/analytics/screens/tracker/Q;", "_avito_analytics-screens_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class T implements Q {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f90792a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f90793b;

    @Inject
    public T(@Y61.k InterfaceC28373a interfaceC28373a, @Y61.k String str) {
        this.f90792a = interfaceC28373a;
        this.f90793b = "service.product_stability.client.android.".concat(str);
    }

    @Override // com.avito.android.analytics.screens.tracker.Q
    public final void a() {
        this.f90792a.c(new y.a(AK.c.s(new StringBuilder(), this.f90793b, ".fail"), 0L, 2, null));
    }

    @Override // com.avito.android.analytics.screens.tracker.Q
    public final void b() {
        this.f90792a.c(new y.a(AK.c.s(new StringBuilder(), this.f90793b, ".ok"), 0L, 2, null));
    }
}
