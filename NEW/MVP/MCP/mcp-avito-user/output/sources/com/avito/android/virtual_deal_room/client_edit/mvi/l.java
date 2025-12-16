package com.avito.android.virtual_deal_room.client_edit.mvi;

import com.avito.android.arch.mvi.u;
import com.avito.android.virtual_deal_room.client_edit.model.ClientEditArguments;
import com.avito.android.virtual_deal_room.client_edit.mvi.entity.ClientEditInternalAction;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import okhttp3.internal.ws.WebSocketProtocol;

/* compiled from: ClientEditReducer.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/virtual_deal_room/client_edit/mvi/l;", "Lcom/avito/android/arch/mvi/u;", "Lcom/avito/android/virtual_deal_room/client_edit/mvi/entity/ClientEditInternalAction;", "LCN0/c;", "_avito_virtual-deal-room_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class l implements u<ClientEditInternalAction, CN0.c> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final BN0.a f326243b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final ClientEditArguments f326244c;

    @Inject
    public l(@Y61.k BN0.a aVar, @Y61.k ClientEditArguments clientEditArguments) {
        this.f326243b = aVar;
        this.f326244c = clientEditArguments;
    }

    public static boolean b(l lVar, CN0.c cVar, String str, String str2, String str3, String str4, String str5, int i12) {
        if ((i12 & 1) != 0) {
            str = cVar.f2151f;
        }
        if ((i12 & 2) != 0) {
            str2 = cVar.f2147b;
        }
        if ((i12 & 4) != 0) {
            str3 = cVar.f2149d;
        }
        if ((i12 & 8) != 0) {
            str4 = cVar.f2148c;
        }
        if ((i12 & 16) != 0) {
            str5 = cVar.f2150e;
        }
        ClientEditArguments clientEditArguments = lVar.f326244c;
        return (L.f(str, clientEditArguments.f326194g) && L.f(str2, clientEditArguments.f326190c) && L.f(str3, clientEditArguments.f326192e) && L.f(str4, clientEditArguments.f326191d) && L.f(m.a(str5), clientEditArguments.f326193f)) ? false : true;
    }

    @Override // com.avito.android.arch.mvi.u
    public final CN0.c a(ClientEditInternalAction clientEditInternalAction, CN0.c cVar) {
        ClientEditInternalAction clientEditInternalAction2 = clientEditInternalAction;
        CN0.c cVar2 = cVar;
        if (clientEditInternalAction2 instanceof ClientEditInternalAction.EmailInput) {
            String str = ((ClientEditInternalAction.EmailInput) clientEditInternalAction2).f326218b;
            return CN0.c.a(cVar2, null, null, null, null, str, false, b(this, cVar2, str, null, null, null, null, 30), 111);
        }
        if (clientEditInternalAction2 instanceof ClientEditInternalAction.NameInput) {
            String str2 = ((ClientEditInternalAction.NameInput) clientEditInternalAction2).f326220b;
            return CN0.c.a(cVar2, str2, null, null, null, null, false, b(this, cVar2, null, str2, null, null, null, 29), WebSocketProtocol.PAYLOAD_SHORT);
        }
        if (clientEditInternalAction2 instanceof ClientEditInternalAction.PatronymicInput) {
            String str3 = ((ClientEditInternalAction.PatronymicInput) clientEditInternalAction2).f326222b;
            return CN0.c.a(cVar2, null, null, str3, null, null, false, b(this, cVar2, null, null, str3, null, null, 27), 123);
        }
        if (clientEditInternalAction2 instanceof ClientEditInternalAction.PhoneInput) {
            String str4 = ((ClientEditInternalAction.PhoneInput) clientEditInternalAction2).f326224b;
            return CN0.c.a(cVar2, null, null, null, str4, null, false, b(this, cVar2, null, null, null, null, str4, 15), 119);
        }
        if (clientEditInternalAction2 instanceof ClientEditInternalAction.SurnameInput) {
            String str5 = ((ClientEditInternalAction.SurnameInput) clientEditInternalAction2).f326229b;
            return CN0.c.a(cVar2, null, str5, null, null, null, false, b(this, cVar2, null, null, null, str5, null, 23), 125);
        }
        if (clientEditInternalAction2 instanceof ClientEditInternalAction.SaveFailure) {
            return CN0.c.a(cVar2, null, null, null, null, null, false, false, 191);
        }
        if (clientEditInternalAction2 instanceof ClientEditInternalAction.SaveSuccess) {
            return CN0.c.a(cVar2, null, null, null, null, null, false, false, 191);
        }
        if (!(clientEditInternalAction2 instanceof ClientEditInternalAction.Saving)) {
            return cVar2;
        }
        this.f326243b.a(cVar2.f2147b, cVar2.f2148c, cVar2.f2149d, cVar2.f2150e, cVar2.f2151f);
        return CN0.c.a(cVar2, null, null, null, null, null, true, false, 191);
    }
}
