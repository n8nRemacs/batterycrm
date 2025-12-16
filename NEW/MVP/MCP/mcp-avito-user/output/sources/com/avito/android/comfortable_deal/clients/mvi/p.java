package com.avito.android.comfortable_deal.clients.mvi;

import androidx.compose.runtime.internal.P;
import com.adjust.sdk.network.ErrorCodes;
import com.avito.android.arch.mvi.u;
import com.avito.android.comfortable_deal.clients.model.RequestType;
import com.avito.android.comfortable_deal.clients.mvi.entity.ClientsInternalAction;
import com.avito.android.comfortable_deal.common.view.client.ClientCardData;
import com.avito.android.comfortable_deal.paging.PagingState;
import com.avito.android.deep_linking.links.DeepLink;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import jp.C42409a;
import jp.C42410b;
import kotlin.Metadata;
import kotlin.collections.AbstractC42738c;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;
import kp.C43476b;
import kp.C43477c;
import kp.C43481g;
import kp.C43483i;

/* compiled from: ClientsReducer.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/comfortable_deal/clients/mvi/p;", "Lcom/avito/android/arch/mvi/u;", "Lcom/avito/android/comfortable_deal/clients/mvi/entity/ClientsInternalAction;", "Lkp/g;", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class p implements u<ClientsInternalAction, C43481g> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.comfortable_deal.clients.mvi.builder.a f120369b;

    @Inject
    public p(@Y61.k com.avito.android.comfortable_deal.clients.mvi.builder.a aVar) {
        this.f120369b = aVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.avito.android.arch.mvi.u
    public final C43481g a(ClientsInternalAction clientsInternalAction, C43481g c43481g) {
        C43481g c43481gA;
        List<R2.b> list;
        C43477c c43477c;
        C43477c c43477c2;
        ClientsInternalAction clientsInternalAction2 = clientsInternalAction;
        C43481g c43481g2 = c43481g;
        C43477c c43477c3 = null;
        if (clientsInternalAction2 instanceof ClientsInternalAction.Error) {
            PagingState pagingState = PagingState.f122410d;
            RequestType requestTypeC = c43481g2.c();
            RequestType requestType = RequestType.f120270d;
            if (requestTypeC != requestType) {
                c43477c2 = c43477c3;
                c43481gA = C43481g.a(c43481g2, pagingState, 0, c43477c2, null, null, null, null, null, 0, null, 1018);
            } else {
                C43477c c43477c4 = c43481g2.f413210d;
                if (c43477c4 == null) {
                    if (c43481g2.c() == requestType) {
                        c43477c3 = new C43477c("", false, false);
                    }
                    c43477c2 = c43477c3;
                    c43481gA = C43481g.a(c43481g2, pagingState, 0, c43477c2, null, null, null, null, null, 0, null, 1018);
                } else {
                    c43477c2 = c43477c4;
                    c43481gA = C43481g.a(c43481g2, pagingState, 0, c43477c2, null, null, null, null, null, 0, null, 1018);
                }
            }
        } else if (clientsInternalAction2 instanceof ClientsInternalAction.Loading) {
            c43481gA = C43481g.a(c43481g2, PagingState.f122409c, 0, null, null, null, null, null, null, 0, null, 1022);
        } else if (clientsInternalAction2 instanceof ClientsInternalAction.NewPage) {
            ClientsInternalAction.NewPage newPage = (ClientsInternalAction.NewPage) clientsInternalAction2;
            List listH0 = newPage.f120324b;
            PagingState pagingState2 = listH0.size() < 10 ? PagingState.f122411e : PagingState.f122408b;
            List<ClientCardData> list2 = c43481g2.f413213g;
            if (list2 != null) {
                listH0 = C42745f0.h0(listH0, list2);
            }
            List list3 = listH0;
            DeepLink deepLink = newPage.f120326d;
            C43476b c43476b = deepLink != null ? new C43476b(deepLink) : null;
            RequestType requestTypeC2 = c43481g2.c();
            RequestType requestType2 = RequestType.f120270d;
            if (requestTypeC2 != requestType2) {
                c43477c = c43477c3;
                c43481gA = C43481g.a(c43481g2, pagingState2, newPage.f120325c, c43477c, c43476b, null, list3, null, null, 0, null, 976);
            } else {
                C43477c c43477c5 = c43481g2.f413210d;
                if (c43477c5 == null) {
                    if (c43481g2.c() == requestType2) {
                        c43477c3 = new C43477c("", false, false);
                    }
                    c43477c = c43477c3;
                    c43481gA = C43481g.a(c43481g2, pagingState2, newPage.f120325c, c43477c, c43476b, null, list3, null, null, 0, null, 976);
                } else {
                    c43477c = c43477c5;
                    c43481gA = C43481g.a(c43481g2, pagingState2, newPage.f120325c, c43477c, c43476b, null, list3, null, null, 0, null, 976);
                }
            }
        } else if (clientsInternalAction2 instanceof ClientsInternalAction.ChipChange) {
            List<C42410b> list4 = c43481g2.f413214h;
            ArrayList arrayList = new ArrayList(C42745f0.q(list4, 10));
            int i12 = 0;
            for (Object obj : list4) {
                int i13 = i12 + 1;
                if (i12 < 0) {
                    C42745f0.H0();
                    throw null;
                }
                C42410b c42410b = (C42410b) obj;
                arrayList.add(new C42410b(c42410b.f405814c, c42410b.f405813b, i12 == ((ClientsInternalAction.ChipChange) clientsInternalAction2).f120312b));
                i12 = i13;
            }
            c43481gA = C43481g.a(c43481g2, null, 0, null, null, null, null, arrayList, null, 0, null, 959);
        } else if (clientsInternalAction2 instanceof ClientsInternalAction.TabChange) {
            ClientsInternalAction.TabChange tabChange = (ClientsInternalAction.TabChange) clientsInternalAction2;
            c43481gA = C43481g.a(c43481g2, null, 0, ((RequestType) RequestType.f120272f.get(tabChange.f120330b)) == RequestType.f120270d ? new C43477c("", false, false) : null, null, null, null, null, null, tabChange.f120330b, null, 763);
        } else if (clientsInternalAction2 instanceof ClientsInternalAction.ClearData) {
            if (((ClientsInternalAction.ClearData) clientsInternalAction2).f120313b) {
                List list5 = RequestType.f120272f;
                ArrayList arrayList2 = new ArrayList(C42745f0.q(list5, 10));
                Iterator it = ((AbstractC42738c) list5).iterator();
                while (it.hasNext()) {
                    arrayList2.add(C42409a.a((RequestType) it.next(), null));
                }
                list = arrayList2;
            } else {
                list = c43481g2.f413215i;
            }
            c43481gA = C43481g.a(c43481g2, null, -1, null, null, null, null, null, list, 0, null, 833);
        } else if (clientsInternalAction2 instanceof ClientsInternalAction.UpdateTabsCounters) {
            List list6 = RequestType.f120272f;
            ArrayList arrayList3 = new ArrayList(C42745f0.q(list6, 10));
            Iterator it2 = ((AbstractC42738c) list6).iterator();
            while (it2.hasNext()) {
                RequestType requestType3 = (RequestType) it2.next();
                arrayList3.add(C42409a.a(requestType3, ((ClientsInternalAction.UpdateTabsCounters) clientsInternalAction2).f120333b.get(requestType3)));
            }
            c43481gA = C43481g.a(c43481g2, null, 0, null, null, null, null, null, arrayList3, 0, null, 895);
        } else {
            boolean z12 = clientsInternalAction2 instanceof ClientsInternalAction.OpenArchivingFilterDialog;
            C43477c c43477c6 = c43481g2.f413210d;
            if (z12) {
                c43481gA = C43481g.a(c43481g2, null, 0, c43477c6 != null ? C43477c.a(c43477c6, null, false, true, 3) : null, null, null, null, null, null, 0, null, ErrorCodes.MALFORMED_URL_EXCEPTION);
            } else if (clientsInternalAction2 instanceof ClientsInternalAction.CloseArchivingFilterDialog) {
                c43481gA = C43481g.a(c43481g2, null, 0, c43477c6 != null ? C43477c.a(c43477c6, null, false, false, 3) : null, null, null, null, null, null, 0, null, ErrorCodes.MALFORMED_URL_EXCEPTION);
            } else if (clientsInternalAction2 instanceof ClientsInternalAction.UpdateClientsFilterQuery) {
                c43481gA = C43481g.a(c43481g2, null, 0, c43477c6 != null ? C43477c.a(c43477c6, ((ClientsInternalAction.UpdateClientsFilterQuery) clientsInternalAction2).f120332b, false, false, 6) : null, null, null, null, null, null, 0, null, 971);
            } else if (clientsInternalAction2 instanceof ClientsInternalAction.UpdateClientsFilterArchived) {
                c43481gA = C43481g.a(c43481g2, null, 0, c43477c6 != null ? C43477c.a(c43477c6, null, ((ClientsInternalAction.UpdateClientsFilterArchived) clientsInternalAction2).f120331b, false, 1) : null, null, null, null, null, null, 0, null, 971);
            } else if (clientsInternalAction2 instanceof ClientsInternalAction.OpenArchivingDialog) {
                c43481gA = C43481g.a(c43481g2, null, 0, null, null, new C43483i(((ClientsInternalAction.OpenArchivingDialog) clientsInternalAction2).f120327b, false), null, null, null, 0, null, ErrorCodes.IO_EXCEPTION);
            } else if (clientsInternalAction2 instanceof ClientsInternalAction.DismissArchivingDialog) {
                c43481gA = C43481g.a(c43481g2, null, 0, null, null, null, null, null, null, 0, null, ErrorCodes.IO_EXCEPTION);
            } else {
                boolean z13 = clientsInternalAction2 instanceof ClientsInternalAction.MortgageApplicationReturnToWorkStarted;
                C43483i c43483i = c43481g2.f413212f;
                if (z13) {
                    c43481gA = C43481g.a(c43481g2, null, 0, null, null, c43483i != null ? new C43483i(c43483i.f413225a, true) : null, null, null, null, 0, null, ErrorCodes.IO_EXCEPTION);
                } else if (clientsInternalAction2 instanceof ClientsInternalAction.MortgageApplicationReturnToWorkCompleted) {
                    c43481gA = C43481g.a(c43481g2, null, 0, null, null, null, null, null, null, 0, null, ErrorCodes.IO_EXCEPTION);
                } else if (clientsInternalAction2 instanceof ClientsInternalAction.MortgageApplicationReturnToWorkFailed) {
                    c43481gA = C43481g.a(c43481g2, null, 0, null, null, c43483i != null ? new C43483i(c43483i.f413225a, false) : null, null, null, null, 0, null, ErrorCodes.IO_EXCEPTION);
                } else {
                    c43481gA = c43481g2;
                }
            }
        }
        return c43481gA.equals(c43481g2) ? c43481g2 : this.f120369b.a(c43481gA);
    }
}
