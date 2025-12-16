package com.avito.android.developments_agency_search.screen.realty_agency_search.mvi;

import com.avito.android.developments_agency_search.screen.realty_agency_search.adapter.tab_layout.Tab;
import com.avito.android.developments_agency_search.screen.realty_agency_search.model.DevelopmentSort;
import com.avito.android.developments_agency_search.screen.realty_agency_search.model.LotSort;
import com.avito.android.developments_agency_search.screen.realty_agency_search.model.RealtyAgencySearchArguments;
import com.avito.android.developments_agency_search.screen.realty_agency_search.mvi.entity.RealtyAgencySearchInternalAction;
import com.avito.android.remote.model.SearchParams;
import kotlin.Metadata;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: RealtyAgencySearchInteractor.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b`\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/developments_agency_search/screen/realty_agency_search/mvi/E;", "", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public interface E {

    /* compiled from: RealtyAgencySearchInteractor.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public static InterfaceC43160i a(E e12, Lw.c cVar, Tab tab, SearchParams searchParams, boolean z12, DevelopmentSort developmentSort, LotSort lotSort, int i12, int i13) {
            if ((i13 & 2) != 0) {
                tab = cVar.f10248l;
            }
            Tab tab2 = tab;
            if ((i13 & 4) != 0) {
                searchParams = cVar.f10238b;
            }
            SearchParams searchParams2 = searchParams;
            if ((i13 & 8) != 0) {
                z12 = cVar.f10242f.f10252c;
            }
            boolean z13 = z12;
            if ((i13 & 16) != 0) {
                developmentSort = cVar.f10242f.f10250a;
            }
            DevelopmentSort developmentSort2 = developmentSort;
            if ((i13 & 32) != 0) {
                lotSort = cVar.f10242f.f10251b;
            }
            LotSort lotSort2 = lotSort;
            if ((i13 & 64) != 0) {
                i12 = 1;
            }
            return e12.d(i12, tab2, developmentSort2, lotSort2, searchParams2, z13);
        }
    }

    @Y61.k
    InterfaceC43160i<RealtyAgencySearchInternalAction> a(@Y61.k String str);

    @Y61.k
    InterfaceC43160i<RealtyAgencySearchInternalAction> b(@Y61.k SearchParams searchParams, int i12);

    @Y61.k
    InterfaceC43160i c(@Y61.k RealtyAgencySearchArguments.MapArguments mapArguments, @Y61.l RealtyAgencySearchArguments.CommissionPromoBanner commissionPromoBanner);

    @Y61.k
    InterfaceC43160i d(int i12, @Y61.k Tab tab, @Y61.k DevelopmentSort developmentSort, @Y61.k LotSort lotSort, @Y61.k SearchParams searchParams, boolean z12);
}
