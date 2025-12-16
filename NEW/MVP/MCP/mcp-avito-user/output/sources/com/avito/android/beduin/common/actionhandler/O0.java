package com.avito.android.beduin.common.actionhandler;

import Hh.C13991a;
import Ui.InterfaceC15523b;
import com.avito.android.beduin.common.action.BeduinRunUntilLimitAction;
import com.avito.android.beduin_models.BeduinAction;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: BeduinRunUntilLimitActionHandler.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/beduin/common/actionhandler/O0;", "LUi/b;", "Lcom/avito/android/beduin/common/action/BeduinRunUntilLimitAction;", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class O0 implements InterfaceC15523b<BeduinRunUntilLimitAction> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Hh.e f100107a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final h31.e<InterfaceC15523b<BeduinAction>> f100108b;

    @Inject
    public O0(@Y61.k Hh.e eVar, @Y61.k h31.e<InterfaceC15523b<BeduinAction>> eVar2) {
        this.f100107a = eVar;
        this.f100108b = eVar2;
    }

    @Override // Ui.InterfaceC15523b
    public final void o(BeduinAction beduinAction) {
        BeduinRunUntilLimitAction beduinRunUntilLimitAction = (BeduinRunUntilLimitAction) beduinAction;
        C13991a c13991a = this.f100107a.f7608a;
        String id2 = beduinRunUntilLimitAction.getId();
        c13991a.getClass();
        String str = "run_until_count_storage_" + id2;
        AK0.l lVar = c13991a.f7606a;
        if (lVar.getInt(str, 0) >= beduinRunUntilLimitAction.getMaxLimit()) {
            return;
        }
        com.avito.android.beduin_shared.model.utils.a.a(this.f100108b.get(), beduinRunUntilLimitAction.getActions());
        String id3 = beduinRunUntilLimitAction.getId();
        lVar.a(lVar.getInt("run_until_count_storage_" + id3, 0) + 1, "run_until_count_storage_".concat(id3));
    }
}
