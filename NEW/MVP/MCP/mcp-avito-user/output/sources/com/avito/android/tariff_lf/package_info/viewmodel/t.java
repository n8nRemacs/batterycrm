package com.avito.android.tariff_lf.package_info.viewmodel;

import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import java.util.List;
import kotlin.Metadata;

/* compiled from: TariffPackageInfoViewModel.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "Lcom/avito/conveyor_item/a;", "it", "Lkotlin/G0;", "accept", "(Ljava/util/List;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes4.dex */
final class t<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ v f299305b;

    public t(v vVar) {
        this.f299305b = vVar;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        v vVar = this.f299305b;
        ScreenPerformanceTracker.a.d(vVar.f299312N, null, null, null, null, 15);
        ScreenPerformanceTracker screenPerformanceTracker = vVar.f299312N;
        screenPerformanceTracker.m(screenPerformanceTracker.getF305951e());
        vVar.f299314P.postValue((List) obj);
        ScreenPerformanceTracker.a.c(screenPerformanceTracker, null, null, null, 7);
    }
}
