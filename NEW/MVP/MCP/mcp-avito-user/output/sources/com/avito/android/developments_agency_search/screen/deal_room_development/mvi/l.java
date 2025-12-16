package com.avito.android.developments_agency_search.screen.deal_room_development.mvi;

import Dw.InterfaceC13446b;
import Dw.InterfaceC13447c;
import androidx.compose.runtime.internal.P;
import com.avito.android.arch.mvi.t;
import com.avito.android.developments_agency_search.deeplink.DealCabinetLink;
import com.avito.android.developments_agency_search.deeplink.RealtyAgencySearchLotsLink;
import com.avito.android.developments_agency_search.screen.deal_room_development.DealRoomDevelopmentScreen;
import com.avito.android.realty_agency.beduin.DevelopmentCardParentScreen;
import com.avito.android.remote.model.SearchParams;
import com.avito.android.remote.model.StringSearchParam;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.P0;

/* compiled from: DealRoomDevelopmentOneTimeEventProducer.kt */
@P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/developments_agency_search/screen/deal_room_development/mvi/l;", "Lcom/avito/android/arch/mvi/t;", "LDw/b;", "LDw/c;", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class l implements t<InterfaceC13446b, InterfaceC13447c> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.realty_agency.beduin.a f137950b;

    @Inject
    public l(@Y61.k com.avito.android.realty_agency.beduin.a aVar) {
        this.f137950b = aVar;
    }

    @Override // com.avito.android.arch.mvi.t
    public final InterfaceC13447c b(InterfaceC13446b interfaceC13446b) {
        InterfaceC13447c c0204c;
        InterfaceC13446b interfaceC13446b2 = interfaceC13446b;
        if (interfaceC13446b2 instanceof InterfaceC13446b.c) {
            c0204c = new InterfaceC13447c.C0204c(((InterfaceC13446b.c) interfaceC13446b2).f3530a);
        } else {
            if (!(interfaceC13446b2 instanceof InterfaceC13446b.a)) {
                boolean z12 = interfaceC13446b2 instanceof InterfaceC13446b.h;
                com.avito.android.realty_agency.beduin.a aVar = this.f137950b;
                if (z12) {
                    InterfaceC13446b.h hVar = (InterfaceC13446b.h) interfaceC13446b2;
                    return new InterfaceC13447c.b(aVar.b(DevelopmentCardParentScreen.f250846e, hVar.f3543a, hVar.f3544b));
                }
                if (interfaceC13446b2 instanceof InterfaceC13446b.f) {
                    InterfaceC13446b.f fVar = (InterfaceC13446b.f) interfaceC13446b2;
                    return new InterfaceC13447c.b(aVar.c(fVar.f3539a, fVar.f3540b));
                }
                if (interfaceC13446b2 instanceof InterfaceC13446b.e) {
                    InterfaceC13446b.e eVar = (InterfaceC13446b.e) interfaceC13446b2;
                    return new InterfaceC13447c.b(aVar.a(eVar.f3537a, eVar.f3538b));
                }
                if (interfaceC13446b2 instanceof InterfaceC13446b.g) {
                    InterfaceC13446b.g gVar = (InterfaceC13446b.g) interfaceC13446b2;
                    return new InterfaceC13447c.b(new DealCabinetLink(gVar.f3541a, gVar.f3542b));
                }
                if (!(interfaceC13446b2 instanceof InterfaceC13446b.d)) {
                    return null;
                }
                InterfaceC13446b.d dVar = (InterfaceC13446b.d) interfaceC13446b2;
                return new InterfaceC13447c.b(new RealtyAgencySearchLotsLink(dVar.f3532b, true, new SearchParams(null, null, String.valueOf(dVar.f3533c), null, null, null, null, P0.g(new Q("search-name", new StringSearchParam(dVar.f3532b)), new Q("search-development", new StringSearchParam(String.valueOf(dVar.f3531a)))), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -133, 1, null), DealRoomDevelopmentScreen.f137845d.f90471b, dVar.f3536f, dVar.f3534d, dVar.f3535e));
            }
            c0204c = InterfaceC13447c.a.f3545a;
        }
        return c0204c;
    }
}
