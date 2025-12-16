package com.avito.android.developments_agency_search.screen.deal_room_development.mvi;

import Dw.InterfaceC13445a;
import Dw.InterfaceC13446b;
import androidx.compose.runtime.internal.P;
import com.avito.android.arch.mvi.a;
import com.avito.android.developments_agency_search.domain.GetDealRoomInfoResponse;
import com.avito.android.developments_agency_search.screen.deal_room_development.DealRoomDevelopmentArguments;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: DealRoomDevelopmentActor.kt */
@P
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/avito/android/developments_agency_search/screen/deal_room_development/mvi/d;", "Lcom/avito/android/arch/mvi/a;", "LDw/a;", "LDw/b;", "LDw/d;", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class d implements com.avito.android.arch.mvi.a<InterfaceC13445a, InterfaceC13446b, Dw.d> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final DealRoomDevelopmentArguments f137934a;

    @Inject
    public d(@Y61.k DealRoomDevelopmentArguments dealRoomDevelopmentArguments) {
        this.f137934a = dealRoomDevelopmentArguments;
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    public final InterfaceC43160i a(@Y61.k C43197r1 c43197r1, @Y61.k Y41.a aVar) {
        return a.C2701a.a(this, c43197r1, aVar);
    }

    @Override // com.avito.android.arch.mvi.a
    public final InterfaceC43160i<InterfaceC13446b> b(InterfaceC13445a interfaceC13445a, Dw.d dVar) {
        C43210w c43210w;
        InterfaceC13445a interfaceC13445a2 = interfaceC13445a;
        Dw.d dVar2 = dVar;
        if (interfaceC13445a2 instanceof InterfaceC13445a.f) {
            return new C43210w(InterfaceC13446b.a.f3528a);
        }
        if (interfaceC13445a2 instanceof InterfaceC13445a.e) {
            return C43175k.G(new a(dVar2, this, null));
        }
        if (interfaceC13445a2 instanceof InterfaceC13445a.b) {
            return C43175k.G(new b(dVar2, this, null));
        }
        boolean z12 = interfaceC13445a2 instanceof InterfaceC13445a.InterfaceC0201a.C0202a;
        DealRoomDevelopmentArguments dealRoomDevelopmentArguments = this.f137934a;
        if (z12) {
            c43210w = new C43210w(new InterfaceC13446b.e(((InterfaceC13445a.InterfaceC0201a.C0202a) interfaceC13445a2).f3521a, dealRoomDevelopmentArguments.f137821b));
        } else {
            if (!(interfaceC13445a2 instanceof InterfaceC13445a.InterfaceC0201a.b)) {
                if (interfaceC13445a2 instanceof InterfaceC13445a.d) {
                    long developmentId = dealRoomDevelopmentArguments.f137822c.getDevelopmentId();
                    GetDealRoomInfoResponse.Deal.SelectionHistory.Item item = dealRoomDevelopmentArguments.f137822c;
                    return new C43210w(new InterfaceC13446b.d(developmentId, item.getDevelopmentName(), item.getLocationId(), item.getLatitude(), item.getLongitude(), dealRoomDevelopmentArguments.f137821b));
                }
                if (interfaceC13445a2 instanceof InterfaceC13445a.c) {
                    return C43175k.G(new c(interfaceC13445a2, null));
                }
                throw new NoWhenBranchMatchedException();
            }
            c43210w = new C43210w(new InterfaceC13446b.c(((InterfaceC13445a.InterfaceC0201a.b) interfaceC13445a2).f3522a));
        }
        return c43210w;
    }
}
