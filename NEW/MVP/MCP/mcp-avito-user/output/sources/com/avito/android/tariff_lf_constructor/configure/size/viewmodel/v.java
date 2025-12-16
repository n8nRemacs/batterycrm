package com.avito.android.tariff_lf_constructor.configure.size.viewmodel;

import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42770s0;
import kotlin.sequences.C43033p;
import kotlin.sequences.o0;

/* compiled from: ConstructorConfigureSizeViewModel.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/tariff_lf_constructor/configure/size/ui/g;", "it", "Lkotlin/G0;", "accept", "(Lcom/avito/android/tariff_lf_constructor/configure/size/ui/g;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes4.dex */
final class v<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ E f300407b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f300408c;

    public v(E e12, String str) {
        this.f300407b = e12;
        this.f300408c = str;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        com.avito.android.tariff_lf_constructor.configure.size.ui.g gVar = (com.avito.android.tariff_lf_constructor.configure.size.ui.g) obj;
        E e12 = this.f300407b;
        ScreenPerformanceTracker.a.d(e12.f300355O, null, null, null, null, 15);
        String str = this.f300408c;
        e12.f300374h0 = str;
        List<? extends com.avito.conveyor_item.a> list = e12.f300373g0;
        e12.f300373g0 = list != null ? C43033p.D(new o0(new C42770s0(list), new A(str, gVar.f300337a))) : null;
        ScreenPerformanceTracker screenPerformanceTracker = e12.f300355O;
        screenPerformanceTracker.m(screenPerformanceTracker.getF90716d());
        e12.f300360T.setValue(e12.f300373g0);
        ScreenPerformanceTracker.a.c(screenPerformanceTracker, null, null, null, 7);
        E.ke(e12, gVar.f300338b);
    }
}
