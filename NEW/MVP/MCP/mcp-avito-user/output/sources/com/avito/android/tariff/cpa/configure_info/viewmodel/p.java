package com.avito.android.tariff.cpa.configure_info.viewmodel;

import aB0.C19754c;
import androidx.view.C23038g0;
import com.avito.android.analytics.screens.J;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.remote.model.ButtonAction;
import kotlin.Metadata;

/* compiled from: CpaConfigureInfoViewModel.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LaB0/c;", "it", "Lkotlin/G0;", "accept", "(LaB0/c;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes4.dex */
final class p<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r f294548b;

    public p(r rVar) {
        this.f294548b = rVar;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        C19754c c19754c = (C19754c) obj;
        r rVar = this.f294548b;
        ScreenPerformanceTracker screenPerformanceTracker = rVar.f294554M;
        J.b bVar = J.b.f90385a;
        ScreenPerformanceTracker.a.d(screenPerformanceTracker, null, null, bVar, null, 11);
        C23038g0<String> c23038g0 = rVar.f294560S;
        ButtonAction buttonAction = c19754c.f20813b;
        c23038g0.setValue(buttonAction.getTitle());
        rVar.f294561T = buttonAction;
        ScreenPerformanceTracker screenPerformanceTracker2 = rVar.f294554M;
        screenPerformanceTracker2.m(screenPerformanceTracker2.getF90716d());
        rVar.f294559R.setValue(c19754c.f20812a);
        ScreenPerformanceTracker.a.c(screenPerformanceTracker2, null, bVar, null, 5);
    }
}
