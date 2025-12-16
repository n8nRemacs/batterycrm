package com.avito.android.beduin.common.actionhandler;

import Ui.InterfaceC15522a;
import Ui.InterfaceC15523b;
import com.avito.android.beduin.common.action.BeduinDefaultAction;
import com.avito.android.beduin_models.BeduinAction;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: BeduinDefaultActionHandler.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/beduin/common/actionhandler/K;", "LUi/b;", "Lcom/avito/android/beduin/common/action/BeduinDefaultAction;", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class K implements InterfaceC15523b<BeduinDefaultAction> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC15522a f100097a;

    @Inject
    public K(@Y61.k InterfaceC15522a interfaceC15522a) {
        this.f100097a = interfaceC15522a;
    }

    @Override // Ui.InterfaceC15523b
    public final void o(BeduinAction beduinAction) {
        this.f100097a.b(new com.avito.android.authorization.auto_recovery.phone_confirm.b(16));
    }
}
