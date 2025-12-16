package com.avito.android.universal_map.map.mvi.reducer;

import com.avito.android.arch.mvi.u;
import com.avito.android.universal_map.map.mvi.entity.MapState;
import com.avito.android.universal_map.map.mvi.entity.UniversalMapInternalAction;
import com.avito.android.universal_map.map.mvi.entity.a;
import com.avito.android.universal_map.map.mvi.entity.d;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.L;

/* compiled from: UniversalMapReducer.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/universal_map/map/mvi/reducer/q;", "Lcom/avito/android/arch/mvi/u;", "Lcom/avito/android/universal_map/map/mvi/entity/UniversalMapInternalAction;", "Lcom/avito/android/universal_map/map/mvi/entity/e;", "_avito_universal-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class q implements u<UniversalMapInternalAction, com.avito.android.universal_map.map.mvi.entity.e> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final g f305687b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final e f305688c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final m f305689d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final o f305690e;

    @Inject
    public q(@Y61.k g gVar, @Y61.k e eVar, @Y61.k m mVar, @Y61.k o oVar) {
        this.f305687b = gVar;
        this.f305688c = eVar;
        this.f305689d = mVar;
        this.f305690e = oVar;
    }

    @Override // com.avito.android.arch.mvi.u
    public final com.avito.android.universal_map.map.mvi.entity.e a(UniversalMapInternalAction universalMapInternalAction, com.avito.android.universal_map.map.mvi.entity.e eVar) {
        UniversalMapInternalAction universalMapInternalAction2 = universalMapInternalAction;
        com.avito.android.universal_map.map.mvi.entity.e eVar2 = eVar;
        if (universalMapInternalAction2 instanceof UniversalMapInternalAction.NonTrackableErrorWithApi) {
            return eVar2;
        }
        if (universalMapInternalAction2 instanceof UniversalMapInternalAction.BeduinFormContentChanged) {
            UniversalMapInternalAction.BeduinFormContentChanged beduinFormContentChanged = (UniversalMapInternalAction.BeduinFormContentChanged) universalMapInternalAction2;
            return com.avito.android.universal_map.map.mvi.entity.e.a(eVar2, new a.C9378a(beduinFormContentChanged.f305475b, beduinFormContentChanged.f305476c), null, null, null, null, 62);
        }
        boolean z12 = universalMapInternalAction2 instanceof UniversalMapInternalAction.MapViewInternalAction;
        com.avito.android.universal_map.map.mvi.entity.c cVar = eVar2.f305596c;
        m mVar = this.f305689d;
        g gVar = this.f305687b;
        MapState mapState = eVar2.f305599f;
        if (z12) {
            MapState mapStateA = gVar.a((UniversalMapInternalAction.MapViewInternalAction) universalMapInternalAction2, mapState);
            if (mapState.f305453f.f305464g == null || mapStateA.f305453f.f305464g != null) {
                return com.avito.android.universal_map.map.mvi.entity.e.a(eVar2, null, null, null, null, mapStateA, 47);
            }
            UniversalMapInternalAction.PointInfoInternalAction.HidePointInfoBottomSheet hidePointInfoBottomSheet = UniversalMapInternalAction.PointInfoInternalAction.HidePointInfoBottomSheet.f305516b;
            mVar.getClass();
            return com.avito.android.universal_map.map.mvi.entity.e.a(eVar2, null, m.b(hidePointInfoBottomSheet, cVar), null, null, mapStateA, 45);
        }
        if (universalMapInternalAction2 instanceof UniversalMapInternalAction.FiltersInternalAction) {
            this.f305688c.getClass();
            return com.avito.android.universal_map.map.mvi.entity.e.a(eVar2, null, null, e.b((UniversalMapInternalAction.FiltersInternalAction) universalMapInternalAction2, eVar2.f305597d), null, null, 59);
        }
        if (universalMapInternalAction2 instanceof UniversalMapInternalAction.PointInfoInternalAction) {
            mVar.getClass();
            com.avito.android.universal_map.map.mvi.entity.c cVarB = m.b((UniversalMapInternalAction.PointInfoInternalAction) universalMapInternalAction2, cVar);
            return (cVar.f305572a == null || cVarB.f305572a != null) ? com.avito.android.universal_map.map.mvi.entity.e.a(eVar2, null, cVarB, null, null, null, 61) : com.avito.android.universal_map.map.mvi.entity.e.a(eVar2, null, cVarB, null, null, gVar.a(UniversalMapInternalAction.MapViewInternalAction.ClearMarkerSelection.f305499b, mapState), 45);
        }
        if (!(universalMapInternalAction2 instanceof UniversalMapInternalAction.PointsInternalAction)) {
            if (universalMapInternalAction2 instanceof UniversalMapInternalAction.ScreenShownFirstTime) {
                return com.avito.android.universal_map.map.mvi.entity.e.a(eVar2, null, null, null, null, null, 31);
            }
            if (universalMapInternalAction2.equals(UniversalMapInternalAction.RequestLocation.f305550b) ? true : universalMapInternalAction2.equals(UniversalMapInternalAction.SubscribeNotPermissionGranted.f305552b) ? true : universalMapInternalAction2.equals(UniversalMapInternalAction.TriggerInvokeCustomActions.f305553b) ? true : universalMapInternalAction2.equals(UniversalMapInternalAction.TriggerShowUserLocation.f305554b)) {
                return eVar2;
            }
            throw new NoWhenBranchMatchedException();
        }
        this.f305690e.getClass();
        com.avito.android.universal_map.map.mvi.entity.d dVar = eVar2.f305598e;
        com.avito.android.universal_map.map.mvi.entity.d dVarB = o.b((UniversalMapInternalAction.PointsInternalAction) universalMapInternalAction2, dVar);
        d.a aVar = dVar.f305588d;
        d.a aVar2 = dVarB.f305588d;
        return (!(aVar2 instanceof d.a.C9383a) || L.f(aVar, aVar2)) ? com.avito.android.universal_map.map.mvi.entity.e.a(eVar2, null, null, null, dVarB, null, 55) : com.avito.android.universal_map.map.mvi.entity.e.a(eVar2, null, null, null, dVarB, gVar.a(new UniversalMapInternalAction.MapViewInternalAction.PointsStateChanged((d.a.C9383a) aVar2), mapState), 39);
    }
}
