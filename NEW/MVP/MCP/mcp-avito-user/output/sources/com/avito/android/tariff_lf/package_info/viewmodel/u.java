package com.avito.android.tariff_lf.package_info.viewmodel;

import com.avito.android.analytics.screens.J;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.util.P2;
import kotlin.Metadata;

/* compiled from: TariffPackageInfoViewModel.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "accept", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes4.dex */
final class u<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ v f299306b;

    public u(v vVar) {
        this.f299306b = vVar;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        Throwable th2 = (Throwable) obj;
        v vVar = this.f299306b;
        ScreenPerformanceTracker.a.d(vVar.f299312N, null, null, new J.a(th2), null, 11);
        ScreenPerformanceTracker screenPerformanceTracker = vVar.f299312N;
        screenPerformanceTracker.m(screenPerformanceTracker.getF90716d());
        vVar.f299315Q.setValue(new P2.a(com.avito.android.remote.error.j.a(1, null, th2)));
        ScreenPerformanceTracker.a.c(screenPerformanceTracker, null, new J.a(th2), null, 5);
    }
}
