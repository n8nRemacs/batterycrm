package com.avito.android.master_plan.mvi;

import com.avito.android.arch.mvi.a;
import com.avito.android.lib.design.master_plan_view.MasterPlanPin;
import com.avito.android.master_plan.mvi.entity.MasterPlanInternalAction;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.C43207v;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;
import pY.InterfaceC47032c;
import vY.InterfaceC49282a;

/* compiled from: MasterPlanActor.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/avito/android/master_plan/mvi/a;", "Lcom/avito/android/arch/mvi/a;", "LvY/a;", "Lcom/avito/android/master_plan/mvi/entity/MasterPlanInternalAction;", "LvY/d;", "_avito_master-plan_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class a implements com.avito.android.arch.mvi.a<InterfaceC49282a, MasterPlanInternalAction, vY.d> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC47032c f186057a;

    @Inject
    public a(@Y61.k InterfaceC47032c interfaceC47032c) {
        this.f186057a = interfaceC47032c;
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    public final InterfaceC43160i a(@Y61.k C43197r1 c43197r1, @Y61.k Y41.a aVar) {
        return a.C2701a.a(this, c43197r1, aVar);
    }

    @Override // com.avito.android.arch.mvi.a
    public final InterfaceC43160i<MasterPlanInternalAction> b(InterfaceC49282a interfaceC49282a, vY.d dVar) {
        InterfaceC43160i<MasterPlanInternalAction> c43207v;
        InterfaceC49282a interfaceC49282a2 = interfaceC49282a;
        boolean z12 = interfaceC49282a2 instanceof InterfaceC49282a.e;
        InterfaceC47032c interfaceC47032c = this.f186057a;
        if (z12) {
            MasterPlanPin masterPlanPin = ((InterfaceC49282a.e) interfaceC49282a2).f440830a;
            InterfaceC47032c.a.a(interfaceC47032c, "korpus_click_frame", masterPlanPin.getId(), null, 4);
            return new C43210w(new MasterPlanInternalAction.ChangeBuilding(masterPlanPin));
        }
        if (interfaceC49282a2 instanceof InterfaceC49282a.c) {
            InterfaceC49282a.c cVar = (InterfaceC49282a.c) interfaceC49282a2;
            interfaceC47032c.b(cVar.f440828b);
            return new C43210w(new MasterPlanInternalAction.NavigateForward(cVar.f440827a));
        }
        if (interfaceC49282a2 instanceof InterfaceC49282a.C12779a) {
            InterfaceC47032c.a.a(interfaceC47032c, "close", null, null, 6);
            c43207v = new C43210w(MasterPlanInternalAction.NavigateBack.f186079b);
        } else if (interfaceC49282a2 instanceof InterfaceC49282a.b) {
            c43207v = new C43210w(MasterPlanInternalAction.NavigateBack.f186079b);
        } else {
            if (!(interfaceC49282a2 instanceof InterfaceC49282a.d)) {
                throw new NoWhenBranchMatchedException();
            }
            InterfaceC47032c.a.a(interfaceC47032c, "swipe_frame", null, null, 6);
            c43207v = new C43207v(new MasterPlanInternalAction[0]);
        }
        return c43207v;
    }
}
