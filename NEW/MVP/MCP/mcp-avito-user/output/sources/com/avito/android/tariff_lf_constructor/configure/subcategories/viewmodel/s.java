package com.avito.android.tariff_lf_constructor.configure.subcategories.viewmodel;

import com.avito.android.analytics.screens.J;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.error.z;
import com.avito.android.remote.error.ApiError;
import com.avito.android.util.P2;
import com.avito.android.util.architecture_components.D;
import kotlin.Metadata;
import qD0.C47284b;

/* compiled from: ConstructorConfigureSubCategoriesViewModel.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/util/P2;", "LqD0/b;", "it", "Lkotlin/G0;", "accept", "(Lcom/avito/android/util/P2;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes4.dex */
final class s<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r f300550b;

    public s(r rVar) {
        this.f300550b = rVar;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        P2 p22 = (P2) obj;
        r rVar = this.f300550b;
        rVar.getClass();
        boolean z12 = p22 instanceof P2.b;
        D<Boolean> d12 = rVar.f300539g0;
        if (z12) {
            d12.setValue(Boolean.FALSE);
            DeepLink deeplink = ((C47284b) ((P2.b) p22).f318720a).getDeeplink();
            if (deeplink != null) {
                rVar.f300532Z.setValue(deeplink);
                return;
            }
            return;
        }
        if (p22 instanceof P2.c) {
            d12.postValue(Boolean.TRUE);
            return;
        }
        if (p22 instanceof P2.a) {
            d12.setValue(Boolean.FALSE);
            ApiError apiError = ((P2.a) p22).f318719a;
            ScreenPerformanceTracker.a.d(rVar.f300523Q, null, null, new J.a(apiError), null, 11);
            ScreenPerformanceTracker screenPerformanceTracker = rVar.f300523Q;
            screenPerformanceTracker.m(screenPerformanceTracker.getF90716d());
            rVar.f300527U.setValue(z.k(apiError));
            ScreenPerformanceTracker.a.c(screenPerformanceTracker, null, new J.a(apiError), null, 5);
        }
    }
}
