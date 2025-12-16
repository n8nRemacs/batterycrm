package com.avito.android.developments_agency_search.screen.deal_room.mvi;

import Bw.InterfaceC13195c;
import Cw.C13364c;
import Cw.InterfaceC13362a;
import com.avito.android.arch.mvi.a;
import com.avito.android.developments_agency_search.domain.GetDealRoomInfoResponse;
import com.avito.android.developments_agency_search.screen.deal_room.mvi.entity.DealRoomInternalAction;
import com.avito.android.util.T2;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42745f0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: DealRoomActor.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/avito/android/developments_agency_search/screen/deal_room/mvi/n;", "Lcom/avito/android/arch/mvi/a;", "LCw/a;", "Lcom/avito/android/developments_agency_search/screen/deal_room/mvi/entity/DealRoomInternalAction;", "LCw/c;", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.developments_agency_search.screen.deal_room.mvi.n, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C29856n implements com.avito.android.arch.mvi.a<InterfaceC13362a, DealRoomInternalAction, C13364c> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final u f137710a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC13195c f137711b;

    @Inject
    public C29856n(@Y61.k u uVar, @Y61.k InterfaceC13195c interfaceC13195c) {
        this.f137710a = uVar;
        this.f137711b = interfaceC13195c;
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    public final InterfaceC43160i a(@Y61.k C43197r1 c43197r1, @Y61.k Y41.a aVar) {
        return a.C2701a.a(this, c43197r1, aVar);
    }

    @Override // com.avito.android.arch.mvi.a
    public final InterfaceC43160i<DealRoomInternalAction> b(InterfaceC13362a interfaceC13362a, C13364c c13364c) {
        InterfaceC43160i<DealRoomInternalAction> c43210w;
        List<GetDealRoomInfoResponse.Deal> deals;
        GetDealRoomInfoResponse.Deal deal;
        InterfaceC13362a interfaceC13362a2 = interfaceC13362a;
        C13364c c13364c2 = c13364c;
        if (interfaceC13362a2 instanceof InterfaceC13362a.r) {
            return new C43210w(DealRoomInternalAction.b.f137637b);
        }
        String notes = null;
        if (interfaceC13362a2 instanceof InterfaceC13362a.o) {
            return C43175k.G(new C29845c(this, c13364c2, null));
        }
        if (interfaceC13362a2 instanceof InterfaceC13362a.f) {
            return C43175k.G(new C29846d(c13364c2, null));
        }
        if (interfaceC13362a2 instanceof InterfaceC13362a.l) {
            return new C43210w(DealRoomInternalAction.c.a.f137638b);
        }
        if (interfaceC13362a2 instanceof InterfaceC13362a.g) {
            GetDealRoomInfoResponse getDealRoomInfoResponse = (GetDealRoomInfoResponse) T2.a(c13364c2.f2779b);
            if (getDealRoomInfoResponse != null && (deals = getDealRoomInfoResponse.getDeals()) != null && (deal = (GetDealRoomInfoResponse.Deal) C42745f0.G(deals)) != null) {
                notes = deal.getNotes();
            }
            return new C43210w(new DealRoomInternalAction.c.C4153c(notes));
        }
        if (interfaceC13362a2 instanceof InterfaceC13362a.h) {
            return C43175k.G(new C29847e(interfaceC13362a2, c13364c2, this, null));
        }
        if (interfaceC13362a2 instanceof InterfaceC13362a.d.C0132a) {
            return C43175k.G(new C29848f(c13364c2, null));
        }
        if (interfaceC13362a2 instanceof InterfaceC13362a.e) {
            return C43175k.G(new C29849g(interfaceC13362a2, c13364c2, this, null));
        }
        if (interfaceC13362a2 instanceof InterfaceC13362a.j) {
            return C43175k.G(new C29850h(c13364c2, interfaceC13362a2, null));
        }
        if (interfaceC13362a2 instanceof InterfaceC13362a.n) {
            return C43175k.G(new C29851i(interfaceC13362a2, null));
        }
        if (interfaceC13362a2 instanceof InterfaceC13362a.m) {
            return C43175k.G(new C29852j(interfaceC13362a2, c13364c2, this, null));
        }
        if (interfaceC13362a2 instanceof InterfaceC13362a.p) {
            c43210w = new C43210w(new DealRoomInternalAction.n(((InterfaceC13362a.p) interfaceC13362a2).f2757a));
        } else if (interfaceC13362a2 instanceof InterfaceC13362a.b) {
            InterfaceC13362a.b bVar = (InterfaceC13362a.b) interfaceC13362a2;
            if (bVar instanceof InterfaceC13362a.b.c) {
                c43210w = C43175k.G(new C29854l(bVar, null));
            } else if (bVar instanceof InterfaceC13362a.b.C0130b) {
                c43210w = C43175k.G(new C29855m(this, bVar, null));
            } else {
                if (!(bVar instanceof InterfaceC13362a.b.C0129a)) {
                    throw new NoWhenBranchMatchedException();
                }
                c43210w = new C43210w(new DealRoomInternalAction.f(((InterfaceC13362a.b.C0129a) bVar).f2737a));
            }
        } else {
            if (interfaceC13362a2 instanceof InterfaceC13362a.i) {
                return C43175k.G(new C29853k(interfaceC13362a2, c13364c2, this, null));
            }
            if (interfaceC13362a2 instanceof InterfaceC13362a.q) {
                return C43175k.G(new C29843a(interfaceC13362a2, c13364c2, this, null));
            }
            if (!(interfaceC13362a2 instanceof InterfaceC13362a.InterfaceC0127a.C0128a)) {
                if (interfaceC13362a2 instanceof InterfaceC13362a.k) {
                    return C43175k.G(new C29844b(c13364c2, null));
                }
                if (interfaceC13362a2 instanceof InterfaceC13362a.c.b) {
                    return this.f137710a.a(((InterfaceC13362a.c.b) interfaceC13362a2).f2743a);
                }
                if (interfaceC13362a2 instanceof InterfaceC13362a.c.C0131a) {
                    return new C43210w(DealRoomInternalAction.d.a.f137645b);
                }
                throw new NoWhenBranchMatchedException();
            }
            c43210w = new C43210w(new DealRoomInternalAction.j(((InterfaceC13362a.InterfaceC0127a.C0128a) interfaceC13362a2).f2736a));
        }
        return c43210w;
    }
}
