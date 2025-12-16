package com.avito.android.universal_map.map;

import com.avito.android.analytics.screens.J;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.remote.error.ApiError;
import com.avito.android.universal_map.map.AbstractC35293c;
import com.avito.android.universal_map.map.AbstractC35294d;
import com.avito.android.universal_map.map.T;
import com.avito.android.universal_map.map.common.marker.Marker;
import com.avito.android.universal_map.remote.model.UniversalMapPointsRectResult;
import com.avito.android.universal_map.remote.model.UniversalPreselectMapPoint;
import com.avito.android.util.P2;
import kotlin.Metadata;
import qG0.C47292c;

/* compiled from: UniversalPointsViewModel.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/util/P2;", "Lcom/avito/android/universal_map/remote/model/UniversalMapPointsRectResult;", "it", "Lkotlin/G0;", "accept", "(Lcom/avito/android/util/P2;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes4.dex */
final class W<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g0 f304905b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f304906c;

    public W(g0 g0Var, boolean z12) {
        this.f304905b = g0Var;
        this.f304906c = z12;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        P2 p22 = (P2) obj;
        boolean z12 = p22 instanceof P2.b;
        g0 g0Var = this.f304905b;
        if (!z12) {
            if (p22 instanceof P2.a) {
                g0Var.getClass();
                ApiError apiError = ((P2.a) p22).f318719a;
                ScreenPerformanceTracker.a.d(g0Var.f305189R, null, null, new J.a(apiError), null, 11);
                com.avito.android.universal_map.map.tracker.c cVar = g0Var.f305189R;
                cVar.m(cVar.getF90716d());
                g0Var.f305197Z.postValue(new C47292c(com.avito.android.error.z.k(apiError), null, apiError, 2, null));
                ScreenPerformanceTracker.a.c(cVar, null, new J.a(apiError), null, 5);
                return;
            }
            return;
        }
        UniversalMapPointsRectResult universalMapPointsRectResult = (UniversalMapPointsRectResult) ((P2.b) p22).f318720a;
        ScreenPerformanceTracker.a.d(g0Var.f305189R, null, null, null, null, 15);
        com.avito.android.universal_map.map.tracker.c cVar2 = g0Var.f305189R;
        cVar2.m(cVar2.getF90716d());
        g0Var.f305214q0 = universalMapPointsRectResult.getMode();
        UniversalPreselectMapPoint universalPreselectMapPointKe = g0Var.f305208k0;
        if (universalPreselectMapPointKe == null) {
            universalPreselectMapPointKe = g0Var.ke(universalMapPointsRectResult);
        }
        g0Var.f305194W.postValue(new T.a(universalMapPointsRectResult, universalPreselectMapPointKe, this.f304906c));
        g0Var.f305205h0.postValue(universalMapPointsRectResult.getOverlay());
        g0Var.f305195X.postValue(universalMapPointsRectResult.f());
        UniversalPreselectMapPoint universalPreselectMapPoint = g0Var.f305208k0;
        com.avito.android.util.architecture_components.D<AbstractC35294d> d12 = g0Var.f305198a0;
        if (universalPreselectMapPoint != null) {
            g0Var.f305207j0 = false;
            g0Var.f305208k0 = null;
            d12.postValue(new AbstractC35294d.b(com.avito.android.universal_map.map.common.marker.i.a(universalPreselectMapPoint.getPin(), universalPreselectMapPoint.getZoomLevel())));
        }
        UniversalPreselectMapPoint universalPreselectMapPointKe2 = g0Var.ke(universalMapPointsRectResult);
        if (universalPreselectMapPointKe2 != null) {
            Marker.Pin pinA = com.avito.android.universal_map.map.common.marker.i.a(universalPreselectMapPointKe2.getPin(), universalPreselectMapPointKe2.getZoomLevel());
            g0Var.f305207j0 = false;
            g0Var.f305199b0.postValue(new AbstractC35293c.b(pinA.f304924d, false, pinA.f304930j));
            d12.postValue(new AbstractC35294d.a(pinA));
            d12.postValue(new AbstractC35294d.b(pinA));
        }
        com.avito.android.beduin_shared.model.utils.a.a(g0Var.f305186O, universalMapPointsRectResult.getActions());
        ScreenPerformanceTracker.a.c(cVar2, null, null, null, 7);
    }
}
