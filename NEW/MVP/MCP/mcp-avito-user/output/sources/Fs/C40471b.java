package fs;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.cpx_promo.impl.interactor.model.AttributedTextWithIcon;
import com.avito.android.cpx_promo.impl.interactor.model.CpxPromo;
import com.avito.android.cpx_promo.impl.interactor.model.CpxPromoBidSelector;
import com.avito.android.cpx_promo.impl.mvi.entity.CpxPromoInternalAction;
import com.avito.android.cpx_promo.impl.mvi.entity.CpxPromoState;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42756l;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: CpxPromoInternalActionGenerator.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lfs/b;", "Lfs/a;", "_avito_cpx-promo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: fs.b, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C40471b implements InterfaceC40470a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final com.avito.android.cpx_promo.b f396164a;

    @Inject
    public C40471b(@k com.avito.android.cpx_promo.b bVar) {
        this.f396164a = bVar;
    }

    @Override // fs.InterfaceC40470a
    @k
    public final CpxPromoInternalAction.UpdateLimit a(boolean z12, @l Long l12, @l CpxPromo cpxPromo) {
        CpxPromo.Manual manual;
        CpxPromo.Manual.ExpenseLimit expenseLimit;
        CpxPromo.Manual manual2;
        CpxPromo.Manual.ExpenseLimit expenseLimit2;
        String str = null;
        AttributedTextWithIcon attributedTextWithIcon = (cpxPromo == null || (manual2 = cpxPromo.f127007i) == null || (expenseLimit2 = manual2.f127020c) == null) ? null : expenseLimit2.f127021b;
        if (cpxPromo != null && (manual = cpxPromo.f127007i) != null && (expenseLimit = manual.f127020c) != null) {
            str = expenseLimit.f127023d;
        }
        return new CpxPromoInternalAction.UpdateLimit(z12, attributedTextWithIcon, l12, str);
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0117  */
    @Override // fs.InterfaceC40470a
    @Y61.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.avito.android.cpx_promo.impl.mvi.entity.CpxPromoInternalAction.UpdateSlider b(boolean r23, @Y61.l java.lang.String r24, @Y61.l java.lang.Integer r25, @Y61.l java.lang.Long r26, @Y61.l com.avito.android.cpx_promo.impl.interactor.model.CpxPromo r27) {
        /*
            Method dump skipped, instructions count: 351
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: fs.C40471b.b(boolean, java.lang.String, java.lang.Integer, java.lang.Long, com.avito.android.cpx_promo.impl.interactor.model.CpxPromo):com.avito.android.cpx_promo.impl.mvi.entity.CpxPromoInternalAction$UpdateSlider");
    }

    @Override // fs.InterfaceC40470a
    @k
    public final CpxPromoInternalAction.UpdateSegmentedControl c(boolean z12, @l CpxPromo cpxPromo) {
        CpxPromoBidSelector cpxPromoBidSelector;
        CpxPromoBidSelector cpxPromoBidSelector2;
        CpxPromoBidSelector cpxPromoBidSelector3;
        CpxPromoBidSelector cpxPromoBidSelector4;
        String str = null;
        AttributedTextWithIcon attributedTextWithIcon = (cpxPromo == null || (cpxPromoBidSelector4 = cpxPromo.f127006h) == null) ? null : cpxPromoBidSelector4.f127027b;
        String str2 = (cpxPromo == null || (cpxPromoBidSelector3 = cpxPromo.f127006h) == null) ? null : cpxPromoBidSelector3.f127028c;
        if (cpxPromo != null && (cpxPromoBidSelector2 = cpxPromo.f127006h) != null) {
            str = cpxPromoBidSelector2.f127029d;
        }
        return new CpxPromoInternalAction.UpdateSegmentedControl(attributedTextWithIcon, C42756l.B(new String[]{str2, str}), z12, (cpxPromo == null || (cpxPromoBidSelector = cpxPromo.f127006h) == null) ? true : cpxPromoBidSelector.f127031f);
    }

    @Override // fs.InterfaceC40470a
    @k
    public final CpxPromoInternalAction.UpdateBudget d(boolean z12, @l CpxPromoState.BudgetChip budgetChip, @l CpxPromo cpxPromo) {
        ArrayList arrayList;
        CpxPromo.Auto auto;
        CpxPromo.Auto.Budget budget;
        CpxPromo.Auto auto2;
        CpxPromo.Auto.Budget budget2;
        Object obj = null;
        if (cpxPromo == null || (auto2 = cpxPromo.f127008j) == null || (budget2 = auto2.f127010b) == null) {
            arrayList = null;
        } else {
            ArrayList<CpxPromo.Auto.Budget.Value> arrayList2 = budget2.f127013d;
            arrayList = new ArrayList(C42745f0.q(arrayList2, 10));
            for (CpxPromo.Auto.Budget.Value value : arrayList2) {
                arrayList.add(new CpxPromoState.BudgetChip(value.f127014b, value.f127015c));
            }
        }
        AttributedTextWithIcon attributedTextWithIcon = (cpxPromo == null || (auto = cpxPromo.f127008j) == null || (budget = auto.f127010b) == null) ? null : budget.f127011b;
        List list = arrayList == null ? C42784z0.f406748b : arrayList;
        if (budgetChip == null) {
            if (arrayList != null) {
                Iterator it = arrayList.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    Object next = it.next();
                    if (L.f(((CpxPromoState.BudgetChip) next).f127120b, cpxPromo.f127008j.f127010b.f127012c)) {
                        obj = next;
                        break;
                    }
                }
                budgetChip = (CpxPromoState.BudgetChip) obj;
            } else {
                budgetChip = null;
            }
        }
        return new CpxPromoInternalAction.UpdateBudget(z12, attributedTextWithIcon, list, budgetChip);
    }
}
