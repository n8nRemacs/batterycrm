package com.avito.android.cpx_promo.delayedstart.mvi;

import androidx.compose.runtime.internal.P;
import bs.InterfaceC25698a;
import com.avito.android.arch.mvi.a;
import com.avito.android.cpx_promo.delayedstart.CpxPromoDelayedStartContent;
import com.avito.android.cpx_promo.delayedstart.mvi.entity.CpxPromoDelayedStartInternalAction;
import com.avito.android.cpx_promo.delayedstart.mvi.entity.CpxPromoDelayedStartState;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: CpxPromoDelayedStartActor.kt */
@P
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/avito/android/cpx_promo/delayedstart/mvi/b;", "Lcom/avito/android/arch/mvi/a;", "Lbs/a;", "Lcom/avito/android/cpx_promo/delayedstart/mvi/entity/CpxPromoDelayedStartInternalAction;", "Lcom/avito/android/cpx_promo/delayedstart/mvi/entity/CpxPromoDelayedStartState;", "_avito_cpx-promo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class b implements com.avito.android.arch.mvi.a<InterfaceC25698a, CpxPromoDelayedStartInternalAction, CpxPromoDelayedStartState> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final CpxPromoDelayedStartContent f126854a;

    @Inject
    public b(@Y61.k CpxPromoDelayedStartContent cpxPromoDelayedStartContent) {
        this.f126854a = cpxPromoDelayedStartContent;
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    public final InterfaceC43160i a(@Y61.k C43197r1 c43197r1, @Y61.k Y41.a aVar) {
        return a.C2701a.a(this, c43197r1, aVar);
    }

    @Override // com.avito.android.arch.mvi.a
    public final InterfaceC43160i<CpxPromoDelayedStartInternalAction> b(InterfaceC25698a interfaceC25698a, CpxPromoDelayedStartState cpxPromoDelayedStartState) {
        InterfaceC25698a interfaceC25698a2 = interfaceC25698a;
        if (interfaceC25698a2.equals(InterfaceC25698a.b.f57494a)) {
            return C43175k.G(new a(this, null));
        }
        if (interfaceC25698a2.equals(InterfaceC25698a.C2019a.f57493a)) {
            return new C43210w(CpxPromoDelayedStartInternalAction.Close.f126861b);
        }
        throw new NoWhenBranchMatchedException();
    }
}
