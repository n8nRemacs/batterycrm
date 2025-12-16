package com.avito.android.mortgage.manager_usp.mvi;

import androidx.compose.runtime.internal.P;
import com.avito.android.arch.mvi.t;
import com.avito.android.mortgage.manager_usp.mvi.entity.ManagerUspInternalAction;
import javax.inject.Inject;
import kotlin.Metadata;
import z00.InterfaceC50334c;

/* compiled from: ManagerUspOneTimeEventProducer.kt */
@P
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/mortgage/manager_usp/mvi/i;", "Lcom/avito/android/arch/mvi/t;", "Lcom/avito/android/mortgage/manager_usp/mvi/entity/ManagerUspInternalAction;", "Lz00/c;", "<init>", "()V", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class i implements t<ManagerUspInternalAction, InterfaceC50334c> {
    @Inject
    public i() {
    }

    @Override // com.avito.android.arch.mvi.t
    public final InterfaceC50334c b(ManagerUspInternalAction managerUspInternalAction) {
        ManagerUspInternalAction managerUspInternalAction2 = managerUspInternalAction;
        if (managerUspInternalAction2 instanceof ManagerUspInternalAction.HandleDeeplinkClick) {
            return new InterfaceC50334c.a(((ManagerUspInternalAction.HandleDeeplinkClick) managerUspInternalAction2).f200427b);
        }
        return null;
    }
}
