package com.avito.android.developments_agency_search.screen.deal_room.mvi;

import Cw.InterfaceC13363b;
import android.net.Uri;
import com.avito.android.R;
import com.avito.android.deep_linking.links.CustomChromeTabExternalLink;
import com.avito.android.deep_linking.links.PhoneLink;
import com.avito.android.deep_linking.links.WebViewLink;
import com.avito.android.developments_agency_search.deeplink.RealtyAgencySearchLink;
import com.avito.android.developments_agency_search.screen.deal_room.mvi.entity.DealRoomInternalAction;
import com.avito.android.realty_agency.beduin.SelectionItemParentScreen;
import java.io.Serializable;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: DealRoomOneTimeEventProducer.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/developments_agency_search/screen/deal_room/mvi/A;", "Lcom/avito/android/arch/mvi/t;", "Lcom/avito/android/developments_agency_search/screen/deal_room/mvi/entity/DealRoomInternalAction;", "LCw/b;", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class A implements com.avito.android.arch.mvi.t<DealRoomInternalAction, InterfaceC13363b> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.realty_agency.beduin.a f137570b;

    @Inject
    public A(@Y61.k com.avito.android.realty_agency.beduin.a aVar) {
        this.f137570b = aVar;
    }

    @Override // com.avito.android.arch.mvi.t
    public final InterfaceC13363b b(DealRoomInternalAction dealRoomInternalAction) {
        InterfaceC13363b hVar;
        DealRoomInternalAction dealRoomInternalAction2 = dealRoomInternalAction;
        if (dealRoomInternalAction2 instanceof DealRoomInternalAction.b) {
            return InterfaceC13363b.a.f2760a;
        }
        if (dealRoomInternalAction2 instanceof DealRoomInternalAction.c) {
            DealRoomInternalAction.c cVar = (DealRoomInternalAction.c) dealRoomInternalAction2;
            if (cVar instanceof DealRoomInternalAction.c.C4153c) {
                hVar = new InterfaceC13363b.InterfaceC0133b.c(((DealRoomInternalAction.c.C4153c) cVar).f137640b);
                return hVar;
            }
            if (cVar instanceof DealRoomInternalAction.c.a) {
                return InterfaceC13363b.InterfaceC0133b.a.f2761a;
            }
            if (cVar instanceof DealRoomInternalAction.c.e) {
                return new InterfaceC13363b.InterfaceC0133b.d(com.avito.android.printable_text.b.c(R.string.das_deal_room_note_update_dialog_error_toast, new Serializable[0]));
            }
            if (cVar instanceof DealRoomInternalAction.c.d) {
                return new InterfaceC13363b.InterfaceC0133b.C0134b(true);
            }
            if (cVar instanceof DealRoomInternalAction.c.b) {
                return new InterfaceC13363b.InterfaceC0133b.C0134b(false);
            }
            return null;
        }
        if (dealRoomInternalAction2 instanceof DealRoomInternalAction.d) {
            DealRoomInternalAction.d dVar = (DealRoomInternalAction.d) dealRoomInternalAction2;
            if (dVar instanceof DealRoomInternalAction.d.c) {
                DealRoomInternalAction.d.c cVar2 = (DealRoomInternalAction.d.c) dVar;
                hVar = new InterfaceC13363b.c.C0136c(cVar2.f137647b, cVar2.f137648c);
                return hVar;
            }
            if (dVar instanceof DealRoomInternalAction.d.a) {
                return InterfaceC13363b.c.a.f2765a;
            }
            if (dVar instanceof DealRoomInternalAction.d.e) {
                return new InterfaceC13363b.c.d(com.avito.android.printable_text.b.c(R.string.developments_agency_search_deal_room_edit_client_info_update_error_toast, new Serializable[0]));
            }
            if (dVar instanceof DealRoomInternalAction.d.C4154d) {
                return new InterfaceC13363b.c.C0135b(true);
            }
            if (dVar instanceof DealRoomInternalAction.d.b) {
                return new InterfaceC13363b.c.C0135b(false);
            }
            return null;
        }
        if (dealRoomInternalAction2 instanceof DealRoomInternalAction.a) {
            hVar = new InterfaceC13363b.d(new PhoneLink.Call(((DealRoomInternalAction.a) dealRoomInternalAction2).f137636b, null, 2, null));
        } else if (dealRoomInternalAction2 instanceof DealRoomInternalAction.k) {
            DealRoomInternalAction.k kVar = (DealRoomInternalAction.k) dealRoomInternalAction2;
            hVar = new InterfaceC13363b.d(new RealtyAgencySearchLink(kVar.f137666b, "deals", kVar.f137667c));
        } else if (dealRoomInternalAction2 instanceof DealRoomInternalAction.l) {
            DealRoomInternalAction.l lVar = (DealRoomInternalAction.l) dealRoomInternalAction2;
            hVar = new InterfaceC13363b.f(lVar.f137668b, lVar.f137669c);
        } else if (dealRoomInternalAction2 instanceof DealRoomInternalAction.e) {
            hVar = new InterfaceC13363b.d(new WebViewLink.AnyDomain(Uri.parse(((DealRoomInternalAction.e) dealRoomInternalAction2).f137652b), null, null, 6, null));
        } else if (dealRoomInternalAction2 instanceof DealRoomInternalAction.f) {
            hVar = new InterfaceC13363b.d(new CustomChromeTabExternalLink(Uri.parse(((DealRoomInternalAction.f) dealRoomInternalAction2).f137653b)));
        } else {
            if (dealRoomInternalAction2 instanceof DealRoomInternalAction.m) {
                return InterfaceC13363b.g.f2774a;
            }
            if (dealRoomInternalAction2 instanceof DealRoomInternalAction.n) {
                hVar = new InterfaceC13363b.d(this.f137570b.f(SelectionItemParentScreen.f250860d, ((DealRoomInternalAction.n) dealRoomInternalAction2).f137671b));
            } else {
                if (!(dealRoomInternalAction2 instanceof DealRoomInternalAction.j)) {
                    if (dealRoomInternalAction2 instanceof DealRoomInternalAction.o) {
                        DealRoomInternalAction.o oVar = (DealRoomInternalAction.o) dealRoomInternalAction2;
                        hVar = new InterfaceC13363b.h(oVar.f137673c, oVar.f137672b);
                    }
                    return null;
                }
                hVar = new InterfaceC13363b.e(((DealRoomInternalAction.j) dealRoomInternalAction2).f137665b);
            }
        }
        return hVar;
    }
}
