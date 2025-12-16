package fs;

import Y61.k;
import Y61.l;
import com.avito.android.cpx_promo.impl.interactor.model.CpxPromo;
import com.avito.android.cpx_promo.impl.mvi.entity.CpxPromoInternalAction;
import com.avito.android.cpx_promo.impl.mvi.entity.CpxPromoState;
import kotlin.Metadata;

/* compiled from: CpxPromoInternalActionGenerator.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b`\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lfs/a;", "", "_avito_cpx-promo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: fs.a, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public interface InterfaceC40470a {
    @k
    CpxPromoInternalAction.UpdateLimit a(boolean z12, @l Long l12, @l CpxPromo cpxPromo);

    @k
    CpxPromoInternalAction.UpdateSlider b(boolean z12, @l String str, @l Integer num, @l Long l12, @l CpxPromo cpxPromo);

    @k
    CpxPromoInternalAction.UpdateSegmentedControl c(boolean z12, @l CpxPromo cpxPromo);

    @k
    CpxPromoInternalAction.UpdateBudget d(boolean z12, @l CpxPromoState.BudgetChip budgetChip, @l CpxPromo cpxPromo);
}
