package com.avito.android.tariff_lf_constructor.configure.locations.viewmodel;

import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import kotlin.Metadata;
import oD0.C44627a;

/* compiled from: ConstructorConfigureLocationsViewModel.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LoD0/a;", "it", "Lkotlin/G0;", "accept", "(LoD0/a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes4.dex */
final class p<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r f299984b;

    public p(r rVar) {
        this.f299984b = rVar;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        C44627a c44627a = (C44627a) obj;
        r rVar = this.f299984b;
        ScreenPerformanceTracker.a.d(rVar.f299994Q, null, null, null, null, 15);
        rVar.f300003Z.setValue(c44627a.f419627d);
        ScreenPerformanceTracker screenPerformanceTracker = rVar.f299994Q;
        screenPerformanceTracker.m(screenPerformanceTracker.getF90716d());
        rVar.f299999V.setValue(c44627a.f419624a);
        ScreenPerformanceTracker.a.c(screenPerformanceTracker, null, null, null, 7);
        rVar.ke(rVar.f299991N.d(c44627a.f419625b));
        screenPerformanceTracker.m(screenPerformanceTracker.getF90716d());
        rVar.f300002Y.setValue(c44627a.f419626c.getTitle());
        ScreenPerformanceTracker.a.c(screenPerformanceTracker, null, null, null, 7);
    }
}
