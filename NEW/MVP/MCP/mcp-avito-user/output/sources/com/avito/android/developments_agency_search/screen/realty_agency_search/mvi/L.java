package com.avito.android.developments_agency_search.screen.realty_agency_search.mvi;

import Lw.b;
import android.content.Context;
import android.net.Uri;
import com.avito.android.R;
import com.avito.android.beduin.v2.page.BeduinV2BottomSheetDeepLink;
import com.avito.android.deep_linking.links.WebViewLink;
import com.avito.android.developments_agency_search.screen.realty_agency_search.mvi.entity.RealtyAgencySearchInternalAction;
import com.avito.android.realty_agency.beduin.LotCardParentScreen;
import com.avito.android.realty_agency.beduin.NavigationMenuParentScreen;
import com.avito.android.realty_agency.beduin.SelectionClientPickerParentScreen;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42745f0;

/* compiled from: RealtyAgencySearchOneTimeEventProducer.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/developments_agency_search/screen/realty_agency_search/mvi/L;", "Lcom/avito/android/arch/mvi/t;", "Lcom/avito/android/developments_agency_search/screen/realty_agency_search/mvi/entity/RealtyAgencySearchInternalAction;", "LLw/b;", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class L implements com.avito.android.arch.mvi.t<RealtyAgencySearchInternalAction, Lw.b> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Context f138757b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.realty_agency.beduin.a f138758c;

    @Inject
    public L(@Y61.k Context context, @Y61.k com.avito.android.realty_agency.beduin.a aVar) {
        this.f138757b = context;
        this.f138758c = aVar;
    }

    @Override // com.avito.android.arch.mvi.t
    public final Lw.b b(RealtyAgencySearchInternalAction realtyAgencySearchInternalAction) {
        Lw.b oVar;
        RealtyAgencySearchInternalAction realtyAgencySearchInternalAction2 = realtyAgencySearchInternalAction;
        if (realtyAgencySearchInternalAction2 instanceof RealtyAgencySearchInternalAction.ScrollToTop) {
            return b.i.f10227a;
        }
        if (realtyAgencySearchInternalAction2 instanceof RealtyAgencySearchInternalAction.RefreshInlineFilter) {
            return b.h.f10226a;
        }
        if (realtyAgencySearchInternalAction2 instanceof RealtyAgencySearchInternalAction.CloseScreen) {
            return b.a.f10217a;
        }
        if (realtyAgencySearchInternalAction2 instanceof RealtyAgencySearchInternalAction.ShowDevelopmentSortingTypeDialogSelector) {
            return b.k.f10230a;
        }
        if (realtyAgencySearchInternalAction2 instanceof RealtyAgencySearchInternalAction.ShowLotSortingTypeDialogSelector) {
            return b.n.f10235a;
        }
        boolean z12 = realtyAgencySearchInternalAction2 instanceof RealtyAgencySearchInternalAction.ShowDevelopmentItemBottomSheetOptions;
        Context context = this.f138757b;
        if (z12) {
            String string = context.getString(R.string.das_development_client_fixation_bottom_sheet_option);
            oVar = new b.j(((RealtyAgencySearchInternalAction.ShowDevelopmentItemBottomSheetOptions) realtyAgencySearchInternalAction2).f138872b, C42745f0.V(new com.avito.android.lib.design.bottom_sheet.k(string, string, null, null, null, null, null, null, null, null, null, null, 4092, null)));
        } else if (realtyAgencySearchInternalAction2 instanceof RealtyAgencySearchInternalAction.ShowLotItemBottomSheetOptions) {
            RealtyAgencySearchInternalAction.ShowLotItemBottomSheetOptions showLotItemBottomSheetOptions = (RealtyAgencySearchInternalAction.ShowLotItemBottomSheetOptions) realtyAgencySearchInternalAction2;
            oVar = new b.m(showLotItemBottomSheetOptions.f138878b, C42745f0.U(new com.avito.android.lib.design.bottom_sheet.k(context.getString(R.string.das_lot_client_fixation_bottom_sheet_option), context.getString(R.string.das_lot_client_fixation_bottom_sheet_option), null, null, null, null, null, null, null, null, null, null, 4092, null), new com.avito.android.lib.design.bottom_sheet.k(context.getString(R.string.das_lot_booking_bottom_sheet_option), context.getString(R.string.das_lot_booking_bottom_sheet_option), null, null, null, null, null, null, null, null, null, null, 4092, null)), showLotItemBottomSheetOptions.f138879c);
        } else {
            boolean z13 = realtyAgencySearchInternalAction2 instanceof RealtyAgencySearchInternalAction.ShowSelectionClientPickerBottomSheetScreen;
            com.avito.android.realty_agency.beduin.a aVar = this.f138758c;
            if (z13) {
                SelectionClientPickerParentScreen[] selectionClientPickerParentScreenArr = SelectionClientPickerParentScreen.f250857b;
                RealtyAgencySearchInternalAction.ShowSelectionClientPickerBottomSheetScreen showSelectionClientPickerBottomSheetScreen = (RealtyAgencySearchInternalAction.ShowSelectionClientPickerBottomSheetScreen) realtyAgencySearchInternalAction2;
                oVar = new b.c(aVar.e(showSelectionClientPickerBottomSheetScreen.f138884b, showSelectionClientPickerBottomSheetScreen.f138885c));
            } else {
                if (realtyAgencySearchInternalAction2 instanceof RealtyAgencySearchInternalAction.ShowSelectionsOnboardingBottomSheet) {
                    aVar.f250879i.getClass();
                    return new b.c(new BeduinV2BottomSheetDeepLink("api/1/nd-trx/selections/form/onboarding", "RealtyAgencySelectionsOnboarding", "fit", false, null, null, null, null, false, 496, null));
                }
                if (realtyAgencySearchInternalAction2 instanceof RealtyAgencySearchInternalAction.ShowClientFixationScreen) {
                    RealtyAgencySearchInternalAction.ShowClientFixationScreen showClientFixationScreen = (RealtyAgencySearchInternalAction.ShowClientFixationScreen) realtyAgencySearchInternalAction2;
                    oVar = new b.c(aVar.c(showClientFixationScreen.f138870b, showClientFixationScreen.f138871c));
                } else if (realtyAgencySearchInternalAction2 instanceof RealtyAgencySearchInternalAction.ShowBookingScreen) {
                    RealtyAgencySearchInternalAction.ShowBookingScreen showBookingScreen = (RealtyAgencySearchInternalAction.ShowBookingScreen) realtyAgencySearchInternalAction2;
                    oVar = new b.c(aVar.a(showBookingScreen.f138868b, showBookingScreen.f138869c));
                } else {
                    if (realtyAgencySearchInternalAction2 instanceof RealtyAgencySearchInternalAction.ShowNavigationMenuScreen) {
                        NavigationMenuParentScreen[] navigationMenuParentScreenArr = NavigationMenuParentScreen.f250855b;
                        aVar.f250875e.getClass();
                        return new b.c(new BeduinV2BottomSheetDeepLink("api/1/nd-trx/navigations/form?parentScreen=prof_search", "RealtyAgencyNavigationMenu", "fit", false, null, null, null, null, false, 496, null));
                    }
                    if (realtyAgencySearchInternalAction2 instanceof RealtyAgencySearchInternalAction.HandleDeeplink) {
                        oVar = new b.c(((RealtyAgencySearchInternalAction.HandleDeeplink) realtyAgencySearchInternalAction2).f138843b);
                    } else if (realtyAgencySearchInternalAction2 instanceof RealtyAgencySearchInternalAction.OpenFiltersScreen) {
                        oVar = new b.f(((RealtyAgencySearchInternalAction.OpenFiltersScreen) realtyAgencySearchInternalAction2).f138857b);
                    } else if (realtyAgencySearchInternalAction2 instanceof RealtyAgencySearchInternalAction.OpenLocationGroupScreen) {
                        oVar = new b.g(((RealtyAgencySearchInternalAction.OpenLocationGroupScreen) realtyAgencySearchInternalAction2).f138858b);
                    } else if (realtyAgencySearchInternalAction2 instanceof RealtyAgencySearchInternalAction.OpenWebView) {
                        oVar = new b.c(new WebViewLink.AnyDomain(Uri.parse(((RealtyAgencySearchInternalAction.OpenWebView) realtyAgencySearchInternalAction2).f138859b), null, null, 6, null));
                    } else {
                        if (realtyAgencySearchInternalAction2 instanceof RealtyAgencySearchInternalAction.ContentBottomSheet.Collapse) {
                            return b.InterfaceC0647b.a.f10218a;
                        }
                        if (realtyAgencySearchInternalAction2 instanceof RealtyAgencySearchInternalAction.ContentBottomSheet.ExpandByHalf) {
                            return b.InterfaceC0647b.C0648b.f10219a;
                        }
                        if (realtyAgencySearchInternalAction2 instanceof RealtyAgencySearchInternalAction.ShowHelpCenterBottomSheet) {
                            oVar = new b.l(((RealtyAgencySearchInternalAction.ShowHelpCenterBottomSheet) realtyAgencySearchInternalAction2).f138877b);
                        } else if (realtyAgencySearchInternalAction2 instanceof RealtyAgencySearchInternalAction.Map.MoveToPoint) {
                            RealtyAgencySearchInternalAction.Map.MoveToPoint moveToPoint = (RealtyAgencySearchInternalAction.Map.MoveToPoint) realtyAgencySearchInternalAction2;
                            oVar = new b.e(moveToPoint.f138851b, moveToPoint.f138852c);
                        } else if (realtyAgencySearchInternalAction2 instanceof RealtyAgencySearchInternalAction.Map.MoveToBounds) {
                            oVar = new b.d(((RealtyAgencySearchInternalAction.Map.MoveToBounds) realtyAgencySearchInternalAction2).f138850b);
                        } else if (realtyAgencySearchInternalAction2 instanceof RealtyAgencySearchInternalAction.ShowDevelopmentItemCardScreen) {
                            RealtyAgencySearchInternalAction.ShowDevelopmentItemCardScreen showDevelopmentItemCardScreen = (RealtyAgencySearchInternalAction.ShowDevelopmentItemCardScreen) realtyAgencySearchInternalAction2;
                            oVar = new b.c(aVar.b(showDevelopmentItemCardScreen.f138873b, showDevelopmentItemCardScreen.f138874c, showDevelopmentItemCardScreen.f138875d));
                        } else if (realtyAgencySearchInternalAction2 instanceof RealtyAgencySearchInternalAction.ShowLotItemCardScreen) {
                            RealtyAgencySearchInternalAction.ShowLotItemCardScreen showLotItemCardScreen = (RealtyAgencySearchInternalAction.ShowLotItemCardScreen) realtyAgencySearchInternalAction2;
                            oVar = new b.c(aVar.d(LotCardParentScreen.f250850c, showLotItemCardScreen.f138880b, showLotItemCardScreen.f138881c));
                        } else {
                            if (!(realtyAgencySearchInternalAction2 instanceof RealtyAgencySearchInternalAction.ShowToast)) {
                                return null;
                            }
                            oVar = new b.o(((RealtyAgencySearchInternalAction.ShowToast) realtyAgencySearchInternalAction2).f138887b);
                        }
                    }
                }
            }
        }
        return oVar;
    }
}
