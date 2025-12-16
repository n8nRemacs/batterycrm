package com.avito.android.advert.item.ownership_discrepancy.mvi;

import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.advert.item.ownership_discrepancy.OwnershipDiscrepancyOpenParams;
import com.avito.android.advert.item.ownership_discrepancy.mvi.entity.OwnershipDiscrepancyInternalAction;
import com.avito.android.arch.mvi.a;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.InterfaceC43160i;
import l6.InterfaceC43549a;

/* compiled from: OwnershipDiscrepancyActor.kt */
@P
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/avito/android/advert/item/ownership_discrepancy/mvi/b;", "Lcom/avito/android/arch/mvi/a;", "Ll6/a;", "Lcom/avito/android/advert/item/ownership_discrepancy/mvi/entity/OwnershipDiscrepancyInternalAction;", "Ll6/c;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class b implements com.avito.android.arch.mvi.a<InterfaceC43549a, OwnershipDiscrepancyInternalAction, l6.c> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final OwnershipDiscrepancyOpenParams f78111a;

    @Inject
    public b(@k OwnershipDiscrepancyOpenParams ownershipDiscrepancyOpenParams) {
        this.f78111a = ownershipDiscrepancyOpenParams;
    }

    @Override // com.avito.android.arch.mvi.a
    @k
    public final InterfaceC43160i a(@k C43197r1 c43197r1, @k Y41.a aVar) {
        return a.C2701a.a(this, c43197r1, aVar);
    }

    @Override // com.avito.android.arch.mvi.a
    public final InterfaceC43160i<OwnershipDiscrepancyInternalAction> b(InterfaceC43549a interfaceC43549a, l6.c cVar) {
        if (interfaceC43549a instanceof InterfaceC43549a.C11774a) {
            return C43175k.G(new a(this, null));
        }
        throw new NoWhenBranchMatchedException();
    }
}
