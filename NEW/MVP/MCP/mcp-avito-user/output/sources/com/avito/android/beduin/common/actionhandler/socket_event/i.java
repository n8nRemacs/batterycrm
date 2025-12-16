package com.avito.android.beduin.common.actionhandler.socket_event;

import Ui.InterfaceC15523b;
import Y61.k;
import com.avito.android.beduin.common.action.BeduinSocketEventAction;
import com.avito.android.beduin_models.BeduinAction;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: BeduinUnsubscribeSocketEventActionHandler.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/beduin/common/actionhandler/socket_event/i;", "LUi/b;", "Lcom/avito/android/beduin/common/action/BeduinSocketEventAction$Unsubscribe;", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class i implements InterfaceC15523b<BeduinSocketEventAction.Unsubscribe> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final a f100404a;

    @Inject
    public i(@k a aVar) {
        this.f100404a = aVar;
    }

    @Override // Ui.InterfaceC15523b
    public final void o(BeduinAction beduinAction) {
        this.f100404a.f100388d.accept((BeduinSocketEventAction.Unsubscribe) beduinAction);
    }
}
