package com.avito.android.vas_performance.ui.applied_services;

import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.vas_performance.ui.applied_services.j;
import kotlin.Metadata;

/* compiled from: AppliedServicesViewModel.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LBL0/d;", "it", "Lcom/avito/android/vas_performance/ui/applied_services/j$a;", "apply", "(LBL0/d;)Lcom/avito/android/vas_performance/ui/applied_services/j$a;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes5.dex */
final class p<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t f321441b;

    public p(t tVar) {
        this.f321441b = tVar;
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        BL0.d dVar = (BL0.d) obj;
        t tVar = this.f321441b;
        ScreenPerformanceTracker.a.d(tVar.f321448L, null, null, null, null, 15);
        return new j.a(tVar.f321446J.a(dVar), dVar.getAction(), dVar.getSecondaryAction());
    }
}
