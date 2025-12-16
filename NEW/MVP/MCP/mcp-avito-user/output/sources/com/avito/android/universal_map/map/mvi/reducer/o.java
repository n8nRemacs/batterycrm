package com.avito.android.universal_map.map.mvi.reducer;

import com.avito.android.arch.mvi.u;
import com.avito.android.universal_map.map.mvi.entity.UniversalMapInternalAction;
import com.avito.android.universal_map.map.mvi.entity.d;
import com.avito.android.universal_map.remote.model.UniversalMapPointsRectResult;
import com.avito.android.universal_map.remote.model.UniversalPreselectMapPoint;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42784z0;

/* compiled from: PointsReducer.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/universal_map/map/mvi/reducer/o;", "Lcom/avito/android/arch/mvi/u;", "Lcom/avito/android/universal_map/map/mvi/entity/UniversalMapInternalAction$PointsInternalAction;", "Lcom/avito/android/universal_map/map/mvi/entity/d;", "<init>", "()V", "_avito_universal-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class o implements u<UniversalMapInternalAction.PointsInternalAction, com.avito.android.universal_map.map.mvi.entity.d> {
    @Inject
    public o() {
    }

    @Y61.k
    public static com.avito.android.universal_map.map.mvi.entity.d b(@Y61.k UniversalMapInternalAction.PointsInternalAction pointsInternalAction, @Y61.k com.avito.android.universal_map.map.mvi.entity.d dVar) {
        if (pointsInternalAction instanceof UniversalMapInternalAction.PointsInternalAction.PinsChanged) {
            UniversalMapInternalAction.PointsInternalAction.PinsChanged pinsChanged = (UniversalMapInternalAction.PointsInternalAction.PinsChanged) pointsInternalAction;
            UniversalPreselectMapPoint universalPreselectMapPoint = dVar.f305586b;
            if (universalPreselectMapPoint == null) {
                universalPreselectMapPoint = pinsChanged.f305538c;
            }
            return com.avito.android.universal_map.map.mvi.entity.d.a(dVar, null, null, new d.a.C9383a(pinsChanged.f305537b, universalPreselectMapPoint, pinsChanged.f305540e), 7);
        }
        if (pointsInternalAction instanceof UniversalMapInternalAction.PointsInternalAction.ResetPins) {
            d.a c9383a = dVar.f305588d;
            if (c9383a instanceof d.a.C9383a) {
                C42784z0 c42784z0 = C42784z0.f406748b;
                c9383a = new d.a.C9383a(new UniversalMapPointsRectResult(c42784z0, c42784z0, null, null, null, null, dVar.f305585a), null, true);
            }
            return com.avito.android.universal_map.map.mvi.entity.d.a(dVar, null, null, c9383a, 7);
        }
        if (pointsInternalAction instanceof UniversalMapInternalAction.PointsInternalAction.SetSavedLocation) {
            return com.avito.android.universal_map.map.mvi.entity.d.a(dVar, null, ((UniversalMapInternalAction.PointsInternalAction.SetSavedLocation) pointsInternalAction).f305548b, null, 9);
        }
        if (pointsInternalAction instanceof UniversalMapInternalAction.PointsInternalAction.UsedLegacySavedLocation) {
            return com.avito.android.universal_map.map.mvi.entity.d.a(dVar, null, null, null, 11);
        }
        if (pointsInternalAction instanceof UniversalMapInternalAction.PointsInternalAction.MapModeChanged) {
            return com.avito.android.universal_map.map.mvi.entity.d.a(dVar, ((UniversalMapInternalAction.PointsInternalAction.MapModeChanged) pointsInternalAction).f305536b, null, null, 14);
        }
        if (pointsInternalAction instanceof UniversalMapInternalAction.PointsInternalAction.PinsError ? true : pointsInternalAction instanceof UniversalMapInternalAction.PointsInternalAction.PinsLoaded ? true : pointsInternalAction instanceof UniversalMapInternalAction.PointsInternalAction.PinsLoading) {
            return dVar;
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // com.avito.android.arch.mvi.u
    public final /* bridge */ /* synthetic */ com.avito.android.universal_map.map.mvi.entity.d a(UniversalMapInternalAction.PointsInternalAction pointsInternalAction, com.avito.android.universal_map.map.mvi.entity.d dVar) {
        return b(pointsInternalAction, dVar);
    }
}
