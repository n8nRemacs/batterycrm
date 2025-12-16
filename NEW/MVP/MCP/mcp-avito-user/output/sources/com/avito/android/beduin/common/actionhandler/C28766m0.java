package com.avito.android.beduin.common.actionhandler;

import Ui.InterfaceC15522a;
import Ui.InterfaceC15523b;
import com.avito.android.beduin.common.action.BeduinOpenMasterPlanAction;
import com.avito.android.beduin_models.BeduinAction;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: BeduinOpenMasterPlanActionHandler.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/beduin/common/actionhandler/m0;", "LUi/b;", "Lcom/avito/android/beduin/common/action/BeduinOpenMasterPlanAction;", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.beduin.common.actionhandler.m0, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C28766m0 implements InterfaceC15523b<BeduinOpenMasterPlanAction> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.master_plan.c f100280a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC15522a f100281b;

    @Inject
    public C28766m0(@Y61.k com.avito.android.master_plan.c cVar, @Y61.k InterfaceC15522a interfaceC15522a) {
        this.f100280a = cVar;
        this.f100281b = interfaceC15522a;
    }

    @Override // Ui.InterfaceC15523b
    public final void o(BeduinAction beduinAction) {
        this.f100281b.b(new C28770o0(5, this, (BeduinOpenMasterPlanAction) beduinAction));
    }
}
