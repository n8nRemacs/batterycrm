package com.avito.android.developments_agency_search.screen.deal_cabinet.mvi;

import android.net.Uri;
import androidx.compose.runtime.internal.P;
import com.avito.android.arch.mvi.t;
import com.avito.android.deep_linking.links.WebViewLink;
import com.avito.android.developments_agency_search.deeplink.DealRoomLink;
import com.avito.android.developments_agency_search.deeplink.MortgageProApplicationLink;
import com.avito.android.developments_agency_search.screen.deal_cabinet.mvi.entity.DealCabinetInternalAction;
import com.avito.android.developments_agency_search.screen.deal_cabinet.return_to_work.model.ReturnToWorkArguments;
import com.avito.android.mortgage_invite.deeplink.MortgageApplicationLeadLink;
import d20.C39487a;
import javax.inject.Inject;
import kotlin.Metadata;
import zw.c;

/* compiled from: DealCabinetOneTimeEventProducer.kt */
@P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/developments_agency_search/screen/deal_cabinet/mvi/o;", "Lcom/avito/android/arch/mvi/t;", "Lcom/avito/android/developments_agency_search/screen/deal_cabinet/mvi/entity/DealCabinetInternalAction;", "Lzw/c;", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class o implements t<DealCabinetInternalAction, zw.c> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final C39487a f137152b;

    @Inject
    public o(@Y61.k C39487a c39487a) {
        this.f137152b = c39487a;
    }

    @Override // com.avito.android.arch.mvi.t
    public final zw.c b(DealCabinetInternalAction dealCabinetInternalAction) {
        DealCabinetInternalAction dealCabinetInternalAction2 = dealCabinetInternalAction;
        if (dealCabinetInternalAction2 instanceof DealCabinetInternalAction.OpenDealRoomScreen) {
            DealCabinetInternalAction.OpenDealRoomScreen openDealRoomScreen = (DealCabinetInternalAction.OpenDealRoomScreen) dealCabinetInternalAction2;
            return new c.b(new DealRoomLink(openDealRoomScreen.f137092b, openDealRoomScreen.f137093c, openDealRoomScreen.f137094d));
        }
        if (dealCabinetInternalAction2 instanceof DealCabinetInternalAction.OpenMortgageDeeplink) {
            return new c.b(((DealCabinetInternalAction.OpenMortgageDeeplink) dealCabinetInternalAction2).f137095b);
        }
        if (dealCabinetInternalAction2 instanceof DealCabinetInternalAction.OpenMortgageProApplicationLink) {
            C39487a c39487a = this.f137152b;
            c39487a.getClass();
            kotlin.reflect.n<Object> nVar = C39487a.f393624d[0];
            return new c.b(((Boolean) c39487a.f393625b.a().invoke()).booleanValue() ? new MortgageApplicationLeadLink("partner_channel", "nd-mortgage-list") : new MortgageProApplicationLink("new_landing_professional"));
        }
        if (dealCabinetInternalAction2 instanceof DealCabinetInternalAction.CloseScreen) {
            return c.a.f444374a;
        }
        if (dealCabinetInternalAction2 instanceof DealCabinetInternalAction.ShowClientsFilterSelectorScreen) {
            return new c.C12981c(((DealCabinetInternalAction.ShowClientsFilterSelectorScreen) dealCabinetInternalAction2).f137102b);
        }
        if (dealCabinetInternalAction2 instanceof DealCabinetInternalAction.ShowMortgageFilterSelectorScreen) {
            return new c.d(((DealCabinetInternalAction.ShowMortgageFilterSelectorScreen) dealCabinetInternalAction2).f137103b);
        }
        if (dealCabinetInternalAction2 instanceof DealCabinetInternalAction.OpenWebView) {
            return new c.b(new WebViewLink.AnyDomain(Uri.parse(((DealCabinetInternalAction.OpenWebView) dealCabinetInternalAction2).f137097b), null, null, 6, null));
        }
        if (!(dealCabinetInternalAction2 instanceof DealCabinetInternalAction.ReturnToWork)) {
            return null;
        }
        DealCabinetInternalAction.ReturnToWork returnToWork = (DealCabinetInternalAction.ReturnToWork) dealCabinetInternalAction2;
        return new c.e(new ReturnToWorkArguments("REQUEST_SHOW_RETURN_TO_WORK_DIALOG", returnToWork.f137100b, returnToWork.f137101c));
    }
}
