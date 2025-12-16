package com.avito.android.beduin.ui.universal;

import com.avito.android.analytics.screens.J;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.util.V2;
import kotlin.Metadata;

/* compiled from: UniversalBeduinViewModel.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "accept", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes11.dex */
final class p<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m f104532b;

    public p(m mVar) {
        this.f104532b = mVar;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        Throwable th2 = (Throwable) obj;
        ScreenPerformanceTracker screenPerformanceTrackerLe = this.f104532b.le();
        if (screenPerformanceTrackerLe != null) {
            ScreenPerformanceTracker.a.d(screenPerformanceTrackerLe, null, null, new J.a(th2), null, 11);
        }
        V2.f318762a.f(th2);
    }
}
