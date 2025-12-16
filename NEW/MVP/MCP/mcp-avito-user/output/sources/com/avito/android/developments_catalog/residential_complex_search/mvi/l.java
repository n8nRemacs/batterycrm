package com.avito.android.developments_catalog.residential_complex_search.mvi;

import com.avito.android.arch.mvi.u;
import com.avito.android.developments_catalog.residential_complex_search.mvi.entity.ResidentialComplexInternalAction;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: ResidentialComplexReducer.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/developments_catalog/residential_complex_search/mvi/l;", "Lcom/avito/android/arch/mvi/u;", "Lcom/avito/android/developments_catalog/residential_complex_search/mvi/entity/ResidentialComplexInternalAction;", "Lcom/avito/android/developments_catalog/residential_complex_search/mvi/n;", "_avito_developments-catalog_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class l implements u<ResidentialComplexInternalAction, n> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.developments_catalog.residential_complex_search.e f139223b;

    @Inject
    public l(@Y61.k com.avito.android.developments_catalog.residential_complex_search.e eVar) {
        this.f139223b = eVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v4, types: [java.lang.Object, java.util.List] */
    @Override // com.avito.android.arch.mvi.u
    public final n a(ResidentialComplexInternalAction residentialComplexInternalAction, n nVar) {
        ResidentialComplexInternalAction residentialComplexInternalAction2 = residentialComplexInternalAction;
        n nVar2 = nVar;
        if (residentialComplexInternalAction2 instanceof ResidentialComplexInternalAction.SearchFieldInput) {
            return n.a(nVar2, true, null, ((ResidentialComplexInternalAction.SearchFieldInput) residentialComplexInternalAction2).f139216b, null, 16);
        }
        if (residentialComplexInternalAction2 instanceof ResidentialComplexInternalAction.SearchDataLoaded) {
            return n.a(nVar2, false, null, null, new o(this.f139223b.a(((ResidentialComplexInternalAction.SearchDataLoaded) residentialComplexInternalAction2).f139214b)), 12);
        }
        return residentialComplexInternalAction2 instanceof ResidentialComplexInternalAction.Error ? n.a(nVar2, false, ((ResidentialComplexInternalAction.Error) residentialComplexInternalAction2).f139210c, null, null, 28) : nVar2;
    }
}
