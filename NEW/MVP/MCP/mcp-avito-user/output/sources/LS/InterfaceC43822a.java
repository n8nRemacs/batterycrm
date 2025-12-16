package ls;

import Y61.k;
import Y61.l;
import com.avito.android.cpx_promo.v2.domain.model.CpxPromoV2;
import com.avito.android.cpx_promo.v2.mvi.entity.CpxPromoV2InternalAction;
import kotlin.Metadata;

/* compiled from: CpxPromoV2InternalActionGenerator.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b`\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lls/a;", "", "_avito_cpx-promo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: ls.a, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public interface InterfaceC43822a {
    @k
    CpxPromoV2InternalAction.UpdateBudget a(boolean z12, @l CpxPromoV2.Auto.Budget.Value.BudgetId budgetId, @l CpxPromoV2 cpxPromoV2);

    @k
    CpxPromoV2InternalAction.UpdateLimit b(boolean z12, @l Long l12, @l CpxPromoV2 cpxPromoV2);

    @k
    CpxPromoV2InternalAction.UpdateSlider c(@l js.c cVar, @l Integer num, @l Long l12, @l CpxPromoV2.a aVar);

    @k
    CpxPromoV2InternalAction.UpdateSegmentedControl d(boolean z12, @l CpxPromoV2 cpxPromoV2);
}
