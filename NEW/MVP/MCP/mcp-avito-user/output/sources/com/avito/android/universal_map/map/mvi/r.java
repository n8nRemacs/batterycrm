package com.avito.android.universal_map.map.mvi;

import com.avito.android.arch.mvi.t;
import com.avito.android.universal_map.map.mvi.entity.UniversalMapInternalAction;
import javax.inject.Inject;
import kotlin.Metadata;
import rG0.InterfaceC47542b;

/* compiled from: UniversalMapOneTimeEventProducer.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/universal_map/map/mvi/r;", "Lcom/avito/android/arch/mvi/t;", "Lcom/avito/android/universal_map/map/mvi/entity/UniversalMapInternalAction;", "LrG0/b;", "<init>", "()V", "_avito_universal-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class r implements t<UniversalMapInternalAction, InterfaceC47542b> {
    @Inject
    public r() {
    }

    @Override // com.avito.android.arch.mvi.t
    public final InterfaceC47542b b(UniversalMapInternalAction universalMapInternalAction) {
        UniversalMapInternalAction universalMapInternalAction2 = universalMapInternalAction;
        if (universalMapInternalAction2 instanceof UniversalMapInternalAction.NonTrackableErrorWithApi) {
            return new InterfaceC47542b.h(((UniversalMapInternalAction.NonTrackableErrorWithApi) universalMapInternalAction2).f305514b);
        }
        if (universalMapInternalAction2 instanceof UniversalMapInternalAction.FiltersInternalAction.ShowFiltersTooltip) {
            return new InterfaceC47542b.f(((UniversalMapInternalAction.FiltersInternalAction.ShowFiltersTooltip) universalMapInternalAction2).f305497b);
        }
        if (universalMapInternalAction2 instanceof UniversalMapInternalAction.PointsInternalAction.PinsError) {
            return new InterfaceC47542b.g(((UniversalMapInternalAction.PointsInternalAction.PinsError) universalMapInternalAction2).f305541b);
        }
        if (universalMapInternalAction2 instanceof UniversalMapInternalAction.MapViewInternalAction.MoveCameraToState) {
            UniversalMapInternalAction.MapViewInternalAction.MoveCameraToState moveCameraToState = (UniversalMapInternalAction.MapViewInternalAction.MoveCameraToState) universalMapInternalAction2;
            return new InterfaceC47542b.c(moveCameraToState.f305506b, moveCameraToState.f305507c, moveCameraToState.f305508d, moveCameraToState.f305509e);
        }
        if (universalMapInternalAction2 instanceof UniversalMapInternalAction.MapViewInternalAction.MoveCameraToBounds) {
            return new InterfaceC47542b.C12366b(((UniversalMapInternalAction.MapViewInternalAction.MoveCameraToBounds) universalMapInternalAction2).f305505b);
        }
        if (universalMapInternalAction2 instanceof UniversalMapInternalAction.PointInfoInternalAction.CollapsePointInfoBottomSheet) {
            return InterfaceC47542b.a.f429699a;
        }
        if (universalMapInternalAction2 instanceof UniversalMapInternalAction.TriggerShowUserLocation) {
            return InterfaceC47542b.l.f429713a;
        }
        if (universalMapInternalAction2 instanceof UniversalMapInternalAction.TriggerInvokeCustomActions) {
            return InterfaceC47542b.j.f429711a;
        }
        if (universalMapInternalAction2 instanceof UniversalMapInternalAction.RequestLocation) {
            return InterfaceC47542b.e.f429706a;
        }
        if (universalMapInternalAction2 instanceof UniversalMapInternalAction.FiltersInternalAction.FiltersApplied) {
            return InterfaceC47542b.d.f429705a;
        }
        if (universalMapInternalAction2 instanceof UniversalMapInternalAction.SubscribeNotPermissionGranted) {
            return InterfaceC47542b.i.f429710a;
        }
        if (universalMapInternalAction2 instanceof UniversalMapInternalAction.PointsInternalAction.UsedLegacySavedLocation) {
            return new InterfaceC47542b.k(((UniversalMapInternalAction.PointsInternalAction.UsedLegacySavedLocation) universalMapInternalAction2).f305549b);
        }
        return null;
    }
}
