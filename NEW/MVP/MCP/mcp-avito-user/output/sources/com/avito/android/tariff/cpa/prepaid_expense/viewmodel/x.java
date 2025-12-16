package com.avito.android.tariff.cpa.prepaid_expense.viewmodel;

import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.util.P2;
import com.avito.android.util.architecture_components.D;
import kotlin.Metadata;

/* compiled from: PublicationAdvanceViewModel.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/util/P2;", "LbC0/g;", "it", "Lkotlin/G0;", "accept", "(Lcom/avito/android/util/P2;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes4.dex */
final class x<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q f295132b;

    public x(q qVar) {
        this.f295132b = qVar;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        P2 p22 = (P2) obj;
        q qVar = this.f295132b;
        qVar.getClass();
        boolean z12 = p22 instanceof P2.b;
        D<Boolean> d12 = qVar.f295116Z;
        if (z12) {
            d12.setValue(Boolean.FALSE);
            bC0.g gVar = (bC0.g) ((P2.b) p22).f318720a;
            qVar.f295105O.b(gVar.getDeeplink(), gVar.getSuccessFinishFlowUri());
            return;
        }
        if (p22 instanceof P2.c) {
            d12.postValue(Boolean.TRUE);
            return;
        }
        if (p22 instanceof P2.a) {
            d12.setValue(Boolean.FALSE);
            ScreenPerformanceTracker screenPerformanceTracker = qVar.f295103M;
            screenPerformanceTracker.m(screenPerformanceTracker.getF90716d());
            qVar.f295115Y.setValue(com.avito.android.error.z.k(((P2.a) p22).f318719a));
        }
    }
}
