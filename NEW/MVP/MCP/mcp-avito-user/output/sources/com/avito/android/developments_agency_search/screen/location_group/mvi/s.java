package com.avito.android.developments_agency_search.screen.location_group.mvi;

import Iw.C14165c;
import Iw.d;
import androidx.compose.runtime.internal.P;
import com.avito.android.arch.mvi.u;
import com.avito.android.developments_agency_search.screen.location_group.mvi.entity.LocationGroupInternalAction;
import com.avito.android.search.filter.ParametersTreeWithAdditionalImpl;
import com.avito.android.search.filter.converter.ParameterElement;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.s0;

/* compiled from: LocationGroupReducer.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/developments_agency_search/screen/location_group/mvi/s;", "Lcom/avito/android/arch/mvi/u;", "Lcom/avito/android/developments_agency_search/screen/location_group/mvi/entity/LocationGroupInternalAction;", "LIw/c;", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class s implements u<LocationGroupInternalAction, C14165c> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.developments_agency_search.screen.big_filters.converter.e f138216b;

    @Inject
    public s(@Y61.k com.avito.android.developments_agency_search.screen.big_filters.converter.e eVar) {
        this.f138216b = eVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.lang.Object] */
    @Override // com.avito.android.arch.mvi.u
    public final C14165c a(LocationGroupInternalAction locationGroupInternalAction, C14165c c14165c) {
        ParameterElement.q next;
        List list;
        LocationGroupInternalAction locationGroupInternalAction2 = locationGroupInternalAction;
        C14165c c14165c2 = c14165c;
        if (locationGroupInternalAction2 instanceof LocationGroupInternalAction.FiltersLoading.StartLoading) {
            return C14165c.a(c14165c2, null, null, null, d.b.f8628a, 15);
        }
        if (locationGroupInternalAction2 instanceof LocationGroupInternalAction.FiltersLoading.LoadingError) {
            return C14165c.a(c14165c2, null, null, null, d.c.f8629a, 15);
        }
        if (!(locationGroupInternalAction2 instanceof LocationGroupInternalAction.FiltersLoading.Loaded)) {
            return locationGroupInternalAction2 instanceof LocationGroupInternalAction.UpdateSearchParams ? C14165c.a(c14165c2, ((LocationGroupInternalAction.UpdateSearchParams) locationGroupInternalAction2).f138177b, null, null, null, 30) : c14165c2;
        }
        LocationGroupInternalAction.FiltersLoading.Loaded loaded = (LocationGroupInternalAction.FiltersLoading.Loaded) locationGroupInternalAction2;
        ParametersTreeWithAdditionalImpl parametersTreeWithAdditionalImpl = new ParametersTreeWithAdditionalImpl(loaded.f138171b.getParameters(), null);
        com.avito.android.developments_agency_search.screen.big_filters.converter.e eVar = this.f138216b;
        Iterator it = eVar.a(parametersTreeWithAdditionalImpl).iterator();
        while (true) {
            if (!it.hasNext()) {
                next = 0;
                break;
            }
            next = it.next();
            if (((com.avito.conveyor_item.a) next) instanceof ParameterElement.q) {
                break;
            }
        }
        ParameterElement.q qVar = next instanceof ParameterElement.q ? next : null;
        if (qVar == null || (list = qVar.f262814f) == null) {
            list = C42784z0.f406748b;
        }
        return C14165c.a(c14165c2, null, loaded.f138172c, loaded.f138173d, new d.a(eVar.a(new UV0.c(list))), 9);
    }
}
