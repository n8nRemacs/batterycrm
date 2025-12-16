package com.avito.android.tariff_lf_constructor.configure.size.viewmodel;

import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;

/* compiled from: ConstructorConfigureSizeViewModel.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/tariff_lf_constructor/configure/size/ui/a;", "it", "Lkotlin/G0;", "accept", "(Lcom/avito/android/tariff_lf_constructor/configure/size/ui/a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes4.dex */
final class p<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ E f300400b;

    public p(E e12) {
        this.f300400b = e12;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        T next;
        com.avito.android.tariff_lf_constructor.configure.size.ui.a aVar = (com.avito.android.tariff_lf_constructor.configure.size.ui.a) obj;
        E e12 = this.f300400b;
        ScreenPerformanceTracker.a.d(e12.f300355O, null, null, null, null, 15);
        e12.f300371e0.setValue(aVar.f300332c);
        ScreenPerformanceTracker screenPerformanceTracker = e12.f300355O;
        screenPerformanceTracker.m(screenPerformanceTracker.getF90716d());
        e12.f300359S.setValue(aVar.f300330a);
        ScreenPerformanceTracker.a.c(screenPerformanceTracker, null, null, null, 7);
        ArrayList arrayList = aVar.f300331b;
        e12.f300373g0 = arrayList;
        screenPerformanceTracker.m(screenPerformanceTracker.getF90716d());
        e12.f300360T.setValue(arrayList);
        ScreenPerformanceTracker.a.c(screenPerformanceTracker, null, null, null, 7);
        Iterator<T> it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = (T) null;
                break;
            }
            next = it.next();
            com.avito.android.tariff_lf_constructor.configure.size.items.size.a aVar2 = (com.avito.conveyor_item.a) next;
            if ((aVar2 instanceof com.avito.android.tariff_lf_constructor.configure.size.items.size.a) && aVar2.f300311i) {
                break;
            }
        }
        com.avito.android.tariff_lf_constructor.configure.size.items.size.a aVar3 = next instanceof com.avito.android.tariff_lf_constructor.configure.size.items.size.a ? next : null;
        if (aVar3 != null) {
            e12.f300374h0 = aVar3.f300305c;
            com.avito.android.tariff_lf_constructor.configure.size.ui.h hVar = aVar3.f300309g;
            if (hVar != null) {
                E.ke(e12, hVar);
            }
        }
    }
}
