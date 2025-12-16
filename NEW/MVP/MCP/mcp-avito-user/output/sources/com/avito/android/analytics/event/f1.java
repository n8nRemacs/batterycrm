package com.avito.android.analytics.event;

import kotlin.Metadata;

/* compiled from: BottomNavigationLifecycleEvents.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/analytics/event/f1;", "Lcom/avito/android/error_reporting/error_reporter/u;", "_avito_analytics_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class f1 implements com.avito.android.error_reporting.error_reporter.u {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f90034b;

    public f1(@Y61.k String str) {
        this.f90034b = str;
    }

    @Override // com.avito.android.error_reporting.error_reporter.u
    @Y61.k
    /* renamed from: getName */
    public final String getF147929e() {
        return AK.c.s(new StringBuilder(), this.f90034b, " selected");
    }
}
