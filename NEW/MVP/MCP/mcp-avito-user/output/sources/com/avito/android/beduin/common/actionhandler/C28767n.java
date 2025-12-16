package com.avito.android.beduin.common.actionhandler;

import Ui.InterfaceC15523b;
import com.avito.android.beduin_models.BeduinAction;
import com.avito.android.beduin_shared.common.action.BeduinApplyTransformAction;
import java.util.Collections;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Metadata;
import lj.InterfaceC43779a;
import lj.d;

/* compiled from: BeduinApplyTransformActionHandler.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/beduin/common/actionhandler/n;", "LUi/b;", "Lcom/avito/android/beduin_shared/common/action/BeduinApplyTransformAction;", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.beduin.common.actionhandler.n, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C28767n implements InterfaceC15523b<BeduinApplyTransformAction> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.beduin.common.form.store.b f100285a;

    @Inject
    public C28767n(@Y61.k com.avito.android.beduin.common.form.store.b bVar) {
        this.f100285a = bVar;
    }

    @Override // Ui.InterfaceC15523b
    public final void o(BeduinAction beduinAction) {
        BeduinApplyTransformAction beduinApplyTransformAction = (BeduinApplyTransformAction) beduinAction;
        InterfaceC43779a interfaceC43779a = this.f100285a.get(beduinApplyTransformAction.getTargetFormId());
        Map mapSingletonMap = Collections.singletonMap(beduinApplyTransformAction.getModelId(), beduinApplyTransformAction.getTransforms());
        if (interfaceC43779a != null) {
            interfaceC43779a.h(new d.e(mapSingletonMap));
        }
    }
}
