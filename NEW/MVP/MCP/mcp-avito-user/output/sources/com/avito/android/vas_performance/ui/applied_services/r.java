package com.avito.android.vas_performance.ui.applied_services;

import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.util.P2;
import kotlin.Metadata;

/* compiled from: AppliedServicesViewModel.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/util/P2$b;", "Lcom/avito/android/vas_performance/ui/applied_services/j$a;", "it", "Lkotlin/G0;", "accept", "(Lcom/avito/android/util/P2$b;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes5.dex */
final class r<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t f321443b;

    public r(t tVar) {
        this.f321443b = tVar;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        t tVar = this.f321443b;
        ScreenPerformanceTracker screenPerformanceTracker = tVar.f321448L;
        screenPerformanceTracker.m(screenPerformanceTracker.getF90716d());
        tVar.f321449M.postValue((P2.b) obj);
        ScreenPerformanceTracker.a.c(tVar.f321448L, null, null, null, 7);
    }
}
