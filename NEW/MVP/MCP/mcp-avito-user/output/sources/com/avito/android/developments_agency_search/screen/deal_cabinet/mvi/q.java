package com.avito.android.developments_agency_search.screen.deal_cabinet.mvi;

import Xw.C17054a;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.arch.mvi.u;
import com.avito.android.developments_agency_search.domain.GetClientListResponse;
import com.avito.android.developments_agency_search.domain.GetDealCabinetHeader;
import com.avito.android.developments_agency_search.domain.GetDealUpdatesResponse;
import com.avito.android.developments_agency_search.domain.GetMortgageListRequestStatus;
import com.avito.android.developments_agency_search.screen.deal_cabinet.adapter.tabs.Tab;
import com.avito.android.developments_agency_search.screen.deal_cabinet.mvi.entity.DealCabinetInternalAction;
import com.avito.android.error.z;
import com.avito.android.util.P2;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import ri0.InterfaceC47661a;
import zw.C50636a;

/* compiled from: DealCabinetReducer.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/developments_agency_search/screen/deal_cabinet/mvi/q;", "Lcom/avito/android/arch/mvi/u;", "Lcom/avito/android/developments_agency_search/screen/deal_cabinet/mvi/entity/DealCabinetInternalAction;", "Lzw/d;", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class q implements u<DealCabinetInternalAction, zw.d> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.developments_agency_search.screen.deal_cabinet.a f137154b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f137155c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final InterfaceC47661a f137156d;

    /* compiled from: DealCabinetReducer.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {
        static {
            int[] iArr = new int[Tab.values().length];
            try {
                iArr[Tab.f136879c.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Tab.f136880d.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[GetMortgageListRequestStatus.values().length];
            try {
                iArr2[0] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                GetMortgageListRequestStatus.a aVar = GetMortgageListRequestStatus.f136527c;
                iArr2[1] = 2;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    @Inject
    public q(@Y61.k com.avito.android.developments_agency_search.screen.deal_cabinet.a aVar, @com.avito.android.developments_agency_search.screen.deal_cabinet.di.k boolean z12, @Y61.k InterfaceC47661a interfaceC47661a) {
        this.f137154b = aVar;
        this.f137155c = z12;
        this.f137156d = interfaceC47661a;
    }

    public static void b(ArrayList arrayList) {
        arrayList.add(new com.avito.android.developments_agency_search.screen.deal_cabinet.adapter.empty.a("client_list_try_to_update", com.avito.android.printable_text.b.c(R.string.das_deal_cabinet_client_list_error_title, new Serializable[0]), com.avito.android.printable_text.b.c(R.string.das_deal_cabinet_client_list_error_description, new Serializable[0]), com.avito.android.printable_text.b.c(R.string.das_deal_cabinet_client_list_error_action, new Serializable[0])));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.avito.android.arch.mvi.u
    public final zw.d a(DealCabinetInternalAction dealCabinetInternalAction, zw.d dVar) {
        P2<GetDealUpdatesResponse> bVar;
        P2<? super C17054a> aVar;
        P2<? super GetClientListResponse> aVar2;
        P2<? super GetDealUpdatesResponse> aVar3;
        P2<? super GetDealUpdatesResponse> p22;
        P2<? super GetDealCabinetHeader> aVar4;
        DealCabinetInternalAction dealCabinetInternalAction2 = dealCabinetInternalAction;
        zw.d dVarA = dVar;
        boolean z12 = dealCabinetInternalAction2 instanceof DealCabinetInternalAction.BannersLoading;
        zw.f fVar = dVarA.f444385f;
        C50636a c50636a = dVarA.f444384e;
        if (z12) {
            DealCabinetInternalAction.BannersLoading bannersLoading = (DealCabinetInternalAction.BannersLoading) dealCabinetInternalAction2;
            if (bannersLoading instanceof DealCabinetInternalAction.BannersLoading.StartLoading) {
                aVar4 = P2.c.f318721a;
            } else if (bannersLoading instanceof DealCabinetInternalAction.BannersLoading.Loaded) {
                aVar4 = new P2.b<>(((DealCabinetInternalAction.BannersLoading.Loaded) bannersLoading).f137076b);
            } else {
                if (!(bannersLoading instanceof DealCabinetInternalAction.BannersLoading.LoadingError)) {
                    throw new NoWhenBranchMatchedException();
                }
                aVar4 = new P2.a(z.n(((DealCabinetInternalAction.BannersLoading.LoadingError) bannersLoading).f137077b));
            }
            dVarA = zw.d.a(dVarA, aVar4, null, null, null, null, c(aVar4, dVarA.f444382c, dVarA.f444383d, c50636a.f444345d, c50636a.f444342a, c50636a.f444343b, c50636a.f444346e, c50636a.f444344c, fVar.f444394d, fVar.f444391a, fVar.f444392b, fVar.f444395e, fVar.f444393c), 62);
        } else if (dealCabinetInternalAction2 instanceof DealCabinetInternalAction.DealUpdatesLoading) {
            DealCabinetInternalAction.DealUpdatesLoading dealUpdatesLoading = (DealCabinetInternalAction.DealUpdatesLoading) dealCabinetInternalAction2;
            if (dealUpdatesLoading instanceof DealCabinetInternalAction.DealUpdatesLoading.StartLoading) {
                p22 = P2.c.f318721a;
            } else {
                if (dealUpdatesLoading instanceof DealCabinetInternalAction.DealUpdatesLoading.Loaded) {
                    aVar3 = new P2.b<>(((DealCabinetInternalAction.DealUpdatesLoading.Loaded) dealUpdatesLoading).f137085b);
                } else {
                    if (!(dealUpdatesLoading instanceof DealCabinetInternalAction.DealUpdatesLoading.LoadingError)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    aVar3 = new P2.a(z.n(((DealCabinetInternalAction.DealUpdatesLoading.LoadingError) dealUpdatesLoading).f137086b));
                }
                p22 = aVar3;
            }
            dVarA = zw.d.a(dVarA, null, p22, null, null, null, c(dVarA.f444381b, p22, dVarA.f444383d, c50636a.f444345d, c50636a.f444342a, c50636a.f444343b, c50636a.f444346e, c50636a.f444344c, fVar.f444394d, fVar.f444391a, fVar.f444392b, fVar.f444395e, fVar.f444393c), 61);
        } else {
            if (dealCabinetInternalAction2 instanceof DealCabinetInternalAction.ClientsLoading) {
                DealCabinetInternalAction.ClientsLoading clientsLoading = (DealCabinetInternalAction.ClientsLoading) dealCabinetInternalAction2;
                if (clientsLoading instanceof DealCabinetInternalAction.ClientsLoading.StartLoading) {
                    aVar2 = P2.c.f318721a;
                } else if (clientsLoading instanceof DealCabinetInternalAction.ClientsLoading.Loaded) {
                    aVar2 = new P2.b<>(((DealCabinetInternalAction.ClientsLoading.Loaded) clientsLoading).f137081b);
                } else {
                    if (!(clientsLoading instanceof DealCabinetInternalAction.ClientsLoading.LoadingError)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    aVar2 = new P2.a(z.n(((DealCabinetInternalAction.ClientsLoading.LoadingError) clientsLoading).f137082b));
                }
                boolean z13 = clientsLoading instanceof DealCabinetInternalAction.ClientsLoading.Loaded;
                List<GetClientListResponse> listI0 = z13 ? C42745f0.i0(((DealCabinetInternalAction.ClientsLoading.Loaded) clientsLoading).f137081b, c50636a.f444343b) : c50636a.f444343b;
                boolean z14 = z13 ? true : clientsLoading instanceof DealCabinetInternalAction.ClientsLoading.LoadingError ? true : c50636a.f444345d;
                dVarA = zw.d.a(dVarA, null, null, null, C50636a.a(dVarA.f444384e, aVar2, listI0, null, z14, null, 20), null, c(dVarA.f444381b, dVarA.f444382c, dVarA.f444383d, z14, aVar2, listI0, c50636a.f444346e, c50636a.f444344c, fVar.f444394d, fVar.f444391a, fVar.f444392b, fVar.f444395e, fVar.f444393c), 55);
            } else if (dealCabinetInternalAction2 instanceof DealCabinetInternalAction.MortgageLoading) {
                DealCabinetInternalAction.MortgageLoading mortgageLoading = (DealCabinetInternalAction.MortgageLoading) dealCabinetInternalAction2;
                if (mortgageLoading instanceof DealCabinetInternalAction.MortgageLoading.StartLoading) {
                    aVar = P2.c.f318721a;
                } else if (mortgageLoading instanceof DealCabinetInternalAction.MortgageLoading.Loaded) {
                    aVar = new P2.b<>(((DealCabinetInternalAction.MortgageLoading.Loaded) mortgageLoading).f137089b);
                } else {
                    if (!(mortgageLoading instanceof DealCabinetInternalAction.MortgageLoading.LoadingError)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    aVar = new P2.a(z.n(((DealCabinetInternalAction.MortgageLoading.LoadingError) mortgageLoading).f137090b));
                }
                P2<? super C17054a> p23 = aVar;
                boolean z15 = mortgageLoading instanceof DealCabinetInternalAction.MortgageLoading.Loaded;
                List<C17054a> listI02 = z15 ? C42745f0.i0(((DealCabinetInternalAction.MortgageLoading.Loaded) mortgageLoading).f137089b, fVar.f444392b) : fVar.f444392b;
                boolean z16 = z15 ? true : mortgageLoading instanceof DealCabinetInternalAction.MortgageLoading.LoadingError ? true : fVar.f444394d;
                dVarA = zw.d.a(dVarA, null, null, null, null, zw.f.a(dVarA.f444385f, p23, listI02, null, z16, null, 20), c(dVarA.f444381b, dVarA.f444382c, dVarA.f444383d, c50636a.f444345d, c50636a.f444342a, c50636a.f444343b, c50636a.f444346e, c50636a.f444344c, z16, p23, listI02, fVar.f444395e, fVar.f444393c), 47);
            } else if (dealCabinetInternalAction2 instanceof DealCabinetInternalAction.UpdateTab) {
                DealCabinetInternalAction.UpdateTab updateTab = (DealCabinetInternalAction.UpdateTab) dealCabinetInternalAction2;
                Tab tab = Tab.f136879c;
                Tab tab2 = updateTab.f137108b;
                dVarA = zw.d.a(dVarA, null, null, tab2, tab2 == tab ? C50636a.a(c50636a, null, C42784z0.f406748b, "", false, null, 25) : c50636a, updateTab.f137108b == Tab.f136880d ? zw.f.a(dVarA.f444385f, null, C42784z0.f406748b, "", false, null, 25) : fVar, c(dVarA.f444381b, dVarA.f444382c, updateTab.f137108b, c50636a.f444345d, c50636a.f444342a, c50636a.f444343b, c50636a.f444346e, c50636a.f444344c, fVar.f444394d, fVar.f444391a, fVar.f444392b, fVar.f444395e, fVar.f444393c), 35);
            } else if (dealCabinetInternalAction2 instanceof DealCabinetInternalAction.ClearClientListLoadedPages) {
                dVarA = zw.d.a(dVarA, null, null, null, C50636a.a(c50636a, P2.c.f318721a, C42784z0.f406748b, null, false, null, 28), null, null, 119);
            } else if (dealCabinetInternalAction2 instanceof DealCabinetInternalAction.ClearMortgageListLoadedPages) {
                dVarA = zw.d.a(dVarA, null, null, null, null, zw.f.a(fVar, P2.c.f318721a, C42784z0.f406748b, null, false, null, 28), null, 111);
            } else if (dealCabinetInternalAction2 instanceof DealCabinetInternalAction.UpdateClientsLastSearchQuery) {
                dVarA = zw.d.a(dVarA, null, null, null, C50636a.a(c50636a, P2.c.f318721a, C42784z0.f406748b, ((DealCabinetInternalAction.UpdateClientsLastSearchQuery) dealCabinetInternalAction2).f137105b, false, null, 24), null, null, 119);
            } else if (dealCabinetInternalAction2 instanceof DealCabinetInternalAction.UpdateMortgageLastSearchQuery) {
                dVarA = zw.d.a(dVarA, null, null, null, null, zw.f.a(fVar, P2.c.f318721a, C42784z0.f406748b, ((DealCabinetInternalAction.UpdateMortgageLastSearchQuery) dealCabinetInternalAction2).f137106b, false, null, 24), null, 111);
            } else if (dealCabinetInternalAction2 instanceof DealCabinetInternalAction.UpdateClientListFilter) {
                dVarA = zw.d.a(dVarA, null, null, null, C50636a.a(c50636a, P2.c.f318721a, C42784z0.f406748b, null, false, ((DealCabinetInternalAction.UpdateClientListFilter) dealCabinetInternalAction2).f137104b, 12), null, null, 119);
            } else if (dealCabinetInternalAction2 instanceof DealCabinetInternalAction.UpdateMortgageListFilter) {
                dVarA = zw.d.a(dVarA, null, null, null, null, zw.f.a(fVar, P2.c.f318721a, C42784z0.f406748b, null, false, ((DealCabinetInternalAction.UpdateMortgageListFilter) dealCabinetInternalAction2).f137107b, 12), null, 111);
            } else if (dealCabinetInternalAction2 instanceof DealCabinetInternalAction.RemoveDealUpdateItem) {
                P2<GetDealUpdatesResponse> p24 = dVarA.f444382c;
                if (p24 instanceof P2.b) {
                    GetDealUpdatesResponse getDealUpdatesResponse = (GetDealUpdatesResponse) ((P2.b) p24).f318720a;
                    DealCabinetInternalAction.RemoveDealUpdateItem removeDealUpdateItem = (DealCabinetInternalAction.RemoveDealUpdateItem) dealCabinetInternalAction2;
                    ArrayList arrayList = new ArrayList(getDealUpdatesResponse.getUpdates());
                    Iterator it = arrayList.iterator();
                    int i12 = 0;
                    while (true) {
                        if (!it.hasNext()) {
                            i12 = -1;
                            break;
                        }
                        GetDealUpdatesResponse.UpdatedDeal updatedDeal = (GetDealUpdatesResponse.UpdatedDeal) it.next();
                        if (updatedDeal.getId() == removeDealUpdateItem.f137098b && L.f(updatedDeal.getDealId(), removeDealUpdateItem.f137099c)) {
                            break;
                        }
                        i12++;
                    }
                    if (i12 != -1) {
                        arrayList.remove(i12);
                    }
                    bVar = new P2.b<>(getDealUpdatesResponse.copy(arrayList));
                } else {
                    bVar = p24;
                }
                dVarA = zw.d.a(dVarA, null, bVar, null, null, null, c(dVarA.f444381b, bVar, dVarA.f444383d, c50636a.f444345d, c50636a.f444342a, c50636a.f444343b, c50636a.f444346e, c50636a.f444344c, fVar.f444394d, fVar.f444391a, fVar.f444392b, fVar.f444395e, fVar.f444393c), 61);
            } else if (dealCabinetInternalAction2 instanceof DealCabinetInternalAction.HideCommissionPromoBanner) {
                this.f137156d.f();
                return zw.d.a(dVarA, null, null, null, null, null, c(dVarA.f444381b, dVarA.f444382c, dVarA.f444383d, c50636a.f444345d, c50636a.f444342a, c50636a.f444343b, c50636a.f444346e, c50636a.f444344c, fVar.f444394d, fVar.f444391a, fVar.f444392b, fVar.f444395e, fVar.f444393c), 63);
            }
        }
        return dVarA;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0496  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x049c  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01ef  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final zw.e c(com.avito.android.util.P2<? super com.avito.android.developments_agency_search.domain.GetDealCabinetHeader> r38, com.avito.android.util.P2<? super com.avito.android.developments_agency_search.domain.GetDealUpdatesResponse> r39, com.avito.android.developments_agency_search.screen.deal_cabinet.adapter.tabs.Tab r40, boolean r41, com.avito.android.util.P2<? super com.avito.android.developments_agency_search.domain.GetClientListResponse> r42, java.util.List<com.avito.android.developments_agency_search.domain.GetClientListResponse> r43, com.avito.android.developments_agency_search.domain.GetClientListRequestStage r44, java.lang.String r45, boolean r46, com.avito.android.util.P2<? super Xw.C17054a> r47, java.util.List<Xw.C17054a> r48, com.avito.android.developments_agency_search.domain.GetMortgageListRequestStatus r49, java.lang.String r50) {
        /*
            Method dump skipped, instructions count: 1190
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.developments_agency_search.screen.deal_cabinet.mvi.q.c(com.avito.android.util.P2, com.avito.android.util.P2, com.avito.android.developments_agency_search.screen.deal_cabinet.adapter.tabs.Tab, boolean, com.avito.android.util.P2, java.util.List, com.avito.android.developments_agency_search.domain.GetClientListRequestStage, java.lang.String, boolean, com.avito.android.util.P2, java.util.List, com.avito.android.developments_agency_search.domain.GetMortgageListRequestStatus, java.lang.String):zw.e");
    }
}
