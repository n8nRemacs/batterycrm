package com.avito.android.master_plan.mvi;

import com.avito.android.arch.mvi.t;
import com.avito.android.master_plan.mvi.entity.MasterPlanInternalAction;
import javax.inject.Inject;
import kotlin.Metadata;
import vY.InterfaceC49284c;

/* compiled from: MasterPlanOneTimeEventProducer.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/master_plan/mvi/i;", "Lcom/avito/android/arch/mvi/t;", "Lcom/avito/android/master_plan/mvi/entity/MasterPlanInternalAction;", "LvY/c;", "<init>", "()V", "_avito_master-plan_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class i implements t<MasterPlanInternalAction, InterfaceC49284c> {
    @Inject
    public i() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.avito.android.arch.mvi.t
    public final InterfaceC49284c b(MasterPlanInternalAction masterPlanInternalAction) {
        InterfaceC49284c c12780c;
        MasterPlanInternalAction masterPlanInternalAction2 = masterPlanInternalAction;
        if (masterPlanInternalAction2 instanceof MasterPlanInternalAction.NavigateBack) {
            return InterfaceC49284c.a.f440836a;
        }
        if (masterPlanInternalAction2 instanceof MasterPlanInternalAction.NavigateForward) {
            c12780c = new InterfaceC49284c.b(((MasterPlanInternalAction.NavigateForward) masterPlanInternalAction2).f186080b);
        } else {
            String str = null;
            Object[] objArr = 0;
            if (masterPlanInternalAction2 instanceof MasterPlanInternalAction.WrongInitialArgs) {
                return new InterfaceC49284c.C12780c(str, 1, objArr == true ? 1 : 0);
            }
            if (!(masterPlanInternalAction2 instanceof MasterPlanInternalAction.Error)) {
                return null;
            }
            c12780c = new InterfaceC49284c.C12780c(((MasterPlanInternalAction.Error) masterPlanInternalAction2).f186073b);
        }
        return c12780c;
    }
}
