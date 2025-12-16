package com.avito.android.beduin.common.actionhandler;

import Ui.InterfaceC15523b;
import com.avito.android.beduin.common.action.BeduinReplaceComponentsAction;
import com.avito.android.beduin_models.BeduinAction;
import javax.inject.Inject;
import kotlin.Metadata;
import lj.InterfaceC43779a;
import lj.d;

/* compiled from: BeduinReplaceComponentsActionHandler.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/beduin/common/actionhandler/M0;", "LUi/b;", "Lcom/avito/android/beduin/common/action/BeduinReplaceComponentsAction;", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class M0 implements InterfaceC15523b<BeduinReplaceComponentsAction> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.beduin.common.form.store.b f100101a;

    @Inject
    public M0(@Y61.k com.avito.android.beduin.common.form.store.b bVar) {
        this.f100101a = bVar;
    }

    @Override // Ui.InterfaceC15523b
    public final void o(BeduinAction beduinAction) {
        BeduinReplaceComponentsAction beduinReplaceComponentsAction = (BeduinReplaceComponentsAction) beduinAction;
        InterfaceC43779a interfaceC43779a = this.f100101a.get(beduinReplaceComponentsAction.getTargetFormId());
        if (interfaceC43779a != null) {
            interfaceC43779a.h(new d.j(beduinReplaceComponentsAction.getReplacement()));
        }
    }
}
