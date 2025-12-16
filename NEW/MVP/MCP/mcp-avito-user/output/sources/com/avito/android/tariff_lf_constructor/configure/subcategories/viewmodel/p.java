package com.avito.android.tariff_lf_constructor.configure.subcategories.viewmodel;

import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import kotlin.Metadata;

/* compiled from: ConstructorConfigureSubCategoriesViewModel.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LED0/a;", "it", "Lkotlin/G0;", "accept", "(LED0/a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes4.dex */
final class p<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r f300513b;

    public p(r rVar) {
        this.f300513b = rVar;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        ED0.a aVar = (ED0.a) obj;
        r rVar = this.f300513b;
        ScreenPerformanceTracker.a.d(rVar.f300523Q, null, null, null, null, 15);
        rVar.f300540h0.setValue(aVar.f3893d);
        rVar.f300529W.setValue(aVar.f3892c.getTitle());
        rVar.f300528V.setValue(aVar.f3890a);
        r.ke(rVar, aVar.f3891b);
    }
}
