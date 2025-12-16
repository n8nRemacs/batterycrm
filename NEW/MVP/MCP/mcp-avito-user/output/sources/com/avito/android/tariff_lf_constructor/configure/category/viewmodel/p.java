package com.avito.android.tariff_lf_constructor.configure.category.viewmodel;

import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import fD0.C40281c;
import java.util.ArrayList;
import kotlin.Metadata;

/* compiled from: ConstructorConfigureCategoryViewModel.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LfD0/c;", "it", "Lkotlin/G0;", "accept", "(LfD0/c;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes4.dex */
final class p<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ v f299434b;

    public p(v vVar) {
        this.f299434b = vVar;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        C40281c c40281c = (C40281c) obj;
        v vVar = this.f299434b;
        ScreenPerformanceTracker.a.d(vVar.f299446O, null, null, null, null, 15);
        vVar.f299456Y.setValue(c40281c.f395789b);
        ArrayList arrayList = c40281c.f395788a;
        ScreenPerformanceTracker screenPerformanceTracker = vVar.f299446O;
        screenPerformanceTracker.m(screenPerformanceTracker.getF90716d());
        vVar.f299451T.setValue(arrayList);
        ScreenPerformanceTracker.a.c(screenPerformanceTracker, null, null, null, 7);
    }
}
