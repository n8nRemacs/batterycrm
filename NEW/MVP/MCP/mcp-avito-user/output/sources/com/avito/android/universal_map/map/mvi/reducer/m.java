package com.avito.android.universal_map.map.mvi.reducer;

import com.avito.android.arch.mvi.u;
import com.avito.android.universal_map.map.mvi.entity.UniversalMapInternalAction;
import com.avito.android.universal_map.map.mvi.entity.c;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: PointInfoReducer.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/universal_map/map/mvi/reducer/m;", "Lcom/avito/android/arch/mvi/u;", "Lcom/avito/android/universal_map/map/mvi/entity/UniversalMapInternalAction$PointInfoInternalAction;", "Lcom/avito/android/universal_map/map/mvi/entity/c;", "<init>", "()V", "_avito_universal-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class m implements u<UniversalMapInternalAction.PointInfoInternalAction, com.avito.android.universal_map.map.mvi.entity.c> {
    @Inject
    public m() {
    }

    @Y61.k
    public static com.avito.android.universal_map.map.mvi.entity.c b(@Y61.k UniversalMapInternalAction.PointInfoInternalAction pointInfoInternalAction, @Y61.k com.avito.android.universal_map.map.mvi.entity.c cVar) {
        c.a c9381a;
        if (pointInfoInternalAction instanceof UniversalMapInternalAction.PointInfoInternalAction.PointInfoLoading) {
            return com.avito.android.universal_map.map.mvi.entity.c.a(cVar, null, null, null, c.a.d.f305584a, 7);
        }
        if (pointInfoInternalAction instanceof UniversalMapInternalAction.PointInfoInternalAction.PointInfoError) {
            return com.avito.android.universal_map.map.mvi.entity.c.a(cVar, null, null, null, new c.a.b(((UniversalMapInternalAction.PointInfoInternalAction.PointInfoError) pointInfoInternalAction).f305525b), 7);
        }
        if (pointInfoInternalAction instanceof UniversalMapInternalAction.PointInfoInternalAction.PointInfoLoaded) {
            UniversalMapInternalAction.PointInfoInternalAction.PointInfoLoaded pointInfoLoaded = (UniversalMapInternalAction.PointInfoInternalAction.PointInfoLoaded) pointInfoInternalAction;
            return com.avito.android.universal_map.map.mvi.entity.c.a(cVar, null, null, null, new c.a.C9381a(pointInfoLoaded.f305527b, pointInfoLoaded.f305528c, pointInfoLoaded.f305529d, pointInfoLoaded.f305530e, pointInfoLoaded.f305531f, pointInfoLoaded.f305532g), 7);
        }
        boolean z12 = pointInfoInternalAction instanceof UniversalMapInternalAction.PointInfoInternalAction.PointInfoContentChanged;
        c.a c9382c = cVar.f305575d;
        if (z12) {
            UniversalMapInternalAction.PointInfoInternalAction.PointInfoContentChanged pointInfoContentChanged = (UniversalMapInternalAction.PointInfoInternalAction.PointInfoContentChanged) pointInfoInternalAction;
            if (c9382c instanceof c.a.C9381a) {
                c.a.C9381a c9381a2 = (c.a.C9381a) c9382c;
                c9381a = new c.a.C9381a(c9381a2.f305576a, c9381a2.f305577b, c9381a2.f305578c, pointInfoContentChanged.f305522e, pointInfoContentChanged.f305523f, pointInfoContentChanged.f305524g);
            } else if (c9382c instanceof c.a.C9382c) {
                c9381a = c9382c;
            } else {
                c9381a = new c.a.C9381a(pointInfoContentChanged.f305519b, pointInfoContentChanged.f305520c, pointInfoContentChanged.f305521d, pointInfoContentChanged.f305522e, pointInfoContentChanged.f305523f, pointInfoContentChanged.f305524g);
            }
            return com.avito.android.universal_map.map.mvi.entity.c.a(cVar, null, null, null, c9381a, 7);
        }
        if (pointInfoInternalAction instanceof UniversalMapInternalAction.PointInfoInternalAction.OverlayChanged) {
            if (c9382c instanceof c.a.C9382c) {
                ((c.a.C9382c) c9382c).getClass();
                c9382c = new c.a.C9382c(((UniversalMapInternalAction.PointInfoInternalAction.OverlayChanged) pointInfoInternalAction).f305518b);
            }
            return com.avito.android.universal_map.map.mvi.entity.c.a(cVar, null, null, ((UniversalMapInternalAction.PointInfoInternalAction.OverlayChanged) pointInfoInternalAction).f305518b, c9382c, 3);
        }
        if (pointInfoInternalAction instanceof UniversalMapInternalAction.PointInfoInternalAction.InfoParametersChanged) {
            return com.avito.android.universal_map.map.mvi.entity.c.a(cVar, null, ((UniversalMapInternalAction.PointInfoInternalAction.InfoParametersChanged) pointInfoInternalAction).f305517b, null, null, 13);
        }
        if (pointInfoInternalAction instanceof UniversalMapInternalAction.PointInfoInternalAction.SelectedPinChanged) {
            return com.avito.android.universal_map.map.mvi.entity.c.a(cVar, ((UniversalMapInternalAction.PointInfoInternalAction.SelectedPinChanged) pointInfoInternalAction).f305535b, null, null, null, 14);
        }
        if (pointInfoInternalAction instanceof UniversalMapInternalAction.PointInfoInternalAction.CollapsePointInfoBottomSheet) {
            return cVar;
        }
        if (pointInfoInternalAction.equals(UniversalMapInternalAction.PointInfoInternalAction.HidePointInfoBottomSheet.f305516b)) {
            return com.avito.android.universal_map.map.mvi.entity.c.a(cVar, null, null, null, new c.a.C9382c(cVar.f305574c), 6);
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // com.avito.android.arch.mvi.u
    public final /* bridge */ /* synthetic */ com.avito.android.universal_map.map.mvi.entity.c a(UniversalMapInternalAction.PointInfoInternalAction pointInfoInternalAction, com.avito.android.universal_map.map.mvi.entity.c cVar) {
        return b(pointInfoInternalAction, cVar);
    }
}
