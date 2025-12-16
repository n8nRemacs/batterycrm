package com.avito.android.analytics.screens.utils;

import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import kotlin.Metadata;
import kotlinx.coroutines.flow.C43137a0;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.X;

/* compiled from: FlowTracker.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_analytics-screens_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class m {
    public static X a(InterfaceC43160i interfaceC43160i, ScreenPerformanceTracker screenPerformanceTracker, String str) {
        ScreenPerformanceTracker.LoadingType loadingType = ScreenPerformanceTracker.LoadingType.f90785b;
        return new X(new C43137a0(new h(screenPerformanceTracker, str, null), interfaceC43160i), new i(screenPerformanceTracker, str, null));
    }
}
