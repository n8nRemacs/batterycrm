package com.avito.android.tariff.cpa.configure_advance.viewmodel;

import com.avito.android.analytics.screens.J;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import java.util.ArrayList;
import kotlin.Metadata;

/* compiled from: ConfigureAdvanceViewModel.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/tariff/cpa/configure_advance/ui/c;", "it", "Lkotlin/G0;", "accept", "(Lcom/avito/android/tariff/cpa/configure_advance/ui/c;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes4.dex */
final class v<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q f294433b;

    public v(q qVar) {
        this.f294433b = qVar;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        com.avito.android.tariff.cpa.configure_advance.ui.c cVar = (com.avito.android.tariff.cpa.configure_advance.ui.c) obj;
        q qVar = this.f294433b;
        ScreenPerformanceTracker screenPerformanceTracker = qVar.f294407M;
        J.b bVar = J.b.f90385a;
        ScreenPerformanceTracker.a.d(screenPerformanceTracker, null, null, bVar, null, 11);
        ScreenPerformanceTracker screenPerformanceTracker2 = qVar.f294407M;
        screenPerformanceTracker2.m(screenPerformanceTracker2.getF90716d());
        qVar.f294423c0 = cVar;
        qVar.f294424d0 = Integer.valueOf(cVar.f294373c);
        qVar.f294416V.setValue(cVar.f294372b.getTitle());
        ArrayList arrayList = cVar.f294371a;
        qVar.f294422b0 = arrayList;
        qVar.f294414T.setValue(arrayList);
        ScreenPerformanceTracker.a.c(screenPerformanceTracker2, null, bVar, null, 5);
    }
}
