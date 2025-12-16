package com.avito.android.realty_agency.checkerboard.mvi;

import Zh0.InterfaceC19561c;
import Zh0.InterfaceC19562d;
import androidx.compose.runtime.internal.P;
import com.avito.android.developments_agency_search.deeplink.DealCabinetLink;
import com.avito.android.realty_agency.beduin.LotCardParentScreen;
import com.avito.android.realty_agency.beduin.SelectionClientPickerParentScreen;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: CheckerboardOneTimeEventProducer.kt */
@P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/realty_agency/checkerboard/mvi/B;", "Lcom/avito/android/arch/mvi/t;", "LZh0/c;", "LZh0/d;", "_avito_realty-agency_checkerboard_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class B implements com.avito.android.arch.mvi.t<InterfaceC19561c, InterfaceC19562d> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.realty_agency.beduin.a f251223b;

    @Inject
    public B(@Y61.k com.avito.android.realty_agency.beduin.a aVar) {
        this.f251223b = aVar;
    }

    @Override // com.avito.android.arch.mvi.t
    public final InterfaceC19562d b(InterfaceC19561c interfaceC19561c) {
        InterfaceC19562d.a aVar;
        InterfaceC19561c interfaceC19561c2 = interfaceC19561c;
        if (interfaceC19561c2 instanceof InterfaceC19561c.k) {
            InterfaceC19561c.k kVar = (InterfaceC19561c.k) interfaceC19561c2;
            aVar = new InterfaceC19562d.a(new DealCabinetLink(kVar.f20441a, kVar.f20442b), null);
        } else {
            boolean z12 = interfaceC19561c2 instanceof InterfaceC19561c.m;
            com.avito.android.realty_agency.beduin.a aVar2 = this.f251223b;
            if (z12) {
                aVar = new InterfaceC19562d.a(aVar2.d(LotCardParentScreen.f250851d, ((InterfaceC19561c.m) interfaceC19561c2).f20444a, null), null);
            } else if (interfaceC19561c2 instanceof InterfaceC19561c.j) {
                aVar = new InterfaceC19562d.a(aVar2.c(((InterfaceC19561c.j) interfaceC19561c2).f20440a, null), "realty_agency_checkerboard-client_binding-request_key");
            } else if (interfaceC19561c2 instanceof InterfaceC19561c.l) {
                aVar = new InterfaceC19562d.a(aVar2.a(((InterfaceC19561c.l) interfaceC19561c2).f20443a, null), "realty_agency_checkerboard-lot_booking-request_key");
            } else {
                if (!(interfaceC19561c2 instanceof InterfaceC19561c.p)) {
                    return null;
                }
                SelectionClientPickerParentScreen[] selectionClientPickerParentScreenArr = SelectionClientPickerParentScreen.f250857b;
                aVar = new InterfaceC19562d.a(aVar2.e(((InterfaceC19561c.p) interfaceC19561c2).f20448a, null), "realty_agency_checkerboard-add_lot_to_selection-request_key");
            }
        }
        return aVar;
    }
}
