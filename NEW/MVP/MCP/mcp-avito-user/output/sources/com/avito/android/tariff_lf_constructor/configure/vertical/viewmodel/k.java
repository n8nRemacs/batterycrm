package com.avito.android.tariff_lf_constructor.configure.vertical.viewmodel;

import com.avito.android.analytics.screens.J;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.remote.error.ApiError;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: ConstructorConfigureVerticalViewModel.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_tariff-lf-constructor_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class k {
    public static final void a(ScreenPerformanceTracker screenPerformanceTracker, ApiError apiError, Y41.a aVar) {
        ScreenPerformanceTracker.a.d(screenPerformanceTracker, null, null, new J.a(apiError), null, 11);
        screenPerformanceTracker.m(screenPerformanceTracker.getF305951e());
        aVar.invoke();
        ScreenPerformanceTracker.a.c(screenPerformanceTracker, null, new J.a(apiError), null, 5);
    }
}
