package com.avito.android.universal_map.map.mvi.reducer;

import com.avito.android.arch.mvi.u;
import com.avito.android.beduin_models.BeduinAction;
import com.avito.android.universal_map.map.mvi.entity.UniversalMapInternalAction;
import com.avito.android.universal_map.map.mvi.entity.b;
import com.avito.android.util.A4;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.s0;

/* compiled from: FiltersReducer.kt */
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/universal_map/map/mvi/reducer/e;", "Lcom/avito/android/arch/mvi/u;", "Lcom/avito/android/universal_map/map/mvi/entity/UniversalMapInternalAction$FiltersInternalAction;", "Lcom/avito/android/universal_map/map/mvi/entity/b;", "<init>", "()V", "_avito_universal-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class e implements u<UniversalMapInternalAction.FiltersInternalAction, com.avito.android.universal_map.map.mvi.entity.b> {
    @Inject
    public e() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Y61.k
    public static com.avito.android.universal_map.map.mvi.entity.b b(@Y61.k UniversalMapInternalAction.FiltersInternalAction filtersInternalAction, @Y61.k com.avito.android.universal_map.map.mvi.entity.b bVar) {
        boolean z12 = filtersInternalAction instanceof UniversalMapInternalAction.FiltersInternalAction.HideFiltersBottomSheet;
        b.a aVar = bVar.f305561d;
        List list = null;
        Object[] objArr = 0;
        if (z12) {
            List<BeduinAction> list2 = aVar instanceof b.a.C9379a ? ((b.a.C9379a) aVar).f305568g : aVar instanceof b.a.c ? ((b.a.c) aVar).f305570a : null;
            if (!((UniversalMapInternalAction.FiltersInternalAction.HideFiltersBottomSheet) filtersInternalAction).f305496b) {
                list2 = null;
            }
            return com.avito.android.universal_map.map.mvi.entity.b.a(bVar, null, new b.a.c(list2), 7);
        }
        if (filtersInternalAction instanceof UniversalMapInternalAction.FiltersInternalAction.FiltersContentChanged) {
            UniversalMapInternalAction.FiltersInternalAction.FiltersContentChanged filtersContentChanged = (UniversalMapInternalAction.FiltersInternalAction.FiltersContentChanged) filtersInternalAction;
            if (aVar instanceof b.a.C9379a) {
                b.a.C9379a c9379a = (b.a.C9379a) aVar;
                return com.avito.android.universal_map.map.mvi.entity.b.a(bVar, null, new b.a.C9379a(c9379a.f305562a, c9379a.f305563b, c9379a.f305564c, filtersContentChanged.f305481e, filtersContentChanged.f305482f, filtersContentChanged.f305483g, c9379a.f305568g), 7);
            }
            if (aVar instanceof b.a.c) {
                return bVar;
            }
            return com.avito.android.universal_map.map.mvi.entity.b.a(bVar, null, new b.a.C9379a(filtersContentChanged.f305478b, filtersContentChanged.f305479c, filtersContentChanged.f305480d, filtersContentChanged.f305481e, filtersContentChanged.f305482f, filtersContentChanged.f305483g, null), 7);
        }
        if (filtersInternalAction instanceof UniversalMapInternalAction.FiltersInternalAction.FiltersError) {
            return com.avito.android.universal_map.map.mvi.entity.b.a(bVar, null, new b.a.C9380b(((UniversalMapInternalAction.FiltersInternalAction.FiltersError) filtersInternalAction).f305484b), 7);
        }
        if (filtersInternalAction instanceof UniversalMapInternalAction.FiltersInternalAction.FiltersLoading) {
            return com.avito.android.universal_map.map.mvi.entity.b.a(bVar, null, b.a.d.f305571a, 7);
        }
        if (filtersInternalAction instanceof UniversalMapInternalAction.FiltersInternalAction.FiltersLoaded) {
            UniversalMapInternalAction.FiltersInternalAction.FiltersLoaded filtersLoaded = (UniversalMapInternalAction.FiltersInternalAction.FiltersLoaded) filtersInternalAction;
            return com.avito.android.universal_map.map.mvi.entity.b.a(bVar, null, new b.a.C9379a(filtersLoaded.f305486b, filtersLoaded.f305487c, filtersLoaded.f305488d, filtersLoaded.f305489e, filtersLoaded.f305490f, filtersLoaded.f305491g, filtersLoaded.f305492h), 7);
        }
        if (filtersInternalAction instanceof UniversalMapInternalAction.FiltersInternalAction.FiltersApplied) {
            return new com.avito.android.universal_map.map.mvi.entity.b(!A4.j(A4.f318516a, r12.f305477b).isEmpty(), null, ((UniversalMapInternalAction.FiltersInternalAction.FiltersApplied) filtersInternalAction).f305477b, new b.a.c(list, 1, objArr == true ? 1 : 0), 2, null);
        }
        if (filtersInternalAction instanceof UniversalMapInternalAction.FiltersInternalAction.FiltersTooltipDataChanged) {
            return com.avito.android.universal_map.map.mvi.entity.b.a(bVar, ((UniversalMapInternalAction.FiltersInternalAction.FiltersTooltipDataChanged) filtersInternalAction).f305495b, null, 13);
        }
        if (filtersInternalAction instanceof UniversalMapInternalAction.FiltersInternalAction.ShowFiltersTooltip) {
            return bVar;
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // com.avito.android.arch.mvi.u
    public final /* bridge */ /* synthetic */ com.avito.android.universal_map.map.mvi.entity.b a(UniversalMapInternalAction.FiltersInternalAction filtersInternalAction, com.avito.android.universal_map.map.mvi.entity.b bVar) {
        return b(filtersInternalAction, bVar);
    }
}
