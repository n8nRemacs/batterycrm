package com.avito.android.virtual_deal_room.client_edit.mvi;

import CN0.b;
import com.avito.android.R;
import com.avito.android.arch.mvi.t;
import com.avito.android.virtual_deal_room.client_edit.mvi.entity.ClientEditInternalAction;
import java.io.Serializable;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: ClientEditOneTimeEventProducer.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/virtual_deal_room/client_edit/mvi/j;", "Lcom/avito/android/arch/mvi/t;", "Lcom/avito/android/virtual_deal_room/client_edit/mvi/entity/ClientEditInternalAction;", "LCN0/b;", "<init>", "()V", "_avito_virtual-deal-room_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class j implements t<ClientEditInternalAction, CN0.b> {
    @Inject
    public j() {
    }

    @Override // com.avito.android.arch.mvi.t
    public final CN0.b b(ClientEditInternalAction clientEditInternalAction) {
        CN0.b dVar;
        ClientEditInternalAction clientEditInternalAction2 = clientEditInternalAction;
        if (clientEditInternalAction2 instanceof ClientEditInternalAction.Close) {
            return b.C0106b.f2139a;
        }
        if (clientEditInternalAction2 instanceof ClientEditInternalAction.SaveSuccess) {
            dVar = new b.a(((ClientEditInternalAction.SaveSuccess) clientEditInternalAction2).f326227b);
        } else {
            if (clientEditInternalAction2 instanceof ClientEditInternalAction.NameInput) {
                return new b.e(null);
            }
            if (clientEditInternalAction2 instanceof ClientEditInternalAction.SurnameInput) {
                return new b.h(null);
            }
            if (clientEditInternalAction2 instanceof ClientEditInternalAction.PatronymicInput) {
                return new b.f(null);
            }
            if (clientEditInternalAction2 instanceof ClientEditInternalAction.EmailInput) {
                return new b.c(null);
            }
            if (clientEditInternalAction2 instanceof ClientEditInternalAction.PhoneInput) {
                return new b.g(null);
            }
            if (clientEditInternalAction2 instanceof ClientEditInternalAction.NameError) {
                dVar = new b.e(((ClientEditInternalAction.NameError) clientEditInternalAction2).f326219b);
            } else if (clientEditInternalAction2 instanceof ClientEditInternalAction.SurnameError) {
                dVar = new b.h(((ClientEditInternalAction.SurnameError) clientEditInternalAction2).f326228b);
            } else if (clientEditInternalAction2 instanceof ClientEditInternalAction.PatronymicError) {
                dVar = new b.f(((ClientEditInternalAction.PatronymicError) clientEditInternalAction2).f326221b);
            } else if (clientEditInternalAction2 instanceof ClientEditInternalAction.PhoneError) {
                dVar = new b.g(((ClientEditInternalAction.PhoneError) clientEditInternalAction2).f326223b);
            } else if (clientEditInternalAction2 instanceof ClientEditInternalAction.EmailError) {
                dVar = new b.c(((ClientEditInternalAction.EmailError) clientEditInternalAction2).f326217b);
            } else {
                if (!(clientEditInternalAction2 instanceof ClientEditInternalAction.SaveFailure)) {
                    return null;
                }
                dVar = new b.d(com.avito.android.printable_text.b.c(R.string.virtual_deal_room_unknown_error, new Serializable[0]));
            }
        }
        return dVar;
    }
}
