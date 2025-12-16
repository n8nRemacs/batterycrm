package com.avito.android.tariff_lf_constructor.configure.category.viewmodel;

import com.avito.android.analytics.screens.J;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.error.z;
import com.avito.android.remote.error.ApiError;
import com.avito.android.util.P2;
import com.avito.android.util.architecture_components.D;
import kotlin.Metadata;
import qD0.C47284b;

/* compiled from: ConstructorConfigureCategoryViewModel.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/util/P2;", "LqD0/b;", "it", "Lkotlin/G0;", "accept", "(Lcom/avito/android/util/P2;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes4.dex */
final class t<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ v f299438b;

    public t(v vVar) {
        this.f299438b = vVar;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        P2 p22 = (P2) obj;
        v vVar = this.f299438b;
        vVar.getClass();
        boolean z12 = p22 instanceof P2.b;
        D<Boolean> d12 = vVar.f299455X;
        if (z12) {
            d12.setValue(Boolean.FALSE);
            DeepLink deeplink = ((C47284b) ((P2.b) p22).f318720a).getDeeplink();
            if (deeplink != null) {
                vVar.f299452U.setValue(deeplink);
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
            ScreenPerformanceTracker.a.d(vVar.f299446O, null, null, new J.a(apiError), null, 11);
            ScreenPerformanceTracker screenPerformanceTracker = vVar.f299446O;
            screenPerformanceTracker.m(screenPerformanceTracker.getF90716d());
            vVar.f299450S.setValue(z.k(apiError));
            ScreenPerformanceTracker.a.c(screenPerformanceTracker, null, new J.a(apiError), null, 5);
        }
    }
}
