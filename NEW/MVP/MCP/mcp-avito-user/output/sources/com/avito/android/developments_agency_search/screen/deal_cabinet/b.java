package com.avito.android.developments_agency_search.screen.deal_cabinet;

import android.content.Context;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.beduin.v2.page.BeduinV2PageDeepLink;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.developments_agency_search.deeplink.DealRoomLink;
import com.avito.android.developments_agency_search.deeplink.MortgageProApplicationLink;
import com.avito.android.developments_agency_search.deeplink.RealtyAgencySearchLink;
import com.avito.android.developments_agency_search.domain.GetClientListRequestStage;
import com.avito.android.developments_agency_search.domain.GetClientListResponse;
import com.avito.android.developments_agency_search.domain.GetDealCabinetHeader;
import com.avito.android.developments_agency_search.domain.GetDealUpdatesResponse;
import com.avito.android.developments_agency_search.domain.GetMortgageListRequestStatus;
import com.avito.android.mortgage_invite.deeplink.MortgageApplicationLeadLink;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.realty_agency.beduin.SelectionListParentScreen;
import com.avito.android.realty_agency.beduin.TariffCardParentScreen;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.SearchParams;
import com.avito.android.remote.model.Size;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.util.B4;
import com.avito.android.visual_rubricator.Space;
import com.avito.android.visual_rubricator.element.VisualRubricatorWidgetElementItem;
import com.avito.android.visual_rubricator.element.VisualRubricatorWidgetElementLayout;
import d20.C39487a;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.NoSuchElementException;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import shark.AndroidResourceIdNames;

/* compiled from: DealCabinetConverter.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/developments_agency_search/screen/deal_cabinet/b;", "Lcom/avito/android/developments_agency_search/screen/deal_cabinet/a;", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class b implements com.avito.android.developments_agency_search.screen.deal_cabinet.a {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Context f136898a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final DealCabinetArguments f136899b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.realty_agency.beduin.a f136900c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final C39487a f136901d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final AO0.b f136902e;

    /* compiled from: DealCabinetConverter.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f136903a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f136904b;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ int[] f136905c;

        /* renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ int[] f136906d;

        static {
            int[] iArr = new int[GetDealCabinetHeader.BannerItem.values().length];
            try {
                iArr[GetDealCabinetHeader.BannerItem.SEARCH.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[GetDealCabinetHeader.BannerItem.MORTGAGE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[GetDealCabinetHeader.BannerItem.TARIFF_CARD.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[GetDealCabinetHeader.BannerItem.SELECTIONS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f136903a = iArr;
            int[] iArr2 = new int[GetClientListRequestStage.values().length];
            try {
                iArr2[0] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                GetClientListRequestStage getClientListRequestStage = GetClientListRequestStage.f136497c;
                iArr2[1] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                GetClientListRequestStage getClientListRequestStage2 = GetClientListRequestStage.f136497c;
                iArr2[2] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                GetClientListRequestStage getClientListRequestStage3 = GetClientListRequestStage.f136497c;
                iArr2[3] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                GetClientListRequestStage getClientListRequestStage4 = GetClientListRequestStage.f136497c;
                iArr2[4] = 5;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                GetClientListRequestStage getClientListRequestStage5 = GetClientListRequestStage.f136497c;
                iArr2[5] = 6;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                GetClientListRequestStage getClientListRequestStage6 = GetClientListRequestStage.f136497c;
                iArr2[6] = 7;
            } catch (NoSuchFieldError unused11) {
            }
            int[] iArr3 = new int[GetMortgageListRequestStatus.values().length];
            try {
                iArr3[0] = 1;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                GetMortgageListRequestStatus.a aVar = GetMortgageListRequestStatus.f136527c;
                iArr3[1] = 2;
            } catch (NoSuchFieldError unused13) {
            }
            int[] iArr4 = new int[GetClientListResponse.PendingClientStateStatus.values().length];
            try {
                iArr4[GetClientListResponse.PendingClientStateStatus.SELECTION.ordinal()] = 1;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr4[GetClientListResponse.PendingClientStateStatus.BINDING.ordinal()] = 2;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr4[GetClientListResponse.PendingClientStateStatus.BOOKING_REQUESTED.ordinal()] = 3;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr4[GetClientListResponse.PendingClientStateStatus.BOOKED.ordinal()] = 4;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr4[GetClientListResponse.PendingClientStateStatus.REVENUE_REQUEST_PENDING.ordinal()] = 5;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr4[GetClientListResponse.PendingClientStateStatus.REVENUE_REQUEST_SENT.ordinal()] = 6;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr4[GetClientListResponse.PendingClientStateStatus.REVENUE_REQUEST_PAY_WAITING.ordinal()] = 7;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr4[GetClientListResponse.PendingClientStateStatus.COMPLETED.ordinal()] = 8;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr4[GetClientListResponse.PendingClientStateStatus.REVENUE_REQUEST_CONFIRMED.ordinal()] = 9;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr4[GetClientListResponse.PendingClientStateStatus.REVENUE_REQUEST_DENIED.ordinal()] = 10;
            } catch (NoSuchFieldError unused23) {
            }
            f136904b = iArr4;
            int[] iArr5 = new int[GetDealUpdatesResponse.UpdatedDeal.Status.values().length];
            try {
                iArr5[GetDealUpdatesResponse.UpdatedDeal.Status.CONFIRMED.ordinal()] = 1;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                iArr5[GetDealUpdatesResponse.UpdatedDeal.Status.EXPIRING.ordinal()] = 2;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                iArr5[GetDealUpdatesResponse.UpdatedDeal.Status.REJECTED.ordinal()] = 3;
            } catch (NoSuchFieldError unused26) {
            }
            f136905c = iArr5;
            int[] iArr6 = new int[GetDealUpdatesResponse.UpdatedDeal.Type.values().length];
            try {
                iArr6[GetDealUpdatesResponse.UpdatedDeal.Type.BINDING.ordinal()] = 1;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                iArr6[GetDealUpdatesResponse.UpdatedDeal.Type.BOOKING.ordinal()] = 2;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                iArr6[GetDealUpdatesResponse.UpdatedDeal.Type.DEAL.ordinal()] = 3;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                iArr6[GetDealUpdatesResponse.UpdatedDeal.Type.REVENUE.ordinal()] = 4;
            } catch (NoSuchFieldError unused30) {
            }
            f136906d = iArr6;
        }
    }

    @Inject
    public b(@Y61.k Context context, @Y61.k DealCabinetArguments dealCabinetArguments, @Y61.k com.avito.android.realty_agency.beduin.a aVar, @Y61.k C39487a c39487a, @Y61.k AO0.b bVar) {
        this.f136898a = context;
        this.f136899b = dealCabinetArguments;
        this.f136900c = aVar;
        this.f136901d = c39487a;
        this.f136902e = bVar;
    }

    @Override // com.avito.android.developments_agency_search.screen.deal_cabinet.a
    @Y61.k
    public final PrintableText a() {
        GetClientListRequestStage getClientListRequestStage = GetClientListRequestStage.f136497c;
        return com.avito.android.printable_text.b.c(R.string.das_deal_cabinet_all_client_list_empty_description, new Serializable[0]);
    }

    @Override // com.avito.android.developments_agency_search.screen.deal_cabinet.a
    @Y61.k
    public final DealRoomLink.Status b(@Y61.k GetClientListResponse.PendingClientStateStatus pendingClientStateStatus) {
        switch (a.f136904b[pendingClientStateStatus.ordinal()]) {
            case 1:
                return DealRoomLink.Status.f136366d;
            case 2:
                return DealRoomLink.Status.f136367e;
            case 3:
            case 4:
                return DealRoomLink.Status.f136368f;
            case 5:
            case 6:
                return DealRoomLink.Status.f136369g;
            case 7:
                return DealRoomLink.Status.f136370h;
            case 8:
            case 9:
                return DealRoomLink.Status.f136371i;
            case 10:
                return DealRoomLink.Status.f136372j;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    @Override // com.avito.android.developments_agency_search.screen.deal_cabinet.a
    @Y61.k
    public final GetMortgageListRequestStatus c(@Y61.k com.avito.android.developments_agency_search.adapter.checkable_item.a aVar) {
        for (GetMortgageListRequestStatus getMortgageListRequestStatus : GetMortgageListRequestStatus.f136531g) {
            if (L.f(getMortgageListRequestStatus.name(), aVar.f136215b)) {
                return getMortgageListRequestStatus;
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    @Override // com.avito.android.developments_agency_search.screen.deal_cabinet.a
    @Y61.k
    public final PrintableText d() {
        GetClientListRequestStage getClientListRequestStage = GetClientListRequestStage.f136497c;
        return com.avito.android.printable_text.b.c(R.string.das_deal_cabinet_all_client_list_empty_title, new Serializable[0]);
    }

    @Override // com.avito.android.developments_agency_search.screen.deal_cabinet.a
    @Y61.k
    public final GetClientListRequestStage e(@Y61.k com.avito.android.developments_agency_search.adapter.checkable_item.a aVar) {
        for (GetClientListRequestStage getClientListRequestStage : GetClientListRequestStage.f136499e) {
            if (L.f(getClientListRequestStage.name(), aVar.f136215b)) {
                return getClientListRequestStage;
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    @Override // com.avito.android.developments_agency_search.screen.deal_cabinet.a
    @Y61.k
    public final ArrayList f(@Y61.k kotlin.enums.a aVar, @Y61.k GetMortgageListRequestStatus getMortgageListRequestStatus) {
        String string;
        ArrayList arrayList = new ArrayList(C42745f0.q(aVar, 10));
        Iterator<E> it = aVar.iterator();
        while (it.hasNext()) {
            GetMortgageListRequestStatus getMortgageListRequestStatus2 = (GetMortgageListRequestStatus) it.next();
            String strName = getMortgageListRequestStatus2.name();
            int iOrdinal = getMortgageListRequestStatus2.ordinal();
            boolean z12 = true;
            Context context = this.f136898a;
            if (iOrdinal == 0) {
                string = context.getString(R.string.das_deal_cabinet_mortgage_list_filter_active);
            } else {
                if (iOrdinal != 1) {
                    throw new NoWhenBranchMatchedException();
                }
                string = context.getString(R.string.das_deal_cabinet_mortgage_list_filter_archived);
            }
            if (getMortgageListRequestStatus2 != getMortgageListRequestStatus) {
                z12 = false;
            }
            arrayList.add(new com.avito.android.developments_agency_search.adapter.checkable_item.a(strName, string, z12));
        }
        return arrayList;
    }

    @Override // com.avito.android.developments_agency_search.screen.deal_cabinet.a
    @Y61.k
    public final DealRoomLink.Status g(@Y61.k GetDealUpdatesResponse.UpdatedDeal updatedDeal) {
        int i12 = a.f136906d[updatedDeal.getType().ordinal()];
        if (i12 == 1) {
            return DealRoomLink.Status.f136367e;
        }
        if (i12 == 2) {
            return DealRoomLink.Status.f136368f;
        }
        if (i12 == 3) {
            int i13 = a.f136905c[updatedDeal.getStatus().ordinal()];
            if (i13 == 1 || i13 == 2) {
                return DealRoomLink.Status.f136369g;
            }
            if (i13 == 3) {
                return DealRoomLink.Status.f136372j;
            }
            throw new NoWhenBranchMatchedException();
        }
        if (i12 != 4) {
            throw new NoWhenBranchMatchedException();
        }
        int i14 = a.f136905c[updatedDeal.getStatus().ordinal()];
        if (i14 == 1 || i14 == 2) {
            return DealRoomLink.Status.f136370h;
        }
        if (i14 == 3) {
            return DealRoomLink.Status.f136372j;
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // com.avito.android.developments_agency_search.screen.deal_cabinet.a
    @Y61.k
    public final VisualRubricatorWidgetElementItem h(@Y61.k GetDealCabinetHeader.BannerItem bannerItem) {
        int i12 = a.f136903a[bannerItem.ordinal()];
        Context context = this.f136898a;
        if (i12 == 1) {
            String string = context.getString(R.string.das_deal_cabinet_search_banner_title);
            String string2 = context.getString(R.string.das_deal_cabinet_search_banner_title_with_transfer);
            Image image = new Image(Collections.singletonMap(new Size(350, 228), B4.a(context.getResources(), R.drawable.banner_search_350x228)));
            RealtyAgencySearchLink realtyAgencySearchLink = new RealtyAgencySearchLink(new SearchParams("24", null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -2, 1, null), "agent_cabinet_widget", null, 4, null);
            UniversalImage universalImage = new UniversalImage(image, image);
            VisualRubricatorWidgetElementLayout visualRubricatorWidgetElementLayout = VisualRubricatorWidgetElementLayout.LARGE;
            Space space = Space.f327300f;
            return this.f136902e.b("SEARCH", string, string2, realtyAgencySearchLink, null, universalImage, visualRubricatorWidgetElementLayout, (474400 & 512) != 0 ? null : null, (474400 & 1024) == 0, space, space, (474400 & AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR) != 0 ? null : 114);
        }
        if (i12 == 2) {
            String string3 = context.getString(R.string.das_deal_cabinet_mortgage_banner_title);
            String string4 = context.getString(R.string.das_deal_cabinet_mortgage_banner_title_with_transfer);
            Image image2 = new Image(Collections.singletonMap(new Size(162, 200), B4.a(context.getResources(), R.drawable.banner_new_order)));
            C39487a c39487a = this.f136901d;
            c39487a.getClass();
            kotlin.reflect.n<Object> nVar = C39487a.f393624d[0];
            DeepLink mortgageApplicationLeadLink = ((Boolean) c39487a.f393625b.a().invoke()).booleanValue() ? new MortgageApplicationLeadLink("partner_channel", "nd-deal-mortgage") : new MortgageProApplicationLink("new_landing_professional");
            UniversalImage universalImage2 = new UniversalImage(image2, image2);
            VisualRubricatorWidgetElementLayout visualRubricatorWidgetElementLayout2 = VisualRubricatorWidgetElementLayout.LARGE;
            Space space2 = Space.f327300f;
            return this.f136902e.b("MORTGAGE", string3, string4, mortgageApplicationLeadLink, null, universalImage2, visualRubricatorWidgetElementLayout2, (474400 & 512) != 0 ? null : null, (474400 & 1024) == 0, space2, space2, (474400 & AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR) != 0 ? null : 114);
        }
        com.avito.android.realty_agency.beduin.a aVar = this.f136900c;
        if (i12 == 3) {
            String string5 = context.getString(R.string.das_deal_cabinet_tariff_card_banner_title);
            String string6 = context.getString(R.string.das_deal_cabinet_tariff_card_banner_title_with_transfer);
            Image image3 = new Image(Collections.singletonMap(new Size(180, 250), B4.a(context.getResources(), R.drawable.banner_tariff_card_180x250)));
            DeepLink deepLinkG = aVar.g(TariffCardParentScreen.f250866c, this.f136899b.f136757c);
            UniversalImage universalImage3 = new UniversalImage(image3, image3);
            VisualRubricatorWidgetElementLayout visualRubricatorWidgetElementLayout3 = VisualRubricatorWidgetElementLayout.LARGE;
            Space space3 = Space.f327300f;
            return this.f136902e.b("TARIFF_CARD", string5, string6, deepLinkG, null, universalImage3, visualRubricatorWidgetElementLayout3, (474400 & 512) != 0 ? null : null, (474400 & 1024) == 0, space3, space3, (474400 & AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR) != 0 ? null : 114);
        }
        if (i12 != 4) {
            throw new NoWhenBranchMatchedException();
        }
        String string7 = context.getString(R.string.developments_agency_search_deal_cabinet_selections_banner_title);
        String string8 = context.getString(R.string.developments_agency_search_deal_cabinet_selections_banner_title_with_transfer);
        Image image4 = new Image(Collections.singletonMap(new Size(294, 300), B4.a(context.getResources(), R.drawable.banner_selections_294x300)));
        SelectionListParentScreen[] selectionListParentScreenArr = SelectionListParentScreen.f250864b;
        aVar.f250878h.getClass();
        BeduinV2PageDeepLink beduinV2PageDeepLink = new BeduinV2PageDeepLink("api/1/nd-trx/selections/form?parentScreen=agent_cabinet_widget", "RealtyAgencySelections", false, false, false, null, null, null, false, 480, null);
        UniversalImage universalImage4 = new UniversalImage(image4, image4);
        VisualRubricatorWidgetElementLayout visualRubricatorWidgetElementLayout4 = VisualRubricatorWidgetElementLayout.LARGE;
        Space space4 = Space.f327300f;
        return this.f136902e.b("SELECTIONS", string7, string8, beduinV2PageDeepLink, null, universalImage4, visualRubricatorWidgetElementLayout4, (474400 & 512) != 0 ? null : null, (474400 & 1024) == 0, space4, space4, (474400 & AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR) != 0 ? null : 114);
    }

    @Override // com.avito.android.developments_agency_search.screen.deal_cabinet.a
    @Y61.k
    public final ArrayList i(@Y61.k kotlin.enums.a aVar, @Y61.k GetClientListRequestStage getClientListRequestStage) {
        String string;
        ArrayList arrayList = new ArrayList(C42745f0.q(aVar, 10));
        Iterator<E> it = aVar.iterator();
        while (it.hasNext()) {
            GetClientListRequestStage getClientListRequestStage2 = (GetClientListRequestStage) it.next();
            String strName = getClientListRequestStage2.name();
            int iOrdinal = getClientListRequestStage2.ordinal();
            Context context = this.f136898a;
            switch (iOrdinal) {
                case 0:
                    string = context.getString(R.string.das_deal_cabinet_client_list_filter_all);
                    break;
                case 1:
                    string = context.getString(R.string.das_deal_cabinet_client_list_filter_selection);
                    break;
                case 2:
                    string = context.getString(R.string.das_deal_cabinet_client_list_filter_binding);
                    break;
                case 3:
                    string = context.getString(R.string.das_deal_cabinet_client_list_filter_booking);
                    break;
                case 4:
                    string = context.getString(R.string.das_deal_cabinet_client_list_filter_deal);
                    break;
                case 5:
                    string = context.getString(R.string.das_deal_cabinet_client_list_filter_revenue);
                    break;
                case 6:
                    string = context.getString(R.string.das_deal_cabinet_client_list_filter_archived);
                    break;
                default:
                    throw new NoWhenBranchMatchedException();
            }
            arrayList.add(new com.avito.android.developments_agency_search.adapter.checkable_item.a(strName, string, getClientListRequestStage2 == getClientListRequestStage));
        }
        return arrayList;
    }
}
