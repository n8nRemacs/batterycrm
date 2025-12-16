package com.avito.android.beduin.common.actionhandler.triggerActions;

import Ui.InterfaceC15523b;
import Y61.k;
import com.avito.android.beduin.common.action.BeduinTriggerActionsAction;
import com.avito.android.beduin.common.utils.C28809e;
import com.avito.android.beduin_models.BeduinAction;
import h31.e;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;
import lj.InterfaceC43779a;

/* compiled from: BeduinTriggerActionsActionHandler.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/beduin/common/actionhandler/triggerActions/b;", "LUi/b;", "Lcom/avito/android/beduin/common/action/BeduinTriggerActionsAction;", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class b implements InterfaceC15523b<BeduinTriggerActionsAction> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final com.avito.android.beduin.common.form.store.b f100469a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final e<InterfaceC15523b<BeduinAction>> f100470b;

    @Inject
    public b(@k com.avito.android.beduin.common.form.store.b bVar, @k e<InterfaceC15523b<BeduinAction>> eVar) {
        this.f100469a = bVar;
        this.f100470b = eVar;
    }

    @Override // Ui.InterfaceC15523b
    public final void o(BeduinAction beduinAction) {
        List<BeduinAction> actions;
        BeduinTriggerActionsAction beduinTriggerActionsAction = (BeduinTriggerActionsAction) beduinAction;
        InterfaceC15523b<BeduinAction> interfaceC15523b = this.f100470b.get();
        InterfaceC43779a interfaceC43779a = this.f100469a.get(beduinTriggerActionsAction.getTargetFormId());
        if (interfaceC43779a != null) {
            Object objG = C42745f0.G(C28809e.b(new a(beduinTriggerActionsAction), interfaceC43779a.e()));
            d dVar = objG instanceof d ? (d) objG : null;
            if (dVar == null || (actions = dVar.getActions()) == null) {
                return;
            }
            Iterator<T> it = actions.iterator();
            while (it.hasNext()) {
                interfaceC15523b.o((BeduinAction) it.next());
            }
        }
    }
}
