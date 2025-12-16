package com.avito.android.virtual_deal_room.client_room.mvi;

import EN0.b;
import com.avito.android.R;
import com.avito.android.arch.mvi.t;
import com.avito.android.virtual_deal_room.client_room.mvi.entity.ClientRoomInternalAction;
import java.io.Serializable;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: ClientRoomOneTimeEventProducer.kt */
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/virtual_deal_room/client_room/mvi/l;", "Lcom/avito/android/arch/mvi/t;", "Lcom/avito/android/virtual_deal_room/client_room/mvi/entity/ClientRoomInternalAction;", "LEN0/b;", "<init>", "()V", "_avito_virtual-deal-room_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class l implements t<ClientRoomInternalAction, EN0.b> {
    @Inject
    public l() {
    }

    @Override // com.avito.android.arch.mvi.t
    public final EN0.b b(ClientRoomInternalAction clientRoomInternalAction) {
        EN0.b eVar;
        ClientRoomInternalAction clientRoomInternalAction2 = clientRoomInternalAction;
        if (clientRoomInternalAction2 instanceof ClientRoomInternalAction.Content) {
            ClientRoomInternalAction.Content content = (ClientRoomInternalAction.Content) clientRoomInternalAction2;
            eVar = new b.f(content.f326383m);
            if (!content.f326384n) {
                return null;
            }
        } else {
            if (clientRoomInternalAction2 instanceof ClientRoomInternalAction.TabSelect) {
                return new b.f(((ClientRoomInternalAction.TabSelect) clientRoomInternalAction2).f326394b);
            }
            if (clientRoomInternalAction2 instanceof ClientRoomInternalAction.Close) {
                return new b.C0230b(((ClientRoomInternalAction.Close) clientRoomInternalAction2).f326371b);
            }
            if (clientRoomInternalAction2 instanceof ClientRoomInternalAction.EditClicked) {
                ClientRoomInternalAction.EditClicked editClicked = (ClientRoomInternalAction.EditClicked) clientRoomInternalAction2;
                return new b.d(editClicked.f326385b, editClicked.f326386c, editClicked.f326387d, editClicked.f326388e, editClicked.f326389f, editClicked.f326390g);
            }
            if (clientRoomInternalAction2 instanceof ClientRoomInternalAction.CallCopyClicked) {
                return new b.c(((ClientRoomInternalAction.CallCopyClicked) clientRoomInternalAction2).f326363b);
            }
            if (clientRoomInternalAction2 instanceof ClientRoomInternalAction.CallClicked) {
                return new b.a(((ClientRoomInternalAction.CallClicked) clientRoomInternalAction2).f326362b);
            }
            if (!(clientRoomInternalAction2 instanceof ClientRoomInternalAction.Error)) {
                return null;
            }
            eVar = new b.e(com.avito.android.printable_text.b.c(R.string.virtual_deal_room_unknown_error, new Serializable[0]));
            if (!((ClientRoomInternalAction.Error) clientRoomInternalAction2).f326392c) {
                return null;
            }
        }
        return eVar;
    }
}
