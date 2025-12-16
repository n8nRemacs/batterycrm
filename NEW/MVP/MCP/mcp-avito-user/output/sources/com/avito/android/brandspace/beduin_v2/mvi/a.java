package com.avito.android.brandspace.beduin_v2.mvi;

import Y61.k;
import com.avito.android.arch.mvi.a;
import com.avito.android.brandspace.beduin_v2.mvi.entity.BrandspaceBeduinV2InternalAction;
import ik.C41418c;
import ik.InterfaceC41416a;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: BrandspaceBeduinV2Actor.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/brandspace/beduin_v2/mvi/a;", "Lcom/avito/android/arch/mvi/a;", "Lik/a;", "Lcom/avito/android/brandspace/beduin_v2/mvi/entity/BrandspaceBeduinV2InternalAction;", "Lik/c;", "<init>", "()V", "_avito_brandspace_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class a implements com.avito.android.arch.mvi.a<InterfaceC41416a, BrandspaceBeduinV2InternalAction, C41418c> {
    @Inject
    public a() {
    }

    @Override // com.avito.android.arch.mvi.a
    @k
    public final InterfaceC43160i a(@k C43197r1 c43197r1, @k Y41.a aVar) {
        return a.C2701a.a(this, c43197r1, aVar);
    }

    @Override // com.avito.android.arch.mvi.a
    public final InterfaceC43160i<BrandspaceBeduinV2InternalAction> b(InterfaceC41416a interfaceC41416a, C41418c c41418c) {
        InterfaceC41416a interfaceC41416a2 = interfaceC41416a;
        if (interfaceC41416a2 instanceof InterfaceC41416a.C11390a) {
            return new C43210w(new BrandspaceBeduinV2InternalAction.HandleBeduinJsonScenario(((InterfaceC41416a.C11390a) interfaceC41416a2).f398706b.getBeduinData()));
        }
        if (interfaceC41416a2 instanceof InterfaceC41416a.b) {
            return new C43210w(new BrandspaceBeduinV2InternalAction.UpdateBeduinState(((InterfaceC41416a.b) interfaceC41416a2).f398707a));
        }
        throw new NoWhenBranchMatchedException();
    }
}
