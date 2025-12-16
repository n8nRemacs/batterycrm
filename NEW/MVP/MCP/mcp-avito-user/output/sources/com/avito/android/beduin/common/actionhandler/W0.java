package com.avito.android.beduin.common.actionhandler;

import Ui.InterfaceC15523b;
import com.avito.android.beduin_models.BeduinAction;
import com.avito.android.beduin_shared.common.action.BeduinSendActionsToFormAction;
import javax.inject.Inject;
import kotlin.InterfaceC49066a;
import kotlin.Metadata;

/* compiled from: BeduinSendActionsToFormActionHandler.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/beduin/common/actionhandler/W0;", "LUi/b;", "Lcom/avito/android/beduin_shared/common/action/BeduinSendActionsToFormAction;", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class W0 implements InterfaceC15523b<BeduinSendActionsToFormAction> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.beduin.common.form.store.b f100141a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC49066a f100142b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final h31.e<InterfaceC15523b<BeduinAction>> f100143c;

    @Inject
    public W0(@Y61.k com.avito.android.beduin.common.form.store.b bVar, @Y61.k InterfaceC49066a interfaceC49066a, @Y61.k h31.e<InterfaceC15523b<BeduinAction>> eVar) {
        this.f100141a = bVar;
        this.f100142b = interfaceC49066a;
        this.f100143c = eVar;
    }

    @Override // Ui.InterfaceC15523b
    public final void o(BeduinAction beduinAction) {
        BeduinSendActionsToFormAction beduinSendActionsToFormAction = (BeduinSendActionsToFormAction) beduinAction;
        if (this.f100141a.get(beduinSendActionsToFormAction.getFormId()) != null) {
            com.avito.android.beduin_shared.model.utils.a.a(this.f100143c.get(), beduinSendActionsToFormAction.getActions());
            return;
        }
        this.f100142b.a(beduinSendActionsToFormAction.getFormId(), beduinSendActionsToFormAction.getActions());
    }
}
