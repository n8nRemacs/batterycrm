package com.avito.android.developments_agency_search.screen.realty_agency_search.mvi;

import Lw.c;
import com.adjust.sdk.network.ErrorCodes;
import com.avito.android.developments_agency_search.screen.realty_agency_search.model.RealtyAgencySearchArguments;
import com.avito.android.developments_agency_search.screen.realty_agency_search.mvi.entity.RealtyAgencySearchInternalAction;
import com.avito.android.remote.model.SearchParams;
import com.avito.android.util.P2;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42784z0;

/* compiled from: RealtyAgencySearchReducer.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/developments_agency_search/screen/realty_agency_search/mvi/b0;", "Lcom/avito/android/arch/mvi/u;", "Lcom/avito/android/developments_agency_search/screen/realty_agency_search/mvi/entity/RealtyAgencySearchInternalAction;", "LLw/c;", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class b0 implements com.avito.android.arch.mvi.u<RealtyAgencySearchInternalAction, Lw.c> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final RealtyAgencySearchArguments f138796b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final e0 f138797c;

    @Inject
    public b0(@Y61.k RealtyAgencySearchArguments realtyAgencySearchArguments, @Y61.k e0 e0Var) {
        this.f138796b = realtyAgencySearchArguments;
        this.f138797c = e0Var;
    }

    public static boolean b(SearchParams searchParams) {
        if (searchParams.getPriceMax() != null || searchParams.getPriceMin() != null) {
            return true;
        }
        if (searchParams.getParams() != null && (!r0.isEmpty())) {
            return true;
        }
        if (searchParams.getMetroIds() != null && (!r0.isEmpty())) {
            return true;
        }
        List<String> districtId = searchParams.getDistrictId();
        return districtId != null && (districtId.isEmpty() ^ true);
    }

    @Override // com.avito.android.arch.mvi.u
    public final Lw.c a(RealtyAgencySearchInternalAction realtyAgencySearchInternalAction, Lw.c cVar) {
        Lw.c cVarE;
        RealtyAgencySearchInternalAction realtyAgencySearchInternalAction2 = realtyAgencySearchInternalAction;
        Lw.c cVar2 = cVar;
        boolean z12 = realtyAgencySearchInternalAction2 instanceof RealtyAgencySearchInternalAction.UpdateSelectedTab;
        e0 e0Var = this.f138797c;
        if (z12) {
            return e0Var.e(new N(cVar2, realtyAgencySearchInternalAction2));
        }
        if (realtyAgencySearchInternalAction2 instanceof RealtyAgencySearchInternalAction.UpdateDevelopmentSortingType) {
            return Lw.c.a(cVar2, null, null, null, null, c.a.a(cVar2.f10242f, ((RealtyAgencySearchInternalAction.UpdateDevelopmentSortingType) realtyAgencySearchInternalAction2).f138890b, null, false, 6), null, null, false, null, null, ErrorCodes.IO_EXCEPTION);
        }
        if (realtyAgencySearchInternalAction2 instanceof RealtyAgencySearchInternalAction.UpdateLotSortingType) {
            return Lw.c.a(cVar2, null, null, null, null, c.a.a(cVar2.f10242f, null, ((RealtyAgencySearchInternalAction.UpdateLotSortingType) realtyAgencySearchInternalAction2).f138892b, false, 5), null, null, false, null, null, ErrorCodes.IO_EXCEPTION);
        }
        if (realtyAgencySearchInternalAction2 instanceof RealtyAgencySearchInternalAction.UpdateClientMode) {
            return Lw.c.a(cVar2, null, null, null, null, c.a.a(cVar2.f10242f, null, null, ((RealtyAgencySearchInternalAction.UpdateClientMode) realtyAgencySearchInternalAction2).f138888b, 3), null, null, false, null, null, ErrorCodes.IO_EXCEPTION);
        }
        if (realtyAgencySearchInternalAction2 instanceof RealtyAgencySearchInternalAction.DevelopmentsLoading) {
            RealtyAgencySearchInternalAction.DevelopmentsLoading developmentsLoading = (RealtyAgencySearchInternalAction.DevelopmentsLoading) realtyAgencySearchInternalAction2;
            if (developmentsLoading instanceof RealtyAgencySearchInternalAction.DevelopmentsLoading.StartLoading) {
                P2.c cVar3 = P2.c.f318721a;
                c.C0649c c0649c = cVar2.f10243g;
                List list = ((RealtyAgencySearchInternalAction.DevelopmentsLoading.StartLoading) developmentsLoading).f138842d == 1 ? C42784z0.f406748b : c0649c.f10254b;
                c0649c.getClass();
                cVarE = e0Var.d(Lw.c.a(cVar2, null, null, null, null, null, new c.C0649c(cVar3, list), null, false, null, null, 991));
            } else if (developmentsLoading instanceof RealtyAgencySearchInternalAction.DevelopmentsLoading.Loaded) {
                cVarE = e0Var.e(new T(cVar2, developmentsLoading));
            } else {
                if (!(developmentsLoading instanceof RealtyAgencySearchInternalAction.DevelopmentsLoading.LoadingError)) {
                    throw new NoWhenBranchMatchedException();
                }
                cVarE = e0Var.e(new U(cVar2, developmentsLoading));
            }
        } else if (realtyAgencySearchInternalAction2 instanceof RealtyAgencySearchInternalAction.LotsLoading) {
            RealtyAgencySearchInternalAction.LotsLoading lotsLoading = (RealtyAgencySearchInternalAction.LotsLoading) realtyAgencySearchInternalAction2;
            if (lotsLoading instanceof RealtyAgencySearchInternalAction.LotsLoading.StartLoading) {
                P2.c cVar4 = P2.c.f318721a;
                c.e eVar = cVar2.f10244h;
                cVarE = e0Var.d(Lw.c.a(cVar2, null, null, null, null, null, null, c.e.a(eVar, cVar4, ((RealtyAgencySearchInternalAction.LotsLoading.StartLoading) lotsLoading).f138849d == 1 ? C42784z0.f406748b : eVar.f10262b, 4), false, null, null, 959));
            } else if (lotsLoading instanceof RealtyAgencySearchInternalAction.LotsLoading.Loaded) {
                cVarE = e0Var.e(new V(cVar2, lotsLoading));
            } else {
                if (!(lotsLoading instanceof RealtyAgencySearchInternalAction.LotsLoading.LoadingError)) {
                    throw new NoWhenBranchMatchedException();
                }
                cVarE = e0Var.e(new W(cVar2, lotsLoading));
            }
        } else {
            if (realtyAgencySearchInternalAction2 instanceof RealtyAgencySearchInternalAction.SearchParamsClarifiedInternalAction) {
                c.d dVar = cVar2.f10240d;
                boolean z13 = dVar.f10257b;
                SearchParams searchParams = ((RealtyAgencySearchInternalAction.SearchParamsClarifiedInternalAction) realtyAgencySearchInternalAction2).f138862b;
                return Lw.c.a(cVar2, searchParams, null, new c.d(dVar.f10256a, dVar.f10257b, z13 && b(searchParams), dVar.f10259d, dVar.f10260e), null, null, null, null, false, null, null, 1018);
            }
            if (realtyAgencySearchInternalAction2 instanceof RealtyAgencySearchInternalAction.UpdateCommissionPromoBanner) {
                return e0Var.e(new O(cVar2, realtyAgencySearchInternalAction2));
            }
            if (realtyAgencySearchInternalAction2 instanceof RealtyAgencySearchInternalAction.UpdateInlineFiltersLoadingState) {
                RealtyAgencySearchInternalAction.UpdateInlineFiltersLoadingState updateInlineFiltersLoadingState = (RealtyAgencySearchInternalAction.UpdateInlineFiltersLoadingState) realtyAgencySearchInternalAction2;
                boolean z14 = updateInlineFiltersLoadingState.f138891b;
                boolean z15 = z14 && b(cVar2.f10238b);
                RealtyAgencySearchArguments realtyAgencySearchArguments = this.f138796b;
                boolean z16 = updateInlineFiltersLoadingState.f138891b;
                return Lw.c.a(cVar2, null, null, new c.d(z14, z14, z15, z16 && realtyAgencySearchArguments.f138667e, z16 && realtyAgencySearchArguments.f138666d), null, null, null, null, false, null, null, 1019);
            }
            if (realtyAgencySearchInternalAction2 instanceof RealtyAgencySearchInternalAction.ContentBottomSheet.UpdateState) {
                return e0Var.e(new P(cVar2, realtyAgencySearchInternalAction2));
            }
            if (realtyAgencySearchInternalAction2 instanceof RealtyAgencySearchInternalAction.Map.UpdateLastLoadedMarkers) {
                return e0Var.e(new Q(cVar2, realtyAgencySearchInternalAction2));
            }
            if (realtyAgencySearchInternalAction2 instanceof RealtyAgencySearchInternalAction.Map.UpdateSelectedMarker) {
                return e0Var.e(new S(cVar2, realtyAgencySearchInternalAction2));
            }
            if (realtyAgencySearchInternalAction2 instanceof RealtyAgencySearchInternalAction.Map.UpdateBounds) {
                RealtyAgencySearchInternalAction.Map.UpdateBounds updateBounds = (RealtyAgencySearchInternalAction.Map.UpdateBounds) realtyAgencySearchInternalAction2;
                return Lw.c.a(cVar2, null, null, null, null, null, null, null, false, c.f.a(cVar2.f10246j, null, null, null, updateBounds.f138853b, updateBounds.f138854c, 7), null, 767);
            }
            if (!(realtyAgencySearchInternalAction2 instanceof RealtyAgencySearchInternalAction.SelectedDevelopmentItemInfoLoading)) {
                return cVar2;
            }
            RealtyAgencySearchInternalAction.SelectedDevelopmentItemInfoLoading selectedDevelopmentItemInfoLoading = (RealtyAgencySearchInternalAction.SelectedDevelopmentItemInfoLoading) realtyAgencySearchInternalAction2;
            if (selectedDevelopmentItemInfoLoading instanceof RealtyAgencySearchInternalAction.SelectedDevelopmentItemInfoLoading.StartLoading) {
                cVarE = e0Var.e(new X(cVar2));
            } else if (selectedDevelopmentItemInfoLoading instanceof RealtyAgencySearchInternalAction.SelectedDevelopmentItemInfoLoading.Loaded) {
                cVarE = e0Var.e(new Y(cVar2, selectedDevelopmentItemInfoLoading));
            } else if (selectedDevelopmentItemInfoLoading instanceof RealtyAgencySearchInternalAction.SelectedDevelopmentItemInfoLoading.LoadingError) {
                cVarE = e0Var.e(new Z(cVar2, selectedDevelopmentItemInfoLoading));
            } else {
                if (!(selectedDevelopmentItemInfoLoading instanceof RealtyAgencySearchInternalAction.SelectedDevelopmentItemInfoLoading.Clear)) {
                    throw new NoWhenBranchMatchedException();
                }
                cVarE = e0Var.e(new a0(cVar2));
            }
        }
        return cVarE;
    }
}
